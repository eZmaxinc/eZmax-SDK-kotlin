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
import eZmaxApi.models.EzsigntemplatesignatureCreateObjectV1Request
import eZmaxApi.models.EzsigntemplatesignatureCreateObjectV1Response
import eZmaxApi.models.EzsigntemplatesignatureDeleteObjectV1Response
import eZmaxApi.models.EzsigntemplatesignatureEditObjectV1Request
import eZmaxApi.models.EzsigntemplatesignatureEditObjectV1Response
import eZmaxApi.models.EzsigntemplatesignatureGetObjectV2Response

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

class ObjectEzsigntemplatesignatureApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Ezsigntemplatesignature
     * The endpoint allows to create one or many elements at once.
     * @param ezsigntemplatesignatureCreateObjectV1Request 
     * @return EzsigntemplatesignatureCreateObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatesignatureCreateObjectV1(ezsigntemplatesignatureCreateObjectV1Request: EzsigntemplatesignatureCreateObjectV1Request) : EzsigntemplatesignatureCreateObjectV1Response {
        val localVarResponse = ezsigntemplatesignatureCreateObjectV1WithHttpInfo(ezsigntemplatesignatureCreateObjectV1Request = ezsigntemplatesignatureCreateObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatesignatureCreateObjectV1Response
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
     * Create a new Ezsigntemplatesignature
     * The endpoint allows to create one or many elements at once.
     * @param ezsigntemplatesignatureCreateObjectV1Request 
     * @return ApiResponse<EzsigntemplatesignatureCreateObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatesignatureCreateObjectV1WithHttpInfo(ezsigntemplatesignatureCreateObjectV1Request: EzsigntemplatesignatureCreateObjectV1Request) : ApiResponse<EzsigntemplatesignatureCreateObjectV1Response?> {
        val localVariableConfig = ezsigntemplatesignatureCreateObjectV1RequestConfig(ezsigntemplatesignatureCreateObjectV1Request = ezsigntemplatesignatureCreateObjectV1Request)

        return request<EzsigntemplatesignatureCreateObjectV1Request, EzsigntemplatesignatureCreateObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatesignatureCreateObjectV1
     *
     * @param ezsigntemplatesignatureCreateObjectV1Request 
     * @return RequestConfig
     */
    fun ezsigntemplatesignatureCreateObjectV1RequestConfig(ezsigntemplatesignatureCreateObjectV1Request: EzsigntemplatesignatureCreateObjectV1Request) : RequestConfig<EzsigntemplatesignatureCreateObjectV1Request> {
        val localVariableBody = ezsigntemplatesignatureCreateObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsigntemplatesignature",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete an existing Ezsigntemplatesignature
     * 
     * @param pkiEzsigntemplatesignatureID 
     * @return EzsigntemplatesignatureDeleteObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatesignatureDeleteObjectV1(pkiEzsigntemplatesignatureID: kotlin.Int) : EzsigntemplatesignatureDeleteObjectV1Response {
        val localVarResponse = ezsigntemplatesignatureDeleteObjectV1WithHttpInfo(pkiEzsigntemplatesignatureID = pkiEzsigntemplatesignatureID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatesignatureDeleteObjectV1Response
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
     * Delete an existing Ezsigntemplatesignature
     * 
     * @param pkiEzsigntemplatesignatureID 
     * @return ApiResponse<EzsigntemplatesignatureDeleteObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatesignatureDeleteObjectV1WithHttpInfo(pkiEzsigntemplatesignatureID: kotlin.Int) : ApiResponse<EzsigntemplatesignatureDeleteObjectV1Response?> {
        val localVariableConfig = ezsigntemplatesignatureDeleteObjectV1RequestConfig(pkiEzsigntemplatesignatureID = pkiEzsigntemplatesignatureID)

        return request<Unit, EzsigntemplatesignatureDeleteObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatesignatureDeleteObjectV1
     *
     * @param pkiEzsigntemplatesignatureID 
     * @return RequestConfig
     */
    fun ezsigntemplatesignatureDeleteObjectV1RequestConfig(pkiEzsigntemplatesignatureID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID}".replace("{"+"pkiEzsigntemplatesignatureID"+"}", encodeURIComponent(pkiEzsigntemplatesignatureID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Edit an existing Ezsigntemplatesignature
     * 
     * @param pkiEzsigntemplatesignatureID 
     * @param ezsigntemplatesignatureEditObjectV1Request 
     * @return EzsigntemplatesignatureEditObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatesignatureEditObjectV1(pkiEzsigntemplatesignatureID: kotlin.Int, ezsigntemplatesignatureEditObjectV1Request: EzsigntemplatesignatureEditObjectV1Request) : EzsigntemplatesignatureEditObjectV1Response {
        val localVarResponse = ezsigntemplatesignatureEditObjectV1WithHttpInfo(pkiEzsigntemplatesignatureID = pkiEzsigntemplatesignatureID, ezsigntemplatesignatureEditObjectV1Request = ezsigntemplatesignatureEditObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatesignatureEditObjectV1Response
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
     * Edit an existing Ezsigntemplatesignature
     * 
     * @param pkiEzsigntemplatesignatureID 
     * @param ezsigntemplatesignatureEditObjectV1Request 
     * @return ApiResponse<EzsigntemplatesignatureEditObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatesignatureEditObjectV1WithHttpInfo(pkiEzsigntemplatesignatureID: kotlin.Int, ezsigntemplatesignatureEditObjectV1Request: EzsigntemplatesignatureEditObjectV1Request) : ApiResponse<EzsigntemplatesignatureEditObjectV1Response?> {
        val localVariableConfig = ezsigntemplatesignatureEditObjectV1RequestConfig(pkiEzsigntemplatesignatureID = pkiEzsigntemplatesignatureID, ezsigntemplatesignatureEditObjectV1Request = ezsigntemplatesignatureEditObjectV1Request)

        return request<EzsigntemplatesignatureEditObjectV1Request, EzsigntemplatesignatureEditObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatesignatureEditObjectV1
     *
     * @param pkiEzsigntemplatesignatureID 
     * @param ezsigntemplatesignatureEditObjectV1Request 
     * @return RequestConfig
     */
    fun ezsigntemplatesignatureEditObjectV1RequestConfig(pkiEzsigntemplatesignatureID: kotlin.Int, ezsigntemplatesignatureEditObjectV1Request: EzsigntemplatesignatureEditObjectV1Request) : RequestConfig<EzsigntemplatesignatureEditObjectV1Request> {
        val localVariableBody = ezsigntemplatesignatureEditObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID}".replace("{"+"pkiEzsigntemplatesignatureID"+"}", encodeURIComponent(pkiEzsigntemplatesignatureID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsigntemplatesignature
     * 
     * @param pkiEzsigntemplatesignatureID 
     * @return EzsigntemplatesignatureGetObjectV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatesignatureGetObjectV2(pkiEzsigntemplatesignatureID: kotlin.Int) : EzsigntemplatesignatureGetObjectV2Response {
        val localVarResponse = ezsigntemplatesignatureGetObjectV2WithHttpInfo(pkiEzsigntemplatesignatureID = pkiEzsigntemplatesignatureID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatesignatureGetObjectV2Response
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
     * Retrieve an existing Ezsigntemplatesignature
     * 
     * @param pkiEzsigntemplatesignatureID 
     * @return ApiResponse<EzsigntemplatesignatureGetObjectV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatesignatureGetObjectV2WithHttpInfo(pkiEzsigntemplatesignatureID: kotlin.Int) : ApiResponse<EzsigntemplatesignatureGetObjectV2Response?> {
        val localVariableConfig = ezsigntemplatesignatureGetObjectV2RequestConfig(pkiEzsigntemplatesignatureID = pkiEzsigntemplatesignatureID)

        return request<Unit, EzsigntemplatesignatureGetObjectV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatesignatureGetObjectV2
     *
     * @param pkiEzsigntemplatesignatureID 
     * @return RequestConfig
     */
    fun ezsigntemplatesignatureGetObjectV2RequestConfig(pkiEzsigntemplatesignatureID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID}".replace("{"+"pkiEzsigntemplatesignatureID"+"}", encodeURIComponent(pkiEzsigntemplatesignatureID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
