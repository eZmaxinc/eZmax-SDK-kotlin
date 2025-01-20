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

import eZmaxApi.models.CommonResponse
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.SystemconfigurationEditObjectV1Request
import eZmaxApi.models.SystemconfigurationGetObjectV2Response

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

class ObjectSystemconfigurationApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Edit an existing Systemconfiguration
     * 
     * @param pkiSystemconfigurationID The unique ID of the Systemconfiguration
     * @param systemconfigurationEditObjectV1Request 
     * @return CommonResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun systemconfigurationEditObjectV1(pkiSystemconfigurationID: kotlin.Int, systemconfigurationEditObjectV1Request: SystemconfigurationEditObjectV1Request) : CommonResponse {
        val localVarResponse = systemconfigurationEditObjectV1WithHttpInfo(pkiSystemconfigurationID = pkiSystemconfigurationID, systemconfigurationEditObjectV1Request = systemconfigurationEditObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CommonResponse
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
     * Edit an existing Systemconfiguration
     * 
     * @param pkiSystemconfigurationID The unique ID of the Systemconfiguration
     * @param systemconfigurationEditObjectV1Request 
     * @return ApiResponse<CommonResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun systemconfigurationEditObjectV1WithHttpInfo(pkiSystemconfigurationID: kotlin.Int, systemconfigurationEditObjectV1Request: SystemconfigurationEditObjectV1Request) : ApiResponse<CommonResponse?> {
        val localVariableConfig = systemconfigurationEditObjectV1RequestConfig(pkiSystemconfigurationID = pkiSystemconfigurationID, systemconfigurationEditObjectV1Request = systemconfigurationEditObjectV1Request)

        return request<SystemconfigurationEditObjectV1Request, CommonResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation systemconfigurationEditObjectV1
     *
     * @param pkiSystemconfigurationID The unique ID of the Systemconfiguration
     * @param systemconfigurationEditObjectV1Request 
     * @return RequestConfig
     */
    fun systemconfigurationEditObjectV1RequestConfig(pkiSystemconfigurationID: kotlin.Int, systemconfigurationEditObjectV1Request: SystemconfigurationEditObjectV1Request) : RequestConfig<SystemconfigurationEditObjectV1Request> {
        val localVariableBody = systemconfigurationEditObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/systemconfiguration/{pkiSystemconfigurationID}".replace("{"+"pkiSystemconfigurationID"+"}", encodeURIComponent(pkiSystemconfigurationID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Systemconfiguration
     * 
     * @param pkiSystemconfigurationID The unique ID of the Systemconfiguration
     * @return SystemconfigurationGetObjectV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun systemconfigurationGetObjectV2(pkiSystemconfigurationID: kotlin.Int) : SystemconfigurationGetObjectV2Response {
        val localVarResponse = systemconfigurationGetObjectV2WithHttpInfo(pkiSystemconfigurationID = pkiSystemconfigurationID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SystemconfigurationGetObjectV2Response
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
     * Retrieve an existing Systemconfiguration
     * 
     * @param pkiSystemconfigurationID The unique ID of the Systemconfiguration
     * @return ApiResponse<SystemconfigurationGetObjectV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun systemconfigurationGetObjectV2WithHttpInfo(pkiSystemconfigurationID: kotlin.Int) : ApiResponse<SystemconfigurationGetObjectV2Response?> {
        val localVariableConfig = systemconfigurationGetObjectV2RequestConfig(pkiSystemconfigurationID = pkiSystemconfigurationID)

        return request<Unit, SystemconfigurationGetObjectV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation systemconfigurationGetObjectV2
     *
     * @param pkiSystemconfigurationID The unique ID of the Systemconfiguration
     * @return RequestConfig
     */
    fun systemconfigurationGetObjectV2RequestConfig(pkiSystemconfigurationID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/systemconfiguration/{pkiSystemconfigurationID}".replace("{"+"pkiSystemconfigurationID"+"}", encodeURIComponent(pkiSystemconfigurationID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
