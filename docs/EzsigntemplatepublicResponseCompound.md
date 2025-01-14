
# EzsigntemplatepublicResponseCompound

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pkiEzsigntemplatepublicID** | **kotlin.Int** | The unique ID of the Ezsigntemplatepublic |  |
| **fkiEzsignfoldertypeID** | **kotlin.Int** | The unique ID of the Ezsignfoldertype. |  |
| **sEzsignfoldertypeNameX** | **kotlin.String** | The name of the Ezsignfoldertype in the language of the requester |  |
| **fkiUserlogintypeID** | **kotlin.Int** | The unique ID of the Userlogintype  Valid values:  |Value|Description|Detail| |-|-|-| |1|**Email Only**|The Ezsignsigner will receive a secure link by email| |2|**Email and phone or SMS**|The Ezsignsigner will receive a secure link by email and will need to authenticate using SMS or Phone call. **Additional fee applies**| |3|**Email and secret question**|The Ezsignsigner will receive a secure link by email and will need to authenticate using a predefined question and answer| |4|**In person only**|The Ezsignsigner will only be able to sign \&quot;In-Person\&quot; and there won&#39;t be any authentication. No email will be sent for invitation to sign. Make sure you evaluate the risk of signature denial and at minimum, we recommend you use a handwritten signature type| |5|**In person with phone or SMS**|The Ezsignsigner will only be able to sign \&quot;In-Person\&quot; and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**| |6|**Embedded**|The Ezsignsigner will only be able to sign in the embedded solution. No email will be sent for invitation to sign. **Additional fee applies**|   |7|**Embedded with phone or SMS**|The Ezsignsigner will only be able to sign in the embedded solution and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**|   |8|**No validation**|The Ezsignsigner will not receive an email and won&#39;t have to validate his connection using 2 factor. **Additional fee applies**|      |9|**Sms only**|The Ezsignsigner will not receive an email but will will need to authenticate using SMS. **Additional fee applies**|      |  |
| **sUserlogintypeDescriptionX** | **kotlin.String** | The description of the Userlogintype in the language of the requester |  |
| **sEzsigntemplatepublicDescription** | **kotlin.String** | The description of the Ezsigntemplatepublic |  |
| **sEzsigntemplatepublicReferenceid** | **kotlin.String** | The referenceid of the Ezsigntemplatepublic |  |
| **bEzsigntemplatepublicIsactive** | **kotlin.Boolean** | Whether the ezsigntemplatepublic is active or not |  |
| **tEzsigntemplatepublicNote** | **kotlin.String** | The note of the Ezsigntemplatepublic |  |
| **eEzsigntemplatepublicLimittype** | [**FieldEEzsigntemplatepublicLimittype**](FieldEEzsigntemplatepublicLimittype.md) |  |  |
| **iEzsigntemplatepublicLimit** | **kotlin.Int** | The limit of the Ezsigntemplatepublic |  |
| **iEzsigntemplatepublicLimitexceeded** | **kotlin.Int** | The limitexceeded of the Ezsigntemplatepublic |  |
| **dtEzsigntemplatepublicLimitexceededsince** | **kotlin.String** | The limitexceededsince of the Ezsigntemplatepublic |  |
| **sEzsigntemplatepublicUrl** | **kotlin.String** | The url of the Ezsigntemplatepublic  You can add these value as query parameters to prefill the corresponding role  |Parameter|Description| |-|-| |sEzsigntemplatesignerDescription|The role to fill| |sContactFirstname|The contact firstname| |sContactLastname|The contact lastname| |sEmailAddress|The contact email| |sPhoneE164|The contact phone number| |sPhoneE164Cell|The contact cell phone number| |  |
| **sEzsigntemplatepublicEzsigntemplatedescription** | **kotlin.String** | The Ezsigntemplate/Ezsigntemplatepackage description |  |
| **aObjEzsignfolderezsigntemplatepublic** | [**kotlin.collections.List&lt;CustomEzsignfolderezsigntemplatepublicResponse&gt;**](CustomEzsignfolderezsigntemplatepublicResponse.md) |  |  |
| **fkiEzsigntemplateID** | **kotlin.Int** | The unique ID of the Ezsigntemplate |  [optional] |
| **fkiEzsigntemplatepackageID** | **kotlin.Int** | The unique ID of the Ezsigntemplatepackage |  [optional] |
| **objAudit** | [**CommonAudit**](CommonAudit.md) |  |  [optional] |



