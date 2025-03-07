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

import eZmaxApi.models.ScimGroup

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

class ScimGroupsApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * POST /2/scim/Groups
     * Create a new Usergroup
     * 
     * @param scimGroup 
     * @return ScimGroup
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun groupsCreateObjectScimV2(scimGroup: ScimGroup) : ScimGroup {
        val localVarResponse = groupsCreateObjectScimV2WithHttpInfo(scimGroup = scimGroup)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ScimGroup
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
     * POST /2/scim/Groups
     * Create a new Usergroup
     * 
     * @param scimGroup 
     * @return ApiResponse<ScimGroup?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun groupsCreateObjectScimV2WithHttpInfo(scimGroup: ScimGroup) : ApiResponse<ScimGroup?> {
        val localVariableConfig = groupsCreateObjectScimV2RequestConfig(scimGroup = scimGroup)

        return request<ScimGroup, ScimGroup>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation groupsCreateObjectScimV2
     *
     * @param scimGroup 
     * @return RequestConfig
     */
    fun groupsCreateObjectScimV2RequestConfig(scimGroup: ScimGroup) : RequestConfig<ScimGroup> {
        val localVariableBody = scimGroup
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/2/scim/Groups",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * DELETE /2/scim/Groups/{groupId}
     * Delete an existing Usergroup
     * 
     * @param groupId 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun groupsDeleteObjectScimV2(groupId: kotlin.String) : Unit {
        val localVarResponse = groupsDeleteObjectScimV2WithHttpInfo(groupId = groupId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
     * DELETE /2/scim/Groups/{groupId}
     * Delete an existing Usergroup
     * 
     * @param groupId 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun groupsDeleteObjectScimV2WithHttpInfo(groupId: kotlin.String) : ApiResponse<Unit?> {
        val localVariableConfig = groupsDeleteObjectScimV2RequestConfig(groupId = groupId)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation groupsDeleteObjectScimV2
     *
     * @param groupId 
     * @return RequestConfig
     */
    fun groupsDeleteObjectScimV2RequestConfig(groupId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/2/scim/Groups/{groupId}".replace("{"+"groupId"+"}", encodeURIComponent(groupId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * PUT /2/scim/Groups/{groupId}
     * Edit an existing Usergroup
     * 
     * @param groupId 
     * @param scimGroup 
     * @return ScimGroup
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun groupsEditObjectScimV2(groupId: kotlin.String, scimGroup: ScimGroup) : ScimGroup {
        val localVarResponse = groupsEditObjectScimV2WithHttpInfo(groupId = groupId, scimGroup = scimGroup)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ScimGroup
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
     * PUT /2/scim/Groups/{groupId}
     * Edit an existing Usergroup
     * 
     * @param groupId 
     * @param scimGroup 
     * @return ApiResponse<ScimGroup?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun groupsEditObjectScimV2WithHttpInfo(groupId: kotlin.String, scimGroup: ScimGroup) : ApiResponse<ScimGroup?> {
        val localVariableConfig = groupsEditObjectScimV2RequestConfig(groupId = groupId, scimGroup = scimGroup)

        return request<ScimGroup, ScimGroup>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation groupsEditObjectScimV2
     *
     * @param groupId 
     * @param scimGroup 
     * @return RequestConfig
     */
    fun groupsEditObjectScimV2RequestConfig(groupId: kotlin.String, scimGroup: ScimGroup) : RequestConfig<ScimGroup> {
        val localVariableBody = scimGroup
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/2/scim/Groups/{groupId}".replace("{"+"groupId"+"}", encodeURIComponent(groupId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * GET /2/scim/Groups
     * Retrieve Usergroup list
     * 
     * @param filter Filter expression for searching groups (optional)
     * @return ScimGroup
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun groupsGetListScimV2(filter: kotlin.String? = null) : ScimGroup {
        val localVarResponse = groupsGetListScimV2WithHttpInfo(filter = filter)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ScimGroup
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
     * GET /2/scim/Groups
     * Retrieve Usergroup list
     * 
     * @param filter Filter expression for searching groups (optional)
     * @return ApiResponse<ScimGroup?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun groupsGetListScimV2WithHttpInfo(filter: kotlin.String?) : ApiResponse<ScimGroup?> {
        val localVariableConfig = groupsGetListScimV2RequestConfig(filter = filter)

        return request<Unit, ScimGroup>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation groupsGetListScimV2
     *
     * @param filter Filter expression for searching groups (optional)
     * @return RequestConfig
     */
    fun groupsGetListScimV2RequestConfig(filter: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (filter != null) {
                    put("filter", listOf(filter.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/scim/Groups",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * GET /2/scim/Groups/{groupId}
     * Retrieve an existing Usergroup
     * 
     * @param groupId 
     * @return ScimGroup
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun groupsGetObjectScimV2(groupId: kotlin.String) : ScimGroup {
        val localVarResponse = groupsGetObjectScimV2WithHttpInfo(groupId = groupId)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ScimGroup
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
     * GET /2/scim/Groups/{groupId}
     * Retrieve an existing Usergroup
     * 
     * @param groupId 
     * @return ApiResponse<ScimGroup?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun groupsGetObjectScimV2WithHttpInfo(groupId: kotlin.String) : ApiResponse<ScimGroup?> {
        val localVariableConfig = groupsGetObjectScimV2RequestConfig(groupId = groupId)

        return request<Unit, ScimGroup>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation groupsGetObjectScimV2
     *
     * @param groupId 
     * @return RequestConfig
     */
    fun groupsGetObjectScimV2RequestConfig(groupId: kotlin.String) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/scim/Groups/{groupId}".replace("{"+"groupId"+"}", encodeURIComponent(groupId.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
