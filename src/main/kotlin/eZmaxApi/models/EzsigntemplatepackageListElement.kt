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
 * An Ezsigntemplatepackage List Element
 *
 * @param pkiEzsigntemplatepackageID The unique ID of the Ezsigntemplatepackage
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sEzsigntemplatepackageDescription The description of the Ezsigntemplatepackage
 * @param bEzsigntemplatepackageNeedvalidation Whether the Ezsignbulksend was automatically modified and needs a manual validation
 * @param iEzsigntemplatepackagemembership The total number of Ezsigntemplatepackagemembership in the Ezsigntemplatepackage
 * @param sEzsignfoldertypeNameX The name of the Ezsignfoldertype in the language of the requester
 * @param bEzsigntemplatepackageIsactive Whether the Ezsigntemplatepackage is active or not
 */


data class EzsigntemplatepackageListElement (

    /* The unique ID of the Ezsigntemplatepackage */
    @Json(name = "pkiEzsigntemplatepackageID")
    val pkiEzsigntemplatepackageID: kotlin.Int,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    /* The description of the Ezsigntemplatepackage */
    @Json(name = "sEzsigntemplatepackageDescription")
    val sEzsigntemplatepackageDescription: kotlin.String,

    /* Whether the Ezsignbulksend was automatically modified and needs a manual validation */
    @Json(name = "bEzsigntemplatepackageNeedvalidation")
    val bEzsigntemplatepackageNeedvalidation: kotlin.Boolean,

    /* The total number of Ezsigntemplatepackagemembership in the Ezsigntemplatepackage */
    @Json(name = "iEzsigntemplatepackagemembership")
    val iEzsigntemplatepackagemembership: kotlin.Int,

    /* The name of the Ezsignfoldertype in the language of the requester */
    @Json(name = "sEzsignfoldertypeNameX")
    val sEzsignfoldertypeNameX: kotlin.String,

    /* Whether the Ezsigntemplatepackage is active or not */
    @Json(name = "bEzsigntemplatepackageIsactive")
    val bEzsigntemplatepackageIsactive: kotlin.Boolean

)

