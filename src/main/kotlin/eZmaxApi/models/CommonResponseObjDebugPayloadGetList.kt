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

import eZmaxApi.models.CommonResponseFilter

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * This is a debug object containing debugging information on the actual function
 *
 * @param iVersionMin The minimum version of the function that can be called
 * @param iVersionMax The maximum version of the function that can be called
 * @param aRequiredPermission An array of permissions required to access this function.  If the value \"0\" is present in the array, anyone can call this function.  You must have one of the permission to access the function. You don't need to have all of them.
 * @param bVersionDeprecated Wheter the current route is deprecated or not
 * @param dtResponseDate Represent a Date Time. The timezone is the one configured in the User's profile.
 * @param aFilter 
 * @param aOrderBy List of available values for *eOrderBy*
 * @param iRowMax The maximum numbers of results to be returned.  When the content-type is **application/json** there is an implicit default of 10 000.  When it's **application/vnd.openxmlformats-officedocument.spreadsheetml.sheet** the is no implicit default so if you do not specify iRowMax, all records will be returned.
 * @param iRowOffset The starting element from where to start retrieving the results. For example if you started at iRowOffset=0 and asked for iRowMax=100, to get the next 100 results, you could specify iRowOffset=100&iRowMax=100,
 */


data class CommonResponseObjDebugPayloadGetList (

    /* The minimum version of the function that can be called */
    @Json(name = "iVersionMin")
    val iVersionMin: kotlin.Int,

    /* The maximum version of the function that can be called */
    @Json(name = "iVersionMax")
    val iVersionMax: kotlin.Int,

    /* An array of permissions required to access this function.  If the value \"0\" is present in the array, anyone can call this function.  You must have one of the permission to access the function. You don't need to have all of them. */
    @Json(name = "a_RequiredPermission")
    val aRequiredPermission: kotlin.collections.List<kotlin.Int>,

    /* Wheter the current route is deprecated or not */
    @Json(name = "bVersionDeprecated")
    val bVersionDeprecated: kotlin.Boolean,

    /* Represent a Date Time. The timezone is the one configured in the User's profile. */
    @Json(name = "dtResponseDate")
    val dtResponseDate: kotlin.String,

    @Json(name = "a_Filter")
    val aFilter: CommonResponseFilter,

    /* List of available values for *eOrderBy* */
    @Json(name = "a_OrderBy")
    val aOrderBy: kotlin.collections.Map<kotlin.String, kotlin.String>,

    /* The maximum numbers of results to be returned.  When the content-type is **application/json** there is an implicit default of 10 000.  When it's **application/vnd.openxmlformats-officedocument.spreadsheetml.sheet** the is no implicit default so if you do not specify iRowMax, all records will be returned. */
    @Json(name = "iRowMax")
    val iRowMax: kotlin.Int,

    /* The starting element from where to start retrieving the results. For example if you started at iRowOffset=0 and asked for iRowMax=100, to get the next 100 results, you could specify iRowOffset=100&iRowMax=100, */
    @Json(name = "iRowOffset")
    val iRowOffset: kotlin.Int = 0

) {


}

