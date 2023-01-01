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

import eZmaxApi.models.CommonMinusGetAutocompleteMinusV1MinusResponse
import eZmaxApi.models.CommonMinusResponseMinusError
import eZmaxApi.models.EzmaxinvoicingMinusGetAutocompleteMinusV2MinusResponse
import eZmaxApi.models.EzmaxinvoicingMinusGetObjectMinusV1MinusResponse
import eZmaxApi.models.EzmaxinvoicingMinusGetObjectMinusV2MinusResponse
import eZmaxApi.models.EzmaxinvoicingMinusGetProvisionalMinusV1MinusResponse
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

class ObjectEzmaxinvoicingApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelector_ezmaxinvoicingGetAutocompleteV1(val value: kotlin.String) {
         @Json(name = "All") All("All")
     }

    /**
     * enum for parameter eFilterActive
     */
     enum class EFilterActive_ezmaxinvoicingGetAutocompleteV1(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "Active") Active("Active"),
         @Json(name = "Inactive") Inactive("Inactive")
     }

    /**
     * Retrieve Ezmaxinvoicings and IDs
     * Get the list of Ezmaxinvoicing to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezmaxinvoicings to return
     * @param eFilterActive Specify which results we want to display. Active is the default value. (optional)
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
    fun ezmaxinvoicingGetAutocompleteV1(sSelector: SSelector_ezmaxinvoicingGetAutocompleteV1, eFilterActive: EFilterActive_ezmaxinvoicingGetAutocompleteV1? = null, sQuery: kotlin.String? = null, acceptLanguage: HeaderMinusAcceptMinusLanguage? = null) : CommonMinusGetAutocompleteMinusV1MinusResponse {
        @Suppress("DEPRECATION")
        val localVarResponse = ezmaxinvoicingGetAutocompleteV1WithHttpInfo(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

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
     * Retrieve Ezmaxinvoicings and IDs
     * Get the list of Ezmaxinvoicing to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezmaxinvoicings to return
     * @param eFilterActive Specify which results we want to display. Active is the default value. (optional)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return ApiResponse<CommonMinusGetAutocompleteMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun ezmaxinvoicingGetAutocompleteV1WithHttpInfo(sSelector: SSelector_ezmaxinvoicingGetAutocompleteV1, eFilterActive: EFilterActive_ezmaxinvoicingGetAutocompleteV1?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : ApiResponse<CommonMinusGetAutocompleteMinusV1MinusResponse?> {
        @Suppress("DEPRECATION")
        val localVariableConfig = ezmaxinvoicingGetAutocompleteV1RequestConfig(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, CommonMinusGetAutocompleteMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezmaxinvoicingGetAutocompleteV1
     *
     * @param sSelector The type of Ezmaxinvoicings to return
     * @param eFilterActive Specify which results we want to display. Active is the default value. (optional)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return RequestConfig
     */
    @Deprecated(message = "This operation is deprecated.")
    fun ezmaxinvoicingGetAutocompleteV1RequestConfig(sSelector: SSelector_ezmaxinvoicingGetAutocompleteV1, eFilterActive: EFilterActive_ezmaxinvoicingGetAutocompleteV1?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : RequestConfig<Unit> {
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
            path = "/1/object/ezmaxinvoicing/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", encodeURIComponent(sSelector.value.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelector_ezmaxinvoicingGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All")
     }

    /**
     * enum for parameter eFilterActive
     */
     enum class EFilterActive_ezmaxinvoicingGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "Active") Active("Active"),
         @Json(name = "Inactive") Inactive("Inactive")
     }

    /**
     * Retrieve Ezmaxinvoicings and IDs
     * Get the list of Ezmaxinvoicing to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezmaxinvoicings to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return EzmaxinvoicingMinusGetAutocompleteMinusV2MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezmaxinvoicingGetAutocompleteV2(sSelector: SSelector_ezmaxinvoicingGetAutocompleteV2, eFilterActive: EFilterActive_ezmaxinvoicingGetAutocompleteV2? = EFilterActive_ezmaxinvoicingGetAutocompleteV2.Active, sQuery: kotlin.String? = null, acceptLanguage: HeaderMinusAcceptMinusLanguage? = null) : EzmaxinvoicingMinusGetAutocompleteMinusV2MinusResponse {
        val localVarResponse = ezmaxinvoicingGetAutocompleteV2WithHttpInfo(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzmaxinvoicingMinusGetAutocompleteMinusV2MinusResponse
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
     * Retrieve Ezmaxinvoicings and IDs
     * Get the list of Ezmaxinvoicing to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezmaxinvoicings to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return ApiResponse<EzmaxinvoicingMinusGetAutocompleteMinusV2MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezmaxinvoicingGetAutocompleteV2WithHttpInfo(sSelector: SSelector_ezmaxinvoicingGetAutocompleteV2, eFilterActive: EFilterActive_ezmaxinvoicingGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : ApiResponse<EzmaxinvoicingMinusGetAutocompleteMinusV2MinusResponse?> {
        val localVariableConfig = ezmaxinvoicingGetAutocompleteV2RequestConfig(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, EzmaxinvoicingMinusGetAutocompleteMinusV2MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezmaxinvoicingGetAutocompleteV2
     *
     * @param sSelector The type of Ezmaxinvoicings to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return RequestConfig
     */
    fun ezmaxinvoicingGetAutocompleteV2RequestConfig(sSelector: SSelector_ezmaxinvoicingGetAutocompleteV2, eFilterActive: EFilterActive_ezmaxinvoicingGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : RequestConfig<Unit> {
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
            path = "/2/object/ezmaxinvoicing/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", encodeURIComponent(sSelector.value.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezmaxinvoicing
     * 
     * @param pkiEzmaxinvoicingID 
     * @return EzmaxinvoicingMinusGetObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun ezmaxinvoicingGetObjectV1(pkiEzmaxinvoicingID: kotlin.Int) : EzmaxinvoicingMinusGetObjectMinusV1MinusResponse {
        @Suppress("DEPRECATION")
        val localVarResponse = ezmaxinvoicingGetObjectV1WithHttpInfo(pkiEzmaxinvoicingID = pkiEzmaxinvoicingID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzmaxinvoicingMinusGetObjectMinusV1MinusResponse
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
     * Retrieve an existing Ezmaxinvoicing
     * 
     * @param pkiEzmaxinvoicingID 
     * @return ApiResponse<EzmaxinvoicingMinusGetObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun ezmaxinvoicingGetObjectV1WithHttpInfo(pkiEzmaxinvoicingID: kotlin.Int) : ApiResponse<EzmaxinvoicingMinusGetObjectMinusV1MinusResponse?> {
        @Suppress("DEPRECATION")
        val localVariableConfig = ezmaxinvoicingGetObjectV1RequestConfig(pkiEzmaxinvoicingID = pkiEzmaxinvoicingID)

        return request<Unit, EzmaxinvoicingMinusGetObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezmaxinvoicingGetObjectV1
     *
     * @param pkiEzmaxinvoicingID 
     * @return RequestConfig
     */
    @Deprecated(message = "This operation is deprecated.")
    fun ezmaxinvoicingGetObjectV1RequestConfig(pkiEzmaxinvoicingID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezmaxinvoicing/{pkiEzmaxinvoicingID}".replace("{"+"pkiEzmaxinvoicingID"+"}", encodeURIComponent(pkiEzmaxinvoicingID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezmaxinvoicing
     * 
     * @param pkiEzmaxinvoicingID 
     * @return EzmaxinvoicingMinusGetObjectMinusV2MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezmaxinvoicingGetObjectV2(pkiEzmaxinvoicingID: kotlin.Int) : EzmaxinvoicingMinusGetObjectMinusV2MinusResponse {
        val localVarResponse = ezmaxinvoicingGetObjectV2WithHttpInfo(pkiEzmaxinvoicingID = pkiEzmaxinvoicingID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzmaxinvoicingMinusGetObjectMinusV2MinusResponse
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
     * Retrieve an existing Ezmaxinvoicing
     * 
     * @param pkiEzmaxinvoicingID 
     * @return ApiResponse<EzmaxinvoicingMinusGetObjectMinusV2MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezmaxinvoicingGetObjectV2WithHttpInfo(pkiEzmaxinvoicingID: kotlin.Int) : ApiResponse<EzmaxinvoicingMinusGetObjectMinusV2MinusResponse?> {
        val localVariableConfig = ezmaxinvoicingGetObjectV2RequestConfig(pkiEzmaxinvoicingID = pkiEzmaxinvoicingID)

        return request<Unit, EzmaxinvoicingMinusGetObjectMinusV2MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezmaxinvoicingGetObjectV2
     *
     * @param pkiEzmaxinvoicingID 
     * @return RequestConfig
     */
    fun ezmaxinvoicingGetObjectV2RequestConfig(pkiEzmaxinvoicingID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/ezmaxinvoicing/{pkiEzmaxinvoicingID}".replace("{"+"pkiEzmaxinvoicingID"+"}", encodeURIComponent(pkiEzmaxinvoicingID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve provisional Ezmaxinvoicing
     * 
     * @return EzmaxinvoicingMinusGetProvisionalMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezmaxinvoicingGetProvisionalV1() : EzmaxinvoicingMinusGetProvisionalMinusV1MinusResponse {
        val localVarResponse = ezmaxinvoicingGetProvisionalV1WithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzmaxinvoicingMinusGetProvisionalMinusV1MinusResponse
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
     * Retrieve provisional Ezmaxinvoicing
     * 
     * @return ApiResponse<EzmaxinvoicingMinusGetProvisionalMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezmaxinvoicingGetProvisionalV1WithHttpInfo() : ApiResponse<EzmaxinvoicingMinusGetProvisionalMinusV1MinusResponse?> {
        val localVariableConfig = ezmaxinvoicingGetProvisionalV1RequestConfig()

        return request<Unit, EzmaxinvoicingMinusGetProvisionalMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezmaxinvoicingGetProvisionalV1
     *
     * @return RequestConfig
     */
    fun ezmaxinvoicingGetProvisionalV1RequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezmaxinvoicing/getProvisional",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
