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
import eZmaxApi.models.PermissionCreateObjectV1Request
import eZmaxApi.models.PermissionCreateObjectV1Response
import eZmaxApi.models.PermissionDeleteObjectV1Response
import eZmaxApi.models.PermissionEditObjectV1Request
import eZmaxApi.models.PermissionEditObjectV1Response
import eZmaxApi.models.PermissionGetObjectV2Response

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
     * @param permissionCreateObjectV1Request 
     * @return PermissionCreateObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun permissionCreateObjectV1(permissionCreateObjectV1Request: PermissionCreateObjectV1Request) : PermissionCreateObjectV1Response {
        val localVarResponse = permissionCreateObjectV1WithHttpInfo(permissionCreateObjectV1Request = permissionCreateObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PermissionCreateObjectV1Response
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
     * @param permissionCreateObjectV1Request 
     * @return ApiResponse<PermissionCreateObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun permissionCreateObjectV1WithHttpInfo(permissionCreateObjectV1Request: PermissionCreateObjectV1Request) : ApiResponse<PermissionCreateObjectV1Response?> {
        val localVariableConfig = permissionCreateObjectV1RequestConfig(permissionCreateObjectV1Request = permissionCreateObjectV1Request)

        return request<PermissionCreateObjectV1Request, PermissionCreateObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation permissionCreateObjectV1
     *
     * @param permissionCreateObjectV1Request 
     * @return RequestConfig
     */
    fun permissionCreateObjectV1RequestConfig(permissionCreateObjectV1Request: PermissionCreateObjectV1Request) : RequestConfig<PermissionCreateObjectV1Request> {
        val localVariableBody = permissionCreateObjectV1Request
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
     * @return PermissionDeleteObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun permissionDeleteObjectV1(pkiPermissionID: kotlin.Int) : PermissionDeleteObjectV1Response {
        val localVarResponse = permissionDeleteObjectV1WithHttpInfo(pkiPermissionID = pkiPermissionID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PermissionDeleteObjectV1Response
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
     * @return ApiResponse<PermissionDeleteObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun permissionDeleteObjectV1WithHttpInfo(pkiPermissionID: kotlin.Int) : ApiResponse<PermissionDeleteObjectV1Response?> {
        val localVariableConfig = permissionDeleteObjectV1RequestConfig(pkiPermissionID = pkiPermissionID)

        return request<Unit, PermissionDeleteObjectV1Response>(
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
     * @param permissionEditObjectV1Request 
     * @return PermissionEditObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun permissionEditObjectV1(pkiPermissionID: kotlin.Int, permissionEditObjectV1Request: PermissionEditObjectV1Request) : PermissionEditObjectV1Response {
        val localVarResponse = permissionEditObjectV1WithHttpInfo(pkiPermissionID = pkiPermissionID, permissionEditObjectV1Request = permissionEditObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PermissionEditObjectV1Response
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
     * @param permissionEditObjectV1Request 
     * @return ApiResponse<PermissionEditObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun permissionEditObjectV1WithHttpInfo(pkiPermissionID: kotlin.Int, permissionEditObjectV1Request: PermissionEditObjectV1Request) : ApiResponse<PermissionEditObjectV1Response?> {
        val localVariableConfig = permissionEditObjectV1RequestConfig(pkiPermissionID = pkiPermissionID, permissionEditObjectV1Request = permissionEditObjectV1Request)

        return request<PermissionEditObjectV1Request, PermissionEditObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation permissionEditObjectV1
     *
     * @param pkiPermissionID The unique ID of the Permission
     * @param permissionEditObjectV1Request 
     * @return RequestConfig
     */
    fun permissionEditObjectV1RequestConfig(pkiPermissionID: kotlin.Int, permissionEditObjectV1Request: PermissionEditObjectV1Request) : RequestConfig<PermissionEditObjectV1Request> {
        val localVariableBody = permissionEditObjectV1Request
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
     * @return PermissionGetObjectV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun permissionGetObjectV2(pkiPermissionID: kotlin.Int) : PermissionGetObjectV2Response {
        val localVarResponse = permissionGetObjectV2WithHttpInfo(pkiPermissionID = pkiPermissionID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PermissionGetObjectV2Response
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
     * @return ApiResponse<PermissionGetObjectV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun permissionGetObjectV2WithHttpInfo(pkiPermissionID: kotlin.Int) : ApiResponse<PermissionGetObjectV2Response?> {
        val localVariableConfig = permissionGetObjectV2RequestConfig(pkiPermissionID = pkiPermissionID)

        return request<Unit, PermissionGetObjectV2Response>(
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
