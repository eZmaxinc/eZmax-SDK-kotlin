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
 * A Ezsigntemplatepackage Object
 *
 * @param pkiEzsigntemplatepackageID The unique ID of the Ezsigntemplatepackage
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sLanguageNameX The Name of the Language in the language of the requester
 * @param sEzsigntemplatepackageDescription The description of the Ezsigntemplatepackage
 * @param bEzsigntemplatepackageAdminonly Whether the Ezsigntemplatepackage can be accessed by admin users only (eUserType=Normal)
 * @param bEzsigntemplatepackageNeedvalidation Whether the Ezsignbulksend was automatically modified and needs a manual validation
 * @param bEzsigntemplatepackageIsactive Whether the Ezsigntemplatepackage is active or not
 * @param sEzsignfoldertypeNameX The name of the Ezsignfoldertype in the language of the requester
 * @param bEzsigntemplatepackageEditallowed Whether the Ezsigntemplatepackage if allowed to edit or not
 * @param fkiEzdoctemplatedocumentID The unique ID of the Ezdoctemplatedocument
 * @param sEzdoctemplatedocumentNameX The name of the Ezdoctemplatedocument in the language of the requester
 */


data class EzsigntemplatepackageResponse (

    /* The unique ID of the Ezsigntemplatepackage */
    @Json(name = "pkiEzsigntemplatepackageID")
    val pkiEzsigntemplatepackageID: kotlin.Int,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    /* The Name of the Language in the language of the requester */
    @Json(name = "sLanguageNameX")
    val sLanguageNameX: kotlin.String,

    /* The description of the Ezsigntemplatepackage */
    @Json(name = "sEzsigntemplatepackageDescription")
    val sEzsigntemplatepackageDescription: kotlin.String,

    /* Whether the Ezsigntemplatepackage can be accessed by admin users only (eUserType=Normal) */
    @Json(name = "bEzsigntemplatepackageAdminonly")
    val bEzsigntemplatepackageAdminonly: kotlin.Boolean,

    /* Whether the Ezsignbulksend was automatically modified and needs a manual validation */
    @Json(name = "bEzsigntemplatepackageNeedvalidation")
    val bEzsigntemplatepackageNeedvalidation: kotlin.Boolean,

    /* Whether the Ezsigntemplatepackage is active or not */
    @Json(name = "bEzsigntemplatepackageIsactive")
    val bEzsigntemplatepackageIsactive: kotlin.Boolean,

    /* The name of the Ezsignfoldertype in the language of the requester */
    @Json(name = "sEzsignfoldertypeNameX")
    val sEzsignfoldertypeNameX: kotlin.String,

    /* Whether the Ezsigntemplatepackage if allowed to edit or not */
    @Json(name = "bEzsigntemplatepackageEditallowed")
    val bEzsigntemplatepackageEditallowed: kotlin.Boolean,

    /* The unique ID of the Ezdoctemplatedocument */
    @Json(name = "fkiEzdoctemplatedocumentID")
    val fkiEzdoctemplatedocumentID: kotlin.Int? = null,

    /* The name of the Ezdoctemplatedocument in the language of the requester */
    @Json(name = "sEzdoctemplatedocumentNameX")
    val sEzdoctemplatedocumentNameX: kotlin.String? = null

) {


}

