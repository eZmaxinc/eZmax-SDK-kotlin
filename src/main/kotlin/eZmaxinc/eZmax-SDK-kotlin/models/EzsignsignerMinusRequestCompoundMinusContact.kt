/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign application.  We provide SDKs for customers. They are generated using OpenAPI codegen, we encourage customers to use them as we also provide samples for them.  You can choose to build your own implementation manually or can use any compatible OpenAPI 3.0 generator like Swagger Codegen, OpenAPI codegen or any commercial generators.  If you need helping understanding how to use this API, don't waste too much time looking for it. Contact support-api@ezmax.ca, we're here to help. We are developpers so we know programmers don't like bad documentation. If you don't find what you need in the documentation, let us know, we'll improve it and put you rapidly up on track.
*
* The version of the OpenAPI document: 1.0.28
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxinc/eZmax-SDK-kotlin.models


import com.squareup.moshi.Json

/**
 * A Ezsignsigner->Contact Object and children to create a complete structure
 * @param sContactFirstname The first name of the Contact
 * @param sContactLastname The last name of the Contact
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sEmailAddress The email address of the contact. Must be filled if email authentification was requested
 * @param sPhoneNumber The Phone number of the contact. Use format \"5149901516\" for North American Numbers (Without \"1\" for long distance code) you would dial like this: 1-514-990-1516. Use format \"498945233886\" for international numbers (Without \"011\") you would dial like this: +49 89 452 33 88-6. In this example \"49\" is the country code of Germany.
 * @param sPhoneNumberCell The Cell Phone number of the contact. Use format \"5149901516\" for North American Numbers (Without \"1\" for long distance code) you would dial like this: 1-514-990-1516. Use format \"498945233886\" for international numbers (Without \"011\") you would dial like this: +49 89 452 33 88-6. In this example \"49\" is the country code of Germany.
 */

data class EzsignsignerMinusRequestCompoundMinusContact (
    /* The first name of the Contact */
    @Json(name = "sContactFirstname")
    val sContactFirstname: kotlin.String,
    /* The last name of the Contact */
    @Json(name = "sContactLastname")
    val sContactLastname: kotlin.String,
    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,
    /* The email address of the contact. Must be filled if email authentification was requested */
    @Json(name = "sEmailAddress")
    val sEmailAddress: kotlin.String? = null,
    /* The Phone number of the contact. Use format \"5149901516\" for North American Numbers (Without \"1\" for long distance code) you would dial like this: 1-514-990-1516. Use format \"498945233886\" for international numbers (Without \"011\") you would dial like this: +49 89 452 33 88-6. In this example \"49\" is the country code of Germany. */
    @Json(name = "sPhoneNumber")
    val sPhoneNumber: kotlin.String? = null,
    /* The Cell Phone number of the contact. Use format \"5149901516\" for North American Numbers (Without \"1\" for long distance code) you would dial like this: 1-514-990-1516. Use format \"498945233886\" for international numbers (Without \"011\") you would dial like this: +49 89 452 33 88-6. In this example \"49\" is the country code of Germany. */
    @Json(name = "sPhoneNumberCell")
    val sPhoneNumberCell: kotlin.String? = null
)

