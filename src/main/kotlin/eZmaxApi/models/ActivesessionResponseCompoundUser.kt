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

import eZmaxApi.models.FieldEUserEzsignsendreminderfrequency

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * An Activesession->User Object and children to create a complete structure
 *
 * @param pkiUserID The unique ID of the User
 * @param fkiTimezoneID The unique ID of the Timezone
 * @param sAvatarUrl The url of the picture used as avatar
 * @param sUserFirstname The first name of the user
 * @param sUserLastname The last name of the user
 * @param sEmailAddress The email address.
 * @param eUserEzsignsendreminderfrequency 
 * @param iUserInterfacecolor The int32 representation of the interface color. For example, RGB color #39435B would be 3752795
 * @param bUserInterfacedark Whether to use a dark mode interface
 * @param iUserListresult The number of rows to return by default in lists
 */


data class ActivesessionResponseCompoundUser (

    /* The unique ID of the User */
    @Json(name = "pkiUserID")
    val pkiUserID: kotlin.Int,

    /* The unique ID of the Timezone */
    @Json(name = "fkiTimezoneID")
    val fkiTimezoneID: kotlin.Int,

    /* The url of the picture used as avatar */
    @Json(name = "sAvatarUrl")
    val sAvatarUrl: kotlin.String,

    /* The first name of the user */
    @Json(name = "sUserFirstname")
    val sUserFirstname: kotlin.String,

    /* The last name of the user */
    @Json(name = "sUserLastname")
    val sUserLastname: kotlin.String,

    /* The email address. */
    @Json(name = "sEmailAddress")
    val sEmailAddress: kotlin.String,

    @Json(name = "eUserEzsignsendreminderfrequency")
    val eUserEzsignsendreminderfrequency: FieldEUserEzsignsendreminderfrequency,

    /* The int32 representation of the interface color. For example, RGB color #39435B would be 3752795 */
    @Json(name = "iUserInterfacecolor")
    val iUserInterfacecolor: kotlin.Int,

    /* Whether to use a dark mode interface */
    @Json(name = "bUserInterfacedark")
    val bUserInterfacedark: kotlin.Boolean,

    /* The number of rows to return by default in lists */
    @Json(name = "iUserListresult")
    val iUserListresult: kotlin.Int

)

