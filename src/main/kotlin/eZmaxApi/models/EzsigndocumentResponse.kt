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

import eZmaxApi.models.CommonAudit
import eZmaxApi.models.FieldEEzsigndocumentStep

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An Ezsigndocument Object
 *
 * @param pkiEzsigndocumentID The unique ID of the Ezsigndocument
 * @param fkiEzsignfolderID The unique ID of the Ezsignfolder
 * @param dtEzsigndocumentDuedate The maximum date and time at which the Ezsigndocument can be signed.
 * @param sEzsigndocumentName The name of the document that will be presented to Ezsignfoldersignerassociations
 * @param eEzsigndocumentStep 
 * @param iEzsigndocumentOrder The order in which the Ezsigndocument will be presented to the signatory in the Ezsignfolder.
 * @param iEzsigndocumentPagetotal The number of pages in the Ezsigndocument.
 * @param iEzsigndocumentSignaturesigned The number of signatures that were signed in the document.
 * @param iEzsigndocumentSignaturetotal The number of total signatures that were requested in the Ezsigndocument.
 * @param fkiEzsignfoldersignerassociationIDDeclinedtosign The unique ID of the Ezsignfoldersignerassociation
 * @param dtEzsignformCompleted The date and time at which the Ezsignform has been completed.
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param dtEzsigndocumentFirstsend The date and time when the Ezsigndocument was first sent.
 * @param dtEzsigndocumentLastsend The date and time when the Ezsigndocument was sent the last time.
 * @param sEzsigndocumentMD5initial MD5 Hash of the initial PDF Document before signatures were applied to it.
 * @param tEzsigndocumentDeclinedtosignreason A custom text message that will contain the refusal message if the Ezsigndocument is declined to sign
 * @param sEzsigndocumentMD5signed MD5 Hash of the final PDF Document after all signatures were applied to it.
 * @param bEzsigndocumentEzsignform If the Ezsigndocument contains an Ezsignform or not
 * @param bEzsigndocumentHassignedsignatures If the Ezsigndocument contains signed signatures (From internal or external sources)
 * @param objAudit 
 * @param sEzsigndocumentExternalid This field can be used to store an External ID from the client's system.  Anything can be stored in this field, it will never be evaluated by the eZmax system and will be returned AS-IS.  To store multiple values, consider using a JSON formatted structure, a URL encoded string, a CSV or any other custom format. 
 */


data class EzsigndocumentResponse (

    /* The unique ID of the Ezsigndocument */
    @Json(name = "pkiEzsigndocumentID")
    val pkiEzsigndocumentID: kotlin.Int,

    /* The unique ID of the Ezsignfolder */
    @Json(name = "fkiEzsignfolderID")
    val fkiEzsignfolderID: kotlin.Int,

    /* The maximum date and time at which the Ezsigndocument can be signed. */
    @Json(name = "dtEzsigndocumentDuedate")
    val dtEzsigndocumentDuedate: kotlin.String,

    /* The name of the document that will be presented to Ezsignfoldersignerassociations */
    @Json(name = "sEzsigndocumentName")
    val sEzsigndocumentName: kotlin.String,

    @Json(name = "eEzsigndocumentStep")
    val eEzsigndocumentStep: FieldEEzsigndocumentStep,

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

    /* The unique ID of the Ezsignfoldersignerassociation */
    @Json(name = "fkiEzsignfoldersignerassociationIDDeclinedtosign")
    val fkiEzsignfoldersignerassociationIDDeclinedtosign: kotlin.Int? = null,

    /* The date and time at which the Ezsignform has been completed. */
    @Json(name = "dtEzsignformCompleted")
    val dtEzsignformCompleted: kotlin.String? = null,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int? = null,

    /* The date and time when the Ezsigndocument was first sent. */
    @Json(name = "dtEzsigndocumentFirstsend")
    val dtEzsigndocumentFirstsend: kotlin.String? = null,

    /* The date and time when the Ezsigndocument was sent the last time. */
    @Json(name = "dtEzsigndocumentLastsend")
    val dtEzsigndocumentLastsend: kotlin.String? = null,

    /* MD5 Hash of the initial PDF Document before signatures were applied to it. */
    @Json(name = "sEzsigndocumentMD5initial")
    val sEzsigndocumentMD5initial: kotlin.String? = null,

    /* A custom text message that will contain the refusal message if the Ezsigndocument is declined to sign */
    @Json(name = "tEzsigndocumentDeclinedtosignreason")
    val tEzsigndocumentDeclinedtosignreason: kotlin.String? = null,

    /* MD5 Hash of the final PDF Document after all signatures were applied to it. */
    @Json(name = "sEzsigndocumentMD5signed")
    val sEzsigndocumentMD5signed: kotlin.String? = null,

    /* If the Ezsigndocument contains an Ezsignform or not */
    @Json(name = "bEzsigndocumentEzsignform")
    val bEzsigndocumentEzsignform: kotlin.Boolean? = null,

    /* If the Ezsigndocument contains signed signatures (From internal or external sources) */
    @Json(name = "bEzsigndocumentHassignedsignatures")
    val bEzsigndocumentHassignedsignatures: kotlin.Boolean? = null,

    @Json(name = "objAudit")
    val objAudit: CommonAudit? = null,

    /* This field can be used to store an External ID from the client's system.  Anything can be stored in this field, it will never be evaluated by the eZmax system and will be returned AS-IS.  To store multiple values, consider using a JSON formatted structure, a URL encoded string, a CSV or any other custom format.  */
    @Json(name = "sEzsigndocumentExternalid")
    val sEzsigndocumentExternalid: kotlin.String? = null

)

