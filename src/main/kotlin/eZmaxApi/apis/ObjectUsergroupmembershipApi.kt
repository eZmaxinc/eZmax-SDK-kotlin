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
import eZmaxApi.models.UsergroupmembershipCreateObjectV1Request
import eZmaxApi.models.UsergroupmembershipCreateObjectV1Response
import eZmaxApi.models.UsergroupmembershipDeleteObjectV1Response
import eZmaxApi.models.UsergroupmembershipEditObjectV1Request
import eZmaxApi.models.UsergroupmembershipEditObjectV1Response
import eZmaxApi.models.UsergroupmembershipGetObjectV2Response

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

class ObjectUsergroupmembershipApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Usergroupmembership
     * The endpoint allows to create one or many elements at once.
     * @param usergroupmembershipCreateObjectV1Request 
     * @return UsergroupmembershipCreateObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun usergroupmembershipCreateObjectV1(usergroupmembershipCreateObjectV1Request: UsergroupmembershipCreateObjectV1Request) : UsergroupmembershipCreateObjectV1Response {
        val localVarResponse = usergroupmembershipCreateObjectV1WithHttpInfo(usergroupmembershipCreateObjectV1Request = usergroupmembershipCreateObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UsergroupmembershipCreateObjectV1Response
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
     * Create a new Usergroupmembership
     * The endpoint allows to create one or many elements at once.
     * @param usergroupmembershipCreateObjectV1Request 
     * @return ApiResponse<UsergroupmembershipCreateObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun usergroupmembershipCreateObjectV1WithHttpInfo(usergroupmembershipCreateObjectV1Request: UsergroupmembershipCreateObjectV1Request) : ApiResponse<UsergroupmembershipCreateObjectV1Response?> {
        val localVariableConfig = usergroupmembershipCreateObjectV1RequestConfig(usergroupmembershipCreateObjectV1Request = usergroupmembershipCreateObjectV1Request)

        return request<UsergroupmembershipCreateObjectV1Request, UsergroupmembershipCreateObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation usergroupmembershipCreateObjectV1
     *
     * @param usergroupmembershipCreateObjectV1Request 
     * @return RequestConfig
     */
    fun usergroupmembershipCreateObjectV1RequestConfig(usergroupmembershipCreateObjectV1Request: UsergroupmembershipCreateObjectV1Request) : RequestConfig<UsergroupmembershipCreateObjectV1Request> {
        val localVariableBody = usergroupmembershipCreateObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/usergroupmembership",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete an existing Usergroupmembership
     * 
     * @param pkiUsergroupmembershipID 
     * @return UsergroupmembershipDeleteObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun usergroupmembershipDeleteObjectV1(pkiUsergroupmembershipID: kotlin.Int) : UsergroupmembershipDeleteObjectV1Response {
        val localVarResponse = usergroupmembershipDeleteObjectV1WithHttpInfo(pkiUsergroupmembershipID = pkiUsergroupmembershipID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UsergroupmembershipDeleteObjectV1Response
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
     * Delete an existing Usergroupmembership
     * 
     * @param pkiUsergroupmembershipID 
     * @return ApiResponse<UsergroupmembershipDeleteObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun usergroupmembershipDeleteObjectV1WithHttpInfo(pkiUsergroupmembershipID: kotlin.Int) : ApiResponse<UsergroupmembershipDeleteObjectV1Response?> {
        val localVariableConfig = usergroupmembershipDeleteObjectV1RequestConfig(pkiUsergroupmembershipID = pkiUsergroupmembershipID)

        return request<Unit, UsergroupmembershipDeleteObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation usergroupmembershipDeleteObjectV1
     *
     * @param pkiUsergroupmembershipID 
     * @return RequestConfig
     */
    fun usergroupmembershipDeleteObjectV1RequestConfig(pkiUsergroupmembershipID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/usergroupmembership/{pkiUsergroupmembershipID}".replace("{"+"pkiUsergroupmembershipID"+"}", encodeURIComponent(pkiUsergroupmembershipID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Edit an existing Usergroupmembership
     * 
     * @param pkiUsergroupmembershipID 
     * @param usergroupmembershipEditObjectV1Request 
     * @return UsergroupmembershipEditObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun usergroupmembershipEditObjectV1(pkiUsergroupmembershipID: kotlin.Int, usergroupmembershipEditObjectV1Request: UsergroupmembershipEditObjectV1Request) : UsergroupmembershipEditObjectV1Response {
        val localVarResponse = usergroupmembershipEditObjectV1WithHttpInfo(pkiUsergroupmembershipID = pkiUsergroupmembershipID, usergroupmembershipEditObjectV1Request = usergroupmembershipEditObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UsergroupmembershipEditObjectV1Response
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
     * Edit an existing Usergroupmembership
     * 
     * @param pkiUsergroupmembershipID 
     * @param usergroupmembershipEditObjectV1Request 
     * @return ApiResponse<UsergroupmembershipEditObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun usergroupmembershipEditObjectV1WithHttpInfo(pkiUsergroupmembershipID: kotlin.Int, usergroupmembershipEditObjectV1Request: UsergroupmembershipEditObjectV1Request) : ApiResponse<UsergroupmembershipEditObjectV1Response?> {
        val localVariableConfig = usergroupmembershipEditObjectV1RequestConfig(pkiUsergroupmembershipID = pkiUsergroupmembershipID, usergroupmembershipEditObjectV1Request = usergroupmembershipEditObjectV1Request)

        return request<UsergroupmembershipEditObjectV1Request, UsergroupmembershipEditObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation usergroupmembershipEditObjectV1
     *
     * @param pkiUsergroupmembershipID 
     * @param usergroupmembershipEditObjectV1Request 
     * @return RequestConfig
     */
    fun usergroupmembershipEditObjectV1RequestConfig(pkiUsergroupmembershipID: kotlin.Int, usergroupmembershipEditObjectV1Request: UsergroupmembershipEditObjectV1Request) : RequestConfig<UsergroupmembershipEditObjectV1Request> {
        val localVariableBody = usergroupmembershipEditObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/usergroupmembership/{pkiUsergroupmembershipID}".replace("{"+"pkiUsergroupmembershipID"+"}", encodeURIComponent(pkiUsergroupmembershipID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Usergroupmembership
     * 
     * @param pkiUsergroupmembershipID 
     * @return UsergroupmembershipGetObjectV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun usergroupmembershipGetObjectV2(pkiUsergroupmembershipID: kotlin.Int) : UsergroupmembershipGetObjectV2Response {
        val localVarResponse = usergroupmembershipGetObjectV2WithHttpInfo(pkiUsergroupmembershipID = pkiUsergroupmembershipID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UsergroupmembershipGetObjectV2Response
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
     * Retrieve an existing Usergroupmembership
     * 
     * @param pkiUsergroupmembershipID 
     * @return ApiResponse<UsergroupmembershipGetObjectV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun usergroupmembershipGetObjectV2WithHttpInfo(pkiUsergroupmembershipID: kotlin.Int) : ApiResponse<UsergroupmembershipGetObjectV2Response?> {
        val localVariableConfig = usergroupmembershipGetObjectV2RequestConfig(pkiUsergroupmembershipID = pkiUsergroupmembershipID)

        return request<Unit, UsergroupmembershipGetObjectV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation usergroupmembershipGetObjectV2
     *
     * @param pkiUsergroupmembershipID 
     * @return RequestConfig
     */
    fun usergroupmembershipGetObjectV2RequestConfig(pkiUsergroupmembershipID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/usergroupmembership/{pkiUsergroupmembershipID}".replace("{"+"pkiUsergroupmembershipID"+"}", encodeURIComponent(pkiUsergroupmembershipID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
