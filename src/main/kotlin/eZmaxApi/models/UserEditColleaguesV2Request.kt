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

import eZmaxApi.models.ColleagueRequestCompoundV2

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Request for PUT /2/object/user/{pkiUserID}/editColleagues
 *
 * @param aObjColleague 
 */


data class UserEditColleaguesV2Request (

    @Json(name = "a_objColleague")
    val aObjColleague: kotlin.collections.List<ColleagueRequestCompoundV2>

) {


}

