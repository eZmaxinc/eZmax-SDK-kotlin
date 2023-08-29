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

import eZmaxApi.models.BillingentityexternalGetAutocompleteV2Response
import eZmaxApi.models.HeaderAcceptLanguage

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

class ObjectBillingentityexternalApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelectorBillingentityexternalGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All")
     }

    /**
     * enum for parameter eFilterActive
     */
     enum class EFilterActiveBillingentityexternalGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "Active") Active("Active"),
         @Json(name = "Inactive") Inactive("Inactive")
     }

    /**
     * Retrieve Billingentityexternals and IDs
     * Get the list of Billingentityexternal to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Billingentityexternals to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return BillingentityexternalGetAutocompleteV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun billingentityexternalGetAutocompleteV2(sSelector: SSelectorBillingentityexternalGetAutocompleteV2, eFilterActive: EFilterActiveBillingentityexternalGetAutocompleteV2? = EFilterActiveBillingentityexternalGetAutocompleteV2.Active, sQuery: kotlin.String? = null, acceptLanguage: HeaderAcceptLanguage? = null) : BillingentityexternalGetAutocompleteV2Response {
        val localVarResponse = billingentityexternalGetAutocompleteV2WithHttpInfo(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as BillingentityexternalGetAutocompleteV2Response
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
     * Retrieve Billingentityexternals and IDs
     * Get the list of Billingentityexternal to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Billingentityexternals to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return ApiResponse<BillingentityexternalGetAutocompleteV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun billingentityexternalGetAutocompleteV2WithHttpInfo(sSelector: SSelectorBillingentityexternalGetAutocompleteV2, eFilterActive: EFilterActiveBillingentityexternalGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderAcceptLanguage?) : ApiResponse<BillingentityexternalGetAutocompleteV2Response?> {
        val localVariableConfig = billingentityexternalGetAutocompleteV2RequestConfig(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, BillingentityexternalGetAutocompleteV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation billingentityexternalGetAutocompleteV2
     *
     * @param sSelector The type of Billingentityexternals to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return RequestConfig
     */
    fun billingentityexternalGetAutocompleteV2RequestConfig(sSelector: SSelectorBillingentityexternalGetAutocompleteV2, eFilterActive: EFilterActiveBillingentityexternalGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderAcceptLanguage?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (eFilterActive != null) {
                    put("eFilterActive", listOf(eFilterActive.value))
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
            path = "/2/object/billingentityexternal/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", encodeURIComponent(sSelector.value.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
