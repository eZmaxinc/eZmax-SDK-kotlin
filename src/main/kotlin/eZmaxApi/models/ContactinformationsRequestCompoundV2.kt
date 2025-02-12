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

import eZmaxApi.models.AddressRequestCompound
import eZmaxApi.models.EmailRequestCompound
import eZmaxApi.models.FieldEContactinformationsType
import eZmaxApi.models.PhoneRequestCompound
import eZmaxApi.models.WebsiteRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Contactinformations Object and children to create a complete structure
 *
 * @param eContactinformationsType 
 * @param iAddressDefault The index in the a_objAddress array (zero based index) representing the Address object that should become the default one.  You can leave the value to 0 if the array is empty.
 * @param iPhoneDefault The index in the a_objPhone array (zero based index) representing the Phone object that should become the default one.  You can leave the value to 0 if the array is empty.
 * @param iEmailDefault The index in the a_objEmail array (zero based index) representing the Email object that should become the default one.  You can leave the value to 0 if the array is empty.
 * @param iWebsiteDefault The index in the a_objWebsite array (zero based index) representing the Website object that should become the default one.  You can leave the value to 0 if the array is empty.
 * @param aObjAddress 
 * @param aObjPhone 
 * @param aObjEmail 
 * @param aObjWebsite 
 */


data class ContactinformationsRequestCompoundV2 (

    @Json(name = "eContactinformationsType")
    val eContactinformationsType: FieldEContactinformationsType,

    /* The index in the a_objAddress array (zero based index) representing the Address object that should become the default one.  You can leave the value to 0 if the array is empty. */
    @Json(name = "iAddressDefault")
    val iAddressDefault: kotlin.Int,

    /* The index in the a_objPhone array (zero based index) representing the Phone object that should become the default one.  You can leave the value to 0 if the array is empty. */
    @Json(name = "iPhoneDefault")
    val iPhoneDefault: kotlin.Int,

    /* The index in the a_objEmail array (zero based index) representing the Email object that should become the default one.  You can leave the value to 0 if the array is empty. */
    @Json(name = "iEmailDefault")
    val iEmailDefault: kotlin.Int,

    /* The index in the a_objWebsite array (zero based index) representing the Website object that should become the default one.  You can leave the value to 0 if the array is empty. */
    @Json(name = "iWebsiteDefault")
    val iWebsiteDefault: kotlin.Int,

    @Json(name = "a_objAddress")
    val aObjAddress: kotlin.collections.List<AddressRequestCompound>,

    @Json(name = "a_objPhone")
    val aObjPhone: kotlin.collections.List<PhoneRequestCompound>,

    @Json(name = "a_objEmail")
    val aObjEmail: kotlin.collections.List<EmailRequestCompound>,

    @Json(name = "a_objWebsite")
    val aObjWebsite: kotlin.collections.List<WebsiteRequestCompound>

) {


}

