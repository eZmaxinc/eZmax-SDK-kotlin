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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An Ezsignbulksend List Element
 *
 * @param pkiEzsignbulksendID The unique ID of the Ezsignbulksend
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param sEzsignbulksendDescription The description of the Ezsignbulksend
 * @param sEzsignfoldertypeNameX The name of the Ezsignfoldertype in the language of the requester
 * @param bEzsignbulksendNeedvalidation Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation
 * @param iEzsignbulksendtransmission The total number of Ezsignbulksendtransmissions in the Ezsignbulksend
 * @param iEzsignfolder The total number of Ezsignfolders in the Ezsignbulksend
 * @param iEzsigndocument The total number of Ezsigndocuments in the Ezsignbulksend
 * @param iEzsignsignature The total number of Ezsignsignature in the Ezsignbulksend
 * @param iEzsignsignatureSigned The total number of already signed Ezsignsignature blocks in the Ezsignbulksend
 * @param bEzsignbulksendIsactive Whether the Ezsignbulksend is active or not
 */


data class EzsignbulksendMinusListElement (

    /* The unique ID of the Ezsignbulksend */
    @Json(name = "pkiEzsignbulksendID")
    val pkiEzsignbulksendID: kotlin.Int,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int,

    /* The description of the Ezsignbulksend */
    @Json(name = "sEzsignbulksendDescription")
    val sEzsignbulksendDescription: kotlin.String,

    /* The name of the Ezsignfoldertype in the language of the requester */
    @Json(name = "sEzsignfoldertypeNameX")
    val sEzsignfoldertypeNameX: kotlin.String,

    /* Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation */
    @Json(name = "bEzsignbulksendNeedvalidation")
    val bEzsignbulksendNeedvalidation: kotlin.Boolean,

    /* The total number of Ezsignbulksendtransmissions in the Ezsignbulksend */
    @Json(name = "iEzsignbulksendtransmission")
    val iEzsignbulksendtransmission: kotlin.Int,

    /* The total number of Ezsignfolders in the Ezsignbulksend */
    @Json(name = "iEzsignfolder")
    val iEzsignfolder: kotlin.Int,

    /* The total number of Ezsigndocuments in the Ezsignbulksend */
    @Json(name = "iEzsigndocument")
    val iEzsigndocument: kotlin.Int,

    /* The total number of Ezsignsignature in the Ezsignbulksend */
    @Json(name = "iEzsignsignature")
    val iEzsignsignature: kotlin.Int,

    /* The total number of already signed Ezsignsignature blocks in the Ezsignbulksend */
    @Json(name = "iEzsignsignatureSigned")
    val iEzsignsignatureSigned: kotlin.Int,

    /* Whether the Ezsignbulksend is active or not */
    @Json(name = "bEzsignbulksendIsactive")
    val bEzsignbulksendIsactive: kotlin.Boolean

)

