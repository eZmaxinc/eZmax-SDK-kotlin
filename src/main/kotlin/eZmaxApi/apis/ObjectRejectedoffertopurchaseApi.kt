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

import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.RejectedoffertopurchaseGetCommunicationListV1Response

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

class ObjectRejectedoffertopurchaseApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Retrieve Communication list
     * 
     * @param pkiRejectedoffertopurchaseID 
     * @return RejectedoffertopurchaseGetCommunicationListV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun rejectedoffertopurchaseGetCommunicationListV1(pkiRejectedoffertopurchaseID: kotlin.Int) : RejectedoffertopurchaseGetCommunicationListV1Response {
        val localVarResponse = rejectedoffertopurchaseGetCommunicationListV1WithHttpInfo(pkiRejectedoffertopurchaseID = pkiRejectedoffertopurchaseID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as RejectedoffertopurchaseGetCommunicationListV1Response
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
     * Retrieve Communication list
     * 
     * @param pkiRejectedoffertopurchaseID 
     * @return ApiResponse<RejectedoffertopurchaseGetCommunicationListV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun rejectedoffertopurchaseGetCommunicationListV1WithHttpInfo(pkiRejectedoffertopurchaseID: kotlin.Int) : ApiResponse<RejectedoffertopurchaseGetCommunicationListV1Response?> {
        val localVariableConfig = rejectedoffertopurchaseGetCommunicationListV1RequestConfig(pkiRejectedoffertopurchaseID = pkiRejectedoffertopurchaseID)

        return request<Unit, RejectedoffertopurchaseGetCommunicationListV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation rejectedoffertopurchaseGetCommunicationListV1
     *
     * @param pkiRejectedoffertopurchaseID 
     * @return RequestConfig
     */
    fun rejectedoffertopurchaseGetCommunicationListV1RequestConfig(pkiRejectedoffertopurchaseID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/rejectedoffertopurchase/{pkiRejectedoffertopurchaseID}/getCommunicationList".replace("{"+"pkiRejectedoffertopurchaseID"+"}", encodeURIComponent(pkiRejectedoffertopurchaseID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
