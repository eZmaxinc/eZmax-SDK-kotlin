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
 * A Ezsignbulksend Object
 *
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sEzsignbulksendDescription The description of the Ezsignbulksend
 * @param tEzsignbulksendNote Note about the Ezsignbulksend
 * @param bEzsignbulksendNeedvalidation Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation
 * @param bEzsignbulksendIsactive Whether the Ezsignbulksend is active or not
 * @param pkiEzsignbulksendID The unique ID of the Ezsignbulksend
 */


data class EzsignbulksendMinusRequest (

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    /* The description of the Ezsignbulksend */
    @Json(name = "sEzsignbulksendDescription")
    val sEzsignbulksendDescription: kotlin.String,

    /* Note about the Ezsignbulksend */
    @Json(name = "tEzsignbulksendNote")
    val tEzsignbulksendNote: kotlin.String,

    /* Whether the Ezsigntemplatepackage was automatically modified and needs a manual validation */
    @Json(name = "bEzsignbulksendNeedvalidation")
    val bEzsignbulksendNeedvalidation: kotlin.Boolean,

    /* Whether the Ezsignbulksend is active or not */
    @Json(name = "bEzsignbulksendIsactive")
    val bEzsignbulksendIsactive: kotlin.Boolean,

    /* The unique ID of the Ezsignbulksend */
    @Json(name = "pkiEzsignbulksendID")
    val pkiEzsignbulksendID: kotlin.Int? = null

)

