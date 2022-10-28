/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.13
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

import eZmaxApi.models.EzsigntemplatedocumentMinusRequest

import com.squareup.moshi.Json

/**
 * A Ezsigntemplatedocument Object and children
 *
 * @param fkiEzsigntemplateID The unique ID of the Ezsigntemplate
 * @param sEzsigntemplatedocumentName The name of the Ezsigntemplatedocument.
 * @param eEzsigntemplatedocumentSource Indicates where to look for the document binary content.
 * @param pkiEzsigntemplatedocumentID The unique ID of the Ezsigntemplatedocument
 * @param fkiEzsigndocumentID The unique ID of the Ezsigndocument
 * @param fkiEzsigntemplatesignerID The unique ID of the Ezsigntemplatesigner
 * @param eEzsigntemplatedocumentFormat Indicates the format of the template.
 * @param sEzsigntemplatedocumentBase64 The Base64 encoded binary content of the document.  This field is Required when eEzsigntemplatedocumentSource = Base64.
 * @param sEzsigntemplatedocumentUrl The url where the document content resides.  This field is Required when eEzsigntemplatedocumentSource = Url.
 * @param bEzsigntemplatedocumentForcerepair Try to repair the document or flatten it if it cannot be used for electronic signature.
 * @param eEzsigntemplatedocumentForm If the document contains an existing PDF form this property must be set.  **Keep** leaves the form as-is in the document.  **Convert** removes the form and convert all the existing fields to Ezsigntemplateformfieldgroups and assign them to the specified **fkiEzsigntemplatesignerID**
 * @param sEzsigntemplatedocumentPassword If the source template is password protected, the password to open/modify it.
 */

data class EzsigntemplatedocumentMinusRequestCompound (

    /* The unique ID of the Ezsigntemplate */
    @Json(name = "fkiEzsigntemplateID")
    val fkiEzsigntemplateID: kotlin.Int,

    /* The name of the Ezsigntemplatedocument. */
    @Json(name = "sEzsigntemplatedocumentName")
    val sEzsigntemplatedocumentName: kotlin.String,

    /* Indicates where to look for the document binary content. */
    @Json(name = "eEzsigntemplatedocumentSource")
    val eEzsigntemplatedocumentSource: EzsigntemplatedocumentMinusRequestCompound.EEzsigntemplatedocumentSource,

    /* The unique ID of the Ezsigntemplatedocument */
    @Json(name = "pkiEzsigntemplatedocumentID")
    val pkiEzsigntemplatedocumentID: kotlin.Int? = null,

    /* The unique ID of the Ezsigndocument */
    @Json(name = "fkiEzsigndocumentID")
    val fkiEzsigndocumentID: kotlin.Int? = null,

    /* The unique ID of the Ezsigntemplatesigner */
    @Json(name = "fkiEzsigntemplatesignerID")
    val fkiEzsigntemplatesignerID: kotlin.Int? = null,

    /* Indicates the format of the template. */
    @Json(name = "eEzsigntemplatedocumentFormat")
    val eEzsigntemplatedocumentFormat: EzsigntemplatedocumentMinusRequestCompound.EEzsigntemplatedocumentFormat? = null,

    /* The Base64 encoded binary content of the document.  This field is Required when eEzsigntemplatedocumentSource = Base64. */
    @Json(name = "sEzsigntemplatedocumentBase64")
    val sEzsigntemplatedocumentBase64: kotlin.ByteArray? = null,

    /* The url where the document content resides.  This field is Required when eEzsigntemplatedocumentSource = Url. */
    @Json(name = "sEzsigntemplatedocumentUrl")
    val sEzsigntemplatedocumentUrl: kotlin.String? = null,

    /* Try to repair the document or flatten it if it cannot be used for electronic signature. */
    @Json(name = "bEzsigntemplatedocumentForcerepair")
    val bEzsigntemplatedocumentForcerepair: kotlin.Boolean? = null,

    /* If the document contains an existing PDF form this property must be set.  **Keep** leaves the form as-is in the document.  **Convert** removes the form and convert all the existing fields to Ezsigntemplateformfieldgroups and assign them to the specified **fkiEzsigntemplatesignerID** */
    @Json(name = "eEzsigntemplatedocumentForm")
    val eEzsigntemplatedocumentForm: EzsigntemplatedocumentMinusRequestCompound.EEzsigntemplatedocumentForm? = null,

    /* If the source template is password protected, the password to open/modify it. */
    @Json(name = "sEzsigntemplatedocumentPassword")
    val sEzsigntemplatedocumentPassword: kotlin.String? = ""

) {

    /**
     * Indicates where to look for the document binary content.
     *
     * Values: Base64,Url,Ezsigndocument
     */
    enum class EEzsigntemplatedocumentSource(val value: kotlin.String) {
        @Json(name = "Base64") Base64("Base64"),
        @Json(name = "Url") Url("Url"),
        @Json(name = "Ezsigndocument") Ezsigndocument("Ezsigndocument");
    }
    /**
     * Indicates the format of the template.
     *
     * Values: Pdf
     */
    enum class EEzsigntemplatedocumentFormat(val value: kotlin.String) {
        @Json(name = "Pdf") Pdf("Pdf");
    }
    /**
     * If the document contains an existing PDF form this property must be set.  **Keep** leaves the form as-is in the document.  **Convert** removes the form and convert all the existing fields to Ezsigntemplateformfieldgroups and assign them to the specified **fkiEzsigntemplatesignerID**
     *
     * Values: Keep,Convert
     */
    enum class EEzsigntemplatedocumentForm(val value: kotlin.String) {
        @Json(name = "Keep") Keep("Keep"),
        @Json(name = "Convert") Convert("Convert");
    }
}

