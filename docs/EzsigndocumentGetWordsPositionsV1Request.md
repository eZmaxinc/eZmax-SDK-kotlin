
# EzsigndocumentMinusGetWordsPositionsMinusV1MinusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eGet** | [**inline**](#EGetEnum) | Specify if you want to retrieve *All* words or specific *Words* from the document. If you specify *Words*, you must send the list of words to search in *a_sWord*. |  [optional]
**aSWord** | **kotlin.collections.List&lt;kotlin.String&gt;** | Array of words to find in the document |  [optional]


<a name="EGetEnum"></a>
## Enum: eGet
Name | Value
---- | -----
eGet | All, Words



