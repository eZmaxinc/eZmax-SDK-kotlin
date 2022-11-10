/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.16
 * Contact: support-api@ezmax.ca
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.models

import eZmaxApi.models.AddressMinusRequestCompound
import eZmaxApi.models.EmailMinusRequestCompound
import eZmaxApi.models.PhoneMinusRequestCompound
import eZmaxApi.models.WebsiteMinusRequestCompound

import com.squareup.moshi.Json

/**
 * 
 *
 * @param aObjAddress 
 * @param aObjPhone 
 * @param aObjEmail 
 * @param aObjWebsite 
 */

data class ContactinformationsRequestCompoundAllOf (

    @Json(name = "a_objAddress")
    val aObjAddress: kotlin.collections.List<AddressMinusRequestCompound>,

    @Json(name = "a_objPhone")
    val aObjPhone: kotlin.collections.List<PhoneMinusRequestCompound>,

    @Json(name = "a_objEmail")
    val aObjEmail: kotlin.collections.List<EmailMinusRequestCompound>,

    @Json(name = "a_objWebsite")
    val aObjWebsite: kotlin.collections.List<WebsiteMinusRequestCompound>

)

