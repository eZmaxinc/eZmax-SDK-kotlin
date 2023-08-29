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

import eZmaxApi.models.FieldEVariableexpenseTaxable

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Variableexpense List Element
 *
 * @param pkiVariableexpenseID The unique ID of the Variableexpense
 * @param sVariableexpenseCode The code of the Variableexpense
 * @param sVariableexpenseDescriptionX The description of the Variableexpense in the language of the requester
 * @param eVariableexpenseTaxable 
 * @param bVariableexpenseIsactive Whether the variableexpense is active or not
 */


data class VariableexpenseListElement (

    /* The unique ID of the Variableexpense */
    @Json(name = "pkiVariableexpenseID")
    val pkiVariableexpenseID: kotlin.Int,

    /* The code of the Variableexpense */
    @Json(name = "sVariableexpenseCode")
    val sVariableexpenseCode: kotlin.String? = null,

    /* The description of the Variableexpense in the language of the requester */
    @Json(name = "sVariableexpenseDescriptionX")
    val sVariableexpenseDescriptionX: kotlin.String? = null,

    @Json(name = "eVariableexpenseTaxable")
    val eVariableexpenseTaxable: FieldEVariableexpenseTaxable? = null,

    /* Whether the variableexpense is active or not */
    @Json(name = "bVariableexpenseIsactive")
    val bVariableexpenseIsactive: kotlin.Boolean? = null

)

