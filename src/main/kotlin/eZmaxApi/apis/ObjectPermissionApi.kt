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

import eZmaxApi.models.CommonMinusResponseMinusError
import eZmaxApi.models.PermissionMinusCreateObjectMinusV1MinusRequest
import eZmaxApi.models.PermissionMinusCreateObjectMinusV1MinusResponse
import eZmaxApi.models.PermissionMinusDeleteObjectMinusV1MinusResponse
import eZmaxApi.models.PermissionMinusEditObjectMinusV1MinusRequest
import eZmaxApi.models.PermissionMinusEditObjectMinusV1MinusResponse
import eZmaxApi.models.PermissionMinusGetObjectMinusV2MinusResponse

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

class ObjectPermissionApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Permission
     * The endpoint allows to create one or many elements at once.
     * @param permissionMinusCreateObjectMinusV1MinusRequest 
     * @return PermissionMinusCreateObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun permissionCreateObjectV1(permissionMinusCreateObjectMinusV1MinusRequest: PermissionMinusCreateObjectMinusV1MinusRequest) : PermissionMinusCreateObjectMinusV1MinusResponse {
        val localVarResponse = permissionCreateObjectV1WithHttpInfo(permissionMinusCreateObjectMinusV1MinusRequest = permissionMinusCreateObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PermissionMinusCreateObjectMinusV1MinusResponse
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
     * Create a new Permission
     * The endpoint allows to create one or many elements at once.
     * @param permissionMinusCreateObjectMinusV1MinusRequest 
     * @return ApiResponse<PermissionMinusCreateObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun permissionCreateObjectV1WithHttpInfo(permissionMinusCreateObjectMinusV1MinusRequest: PermissionMinusCreateObjectMinusV1MinusRequest) : ApiResponse<PermissionMinusCreateObjectMinusV1MinusResponse?> {
        val localVariableConfig = permissionCreateObjectV1RequestConfig(permissionMinusCreateObjectMinusV1MinusRequest = permissionMinusCreateObjectMinusV1MinusRequest)

        return request<PermissionMinusCreateObjectMinusV1MinusRequest, PermissionMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation permissionCreateObjectV1
     *
     * @param permissionMinusCreateObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun permissionCreateObjectV1RequestConfig(permissionMinusCreateObjectMinusV1MinusRequest: PermissionMinusCreateObjectMinusV1MinusRequest) : RequestConfig<PermissionMinusCreateObjectMinusV1MinusRequest> {
        val localVariableBody = permissionMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/permission",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete an existing Permission
     * 
     * @param pkiPermissionID The unique ID of the Permission
     * @return PermissionMinusDeleteObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun permissionDeleteObjectV1(pkiPermissionID: kotlin.Int) : PermissionMinusDeleteObjectMinusV1MinusResponse {
        val localVarResponse = permissionDeleteObjectV1WithHttpInfo(pkiPermissionID = pkiPermissionID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PermissionMinusDeleteObjectMinusV1MinusResponse
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
     * Delete an existing Permission
     * 
     * @param pkiPermissionID The unique ID of the Permission
     * @return ApiResponse<PermissionMinusDeleteObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun permissionDeleteObjectV1WithHttpInfo(pkiPermissionID: kotlin.Int) : ApiResponse<PermissionMinusDeleteObjectMinusV1MinusResponse?> {
        val localVariableConfig = permissionDeleteObjectV1RequestConfig(pkiPermissionID = pkiPermissionID)

        return request<Unit, PermissionMinusDeleteObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation permissionDeleteObjectV1
     *
     * @param pkiPermissionID The unique ID of the Permission
     * @return RequestConfig
     */
    fun permissionDeleteObjectV1RequestConfig(pkiPermissionID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/permission/{pkiPermissionID}".replace("{"+"pkiPermissionID"+"}", encodeURIComponent(pkiPermissionID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Edit an existing Permission
     * 
     * @param pkiPermissionID The unique ID of the Permission
     * @param permissionMinusEditObjectMinusV1MinusRequest 
     * @return PermissionMinusEditObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun permissionEditObjectV1(pkiPermissionID: kotlin.Int, permissionMinusEditObjectMinusV1MinusRequest: PermissionMinusEditObjectMinusV1MinusRequest) : PermissionMinusEditObjectMinusV1MinusResponse {
        val localVarResponse = permissionEditObjectV1WithHttpInfo(pkiPermissionID = pkiPermissionID, permissionMinusEditObjectMinusV1MinusRequest = permissionMinusEditObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PermissionMinusEditObjectMinusV1MinusResponse
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
     * Edit an existing Permission
     * 
     * @param pkiPermissionID The unique ID of the Permission
     * @param permissionMinusEditObjectMinusV1MinusRequest 
     * @return ApiResponse<PermissionMinusEditObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun permissionEditObjectV1WithHttpInfo(pkiPermissionID: kotlin.Int, permissionMinusEditObjectMinusV1MinusRequest: PermissionMinusEditObjectMinusV1MinusRequest) : ApiResponse<PermissionMinusEditObjectMinusV1MinusResponse?> {
        val localVariableConfig = permissionEditObjectV1RequestConfig(pkiPermissionID = pkiPermissionID, permissionMinusEditObjectMinusV1MinusRequest = permissionMinusEditObjectMinusV1MinusRequest)

        return request<PermissionMinusEditObjectMinusV1MinusRequest, PermissionMinusEditObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation permissionEditObjectV1
     *
     * @param pkiPermissionID The unique ID of the Permission
     * @param permissionMinusEditObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun permissionEditObjectV1RequestConfig(pkiPermissionID: kotlin.Int, permissionMinusEditObjectMinusV1MinusRequest: PermissionMinusEditObjectMinusV1MinusRequest) : RequestConfig<PermissionMinusEditObjectMinusV1MinusRequest> {
        val localVariableBody = permissionMinusEditObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/permission/{pkiPermissionID}".replace("{"+"pkiPermissionID"+"}", encodeURIComponent(pkiPermissionID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Permission
     * 
     * @param pkiPermissionID The unique ID of the Permission
     * @return PermissionMinusGetObjectMinusV2MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun permissionGetObjectV2(pkiPermissionID: kotlin.Int) : PermissionMinusGetObjectMinusV2MinusResponse {
        val localVarResponse = permissionGetObjectV2WithHttpInfo(pkiPermissionID = pkiPermissionID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PermissionMinusGetObjectMinusV2MinusResponse
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
     * Retrieve an existing Permission
     * 
     * @param pkiPermissionID The unique ID of the Permission
     * @return ApiResponse<PermissionMinusGetObjectMinusV2MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun permissionGetObjectV2WithHttpInfo(pkiPermissionID: kotlin.Int) : ApiResponse<PermissionMinusGetObjectMinusV2MinusResponse?> {
        val localVariableConfig = permissionGetObjectV2RequestConfig(pkiPermissionID = pkiPermissionID)

        return request<Unit, PermissionMinusGetObjectMinusV2MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation permissionGetObjectV2
     *
     * @param pkiPermissionID The unique ID of the Permission
     * @return RequestConfig
     */
    fun permissionGetObjectV2RequestConfig(pkiPermissionID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/permission/{pkiPermissionID}".replace("{"+"pkiPermissionID"+"}", encodeURIComponent(pkiPermissionID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
