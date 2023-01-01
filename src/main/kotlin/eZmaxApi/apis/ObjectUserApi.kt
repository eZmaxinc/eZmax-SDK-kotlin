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
import eZmaxApi.models.HeaderMinusAcceptMinusLanguage
import eZmaxApi.models.UserMinusGetAutocompleteMinusV2MinusResponse

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

class ObjectUserApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelector_userGetAutocompleteV1(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "AgentBrokerEmployeeEzsignUserNormal") AgentBrokerEmployeeEzsignUserNormal("AgentBrokerEmployeeEzsignUserNormal"),
         @Json(name = "ClonableUsers") ClonableUsers("ClonableUsers"),
         @Json(name = "Normal") Normal("Normal"),
         @Json(name = "NormalEzsignSigner") NormalEzsignSigner("NormalEzsignSigner")
     }

    /**
     * enum for parameter eFilterActive
     */
     enum class EFilterActive_userGetAutocompleteV1(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "Active") Active("Active"),
         @Json(name = "Inactive") Inactive("Inactive")
     }

    /**
     * Retrieve Users and IDs
     * Get the list of User to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Users to return
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
    fun userGetAutocompleteV1(sSelector: SSelector_userGetAutocompleteV1, eFilterActive: EFilterActive_userGetAutocompleteV1? = EFilterActive_userGetAutocompleteV1.Active, sQuery: kotlin.String? = null, acceptLanguage: HeaderMinusAcceptMinusLanguage? = null) : CommonMinusGetAutocompleteMinusV1MinusResponse {
        @Suppress("DEPRECATION")
        val localVarResponse = userGetAutocompleteV1WithHttpInfo(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

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
     * Retrieve Users and IDs
     * Get the list of User to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Users to return
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
    fun userGetAutocompleteV1WithHttpInfo(sSelector: SSelector_userGetAutocompleteV1, eFilterActive: EFilterActive_userGetAutocompleteV1?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : ApiResponse<CommonMinusGetAutocompleteMinusV1MinusResponse?> {
        @Suppress("DEPRECATION")
        val localVariableConfig = userGetAutocompleteV1RequestConfig(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, CommonMinusGetAutocompleteMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation userGetAutocompleteV1
     *
     * @param sSelector The type of Users to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return RequestConfig
     */
    @Deprecated(message = "This operation is deprecated.")
    fun userGetAutocompleteV1RequestConfig(sSelector: SSelector_userGetAutocompleteV1, eFilterActive: EFilterActive_userGetAutocompleteV1?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : RequestConfig<Unit> {
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
            path = "/1/object/user/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", encodeURIComponent(sSelector.value.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelector_userGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "AgentBrokerEmployeeEzsignUserNormal") AgentBrokerEmployeeEzsignUserNormal("AgentBrokerEmployeeEzsignUserNormal"),
         @Json(name = "ClonableUsers") ClonableUsers("ClonableUsers"),
         @Json(name = "Normal") Normal("Normal"),
         @Json(name = "NormalEzsignSigner") NormalEzsignSigner("NormalEzsignSigner")
     }

    /**
     * enum for parameter eFilterActive
     */
     enum class EFilterActive_userGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "Active") Active("Active"),
         @Json(name = "Inactive") Inactive("Inactive")
     }

    /**
     * Retrieve Users and IDs
     * Get the list of User to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Users to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return UserMinusGetAutocompleteMinusV2MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun userGetAutocompleteV2(sSelector: SSelector_userGetAutocompleteV2, eFilterActive: EFilterActive_userGetAutocompleteV2? = EFilterActive_userGetAutocompleteV2.Active, sQuery: kotlin.String? = null, acceptLanguage: HeaderMinusAcceptMinusLanguage? = null) : UserMinusGetAutocompleteMinusV2MinusResponse {
        val localVarResponse = userGetAutocompleteV2WithHttpInfo(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UserMinusGetAutocompleteMinusV2MinusResponse
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
     * Retrieve Users and IDs
     * Get the list of User to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Users to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return ApiResponse<UserMinusGetAutocompleteMinusV2MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun userGetAutocompleteV2WithHttpInfo(sSelector: SSelector_userGetAutocompleteV2, eFilterActive: EFilterActive_userGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : ApiResponse<UserMinusGetAutocompleteMinusV2MinusResponse?> {
        val localVariableConfig = userGetAutocompleteV2RequestConfig(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, UserMinusGetAutocompleteMinusV2MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation userGetAutocompleteV2
     *
     * @param sSelector The type of Users to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return RequestConfig
     */
    fun userGetAutocompleteV2RequestConfig(sSelector: SSelector_userGetAutocompleteV2, eFilterActive: EFilterActive_userGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : RequestConfig<Unit> {
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
            path = "/2/object/user/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", encodeURIComponent(sSelector.value.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
