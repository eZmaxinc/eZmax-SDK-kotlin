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

import eZmaxApi.models.EzsigntemplatepublicRequest
import eZmaxApi.models.FieldEEzsigntemplatepublicLimittype

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsigntemplatepublic Object and children
 *
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param fkiUserlogintypeID The unique ID of the Userlogintype  Valid values:  |Value|Description|Detail| |-|-|-| |1|**Email Only**|The Ezsignsigner will receive a secure link by email| |2|**Email and phone or SMS**|The Ezsignsigner will receive a secure link by email and will need to authenticate using SMS or Phone call. **Additional fee applies**| |3|**Email and secret question**|The Ezsignsigner will receive a secure link by email and will need to authenticate using a predefined question and answer| |4|**In person only**|The Ezsignsigner will only be able to sign \"In-Person\" and there won't be any authentication. No email will be sent for invitation to sign. Make sure you evaluate the risk of signature denial and at minimum, we recommend you use a handwritten signature type| |5|**In person with phone or SMS**|The Ezsignsigner will only be able to sign \"In-Person\" and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**| |6|**Embedded**|The Ezsignsigner will only be able to sign in the embedded solution. No email will be sent for invitation to sign. **Additional fee applies**|   |7|**Embedded with phone or SMS**|The Ezsignsigner will only be able to sign in the embedded solution and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**|   |8|**No validation**|The Ezsignsigner will not receive an email and won't have to validate his connection using 2 factor. **Additional fee applies**|      |9|**Sms only**|The Ezsignsigner will not receive an email but will will need to authenticate using SMS. **Additional fee applies**|     
 * @param sEzsigntemplatepublicDescription The description of the Ezsigntemplatepublic
 * @param bEzsigntemplatepublicIsactive Whether the ezsigntemplatepublic is active or not
 * @param tEzsigntemplatepublicNote The note of the Ezsigntemplatepublic
 * @param eEzsigntemplatepublicLimittype 
 * @param iEzsigntemplatepublicLimit The limit of the Ezsigntemplatepublic
 * @param pkiEzsigntemplatepublicID The unique ID of the Ezsigntemplatepublic
 * @param fkiEzsigntemplateID The unique ID of the Ezsigntemplate
 * @param fkiEzsigntemplatepackageID The unique ID of the Ezsigntemplatepackage
 */


class EzsigntemplatepublicRequestCompound (

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    override val fkiEzsignfoldertypeID: kotlin.Int,

    /* The unique ID of the Userlogintype  Valid values:  |Value|Description|Detail| |-|-|-| |1|**Email Only**|The Ezsignsigner will receive a secure link by email| |2|**Email and phone or SMS**|The Ezsignsigner will receive a secure link by email and will need to authenticate using SMS or Phone call. **Additional fee applies**| |3|**Email and secret question**|The Ezsignsigner will receive a secure link by email and will need to authenticate using a predefined question and answer| |4|**In person only**|The Ezsignsigner will only be able to sign \"In-Person\" and there won't be any authentication. No email will be sent for invitation to sign. Make sure you evaluate the risk of signature denial and at minimum, we recommend you use a handwritten signature type| |5|**In person with phone or SMS**|The Ezsignsigner will only be able to sign \"In-Person\" and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**| |6|**Embedded**|The Ezsignsigner will only be able to sign in the embedded solution. No email will be sent for invitation to sign. **Additional fee applies**|   |7|**Embedded with phone or SMS**|The Ezsignsigner will only be able to sign in the embedded solution and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**|   |8|**No validation**|The Ezsignsigner will not receive an email and won't have to validate his connection using 2 factor. **Additional fee applies**|      |9|**Sms only**|The Ezsignsigner will not receive an email but will will need to authenticate using SMS. **Additional fee applies**|      */
    @Json(name = "fkiUserlogintypeID")
    override val fkiUserlogintypeID: kotlin.Int,

    /* The description of the Ezsigntemplatepublic */
    @Json(name = "sEzsigntemplatepublicDescription")
    override val sEzsigntemplatepublicDescription: kotlin.String,

    /* Whether the ezsigntemplatepublic is active or not */
    @Json(name = "bEzsigntemplatepublicIsactive")
    override val bEzsigntemplatepublicIsactive: kotlin.Boolean,

    /* The note of the Ezsigntemplatepublic */
    @Json(name = "tEzsigntemplatepublicNote")
    override val tEzsigntemplatepublicNote: kotlin.String,

    @Json(name = "eEzsigntemplatepublicLimittype")
    override val eEzsigntemplatepublicLimittype: FieldEEzsigntemplatepublicLimittype,

    /* The limit of the Ezsigntemplatepublic */
    @Json(name = "iEzsigntemplatepublicLimit")
    override val iEzsigntemplatepublicLimit: kotlin.Int,

    /* The unique ID of the Ezsigntemplatepublic */
    @Json(name = "pkiEzsigntemplatepublicID")
    override val pkiEzsigntemplatepublicID: kotlin.Int? = null,

    /* The unique ID of the Ezsigntemplate */
    @Json(name = "fkiEzsigntemplateID")
    override val fkiEzsigntemplateID: kotlin.Int? = null,

    /* The unique ID of the Ezsigntemplatepackage */
    @Json(name = "fkiEzsigntemplatepackageID")
    override val fkiEzsigntemplatepackageID: kotlin.Int? = null

) : EzsigntemplatepublicRequest {


}

