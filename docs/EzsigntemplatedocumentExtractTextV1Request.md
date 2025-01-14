
# EzsigntemplatedocumentExtractTextV1Request

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **iPage** | **kotlin.Int** | The page where the area is located |  |
| **eSection** | [**inline**](#ESection) | The section of the page |  [optional] |
| **iX** | **kotlin.Int** | The X coordinate (Horizontal). Require when eSection &#x3D; &#39;Region&#39; or eSection is not set. |  [optional] |
| **iY** | **kotlin.Int** | The Y coordinate (Vertical). Require when eSection &#x3D; &#39;Region&#39; or eSection is not set. |  [optional] |
| **iWidth** | **kotlin.Int** | Area&#39;s width. Require when eSection &#x3D; &#39;Region&#39; or eSection is not set. |  [optional] |
| **iHeight** | **kotlin.Int** | Area&#39;s height. Require when eSection &#x3D; &#39;Region&#39; or eSection is not set. |  [optional] |


<a id="ESection"></a>
## Enum: eSection
| Name | Value |
| ---- | ----- |
| eSection | FirstLine, LastLine, Region |



