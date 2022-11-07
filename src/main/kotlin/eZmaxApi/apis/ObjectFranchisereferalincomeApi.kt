/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.15
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

import eZmaxApi.models.FranchisereferalincomeMinusCreateObjectMinusV1MinusRequest
import eZmaxApi.models.FranchisereferalincomeMinusCreateObjectMinusV1MinusResponse
import eZmaxApi.models.FranchisereferalincomeMinusCreateObjectMinusV2MinusRequest
import eZmaxApi.models.FranchisereferalincomeMinusCreateObjectMinusV2MinusResponse

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

class ObjectFranchisereferalincomeApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Franchisereferalincome
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     * @param franchisereferalincomeMinusCreateObjectMinusV1MinusRequest 
     * @return FranchisereferalincomeMinusCreateObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun franchisereferalincomeCreateObjectV1(franchisereferalincomeMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<FranchisereferalincomeMinusCreateObjectMinusV1MinusRequest>) : FranchisereferalincomeMinusCreateObjectMinusV1MinusResponse {
        @Suppress("DEPRECATION")
        val localVarResponse = franchisereferalincomeCreateObjectV1WithHttpInfo(franchisereferalincomeMinusCreateObjectMinusV1MinusRequest = franchisereferalincomeMinusCreateObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as FranchisereferalincomeMinusCreateObjectMinusV1MinusResponse
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
     * Create a new Franchisereferalincome
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     * @param franchisereferalincomeMinusCreateObjectMinusV1MinusRequest 
     * @return ApiResponse<FranchisereferalincomeMinusCreateObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun franchisereferalincomeCreateObjectV1WithHttpInfo(franchisereferalincomeMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<FranchisereferalincomeMinusCreateObjectMinusV1MinusRequest>) : ApiResponse<FranchisereferalincomeMinusCreateObjectMinusV1MinusResponse?> {
        @Suppress("DEPRECATION")
        val localVariableConfig = franchisereferalincomeCreateObjectV1RequestConfig(franchisereferalincomeMinusCreateObjectMinusV1MinusRequest = franchisereferalincomeMinusCreateObjectMinusV1MinusRequest)

        return request<kotlin.collections.List<FranchisereferalincomeMinusCreateObjectMinusV1MinusRequest>, FranchisereferalincomeMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation franchisereferalincomeCreateObjectV1
     *
     * @param franchisereferalincomeMinusCreateObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    @Deprecated(message = "This operation is deprecated.")
    fun franchisereferalincomeCreateObjectV1RequestConfig(franchisereferalincomeMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<FranchisereferalincomeMinusCreateObjectMinusV1MinusRequest>) : RequestConfig<kotlin.collections.List<FranchisereferalincomeMinusCreateObjectMinusV1MinusRequest>> {
        val localVariableBody = franchisereferalincomeMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/franchisereferalincome",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Create a new Franchisereferalincome
     * The endpoint allows to create one or many elements at once.
     * @param franchisereferalincomeMinusCreateObjectMinusV2MinusRequest 
     * @return FranchisereferalincomeMinusCreateObjectMinusV2MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun franchisereferalincomeCreateObjectV2(franchisereferalincomeMinusCreateObjectMinusV2MinusRequest: FranchisereferalincomeMinusCreateObjectMinusV2MinusRequest) : FranchisereferalincomeMinusCreateObjectMinusV2MinusResponse {
        val localVarResponse = franchisereferalincomeCreateObjectV2WithHttpInfo(franchisereferalincomeMinusCreateObjectMinusV2MinusRequest = franchisereferalincomeMinusCreateObjectMinusV2MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as FranchisereferalincomeMinusCreateObjectMinusV2MinusResponse
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
     * Create a new Franchisereferalincome
     * The endpoint allows to create one or many elements at once.
     * @param franchisereferalincomeMinusCreateObjectMinusV2MinusRequest 
     * @return ApiResponse<FranchisereferalincomeMinusCreateObjectMinusV2MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun franchisereferalincomeCreateObjectV2WithHttpInfo(franchisereferalincomeMinusCreateObjectMinusV2MinusRequest: FranchisereferalincomeMinusCreateObjectMinusV2MinusRequest) : ApiResponse<FranchisereferalincomeMinusCreateObjectMinusV2MinusResponse?> {
        val localVariableConfig = franchisereferalincomeCreateObjectV2RequestConfig(franchisereferalincomeMinusCreateObjectMinusV2MinusRequest = franchisereferalincomeMinusCreateObjectMinusV2MinusRequest)

        return request<FranchisereferalincomeMinusCreateObjectMinusV2MinusRequest, FranchisereferalincomeMinusCreateObjectMinusV2MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation franchisereferalincomeCreateObjectV2
     *
     * @param franchisereferalincomeMinusCreateObjectMinusV2MinusRequest 
     * @return RequestConfig
     */
    fun franchisereferalincomeCreateObjectV2RequestConfig(franchisereferalincomeMinusCreateObjectMinusV2MinusRequest: FranchisereferalincomeMinusCreateObjectMinusV2MinusRequest) : RequestConfig<FranchisereferalincomeMinusCreateObjectMinusV2MinusRequest> {
        val localVariableBody = franchisereferalincomeMinusCreateObjectMinusV2MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/2/object/franchisereferalincome",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
