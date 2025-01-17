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
import eZmaxApi.models.DomainResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Domain Object
 *
 * @param pkiDomainID The unique ID of the Domain
 * @param sDomainName The name of the Domain
 * @param bDomainValiddkim Whether the DKIM is valid or not
 * @param bDomainValidmailfrom Whether the mail from is valid or not
 * @param bDomainValidcustomer Whether the customer has access to it or not
 * @param objAudit 
 * @param aObjDnsrecord 
 */


data class DomainResponseCompound (

    /* The unique ID of the Domain */
    @Json(name = "pkiDomainID")
    override val pkiDomainID: kotlin.Int,

    /* The name of the Domain */
    @Json(name = "sDomainName")
    override val sDomainName: kotlin.String,

    /* Whether the DKIM is valid or not */
    @Json(name = "bDomainValiddkim")
    override val bDomainValiddkim: kotlin.Boolean,

    /* Whether the mail from is valid or not */
    @Json(name = "bDomainValidmailfrom")
    override val bDomainValidmailfrom: kotlin.Boolean,

    /* Whether the customer has access to it or not */
    @Json(name = "bDomainValidcustomer")
    override val bDomainValidcustomer: kotlin.Boolean,

    @Json(name = "objAudit")
    override val objAudit: CommonAudit,

    /*  */
    @Json(name = "a_objDnsrecord")
    val aObjDnsrecord: kotlin.collections.List<kotlin.Any>

) : DomainResponse {


}

