
# EzdoctemplatedocumentRequestPatch

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **eEzdoctemplatedocumentFormat** | [**inline**](#EEzdoctemplatedocumentFormat) | Indicates the format of the template.  This field is Required when sEzdoctemplatedocumentBase64 is set. |  [optional] |
| **sEzdoctemplatedocumentFields** | **kotlin.String** | List of field in Ezdoctemplatedocument |  [optional] |
| **sEzdoctemplatedocumentBase64** | **kotlin.ByteArray** | The Base64 encoded binary content of the document.  This field is Required when eEzdoctemplatedocumentFormat is set. |  [optional] |


<a id="EEzdoctemplatedocumentFormat"></a>
## Enum: eEzdoctemplatedocumentFormat
| Name | Value |
| ---- | ----- |
| eEzdoctemplatedocumentFormat | Docx, Html, Tx |



