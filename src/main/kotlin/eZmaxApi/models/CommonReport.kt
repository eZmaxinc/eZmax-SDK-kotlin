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

import eZmaxApi.models.CommonReportsection

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Report containing Reportsections 
 *
 * @param aObjReportsection 
 */


data class CommonReport (

    @Json(name = "a_objReportsection")
    val aObjReportsection: kotlin.collections.List<CommonReportsection>

)
