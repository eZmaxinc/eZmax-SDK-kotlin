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

import eZmaxApi.models.CommonMinusReportrow

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A part in the Reportsubsection 
 *
 * @param eReportsubsectionpartType The type of the Reportsubsectionpart
 * @param aObjReportrow 
 */


data class CommonMinusReportsubsectionpart (

    /* The type of the Reportsubsectionpart */
    @Json(name = "eReportsubsectionpartType")
    val eReportsubsectionpartType: CommonMinusReportsubsectionpart.EReportsubsectionpartType,

    @Json(name = "a_objReportrow")
    val aObjReportrow: kotlin.collections.List<CommonMinusReportrow>

) {

    /**
     * The type of the Reportsubsectionpart
     *
     * Values: Header,Body,Footer
     */
    @JsonClass(generateAdapter = false)
    enum class EReportsubsectionpartType(val value: kotlin.String) {
        @Json(name = "Header") Header("Header"),
        @Json(name = "Body") Body("Body"),
        @Json(name = "Footer") Footer("Footer");
    }
}

