/*******************************************************************************
 *                                                                              
 *  Copyright FUJITSU LIMITED 2016                                             
 *                                                                              
 *  Author: Dirk Bernsau                                                      
 *                                                                              
 *  Creation Date: July 12, 2011                                                      
 *                                                                              
 *  Completion Time: September 23, 2011                                           
 *                                                                              
 *******************************************************************************/

package org.oscm.serviceprovisioningservice.bean;

import java.util.Arrays;
import java.util.List;

import org.apache.lucene.index.Term;
import org.apache.lucene.search.BooleanClause.Occur;
import org.apache.lucene.search.BooleanQuery;
import org.apache.lucene.search.TermQuery;
import org.apache.lucene.search.WildcardQuery;
import org.oscm.converter.WhiteSpaceConverter;
import org.oscm.domobjects.bridge.ProductClassBridge;

/**
 * @author Dirk Bernsau
 * 
 */
public class LuceneQueryBuilder {

    /**
     * Builds the search query for searching the given search phrase on a
     * certain marketplace.
     * 
     * @param searchPhrase
     *            the search phrase
     * @param locale
     *            the user locale
     * @param defaultLocale
     *            if <code>false</code>, check if search term is found in fields
     *            for current locale, otherwise check if fields in current
     *            locale are not specified but in default locale instead
     * @return a Lucene search query
     */
    public static BooleanQuery getServiceQuery(String searchPhrase,
            String locale, String defaultLocale,
            boolean isDefaultLocaleHandling) {

        String phrase = WhiteSpaceConverter.replace(searchPhrase);
        phrase = phrase.trim();

        final List<String> fieldNames = Arrays.asList(
                ProductClassBridge.SERVICE_NAME,
                ProductClassBridge.SERVICE_DESCRIPTION,
                ProductClassBridge.SERVICE_SHORT_DESC, ProductClassBridge.TAGS,
                ProductClassBridge.PRICEMODEL_DESCRIPTION,
                ProductClassBridge.CATEGORY_NAME);

        BooleanQuery booleanQuery = constructWildcardQuery(phrase, fieldNames,
                locale, defaultLocale, isDefaultLocaleHandling);

        return booleanQuery;
    }

    private static BooleanQuery constructWildcardQuery(String searchPhrase,
            List<String> fieldNames, String locale, String defaultLocale,
            boolean isDefaultLocaleHandling) {

        String[] splitStr = searchPhrase.split("\\s+");
        BooleanQuery.Builder queryBuilder = new BooleanQuery.Builder();
        BooleanQuery booleanQuery = queryBuilder.build();

        for (String token : splitStr) {
            queryBuilder.add(
                    prepareWildcardQueryForSingleToken(token, fieldNames,
                            locale, defaultLocale, isDefaultLocaleHandling),
                    Occur.MUST);
        }

        return booleanQuery;
    }

    private static BooleanQuery prepareWildcardQueryForSingleToken(String token,
            List<String> fieldNames, String locale, String defaultLocale,
            boolean isDefaultLocaleHandling) {
        BooleanQuery.Builder queryBuilder = new BooleanQuery.Builder();
        BooleanQuery queryPart = queryBuilder.build();

        for (String fieldName : fieldNames) {
            if (isDefaultLocaleHandling) {
                if (locale.equals(defaultLocale)) {
                    throw new IllegalArgumentException(
                            "For default locale handling, locale and default locale must be different");
                }
                BooleanQuery localeHandlingQuery = constructDefaultLocaleHandlingQuery(
                        fieldName, locale, defaultLocale, token);
                queryBuilder.add(localeHandlingQuery, Occur.SHOULD);
            } else {
                WildcardQuery wildcardQuery = new WildcardQuery(new Term(
                        fieldName + locale, "*" + token.toLowerCase() + "*"));
                queryBuilder.add(wildcardQuery, Occur.SHOULD);
            }

        }
        return queryPart;
    }

    private static BooleanQuery constructDefaultLocaleHandlingQuery(
            String fieldName, String locale, String defaultLocale,
            String searchPhrase) {
        BooleanQuery.Builder termQueryBuilder = new BooleanQuery.Builder();
        BooleanQuery bq1 = termQueryBuilder.build();
        TermQuery tq1 = new TermQuery(
                new Term(fieldName + ProductClassBridge.DEFINED_LOCALES_SUFFIX,
                        defaultLocale));
        TermQuery tq2 = new TermQuery(new Term(
                fieldName + ProductClassBridge.DEFINED_LOCALES_SUFFIX, locale));
        termQueryBuilder.add(tq1, Occur.MUST);
        termQueryBuilder.add(tq2, Occur.MUST_NOT);
        BooleanQuery.Builder wildcardQueryBuilder = new BooleanQuery.Builder();
        BooleanQuery bq2 = wildcardQueryBuilder.build();
        WildcardQuery wq1 = new WildcardQuery(
                new Term(fieldName + defaultLocale,
                        "*" + searchPhrase.toLowerCase() + "*"));
        wildcardQueryBuilder.add(wq1, Occur.SHOULD);
        BooleanQuery.Builder finalQueryBuilder = new BooleanQuery.Builder();
        BooleanQuery finalQuery = finalQueryBuilder.build();
        finalQueryBuilder.add(bq1, Occur.MUST);
        finalQueryBuilder.add(bq2, Occur.MUST);

        return finalQuery;
    }

}
