/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.0.47
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

import eZmaxApi.models.CommonMinusAudit
import eZmaxApi.models.FieldMinusEEzsigndocumentStep

import com.squareup.moshi.Json

/**
 * 
 *
 * @param fkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param dtEzsigndocumentDuedate The maximum date and time at which the document can be signed.
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sEzsigndocumentName The name of the document that will be presented to Ezsignfoldersignerassociations
 * @param pkiEzsigndocumentID The unique ID of the Ezsigntemplate
 * @param eEzsigndocumentStep 
 * @param dtEzsigndocumentFirstsend The date and time when the Ezsigndocument was first sent.
 * @param dtEzsigndocumentLastsend The date and time when the Ezsigndocument was sent the last time.
 * @param iEzsigndocumentOrder The order in which the Ezsigndocument will be presented to the signatory in the Ezsignfolder.
 * @param iEzsigndocumentPagetotal The number of pages in the Ezsigndocument.
 * @param iEzsigndocumentSignaturesigned The number of signatures that were signed in the document.
 * @param iEzsigndocumentSignaturetotal The number of total signatures that were requested in the Ezsigndocument.
 * @param sEzsigndocumentMD5initial MD5 Hash of the initial PDF Document before signatures were applied to it.
 * @param sEzsigndocumentMD5signed MD5 Hash of the final PDF Document after all signatures were applied to it.
 * @param objAudit 
 */

data class EzsigndocumentResponseAllOf (

    /* The unique ID of the Ezsignfolder */
    @Json(name = "fkiEzsignfolderID")
    val fkiEzsignfolderID: kotlin.Int,

    /* The maximum date and time at which the document can be signed. */
    @Json(name = "dtEzsigndocumentDuedate")
    val dtEzsigndocumentDuedate: kotlin.String,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    /* The name of the document that will be presented to Ezsignfoldersignerassociations */
    @Json(name = "sEzsigndocumentName")
    val sEzsigndocumentName: kotlin.String,

    /* The unique ID of the Ezsigntemplate */
    @Json(name = "pkiEzsigndocumentID")
    val pkiEzsigndocumentID: kotlin.Int,

    @Json(name = "eEzsigndocumentStep")
    val eEzsigndocumentStep: FieldMinusEEzsigndocumentStep,

    /* The date and time when the Ezsigndocument was first sent. */
    @Json(name = "dtEzsigndocumentFirstsend")
    val dtEzsigndocumentFirstsend: kotlin.String,

    /* The date and time when the Ezsigndocument was sent the last time. */
    @Json(name = "dtEzsigndocumentLastsend")
    val dtEzsigndocumentLastsend: kotlin.String,

    /* The order in which the Ezsigndocument will be presented to the signatory in the Ezsignfolder. */
    @Json(name = "iEzsigndocumentOrder")
    val iEzsigndocumentOrder: kotlin.Int,

    /* The number of pages in the Ezsigndocument. */
    @Json(name = "iEzsigndocumentPagetotal")
    val iEzsigndocumentPagetotal: kotlin.Int,

    /* The number of signatures that were signed in the document. */
    @Json(name = "iEzsigndocumentSignaturesigned")
    val iEzsigndocumentSignaturesigned: kotlin.Int,

    /* The number of total signatures that were requested in the Ezsigndocument. */
    @Json(name = "iEzsigndocumentSignaturetotal")
    val iEzsigndocumentSignaturetotal: kotlin.Int,

    /* MD5 Hash of the initial PDF Document before signatures were applied to it. */
    @Json(name = "sEzsigndocumentMD5initial")
    val sEzsigndocumentMD5initial: kotlin.String,

    /* MD5 Hash of the final PDF Document after all signatures were applied to it. */
    @Json(name = "sEzsigndocumentMD5signed")
    val sEzsigndocumentMD5signed: kotlin.String,

    @Json(name = "objAudit")
    val objAudit: CommonMinusAudit

)

