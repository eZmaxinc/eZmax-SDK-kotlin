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

import eZmaxApi.models.EnumTextvalidation
import eZmaxApi.models.FieldEEzsigntemplateformfieldgroupSignerrequirement
import eZmaxApi.models.FieldEEzsigntemplateformfieldgroupTooltipposition
import eZmaxApi.models.FieldEEzsigntemplateformfieldgroupType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsigntemplateformfieldgroup Object
 *
 * @param fkiEzsigntemplatedocumentID The unique ID of the Ezsigntemplatedocument
 * @param eEzsigntemplateformfieldgroupType 
 * @param sEzsigntemplateformfieldgroupLabel The Label for the Ezsigntemplateformfieldgroup
 * @param iEzsigntemplateformfieldgroupStep The step when the Ezsigntemplatesigner will be invited to fill the form fields
 * @param sEzsigntemplateformfieldgroupDefaultvalue The default value for the Ezsigntemplateformfieldgroup  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 |
 * @param iEzsigntemplateformfieldgroupFilledmin The minimum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup
 * @param iEzsigntemplateformfieldgroupFilledmax The maximum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup
 * @param bEzsigntemplateformfieldgroupReadonly Whether the Ezsigntemplateformfieldgroup is read only or not.
 * @param pkiEzsigntemplateformfieldgroupID The unique ID of the Ezsigntemplateformfieldgroup
 * @param eEzsigntemplateformfieldgroupSignerrequirement 
 * @param iEzsigntemplateformfieldgroupMaxlength The maximum length for the value in the Ezsigntemplateformfieldgroup  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea**
 * @param bEzsigntemplateformfieldgroupEncrypted Whether the Ezsigntemplateformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea**
 * @param sEzsigntemplateformfieldgroupRegexp A regular expression to indicate what values are acceptable for the Ezsigntemplateformfieldgroup.  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea**
 * @param sEzsigntemplateformfieldgroupTextvalidationcustommessage Description of validation rule. Show by signatory.
 * @param eEzsigntemplateformfieldgroupTextvalidation 
 * @param tEzsigntemplateformfieldgroupTooltip A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplateformfieldgroup
 * @param eEzsigntemplateformfieldgroupTooltipposition 
 */


data class EzsigntemplateformfieldgroupRequest (

    /* The unique ID of the Ezsigntemplatedocument */
    @Json(name = "fkiEzsigntemplatedocumentID")
    val fkiEzsigntemplatedocumentID: kotlin.Int,

    @Json(name = "eEzsigntemplateformfieldgroupType")
    val eEzsigntemplateformfieldgroupType: FieldEEzsigntemplateformfieldgroupType,

    /* The Label for the Ezsigntemplateformfieldgroup */
    @Json(name = "sEzsigntemplateformfieldgroupLabel")
    val sEzsigntemplateformfieldgroupLabel: kotlin.String,

    /* The step when the Ezsigntemplatesigner will be invited to fill the form fields */
    @Json(name = "iEzsigntemplateformfieldgroupStep")
    val iEzsigntemplateformfieldgroupStep: kotlin.Int,

    /* The default value for the Ezsigntemplateformfieldgroup  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 | */
    @Json(name = "sEzsigntemplateformfieldgroupDefaultvalue")
    val sEzsigntemplateformfieldgroupDefaultvalue: kotlin.String,

    /* The minimum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup */
    @Json(name = "iEzsigntemplateformfieldgroupFilledmin")
    val iEzsigntemplateformfieldgroupFilledmin: kotlin.Int,

    /* The maximum number of Ezsigntemplateformfield that must be filled in the Ezsigntemplateformfieldgroup */
    @Json(name = "iEzsigntemplateformfieldgroupFilledmax")
    val iEzsigntemplateformfieldgroupFilledmax: kotlin.Int,

    /* Whether the Ezsigntemplateformfieldgroup is read only or not. */
    @Json(name = "bEzsigntemplateformfieldgroupReadonly")
    val bEzsigntemplateformfieldgroupReadonly: kotlin.Boolean,

    /* The unique ID of the Ezsigntemplateformfieldgroup */
    @Json(name = "pkiEzsigntemplateformfieldgroupID")
    val pkiEzsigntemplateformfieldgroupID: kotlin.Int? = null,

    @Json(name = "eEzsigntemplateformfieldgroupSignerrequirement")
    @Deprecated(message = "This property is deprecated.")
    val eEzsigntemplateformfieldgroupSignerrequirement: FieldEEzsigntemplateformfieldgroupSignerrequirement? = null,

    /* The maximum length for the value in the Ezsigntemplateformfieldgroup  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** */
    @Json(name = "iEzsigntemplateformfieldgroupMaxlength")
    val iEzsigntemplateformfieldgroupMaxlength: kotlin.Int? = null,

    /* Whether the Ezsigntemplateformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** */
    @Json(name = "bEzsigntemplateformfieldgroupEncrypted")
    val bEzsigntemplateformfieldgroupEncrypted: kotlin.Boolean? = null,

    /* A regular expression to indicate what values are acceptable for the Ezsigntemplateformfieldgroup.  This can only be set if eEzsigntemplateformfieldgroupType is **Text** or **Textarea** */
    @Json(name = "sEzsigntemplateformfieldgroupRegexp")
    val sEzsigntemplateformfieldgroupRegexp: kotlin.String? = null,

    /* Description of validation rule. Show by signatory. */
    @Json(name = "sEzsigntemplateformfieldgroupTextvalidationcustommessage")
    val sEzsigntemplateformfieldgroupTextvalidationcustommessage: kotlin.String? = null,

    @Json(name = "eEzsigntemplateformfieldgroupTextvalidation")
    val eEzsigntemplateformfieldgroupTextvalidation: EnumTextvalidation? = null,

    /* A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplateformfieldgroup */
    @Json(name = "tEzsigntemplateformfieldgroupTooltip")
    val tEzsigntemplateformfieldgroupTooltip: kotlin.String? = null,

    @Json(name = "eEzsigntemplateformfieldgroupTooltipposition")
    val eEzsigntemplateformfieldgroupTooltipposition: FieldEEzsigntemplateformfieldgroupTooltipposition? = null

) {


}

