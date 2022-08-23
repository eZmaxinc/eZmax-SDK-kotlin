/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
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

import eZmaxApi.models.FieldMinusEEzsignformfieldgroupSignerrequirement
import eZmaxApi.models.FieldMinusEEzsignformfieldgroupTooltipposition
import eZmaxApi.models.FieldMinusEEzsignformfieldgroupType

import com.squareup.moshi.Json

/**
 * An Ezsignformfieldgroup Object
 *
 * @param pkiEzsignformfieldgroupID The unique ID of the Ezsignformfieldgroup
 * @param fkiEzsigndocumentID The unique ID of the Ezsigndocument
 * @param eEzsignformfieldgroupType 
 * @param eEzsignformfieldgroupSignerrequirement 
 * @param sEzsignformfieldgroupLabel The Label for the Ezsignformfieldgroup
 * @param iEzsignformfieldgroupStep The step when the Ezsignsigner will be invited to fill the form fields
 * @param sEzsignformfieldgroupDefaultvalue The default value for the Ezsignformfieldgroup
 * @param iEzsignformfieldgroupFilledmin The minimum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup
 * @param iEzsignformfieldgroupFilledmax The maximum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup
 * @param bEzsignformfieldgroupReadonly Whether the Ezsignformfieldgroup is read only or not.
 * @param iEzsignformfieldgroupMaxlength The maximum length for the value in the Ezsignformfieldgroup  This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea**
 * @param bEzsignformfieldgroupEncrypted Whether the Ezsignformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea**
 * @param sEzsignformfieldgroupRegexp A regular expression to indicate what values are acceptable for the Ezsignformfieldgroup.  This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea**
 * @param tEzsignformfieldgroupTooltip A tooltip that will be presented to Ezsignsigner about the Ezsignformfieldgroup
 * @param eEzsignformfieldgroupTooltipposition 
 */

data class EzsignformfieldgroupMinusResponse (

    /* The unique ID of the Ezsignformfieldgroup */
    @Json(name = "pkiEzsignformfieldgroupID")
    val pkiEzsignformfieldgroupID: kotlin.Int,

    /* The unique ID of the Ezsigndocument */
    @Json(name = "fkiEzsigndocumentID")
    val fkiEzsigndocumentID: kotlin.Int,

    @Json(name = "eEzsignformfieldgroupType")
    val eEzsignformfieldgroupType: FieldMinusEEzsignformfieldgroupType,

    @Json(name = "eEzsignformfieldgroupSignerrequirement")
    val eEzsignformfieldgroupSignerrequirement: FieldMinusEEzsignformfieldgroupSignerrequirement,

    /* The Label for the Ezsignformfieldgroup */
    @Json(name = "sEzsignformfieldgroupLabel")
    val sEzsignformfieldgroupLabel: kotlin.String,

    /* The step when the Ezsignsigner will be invited to fill the form fields */
    @Json(name = "iEzsignformfieldgroupStep")
    val iEzsignformfieldgroupStep: kotlin.Int,

    /* The default value for the Ezsignformfieldgroup */
    @Json(name = "sEzsignformfieldgroupDefaultvalue")
    val sEzsignformfieldgroupDefaultvalue: kotlin.String,

    /* The minimum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup */
    @Json(name = "iEzsignformfieldgroupFilledmin")
    val iEzsignformfieldgroupFilledmin: kotlin.Int,

    /* The maximum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup */
    @Json(name = "iEzsignformfieldgroupFilledmax")
    val iEzsignformfieldgroupFilledmax: kotlin.Int,

    /* Whether the Ezsignformfieldgroup is read only or not. */
    @Json(name = "bEzsignformfieldgroupReadonly")
    val bEzsignformfieldgroupReadonly: kotlin.Boolean,

    /* The maximum length for the value in the Ezsignformfieldgroup  This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea** */
    @Json(name = "iEzsignformfieldgroupMaxlength")
    val iEzsignformfieldgroupMaxlength: kotlin.Int? = null,

    /* Whether the Ezsignformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea** */
    @Json(name = "bEzsignformfieldgroupEncrypted")
    val bEzsignformfieldgroupEncrypted: kotlin.Boolean? = null,

    /* A regular expression to indicate what values are acceptable for the Ezsignformfieldgroup.  This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea** */
    @Json(name = "sEzsignformfieldgroupRegexp")
    val sEzsignformfieldgroupRegexp: kotlin.String? = null,

    /* A tooltip that will be presented to Ezsignsigner about the Ezsignformfieldgroup */
    @Json(name = "tEzsignformfieldgroupTooltip")
    val tEzsignformfieldgroupTooltip: kotlin.String? = null,

    @Json(name = "eEzsignformfieldgroupTooltipposition")
    val eEzsignformfieldgroupTooltipposition: FieldMinusEEzsignformfieldgroupTooltipposition? = null

)

