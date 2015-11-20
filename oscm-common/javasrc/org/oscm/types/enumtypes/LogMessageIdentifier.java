/*******************************************************************************
 *                                                                              
 *  Copyright FUJITSU LIMITED 2015                                             
 *                                                                              
 *  Author: tokoda                                                      
 *                                                                              
 *  Creation Date: Sep 15, 2011                                                      
 *                                                                              
 *  Completion Time: Sep 15, 2011                                             
 *                                                                              
 *******************************************************************************/

package org.oscm.types.enumtypes;

/**
 * @author tokoda
 * 
 */
public enum LogMessageIdentifier {
    // Info log
    INFO_USER_LOGIN_SUCCESS("00001"), //
    INFO_USER_LOGIN_INVALID("00002"), //
    INFO_USER_ACCESS_WEBSERVICE("00003"), //
    INFO_NO_EMAIL_ADDRESS_SPECIFIED_ORGANIZATION("00004"), //
    INFO_NO_EMAIL_ADDRESS_SPECIFIED_USER("00005"), //
    INFO_CURRENCY_ADDED("00006"), //
    INFO_TIMER_REMOVED("00007"), //
    INFO_TIMER_TIMEOUT_RETRIEVED("00008"), //
    INFO_TIMER_CREATED("00009"), //
    INFO_TIMER_CREATED_WITH_INTERVAL("00010"), //
    INFO_TIMER_NO_HANDLING("00011"), //
    INFO_TIMER_NOT_INITIALIZED("00012"), //
    INFO_TIMER_INITIALIZED("00013"), //
    INFO_PAYMENT_CODE_UNKNOWN("00014"), //
    INFO_PAYMENT_INFO_REGISTRATION_CANCELLED("00015"), //
    INFO_PAYMENT_INFO_REGISTRATION_SUCCESS("00016"), //
    INFO_USER_PWDRECOVERY_REQUEST("00017"), //
    INFO_USER_PWDRECOVERY_COMPLETE("00018"), //
    INFO_USER_NUM_EXCEEDED("00019"), //
    INFO_USER_BILLING_RUN_STARTED("00020"), //
    INFO_USER_BILLING_RUN_FINISHED("00021"), //
    INFO_USER_PAYMENT_RUN_STARTED("00022"), //
    INFO_USER_PAYMENT_RUN_FINISHED("00023"), //
    INFO_INSUFFICIENT_ROLE("00024"), //

    // User operation log
    INFO_OPERATION_LOG_SUBSCR("30001"), //
    INFO_OPERATION_LOG_SUBSCR_USER("30002"), //
    INFO_OPERATION_LOG_SUBSCR_PRICE("30003"), //
    INFO_OPERATION_LOG_SUBSCR_PRICE_EVENT("30004"), //
    INFO_OPERATION_LOG_SUBSCR_PRICE_EVENT_STEPPED("30005"), //
    INFO_OPERATION_LOG_SUBSCR_PRICE_PARAM("30006"), //
    INFO_OPERATION_LOG_SUBSCR_PRICE_PARAM_STEPPED("30007"), //
    INFO_OPERATION_LOG_SUBSCR_PRICE_OPTION("30008"), //
    INFO_OPERATION_LOG_SUBSCR_PRICE_ROLE("30009"), //
    INFO_OPERATION_LOG_SUBSCR_PRICE_ROLE_PARAM("30010"), //
    INFO_OPERATION_LOG_SUBSCR_PRICE_ROLE_OPTION("30011"), //
    INFO_OPERATION_LOG_SUBSCR_UDA("30012"), //
    INFO_OPERATION_LOG_ORGAN("30013"), //
    INFO_OPERATION_LOG_ORGAN_USER("30014"), //
    INFO_OPERATION_LOG_ORGAN_USER_ROLE("30015"), //
    INFO_OPERATION_LOG_ORGAN_REF("30016"), //
    INFO_OPERATION_LOG_ORGAN_DISCOUNT("30017"), //
    INFO_OPERATION_LOG_ORGAN_VAT("30018"), //
    INFO_OPERATION_LOG_ORGAN_UDA("30019"), //
    INFO_OPERATION_LOG_ORGAN_BILL_CONTACT("30020"), //
    INFO_OPERATION_LOG_ORGAN_PAYMENT_INFO("30021"), //
    INFO_OPERATION_LOG_SERVICE("30022"), //
    INFO_OPERATION_LOG_SERVICE_PARAM("30023"), //
    INFO_OPERATION_LOG_SERVICE_OPTION("30024"), //
    INFO_OPERATION_LOG_SERVICE_UPGRADE("30025"), //
    INFO_OPERATION_LOG_SERVICE_REVIEW("30026"), //
    INFO_OPERATION_LOG_SERVICE_PRICE("30027"), //
    INFO_OPERATION_LOG_SERVICE_PRICE_EVENT("30028"), //
    INFO_OPERATION_LOG_SERVICE_PRICE_EVENT_STEPPED("30029"), //
    INFO_OPERATION_LOG_SERVICE_PRICE_PARAM("30030"), //
    INFO_OPERATION_LOG_SERVICE_PRICE_PARAM_STEPPED("30031"), //
    INFO_OPERATION_LOG_SERVICE_PRICE_OPTION("30032"), //
    INFO_OPERATION_LOG_SERVICE_PRICE_ROLE("30033"), //
    INFO_OPERATION_LOG_SERVICE_PRICE_ROLE_PARAM("30034"), //
    INFO_OPERATION_LOG_SERVICE_PRICE_ROLE_OPTION("30035"), //
    INFO_OPERATION_LOG_TSERVICE("30036"), //
    INFO_OPERATION_LOG_TSERVICE_ROLE("30037"), //
    INFO_OPERATION_LOG_TSERVICE_EVENT("30038"), //
    INFO_OPERATION_LOG_TSERVICE_PARAM("30039"), //
    INFO_OPERATION_LOG_TSERVICE_OPERATION("30040"), //
    INFO_OPERATION_LOG_MARKETPLACE("30041"), //
    INFO_OPERATION_LOG_MARKETPLACE_ENTRY("30042"), //

