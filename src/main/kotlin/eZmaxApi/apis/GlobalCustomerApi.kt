/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
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

import eZmaxApi.models.CommonMinusResponseMinusError
import eZmaxApi.models.GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse

import com.squareup.moshi.Json

import eZmaxApi.infrastructure.ApiClient
import eZmaxApi.infrastructure.ApiResponse
import eZmaxApi.infrastructure.ClientException
import eZmaxApi.infrastructure.ClientError
import eZmaxApi.infrastructure.ServerException
import eZmaxApi.infrastructure.ServerError
import eZmaxApi.infrastructure.MultiValueMap
import eZmaxApi.infrastructure.RequestConfig
import eZmaxApi.infrastructure.RequestMethod
import eZmaxApi.infrastructure.ResponseType
import eZmaxApi.infrastructure.Success
import eZmaxApi.infrastructure.toMultiValue

class GlobalCustomerApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * enum for parameter sInfrastructureproductCode
     */
     enum class SInfrastructureproductCode_globalCustomerGetEndpointV1(val value: kotlin.String) {
         @Json(name = "appcluster01") appcluster01("appcluster01"),
         @Json(name = "ezsignuser") ezsignuser("ezsignuser"),
         ;
     }

    /**
    * Get customer endpoint
    * Retrieve the customer&#39;s specific server endpoint where to send requests. This will help locate the proper region (ie: sInfrastructureregionCode) and the proper environment (ie: sInfrastructureenvironmenttypeDescription) where the customer&#39;s data is stored.
    * @param pksCustomerCode  
    * @param sInfrastructureproductCode The infrastructure product Code  If undefined, \&quot;appcluster01\&quot; is assumed (optional)
    * @return GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun globalCustomerGetEndpointV1(pksCustomerCode: kotlin.String, sInfrastructureproductCode: SInfrastructureproductCode_globalCustomerGetEndpointV1?) : GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse {
        val localVarResponse = globalCustomerGetEndpointV1WithHttpInfo(pksCustomerCode = pksCustomerCode, sInfrastructureproductCode = sInfrastructureproductCode)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse
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
    * Get customer endpoint
    * Retrieve the customer&#39;s specific server endpoint where to send requests. This will help locate the proper region (ie: sInfrastructureregionCode) and the proper environment (ie: sInfrastructureenvironmenttypeDescription) where the customer&#39;s data is stored.
    * @param pksCustomerCode  
    * @param sInfrastructureproductCode The infrastructure product Code  If undefined, \&quot;appcluster01\&quot; is assumed (optional)
    * @return ApiResponse<GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun globalCustomerGetEndpointV1WithHttpInfo(pksCustomerCode: kotlin.String, sInfrastructureproductCode: SInfrastructureproductCode_globalCustomerGetEndpointV1?) : ApiResponse<GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse?> {
        val localVariableConfig = globalCustomerGetEndpointV1RequestConfig(pksCustomerCode = pksCustomerCode, sInfrastructureproductCode = sInfrastructureproductCode)

        return request<Unit, GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse>(
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
    fun globalCustomerGetEndpointV1RequestConfig(pksCustomerCode: kotlin.String, sInfrastructureproductCode: SInfrastructureproductCode_globalCustomerGetEndpointV1?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (sInfrastructureproductCode != null) {
                    put("sInfrastructureproductCode", listOf(sInfrastructureproductCode.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/customer/{pksCustomerCode}/endpoint".replace("{"+"pksCustomerCode"+"}", "$pksCustomerCode"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
