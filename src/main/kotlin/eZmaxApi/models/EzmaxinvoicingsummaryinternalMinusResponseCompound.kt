/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
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

import eZmaxApi.models.EzmaxinvoicingsummaryinternalMinusResponse
import eZmaxApi.models.EzmaxinvoicingsummaryinternalResponseCompoundAllOf
import eZmaxApi.models.EzmaxinvoicingsummaryinternaldetailMinusResponseCompound
import eZmaxApi.models.MultilingualMinusEzmaxinvoicingsummaryinternalDescription

import com.squareup.moshi.Json

/**
 * A Ezmaxinvoicingsummaryinternal Object
 *
 * @param objEzmaxinvoicingsummaryinternalDescription 
 * @param sEzmaxinvoicingsummaryinternalDescriptionX The Ezmaxinvoicingsummaryinternal description in the language of the requester
 * @param fkiBillingentityinternalID The unique ID of the Billingentityinternal.
 * @param sBillingentityinternalDescriptionX The description of the Billingentityinternal in the language of the requester
 * @param aObjEzmaxinvoicingsummaryinternaldetail 
 * @param pkiEzmaxinvoicingsummaryinternalID The unique ID of the Ezmaxinvoicingsummaryinternal
 * @param fkiEzmaxinvoicingID The unique ID of the Ezmaxinvoicing
 */

data class EzmaxinvoicingsummaryinternalMinusResponseCompound (

    @Json(name = "objEzmaxinvoicingsummaryinternalDescription")
    val objEzmaxinvoicingsummaryinternalDescription: MultilingualMinusEzmaxinvoicingsummaryinternalDescription,

    /* The Ezmaxinvoicingsummaryinternal description in the language of the requester */
    @Json(name = "sEzmaxinvoicingsummaryinternalDescriptionX")
    val sEzmaxinvoicingsummaryinternalDescriptionX: kotlin.String,

    /* The unique ID of the Billingentityinternal. */
    @Json(name = "fkiBillingentityinternalID")
    val fkiBillingentityinternalID: kotlin.Int,

    /* The description of the Billingentityinternal in the language of the requester */
    @Json(name = "sBillingentityinternalDescriptionX")
    val sBillingentityinternalDescriptionX: kotlin.String,

    /*  */
    @Json(name = "a_objEzmaxinvoicingsummaryinternaldetail")
    val aObjEzmaxinvoicingsummaryinternaldetail: kotlin.collections.List<EzmaxinvoicingsummaryinternaldetailMinusResponseCompound>,

    /* The unique ID of the Ezmaxinvoicingsummaryinternal */
    @Json(name = "pkiEzmaxinvoicingsummaryinternalID")
    val pkiEzmaxinvoicingsummaryinternalID: kotlin.Int? = null,

    /* The unique ID of the Ezmaxinvoicing */
    @Json(name = "fkiEzmaxinvoicingID")
    val fkiEzmaxinvoicingID: kotlin.Int? = null

)

