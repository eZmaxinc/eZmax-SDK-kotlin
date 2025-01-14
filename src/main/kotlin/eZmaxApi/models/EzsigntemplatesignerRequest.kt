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

import eZmaxApi.models.FieldEEzsigntemplatesignerMapping

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsigntemplatesigner Object
 *
 * @param fkiEzsigntemplateID The unique ID of the Ezsigntemplate
 * @param sEzsigntemplatesignerDescription The description of the Ezsigntemplatesigner
 * @param pkiEzsigntemplatesignerID The unique ID of the Ezsigntemplatesigner
 * @param fkiUserID The unique ID of the User
 * @param fkiUsergroupID The unique ID of the Usergroup
 * @param fkiEzdoctemplatedocumentID The unique ID of the Ezdoctemplatedocument
 * @param bEzsigntemplatesignerReceivecopy If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document.
 * @param eEzsigntemplatesignerMapping 
 */


data class EzsigntemplatesignerRequest (

    /* The unique ID of the Ezsigntemplate */
    @Json(name = "fkiEzsigntemplateID")
    val fkiEzsigntemplateID: kotlin.Int,

    /* The description of the Ezsigntemplatesigner */
    @Json(name = "sEzsigntemplatesignerDescription")
    val sEzsigntemplatesignerDescription: kotlin.String,

    /* The unique ID of the Ezsigntemplatesigner */
    @Json(name = "pkiEzsigntemplatesignerID")
    val pkiEzsigntemplatesignerID: kotlin.Int? = null,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int? = null,

    /* The unique ID of the Usergroup */
    @Json(name = "fkiUsergroupID")
    val fkiUsergroupID: kotlin.Int? = null,

    /* The unique ID of the Ezdoctemplatedocument */
    @Json(name = "fkiEzdoctemplatedocumentID")
    val fkiEzdoctemplatedocumentID: kotlin.Int? = null,

    /* If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document. */
    @Json(name = "bEzsigntemplatesignerReceivecopy")
    val bEzsigntemplatesignerReceivecopy: kotlin.Boolean? = null,

    @Json(name = "eEzsigntemplatesignerMapping")
    val eEzsigntemplatesignerMapping: FieldEEzsigntemplatesignerMapping? = null

) {


}

