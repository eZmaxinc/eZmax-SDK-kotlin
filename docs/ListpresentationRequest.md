
# ListpresentationMinusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**sListpresentationDescription** | **kotlin.String** | A descriptive for the list presentation | 
**sListpresentationFilter** | **kotlin.String** | The filter to apply to the request to limit results. | 
**sListpresentationOrderby** | **kotlin.String** | The order by the user chose | 
**aSColumnName** | **kotlin.collections.List&lt;kotlin.String&gt;** | An array of column names that the user chose to bee visible | 
**iListpresentationRowMax** | **kotlin.Int** | The maximum numbers of results to be returned | 
**iListpresentationRowOffset** | **kotlin.Int** | The starting element from where to start retrieving the results. For example if you started at iRowOffset&#x3D;0 and asked for iRowMax&#x3D;100, to get the next 100 results, you could specify iRowOffset&#x3D;100&amp;iRowMax&#x3D;100, | 
**bListpresentationDefault** | **kotlin.Boolean** | Set to true if the user chose this Listpresentation as the default one. A single element should be set to true | 



