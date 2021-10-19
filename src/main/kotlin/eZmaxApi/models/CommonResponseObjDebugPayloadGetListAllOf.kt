/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.0
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

import eZmaxApi.models.CommonMinusResponseMinusFilter

import com.squareup.moshi.Json

/**
 * 
 *
 * @param aFilter 
 * @param aOrderBy List of available values for *eOrderBy*
 */

data class CommonResponseObjDebugPayloadGetListAllOf (

    @Json(name = "a_Filter")
    val aFilter: CommonMinusResponseMinusFilter,

    /* List of available values for *eOrderBy* */
    @Json(name = "a_OrderBy")
    val aOrderBy: kotlin.collections.Map<kotlin.String, kotlin.String>

)
