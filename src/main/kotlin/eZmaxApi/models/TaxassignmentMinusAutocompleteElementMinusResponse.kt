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


import com.squareup.moshi.Json

/**
 * A Taxassignment AutocompleteElement Response
 *
 * @param sTaxassignmentDescriptionX The description of the Taxassignment  in the language of the requester
 * @param pkiTaxassignmentID The unique ID of the Taxassignment.  Valid values:  |Value|Description| |-|-| |1|No tax| |2|GST| |3|HST (ON)| |4|HST (NB)| |5|HST (NS)| |6|HST (NL)| |7|HST (PE)| |8|GST + QST (QC)| |9|GST + QST (QC) Non-Recoverable| |10|GST + PST (BC)| |11|GST + PST (SK)| |12|GST + RST (MB)| |13|GST + PST (BC) Non-Recoverable| |14|GST + PST (SK) Non-Recoverable| |15|GST + RST (MB) Non-Recoverable|
 * @param bTaxassignmentIsactive Whether the Taxassignment is active or not
 */

data class TaxassignmentMinusAutocompleteElementMinusResponse (

    /* The description of the Taxassignment  in the language of the requester */
    @Json(name = "sTaxassignmentDescriptionX")
    val sTaxassignmentDescriptionX: kotlin.String,

    /* The unique ID of the Taxassignment.  Valid values:  |Value|Description| |-|-| |1|No tax| |2|GST| |3|HST (ON)| |4|HST (NB)| |5|HST (NS)| |6|HST (NL)| |7|HST (PE)| |8|GST + QST (QC)| |9|GST + QST (QC) Non-Recoverable| |10|GST + PST (BC)| |11|GST + PST (SK)| |12|GST + RST (MB)| |13|GST + PST (BC) Non-Recoverable| |14|GST + PST (SK) Non-Recoverable| |15|GST + RST (MB) Non-Recoverable| */
    @Json(name = "pkiTaxassignmentID")
    val pkiTaxassignmentID: kotlin.Int,

    /* Whether the Taxassignment is active or not */
    @Json(name = "bTaxassignmentIsactive")
    val bTaxassignmentIsactive: kotlin.Boolean

)

