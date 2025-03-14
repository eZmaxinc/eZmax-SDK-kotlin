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
import eZmaxApi.models.FieldEEzsigntemplatepublicLimittype

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsigntemplatepublic Object
 *
 * @param pkiEzsigntemplatepublicID The unique ID of the Ezsigntemplatepublic
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param sEzsignfoldertypeNameX The name of the Ezsignfoldertype in the language of the requester
 * @param fkiUserlogintypeID The unique ID of the Userlogintype  Valid values:  |Value|Description|Detail| |-|-|-| |1|**Email Only**|The Ezsignsigner will receive a secure link by email| |2|**Email and phone or SMS**|The Ezsignsigner will receive a secure link by email and will need to authenticate using SMS or Phone call. **Additional fee applies**| |3|**Email and secret question**|The Ezsignsigner will receive a secure link by email and will need to authenticate using a predefined question and answer| |4|**In person only**|The Ezsignsigner will only be able to sign \"In-Person\" and there won't be any authentication. No email will be sent for invitation to sign. Make sure you evaluate the risk of signature denial and at minimum, we recommend you use a handwritten signature type| |5|**In person with phone or SMS**|The Ezsignsigner will only be able to sign \"In-Person\" and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**| |6|**Embedded**|The Ezsignsigner will only be able to sign in the embedded solution. No email will be sent for invitation to sign. **Additional fee applies**|   |7|**Embedded with phone or SMS**|The Ezsignsigner will only be able to sign in the embedded solution and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**|   |8|**No validation**|The Ezsignsigner will not receive an email and won't have to validate his connection using 2 factor. **Additional fee applies**|      |9|**Sms only**|The Ezsignsigner will not receive an email but will will need to authenticate using SMS. **Additional fee applies**|     
 * @param sUserlogintypeDescriptionX The description of the Userlogintype in the language of the requester
 * @param sEzsigntemplatepublicDescription The description of the Ezsigntemplatepublic
 * @param sEzsigntemplatepublicReferenceid The referenceid of the Ezsigntemplatepublic
 * @param bEzsigntemplatepublicIsactive Whether the ezsigntemplatepublic is active or not
 * @param tEzsigntemplatepublicNote The note of the Ezsigntemplatepublic
 * @param eEzsigntemplatepublicLimittype 
 * @param iEzsigntemplatepublicLimit The limit of the Ezsigntemplatepublic
 * @param iEzsigntemplatepublicLimitexceeded The limitexceeded of the Ezsigntemplatepublic
 * @param dtEzsigntemplatepublicLimitexceededsince The limitexceededsince of the Ezsigntemplatepublic
 * @param sEzsigntemplatepublicUrl The url of the Ezsigntemplatepublic  You can add these value as query parameters to prefill the corresponding role  |Parameter|Description| |-|-| |sEzsigntemplatesignerDescription|The role to fill| |sContactFirstname|The contact firstname| |sContactLastname|The contact lastname| |sEmailAddress|The contact email| |sPhoneE164|The contact phone number| |sPhoneE164Cell|The contact cell phone number|
 * @param sEzsigntemplatepublicEzsigntemplatedescription The Ezsigntemplate/Ezsigntemplatepackage description
 * @param fkiEzsigntemplateID The unique ID of the Ezsigntemplate
 * @param fkiEzsigntemplatepackageID The unique ID of the Ezsigntemplatepackage
 * @param objAudit 
 */


