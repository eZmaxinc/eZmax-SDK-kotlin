
# CustomDnsrecordResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eDnsrecordType** | [**inline**](#EDnsrecordType) | The type of the Dnsrecord |  |
| **eDnsrecordValidation** | [**inline**](#EDnsrecordValidation) | The validation of the Dnsrecord |  |
| **sDnsrecordName** | **kotlin.String** | The name of the Dnsrecord |  |
| **bDnsrecordMustMatch** | **kotlin.Boolean** | Whether the Dnsrecord must match or not |  |
| **sDnsrecordValue** | **kotlin.String** | The value of the Dnsrecord |  [optional] |
| **sDnsrecordExpectedvalue** | **kotlin.String** | The expected value of the Dnsrecord |  [optional] |


<a id="EDnsrecordType"></a>
## Enum: eDnsrecordType
| Name | Value |
| ---- | ----- |
| eDnsrecordType | CNAME, MX, TXT |


<a id="EDnsrecordValidation"></a>
## Enum: eDnsrecordValidation
| Name | Value |
| ---- | ----- |
| eDnsrecordValidation | Match, Mismatch, NotFound |



