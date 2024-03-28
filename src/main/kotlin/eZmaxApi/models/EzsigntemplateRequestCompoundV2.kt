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

import eZmaxApi.models.FieldEEzsigntemplateType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsigntemplate Object and children
 *
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sEzsigntemplateDescription The description of the Ezsigntemplate
 * @param bEzsigntemplateAdminonly Whether the Ezsigntemplate can be accessed by admin users only (eUserType=Normal)
 * @param eEzsigntemplateType 
 * @param pkiEzsigntemplateID The unique ID of the Ezsigntemplate
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param sEzsigntemplateFilenamepattern The filename pattern of the Ezsigntemplate
 */


data class EzsigntemplateRequestCompoundV2 (

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    /* The description of the Ezsigntemplate */
    @Json(name = "sEzsigntemplateDescription")
    val sEzsigntemplateDescription: kotlin.String,

    /* Whether the Ezsigntemplate can be accessed by admin users only (eUserType=Normal) */
    @Json(name = "bEzsigntemplateAdminonly")
    val bEzsigntemplateAdminonly: kotlin.Boolean,

    @Json(name = "eEzsigntemplateType")
    val eEzsigntemplateType: FieldEEzsigntemplateType,

    /* The unique ID of the Ezsigntemplate */
    @Json(name = "pkiEzsigntemplateID")
    val pkiEzsigntemplateID: kotlin.Int? = null,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int? = null,

    /* The filename pattern of the Ezsigntemplate */
    @Json(name = "sEzsigntemplateFilenamepattern")
    val sEzsigntemplateFilenamepattern: kotlin.String? = null

)

