
# EzmaxinvoicingGetProvisionalV1ResponseMPayload

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **fkiEzmaxinvoicingcontractID** | **kotlin.Int** | The unique ID of the Ezmaxinvoicingcontract |  |
| **fkiEzmaxpricingID** | **kotlin.Int** | The unique ID of the Ezmaxpricing |  |
| **fkiSystemconfigurationtypeID** | **kotlin.Int** | The unique ID of the Systemconfigurationtype |  |
| **sSystemconfigurationtypeDescriptionX** | **kotlin.String** | The description of the Systemconfigurationtype in the language of the requester |  |
| **yyyymmEzmaxinvoicing** | **kotlin.String** | The YYYYMM period of the Ezmaxinvoicing |  |
| **iEzmaxinvoicingDays** | **kotlin.Int** | The number of days invoiced |  |
| **eEzmaxinvoicingPaymenttype** | [**FieldEEzmaxinvoicingPaymenttype**](FieldEEzmaxinvoicingPaymenttype.md) |  |  |
| **dEzmaxinvoicingRebatepaymenttype** | **kotlin.String** | The percentage of rebate depending of the payment type |  |
| **iEzmaxinvoicingContractlength** | **kotlin.Int** | The length of the contract in years |  |
| **dEzmaxinvoicingRebatecontractlength** | **kotlin.String** | The percentage of rebate depending of the contract length |  |
| **bEzmaxinvoicingRebateEzsignallagents** | **kotlin.Boolean** | Whether the rebate for eZsign is for all agents |  |
| **objEzmaxinvoicingcontract** | [**EzmaxinvoicingcontractResponseCompound**](EzmaxinvoicingcontractResponseCompound.md) |  |  |
| **objEzmaxpricing** | [**CustomEzmaxpricingResponse**](CustomEzmaxpricingResponse.md) |  |  |
| **aObjEzmaxinvoicingsummaryglobal** | [**kotlin.collections.List&lt;EzmaxinvoicingsummaryglobalResponseCompound&gt;**](EzmaxinvoicingsummaryglobalResponseCompound.md) |  |  |
| **aObjEzmaxinvoicingsummaryexternal** | [**kotlin.collections.List&lt;EzmaxinvoicingsummaryexternalResponseCompound&gt;**](EzmaxinvoicingsummaryexternalResponseCompound.md) |  |  |
| **aObjEzmaxinvoicingsummaryinternal** | [**kotlin.collections.List&lt;EzmaxinvoicingsummaryinternalResponseCompound&gt;**](EzmaxinvoicingsummaryinternalResponseCompound.md) |  |  |
| **aObjEzmaxinvoicingagent** | [**kotlin.collections.List&lt;EzmaxinvoicingagentResponseCompound&gt;**](EzmaxinvoicingagentResponseCompound.md) |  |  |
| **aObjEzmaxinvoicinguser** | [**kotlin.collections.List&lt;EzmaxinvoicinguserResponseCompound&gt;**](EzmaxinvoicinguserResponseCompound.md) |  |  |
| **aObjEzmaxinvoicingezsignfolder** | [**kotlin.collections.List&lt;CustomEzmaxinvoicingEzsignfolderResponse&gt;**](CustomEzmaxinvoicingEzsignfolderResponse.md) |  |  |
| **aObjEzmaxinvoicingezsigndocument** | [**kotlin.collections.List&lt;CustomEzmaxinvoicingEzsigndocumentResponse&gt;**](CustomEzmaxinvoicingEzsigndocumentResponse.md) |  |  |
| **pkiEzmaxinvoicingID** | **kotlin.Int** | The unique ID of the Ezmaxinvoicing |  [optional] |
| **objAudit** | [**CommonAudit**](CommonAudit.md) |  |  [optional] |



