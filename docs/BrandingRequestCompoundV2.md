
# BrandingRequestCompoundV2

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **objBrandingDescription** | [**MultilingualBrandingDescription**](MultilingualBrandingDescription.md) |  |  |
| **eBrandingLogo** | [**FieldEBrandingLogo**](FieldEBrandingLogo.md) |  |  |
| **iBrandingColor** | **kotlin.Int** | The primary color. This is a RGB color converted into integer |  |
| **bBrandingIsactive** | **kotlin.Boolean** | Whether the Branding is active or not |  |
| **pkiBrandingID** | **kotlin.Int** | The unique ID of the Branding |  [optional] |
| **eBrandingAlignlogo** | [**FieldEBrandingAlignlogo**](FieldEBrandingAlignlogo.md) |  |  [optional] |
| **sBrandingBase64** | **kotlin.ByteArray** | The Base64 encoded binary content of the branding logo. This need to match image type selected in eBrandingLogo if you supply an image. If you select &#39;Default&#39;, the logo will be deleted and the default one will be used. |  [optional] |
| **sBrandingName** | **kotlin.String** | The name of the Branding  This value will only be set if you wish to overwrite the default name. If you want to keep the default name, leave this property empty |  [optional] |
| **sEmailAddress** | **kotlin.String** | The email address. |  [optional] |



