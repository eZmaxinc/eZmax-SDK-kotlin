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

import eZmaxApi.models.CustomContactNameResponse
import eZmaxApi.models.CustomCreditcardtransactionResponse
import eZmaxApi.models.EnumTextvalidation
import eZmaxApi.models.EzsignelementdependencyResponse
import eZmaxApi.models.EzsignsignatureResponse
import eZmaxApi.models.EzsignsignaturecustomdateResponseV2
import eZmaxApi.models.FieldEEzsignsignatureAttachmentnamesource
import eZmaxApi.models.FieldEEzsignsignatureConsultationtrigger
import eZmaxApi.models.FieldEEzsignsignatureDependencyrequirement
import eZmaxApi.models.FieldEEzsignsignatureFont
import eZmaxApi.models.FieldEEzsignsignatureTooltipposition
import eZmaxApi.models.FieldEEzsignsignatureType
import eZmaxApi.models.SignatureResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An Ezsignsignature Object and children to create a complete structure
 *
 * @param pkiEzsignsignatureID The unique ID of the Ezsignsignature
 * @param fkiEzsigndocumentID The unique ID of the Ezsigndocument
 * @param fkiEzsignfoldersignerassociationID The unique ID of the Ezsignfoldersignerassociation
 * @param iEzsignpagePagenumber The page number in the Ezsigndocument
 * @param iEzsignsignatureX The X coordinate (Horizontal) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 2 inches from the left border of the page, you would use \"200\" for the X coordinate.
 * @param iEzsignsignatureY The Y coordinate (Vertical) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 3 inches from the top border of the page, you would use \"300\" for the Y coordinate.
 * @param iEzsignsignatureStep The step when the Ezsignsigner will be invited to sign
 * @param eEzsignsignatureType 
 * @param objContactName 
 * @param fkiEzsignsigningreasonID The unique ID of the Ezsignsigningreason
 * @param fkiFontID The unique ID of the Font
 * @param sEzsignsigningreasonDescriptionX The description of the Ezsignsigningreason in the language of the requester
 * @param iEzsignsignatureHeight The height of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have an height of 2 inches, you would use \"200\" for the iEzsignsignatureHeight.
 * @param iEzsignsignatureWidth The width of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have a width of 2 inches, you would use \"200\" for the iEzsignsignatureWidth.
 * @param iEzsignsignatureStepadjusted The step when the Ezsignsigner will be invited to sign
 * @param tEzsignsignatureTooltip A tooltip that will be presented to Ezsignsigner about the Ezsignsignature
 * @param eEzsignsignatureTooltipposition 
 * @param eEzsignsignatureFont 
 * @param iEzsignsignatureValidationstep The step when the Ezsignsigner will be invited to validate the Ezsignsignature of eEzsignsignatureType Attachments
 * @param sEzsignsignatureAttachmentdescription The description attached to the attachment name added in Ezsignsignature of eEzsignsignatureType Attachments
 * @param eEzsignsignatureAttachmentnamesource 
 * @param eEzsignsignatureConsultationtrigger 
 * @param bEzsignsignatureHandwritten Whether the Ezsignsignature must be handwritten or not when eEzsignsignatureType = Signature.
 * @param bEzsignsignatureReason Whether the Ezsignsignature must include a reason or not when eEzsignsignatureType = Signature.
 * @param bEzsignsignatureRequired Whether the Ezsignsignature is required or not. This field is relevant only with Ezsignsignature with eEzsignsignatureType = Attachments, Text or Textarea.
 * @param fkiEzsignfoldersignerassociationIDValidation The unique ID of the Ezsignfoldersignerassociation
 * @param dtEzsignsignatureDate The date the Ezsignsignature was signed
 * @param iEzsignsignatureattachmentCount The count of Ezsignsignatureattachment
 * @param sEzsignsignatureDescription The value entered while signing Ezsignsignature of eEzsignsignatureType **City**, **FieldText** and **FieldTextarea**
 * @param iEzsignsignatureMaxlength The maximum length for the value in the Ezsignsignature  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea**
 * @param eEzsignsignatureTextvalidation 
 * @param sEzsignsignatureTextvalidationcustommessage Description of validation rule. Show by signatory.
 * @param eEzsignsignatureDependencyrequirement 
 * @param sEzsignsignatureDefaultvalue The default value for the Ezsignsignature  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sCompany} | Company name | eZmax Solutions Inc. | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 |
 * @param sEzsignsignatureRegexp A regular expression to indicate what values are acceptable for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea** and eEzsignsignatureTextvalidation is **Custom**
 * @param objContactNameDelegation 
 * @param objSignature 
 * @param bEzsignsignatureCustomdate Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is **Name** or **Handwritten**)
 * @param aObjEzsignsignaturecustomdate An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsignsignatureCustomdate is true.  Use an empty array if you don't want to have a date at all.
 * @param objCreditcardtransaction 
 * @param aObjEzsignelementdependency 
 */


