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

import eZmaxApi.models.MultilingualSupplyDescription

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Supply Object
 *
 * @param pkiSupplyID The unique ID of the Supply
 * @param fkiVariableexpenseID The unique ID of the Variableexpense
 * @param sSupplyCode The code of the Supply
 * @param objSupplyDescription 
 * @param dSupplyUnitprice The unit price of the Supply
 * @param bSupplyIsactive Whether the supply is active or not
 * @param bSupplyVariableprice Whether if the price is variable
 * @param fkiGlaccountID The unique ID of the Glaccount
 * @param fkiGlaccountcontainerID The unique ID of the Glaccountcontainer
 * @param sGlaccountDescriptionX The Description for the Glaccount in the language of the requester
 * @param sGlaccountcontainerLongdescriptionX The Description for the Glaccountcontainer in the language of the requester
 * @param sVariableexpenseDescriptionX The description of the Variableexpense in the language of the requester
 */


data class SupplyResponse (

    /* The unique ID of the Supply */
    @Json(name = "pkiSupplyID")
    val pkiSupplyID: kotlin.Int,

    /* The unique ID of the Variableexpense */
    @Json(name = "fkiVariableexpenseID")
    val fkiVariableexpenseID: kotlin.Int,

    /* The code of the Supply */
    @Json(name = "sSupplyCode")
    val sSupplyCode: kotlin.String,

    @Json(name = "objSupplyDescription")
    val objSupplyDescription: MultilingualSupplyDescription,

    /* The unit price of the Supply */
    @Json(name = "dSupplyUnitprice")
    val dSupplyUnitprice: kotlin.String,

    /* Whether the supply is active or not */
    @Json(name = "bSupplyIsactive")
    val bSupplyIsactive: kotlin.Boolean,

    /* Whether if the price is variable */
    @Json(name = "bSupplyVariableprice")
    val bSupplyVariableprice: kotlin.Boolean,

    /* The unique ID of the Glaccount */
    @Json(name = "fkiGlaccountID")
    val fkiGlaccountID: kotlin.Int? = null,

    /* The unique ID of the Glaccountcontainer */
    @Json(name = "fkiGlaccountcontainerID")
    val fkiGlaccountcontainerID: kotlin.Int? = null,

    /* The Description for the Glaccount in the language of the requester */
    @Json(name = "sGlaccountDescriptionX")
    val sGlaccountDescriptionX: kotlin.String? = null,

    /* The Description for the Glaccountcontainer in the language of the requester */
    @Json(name = "sGlaccountcontainerLongdescriptionX")
    val sGlaccountcontainerLongdescriptionX: kotlin.String? = null,

    /* The description of the Variableexpense in the language of the requester */
    @Json(name = "sVariableexpenseDescriptionX")
    val sVariableexpenseDescriptionX: kotlin.String? = null

) {


}

