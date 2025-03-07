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
import eZmaxApi.models.EzsigndiscussionCreateObjectV1Request
import eZmaxApi.models.EzsigndiscussionCreateObjectV1Response
import eZmaxApi.models.EzsigndiscussionDeleteObjectV1Response
import eZmaxApi.models.EzsigndiscussionGetObjectV2Response

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

class ObjectEzsigndiscussionApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * POST /1/object/ezsigndiscussion
     * Create a new Ezsigndiscussion
     * The endpoint allows to create one or many elements at once.
     * @param ezsigndiscussionCreateObjectV1Request 
     * @return EzsigndiscussionCreateObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigndiscussionCreateObjectV1(ezsigndiscussionCreateObjectV1Request: EzsigndiscussionCreateObjectV1Request) : EzsigndiscussionCreateObjectV1Response {
        val localVarResponse = ezsigndiscussionCreateObjectV1WithHttpInfo(ezsigndiscussionCreateObjectV1Request = ezsigndiscussionCreateObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigndiscussionCreateObjectV1Response
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
     * POST /1/object/ezsigndiscussion
     * Create a new Ezsigndiscussion
     * The endpoint allows to create one or many elements at once.
     * @param ezsigndiscussionCreateObjectV1Request 
     * @return ApiResponse<EzsigndiscussionCreateObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigndiscussionCreateObjectV1WithHttpInfo(ezsigndiscussionCreateObjectV1Request: EzsigndiscussionCreateObjectV1Request) : ApiResponse<EzsigndiscussionCreateObjectV1Response?> {
        val localVariableConfig = ezsigndiscussionCreateObjectV1RequestConfig(ezsigndiscussionCreateObjectV1Request = ezsigndiscussionCreateObjectV1Request)

        return request<EzsigndiscussionCreateObjectV1Request, EzsigndiscussionCreateObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigndiscussionCreateObjectV1
     *
     * @param ezsigndiscussionCreateObjectV1Request 
     * @return RequestConfig
     */
    fun ezsigndiscussionCreateObjectV1RequestConfig(ezsigndiscussionCreateObjectV1Request: EzsigndiscussionCreateObjectV1Request) : RequestConfig<EzsigndiscussionCreateObjectV1Request> {
        val localVariableBody = ezsigndiscussionCreateObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsigndiscussion",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * DELETE /1/object/ezsigndiscussion/{pkiEzsigndiscussionID}
     * Delete an existing Ezsigndiscussion
     * 
     * @param pkiEzsigndiscussionID The unique ID of the Ezsigndiscussion
     * @return EzsigndiscussionDeleteObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigndiscussionDeleteObjectV1(pkiEzsigndiscussionID: kotlin.Int) : EzsigndiscussionDeleteObjectV1Response {
        val localVarResponse = ezsigndiscussionDeleteObjectV1WithHttpInfo(pkiEzsigndiscussionID = pkiEzsigndiscussionID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigndiscussionDeleteObjectV1Response
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
     * DELETE /1/object/ezsigndiscussion/{pkiEzsigndiscussionID}
     * Delete an existing Ezsigndiscussion
     * 
     * @param pkiEzsigndiscussionID The unique ID of the Ezsigndiscussion
     * @return ApiResponse<EzsigndiscussionDeleteObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigndiscussionDeleteObjectV1WithHttpInfo(pkiEzsigndiscussionID: kotlin.Int) : ApiResponse<EzsigndiscussionDeleteObjectV1Response?> {
        val localVariableConfig = ezsigndiscussionDeleteObjectV1RequestConfig(pkiEzsigndiscussionID = pkiEzsigndiscussionID)

        return request<Unit, EzsigndiscussionDeleteObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigndiscussionDeleteObjectV1
     *
     * @param pkiEzsigndiscussionID The unique ID of the Ezsigndiscussion
     * @return RequestConfig
     */
    fun ezsigndiscussionDeleteObjectV1RequestConfig(pkiEzsigndiscussionID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/ezsigndiscussion/{pkiEzsigndiscussionID}".replace("{"+"pkiEzsigndiscussionID"+"}", encodeURIComponent(pkiEzsigndiscussionID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * GET /2/object/ezsigndiscussion/{pkiEzsigndiscussionID}
     * Retrieve an existing Ezsigndiscussion
     * 
     * @param pkiEzsigndiscussionID The unique ID of the Ezsigndiscussion
     * @return EzsigndiscussionGetObjectV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigndiscussionGetObjectV2(pkiEzsigndiscussionID: kotlin.Int) : EzsigndiscussionGetObjectV2Response {
        val localVarResponse = ezsigndiscussionGetObjectV2WithHttpInfo(pkiEzsigndiscussionID = pkiEzsigndiscussionID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigndiscussionGetObjectV2Response
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
     * GET /2/object/ezsigndiscussion/{pkiEzsigndiscussionID}
     * Retrieve an existing Ezsigndiscussion
     * 
     * @param pkiEzsigndiscussionID The unique ID of the Ezsigndiscussion
     * @return ApiResponse<EzsigndiscussionGetObjectV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigndiscussionGetObjectV2WithHttpInfo(pkiEzsigndiscussionID: kotlin.Int) : ApiResponse<EzsigndiscussionGetObjectV2Response?> {
        val localVariableConfig = ezsigndiscussionGetObjectV2RequestConfig(pkiEzsigndiscussionID = pkiEzsigndiscussionID)

        return request<Unit, EzsigndiscussionGetObjectV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigndiscussionGetObjectV2
     *
     * @param pkiEzsigndiscussionID The unique ID of the Ezsigndiscussion
     * @return RequestConfig
     */
    fun ezsigndiscussionGetObjectV2RequestConfig(pkiEzsigndiscussionID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/ezsigndiscussion/{pkiEzsigndiscussionID}".replace("{"+"pkiEzsigndiscussionID"+"}", encodeURIComponent(pkiEzsigndiscussionID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
