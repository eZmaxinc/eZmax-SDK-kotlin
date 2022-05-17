/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
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
 * Request for POST /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions
 *
 * @param eGet Specify if you want to retrieve *All* words or specific *Words* from the document. If you specify *Words*, you must send the list of words to search for in *a_sWord*.
 * @param bWordCaseSensitive IF *true*, words will be searched case-sensitive and results will be returned case-sensitive. IF *false*, words will be searched case-insensitive and results will be returned case-insensitive.
 * @param aSWord Array of words to find in the document
 */

data class EzsigndocumentMinusGetWordsPositionsMinusV1MinusRequest (

    /* Specify if you want to retrieve *All* words or specific *Words* from the document. If you specify *Words*, you must send the list of words to search for in *a_sWord*. */
    @Json(name = "eGet")
    val eGet: EzsigndocumentMinusGetWordsPositionsMinusV1MinusRequest.EGet,

    /* IF *true*, words will be searched case-sensitive and results will be returned case-sensitive. IF *false*, words will be searched case-insensitive and results will be returned case-insensitive. */
    @Json(name = "bWordCaseSensitive")
    val bWordCaseSensitive: kotlin.Boolean,

    /* Array of words to find in the document */
    @Json(name = "a_sWord")
    val aSWord: kotlin.collections.List<kotlin.String>? = null

) {

    /**
     * Specify if you want to retrieve *All* words or specific *Words* from the document. If you specify *Words*, you must send the list of words to search for in *a_sWord*.
     *
     * Values: All,Words
     */
    enum class EGet(val value: kotlin.String) {
        @Json(name = "All") All("All"),
        @Json(name = "Words") Words("Words");
    }
}

