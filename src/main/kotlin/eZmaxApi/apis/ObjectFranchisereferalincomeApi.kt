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

import eZmaxApi.models.FranchisereferalincomeCreateObjectV2Request
import eZmaxApi.models.FranchisereferalincomeCreateObjectV2Response

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
     * The endpoint allows to create one or many elements at once.
     * @param franchisereferalincomeCreateObjectV2Request 
     * @return FranchisereferalincomeCreateObjectV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun franchisereferalincomeCreateObjectV2(franchisereferalincomeCreateObjectV2Request: FranchisereferalincomeCreateObjectV2Request) : FranchisereferalincomeCreateObjectV2Response {
        val localVarResponse = franchisereferalincomeCreateObjectV2WithHttpInfo(franchisereferalincomeCreateObjectV2Request = franchisereferalincomeCreateObjectV2Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as FranchisereferalincomeCreateObjectV2Response
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
     * Create a new Franchisereferalincome
     * The endpoint allows to create one or many elements at once.
     * @param franchisereferalincomeCreateObjectV2Request 
     * @return ApiResponse<FranchisereferalincomeCreateObjectV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun franchisereferalincomeCreateObjectV2WithHttpInfo(franchisereferalincomeCreateObjectV2Request: FranchisereferalincomeCreateObjectV2Request) : ApiResponse<FranchisereferalincomeCreateObjectV2Response?> {
        val localVariableConfig = franchisereferalincomeCreateObjectV2RequestConfig(franchisereferalincomeCreateObjectV2Request = franchisereferalincomeCreateObjectV2Request)

        return request<FranchisereferalincomeCreateObjectV2Request, FranchisereferalincomeCreateObjectV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation franchisereferalincomeCreateObjectV2
     *
     * @param franchisereferalincomeCreateObjectV2Request 
     * @return RequestConfig
     */
    fun franchisereferalincomeCreateObjectV2RequestConfig(franchisereferalincomeCreateObjectV2Request: FranchisereferalincomeCreateObjectV2Request) : RequestConfig<FranchisereferalincomeCreateObjectV2Request> {
        val localVariableBody = franchisereferalincomeCreateObjectV2Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/2/object/franchisereferalincome",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
