/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.1
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
 * A Listpresentation element
 *
 * @param sListpresentationDescription A descriptive for the list presentation
 * @param sListpresentationFilter The filter to apply to the request to limit results.
 * @param sListpresentationOrderby The order by the user chose
 * @param aSColumnName An array of column names that the user chose to bee visible
 * @param iListpresentationRowMax The maximum numbers of results to be returned
 * @param iListpresentationRowOffset The starting element from where to start retrieving the results. For example if you started at iRowOffset=0 and asked for iRowMax=100, to get the next 100 results, you could specify iRowOffset=100&iRowMax=100,
 * @param bListpresentationDefault Set to true if the user chose this Listpresentation as the default one. A single element should be set to true
 */

data class ListpresentationMinusRequest (

    /* A descriptive for the list presentation */
    @Json(name = "sListpresentationDescription")
    val sListpresentationDescription: kotlin.String,

    /* The filter to apply to the request to limit results. */
    @Json(name = "sListpresentationFilter")
    val sListpresentationFilter: kotlin.String,

    /* The order by the user chose */
    @Json(name = "sListpresentationOrderby")
    val sListpresentationOrderby: kotlin.String,

    /* An array of column names that the user chose to bee visible */
    @Json(name = "a_sColumnName")
    val aSColumnName: kotlin.collections.List<kotlin.String>,

    /* The maximum numbers of results to be returned */
    @Json(name = "iListpresentationRowMax")
    val iListpresentationRowMax: kotlin.Int,

    /* The starting element from where to start retrieving the results. For example if you started at iRowOffset=0 and asked for iRowMax=100, to get the next 100 results, you could specify iRowOffset=100&iRowMax=100, */
    @Json(name = "iListpresentationRowOffset")
    val iListpresentationRowOffset: kotlin.Int,

    /* Set to true if the user chose this Listpresentation as the default one. A single element should be set to true */
    @Json(name = "bListpresentationDefault")
    val bListpresentationDefault: kotlin.Boolean

)

