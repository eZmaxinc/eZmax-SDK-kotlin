
# CustomEzsignsignaturestatusResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**eEzsignsignaturestatusSteptype** | [**inline**](#EEzsignsignaturestatusSteptype) | Type of step | 
**iEzsignsignaturestatusStep** | **kotlin.Int** | The step at which the Ezsignsigner will be invited to sign or fill the form fields | 
**iEzsignsignaturestatusTotal** | **kotlin.Int** | The total number of signature or form fields the Ezsignsigner must process at the current step | 
**iEzsignsignaturestatusSigned** | **kotlin.Int** | The number of signature or form fields the Ezsignsigner has already processed at the current step | 


<a id="EEzsignsignaturestatusSteptype"></a>
## Enum: eEzsignsignaturestatusSteptype
Name | Value
---- | -----
eEzsignsignaturestatusSteptype | Form, Signature



