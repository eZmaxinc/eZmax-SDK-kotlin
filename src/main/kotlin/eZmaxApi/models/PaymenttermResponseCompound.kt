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
import eZmaxApi.models.FieldEPaymenttermType
import eZmaxApi.models.MultilingualPaymenttermDescription
import eZmaxApi.models.PaymenttermResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Paymentterm Object
 *
 * @param pkiPaymenttermID The unique ID of the Paymentterm
 * @param sPaymenttermCode The code of the Paymentterm
 * @param ePaymenttermType 
 * @param iPaymenttermDay The day of the Paymentterm
 * @param objPaymenttermDescription 
 * @param bPaymenttermIsactive Whether the Paymentterm is active or not
 * @param objAudit 
 */


class PaymenttermResponseCompound (

    /* The unique ID of the Paymentterm */
    @Json(name = "pkiPaymenttermID")
    override val pkiPaymenttermID: kotlin.Int,

    /* The code of the Paymentterm */
    @Json(name = "sPaymenttermCode")
    override val sPaymenttermCode: kotlin.String,

    @Json(name = "ePaymenttermType")
    override val ePaymenttermType: FieldEPaymenttermType,

    /* The day of the Paymentterm */
    @Json(name = "iPaymenttermDay")
    override val iPaymenttermDay: kotlin.Int,

    @Json(name = "objPaymenttermDescription")
    override val objPaymenttermDescription: MultilingualPaymenttermDescription,

    /* Whether the Paymentterm is active or not */
    @Json(name = "bPaymenttermIsactive")
    override val bPaymenttermIsactive: kotlin.Boolean,

    @Json(name = "objAudit")
    override val objAudit: CommonAudit

) : PaymenttermResponse {


}

