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
import eZmaxApi.models.CustomEzsignfoldertypeTemplateResponse
import eZmaxApi.models.EzsigntemplatedocumentResponse
import eZmaxApi.models.EzsigntemplatesignerResponseCompound
import eZmaxApi.models.FieldEEzsigntemplateRecognition
import eZmaxApi.models.FieldEEzsigntemplateType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsigntemplate Object
 *
 * @param pkiEzsigntemplateID The unique ID of the Ezsigntemplate
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sLanguageNameX The Name of the Language in the language of the requester
 * @param sEzsigntemplateDescription The description of the Ezsigntemplate
 * @param bEzsigntemplateAdminonly Whether the Ezsigntemplate can be accessed by admin users only (eUserType=Normal)
 * @param objAudit 
 * @param bEzsigntemplateEditallowed Whether the Ezsigntemplate if allowed to edit or not
 * @param aObjEzsigntemplatesigner 
 * @param fkiEzsigntemplatedocumentID The unique ID of the Ezsigntemplatedocument
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param objEzsignfoldertype 
 * @param fkiEzdoctemplatedocumentID The unique ID of the Ezdoctemplatedocument
 * @param sEzdoctemplatedocumentNameX The name of the Ezdoctemplatedocument in the language of the requester
 * @param sEzsigntemplateExternaldescription The external description of the Ezsigntemplate
 * @param tEzsigntemplateComment The comment of the Ezsigntemplate
 * @param eEzsigntemplateRecognition 
 * @param sEzsigntemplateFilenameregexp The filename regexp of the Ezsigntemplate.
 * @param sEzsignfoldertypeNameX The name of the Ezsignfoldertype in the language of the requester
 * @param eEzsigntemplateType 
 * @param objEzsigntemplatedocument 
 */


data class EzsigntemplateResponseCompoundV3 (

    /* The unique ID of the Ezsigntemplate */
    @Json(name = "pkiEzsigntemplateID")
    val pkiEzsigntemplateID: kotlin.Int,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    /* The Name of the Language in the language of the requester */
    @Json(name = "sLanguageNameX")
    val sLanguageNameX: kotlin.String,

    /* The description of the Ezsigntemplate */
    @Json(name = "sEzsigntemplateDescription")
    val sEzsigntemplateDescription: kotlin.String,

    /* Whether the Ezsigntemplate can be accessed by admin users only (eUserType=Normal) */
    @Json(name = "bEzsigntemplateAdminonly")
    val bEzsigntemplateAdminonly: kotlin.Boolean,

    @Json(name = "objAudit")
    val objAudit: CommonAudit,

    /* Whether the Ezsigntemplate if allowed to edit or not */
    @Json(name = "bEzsigntemplateEditallowed")
    val bEzsigntemplateEditallowed: kotlin.Boolean,

    @Json(name = "a_objEzsigntemplatesigner")
    val aObjEzsigntemplatesigner: kotlin.collections.List<EzsigntemplatesignerResponseCompound>,

    /* The unique ID of the Ezsigntemplatedocument */
    @Json(name = "fkiEzsigntemplatedocumentID")
    val fkiEzsigntemplatedocumentID: kotlin.Int? = null,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int? = null,

    @Json(name = "objEzsignfoldertype")
    val objEzsignfoldertype: CustomEzsignfoldertypeTemplateResponse? = null,

    /* The unique ID of the Ezdoctemplatedocument */
    @Json(name = "fkiEzdoctemplatedocumentID")
    val fkiEzdoctemplatedocumentID: kotlin.Int? = null,

    /* The name of the Ezdoctemplatedocument in the language of the requester */
    @Json(name = "sEzdoctemplatedocumentNameX")
    val sEzdoctemplatedocumentNameX: kotlin.String? = null,

    /* The external description of the Ezsigntemplate */
    @Json(name = "sEzsigntemplateExternaldescription")
    val sEzsigntemplateExternaldescription: kotlin.String? = null,

    /* The comment of the Ezsigntemplate */
    @Json(name = "tEzsigntemplateComment")
    val tEzsigntemplateComment: kotlin.String? = null,

    @Json(name = "eEzsigntemplateRecognition")
    val eEzsigntemplateRecognition: FieldEEzsigntemplateRecognition? = FieldEEzsigntemplateRecognition.No,

    /* The filename regexp of the Ezsigntemplate. */
    @Json(name = "sEzsigntemplateFilenameregexp")
    val sEzsigntemplateFilenameregexp: kotlin.String? = null,

    /* The name of the Ezsignfoldertype in the language of the requester */
    @Json(name = "sEzsignfoldertypeNameX")
    val sEzsignfoldertypeNameX: kotlin.String? = null,

    @Json(name = "eEzsigntemplateType")
    val eEzsigntemplateType: FieldEEzsigntemplateType? = null,

    @Json(name = "objEzsigntemplatedocument")
    val objEzsigntemplatedocument: EzsigntemplatedocumentResponse? = null

) {


}

