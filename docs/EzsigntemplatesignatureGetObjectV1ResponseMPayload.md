
# EzsigntemplatesignatureMinusGetObjectMinusV1MinusResponseMinusMPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsigntemplatesignatureID** | **kotlin.Int** | The unique ID of the Ezsigntemplatesignature | 
**fkiEzsigntemplatedocumentID** | **kotlin.Int** | The unique ID of the Ezsigntemplatedocument | 
**fkiEzsigntemplatesignerID** | **kotlin.Int** | The unique ID of the Ezsigntemplatesigner | 
**iEzsigntemplatedocumentpagePagenumber** | **kotlin.Int** | The page number in the Ezsigntemplatedocument | 
**iEzsigntemplatesignatureX** | **kotlin.Int** | The X coordinate (Horizontal) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 2 inches from the left border of the page, you would use \&quot;200\&quot; for the X coordinate. | 
**iEzsigntemplatesignatureY** | **kotlin.Int** | The Y coordinate (Vertical) where to put the Ezsigntemplatesignature on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsigntemplatesignature 3 inches from the top border of the page, you would use \&quot;300\&quot; for the Y coordinate. | 
**iEzsigntemplatesignatureStep** | **kotlin.Int** | The step when the Ezsigntemplatesigner will be invited to sign | 
**eEzsigntemplatesignatureType** | [**FieldMinusEEzsigntemplatesignatureType**](FieldMinusEEzsigntemplatesignatureType.md) |  | 
**tEzsigntemplatesignatureTooltip** | **kotlin.String** | A tooltip that will be presented to Ezsigntemplatesigner about the Ezsigntemplatesignature |  [optional]
**eEzsigntemplatesignatureTooltipposition** | [**FieldMinusEEzsigntemplatesignatureTooltipposition**](FieldMinusEEzsigntemplatesignatureTooltipposition.md) |  |  [optional]
**eEzsigntemplatesignatureFont** | [**FieldMinusEEzsigntemplatesignatureFont**](FieldMinusEEzsigntemplatesignatureFont.md) |  |  [optional]
**bEzsigntemplatesignatureCustomdate** | **kotlin.Boolean** | Whether the Ezsigntemplatesignature has a custom date format or not. (Only possible when eEzsigntemplatesignatureType is **Name** or **Handwritten**) |  [optional]
**aObjEzsigntemplatesignaturecustomdate** | [**kotlin.collections.List&lt;EzsigntemplatesignaturecustomdateMinusResponseCompound&gt;**](EzsigntemplatesignaturecustomdateMinusResponseCompound.md) | An array of custom date blocks that will be filled at the time of signature.  Can only be used if bEzsigntemplatesignatureCustomdate is true.  Use an empty array if you don&#39;t want to have a date at all. |  [optional]



