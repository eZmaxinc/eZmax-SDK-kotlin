
# EzsignsignatureResponseCompoundAllOf

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**bEzsignsignatureCustomdate** | **kotlin.Boolean** | Whether the Ezsignsignature has a custom date format or not. (Only possible when eEzsignsignatureType is **Name** or **Handwritten**) |  [optional]
**aObjEzsignsignaturecustomdate** | [**kotlin.collections.List&lt;EzsignsignaturecustomdateMinusResponseCompound&gt;**](EzsignsignaturecustomdateMinusResponseCompound.md) | An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsignsignatureCustomdate is true.  Use an empty array if you don&#39;t want to have a date at all. |  [optional]
**objCreditcardtransaction** | [**CustomMinusCreditcardtransactionMinusResponse**](CustomMinusCreditcardtransactionMinusResponse.md) |  |  [optional]