    // Warning log
    WARN_CHANGE_PASSWORD_FAILED("40001"), //
    WARN_USER_NOT_FOUND("40002"), //
    WARN_USER_REMOVED_ORGANIZATION_FAILED("40003"), //
    WARN_CONFIRM_OPERATOR_ACCOUNT_FAILED("40004"), //
    WARN_OPERATOR_LOGIN_FAILED("40005"), //
    WARN_OPERATOR_LOCK_FAILED("40006"), //
    WARN_OPERATOR_UNLOCK_FAILED("40007"), //
    WARN_OPERATOR_RESET_PASSWORD_FAILED("40008"), //
    WARN_USER_ROLE_REQUIRED("40009"), //
    WARN_USER_DELETION_FAILED("40010"), //
    WARN_USER_ACCOUNT_MODIFICATION_FAILED("40011"), //
    WARN_USER_LOCKED("40012"), //
    WARN_USER_RESET_PASSWORD_FAILED("40013"), //
    WARN_REVOKE_USER_ROLE_FAILED("40014"), //
    WARN_USER_CREATE_CUSTOMER_FAILED("40015"), //
    WARN_USER_ACCESS_USER_FAILED("40016"), //
    WARN_CUSTOMER_NOT_CURRENT_ORGANIZATION("40017"), //
    WARN_ORGANIZATION_ROLE_REQUIRED("40018"), //
    WARN_ORGANIZATION_REGISTRATION_FAILED("40019"), //
    WARN_ORGANIZATION_DEREGISTRATION_FAILED("40020"), //
    WARN_GET_ORGANIZATION_ID_FAILED("40021"), //
    WARN_READ_ORGANIZATION_FAILED_WRONG_TYPE("40022"), //
    WARN_ORGANIZATION_DATA_MODIFICATION_FAILED("40023"), //
    WARN_MAIL_ORGANIZATION_UPDATED_FAILED("40024"), //
    WARN_MAIL_DISCOUNT_CREATED_FAILED("40025"), //
    WARN_USER_LOGIN_FAILED("40026"), //
    WARN_TRIGGER_DELETION_FAILED("40027"), //
    WARN_MAILING_FAILURE("40028"), //
    WARN_PARAMETER_PARSING_FAILED("40029"), //
    WARN_VALIDATION_FAILED("40030"), //
    WARN_CREATE_SERVICE_SESSION_FAILED("40032"), //
    WARN_XML_TRANSFORM_FAILED("40033"), //
    WARN_ACCESS_PRODUCT_FAILED_NOT_TARGET_CUSTOMER("40037"), //
    WARN_EVENTS_NOT_BELONG_CORRECT_TECHNICAL_PRODUCT("40038"), //
    WARN_PARAMETER_FOR_PRICE_MODEL_INVALID("40039"), //
    WARN_NOT_CONFIGURABLE_PARAMETER_PASSED_TO_PRICE_MODEL("40040"), //
    WARN_COPY_SERVICE_FAILED_NOT_GLOBAL_TEMPLATE("40041"), //
    WARN_PRODUCT_DELETION_FAILED_STILL_USED_BY_SUBSCRIPTION("40042"), //
    WARN_PRODUCT_RETRIEVAL_FOR_CUSTOMER_FAILED("40043"), //
    WARN_PRODUCT_RETRIEVAL_FOR_CUSTOMER_AND_SUBSCRIPTION_FAILED("40044"), //
    WARN_ANONYMOUS_ACCESS_NOT_ALLOWED("40045"), //
    WARN_PRICEDOPTION_NO_OPTION_DEFINED("40046"), //
    WARN_MARKETING_PRODUCT_CREATION_FAILED("40047"), //
    WARN_MARKETING_PRODUCT_CREATION_FAILED_NOT_ACCESSIBLE_PRODUCT("40048"), //
    WARN_USER_ACCESS_TECHNICAL_PRODUCT_NOT_PERMITTED("40049"), //
    WARN_PRODUCT_CREATION_FAILED_CURRENCY_NOT_SUPPORTED("40050"), //
    WARN_CREATE_PRICE_MODEL_FOR_ORGANIZATION_FAILED_NOT_AUTHORIZED("40051"), //
    WARN_EX_SERVICE_OPERATION_EXCEPTION_CUSTOMER_COPY_ALREADY_EXISTS("40052"), //
    WARN_CREATE_PRICE_MODEL_FAILED_NOT_SUBSCRIPTION_DEFINED("40053"), //
    WARN_DEFINE_COMPATIBILITY_FOR_PRODUCTS_FAILED_NOT_SAME_BASE("40054"), //
    WARN_STORE_DOMAIN_OBJECT_FAILED_WRONG_TECHNICAL_KEY("40055"), //
    WARN_PRODUCT_AVTIVATION_FAILED_MISSING_PRICE_MODEL("40056"), //
    WARN_PRODUCT_AVTIVATION_FAILED_NOT_PUBLISHED_MARKETPLACE("40057"), //
    WARN_SUPPLIER_CHANGE_SUBSCRIPTION_STATE_FAILED("40058"), //
    WARN_USER_DEFINE_PRICE_FOR_ROLE_FAILED_NOT_SUPPORTED("40059"), //
    WARN_ACCESS_PRODUCT_COPY_NOT_ALLOWED("40060"), //
    WARN_TECHNICAL_PRODUCT_IMPORT_FAILED("40061"), //
    WARN_CUSTOMER_MUST_SUBSCRIBE_SPECIFIC_PRODUCT("40062"), //
    WARN_CUSTOMER_SPECIFIC_PRODUCT_NOT_FOR_THE_CUSTOMER("40063"), //
    WARN_SUBSCRIPTION_MIGRATION_CONFIRMING_FAILED("40064"), //
    WARN_NO_VISIBLE_GLOBAL_SERVICE_ASSIGNED("40065"), //
    WARN_INVALIDATION_SUBSCRIPTION_CONFIRMING_FAILED("40066"), //
    WARN_INFORM_PRODUCT_ABOUT_NEW_USER_FAILED("40067"), //
    WARN_USER_SUBSCRIBE_SERVICE_FAILED_ONLY_ONE_ALLOWED("40068"), //
    WARN_NOT_CONFIGURABLE_PARAMETER_OF_SUBSCRIPTION_MODIFIED("40069"), //
    WARN_NOT_EXISTING_PARAMETER_OF_SUBSCRIPTION_MIDIFIED("40070"), //
    WARN_REMOVAL_USER_FROM_SUBSCRIPTION_CONFIRMING_FAILED("40071"), //
    WARN_SERVICE_OPERATION_NOT_AVAILABLE("40072"), //
    WARN_USER_NOT_ASSINGED_TO_SUBSCRIPTION("40073"), //
    WARN_GRANT_ROLE_IN_SUBSCRIPTION_CONFIRMING_FAILED("40074"), //
    WARN_TIMEOUT_OF_SUBSCRIPTION_NOTIFYING_FAILED("40075"), //
    WARN_DELETION_OF_SUBSCRIPTION_CONFIRMING_FAILED("40076"), //
    WARN_CREATION_OF_SUBSCRIPTION_CONFIRMING_FAILED("40077"), //
    WARN_SENDING_ERROR_MAIL_FAILED("40078"), //
    WARN_ADDING_TO_SUBSCRIPTION_CONFIRMING_FAILED("40079"), //
    WARN_SUBSCRIPTION_TERMINATION_CONFIRMING_FAILED("40080"), //
    WARN_SUBSCRIBE_PRODUCT_FAILED("40081"), //
    WARN_MIGRATE_PRODUCT_FAILED("40082"), //
    WARN_MIGRATE_PRODUCT_FAILED_NOT_COMPATIBLE("40083"), //
    WARN_SUBSCRIPTION_DELETION_FAILED("40084"), //
    WARN_RECORD_EVENT_FAILED("40085"), //
    WARN_CHARGING_CUSTOMER_FAILED("40086"), //
    WARN_INVALID_PAYMENT_PROCESSING_NO_RELATED_ORGANIZATION_DATA("40087"), //
    WARN_INVALID_PAYMENT_PROCESSING_NO_RELATED_PAYMENT_DATA("40088"), //
    WARN_CHARGING_PROCESS_FAILED("40089"), //
    WARN_RETRIEVE_PSP_LINK_FAILED("40090"), //
    WARN_RETRIEVE_REDIRECT_URL_INVALID("40091"), //
    WARN_DETERMINE_SUBSCRIPTION_TYPE_FAILED("40092"), //
    WARN_NO_SUBSCRIPTION_FOUND_FOR_PRODUCT_SESSION("40093"), //
    WARN_SUBSCRIPTION_USAGELICENSE_NOT_FOUND("40094"), //
    WARN_PAYMENT_INFO_MISSING("40095"), //
    WARN_BILLING_CONTACT_MISSING("40096"), //
    WARN_PSP_IDENTIFIER_MISSING("40097"), //
    WARN_PAYMENT_TYPE_UNSUPPORTED("40098"), //
    WARN_PAYMENT_TYPE_NOT_HANDLED_BY_PSP("40099"), //
    WARN_HEIDELPAY_INPUT_PROCESS_FAILED("40100"), //
    WARN_SEND_RESPONSE_URL_TO_PSP_FAILED("40101"), //
    WARN_DETERMINE_COST_FOR_UNIT_FAILED("40102"), //
    WARN_DETERMINE_AMOUNT_FOR_USER_FAILED("40103"), //
    WARN_XML_PARSE_FAILED_CONTINUE_WITH_EMPTY_RESULT("40105"), //
    WARN_DOCUMENT_BUILDER_TO_PARSE_FAILED("40106"), //
    WARN_CLOSE_STREAM_FAILED("40107"), //
    WARN_UNKNOWN_MARKETPLACE("40108"), //
    WARN_NOTIFY_ASSIGNMENT_TO_MARKETPLACE_FAILED("40110"), //
    WARN_NO_LOCAL_MARKETPLACE_PRESENTED_TO_PUBLISH("40111"), //
    WARN_METHOD_FAILED_WITH_APPLICATION_EXCEPTION("40112"), //
    WARN_EX_TECHNICAL_SERVICE_NOT_ALIVE_EXCEPTION_ENDPOINT("40113"), //
    WARN_NO_OR_MULTIPLE_ENTRIES_FOUND_FOR_WEB_SERVICE("40114"), //
    WARN_ACCESS_DINIED_NO_USER("40115"), //
    WARN_DEFINE_SUPPORTED_PAYMENT_TYPE_FAILED("40116"), //
    WARN_UPDATE_ORGANIZATION_FAILED_INVALID_ROLE_GRANTED("40117"), //
    WARN_REGISTER_ORGANIZATION_FAILED_INVALID_ROLE_GRANTED("40118"), //
    WARN_DEBIT_FAILED_NO_PSPIDENTIFIER_SETTING("40119"), //
    WARN_DETERMINE_PSP_LINK_FAILED("40120"), //
    WARN_COPY_SERVICE_FAILED_INVALID_STATE("40121"), //
    WARN_SAVE_PRICE_MODEL_FAILED_SUBSCRIPTION_STATE_INVALID("40122"), //
    WARN_TOO_MANY_CONCURRENT_USER_FOR_SUBSCRIPTION("40123"), //
    WARN_NO_CONFIGRATION_SETTING_VALUE_FOUND("40124"), //
    WARN_ORGANIZATION_OWN_NO_TECHNICAL_PRODUCT_OF_SUBSCRIPTION("40125"), //
    WARN_TOO_MANY_NAMED_USER_FOR_SUBSCRIPTION("40126"), //
    WARN_CHANGE_PRICE_MODEL_FAILED_NO_PAYMENT_INFORMATION("40127"), //
    WARN_MODIFY_CHARGING_CONDITIONS_FOR_SPECIFIC_PRICE_MODEL_FAILED("40128"), //
    WARN_IGNORE_ILLEGAL_ORGANIZATION_SETTING("40129"), //
    WARN_HANDLE_PERIOD_FAILED("40130"), //
    WARN_ORGANIZATION_HAS_NO_MARKETPLACE("40131"), //
    WARN_IMAGE_DELETION_FAILED_NOT_BELONG_MARKETPLACE("40132"), //
    WARN_IMAGE_LOAD_FAILED_NOT_BELONG_MARKETPLACE("40133"), //
    WARN_IMAGE_SAVE_FAILED_NOT_BELONG_MARKETPLACE("40134"), //
    WARN_NON_SUPPORTED_LOCALE("40135"), //
    WARN_MISSING_BUNDLE("40136"), //
    WARN_SEND_CONFIRMATION_MAIL_FAILED("40137"), //
    WARN_SEND_USER_DELETED_MAIL_FAILED("40138"), //
    WARN_CURRENCY_NOT_PERSISTED("40139"), //
    WARN_ORGANIZATION_ALREADY_EXIST("40140"), //
    WARN_CONTEXT_ELEMENT_MISSING("40141"), //
    WARN_IMPORT_PARSER_ERROR_MANDATORY_ATTRIBUTE_MISSING("40142"), //
    WARN_IMPORT_PARSER_ERROR_BASE_URL_NEEDED("40143"), //
    WARN_IMPORT_PARSER_ERROR_PROVISIONING_URL_NEEDED("40144"), //
    WARN_IMPORT_PARSER_ERROR_LOGIN_PATH_NEEDED("40145"), //
    WARN_IMPORT_PARSER_ERROR_DUPULICATE_EVENT_ID("40146"), //
    WARN_IMPROT_PARSER_ERROR_ROLES_NOT_ALLOWED("40147"), //
    WARN_IMPORT_PARSER_ERROR_DUPULICATE_ROLE_ID("40148"), //
    WARN_IMPORT_PARSER_ERROR_DUPULICATE_OPERATION_ID("40149"), //
    WARN_IMPORT_PARSER_ERROR_DUPULICATE_PARAMETER_ID("40150"), //
    WARN_IMPORT_PARSER_ERROR_DUPULICATE_OPTION_ID("40151"), //
    WARN_IMPORT_PARSER_ERROR_UNKNOWN_ELEMENT("40152"), //
    WARN_IMPORT_PARSER_ERROR_MISSING_CONTEXT_ELEMENT("40153"), //
    WARN_IMPORT_PARSER_ERROR_DUPULICATE_TAG("40154"), //
    WARN_IMPORT_PARSER_ERROR_INVALID_DEFAULT_VALUE("40155"), //
    WARN_NO_VALUE_SET("40157"), //
    WARN_USER_APPEAR_MORE_THAN_ONCE("40158"), //
    WARN_NEGATIVE_TIME_SPECIFIED_FOR_TIMER("40159"), //
    WARN_VALUE_MUST_BE_NUMBER("40160"), //
    WARN_FALLBACK_MUST_BE_NUMBER("40161"), //
    WARN_PROCESS_PSP_REQUEST_FAILED_MISSING_PROPERTIES("40162"), //
    WARN_PAYMENT_INFORMATION_WITH_PSP_REGISTRATION_FAILED("40163"), //
    WARN_RESPONSE_URL_TO_PSP_FAILED_NOT_WRITTEN_RESPONSE_OBJECT("40164"), //
    WARN_RESPONSE_URL_TO_PSP_FAILED_NOT_DETERMINED_RESPONSE_URL("40165"), //
    WARN_IMPORT_PARSER_WARNING("40166"), //
    WARN_PROCESS_NAMED_USER_FAILED_AS_NUMBER_FORMAT("40167"), //
    WARN_PAYMENT_TYPE_OR_PAYMENT_TYPE_ID_NEEDED("40168"), //
    WARN_USER_OPERATION_LOG_ENTITY_TYPE_NOT_SUPPORTED("40169"), //
    WARN_DEFINE_COMPATIBILITY_FOR_PRODUCTS_FAILED_NOT_SAME_CURRENCY("40170"), //
    WARN_DUPLICATE_PSP_SETTING_KEY("40171"), //
    WARN_DUPLICATE_PSP_ACCOUNT("40172"), //
    WARN_CONFIGURE_SERVICE_PAYMENT_FAILED_NO_GLOBAL_TEMPLATE("40173"), //
    WARN_CONFIGURE_PAYMENT_FAILED_PAYMENT_NOT_ACTIVATED("40174"), //
    WARN_PAYMENT_TYPE_UNSUPPORTED_FOR_SERVICE("40175"), //
    WARN_SET_PSP_ID_UNAUTHORIZED("40176"), //
    WARN_SAVE_PRICE_MODEL_FAILED_NOT_SAME_CURRENCY_COMPATIBLE_PRODUCT("40177"), //
    WARN_PAYMENT_PROCESS_COMMUNICATION_FAILED("40178"), //
    WARN_SAVE_PRICE_MODEL_FOR_SUBSCRIPTION_FAILED_FREEPERIOD_UNMODIFIABLE(
            "40179"), //
    WARN_RESUME_SERVICE_INVALID_STATE("40180"), //
    WARN_SUSPEND_SERVICE_INVALID_STATE("40181"), //
    WARN_VALIDATE_PERMISSION_FOR_SUSPEND_AND_RESUME("40182"), //
    WARN_RETRIEVE_MARKETPLACE_URL_FAILED("40183"), //
    WARN_MAIL_USER_UPDATE_FAILED("40184"), //
    WARN_INVALID_CURRENCY("40185"), //
    WARN_CLOSE_OBJECT_MESSAGE_FAILED("40187"), //
    WARN_V11_CREATE_PAYMENTINFO("40188"), //
    WARN_SAVE_PRICE_MODEL_FAILED_NO_PAYMENT_INFO("40189"), //
    WARN_TECH_SERVICE_NOT_AVAILABLE("40190"), //
    WARN_NON_CONFIGURABLE_PARAMETER_DEFINITION("40192"), //
    WARN_PRICED_PARAMETER_WITH_INVALID_KEY("40193"), //
    WARN_UNCHANGEABLE_SUBSCRIPTION_CHARGING_CONDITIONS("40194"), //
    WARN_UNCHANGEABLE_SUBSCRIPTION_ONE_TIME_FEE("40195"), //
    WARN_PRICED_OPTION_WITH_INVALID_KEY("40196"), //
    WARN_DUPLICATE_ORG_WITH_DISTINGUISHED_NAME("40197"), //
    WARN_INVALID_UDA_DEFINITION("40198"), //
    WARN_NON_UNIQUE_BUSINESS_KEY_WITH_TYPE("40199"), //
    WARN_NON_UNIQUE_BUSINESS_KEY_UDA_DEFINITION("40200"), //
    WARN_INEXISTENT_UDA_DEFINITION("40201"), //
    WARN_INVALID_UDA_TARGET_TYPE("40202"), //
    WARN_INEXISTENT_CUSTOMER("40203"), //
    WARN_INEXISTENT_SUBSCRIPTION("40204"), //
    WARN_NON_UNIQUE_BUSINESS_KEY_UDA("40205"), //
    WARN_INVALID_UDA("40206"), //
    WARN_INEXISTENT_UDA("40207"), //
    WARN_WRONG_UDA_DEFINITION("40208"), //
    WARN_PAYMENT_INFO_INVOICE_NOT_DELETABLE("40209"), //
    WARN_TECH_SERVICE_NOT_ALIVE_CONNECTION_REFUSED("40210"), //
    WARN_TECH_SERVICE_NOT_ALIVE_CUSTOMER("40211"), //
    WARN_TECH_SERVICE_NOT_ALIVE_TIMEOUT("40212"), //
    WARN_TECH_SERVICE_WS_NO_INSTANCE("40213"), //
    WARN_TECH_SERVICE_WS_NULL("40214"), //
    WARN_TECH_SERVICE_WS_ERROR_CODE("40215"), //
    WARN_TECH_SERVICE_WS_EXCEPTION("40216"), //
    WARN_TECH_SERVICE_WS_ERROR("40217"), //
    WARN_TECH_SERVICE_VALIDATION_FAILED("40218"), //
    WARN_TECH_SERVICE_VALIDATION_FAILED_USERID_MAXLENGTH("40219"), //
    WARN_INEXISTENT_OBJECT_WITH_BUSINESS_KEY("40220"), //
    WARN_NON_UNIQUE_BUSINESS_KEY("40222"), //
    WARN_CATALOG_ENTRY_REMOVED("40223"), //
    WARN_VALIDATION_EXCEPTION_DUPLICATE_CATALOG_POSITION("40224"), //
    WARN_VALIDATION_EXCEPTION_PRICED_PARAM_WRONG_BASE("40225"), //
    WARN_NO_ENTRY_FOUND("40226"), //
    WARN_NO_VALUE_FOUND("40227"), //
    WARN_ERROR_ON_LOAD("40231"), //
    WARN_SUBSCRIPTION_STATE_INVALID("40232"), //
    WARN_ORG_AUTHORITIES_NO_SUPPLIER("40233"), //
    WARN_NO_PAYMENT_INFO_REQUIRED("40234"), //
    WARN_VAT_NOT_SUPPORTED("40235"), //
    WARN_VALIDATION_FAILED_FOR_MEMBER("40236"), //
    WARN_CONCURRENT_MODIFICATION("40237"), //
    WARN_INSUFFICIENT_AUTH_BY_PUBLISH_ON_MARKETPLACE("40238"), //
    WARN_INSUFFICIENT_AUTH_BY_TECH_SERVICE_ACCESS("40239"), //
    WARN_INSUFFICIENT_AUTH_BY_SERVICE_ACCESS("40240"), //
    WARN_INSUFFICIENT_AUTH_BY_MARKETPLACE_ACCESS("40241"), //
    WARN_NO_SUPPLIER_OF_CUSTOMER("40242"), //
    WARN_INSUFFICIENT_AUTH_BY_UDA_DEFINITION_ACCESS("40243"), //
    WARN_INSUFFICIENT_AUTH_BY_SUBSCRIPTION_ACCESS("40244"), //
    WARN_INSUFFICIENT_AUTH_BY_PAYMENT_INFO_ACCESS("40245"), //
    WARN_INSUFFICIENT_AUTH_BY_BILLING_CONTACT_ACCESS("40246"), //
    WARN_MAIL_SENDING_TASK_FAILED("40247"), //
    WARN_MARKETING_PERMISSION_NOT_FOUND("40248"), //
    WARN_MARKETING_PERMISSION_NOT_ADDED("40249"), //
    WARN_DEFINE_COMPATIBILITY_FOR_PRODUCTS_FAILED_NOT_SAME_MARKETPLACE("40250"), //
    WARN_LOGOUT_FAILED("40251"), //
    WARN_OBJECT_CREATED_CONCURRENTLY("40252"), //
    WARN_OPERATION_NOT_ALLOWED_FOR_MARKETPLACE("40253"), //
    WARN_NON_UNIQUE_CATEGORY_NAME("40254"), //
    WARN_SAVE_PAYMENT_CONFIGURATION_FAILED_DUE_TO_TRIGGER_CONFLICT("40255"), //
    WARN_REGISTER_CUSTOMER_FOR_SUPPLIER_FAILED_DUE_TO_TRIGGER_CONFLICT("40256"), //
    WARN_ADD_REVOKE_USER_FAILED_DUE_TO_TRIGGER_CONFLICT("40257"), //
    WARN_SUBSCRIBE_TO_SERVICE_FAILED_DUE_TO_TRIGGER_CONFLICT("40258"), //
    WARN_UNSUBSCRIBE_FROM_SERVICE_FAILED_DUE_TO_TRIGGER_CONFLICT("40259"), //
    WARN_MODIFY_SUBSCRIPTION_FAILED_DUE_TO_TRIGGER_CONFLICT("40260"), //
    WARN_UPGRADE_SUBSCRIPTION_FAILED_DUE_TO_TRIGGER_CONFLICT("40261"), //
    WARN_ACTIVATE_SERVICE_FAILED_DUE_TO_TRIGGER_CONFLICT("40262"), //
    WARN_DEACTIVATE_SERVICE_FAILED_DUE_TO_TRIGGER_CONFLICT("40263"), //
    WARN_TRIGGER_PROCESS_ALREADY_CANCELED("40264"), //
    WARN_URL_NOT_REACHABLE("40265"), //
    WARN_INVALID_PROPERTY_VALUE("40266"), //
    WARN_TRANSFORM_BILLING_RESULT_TO_VERSION_1_1_NEGATIVE_PRICE("40267"), //
    WARN_RELOGIN_AFTER_SESSION_TIMEOUT_FAILED("40269"), //
    WARN_MISSING_MANDATORY_UDA("40270"), //
    WARN_DELETE_MANDATORY_UDA("40271"), //
    WARN_REGISTER_ORGANIZATION_FAILED_INCOMPATIBLE_ROLES_GRANTED("40272"), //
    WARN_ADDING_INCOMPATIBLE_ROLE_TO_ORGANIZATION_FAILED("40273"), //
    WARN_INSUFFICIENT_AUTH_BY_ORGANIZATION_ACCESS("40274"), //
    WARN_UNPERMITTED_UDA_TARGET_SWITCH("40275"), //
    WARN_CREATE_USER_FAILED_DUE_TO_TRIGGER_CONFLICT("40276"), //
    WARN_NOTIFICATION_NOT_SUPPORTED_IN_VERSION("40277"), //
    WARN_TECH_SERVICE_PARAMETER_DEFINITION_FAILED("40278"), //
    WARN_INVALID_SERVICE_STATUS("40279"), //
    WARN_REPORT_RESULT_CACHE("40280"), //
    WARN_NO_RESELLER_OF_CUSTOMER("40281"), //
    WARN_NO_SUPPLIER_OR_RESELLER_OF_CUSTOMER("40282"), //
    WARN_RESALE_PRODUCT_COPY_ALREADY_EXISTS("40283"), //
    WARN_IGNORE_ILLEGAL_PLATFORM_SETTING("40284"), //
    WARN_NON_EMPTY_ORGANIZATION_ID_SPECIFIED("40285"), //
    WARN_ONE_OF_PARTNER_REVENUE_SHARE_MANDATORY("40286"), //
    WARN_NO_BROKER_OF_CUSTOMER("40287"), //
    WARN_ORGANIZATION_ROLE_MISSING("40288"), //
    WARN_USER_ROLE_MISSING("40289"), //
    WARN_IMPORT_PARSER_ERROR_IMPLAUSIBLE_OPTIONS("40290"), //
    WARN_IMPORT_PARSER_ERROR_DUPLICATE_LOCALIZED_OPTION("40291"), //
    WARN_STEPPED_PRICING_MIXED_WITH_BASEPRICE("40292"), //
    WARN_MARKETPLACE_MISMATCH_ON_SETTING_VISIBILITY("40293"), //
    WARN_ADD_SUBSCRIPTION_OWNER_FAILED("40294"), //
    WARN_SUBSCRIPTION_OWNERSHIP_CHECK_FAILED("40295"), //
    WARN_PRICE_MODEL_TYPE_UNMODIFIABLE_FOR_SUBSCRIPTION("40296"), //
    WARN_CURRENCY_UNMODIFIABLE_FOR_SUBSCRIPTION("40297"), //
    WARN_TIME_UNIT_UNMODIFIABLE_FOR_SUBSCRIPTION("40298"), //
    WARN_NO_LANGUAGE_CODE_FOR_IMPORT_PROPERTIES("40299"), //
    WARN_LANGUAGE_NOT_SUPPORTED_FOR_IMPORT_PROPERTIES("40300"), //
    WARN_TRANSLATIONS_MISSING_FOR_IMPORT_PROPERTIES("40301"), //
    WARN_BILLINGRESULT_VALIDATION_PARSER_ERROR("40303"), //
    WARN_MODIFY_PARAMETER_OF_SUBSCRIPTION_CONFIRMING_FAILED("40304"), //
    WARN_MODIFY_PARAMETER_OF_SUBSCRIPTION_ABORT_CONFIRMING_FAILED("40305"), //
    WARN_UPDATE_PARAMETER_UNKNOWN_ID("40306"), //
    WARN_IMPORT_PARSER_ERROR_DUPULICATE_OPERATION_PARAMETER_ID("40307"), //
    WARN_OPERATION_PARAM_NOT_IN_TP("40308"), //
    WARN_OPERATION_NOT_IN_TP("40309"), //
    WARN_ROLE_NOT_IN_TP("40310"), //
    WARN_EVENT_NOT_IN_TP("40311"), //
    WARN_PARAMETER_NOT_IN_TP("40312"), //
    WARN_PARAMETER_OPTION_NOT_IN_TP("40313"), //
    WARN_TECH_SERV_DELETE_INSTANCE_FAILED("40314"), //
    WARN_SUBSCRIPTION_NOT_IN_UPDATING("40315"), //
    WARN_SUBSCRIPTION_NOT_IN_UPGRADING("40316"), //
    WARN_ILLEGAL_REQUEST_PARAMETER_NAME("40317"), //
    WARN_ILLEGAL_REQUEST_PARAMETER_VALUE("40318"), //
    WARN_PAYMENT_INFO_NOT_EXIST("40319"), //
    WARN_BILLING_CONTACT_NOT_EXIST("40320"), //
    WARN_TRIGGER_MODIFICATION_FAILED("40321"), //
    WARN_USERGROUP_NOT_BELONG_TO_ORGANIZATION("40322"), //
    WARN_PLATFORMUSER_NOT_BELONG_TO_ORGANIZATION("40323"), //
    WARN_DEFAULT_USERGROUP_OPERATION_NOT_PERMITTED("40324"), //
    WARN_MAIL_USERGROUP_UPDATED_FAILED("40325"), //
    WARN_ADDREVOKE_USERGROUP_ASSIGNMENT_FOR_ONBEHALFUSER_NOT_PERMITTED("40326"), //
    WARN_SERVICE_NOT_EXIST("40327"), //
    WARN_SERVICE_NOT_AVAILABLE("40328"), //
    WARN_GROUP_NOT_EXIST("40329"), //
    WARN_MARKETPLACE_NOT_EXIST("40330"), //
    WARN_ACCESS_SERVICE_FAILED("40331"), //
    WARN_MAIL_USER_NUM_EXCEEDED_FAILED("40332"), //
    WARN_IMPORT_PARSER_ERROR_ACCESSINFO_NEEDED("40333"), //
    WARN_GET_FILE_CONTENT_FAILED("40334"), //
    WARN_LDAP_PARTIAL_EXCEPTION("40335"), //

