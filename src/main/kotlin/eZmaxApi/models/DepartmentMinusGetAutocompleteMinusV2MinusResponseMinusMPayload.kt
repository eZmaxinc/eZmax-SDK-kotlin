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

import eZmaxApi.models.DepartmentMinusAutocompleteElementMinusResponse

import com.squareup.moshi.Json

/**
 * Payload for POST /2/object/department/getAutocomplete
 *
 * @param aObjDepartment An array of Department autocomplete element response.
 */

data class DepartmentMinusGetAutocompleteMinusV2MinusResponseMinusMPayload (

    /* An array of Department autocomplete element response. */
    @Json(name = "a_objDepartment")
    val aObjDepartment: kotlin.collections.List<DepartmentMinusAutocompleteElementMinusResponse>

)
