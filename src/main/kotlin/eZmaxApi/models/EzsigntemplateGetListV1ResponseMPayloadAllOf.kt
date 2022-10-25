/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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

import eZmaxApi.models.EzsigntemplateMinusListElement

import com.squareup.moshi.Json

/**
 * 
 *
 * @param aObjEzsigntemplate 
 */

data class EzsigntemplateGetListV1ResponseMPayloadAllOf (

    @Json(name = "a_objEzsigntemplate")
    val aObjEzsigntemplate: kotlin.collections.List<EzsigntemplateMinusListElement>

)
