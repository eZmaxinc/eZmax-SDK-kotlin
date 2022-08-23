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


import com.squareup.moshi.Json

/**
 * A Ezsigntemplate List Element
 *
 * @param pkiEzsigntemplateID The unique ID of the Ezsigntemplate
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sEzsigntemplateDescription The description of the Ezsigntemplate
 * @param iEzsigntemplatedocumentPagetotal The number of pages in the Ezsigntemplatedocument.
 * @param iEzsigntemplateSignaturetotal The number of total signatures in the Ezsigntemplate.
 * @param bEzsigntemplateIncomplete Indicate the Ezsigntemplate is incomplete and cannot be used
 * @param sEzsignfoldertypeNameX The name of the Ezsignfoldertype in the language of the requester
 */

data class EzsigntemplateMinusListElement (

    /* The unique ID of the Ezsigntemplate */
    @Json(name = "pkiEzsigntemplateID")
    val pkiEzsigntemplateID: kotlin.Int,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    /* The description of the Ezsigntemplate */
    @Json(name = "sEzsigntemplateDescription")
    val sEzsigntemplateDescription: kotlin.String,

    /* The number of pages in the Ezsigntemplatedocument. */
    @Json(name = "iEzsigntemplatedocumentPagetotal")
    val iEzsigntemplatedocumentPagetotal: kotlin.Int,

    /* The number of total signatures in the Ezsigntemplate. */
    @Json(name = "iEzsigntemplateSignaturetotal")
    val iEzsigntemplateSignaturetotal: kotlin.Int,

    /* Indicate the Ezsigntemplate is incomplete and cannot be used */
    @Json(name = "bEzsigntemplateIncomplete")
    val bEzsigntemplateIncomplete: kotlin.Boolean,

    /* The name of the Ezsignfoldertype in the language of the requester */
    @Json(name = "sEzsignfoldertypeNameX")
    val sEzsignfoldertypeNameX: kotlin.String

)

