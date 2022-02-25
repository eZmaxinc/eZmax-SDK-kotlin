/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
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
 * An Ezsigndocument Object
 *
 * @param eEzsigndocumentSource Indicates where to look for the document binary content.
 * @param eEzsigndocumentFormat Indicates the format of the document.
 * @param fkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param dtEzsigndocumentDuedate The maximum date and time at which the Ezsigndocument can be signed.
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sEzsigndocumentName The name of the document that will be presented to Ezsignfoldersignerassociations
 * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument
 * @param sEzsigndocumentBase64 The Base64 encoded binary content of the document.  This field is Required when eEzsigndocumentSource = Base64.
 * @param sEzsigndocumentUrl The url where the document content resides.  This field is Required when eEzsigndocumentSource = Url.
 * @param bEzsigndocumentForcerepair Try to repair the document or flatten it if it cannot be used for electronic signature. 
 * @param sEzsigndocumentPassword If the source document is password protected, the password to open/modify it.
 */

data class EzsigndocumentMinusRequest (

    /* Indicates where to look for the document binary content. */
    @Json(name = "eEzsigndocumentSource")
    val eEzsigndocumentSource: EzsigndocumentMinusRequest.EEzsigndocumentSource,

    /* Indicates the format of the document. */
    @Json(name = "eEzsigndocumentFormat")
    val eEzsigndocumentFormat: EzsigndocumentMinusRequest.EEzsigndocumentFormat,

    /* The unique ID of the Ezsignfolder */
    @Json(name = "fkiEzsignfolderID")
    val fkiEzsignfolderID: kotlin.Int,

    /* The maximum date and time at which the Ezsigndocument can be signed. */
    @Json(name = "dtEzsigndocumentDuedate")
    val dtEzsigndocumentDuedate: kotlin.String,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    /* The name of the document that will be presented to Ezsignfoldersignerassociations */
    @Json(name = "sEzsigndocumentName")
    val sEzsigndocumentName: kotlin.String,

    /* The unique ID of the Ezsigndocument */
    @Json(name = "pkiEzsigndocumentID")
    val pkiEzsigndocumentID: kotlin.Int? = null,

    /* The Base64 encoded binary content of the document.  This field is Required when eEzsigndocumentSource = Base64. */
    @Json(name = "sEzsigndocumentBase64")
    val sEzsigndocumentBase64: kotlin.ByteArray? = null,

    /* The url where the document content resides.  This field is Required when eEzsigndocumentSource = Url. */
    @Json(name = "sEzsigndocumentUrl")
    val sEzsigndocumentUrl: kotlin.String? = null,

    /* Try to repair the document or flatten it if it cannot be used for electronic signature.  */
    @Json(name = "bEzsigndocumentForcerepair")
    val bEzsigndocumentForcerepair: kotlin.Boolean? = true,

    /* If the source document is password protected, the password to open/modify it. */
    @Json(name = "sEzsigndocumentPassword")
    val sEzsigndocumentPassword: kotlin.String? = ""

) {

    /**
     * Indicates where to look for the document binary content.
     *
     * Values: Base64,Url
     */
    enum class EEzsigndocumentSource(val value: kotlin.String) {
        @Json(name = "Base64") Base64("Base64"),
        @Json(name = "Url") Url("Url");
    }
    /**
     * Indicates the format of the document.
     *
     * Values: Pdf
     */
    enum class EEzsigndocumentFormat(val value: kotlin.String) {
        @Json(name = "Pdf") Pdf("Pdf");
    }
}

