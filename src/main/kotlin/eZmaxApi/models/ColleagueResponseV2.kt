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

import eZmaxApi.models.CommonAudit
import eZmaxApi.models.CustomUserNameResponse
import eZmaxApi.models.FieldEColleagueEzsign
import eZmaxApi.models.FieldEColleagueRealestateinprogess

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Colleague Object
 *
 * @param pkiColleagueID The unique ID of the Colleague
 * @param fkiUserID The unique ID of the User
 * @param fkiUserIDColleague The unique ID of the User
 * @param bColleagueEzsignemail Whether the email can be used by the cloning user in Ezsign
 * @param bColleagueFinancial Whether the cloning user has access to the financial
 * @param bColleagueUsecloneemail Whether the cloning user has access to the cloned user email to send communications
 * @param bColleagueAttachment Whether the cloning user has access to the attachment
 * @param bColleagueCanafe Whether the cloning user has access to canafe
 * @param bColleaguePermission Whether the cloning user copies the permission of the cloned user
 * @param bColleagueRealestatecompleted Whether if the cloning user has access to the completed folders in real estate
 * @param eColleagueEzsign 
 * @param eColleagueRealestateinprogress 
 * @param objUserName 
 * @param objAudit 
 * @param dtColleagueFrom The from of the Colleague
 * @param dtColleagueTo The to of the Colleague
 */


data class ColleagueResponseV2 (

    /* The unique ID of the Colleague */
    @Json(name = "pkiColleagueID")
    val pkiColleagueID: kotlin.Int,

    /* The unique ID of the User */
    @Json(name = "fkiUserID")
    val fkiUserID: kotlin.Int,

    /* The unique ID of the User */
    @Json(name = "fkiUserIDColleague")
    val fkiUserIDColleague: kotlin.Int,

    /* Whether the email can be used by the cloning user in Ezsign */
    @Json(name = "bColleagueEzsignemail")
    val bColleagueEzsignemail: kotlin.Boolean,

    /* Whether the cloning user has access to the financial */
    @Json(name = "bColleagueFinancial")
    val bColleagueFinancial: kotlin.Boolean,

    /* Whether the cloning user has access to the cloned user email to send communications */
    @Json(name = "bColleagueUsecloneemail")
    val bColleagueUsecloneemail: kotlin.Boolean,

    /* Whether the cloning user has access to the attachment */
    @Json(name = "bColleagueAttachment")
    val bColleagueAttachment: kotlin.Boolean,

    /* Whether the cloning user has access to canafe */
    @Json(name = "bColleagueCanafe")
    val bColleagueCanafe: kotlin.Boolean,

    /* Whether the cloning user copies the permission of the cloned user */
    @Json(name = "bColleaguePermission")
    val bColleaguePermission: kotlin.Boolean,

    /* Whether if the cloning user has access to the completed folders in real estate */
    @Json(name = "bColleagueRealestatecompleted")
    val bColleagueRealestatecompleted: kotlin.Boolean,

    @Json(name = "eColleagueEzsign")
    val eColleagueEzsign: FieldEColleagueEzsign,

    @Json(name = "eColleagueRealestateinprogress")
    val eColleagueRealestateinprogress: FieldEColleagueRealestateinprogess,

    @Json(name = "objUserName")
    val objUserName: CustomUserNameResponse,

    @Json(name = "objAudit")
    val objAudit: CommonAudit,

    /* The from of the Colleague */
    @Json(name = "dtColleagueFrom")
    val dtColleagueFrom: kotlin.String? = null,

    /* The to of the Colleague */
    @Json(name = "dtColleagueTo")
    val dtColleagueTo: kotlin.String? = null

) {


}

