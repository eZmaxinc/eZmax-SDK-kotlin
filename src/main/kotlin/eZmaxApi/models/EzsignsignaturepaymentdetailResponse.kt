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

import eZmaxApi.models.FieldEEzsignsignaturepaymentdetailTaxable

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An Ezsignsignaturepaymentdetail Object
 *
 * @param pkiEzsignsignaturepaymentdetailID The unique ID of the Ezsignsignaturepaymentdetail
 * @param tEzsignsignaturepaymentdetailDescription A description for the Ezsignsignaturepaymentdetail.
 * @param dEzsignsignaturepaymentdetailAmount The amount of the for the Ezsignsignaturepaymentdetail
 * @param eEzsignsignaturepaymentdetailTaxable 
 * @param fkiGlaccountcontainerID The unique ID of the Glaccountcontainer
 */


data class EzsignsignaturepaymentdetailResponse (

    /* The unique ID of the Ezsignsignaturepaymentdetail */
    @Json(name = "pkiEzsignsignaturepaymentdetailID")
    val pkiEzsignsignaturepaymentdetailID: kotlin.Int,

    /* A description for the Ezsignsignaturepaymentdetail. */
    @Json(name = "tEzsignsignaturepaymentdetailDescription")
    val tEzsignsignaturepaymentdetailDescription: kotlin.String,

    /* The amount of the for the Ezsignsignaturepaymentdetail */
    @Json(name = "dEzsignsignaturepaymentdetailAmount")
    val dEzsignsignaturepaymentdetailAmount: kotlin.String,

    @Json(name = "eEzsignsignaturepaymentdetailTaxable")
    val eEzsignsignaturepaymentdetailTaxable: FieldEEzsignsignaturepaymentdetailTaxable,

    /* The unique ID of the Glaccountcontainer */
    @Json(name = "fkiGlaccountcontainerID")
    val fkiGlaccountcontainerID: kotlin.Int? = null

) {


}

