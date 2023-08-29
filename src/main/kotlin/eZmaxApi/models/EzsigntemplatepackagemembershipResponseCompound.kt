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

import eZmaxApi.models.EzsigntemplateResponseCompound
import eZmaxApi.models.EzsigntemplatepackagesignermembershipResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsigntemplatepackagemembership Object
 *
 * @param pkiEzsigntemplatepackagemembershipID The unique ID of the Ezsigntemplatepackagemembership
 * @param fkiEzsigntemplatepackageID The unique ID of the Ezsigntemplatepackage
 * @param fkiEzsigntemplateID The unique ID of the Ezsigntemplate
 * @param iEzsigntemplatepackagemembershipOrder The order in which the Ezsigntemplate will be imported when using an Ezsigntemplatepackage.
 * @param objEzsigntemplate 
 * @param aObjEzsigntemplatepackagesignermembership 
 */


data class EzsigntemplatepackagemembershipResponseCompound (

    /* The unique ID of the Ezsigntemplatepackagemembership */
    @Json(name = "pkiEzsigntemplatepackagemembershipID")
    val pkiEzsigntemplatepackagemembershipID: kotlin.Int,

    /* The unique ID of the Ezsigntemplatepackage */
    @Json(name = "fkiEzsigntemplatepackageID")
    val fkiEzsigntemplatepackageID: kotlin.Int,

    /* The unique ID of the Ezsigntemplate */
    @Json(name = "fkiEzsigntemplateID")
    val fkiEzsigntemplateID: kotlin.Int,

    /* The order in which the Ezsigntemplate will be imported when using an Ezsigntemplatepackage. */
    @Json(name = "iEzsigntemplatepackagemembershipOrder")
    val iEzsigntemplatepackagemembershipOrder: kotlin.Int,

    @Json(name = "objEzsigntemplate")
    val objEzsigntemplate: EzsigntemplateResponseCompound,

    @Json(name = "a_objEzsigntemplatepackagesignermembership")
    val aObjEzsigntemplatepackagesignermembership: kotlin.collections.List<EzsigntemplatepackagesignermembershipResponseCompound>

)