data class EzsignsignatureResponseCompoundV3 (

    /* The unique ID of the Ezsignsignature */
    @Json(name = "pkiEzsignsignatureID")
    override val pkiEzsignsignatureID: kotlin.Int,

    /* The unique ID of the Ezsigndocument */
    @Json(name = "fkiEzsigndocumentID")
    override val fkiEzsigndocumentID: kotlin.Int,

    /* The unique ID of the Ezsignfoldersignerassociation */
    @Json(name = "fkiEzsignfoldersignerassociationID")
    override val fkiEzsignfoldersignerassociationID: kotlin.Int,

    /* The page number in the Ezsigndocument */
    @Json(name = "iEzsignpagePagenumber")
    override val iEzsignpagePagenumber: kotlin.Int,

    /* The X coordinate (Horizontal) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 2 inches from the left border of the page, you would use \"200\" for the X coordinate. */
    @Json(name = "iEzsignsignatureX")
    override val iEzsignsignatureX: kotlin.Int,

    /* The Y coordinate (Vertical) where to put the Ezsignsignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignature 3 inches from the top border of the page, you would use \"300\" for the Y coordinate. */
    @Json(name = "iEzsignsignatureY")
    override val iEzsignsignatureY: kotlin.Int,

    /* The step when the Ezsignsigner will be invited to sign */
    @Json(name = "iEzsignsignatureStep")
    override val iEzsignsignatureStep: kotlin.Int,

    @Json(name = "eEzsignsignatureType")
    override val eEzsignsignatureType: FieldEEzsignsignatureType,

    @Json(name = "objContactName")
    override val objContactName: CustomContactNameResponse,

    /* The unique ID of the Ezsignsigningreason */
    @Json(name = "fkiEzsignsigningreasonID")
    override val fkiEzsignsigningreasonID: kotlin.Int? = null,

    /* The unique ID of the Font */
    @Json(name = "fkiFontID")
    override val fkiFontID: kotlin.Int? = null,

    /* The description of the Ezsignsigningreason in the language of the requester */
    @Json(name = "sEzsignsigningreasonDescriptionX")
    override val sEzsignsigningreasonDescriptionX: kotlin.String? = null,

    /* The height of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have an height of 2 inches, you would use \"200\" for the iEzsignsignatureHeight. */
    @Json(name = "iEzsignsignatureHeight")
    override val iEzsignsignatureHeight: kotlin.Int? = null,

    /* The width of the Ezsignsignature.  Size is calculated at 100dpi (dot per inch). So for example, if you want the Ezsignsignature to have a width of 2 inches, you would use \"200\" for the iEzsignsignatureWidth. */
    @Json(name = "iEzsignsignatureWidth")
    override val iEzsignsignatureWidth: kotlin.Int? = null,

    /* The step when the Ezsignsigner will be invited to sign */
    @Json(name = "iEzsignsignatureStepadjusted")
    override val iEzsignsignatureStepadjusted: kotlin.Int? = null,

    /* A tooltip that will be presented to Ezsignsigner about the Ezsignsignature */
    @Json(name = "tEzsignsignatureTooltip")
    override val tEzsignsignatureTooltip: kotlin.String? = null,

    @Json(name = "eEzsignsignatureTooltipposition")
    override val eEzsignsignatureTooltipposition: FieldEEzsignsignatureTooltipposition? = null,

    @Json(name = "eEzsignsignatureFont")
    override val eEzsignsignatureFont: FieldEEzsignsignatureFont? = null,

    /* The step when the Ezsignsigner will be invited to validate the Ezsignsignature of eEzsignsignatureType Attachments */
    @Json(name = "iEzsignsignatureValidationstep")
    override val iEzsignsignatureValidationstep: kotlin.Int? = null,

    /* The description attached to the attachment name added in Ezsignsignature of eEzsignsignatureType Attachments */
    @Json(name = "sEzsignsignatureAttachmentdescription")
    override val sEzsignsignatureAttachmentdescription: kotlin.String? = null,

    @Json(name = "eEzsignsignatureAttachmentnamesource")
    override val eEzsignsignatureAttachmentnamesource: FieldEEzsignsignatureAttachmentnamesource? = null,

    @Json(name = "eEzsignsignatureConsultationtrigger")
    override val eEzsignsignatureConsultationtrigger: FieldEEzsignsignatureConsultationtrigger? = null,

    /* Whether the Ezsignsignature must be handwritten or not when eEzsignsignatureType = Signature. */
    @Json(name = "bEzsignsignatureHandwritten")
    override val bEzsignsignatureHandwritten: kotlin.Boolean? = null,

    /* Whether the Ezsignsignature must include a reason or not when eEzsignsignatureType = Signature. */
    @Json(name = "bEzsignsignatureReason")
    override val bEzsignsignatureReason: kotlin.Boolean? = null,

    /* Whether the Ezsignsignature is required or not. This field is relevant only with Ezsignsignature with eEzsignsignatureType = Attachments, Text or Textarea. */
    @Json(name = "bEzsignsignatureRequired")
    override val bEzsignsignatureRequired: kotlin.Boolean? = null,

    /* The unique ID of the Ezsignfoldersignerassociation */
    @Json(name = "fkiEzsignfoldersignerassociationIDValidation")
    override val fkiEzsignfoldersignerassociationIDValidation: kotlin.Int? = null,

    /* The date the Ezsignsignature was signed */
    @Json(name = "dtEzsignsignatureDate")
    override val dtEzsignsignatureDate: kotlin.String? = null,

    /* The count of Ezsignsignatureattachment */
    @Json(name = "iEzsignsignatureattachmentCount")
    override val iEzsignsignatureattachmentCount: kotlin.Int? = null,

    /* The value entered while signing Ezsignsignature of eEzsignsignatureType **City**, **FieldText** and **FieldTextarea** */
    @Json(name = "sEzsignsignatureDescription")
    override val sEzsignsignatureDescription: kotlin.String? = null,

    /* The maximum length for the value in the Ezsignsignature  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea** */
    @Json(name = "iEzsignsignatureMaxlength")
    override val iEzsignsignatureMaxlength: kotlin.Int? = null,

    @Json(name = "eEzsignsignatureTextvalidation")
    override val eEzsignsignatureTextvalidation: EnumTextvalidation? = null,

    /* Description of validation rule. Show by signatory. */
    @Json(name = "sEzsignsignatureTextvalidationcustommessage")
    override val sEzsignsignatureTextvalidationcustommessage: kotlin.String? = null,

    @Json(name = "eEzsignsignatureDependencyrequirement")
    override val eEzsignsignatureDependencyrequirement: FieldEEzsignsignatureDependencyrequirement? = null,

    /* The default value for the Ezsignsignature  You can use the codes below and they will be replaced at signature time.    | Code | Description | Example | | ------------------------- | ------------ | ------------ | | {sUserFirstname} | The first name of the contact | John | | {sUserLastname} | The last name of the contact | Doe | | {sUserJobtitle} | The job title | Sales Representative | | {sCompany} | Company name | eZmax Solutions Inc. | | {sEmailAddress} | The email address | email@example.com | | {sPhoneE164} | A phone number in E.164 Format | +15149901516 | | {sPhoneE164Cell} | A phone number in E.164 Format | +15149901516 | */
    @Json(name = "sEzsignsignatureDefaultvalue")
    override val sEzsignsignatureDefaultvalue: kotlin.String? = null,

    /* A regular expression to indicate what values are acceptable for the Ezsignsignature.  This can only be set if eEzsignsignatureType is **FieldText** or **FieldTextarea** and eEzsignsignatureTextvalidation is **Custom** */
    @Json(name = "sEzsignsignatureRegexp")
    override val sEzsignsignatureRegexp: kotlin.String? = null,

    @Json(name = "objContactNameDelegation")
    override val objContactNameDelegation: CustomContactNameResponse? = null,

    @Json(name = "objSignature")
    override val objSignature: SignatureResponseCompound? = null,

    /* Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is **Name** or **Handwritten**) */
    @Json(name = "bEzsignsignatureCustomdate")
    val bEzsignsignatureCustomdate: kotlin.Boolean? = null,

    /* An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsignsignatureCustomdate is true.  Use an empty array if you don't want to have a date at all. */
    @Json(name = "a_objEzsignsignaturecustomdate")
    val aObjEzsignsignaturecustomdate: kotlin.collections.List<EzsignsignaturecustomdateResponseV2>? = null,

    @Json(name = "objCreditcardtransaction")
    val objCreditcardtransaction: CustomCreditcardtransactionResponse? = null,

    @Json(name = "a_objEzsignelementdependency")
    val aObjEzsignelementdependency: kotlin.collections.List<EzsignelementdependencyResponse>? = null

) : EzsignsignatureResponse {


}

