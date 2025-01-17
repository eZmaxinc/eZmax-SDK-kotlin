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

import eZmaxApi.models.EzsigntemplatepackagesignerRequest
import eZmaxApi.models.FieldEEzsigntemplatepackagesignerMapping

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsigntemplatepackagesigner Object and children
 *
 * @param fkiEzsigntemplatepackageID The unique ID of the Ezsigntemplatepackage
 * @param sEzsigntemplatepackagesignerDescription The description of the Ezsigntemplatepackagesigner
 * @param pkiEzsigntemplatepackagesignerID The unique ID of the Ezsigntemplatepackagesigner
 * @param fkiEzdoctemplatedocumentID The unique ID of the Ezdoctemplatedocument
 * @param fkiUserID The unique ID of the User
 * @param fkiUsergroupID The unique ID of the Usergroup
 * @param bEzsigntemplatepackagesignerReceivecopy If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document.
 * @param eEzsigntemplatepackagesignerMapping 
 */


class EzsigntemplatepackagesignerRequestCompound (

    /* The unique ID of the Ezsigntemplatepackage */
    @Json(name = "fkiEzsigntemplatepackageID")
    override val fkiEzsigntemplatepackageID: kotlin.Int,

    /* The description of the Ezsigntemplatepackagesigner */
    @Json(name = "sEzsigntemplatepackagesignerDescription")
    override val sEzsigntemplatepackagesignerDescription: kotlin.String,

    /* The unique ID of the Ezsigntemplatepackagesigner */
    @Json(name = "pkiEzsigntemplatepackagesignerID")
    override val pkiEzsigntemplatepackagesignerID: kotlin.Int? = null,

    /* The unique ID of the Ezdoctemplatedocument */
    @Json(name = "fkiEzdoctemplatedocumentID")
    override val fkiEzdoctemplatedocumentID: kotlin.Int? = null,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    override val fkiUserID: kotlin.Int? = null,

    /* The unique ID of the Usergroup */
    @Json(name = "fkiUsergroupID")
    override val fkiUsergroupID: kotlin.Int? = null,

    /* If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain't required to sign the document. */
    @Json(name = "bEzsigntemplatepackagesignerReceivecopy")
    override val bEzsigntemplatepackagesignerReceivecopy: kotlin.Boolean? = null,

    @Json(name = "eEzsigntemplatepackagesignerMapping")
    override val eEzsigntemplatepackagesignerMapping: FieldEEzsigntemplatepackagesignerMapping? = FieldEEzsigntemplatepackagesignerMapping.Manual

) : EzsigntemplatepackagesignerRequest {


}

