/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
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


import com.squareup.moshi.Json

/**
 * 
 *
 * @param aFkiUserIDSigned 
 * @param aFkiUserIDSummary 
 */

data class EzsignfoldertypeRequestCompoundAllOf (

    @Json(name = "a_fkiUserIDSigned")
    val aFkiUserIDSigned: kotlin.collections.List<kotlin.Int>? = null,

    @Json(name = "a_fkiUserIDSummary")
    val aFkiUserIDSummary: kotlin.collections.List<kotlin.Int>? = null

)

