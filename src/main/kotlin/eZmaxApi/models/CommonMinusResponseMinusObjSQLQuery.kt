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


import com.squareup.moshi.Json

/**
 * Definition of objSQLQuery Object
 *
 * @param sQuery The SQL Query
 * @param fDuration Execution time of the SQL Query in seconds
 */

data class CommonMinusResponseMinusObjSQLQuery (

    /* The SQL Query */
    @Json(name = "sQuery")
    val sQuery: kotlin.String,

    /* Execution time of the SQL Query in seconds */
    @Json(name = "fDuration")
    val fDuration: kotlin.Float

)

