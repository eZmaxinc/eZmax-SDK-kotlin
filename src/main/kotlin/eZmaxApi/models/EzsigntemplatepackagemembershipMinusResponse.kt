/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.8
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


import com.squareup.moshi.Json

/**
 * A Ezsigntemplatepackagemembership Object
 *
 * @param pkiEzsigntemplatepackagemembershipID The unique ID of the Ezsigntemplatepackagemembership
 * @param fkiEzsigntemplatepackageID The unique ID of the Ezsigntemplatepackage
 * @param fkiEzsigntemplateID The unique ID of the Ezsigntemplate
 * @param iEzsigntemplatepackagemembershipOrder The order in which the Ezsigntemplate will be imported when using an Ezsigntemplatepackage.
 */

data class EzsigntemplatepackagemembershipMinusResponse (

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
    val iEzsigntemplatepackagemembershipOrder: kotlin.Int

)

