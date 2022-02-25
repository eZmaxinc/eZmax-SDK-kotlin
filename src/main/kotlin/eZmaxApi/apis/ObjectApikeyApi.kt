/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.5
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

import eZmaxApi.models.ApikeyMinusCreateObjectMinusV1MinusRequest
import eZmaxApi.models.ApikeyMinusCreateObjectMinusV1MinusResponse

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

class ObjectApikeyApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
    * Create a new Apikey
    * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
    * @param apikeyMinusCreateObjectMinusV1MinusRequest  
    * @return ApikeyMinusCreateObjectMinusV1MinusResponse
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apikeyCreateObjectV1(apikeyMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<ApikeyMinusCreateObjectMinusV1MinusRequest>) : ApikeyMinusCreateObjectMinusV1MinusResponse {
        val localVarResponse = apikeyCreateObjectV1WithHttpInfo(apikeyMinusCreateObjectMinusV1MinusRequest = apikeyMinusCreateObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApikeyMinusCreateObjectMinusV1MinusResponse
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
    * Create a new Apikey
    * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
    * @param apikeyMinusCreateObjectMinusV1MinusRequest  
    * @return ApiResponse<ApikeyMinusCreateObjectMinusV1MinusResponse?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apikeyCreateObjectV1WithHttpInfo(apikeyMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<ApikeyMinusCreateObjectMinusV1MinusRequest>) : ApiResponse<ApikeyMinusCreateObjectMinusV1MinusResponse?> {
        val localVariableConfig = apikeyCreateObjectV1RequestConfig(apikeyMinusCreateObjectMinusV1MinusRequest = apikeyMinusCreateObjectMinusV1MinusRequest)

        return request<kotlin.collections.List<ApikeyMinusCreateObjectMinusV1MinusRequest>, ApikeyMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation apikeyCreateObjectV1
    *
    * @param apikeyMinusCreateObjectMinusV1MinusRequest  
    * @return RequestConfig
    */
    fun apikeyCreateObjectV1RequestConfig(apikeyMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<ApikeyMinusCreateObjectMinusV1MinusRequest>) : RequestConfig<kotlin.collections.List<ApikeyMinusCreateObjectMinusV1MinusRequest>> {
        val localVariableBody = apikeyMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/apikey",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