    // Error log
    ERROR_USER_DELETION_FAILED("70001"), //
    ERROR_SUPPLIER_ALREADY_EXIST("70002"), //
    ERROR_OPERATION_FAILED_ORGANIZATION_NOT_ROLE_AS_SUPPLIER("70003"), //
    ERROR_UNEXPECTED_BK_VIOLATION("70004"), //
    ERROR_ORGANIZATION_REGISTRATION_FAILED("70005"), //
    ERROR_ORGANIZATION_DELETION_FAILED("70006"), //
    ERROR_SUBSCRIPTION_NOT_ACTIVE("70007"), //
    ERROR_PERSIST_ORGANIZATION_REFERENCE_FAILED("70008"), //
    ERROR_DEACTIVATE_INSTANCE("70009"), //
    ERROR_ACTIVATE_INSTANCE("70010"), //
    ERROR_NONUNIQUEKEY_EXCEPTION_ALTHOUGH_NO_BUSINESS_KEY("70011"), //
    ERROR_ENCODE_ORGANIZATION_ID_FAILED("70012"), //
    ERROR_NONUNIQUE_ENTRY_FOR_REMOVED_ORGANIZATION("70013"), //
    ERROR_ENCODE_URL_FAILED("70014"), //
    ERROR_CLOSE_DIRECTORY_CONTEXT_FAILED("70015"), //
    ERROR_CLOSE_NAMING_ENUMURATION_FAILED("70016"), //
    ERROR_USER_LOGIN_FAILED("70017"), //
    ERROR_PERSIST_FAILED_SESSION_ID_NOT_SET("70018"), //
    ERROR_MAILING_FAILURE("70019"), //
    ERROR_USER_OPERATE_NOT_PERMITTED("70020"), //
    ERROR_USER_OPERATE_NOT_PERMITTED_THE_USER_ALREADY_DELETED("70021"), //
    ERROR_USER_VALUE_OBJECT_MISSING_IN_SESSION("70022"), //
    ERROR_FORMATTING_BUILD_DATE("70023"), //
    ERROR_IMPORT_XML_FAILED("70024"), //
    ERROR_ACTIVE_SUBSCRIPTION_FOR_CURRENT_USER_FAILED("70025"), //
    ERROR_CONVERT_TO_RUNTIME_EXCEPTION_FOR_COMPATIBILITY("70026"), //
    ERROR_BILLING_CONTACT_NOT_UNIQUE("70027"), //
    ERROR_SAVE_BILLING_CONTACT_NOT_PERMITTED("70028"), //
    ERROR_LOCALIZE_RESOURCE_FAILED("70029"), //
    ERROR_PAYMENT_TYPE_ALREADY_EXIST("70030"), //
    ERROR_PEYMENT_TYPE_HAS_INVALID_NAME("70032"), //
    ERROR_NO_PERMISSION_TO_ACCESS_PAYMENT_INFO("70033"), //
    ERROR_PROCESS_PAYMENT_OPERATION("70034"), //
    ERROR_STORE_PAYMENT_RESULT_FAILED("70035"), //
    ERROR_PROCESS_CHARGING_FAILED("70036"), //
    ERROR_DATA_MISSING_TO_COMPLETE_PAYMENT_PROCESS("70037"), //
    ERROR_NOT_SUPPORTED_ENCODING_UTF8("70038"), //
    ERROR_PERSIST_CONFIGURATION_SETTING("70039"), //
    ERROR_NO_CLASS_LOADER_RETURNED("70040"), //
    ERROR_REQUIRED_BUNDLE_NOT_FOUND("70041"), //
    ERROR_CLOSE_STREAM_FAILED("70042"), //
    ERROR_READING_PROPERTIES("70043"), //
    ERROR_JNDI_LOOKUP_FAILED("70044"), //
    ERROR_JNDI_INITIAL_CONTEXT_CREATION_FAILED("70045"), //
    ERROR_PROXY_FORWARDING_FAILED("70046"), //
    ERROR_BILLING_RUN_FAILED_NO_BILL_GENERATED("70047"), //
    ERROR_ADD_INVOICE_PAYMENT_TYPE("70048"), //
    ERROR_CREATE_PRODUCT_SESSION_FAILED("70049"), //
    ERROR_MANDATORY_PROPERTY_NOT_SET("70050"), //
    ERROR_HANDLE_TIMER_FAILED("70051"), //
    ERROR_EVALUATE_MESSAGE_FAILED("70052"), //
    ERROR_PERSIST_TRIGGER_PROCESS_FAILED("70053"), //
    ERROR_SEND_MESSAGE_TO_JMS_QUEUE_FAILED("70054"), //
    ERROR_SEND_MESSAGE_TO_JMS_QUEUE_FAILED_NW_CONNECTION_BROKEN("70055"), //
    ERROR_JMS_RESOURCE_NOT_INITIALIZED("70056"), //
    ERROR_CONVERT_ORGANIZATION_ROLE_TYPE_FAILED("70057"), //
    ERROR_PARSE_SUBSCRIPTION_KEY_FAILED("70058"), //
    ERROR_ACCESS_INPUT_STREAM_OF_REQUEST_FAILED("70059"), //
    ERROR_USE_PROXY_DEFINITION_FAILED("70060"), //
    ERROR_TECHNICAL_PRODUCT_LICENSE_MODIFICATION_FAILED("70061"), //
    ERROR_DELETE_TECHNICAL_PRODUCT_FAILED("70062"), //
    ERROR_PRICED_PARAMETER_LIST_NOT_CONTAIN_PARAMETER_FOR_ID("70063"), //
    ERROR_RETRIEVAL_CUSTOMER_OR_SUBSCRIPTION_FAILED_RESULT_NOT_UNIQUE("70064"), //
    ERROR_CREATE_CUSTOMER_FOR_SPECIFIC_PRICEMODEL_FAILED("70065"), //
    ERROR_INVALID_ARGUMENT_AS_PRODUCT_NOT_TEMPLATE("70066"), //
    ERROR_DEFINE_COMPATIBLE_PRODUCT_FAILED("70067"), //
    ERROR_SEND_SERVICE_SUSPENDED_MAIL_FAILED("70068"), //
    ERROR_DEFINE_CATALOG_ENTRY_VISIBILITY_FAILED("70069"), //
    ERROR_USER_ACCESS_TECHNICAL_PRODUCT_NOT_PERMITTED("70070"), //
    ERROR_IMPORT_TECHNICAL_PRODUCT_FAILED("70071"), //
    ERROR_IMPORT_PARSER_ERROR("70072"), //
    ERROR_MIGRATE_SUBSCRIPTION_AS_CHECK_PARAMETER("70073"), //
    ERROR_ACTIVATE_SUBSCRIPTION_FAILED_AS_NO_VALID_PAYMENT_ASSIGNED("70074"), //
    ERROR_MODIFY_PARAMETER_SET_FAILED("70075"), //
    ERROR_STOP_APPLICATION_FAILED("70076"), //
    ERROR_EXPIRE_SUBSCRIPTION_FAILED("70077"), //
    ERROR_TERMINATE_SUBSCRIPTION_FAILED("70078"), //
    ERROR_UNSUBSCRIBE_SUBSCRIPTION_FAILED("70079"), //
    ERROR_RECORD_EVENT_FAILED_SUBSCRIPTION_NOT_UNIQUE("70080"), //
    ERROR_MARKETPLACE_CREATION_FAILED("70081"), //
    ERROR_SUPPLIER_ALREADY_ADDED_TO_MARKETPLACE("70082"), //
    ERROR_PERSIST_MARKETPLACE_FAILED("70083"), //
    ERROR_DETERMINE_MARKETPLACE_FAILED("70084"), //
    ERROR_EVALUATE_PSP_RESPONSE_FAILED("70085"), //
    ERROR_LOOKUP_ACCOUNTING_SERVICE_FAILED_FOR_HANDLEING_PSP("70086"), //
    ERROR_READ_DATA_FOR_REVENUE_REPORT_FAILED("70087"), //
    ERROR_GENERATE_BILLING_DETAIL_REPORT_FAILED("70088"), //
    ERROR_GENERATE_REPORT_FAILED("70090"), //
    ERROR_DETERMINE_CURRENCY_FAILED("70095"), //
    ERROR_SETUP_SYSTEM_FAILED_CUSTOMER_ROLE_NOT_FOUND("70099"), //
    ERROR_INITIALIZE_LOGIN_METHOD_FAILED("70102"), //
    ERROR_NOT_UNIQUE_PLATFORM_EVENT("70103"), //
    ERROR_NOT_UNIQUE_PLATFORM_PARAMETER("70104"), //
    ERROR_NOT_UNIQUE_BUSINESS_KEY("70105"), //
    ERROR_DEREGISTER_PAYMENT_INFORMATION_IN_PSP_FAILED("70106"), //
    ERROR_DEREGISTER_PAYMENT_INFORMATION__FAILED_ON_PSP_SIDE("70107"), //
    ERROR_RESOURCE_NOT_EXIST("70108"), //
    ERROR_RECEIVE_MESSAGE_INTERPRETED_FAILED("70109"), //
    ERROR_MANDATORY_SETTING_OF_NODE_NOT_SET("70110"), //
    ERROR_ACTIVATE_SUBSCRIPTION_FAILED_NO_PAYMENT_INFORMATION("70111"), //
    ERROR_ACTIVATE_SUBSCRIPTION_FAILED_NO_BILLING_CONTACT("70112"), //
    ERROR_TIMER_TIMEOUT_FOR_UNKNOWN_TYPE("70113"), //
    ERROR_TRIGGER_TYPE_NOT_SUPPORTED("70114"), //
    ERROR_GET_BILLING_DATA_FAILED_WITH_WRONG_PARAMETER("70115"), //
    ERROR_GET_ORGANIZATION_BILLING_DATA_RETURN_NULL("70116"), //
    ERROR_EXECUTE_SHOW_BILLING_DATA_WITH_NULL_DATA("70117"), //
    ERROR_PAYMENT_INFORMATION_NOT_FOUND("70118"), //
    ERROR_OPTION_NOT_FOUND("70119"), //
    ERROR_SUBSCRIPTION_HAVE_NO_PAYMENT_INFO("70120"), //
    ERROR_SUBSCRIPTION_NOT_FOUND("70121"), //
    ERROR_CUSTOMER_HAS_NO_SUPPLIER("70122"), //
    ERROR_PLATFORM_OPERATOR_ORGANIZATION_NOT_FOUND("70123"), //
    ERROR_ORGANIZATION_HAS_NO_REFERENCE_TYPE("70124"), //
    ERROR_PERSIST_IMAGE_RESOURCE_FAILED_PRIOR_CHECK_PERFORMED("70125"), //
    ERROR_PERSIST_LOCALIZED_RESOURCE_FAILED_PRIOR_CHECK_PERFORMED("70126"), //
    ERROR_SERVICE_PUBLISHED_ONLY_LOCAL_XOR_GLOBAL_MARKETPLACE("70127"), //
    ERROR_MALFORMED_ELEMENT("70128"), //
    ERROR_CREATE_TRANSFORMER_FOR_SAML_FAILED("70129"), //
    ERROR_TRANSFORM_SAML_DOM_TREE_TO_STRING_FAILED("70130"), //
    ERROR_CLOSE_SAML_WRITER_FAILED("70131"), //
    ERROR_BUILD_SAML_DOM_TREE_FAILED("70132"), //
    ERROR_CONVERT_BIGDECIMAL_PRICE_TO_LONG_FAILED("70133"), //
    ERROR_SET_PRODUCT_TO_BRIDGE_OF_DOMAIN_OBJECT_FAILED("70134"), //
    ERROR_PROVIDE_DIGITAL_SIGNING_OF_SAML("70135"), //
    ERROR_WRONG_USER_KEY_IN_SESSION("70136"), //
    ERROR_IMAGES_NOT_BELONG_TO_ORGANIZATION("70137"), //
    ERROR_PAYMENT_TYPE_INVOICE_NOT_FOUND("70138"), //
    ERROR_PAYMENT_TYPE_INVOICE_CREATION_FAILED("70139"), //
    ERROR_STORE_PROPERTIES_FAILED("70140"), //
    ERROR_EX_OBJECT_NOT_FOUND_EXCEPTION_ORGANIZATION_TO_COUNTRY("70141"), //
    ERROR_CLASS_LOADER_NOT_FOUND("70142"), //
    ERROR_FIND_RESOURCE_FAILED("70143"), //
    ERROR_FIND_INPUT_STREAM_FAILED("70144"), //
    ERROR_CLOSE_INPUT_STREAM_FAILED("70145"), //
    ERROR_READ_FILE_FAILED("70146"), //
    ERROR_TRIGGER_TYPE_NOT_SUPPORTED_PROCESS_SUSPENDING("70147"), //
    ERROR_OBJECT_ENCODING_FAILED("70148"), //
    ERROR_SET_TARGET_COUNTRY_FAILED_ORGANIZATION_EXISTS("70149"), //
    ERROR_SET_TARGET_ORGANIZATION_FAILED_COUNTRY_EXISTS("70150"), //
    ERROR_UNEXPECTED_EXCEPTION_WHILE_WRITING_EVENT("70151"), //
    ERROR_ORGANIZATION_OF_CALLER_NOT_OWNER_OF_TECHNICAL_SERVICE("70152"), //
    ERROR_PASSWORD_OPERATION_FORBIDDEN_REMOTE_LDAP("70153"), //
    ERROR_MAIL_OPERATION_FAILED("70154"), //
    ERROR_USER_CREATION_FAILED_WITH_VALIDATION_ERROR("70155"), //
    ERROR_ADDING_USER_FORBIDDEN_REMOTE_LDAP("70156"), //
    ERROR_DIFFERENT_KEY_TYPE("70157"), //
    ERROR_LDAP_SEARCH_OF_USER_FAILED("70159"), //
    ERROR_PARAMETER_NULL("70160"), //
    ERROR_SUSPENDING_TRIGGER_ALREADY_EXISTS_FOR_TYPE("70161"), //
    ERROR_TRIGGER_DEFINITION_HAS_NO_BUSINESS_KEY("70162"), //
    ERROR_VALIDATION_PARAMETER_LDAP_FOUND_ERROR("70163"), //
    ERROR_LDAP_SYSTEM_CONNECTION_REFUSED("70164"), //
    ERROR_UPDATE_MARKETPLACE_OWNER_FAILED("70165"), //
    ERROR_UNSUPPORTED_PRIVATE_KEY_ALGORITHM("70166"), //
    ERROR_INVALID_PRIVATE_KEY_SPECIFICATION("70167"), //
    ERROR_UNSUPPORTED_ENCODING("70168"), //
    ERROR_IMAGES_NOT_BELONG_TO_PRODUCT("70169"), //
    ERROR_CLOSE_FILE_WRITER_FAILED("70170"), //
    ERROR_CREATE_UNIQUE_PRODUCT_ID_FAILED_IN_PRODUCT_COPY("70171"), //
    ERROR_USER_ASSIGNMENT_TO_TECHNICAL_SERVICE_FAILED_NO_SERVICE_ROLE("70172"), //
    ERROR_NO_ROLE_FOR_TECHNICAL_SERVICE("70173"), //
    ERROR_NO_EXECUTION_FOR_THE_TRIGGER_TYPE("70174"), //
    ERROR_UNHANDLED_TRIGGER_TYPE("70175"), //
    ERROR_NO_AUTHORITY_TO_APPROVE("70176"), //
    ERROR_INVALID_STATUS_TRIGGER_PROCESS("70177"), //
    ERROR_CREATE_SERVICE("70178"), //
    ERROR_DEACTIVATE_SERVICE("70179"), //
    ERROR_SEARCH_SERVICE("70180"), //
    ERROR_LOGIN_FAILED_AFTER_CHANGE_PASSWORD("70181"), //
    ERROR_TRANSFORM_BILLING_RESULT_TO_VERSION_1_1("70184"), //
    ERROR_ADD_CUSTOMER("70185"), //
    ERROR_DELETE_PAYMENT_INFORMATION_FOR_FAILURE_PSP_HANDLING("70186"), //
    ERROR_GET_MARKETPLACE_ID("70187"), //
    ERROR_DEFAULT_VAT_RARE_MISSING("70188"), //
    ERROR_WRONG_IMAGE_TYPE("70189"), //
    ERROR_ACCESS_CUSTOM_SERVICE_FAILED_WITH_MALFORMED_URL("70190"), //
    ERROR_PROCESS_TRANSLATION_FILE("70191"), //
    ERROR_LOOKUP_WEB_SERVICE_FAILED("70192"), //
    ERROR_IMAGE_FOR_SUPPLIER_NOT_FOUND("70193"), //
    ERROR_SAVE_PAYMENT_CONFIGURATION_NOT_PERMITTED("70194"), //
    ERROR_READ_DATA_FOR_USER_OPERATION_LOG_FAILED("70195"), //
    ERROR_WRONG_DATA_FOR_USER_OPERATION_LOG("70196"), //
    ERROR_GET_USER_OPERATION_LOG_FAILED_WITH_WRONG_PARAMETER("70197"), //
    ERROR_GET_USER_OPERATION_LOG_RETURN_NULL("70198"), //
    ERROR_INVALID_ARGUMENT_AS_TASK_MESSAGE("70200"), //
    ERROR_CREATE_INSTANCE_FOR_TASK_HANDLER_FAILED("70201"), //
    ERROR_LIST_OF_MESSAGES_NOT_INITIALIZED("70202"), //
    ERROR_HANDLER_OF_MESSAGE_EMPTY("70203"), //
    ERROR_PAYLOAD_OF_MESSAGE_EMPTY("70204"), //
    ERROR_HANDLING_MESSAGE_ERROR_FAILED("70205"), //
    ERROR_HANDLING_MESSAGE_ERROR_FAILED_NO_HANDLER("70206"), //
    ERROR_DELETE_USER_FAILED_BY_DELETION_REVIEW_PERMISSION_ERROR("70207"), //
    ERROR_PASSED_ENTITY_NOT_PERSISTED("70208"), //
    ERROR_INVALID_TRIGGER_TYPE_FOR_CONTEXT("70209"), //
    ERROR_SUPPLIER_ALREADY_BANNED_FROM_MARKETPLACE("70210"), //
    ERROR_VO_CONVERSION_1_6("70211"), //
    ERROR_MARKETPLACE_NOT_FOUND("70212"), //
    ERROR_SEARCH_INDEX_CREATION_FAILED("70213"), //
    ERROR_FETCH_BRANDING_PACKAGE_RETURN_NULL("70214"), //
    ERROR_EXECUTE_DOWNLOAD_BRANDING_PACKAGE_WITH_NULL_DATA("70215"), //
    ERROR_UNEXPECTED_INCOMPATIBLE_ROLES_EXCEPTION("70216"), //
    ERROR_MULTIPLE_CATALOG_ENTRIES_NOT_ALLOWED("70217"), //
    ERROR_OPERATION_ALLOWED_ONLY_FOR_TEMPLATE_SERVICE_OR_COPY_FOR_RESALE(
            "70218"), //
    ERROR_LDAP_ACCESS_FAILED("70219"), //
    ERROR_CATALOG_ENTRY_NOT_FOUND("70220"), //
    ERROR_MISSING_PRICE_MODEL_AND_MARKETPLACE_FOR_TEMPLATE("70221"), //
    ERROR_MISSING_PRICE_MODEL_FOR_COPY("70222"), //
    ERROR_AUTHORITY_TO_BE_GRANTED_INVALID("70223"), //
    ERROR_MANDATORY_LDAP_PARAMETER_MISSING("70224"), //
    ERROR_SERVICE_IS_NOT_A_TEMPLATE("70225"), //
    ERROR_SERVICE_NOT_ASSIGNED_TO_MARKETPLACE("70226"), //
    ERROR_MISSING_PRICE_MODEL_FOR_TEMPLATE("70227"), //
    ERROR_INVALID_LDAP_PLATFORM_PROPERTY("70228"), //
    ERROR_DUPLICATE_LDAP_PROPERTY("70229"), //
    ERROR_LOCK_OPERATION_FORBIDDEN_REMOTE_LDAP("70230"), //
    ERROR_UPDATE_USER_FORBIDDEN_REMOTE_LDAP("70231"), //
    ERROR_DELETE_USER_FORBIDDEN_REMOTE_LDAP("70232"), //
    ERROR_ON_BEHALF_USER_OPERATION_REMOTE_LDAP("70233"), //
    ERROR_BROKER_REVENUE_SHARES_CALCULATION_FAILED_NO_BILL_GENERATED("70234"), //
    ERROR_RESELLER_REVENUE_SHARES_CALCULATION_FAILED_NO_BILL_GENERATED("70235"), //
    ERROR_SUPPLIER_REVENUE_SHARES_CALCULATION_FAILED_NO_BILL_GENERATED("70236"), //
    ERROR_MPOWNER_REVENUE_SHARES_CALCULATION_FAILED_NO_BILL_GENERATED("70237"), //
    ERROR_SERVICE_DELETION_FAILED_EXISTING_RESALE_PERMISSION("70238"), //
    ERROR_NO_DEFAULT_DEFINED_FOR_LDAP_PROPERTY("70239"), //
    ERROR_OPERATION_INVOKED_BY_NON_PLATFORM_OPERATOR("70240"), //
    ERROR_USER_UPDATE_FAILED_ATTRIBUTE_LDAP_MAPPED("70241"), //
    ERROR_CREATE_ORGANIZATION("70242"), //
    ERROR_IMPORT_LDAP_SETTINGS("70243"), //
    ERROR_READ_DATA_FOR_REPORT_FAILED("70244"), //
    ERROR_UNKNOWN_ORGANIZATION("70245"), //
    ERROR_SQL("70246"), //
    ERROR_CLOSE_RESOURCE_FAILED("70247"), //
    ERROR_SEND_MESSAGE_TO_JMS_QUEUE_FAILED_DETAILS("70248"), //
    ERROR_REGISTER_ORGANIZATION_FAILED_INVALID_OPERATOR_REVENUE_SHARE("70249"), //
    ERROR_UPDATE_ORGANIZATION_FAILED_INVALID_OPERATOR_REVENUE_SHARE("70250"), //
    ERROR_MISSING_OPERATOR_PRICE_MODEL_FOR_SERVICE_TEMPLATE("70251"), //
    ERROR_AVAILABLE_OPERATOR_PRICE_MODEL_FOR_SERVICE_COPY("70252"), //
    ERROR_MISSING_OPERATOR_PRICE_MODEL_FOR_SUPPLIER("70253"), //
    ERROR_AVAILABLE_OPERATOR_PRICE_MODEL_FOR_NON_SUPPLIER("70254"), //
    ERROR_OPERATOR_REVENUE_SHARE_OF_SERVICE_NOT_FOUND("70255"), //
    ERROR_DIGITAL_SIGNATURE_VALIDATION_ERROR("70256"), //
    ERROR_DIGITAL_SIGNATURE_VALIDATION_NOT_VALID("70257"), //
    ERROR_ASSERTION_VALIDATION_RECIPIENT("70258"), //
    ERROR_ASSERTION_VALIDATION_EXPIRED("70259"), //
    ERROR_ASSERTION_VALIDATION_EXCEPTION_OCCURRED("70260"), //
    ERROR_ASSERTION_VALIDATION_RESPONSETO("70261"), //
    ERROR_DIGITAL_SIGNATURE_VALIDATION_EXCEPION_KEYSTORE("70262"), //
    ERROR_AUTH_REQUEST_GENERATION_FAILED("70263"), //
    ERROR_MISSING_IDP_URL("70265"), //
    ERROR_GET_USER_FROM_SAML_RESPONSE_FAILED("70266"), //
    ERROR_DECODE_SAML_RESPONSE_FAILED("70267"), //
    ERROR_OPERATION_FORBIDDEN_FOR_SAML_SP("70268"), //
    ERROR_MISSING_HISTORYDATA_FOR_PRODUCT("70269"), //
    ERROR_CANNOT_CONNECT_TO_DATABASE("70270"), //
    ERROR_OPERATION_ONLY_FOR_1000("70271"), //
    ERROR_LANGUAGE_ISOCODE_INVALID("70272"), //
    ERROR_DEFAULT_LANGUAGE_NOT_FOUND("70273"), //
    ERROR_DEFAULT_LANGUAGE_MORE_THAN_ONE("70274"), //
    ERROR_LANGUAGE_ISOCODE_EXISTED("70275"), //
    ERROR_LANGUAGE_ISOCODE_NOT_FOUND("70276"), //
    ERROR_JSON_PROCESSING_FAILED("70277"), //
    ERROR_JSON_IO_EXCEPTION("70278"), //
    ERROR_UNSUPPORTED_OPERATION("70279"), //
    ERROR_REDIRECT_URL_BUILDER_NO_AUTHNREQUEST("70280"), //
    ERROR_REDIRECT_URL_BUILDER_NO_ENDPOINT_URL("70281"), //
    ERROR_SUBSCRIPTIONID_NOT_UNIQUE_IN_MODIFIEDENTITY("70282"), //
    ERROR_SUBSCRIPTIONID_NOT_EXIST_IN_MODIFIEDENTITY("70283"), //
    ERROR_SUBSCRIPTIONID_ALREADY_EXIST_IN_MODIFIEDENTITY("70284"), //
    ERROR_BULK_USER_IMPORT_FAILED("70285"), //
    ERROR_PRODUCT_INSTANCE_ID_ALREADY_EXIST("70286"), //
    ERROR_NOTIFY_PROVISIONING_SERVICE_FAILED("70287"), //
    ERROR_TIMER_EXPIRATIONDATE_INVALID("70288"), //
    ERROR_TIMER_USERCOUNT_EXPIRATIONDATE_INVALID("70289"), //
    ERROR_PARSE_APIVERSION_FAILED("70290"), //
    ERROR_SERVICE_NOT_FOUND("70291"), //
    ERROR_HISTORYDATA_OF_PRODUCT_TEMPLATE_NOT_FOUND("70292"), //
    ERROR_TRIGGER_TYPE_WRONG("70293"), //
    ERROR_CALL_TO_BILLING_APPLICATION_FAILED("70294"), //
    ERROR_CALL_TO_BILLING_APPLICATION_TIMEOUT("70295"), //
    ERROR_CALL_TO_BILLING_APPLICATION_INTERRUPTED("70296"), //
    ERROR_EXECUTION_OF_BILLING_APPLICATION_TASK_REJECTED("70297"), //
    ERROR_CALL_TO_BILLING_APPLICATION_CANCELLED("70298"), //
    ERROR_BILLING_ADAPTER_NOT_FOUND("70299"), //
    ERROR_MULTIPLE_DEFAULT_BILLING_ADAPTER_FOUND("70300"), //
    ERROR_CONNECTION_TO_BILLING_ADAPTER_FAILED("70301"), //
    ERROR_SOAP_CONVERSION("70302"), //
    ERROR("-00001"), DEBUG("00000"); /* Debug Log */

    String msgId;

    private LogMessageIdentifier(String msgId) {
        this.msgId = msgId;
    }

    public String getMsgId() {
        return msgId;
    }
}
