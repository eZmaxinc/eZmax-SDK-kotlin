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
import okhttp3.Call
import okhttp3.HttpUrl

import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.GlobalCustomerGetEndpointV1Response

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

class GlobalCustomerApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * enum for parameter sInfrastructureproductCode
     */
     enum class SInfrastructureproductCodeGlobalCustomerGetEndpointV1(val value: kotlin.String) {
         @Json(name = "appcluster01") appcluster01("appcluster01"),
         @Json(name = "ezsignuser") ezsignuser("ezsignuser");

        /**
         * Override [toString()] to avoid using the enum variable name as the value, and instead use
         * the actual value defined in the API spec file.
         *
         * This solves a problem when the variable name and its value are different, and ensures that
         * the client sends the correct enum values to the server always.
         */
        override fun toString(): kotlin.String = "$value"
     }

    /**
     * Get customer endpoint
     * Retrieve the customer&#39;s specific server endpoint where to send requests. This will help locate the proper region (ie: sInfrastructureregionCode) and the proper environment (ie: sInfrastructureenvironmenttypeDescription) where the customer&#39;s data is stored.
     * @param pksCustomerCode 
     * @param sInfrastructureproductCode The infrastructure product Code  If undefined, \&quot;appcluster01\&quot; is assumed (optional)
     * @return GlobalCustomerGetEndpointV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun globalCustomerGetEndpointV1(pksCustomerCode: kotlin.String, sInfrastructureproductCode: SInfrastructureproductCodeGlobalCustomerGetEndpointV1? = null) : GlobalCustomerGetEndpointV1Response {
        @Suppress("DEPRECATION")
        val localVarResponse = globalCustomerGetEndpointV1WithHttpInfo(pksCustomerCode = pksCustomerCode, sInfrastructureproductCode = sInfrastructureproductCode)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GlobalCustomerGetEndpointV1Response
            ResponseType.Informational -> throw UnsupportedOperationException("Client does not support Informational responses.")
            ResponseType.Redirection -> throw UnsupportedOperationException("Client does not support Redirection responses.")
            ResponseType.ClientError -> {
                val localVarError = localVarResponse as ClientError<*>
                throw ClientException("Client error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
            ResponseType.ServerError -> {
                val localVarError = localVarResponse as ServerError<*>
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()} ${localVarError.body}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
     * Get customer endpoint
     * Retrieve the customer&#39;s specific server endpoint where to send requests. This will help locate the proper region (ie: sInfrastructureregionCode) and the proper environment (ie: sInfrastructureenvironmenttypeDescription) where the customer&#39;s data is stored.
     * @param pksCustomerCode 
     * @param sInfrastructureproductCode The infrastructure product Code  If undefined, \&quot;appcluster01\&quot; is assumed (optional)
     * @return ApiResponse<GlobalCustomerGetEndpointV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun globalCustomerGetEndpointV1WithHttpInfo(pksCustomerCode: kotlin.String, sInfrastructureproductCode: SInfrastructureproductCodeGlobalCustomerGetEndpointV1?) : ApiResponse<GlobalCustomerGetEndpointV1Response?> {
        @Suppress("DEPRECATION")
        val localVariableConfig = globalCustomerGetEndpointV1RequestConfig(pksCustomerCode = pksCustomerCode, sInfrastructureproductCode = sInfrastructureproductCode)

        return request<Unit, GlobalCustomerGetEndpointV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation globalCustomerGetEndpointV1
     *
     * @param pksCustomerCode 
     * @param sInfrastructureproductCode The infrastructure product Code  If undefined, \&quot;appcluster01\&quot; is assumed (optional)
     * @return RequestConfig
     */
    @Deprecated(message = "This operation is deprecated.")
    fun globalCustomerGetEndpointV1RequestConfig(pksCustomerCode: kotlin.String, sInfrastructureproductCode: SInfrastructureproductCodeGlobalCustomerGetEndpointV1?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (sInfrastructureproductCode != null) {
                    put("sInfrastructureproductCode", listOf(sInfrastructureproductCode.value))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/customer/{pksCustomerCode}/endpoint".replace("{"+"pksCustomerCode"+"}", encodeURIComponent(pksCustomerCode.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = false,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
