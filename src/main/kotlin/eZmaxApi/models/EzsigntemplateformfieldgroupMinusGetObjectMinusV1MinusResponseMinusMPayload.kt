/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
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

import eZmaxApi.models.CustomMinusDropdownElementMinusResponseCompound
import eZmaxApi.models.EzsigntemplateformfieldMinusResponseCompound
import eZmaxApi.models.EzsigntemplateformfieldgroupMinusResponseCompound
import eZmaxApi.models.EzsigntemplateformfieldgroupsignerMinusResponseCompound
import eZmaxApi.models.FieldMinusEEzsigntemplateformfieldgroupSignerrequirement
import eZmaxApi.models.FieldMinusEEzsigntemplateformfieldgroupTooltipposition
import eZmaxApi.models.FieldMinusEEzsigntemplateformfieldgroupType

import com.squareup.moshi.Json

/**
 * Payload for GET /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID}
 *
 * @param pkiEzsigntemplateformfieldgroupID The unique ID of the Ezsigntemplateformfieldgroup
 * @param fkiEzsigntemplatedocumentID The unique ID of the Ezsigntemplatedocument
 * @param eEzsigntemplateformfieldgroupType 
 * @param eEzsigntemplateformfieldgroupSignerrequirement 
 * @param sEzsigntemplateformfieldgroupLabel The Label for the Ezsigntemplateformfieldgroup
 * @param iEzsigntemplateformfieldgroupStep The step when the Ezsigntemplatesigner will be invited to fill the form fields
 * @param iEzsigntemplateformfieldgroupFilledmin The minimum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup
 * @param iEzsigntemplateformfieldgroupFilledmax The maximum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup
 * @param bEzsigntemplateformfieldgroupReadonly Whether the Ezsigntemplateformfieldgroup is read only or not.
 * @param aObjEzsigntemplateformfieldgroupsigner 
 * @param aObjEzsigntemplateformfield 
 * @param sEzsigntemplateformfieldgroupDefaultvalue The default value for the Ezsigntemplateformfieldgroup
 * @param iEzsigntemplateformfieldgroupMaxlength The maximum length for the value in the Ezsigntemplateformfieldgroup  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea**
 * @param bEzsigntemplateformfieldgroupEncrypted Whether the Ezsigntemplateformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea**
 * @param sEzsigntemplateformfieldgroupRegexp A regular expression to indicate what values are acceptable for the Ezsigntemplateformfieldgroup.  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea**
 * @param tEzsigntemplateformfieldgroupTooltip A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplateformfieldgroup
 * @param eEzsigntemplateformfieldgroupTooltipposition 
 * @param aObjDropdownElement 
 */

data class EzsigntemplateformfieldgroupMinusGetObjectMinusV1MinusResponseMinusMPayload (

    /* The unique ID of the Ezsigntemplateformfieldgroup */
    @Json(name = "pkiEzsigntemplateformfieldgroupID")
    val pkiEzsigntemplateformfieldgroupID: kotlin.Int,

    /* The unique ID of the Ezsigntemplatedocument */
    @Json(name = "fkiEzsigntemplatedocumentID")
    val fkiEzsigntemplatedocumentID: kotlin.Int,

    @Json(name = "eEzsigntemplateformfieldgroupType")
    val eEzsigntemplateformfieldgroupType: FieldMinusEEzsigntemplateformfieldgroupType,

    @Json(name = "eEzsigntemplateformfieldgroupSignerrequirement")
    val eEzsigntemplateformfieldgroupSignerrequirement: FieldMinusEEzsigntemplateformfieldgroupSignerrequirement,

    /* The Label for the Ezsigntemplateformfieldgroup */
    @Json(name = "sEzsigntemplateformfieldgroupLabel")
    val sEzsigntemplateformfieldgroupLabel: kotlin.String,

    /* The step when the Ezsigntemplatesigner will be invited to fill the form fields */
    @Json(name = "iEzsigntemplateformfieldgroupStep")
    val iEzsigntemplateformfieldgroupStep: kotlin.Int,

    /* The minimum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup */
    @Json(name = "iEzsigntemplateformfieldgroupFilledmin")
    val iEzsigntemplateformfieldgroupFilledmin: kotlin.Int,

    /* The maximum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup */
    @Json(name = "iEzsigntemplateformfieldgroupFilledmax")
    val iEzsigntemplateformfieldgroupFilledmax: kotlin.Int,

    /* Whether the Ezsigntemplateformfieldgroup is read only or not. */
    @Json(name = "bEzsigntemplateformfieldgroupReadonly")
    val bEzsigntemplateformfieldgroupReadonly: kotlin.Boolean,

    @Json(name = "a_objEzsigntemplateformfieldgroupsigner")
    val aObjEzsigntemplateformfieldgroupsigner: kotlin.collections.List<EzsigntemplateformfieldgroupsignerMinusResponseCompound>,

    @Json(name = "a_objEzsigntemplateformfield")
    val aObjEzsigntemplateformfield: kotlin.collections.List<EzsigntemplateformfieldMinusResponseCompound>,

    /* The default value for the Ezsigntemplateformfieldgroup */
    @Json(name = "sEzsigntemplateformfieldgroupDefaultvalue")
    val sEzsigntemplateformfieldgroupDefaultvalue: kotlin.String? = null,

    /* The maximum length for the value in the Ezsigntemplateformfieldgroup  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** */
    @Json(name = "iEzsigntemplateformfieldgroupMaxlength")
    val iEzsigntemplateformfieldgroupMaxlength: kotlin.Int? = null,

    /* Whether the Ezsigntemplateformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** */
    @Json(name = "bEzsigntemplateformfieldgroupEncrypted")
    val bEzsigntemplateformfieldgroupEncrypted: kotlin.Boolean? = null,

    /* A regular expression to indicate what values are acceptable for the Ezsigntemplateformfieldgroup.  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** */
    @Json(name = "sEzsigntemplateformfieldgroupRegexp")
    val sEzsigntemplateformfieldgroupRegexp: kotlin.String? = null,

    /* A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplateformfieldgroup */
    @Json(name = "tEzsigntemplateformfieldgroupTooltip")
    val tEzsigntemplateformfieldgroupTooltip: kotlin.String? = null,

    @Json(name = "eEzsigntemplateformfieldgroupTooltipposition")
    val eEzsigntemplateformfieldgroupTooltipposition: FieldMinusEEzsigntemplateformfieldgroupTooltipposition? = null,

    @Json(name = "a_objDropdownElement")
    val aObjDropdownElement: kotlin.collections.List<CustomMinusDropdownElementMinusResponseCompound>? = null

)

