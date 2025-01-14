
# CustomEzsignsignaturestatusResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eEzsignsignaturestatusSteptype** | [**inline**](#EEzsignsignaturestatusSteptype) | Type of step |  |
| **iEzsignsignaturestatusStep** | **kotlin.Int** | The step at which the Ezsignsigner will be invited to sign or fill the form fields |  |
| **iEzsignsignaturestatusTotal** | **kotlin.Int** | The total number of signature or form fields the Ezsignsigner must process at the current step |  |
| **iEzsignsignaturestatusSigned** | **kotlin.Int** | The number of signature or form fields the Ezsignsigner has already processed at the current step |  |
| **iEzsignsignaturestatusConditional** | **kotlin.Int** | The number of signature or form fields the Ezsignsigner need to sign or fill under current conditions. |  |


<a id="EEzsignsignaturestatusSteptype"></a>
## Enum: eEzsignsignaturestatusSteptype
| Name | Value |
| ---- | ----- |
| eEzsignsignaturestatusSteptype | Form, Signature |



