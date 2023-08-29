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

import eZmaxApi.models.EmailRequestCompound
import eZmaxApi.models.FieldEUserEzsignaccess
import eZmaxApi.models.FieldEUserLogintype
import eZmaxApi.models.FieldEUserType
import eZmaxApi.models.PhoneRequestCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A User Object
 *
 * @param fkiCompanyIDDefault The unique ID of the Company
 * @param fkiDepartmentIDDefault The unique ID of the Department
 * @param fkiTimezoneID The unique ID of the Timezone
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param objEmail 
 * @param fkiBillingentityinternalID The unique ID of the Billingentityinternal.
 * @param eUserType 
 * @param eUserLogintype 
 * @param sUserFirstname The first name of the user
 * @param sUserLastname The last name of the user
 * @param sUserLoginname The login name of the User.
 * @param eUserEzsignaccess 
 * @param bUserIsactive Whether the User is active or not
 * @param pkiUserID The unique ID of the User
 * @param fkiAgentID The unique ID of the Agent.
 * @param fkiBrokerID The unique ID of the Broker.
 * @param fkiAssistantID The unique ID of the Assistant.
 * @param fkiEmployeeID The unique ID of the Employee.
 * @param objPhoneHome 
 * @param objPhoneSMS 
 * @param fkiSecretquestionID The unique ID of the Secretquestion.  Valid values:  |Value|Description| |-|-| |1|The name of the hospital in which you were born| |2|The name of your grade school| |3|The last name of your favorite teacher| |4|Your favorite sports team| |5|Your favorite TV show| |6|Your favorite movie| |7|The name of the street on which you grew up| |8|The name of your first employer| |9|Your first car| |10|Your favorite food| |11|The name of your first pet| |12|Favorite musician/band| |13|What instrument you play| |14|Your father's middle name| |15|Your mother's maiden name| |16|Name of your eldest child| |17|Your spouse's middle name| |18|Favorite restaurant| |19|Childhood nickname| |20|Favorite vacation destination| |21|Your boat's name| |22|Date of Birth (YYYY-MM-DD)|
 * @param sUserSecretresponse The answer to the Secretquestion
 * @param fkiModuleIDForm The unique ID of the Module
 * @param bUserValidatebyadministration Whether if the transactions in which the User is implicated must be validated by administrative personnel or not
 * @param bUserValidatebydirector Whether if the transactions in which the User is implicated must be validated by a director or not
 * @param bUserAttachmentautoverified Whether if Attachments uploaded by the User must be validated or not
 * @param bUserChangepassword Whether if the User is forced to change its password
 */


data class UserRequest (

    /* The unique ID of the Company */
    @Json(name = "fkiCompanyIDDefault")
    val fkiCompanyIDDefault: kotlin.Int,

    /* The unique ID of the Department */
    @Json(name = "fkiDepartmentIDDefault")
    val fkiDepartmentIDDefault: kotlin.Int,

    /* The unique ID of the Timezone */
    @Json(name = "fkiTimezoneID")
    val fkiTimezoneID: kotlin.Int,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    @Json(name = "objEmail")
    val objEmail: EmailRequestCompound,

    /* The unique ID of the Billingentityinternal. */
    @Json(name = "fkiBillingentityinternalID")
    val fkiBillingentityinternalID: kotlin.Int,

    @Json(name = "eUserType")
    val eUserType: FieldEUserType,

    @Json(name = "eUserLogintype")
    val eUserLogintype: FieldEUserLogintype,

    /* The first name of the user */
    @Json(name = "sUserFirstname")
    val sUserFirstname: kotlin.String,

    /* The last name of the user */
    @Json(name = "sUserLastname")
    val sUserLastname: kotlin.String,

    /* The login name of the User. */
    @Json(name = "sUserLoginname")
    val sUserLoginname: kotlin.String,

    @Json(name = "eUserEzsignaccess")
    val eUserEzsignaccess: FieldEUserEzsignaccess,

    /* Whether the User is active or not */
    @Json(name = "bUserIsactive")
    val bUserIsactive: kotlin.Boolean,

    /* The unique ID of the User */
    @Json(name = "pkiUserID")
    val pkiUserID: kotlin.Int? = null,

    /* The unique ID of the Agent. */
    @Json(name = "fkiAgentID")
    val fkiAgentID: kotlin.Int? = null,

    /* The unique ID of the Broker. */
    @Json(name = "fkiBrokerID")
    val fkiBrokerID: kotlin.Int? = null,

    /* The unique ID of the Assistant. */
    @Json(name = "fkiAssistantID")
    val fkiAssistantID: kotlin.Int? = null,

    /* The unique ID of the Employee. */
    @Json(name = "fkiEmployeeID")
    val fkiEmployeeID: kotlin.Int? = null,

    @Json(name = "objPhoneHome")
    val objPhoneHome: PhoneRequestCompound? = null,

    @Json(name = "objPhoneSMS")
    val objPhoneSMS: PhoneRequestCompound? = null,

    /* The unique ID of the Secretquestion.  Valid values:  |Value|Description| |-|-| |1|The name of the hospital in which you were born| |2|The name of your grade school| |3|The last name of your favorite teacher| |4|Your favorite sports team| |5|Your favorite TV show| |6|Your favorite movie| |7|The name of the street on which you grew up| |8|The name of your first employer| |9|Your first car| |10|Your favorite food| |11|The name of your first pet| |12|Favorite musician/band| |13|What instrument you play| |14|Your father's middle name| |15|Your mother's maiden name| |16|Name of your eldest child| |17|Your spouse's middle name| |18|Favorite restaurant| |19|Childhood nickname| |20|Favorite vacation destination| |21|Your boat's name| |22|Date of Birth (YYYY-MM-DD)| */
    @Json(name = "fkiSecretquestionID")
    val fkiSecretquestionID: kotlin.Int? = null,

    /* The answer to the Secretquestion */
    @Json(name = "sUserSecretresponse")
    val sUserSecretresponse: kotlin.String? = null,

    /* The unique ID of the Module */
    @Json(name = "fkiModuleIDForm")
    val fkiModuleIDForm: kotlin.Int? = null,

    /* Whether if the transactions in which the User is implicated must be validated by administrative personnel or not */
    @Json(name = "bUserValidatebyadministration")
    val bUserValidatebyadministration: kotlin.Boolean? = null,

    /* Whether if the transactions in which the User is implicated must be validated by a director or not */
    @Json(name = "bUserValidatebydirector")
    val bUserValidatebydirector: kotlin.Boolean? = null,

    /* Whether if Attachments uploaded by the User must be validated or not */
    @Json(name = "bUserAttachmentautoverified")
    val bUserAttachmentautoverified: kotlin.Boolean? = null,

    /* Whether if the User is forced to change its password */
    @Json(name = "bUserChangepassword")
    val bUserChangepassword: kotlin.Boolean? = null

)

