
# EzsignfolderMinusListElement

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsignfolderID** | **kotlin.Int** | The unique ID of the Ezsignfolder | 
**fkiEzsignfoldertypeID** | **kotlin.Int** | The unique ID of the Ezsignfoldertype. | 
**sEzsignfoldertypeNameX** | **kotlin.String** | The name of the Ezsignfoldertype in the language of the requester | 
**sEzsignfolderDescription** | **kotlin.String** | The description of the Ezsign Folder | 
**eEzsignfolderStep** | [**FieldMinusEEzsignfolderStep**](FieldMinusEEzsignfolderStep.md) |  | 
**dtCreatedDate** | **kotlin.String** | The date and time at which the object was created | 
**dtEzsignfolderSentdate** | [**OneOfLessThanStringCommaObjectGreaterThan**](OneOfLessThanStringCommaObjectGreaterThan.md) |  | 
**dtDueDate** | [**OneOfLessThanStringCommaObjectGreaterThan**](OneOfLessThanStringCommaObjectGreaterThan.md) | The date at which no more signature will be accepted on the folder | 
**iTotalDocument** | **kotlin.Int** | The total number of Ezsigndocument in the folder | 
**iTotalDocumentEdm** | **kotlin.Int** | The total number of Ezsigndocument in the folder that were saved in the edm system | 
**iTotalSignature** | **kotlin.Int** | The total number of signature blocks in all Ezsigndocuments in the folder | 
**iTotalSignatureSigned** | **kotlin.Int** | The total number of already signed signature blocks in all Ezsigndocuments in the folder | 