data class EzsigntemplatepublicResponse (

    /* The unique ID of the Ezsigntemplatepublic */
    @Json(name = "pkiEzsigntemplatepublicID")
    val pkiEzsigntemplatepublicID: kotlin.Int,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int,

    /* The name of the Ezsignfoldertype in the language of the requester */
    @Json(name = "sEzsignfoldertypeNameX")
    val sEzsignfoldertypeNameX: kotlin.String,

    /* The unique ID of the Userlogintype  Valid values:  |Value|Description|Detail| |-|-|-| |1|**Email Only**|The Ezsignsigner will receive a secure link by email| |2|**Email and phone or SMS**|The Ezsignsigner will receive a secure link by email and will need to authenticate using SMS or Phone call. **Additional fee applies**| |3|**Email and secret question**|The Ezsignsigner will receive a secure link by email and will need to authenticate using a predefined question and answer| |4|**In person only**|The Ezsignsigner will only be able to sign \"In-Person\" and there won't be any authentication. No email will be sent for invitation to sign. Make sure you evaluate the risk of signature denial and at minimum, we recommend you use a handwritten signature type| |5|**In person with phone or SMS**|The Ezsignsigner will only be able to sign \"In-Person\" and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**| |6|**Embedded**|The Ezsignsigner will only be able to sign in the embedded solution. No email will be sent for invitation to sign. **Additional fee applies**|   |7|**Embedded with phone or SMS**|The Ezsignsigner will only be able to sign in the embedded solution and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**|   |8|**No validation**|The Ezsignsigner will not receive an email and won't have to validate his connection using 2 factor. **Additional fee applies**|      |9|**Sms only**|The Ezsignsigner will not receive an email but will will need to authenticate using SMS. **Additional fee applies**|      */
    @Json(name = "fkiUserlogintypeID")
    val fkiUserlogintypeID: kotlin.Int,

    /* The description of the Userlogintype in the language of the requester */
    @Json(name = "sUserlogintypeDescriptionX")
    val sUserlogintypeDescriptionX: kotlin.String,

    /* The description of the Ezsigntemplatepublic */
    @Json(name = "sEzsigntemplatepublicDescription")
    val sEzsigntemplatepublicDescription: kotlin.String,

    /* The referenceid of the Ezsigntemplatepublic */
    @Json(name = "sEzsigntemplatepublicReferenceid")
    val sEzsigntemplatepublicReferenceid: kotlin.String,

    /* Whether the ezsigntemplatepublic is active or not */
    @Json(name = "bEzsigntemplatepublicIsactive")
    val bEzsigntemplatepublicIsactive: kotlin.Boolean,

    /* The note of the Ezsigntemplatepublic */
    @Json(name = "tEzsigntemplatepublicNote")
    val tEzsigntemplatepublicNote: kotlin.String,

    @Json(name = "eEzsigntemplatepublicLimittype")
    val eEzsigntemplatepublicLimittype: FieldEEzsigntemplatepublicLimittype,

    /* The limit of the Ezsigntemplatepublic */
    @Json(name = "iEzsigntemplatepublicLimit")
    val iEzsigntemplatepublicLimit: kotlin.Int,

    /* The limitexceeded of the Ezsigntemplatepublic */
    @Json(name = "iEzsigntemplatepublicLimitexceeded")
    val iEzsigntemplatepublicLimitexceeded: kotlin.Int,

    /* The limitexceededsince of the Ezsigntemplatepublic */
    @Json(name = "dtEzsigntemplatepublicLimitexceededsince")
    val dtEzsigntemplatepublicLimitexceededsince: kotlin.String,

    /* The url of the Ezsigntemplatepublic  You can add these value as query parameters to prefill the corresponding role  |Parameter|Description| |-|-| |sEzsigntemplatesignerDescription|The role to fill| |sContactFirstname|The contact firstname| |sContactLastname|The contact lastname| |sEmailAddress|The contact email| |sPhoneE164|The contact phone number| |sPhoneE164Cell|The contact cell phone number| */
    @Json(name = "sEzsigntemplatepublicUrl")
    val sEzsigntemplatepublicUrl: kotlin.String,

    /* The Ezsigntemplate/Ezsigntemplatepackage description */
    @Json(name = "sEzsigntemplatepublicEzsigntemplatedescription")
    val sEzsigntemplatepublicEzsigntemplatedescription: kotlin.String,

    /* The unique ID of the Ezsigntemplate */
    @Json(name = "fkiEzsigntemplateID")
    val fkiEzsigntemplateID: kotlin.Int? = null,

    /* The unique ID of the Ezsigntemplatepackage */
    @Json(name = "fkiEzsigntemplatepackageID")
    val fkiEzsigntemplatepackageID: kotlin.Int? = null,

    @Json(name = "objAudit")
    val objAudit: CommonAudit? = null

) {


}

