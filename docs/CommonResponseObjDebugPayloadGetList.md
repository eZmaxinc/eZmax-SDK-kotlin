
# CommonMinusResponseMinusObjDebugPayloadGetList

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**iVersionMin** | **kotlin.Int** | The minimum version of the function that can be called | 
**iVersionMax** | **kotlin.Int** | The maximum version of the function that can be called | 
**aRequiredPermission** | **kotlin.collections.List&lt;kotlin.Int&gt;** | An array of permissions required to access this function.  If the value \&quot;0\&quot; is present in the array, anyone can call this function.  You must have one of the permission to access the function. You don&#39;t need to have all of them. | 
**aFilter** | [**CommonMinusResponseMinusFilter**](CommonMinusResponseMinusFilter.md) |  | 
**aOrderBy** | **kotlin.collections.Map&lt;kotlin.String, kotlin.String&gt;** | List of available values for *eOrderBy* | 



