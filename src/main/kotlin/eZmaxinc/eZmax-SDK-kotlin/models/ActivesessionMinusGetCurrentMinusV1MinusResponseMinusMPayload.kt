/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
*
* The version of the OpenAPI document: 1.0.29
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxinc/eZmax-SDK-kotlin.models


import com.squareup.moshi.Json

/**
 * Payload for the /1/object/activesession/getCurrent API Request
 * @param sCustomerCode The customer code specific to the client in which the API request is being made
 * @param eActivesessionSessiontype The type of session used for the API request call
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sCompanyNameX The name of the active Company in the current language
 * @param sDepartmentNameX The name of the active Department in the current language
 * @param aRegisteredModules An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key.
 * @param aPermissions An array of permissions granted to the user or api key
 */

data class ActivesessionMinusGetCurrentMinusV1MinusResponseMinusMPayload (
    /* The customer code specific to the client in which the API request is being made */
    @Json(name = "sCustomerCode")
    val sCustomerCode: kotlin.String,
    /* The type of session used for the API request call */
    @Json(name = "eActivesessionSessiontype")
    val eActivesessionSessiontype: ActivesessionMinusGetCurrentMinusV1MinusResponseMinusMPayload.EActivesessionSessiontype,
    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,
    /* The name of the active Company in the current language */
    @Json(name = "sCompanyNameX")
    val sCompanyNameX: kotlin.String,
    /* The name of the active Department in the current language */
    @Json(name = "sDepartmentNameX")
    val sDepartmentNameX: kotlin.String,
    /* An Array of Registered modules.  These are the modules that are Licensed to be used by the User or the API Key. */
    @Json(name = "a_RegisteredModules")
    val aRegisteredModules: kotlin.collections.List<kotlin.String>,
    /* An array of permissions granted to the user or api key */
    @Json(name = "a_Permissions")
    val aPermissions: kotlin.collections.List<kotlin.Int>
) {

    /**
    * The type of session used for the API request call
    * Values: Normal
    */
    
    enum class EActivesessionSessiontype(val value: kotlin.String){
        @Json(name = "Normal") Normal("Normal");
    }
}

