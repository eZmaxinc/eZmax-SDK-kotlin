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
import eZmaxApi.models.EzsignsignergroupmembershipCreateObjectV1Request
import eZmaxApi.models.EzsignsignergroupmembershipCreateObjectV1Response
import eZmaxApi.models.EzsignsignergroupmembershipDeleteObjectV1Response
import eZmaxApi.models.EzsignsignergroupmembershipGetObjectV2Response

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

class ObjectEzsignsignergroupmembershipApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Ezsignsignergroupmembership
     * The endpoint allows to create one or many elements at once.
     * @param ezsignsignergroupmembershipCreateObjectV1Request 
     * @return EzsignsignergroupmembershipCreateObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignsignergroupmembershipCreateObjectV1(ezsignsignergroupmembershipCreateObjectV1Request: EzsignsignergroupmembershipCreateObjectV1Request) : EzsignsignergroupmembershipCreateObjectV1Response {
        val localVarResponse = ezsignsignergroupmembershipCreateObjectV1WithHttpInfo(ezsignsignergroupmembershipCreateObjectV1Request = ezsignsignergroupmembershipCreateObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignsignergroupmembershipCreateObjectV1Response
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
     * Create a new Ezsignsignergroupmembership
     * The endpoint allows to create one or many elements at once.
     * @param ezsignsignergroupmembershipCreateObjectV1Request 
     * @return ApiResponse<EzsignsignergroupmembershipCreateObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignsignergroupmembershipCreateObjectV1WithHttpInfo(ezsignsignergroupmembershipCreateObjectV1Request: EzsignsignergroupmembershipCreateObjectV1Request) : ApiResponse<EzsignsignergroupmembershipCreateObjectV1Response?> {
        val localVariableConfig = ezsignsignergroupmembershipCreateObjectV1RequestConfig(ezsignsignergroupmembershipCreateObjectV1Request = ezsignsignergroupmembershipCreateObjectV1Request)

        return request<EzsignsignergroupmembershipCreateObjectV1Request, EzsignsignergroupmembershipCreateObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignsignergroupmembershipCreateObjectV1
     *
     * @param ezsignsignergroupmembershipCreateObjectV1Request 
     * @return RequestConfig
     */
    fun ezsignsignergroupmembershipCreateObjectV1RequestConfig(ezsignsignergroupmembershipCreateObjectV1Request: EzsignsignergroupmembershipCreateObjectV1Request) : RequestConfig<EzsignsignergroupmembershipCreateObjectV1Request> {
        val localVariableBody = ezsignsignergroupmembershipCreateObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsignsignergroupmembership",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete an existing Ezsignsignergroupmembership
     * 
     * @param pkiEzsignsignergroupmembershipID The unique ID of the Ezsignsignergroupmembership
     * @return EzsignsignergroupmembershipDeleteObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignsignergroupmembershipDeleteObjectV1(pkiEzsignsignergroupmembershipID: kotlin.Int) : EzsignsignergroupmembershipDeleteObjectV1Response {
        val localVarResponse = ezsignsignergroupmembershipDeleteObjectV1WithHttpInfo(pkiEzsignsignergroupmembershipID = pkiEzsignsignergroupmembershipID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignsignergroupmembershipDeleteObjectV1Response
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
     * Delete an existing Ezsignsignergroupmembership
     * 
     * @param pkiEzsignsignergroupmembershipID The unique ID of the Ezsignsignergroupmembership
     * @return ApiResponse<EzsignsignergroupmembershipDeleteObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignsignergroupmembershipDeleteObjectV1WithHttpInfo(pkiEzsignsignergroupmembershipID: kotlin.Int) : ApiResponse<EzsignsignergroupmembershipDeleteObjectV1Response?> {
        val localVariableConfig = ezsignsignergroupmembershipDeleteObjectV1RequestConfig(pkiEzsignsignergroupmembershipID = pkiEzsignsignergroupmembershipID)

        return request<Unit, EzsignsignergroupmembershipDeleteObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignsignergroupmembershipDeleteObjectV1
     *
     * @param pkiEzsignsignergroupmembershipID The unique ID of the Ezsignsignergroupmembership
     * @return RequestConfig
     */
    fun ezsignsignergroupmembershipDeleteObjectV1RequestConfig(pkiEzsignsignergroupmembershipID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/ezsignsignergroupmembership/{pkiEzsignsignergroupmembershipID}".replace("{"+"pkiEzsignsignergroupmembershipID"+"}", encodeURIComponent(pkiEzsignsignergroupmembershipID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsignsignergroupmembership
     * 
     * @param pkiEzsignsignergroupmembershipID The unique ID of the Ezsignsignergroupmembership
     * @return EzsignsignergroupmembershipGetObjectV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignsignergroupmembershipGetObjectV2(pkiEzsignsignergroupmembershipID: kotlin.Int) : EzsignsignergroupmembershipGetObjectV2Response {
        val localVarResponse = ezsignsignergroupmembershipGetObjectV2WithHttpInfo(pkiEzsignsignergroupmembershipID = pkiEzsignsignergroupmembershipID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignsignergroupmembershipGetObjectV2Response
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
     * Retrieve an existing Ezsignsignergroupmembership
     * 
     * @param pkiEzsignsignergroupmembershipID The unique ID of the Ezsignsignergroupmembership
     * @return ApiResponse<EzsignsignergroupmembershipGetObjectV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignsignergroupmembershipGetObjectV2WithHttpInfo(pkiEzsignsignergroupmembershipID: kotlin.Int) : ApiResponse<EzsignsignergroupmembershipGetObjectV2Response?> {
        val localVariableConfig = ezsignsignergroupmembershipGetObjectV2RequestConfig(pkiEzsignsignergroupmembershipID = pkiEzsignsignergroupmembershipID)

        return request<Unit, EzsignsignergroupmembershipGetObjectV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignsignergroupmembershipGetObjectV2
     *
     * @param pkiEzsignsignergroupmembershipID The unique ID of the Ezsignsignergroupmembership
     * @return RequestConfig
     */
    fun ezsignsignergroupmembershipGetObjectV2RequestConfig(pkiEzsignsignergroupmembershipID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/ezsignsignergroupmembership/{pkiEzsignsignergroupmembershipID}".replace("{"+"pkiEzsignsignergroupmembershipID"+"}", encodeURIComponent(pkiEzsignsignergroupmembershipID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}