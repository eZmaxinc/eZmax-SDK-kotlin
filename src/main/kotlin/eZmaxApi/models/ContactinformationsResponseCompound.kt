/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.models

import eZmaxApi.models.AddressResponseCompound
import eZmaxApi.models.EmailResponseCompound
import eZmaxApi.models.FieldEContactinformationsType
import eZmaxApi.models.PhoneResponseCompound
import eZmaxApi.models.WebsiteResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Contactinformations Object
 *
 * @param pkiContactinformationsID The unique ID of the Contactinformations
 * @param eContactinformationsType 
 * @param aObjAddress 
 * @param aObjPhone 
 * @param aObjEmail 
 * @param aObjWebsite 
 * @param fkiAddressIDDefault The unique ID of the Address
 * @param fkiPhoneIDDefault The unique ID of the Phone.
 * @param fkiEmailIDDefault The unique ID of the Email
 * @param fkiWebsiteIDDefault The unique ID of the Website Default
 * @param sContactinformationsUrl The url of the Contactinformations
 * @param objAddressDefault 
 * @param objPhoneDefault 
 * @param objEmailDefault 
 * @param objWebsiteDefault 
 */


data class ContactinformationsResponseCompound (

    /* The unique ID of the Contactinformations */
    @Json(name = "pkiContactinformationsID")
    val pkiContactinformationsID: kotlin.Int,

    @Json(name = "eContactinformationsType")
    val eContactinformationsType: FieldEContactinformationsType,

    @Json(name = "a_objAddress")
    val aObjAddress: kotlin.collections.List<AddressResponseCompound>,

    @Json(name = "a_objPhone")
    val aObjPhone: kotlin.collections.List<PhoneResponseCompound>,

    @Json(name = "a_objEmail")
    val aObjEmail: kotlin.collections.List<EmailResponseCompound>,

    @Json(name = "a_objWebsite")
    val aObjWebsite: kotlin.collections.List<WebsiteResponseCompound>,

    /* The unique ID of the Address */
    @Json(name = "fkiAddressIDDefault")
    val fkiAddressIDDefault: kotlin.Int? = null,

    /* The unique ID of the Phone. */
    @Json(name = "fkiPhoneIDDefault")
    val fkiPhoneIDDefault: kotlin.Int? = null,

    /* The unique ID of the Email */
    @Json(name = "fkiEmailIDDefault")
    val fkiEmailIDDefault: kotlin.Int? = null,

    /* The unique ID of the Website Default */
    @Json(name = "fkiWebsiteIDDefault")
    val fkiWebsiteIDDefault: kotlin.Int? = null,

    /* The url of the Contactinformations */
    @Json(name = "sContactinformationsUrl")
    val sContactinformationsUrl: kotlin.String? = null,

    @Json(name = "objAddressDefault")
    val objAddressDefault: AddressResponseCompound? = null,

    @Json(name = "objPhoneDefault")
    val objPhoneDefault: PhoneResponseCompound? = null,

    @Json(name = "objEmailDefault")
    val objEmailDefault: EmailResponseCompound? = null,

    @Json(name = "objWebsiteDefault")
    val objWebsiteDefault: WebsiteResponseCompound? = null

) {


}

