
# EzsignsignatureResponseCompound

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **dtEzsignsignatureDateInFolderTimezone** | **kotlin.String** | The date the Ezsignsignature was signed in folder&#39;s timezone |  [optional] |
| **bEzsignsignatureCustomdate** | **kotlin.Boolean** | Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is **Name** or **Handwritten**) |  [optional] |
| **aObjEzsignsignaturecustomdate** | [**kotlin.collections.List&lt;EzsignsignaturecustomdateResponseCompound&gt;**](EzsignsignaturecustomdateResponse.md) | An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsignsignatureCustomdate is true.  Use an empty array if you don&#39;t want to have a date at all. |  [optional] |
| **objCreditcardtransaction** | [**CustomCreditcardtransactionResponse**](CustomCreditcardtransactionResponse.md) |  |  [optional] |
| **aObjEzsignelementdependency** | [**kotlin.collections.List&lt;EzsignelementdependencyResponseCompound&gt;**](EzsignelementdependencyResponse.md) |  |  [optional] |
| **objTimezone** | [**CustomTimezoneWithCodeResponse**](CustomTimezoneWithCodeResponse.md) |  |  [optional] |



