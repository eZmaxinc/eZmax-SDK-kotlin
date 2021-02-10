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

import eZmaxinc/eZmax-SDK-kotlin.models.ContactMinusRequest
import eZmaxinc/eZmax-SDK-kotlin.models.ContactRequestCompoundAllOf
import eZmaxinc/eZmax-SDK-kotlin.models.ContactinformationsMinusRequestCompound

import com.squareup.moshi.Json

/**
 * A Contact Object and children to create a complete structure
 * @param objContactinformations 
 * @param fkiContacttitleID The unique ID of the Contacttitle.  Valid values:  |Value|Description| |-|-| |1|Ms.| |2|Mr.| |4|(Blank)| |5|Me (For Notaries)|
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sContactFirstname The First name of the contact
 * @param sContactLastname The Last name of the contact
 * @param sContactCompany The Company name of the contact
 * @param dtContactBirthdate The Birth Date of the contact
 */

data class ContactMinusRequestCompound (
    @Json(name = "objContactinformations")
    val objContactinformations: ContactinformationsMinusRequestCompound,
    /* The unique ID of the Contacttitle.  Valid values:  |Value|Description| |-|-| |1|Ms.| |2|Mr.| |4|(Blank)| |5|Me (For Notaries)| */
    @Json(name = "fkiContacttitleID")
    val fkiContacttitleID: kotlin.Int,
    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,
    /* The First name of the contact */
    @Json(name = "sContactFirstname")
    val sContactFirstname: kotlin.String,
    /* The Last name of the contact */
    @Json(name = "sContactLastname")
    val sContactLastname: kotlin.String,
    /* The Company name of the contact */
    @Json(name = "sContactCompany")
    val sContactCompany: kotlin.String,
    /* The Birth Date of the contact */
    @Json(name = "dtContactBirthdate")
    val dtContactBirthdate: kotlin.String? = null
)

