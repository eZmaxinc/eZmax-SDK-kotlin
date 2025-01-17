
# EzsigntemplatesignatureRequestCompoundV2

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **bEzsigntemplatesignatureCustomdate** | **kotlin.Boolean** | Whether the Ezsigntemplatesignature has a custom date format or not. (Only possible when eEzsigntemplatesignatureType is **Name** or **Handwritten**) |  [optional] |
| **aObjEzsigntemplatesignaturecustomdate** | [**kotlin.collections.List&lt;EzsigntemplatesignaturecustomdateRequestCompoundV2&gt;**](EzsigntemplatesignaturecustomdateRequestV2.md) | An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsigntemplatesignatureCustomdate is true.  Use an empty array if you don&#39;t want to have a date at all. |  [optional] |
| **aObjEzsigntemplateelementdependency** | [**kotlin.collections.List&lt;EzsigntemplateelementdependencyRequestCompound&gt;**](EzsigntemplateelementdependencyRequest.md) |  |  [optional] |



