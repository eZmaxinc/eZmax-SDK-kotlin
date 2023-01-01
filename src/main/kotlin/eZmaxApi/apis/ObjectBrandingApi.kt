/**
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 *
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.apis

import java.io.IOException
import okhttp3.OkHttpClient
import okhttp3.HttpUrl

import eZmaxApi.models.BrandingMinusCreateObjectMinusV1MinusRequest
import eZmaxApi.models.BrandingMinusCreateObjectMinusV1MinusResponse
import eZmaxApi.models.BrandingMinusEditObjectMinusV1MinusRequest
import eZmaxApi.models.BrandingMinusEditObjectMinusV1MinusResponse
import eZmaxApi.models.BrandingMinusGetAutocompleteMinusV2MinusResponse
import eZmaxApi.models.BrandingMinusGetListMinusV1MinusResponse
import eZmaxApi.models.BrandingMinusGetObjectMinusV1MinusResponse
import eZmaxApi.models.BrandingMinusGetObjectMinusV2MinusResponse
import eZmaxApi.models.CommonMinusGetAutocompleteMinusV1MinusResponse
import eZmaxApi.models.CommonMinusResponseMinusError
import eZmaxApi.models.HeaderMinusAcceptMinusLanguage

import com.squareup.moshi.Json

import eZmaxApi.infrastructure.ApiClient
import eZmaxApi.infrastructure.ApiResponse
import eZmaxApi.infrastructure.ClientException
import eZmaxApi.infrastructure.ClientError
import eZmaxApi.infrastructure.ServerException
import eZmaxApi.infrastructure.ServerError
import eZmaxApi.infrastructure.MultiValueMap
import eZmaxApi.infrastructure.PartConfig
import eZmaxApi.infrastructure.RequestConfig
import eZmaxApi.infrastructure.RequestMethod
import eZmaxApi.infrastructure.ResponseType
import eZmaxApi.infrastructure.Success
import eZmaxApi.infrastructure.toMultiValue

class ObjectBrandingApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Branding
     * The endpoint allows to create one or many elements at once.
     * @param brandingMinusCreateObjectMinusV1MinusRequest 
     * @return BrandingMinusCreateObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun brandingCreateObjectV1(brandingMinusCreateObjectMinusV1MinusRequest: BrandingMinusCreateObjectMinusV1MinusRequest) : BrandingMinusCreateObjectMinusV1MinusResponse {
        val localVarResponse = brandingCreateObjectV1WithHttpInfo(brandingMinusCreateObjectMinusV1MinusRequest = brandingMinusCreateObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BrandingMinusCreateObjectMinusV1MinusResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Create a new Branding
     * The endpoint allows to create one or many elements at once.
     * @param brandingMinusCreateObjectMinusV1MinusRequest 
     * @return ApiResponse<BrandingMinusCreateObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun brandingCreateObjectV1WithHttpInfo(brandingMinusCreateObjectMinusV1MinusRequest: BrandingMinusCreateObjectMinusV1MinusRequest) : ApiResponse<BrandingMinusCreateObjectMinusV1MinusResponse?> {
        val localVariableConfig = brandingCreateObjectV1RequestConfig(brandingMinusCreateObjectMinusV1MinusRequest = brandingMinusCreateObjectMinusV1MinusRequest)

        return request<BrandingMinusCreateObjectMinusV1MinusRequest, BrandingMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation brandingCreateObjectV1
     *
     * @param brandingMinusCreateObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun brandingCreateObjectV1RequestConfig(brandingMinusCreateObjectMinusV1MinusRequest: BrandingMinusCreateObjectMinusV1MinusRequest) : RequestConfig<BrandingMinusCreateObjectMinusV1MinusRequest> {
        val localVariableBody = brandingMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/branding",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Edit an existing Branding
     * 
     * @param pkiBrandingID 
     * @param brandingMinusEditObjectMinusV1MinusRequest 
     * @return BrandingMinusEditObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun brandingEditObjectV1(pkiBrandingID: kotlin.Int, brandingMinusEditObjectMinusV1MinusRequest: BrandingMinusEditObjectMinusV1MinusRequest) : BrandingMinusEditObjectMinusV1MinusResponse {
        val localVarResponse = brandingEditObjectV1WithHttpInfo(pkiBrandingID = pkiBrandingID, brandingMinusEditObjectMinusV1MinusRequest = brandingMinusEditObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BrandingMinusEditObjectMinusV1MinusResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Edit an existing Branding
     * 
     * @param pkiBrandingID 
     * @param brandingMinusEditObjectMinusV1MinusRequest 
     * @return ApiResponse<BrandingMinusEditObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun brandingEditObjectV1WithHttpInfo(pkiBrandingID: kotlin.Int, brandingMinusEditObjectMinusV1MinusRequest: BrandingMinusEditObjectMinusV1MinusRequest) : ApiResponse<BrandingMinusEditObjectMinusV1MinusResponse?> {
        val localVariableConfig = brandingEditObjectV1RequestConfig(pkiBrandingID = pkiBrandingID, brandingMinusEditObjectMinusV1MinusRequest = brandingMinusEditObjectMinusV1MinusRequest)

        return request<BrandingMinusEditObjectMinusV1MinusRequest, BrandingMinusEditObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation brandingEditObjectV1
     *
     * @param pkiBrandingID 
     * @param brandingMinusEditObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun brandingEditObjectV1RequestConfig(pkiBrandingID: kotlin.Int, brandingMinusEditObjectMinusV1MinusRequest: BrandingMinusEditObjectMinusV1MinusRequest) : RequestConfig<BrandingMinusEditObjectMinusV1MinusRequest> {
        val localVariableBody = brandingMinusEditObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/branding/{pkiBrandingID}".replace("{"+"pkiBrandingID"+"}", encodeURIComponent(pkiBrandingID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelector_brandingGetAutocompleteV1(val value: kotlin.String) {
         @Json(name = "All") All("All")
     }

    /**
     * enum for parameter eFilterActive
     */
     enum class EFilterActive_brandingGetAutocompleteV1(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "Active") Active("Active"),
         @Json(name = "Inactive") Inactive("Inactive")
     }

    /**
     * Retrieve Brandings and IDs
     * Get the list of Branding to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Brandings to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return CommonMinusGetAutocompleteMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun brandingGetAutocompleteV1(sSelector: SSelector_brandingGetAutocompleteV1, eFilterActive: EFilterActive_brandingGetAutocompleteV1? = EFilterActive_brandingGetAutocompleteV1.Active, sQuery: kotlin.String? = null, acceptLanguage: HeaderMinusAcceptMinusLanguage? = null) : CommonMinusGetAutocompleteMinusV1MinusResponse {
        @Suppress("DEPRECATION")
        val localVarResponse = brandingGetAutocompleteV1WithHttpInfo(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CommonMinusGetAutocompleteMinusV1MinusResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Retrieve Brandings and IDs
     * Get the list of Branding to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Brandings to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return ApiResponse<CommonMinusGetAutocompleteMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun brandingGetAutocompleteV1WithHttpInfo(sSelector: SSelector_brandingGetAutocompleteV1, eFilterActive: EFilterActive_brandingGetAutocompleteV1?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : ApiResponse<CommonMinusGetAutocompleteMinusV1MinusResponse?> {
        @Suppress("DEPRECATION")
        val localVariableConfig = brandingGetAutocompleteV1RequestConfig(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, CommonMinusGetAutocompleteMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation brandingGetAutocompleteV1
     *
     * @param sSelector The type of Brandings to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return RequestConfig
     */
    @Deprecated(message = "This operation is deprecated.")
    fun brandingGetAutocompleteV1RequestConfig(sSelector: SSelector_brandingGetAutocompleteV1, eFilterActive: EFilterActive_brandingGetAutocompleteV1?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (eFilterActive != null) {
                    put("eFilterActive", listOf(eFilterActive.toString()))
                }
                if (sQuery != null) {
                    put("sQuery", listOf(sQuery.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        acceptLanguage?.apply { localVariableHeaders["Accept-Language"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/branding/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", encodeURIComponent(sSelector.value.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelector_brandingGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All")
     }

    /**
     * enum for parameter eFilterActive
     */
     enum class EFilterActive_brandingGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "Active") Active("Active"),
         @Json(name = "Inactive") Inactive("Inactive")
     }

    /**
     * Retrieve Brandings and IDs
     * Get the list of Branding to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Brandings to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return BrandingMinusGetAutocompleteMinusV2MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun brandingGetAutocompleteV2(sSelector: SSelector_brandingGetAutocompleteV2, eFilterActive: EFilterActive_brandingGetAutocompleteV2? = EFilterActive_brandingGetAutocompleteV2.Active, sQuery: kotlin.String? = null, acceptLanguage: HeaderMinusAcceptMinusLanguage? = null) : BrandingMinusGetAutocompleteMinusV2MinusResponse {
        val localVarResponse = brandingGetAutocompleteV2WithHttpInfo(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BrandingMinusGetAutocompleteMinusV2MinusResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Retrieve Brandings and IDs
     * Get the list of Branding to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Brandings to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return ApiResponse<BrandingMinusGetAutocompleteMinusV2MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun brandingGetAutocompleteV2WithHttpInfo(sSelector: SSelector_brandingGetAutocompleteV2, eFilterActive: EFilterActive_brandingGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : ApiResponse<BrandingMinusGetAutocompleteMinusV2MinusResponse?> {
        val localVariableConfig = brandingGetAutocompleteV2RequestConfig(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, BrandingMinusGetAutocompleteMinusV2MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation brandingGetAutocompleteV2
     *
     * @param sSelector The type of Brandings to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return RequestConfig
     */
    fun brandingGetAutocompleteV2RequestConfig(sSelector: SSelector_brandingGetAutocompleteV2, eFilterActive: EFilterActive_brandingGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (eFilterActive != null) {
                    put("eFilterActive", listOf(eFilterActive.toString()))
                }
                if (sQuery != null) {
                    put("sQuery", listOf(sQuery.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        acceptLanguage?.apply { localVariableHeaders["Accept-Language"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/branding/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", encodeURIComponent(sSelector.value.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter eOrderBy
     */
     enum class EOrderBy_brandingGetListV1(val value: kotlin.String) {
         @Json(name = "pkiBrandingID_ASC") pkiBrandingID_ASC("pkiBrandingID_ASC"),
         @Json(name = "pkiBrandingID_DESC") pkiBrandingID_DESC("pkiBrandingID_DESC"),
         @Json(name = "sBrandingDescriptionX_ASC") sBrandingDescriptionX_ASC("sBrandingDescriptionX_ASC"),
         @Json(name = "sBrandingDescriptionX_DESC") sBrandingDescriptionX_DESC("sBrandingDescriptionX_DESC"),
         @Json(name = "iBrandingColortext_ASC") iBrandingColortext_ASC("iBrandingColortext_ASC"),
         @Json(name = "iBrandingColortext_DESC") iBrandingColortext_DESC("iBrandingColortext_DESC"),
         @Json(name = "iBrandingColortextlinkbox_ASC") iBrandingColortextlinkbox_ASC("iBrandingColortextlinkbox_ASC"),
         @Json(name = "iBrandingColortextlinkbox_DESC") iBrandingColortextlinkbox_DESC("iBrandingColortextlinkbox_DESC"),
         @Json(name = "iBrandingColortextbutton_ASC") iBrandingColortextbutton_ASC("iBrandingColortextbutton_ASC"),
         @Json(name = "iBrandingColortextbutton_DESC") iBrandingColortextbutton_DESC("iBrandingColortextbutton_DESC"),
         @Json(name = "iBrandingColorbackground_ASC") iBrandingColorbackground_ASC("iBrandingColorbackground_ASC"),
         @Json(name = "iBrandingColorbackground_DESC") iBrandingColorbackground_DESC("iBrandingColorbackground_DESC"),
         @Json(name = "iBrandingColorbackgroundbutton_ASC") iBrandingColorbackgroundbutton_ASC("iBrandingColorbackgroundbutton_ASC"),
         @Json(name = "iBrandingColorbackgroundbutton_DESC") iBrandingColorbackgroundbutton_DESC("iBrandingColorbackgroundbutton_DESC"),
         @Json(name = "iBrandingColorbackgroundsmallbox_ASC") iBrandingColorbackgroundsmallbox_ASC("iBrandingColorbackgroundsmallbox_ASC"),
         @Json(name = "iBrandingColorbackgroundsmallbox_DESC") iBrandingColorbackgroundsmallbox_DESC("iBrandingColorbackgroundsmallbox_DESC"),
         @Json(name = "bBrandingIsactive_ASC") bBrandingIsactive_ASC("bBrandingIsactive_ASC"),
         @Json(name = "bBrandingIsactive_DESC") bBrandingIsactive_DESC("bBrandingIsactive_DESC")
     }

    /**
     * Retrieve Branding list
     * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eBrandingLogo | Default&lt;br&gt;JPEG&lt;br&gt;PNG |
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return BrandingMinusGetListMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun brandingGetListV1(eOrderBy: EOrderBy_brandingGetListV1? = null, iRowMax: kotlin.Int? = null, iRowOffset: kotlin.Int? = null, acceptLanguage: HeaderMinusAcceptMinusLanguage? = null, sFilter: kotlin.String? = null) : BrandingMinusGetListMinusV1MinusResponse {
        val localVarResponse = brandingGetListV1WithHttpInfo(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BrandingMinusGetListMinusV1MinusResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Retrieve Branding list
     * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eBrandingLogo | Default&lt;br&gt;JPEG&lt;br&gt;PNG |
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return ApiResponse<BrandingMinusGetListMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun brandingGetListV1WithHttpInfo(eOrderBy: EOrderBy_brandingGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderMinusAcceptMinusLanguage?, sFilter: kotlin.String?) : ApiResponse<BrandingMinusGetListMinusV1MinusResponse?> {
        val localVariableConfig = brandingGetListV1RequestConfig(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return request<Unit, BrandingMinusGetListMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation brandingGetListV1
     *
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return RequestConfig
     */
    fun brandingGetListV1RequestConfig(eOrderBy: EOrderBy_brandingGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderMinusAcceptMinusLanguage?, sFilter: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (eOrderBy != null) {
                    put("eOrderBy", listOf(eOrderBy.toString()))
                }
                if (iRowMax != null) {
                    put("iRowMax", listOf(iRowMax.toString()))
                }
                if (iRowOffset != null) {
                    put("iRowOffset", listOf(iRowOffset.toString()))
                }
                if (sFilter != null) {
                    put("sFilter", listOf(sFilter.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        acceptLanguage?.apply { localVariableHeaders["Accept-Language"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/branding/getList",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Branding
     * 
     * @param pkiBrandingID 
     * @return BrandingMinusGetObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun brandingGetObjectV1(pkiBrandingID: kotlin.Int) : BrandingMinusGetObjectMinusV1MinusResponse {
        @Suppress("DEPRECATION")
        val localVarResponse = brandingGetObjectV1WithHttpInfo(pkiBrandingID = pkiBrandingID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BrandingMinusGetObjectMinusV1MinusResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Retrieve an existing Branding
     * 
     * @param pkiBrandingID 
     * @return ApiResponse<BrandingMinusGetObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun brandingGetObjectV1WithHttpInfo(pkiBrandingID: kotlin.Int) : ApiResponse<BrandingMinusGetObjectMinusV1MinusResponse?> {
        @Suppress("DEPRECATION")
        val localVariableConfig = brandingGetObjectV1RequestConfig(pkiBrandingID = pkiBrandingID)

        return request<Unit, BrandingMinusGetObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation brandingGetObjectV1
     *
     * @param pkiBrandingID 
     * @return RequestConfig
     */
    @Deprecated(message = "This operation is deprecated.")
    fun brandingGetObjectV1RequestConfig(pkiBrandingID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/branding/{pkiBrandingID}".replace("{"+"pkiBrandingID"+"}", encodeURIComponent(pkiBrandingID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Branding
     * 
     * @param pkiBrandingID 
     * @return BrandingMinusGetObjectMinusV2MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun brandingGetObjectV2(pkiBrandingID: kotlin.Int) : BrandingMinusGetObjectMinusV2MinusResponse {
        val localVarResponse = brandingGetObjectV2WithHttpInfo(pkiBrandingID = pkiBrandingID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BrandingMinusGetObjectMinusV2MinusResponse
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Retrieve an existing Branding
     * 
     * @param pkiBrandingID 
     * @return ApiResponse<BrandingMinusGetObjectMinusV2MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun brandingGetObjectV2WithHttpInfo(pkiBrandingID: kotlin.Int) : ApiResponse<BrandingMinusGetObjectMinusV2MinusResponse?> {
        val localVariableConfig = brandingGetObjectV2RequestConfig(pkiBrandingID = pkiBrandingID)

        return request<Unit, BrandingMinusGetObjectMinusV2MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation brandingGetObjectV2
     *
     * @param pkiBrandingID 
     * @return RequestConfig
     */
    fun brandingGetObjectV2RequestConfig(pkiBrandingID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/branding/{pkiBrandingID}".replace("{"+"pkiBrandingID"+"}", encodeURIComponent(pkiBrandingID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
