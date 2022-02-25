/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
 * Contact: support-api@ezmax.ca
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.models

import eZmaxApi.models.FieldMinusEEzsigntemplatepackageType

import com.squareup.moshi.Json

/**
 * An Ezsigntemplatepackage List Element
 *
 * @param pkiEzsigntemplatepackageID The unique ID of the Ezsigntemplatepackage
 * @param fkiDepartmentID The unique ID of the Department.
 * @param fkiTeamID The unique ID of the Team
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param eEzsigntemplatepackageType 
 * @param sEzsigntemplatepackageDescription The description of the Ezsigntemplatepackage
 * @param bEzsigntemplatepackageIsactive Whether the Ezsigntemplatepackage is active or not
 * @param iEzsigntemplatepackagemembership The total number of Ezsigntemplatepackagemembership in the Ezsigntemplatepackage
 */

data class EzsigntemplatepackageMinusListElement (

    /* The unique ID of the Ezsigntemplatepackage */
    @Json(name = "pkiEzsigntemplatepackageID")
    val pkiEzsigntemplatepackageID: kotlin.Int,

    /* The unique ID of the Department. */
    @Json(name = "fkiDepartmentID")
    val fkiDepartmentID: kotlin.Int?,

    /* The unique ID of the Team */
    @Json(name = "fkiTeamID")
    val fkiTeamID: kotlin.Int?,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int?,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    @Json(name = "eEzsigntemplatepackageType")
    val eEzsigntemplatepackageType: FieldMinusEEzsigntemplatepackageType,

    /* The description of the Ezsigntemplatepackage */
    @Json(name = "sEzsigntemplatepackageDescription")
    val sEzsigntemplatepackageDescription: kotlin.String,

    /* Whether the Ezsigntemplatepackage is active or not */
    @Json(name = "bEzsigntemplatepackageIsactive")
    val bEzsigntemplatepackageIsactive: kotlin.Boolean,

    /* The total number of Ezsigntemplatepackagemembership in the Ezsigntemplatepackage */
    @Json(name = "iEzsigntemplatepackagemembership")
    val iEzsigntemplatepackagemembership: kotlin.Int

)

