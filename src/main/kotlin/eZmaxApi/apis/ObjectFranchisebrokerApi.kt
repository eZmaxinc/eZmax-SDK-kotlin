/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
 * Contact: support-api@ezmax.ca
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
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

import eZmaxApi.models.CommonMinusGetAutocompleteMinusV1MinusResponse
import eZmaxApi.models.FranchisebrokerMinusGetAutocompleteMinusV2MinusResponse
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

class ObjectFranchisebrokerApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelector_franchisebrokerGetAutocompleteV1(val value: kotlin.String) {
         @Json(name = "Active") Active("Active"),
         @Json(name = "All") All("All")
     }

    /**
     * enum for parameter eFilterActive
     */
     enum class EFilterActive_franchisebrokerGetAutocompleteV1(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "Active") Active("Active"),
         @Json(name = "Inactive") Inactive("Inactive")
     }

    /**
     * Retrieve Franchisebrokers and IDs
     * Get the list of Franchisebrokers to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Franchisebrokers to return
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
    fun franchisebrokerGetAutocompleteV1(sSelector: SSelector_franchisebrokerGetAutocompleteV1, eFilterActive: EFilterActive_franchisebrokerGetAutocompleteV1? = Active, sQuery: kotlin.String? = null, acceptLanguage: HeaderMinusAcceptMinusLanguage? = null) : CommonMinusGetAutocompleteMinusV1MinusResponse {
        @Suppress("DEPRECATION")
        val localVarResponse = franchisebrokerGetAutocompleteV1WithHttpInfo(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

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
     * Retrieve Franchisebrokers and IDs
     * Get the list of Franchisebrokers to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Franchisebrokers to return
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
    fun franchisebrokerGetAutocompleteV1WithHttpInfo(sSelector: SSelector_franchisebrokerGetAutocompleteV1, eFilterActive: EFilterActive_franchisebrokerGetAutocompleteV1?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : ApiResponse<CommonMinusGetAutocompleteMinusV1MinusResponse?> {
        @Suppress("DEPRECATION")
        val localVariableConfig = franchisebrokerGetAutocompleteV1RequestConfig(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, CommonMinusGetAutocompleteMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation franchisebrokerGetAutocompleteV1
     *
     * @param sSelector The type of Franchisebrokers to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return RequestConfig
     */
    @Deprecated(message = "This operation is deprecated.")
    fun franchisebrokerGetAutocompleteV1RequestConfig(sSelector: SSelector_franchisebrokerGetAutocompleteV1, eFilterActive: EFilterActive_franchisebrokerGetAutocompleteV1?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : RequestConfig<Unit> {
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
            path = "/1/object/franchisebroker/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", sSelector.value.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelector_franchisebrokerGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All")
     }

    /**
     * enum for parameter eFilterActive
     */
     enum class EFilterActive_franchisebrokerGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "Active") Active("Active"),
         @Json(name = "Inactive") Inactive("Inactive")
     }

    /**
     * Retrieve Franchisebrokers and IDs
     * Get the list of Franchisebroker to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Franchisebrokers to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return FranchisebrokerMinusGetAutocompleteMinusV2MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun franchisebrokerGetAutocompleteV2(sSelector: SSelector_franchisebrokerGetAutocompleteV2, eFilterActive: EFilterActive_franchisebrokerGetAutocompleteV2? = Active, sQuery: kotlin.String? = null, acceptLanguage: HeaderMinusAcceptMinusLanguage? = null) : FranchisebrokerMinusGetAutocompleteMinusV2MinusResponse {
        val localVarResponse = franchisebrokerGetAutocompleteV2WithHttpInfo(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as FranchisebrokerMinusGetAutocompleteMinusV2MinusResponse
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
     * Retrieve Franchisebrokers and IDs
     * Get the list of Franchisebroker to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Franchisebrokers to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return ApiResponse<FranchisebrokerMinusGetAutocompleteMinusV2MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun franchisebrokerGetAutocompleteV2WithHttpInfo(sSelector: SSelector_franchisebrokerGetAutocompleteV2, eFilterActive: EFilterActive_franchisebrokerGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : ApiResponse<FranchisebrokerMinusGetAutocompleteMinusV2MinusResponse?> {
        val localVariableConfig = franchisebrokerGetAutocompleteV2RequestConfig(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, FranchisebrokerMinusGetAutocompleteMinusV2MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation franchisebrokerGetAutocompleteV2
     *
     * @param sSelector The type of Franchisebrokers to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return RequestConfig
     */
    fun franchisebrokerGetAutocompleteV2RequestConfig(sSelector: SSelector_franchisebrokerGetAutocompleteV2, eFilterActive: EFilterActive_franchisebrokerGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : RequestConfig<Unit> {
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
            path = "/2/object/franchisebroker/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", sSelector.value.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
