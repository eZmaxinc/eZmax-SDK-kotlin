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

import eZmaxApi.models.EzsignannotationRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for PUT /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignannotations
 *
 * @param aObjEzsignannotation 
 */


data class EzsigndocumentEditEzsignannotationsV1Request (

    @Json(name = "a_objEzsignannotation")
    val aObjEzsignannotation: kotlin.collections.List<EzsignannotationRequestCompound>

) {


}

