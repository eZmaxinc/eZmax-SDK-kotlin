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

import eZmaxApi.models.EzsigntemplatepackagesignerResponse
import eZmaxApi.models.FieldEEzsigntemplatepackagesignerMapping

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsigntemplatepackagesigner Object
 *
 * @param pkiEzsigntemplatepackagesignerID The unique ID of the Ezsigntemplatepackagesigner
 * @param fkiEzsigntemplatepackageID The unique ID of the Ezsigntemplatepackage
 * @param sEzsigntemplatepackagesignerDescription The description of the Ezsigntemplatepackagesigner
 * @param fkiEzdoctemplatedocumentID The unique ID of the Ezdoctemplatedocument
 * @param fkiUserID The unique ID of the User
 * @param fkiUsergroupID The unique ID of the Usergroup
 * @param sEzdoctemplatedocumentNameX The name of the Ezdoctemplatedocument in the language of the requester
 * @param bEzsigntemplatepackagesignerReceivecopy If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document.
 * @param eEzsigntemplatepackagesignerMapping 
 * @param sUserName The description of the User in the language of the requester
 * @param sUsergroupNameX The Name of the Usergroup in the language of the requester
 */


class EzsigntemplatepackagesignerResponseCompound (

    /* The unique ID of the Ezsigntemplatepackagesigner */
    @Json(name = "pkiEzsigntemplatepackagesignerID")
    override val pkiEzsigntemplatepackagesignerID: kotlin.Int,

    /* The unique ID of the Ezsigntemplatepackage */
    @Json(name = "fkiEzsigntemplatepackageID")
    override val fkiEzsigntemplatepackageID: kotlin.Int,

    /* The description of the Ezsigntemplatepackagesigner */
    @Json(name = "sEzsigntemplatepackagesignerDescription")
    override val sEzsigntemplatepackagesignerDescription: kotlin.String,

    /* The unique ID of the Ezdoctemplatedocument */
    @Json(name = "fkiEzdoctemplatedocumentID")
    override val fkiEzdoctemplatedocumentID: kotlin.Int? = null,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    override val fkiUserID: kotlin.Int? = null,

    /* The unique ID of the Usergroup */
    @Json(name = "fkiUsergroupID")
    override val fkiUsergroupID: kotlin.Int? = null,

    /* The name of the Ezdoctemplatedocument in the language of the requester */
    @Json(name = "sEzdoctemplatedocumentNameX")
    override val sEzdoctemplatedocumentNameX: kotlin.String? = null,

    /* If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document. */
    @Json(name = "bEzsigntemplatepackagesignerReceivecopy")
    override val bEzsigntemplatepackagesignerReceivecopy: kotlin.Boolean? = null,

    @Json(name = "eEzsigntemplatepackagesignerMapping")
    override val eEzsigntemplatepackagesignerMapping: FieldEEzsigntemplatepackagesignerMapping? = FieldEEzsigntemplatepackagesignerMapping.Manual,

    /* The description of the User in the language of the requester */
    @Json(name = "sUserName")
    override val sUserName: kotlin.String? = null,

    /* The Name of the Usergroup in the language of the requester */
    @Json(name = "sUsergroupNameX")
    override val sUsergroupNameX: kotlin.String? = null

) : EzsigntemplatepackagesignerResponse {


}

