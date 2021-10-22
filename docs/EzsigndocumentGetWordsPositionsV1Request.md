
# EzsigndocumentMinusGetWordsPositionsMinusV1MinusRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eGet** | [**inline**](#EGet) | Specify if you want to retrieve *All* words or specific *Words* from the document. If you specify *Words*, you must send the list of words to search for in *a_sWord*. | 
**bWordCaseSensitive** | **kotlin.Boolean** | IF *true*, words will be searched case-sensitive and results will be returned case-sensitive. IF *false*, words will be searched case-insensitive and results will be returned case-insensitive. | 
**aSWord** | **kotlin.collections.List&lt;kotlin.String&gt;** | Array of words to find in the document |  [optional]


<a name="EGet"></a>
## Enum: eGet
Name | Value
---- | -----
eGet | All, Words



