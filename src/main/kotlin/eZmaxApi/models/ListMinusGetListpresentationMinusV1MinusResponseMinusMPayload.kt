/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
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

import eZmaxApi.models.ListpresentationMinusRequest

import com.squareup.moshi.Json

/**
 * Payload for the GET /1/module/list/listpresentation/{sListName} API Request
 *
 * @param aObjListpresentation 
 */

data class ListMinusGetListpresentationMinusV1MinusResponseMinusMPayload (

    @Json(name = "a_objListpresentation")
    val aObjListpresentation: kotlin.collections.List<ListpresentationMinusRequest>

)

