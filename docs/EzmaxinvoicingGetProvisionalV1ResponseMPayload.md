
# EzmaxinvoicingMinusGetProvisionalMinusV1MinusResponseMinusMPayload

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**fkiEzmaxinvoicingcontractID** | **kotlin.Int** | The unique ID of the Ezmaxinvoicingcontract | 
**fkiEzmaxpricingID** | **kotlin.Int** | The unique ID of the Ezmaxpricing | 
**fkiSystemconfigurationtypeID** | **kotlin.Int** | The unique ID of the Systemconfigurationtype | 
**sSystemconfigurationtypeDescriptionX** | **kotlin.String** | The description of the Systemconfigurationtype in the language of the requester | 
**yyyymmEzmaxinvoicing** | **kotlin.String** | The YYYYMM period of the Ezmaxinvoicing | 
**iEzmaxinvoicingDays** | **kotlin.Int** | The number of days invoiced | 
**eEzmaxinvoicingPaymenttype** | [**FieldMinusEEzmaxinvoicingPaymenttype**](FieldMinusEEzmaxinvoicingPaymenttype.md) |  | 
**dEzmaxinvoicingRebatepaymenttype** | **kotlin.String** | The percentage of rebate depending of the payment type | 
**iEzmaxinvoicingContractlength** | **kotlin.Int** | The length of the contract in years | 
**dEzmaxinvoicingRebatecontractlength** | **kotlin.String** | The percentage of rebate depending of the contract length | 
**bEzmaxinvoicingRebateEzsignallagents** | **kotlin.Boolean** | Whether the rebate for eZsign is for all agents | 
**objEzmaxinvoicingcontract** | [**EzmaxinvoicingcontractMinusResponseCompound**](EzmaxinvoicingcontractMinusResponseCompound.md) |  | 
**objEzmaxpricing** | [**CustomMinusEzmaxpricingMinusResponse**](CustomMinusEzmaxpricingMinusResponse.md) |  | 
**aObjEzmaxinvoicingsummaryglobal** | [**kotlin.collections.List&lt;EzmaxinvoicingsummaryglobalMinusResponseCompound&gt;**](EzmaxinvoicingsummaryglobalMinusResponseCompound.md) |  | 
**aObjEzmaxinvoicingsummaryexternal** | [**kotlin.collections.List&lt;EzmaxinvoicingsummaryexternalMinusResponseCompound&gt;**](EzmaxinvoicingsummaryexternalMinusResponseCompound.md) |  | 
**aObjEzmaxinvoicingsummaryinternal** | [**kotlin.collections.List&lt;EzmaxinvoicingsummaryinternalMinusResponseCompound&gt;**](EzmaxinvoicingsummaryinternalMinusResponseCompound.md) |  | 
**aObjEzmaxinvoicingagent** | [**kotlin.collections.List&lt;EzmaxinvoicingagentMinusResponseCompound&gt;**](EzmaxinvoicingagentMinusResponseCompound.md) |  | 
**aObjEzmaxinvoicinguser** | [**kotlin.collections.List&lt;EzmaxinvoicinguserMinusResponseCompound&gt;**](EzmaxinvoicinguserMinusResponseCompound.md) |  | 
**aObjEzmaxinvoicingezsignfolder** | [**kotlin.collections.List&lt;CustomMinusEzmaxinvoicingEzsignfolderMinusResponse&gt;**](CustomMinusEzmaxinvoicingEzsignfolderMinusResponse.md) |  | 
**aObjEzmaxinvoicingezsigndocument** | [**kotlin.collections.List&lt;CustomMinusEzmaxinvoicingEzsigndocumentMinusResponse&gt;**](CustomMinusEzmaxinvoicingEzsigndocumentMinusResponse.md) |  | 
**pkiEzmaxinvoicingID** | **kotlin.Int** | The unique ID of the Ezmaxinvoicing |  [optional]
**objAudit** | [**CommonMinusAudit**](CommonMinusAudit.md) |  |  [optional]



