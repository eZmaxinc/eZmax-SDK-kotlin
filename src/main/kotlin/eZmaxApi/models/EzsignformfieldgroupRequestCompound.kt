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

import eZmaxApi.models.CustomDropdownElementRequest
import eZmaxApi.models.EnumTextvalidation
import eZmaxApi.models.EzsignformfieldRequestCompound
import eZmaxApi.models.EzsignformfieldgroupsignerRequest
import eZmaxApi.models.FieldEEzsignformfieldgroupSignerrequirement
import eZmaxApi.models.FieldEEzsignformfieldgroupTooltipposition
import eZmaxApi.models.FieldEEzsignformfieldgroupType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An Ezsignformfieldgroup Object and children to create a complete structure
 *
 * @param fkiEzsigndocumentID The unique ID of the Ezsigndocument
 * @param eEzsignformfieldgroupType 
 * @param sEzsignformfieldgroupLabel The Label for the Ezsignformfieldgroup
 * @param iEzsignformfieldgroupStep The step when the Ezsignsigner will be invited to fill the form fields
 * @param iEzsignformfieldgroupFilledmin The minimum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup
 * @param iEzsignformfieldgroupFilledmax The maximum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup
 * @param bEzsignformfieldgroupReadonly Whether the Ezsignformfieldgroup is read only or not.
 * @param aObjEzsignformfieldgroupsigner 
 * @param aObjEzsignformfield 
 * @param pkiEzsignformfieldgroupID The unique ID of the Ezsignformfieldgroup
 * @param eEzsignformfieldgroupSignerrequirement 
 * @param sEzsignformfieldgroupDefaultvalue The default value for the Ezsignformfieldgroup  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sCompany} | Company name | eZmax Solutions Inc. | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 |
 * @param iEzsignformfieldgroupMaxlength The maximum length for the value in the Ezsignformfieldgroup  This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea**
 * @param bEzsignformfieldgroupEncrypted Whether the Ezsignformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea**
 * @param sEzsignformfieldgroupRegexp A regular expression to indicate what values are acceptable for the Ezsignformfieldgroup.  This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea**
 * @param sEzsignformfieldgroupTextvalidationcustommessage Description of validation rule. Show by signatory.
 * @param tEzsignformfieldgroupTooltip A tooltip that will be presented to Ezsignsigner about the Ezsignformfieldgroup
 * @param eEzsignformfieldgroupTooltipposition 
 * @param eEzsignformfieldgroupTextvalidation 
 * @param aObjDropdownElement 
 */


data class EzsignformfieldgroupRequestCompound (

    /* The unique ID of the Ezsigndocument */
    @Json(name = "fkiEzsigndocumentID")
    val fkiEzsigndocumentID: kotlin.Int,

    @Json(name = "eEzsignformfieldgroupType")
    val eEzsignformfieldgroupType: FieldEEzsignformfieldgroupType,

    /* The Label for the Ezsignformfieldgroup */
    @Json(name = "sEzsignformfieldgroupLabel")
    val sEzsignformfieldgroupLabel: kotlin.String,

    /* The step when the Ezsignsigner will be invited to fill the form fields */
    @Json(name = "iEzsignformfieldgroupStep")
    val iEzsignformfieldgroupStep: kotlin.Int,

    /* The minimum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup */
    @Json(name = "iEzsignformfieldgroupFilledmin")
    val iEzsignformfieldgroupFilledmin: kotlin.Int,

    /* The maximum number of Ezsignformfield that must be filled in the Ezsignformfieldgroup */
    @Json(name = "iEzsignformfieldgroupFilledmax")
    val iEzsignformfieldgroupFilledmax: kotlin.Int,

    /* Whether the Ezsignformfieldgroup is read only or not. */
    @Json(name = "bEzsignformfieldgroupReadonly")
    val bEzsignformfieldgroupReadonly: kotlin.Boolean,

    @Json(name = "a_objEzsignformfieldgroupsigner")
    val aObjEzsignformfieldgroupsigner: kotlin.collections.List<EzsignformfieldgroupsignerRequest>,

    @Json(name = "a_objEzsignformfield")
    val aObjEzsignformfield: kotlin.collections.List<EzsignformfieldRequestCompound>,

    /* The unique ID of the Ezsignformfieldgroup */
    @Json(name = "pkiEzsignformfieldgroupID")
    val pkiEzsignformfieldgroupID: kotlin.Int? = null,

    @Json(name = "eEzsignformfieldgroupSignerrequirement")
    @Deprecated(message = "This property is deprecated.")
    val eEzsignformfieldgroupSignerrequirement: FieldEEzsignformfieldgroupSignerrequirement? = null,

    /* The default value for the Ezsignformfieldgroup  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sCompany} | Company name | eZmax Solutions Inc. | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 | */
    @Json(name = "sEzsignformfieldgroupDefaultvalue")
    val sEzsignformfieldgroupDefaultvalue: kotlin.String? = null,

    /* The maximum length for the value in the Ezsignformfieldgroup  This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea** */
    @Json(name = "iEzsignformfieldgroupMaxlength")
    val iEzsignformfieldgroupMaxlength: kotlin.Int? = null,

    /* Whether the Ezsignformfieldgroup is encrypted in the database or not. Encrypted values are not displayed on the Ezsigndocument. This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea** */
    @Json(name = "bEzsignformfieldgroupEncrypted")
    val bEzsignformfieldgroupEncrypted: kotlin.Boolean? = null,

    /* A regular expression to indicate what values are acceptable for the Ezsignformfieldgroup.  This can only be set if eEzsignformfieldgroupType is **Text** or **Textarea** */
    @Json(name = "sEzsignformfieldgroupRegexp")
    val sEzsignformfieldgroupRegexp: kotlin.String? = null,

    /* Description of validation rule. Show by signatory. */
    @Json(name = "sEzsignformfieldgroupTextvalidationcustommessage")
    val sEzsignformfieldgroupTextvalidationcustommessage: kotlin.String? = null,

    /* A tooltip that will be presented to Ezsignsigner about the Ezsignformfieldgroup */
    @Json(name = "tEzsignformfieldgroupTooltip")
    val tEzsignformfieldgroupTooltip: kotlin.String? = null,

    @Json(name = "eEzsignformfieldgroupTooltipposition")
    val eEzsignformfieldgroupTooltipposition: FieldEEzsignformfieldgroupTooltipposition? = null,

    @Json(name = "eEzsignformfieldgroupTextvalidation")
    val eEzsignformfieldgroupTextvalidation: EnumTextvalidation? = null,

    @Json(name = "a_objDropdownElement")
    val aObjDropdownElement: kotlin.collections.List<CustomDropdownElementRequest>? = null

) {


}

