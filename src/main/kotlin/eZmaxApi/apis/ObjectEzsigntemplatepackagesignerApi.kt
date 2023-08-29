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
import eZmaxApi.models.EzsigntemplatepackagesignerCreateObjectV1Request
import eZmaxApi.models.EzsigntemplatepackagesignerCreateObjectV1Response
import eZmaxApi.models.EzsigntemplatepackagesignerDeleteObjectV1Response
import eZmaxApi.models.EzsigntemplatepackagesignerEditObjectV1Request
import eZmaxApi.models.EzsigntemplatepackagesignerEditObjectV1Response
import eZmaxApi.models.EzsigntemplatepackagesignerGetObjectV2Response

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

class ObjectEzsigntemplatepackagesignerApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Ezsigntemplatepackagesigner
     * The endpoint allows to create one or many elements at once.
     * @param ezsigntemplatepackagesignerCreateObjectV1Request 
     * @return EzsigntemplatepackagesignerCreateObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatepackagesignerCreateObjectV1(ezsigntemplatepackagesignerCreateObjectV1Request: EzsigntemplatepackagesignerCreateObjectV1Request) : EzsigntemplatepackagesignerCreateObjectV1Response {
        val localVarResponse = ezsigntemplatepackagesignerCreateObjectV1WithHttpInfo(ezsigntemplatepackagesignerCreateObjectV1Request = ezsigntemplatepackagesignerCreateObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatepackagesignerCreateObjectV1Response
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
     * Create a new Ezsigntemplatepackagesigner
     * The endpoint allows to create one or many elements at once.
     * @param ezsigntemplatepackagesignerCreateObjectV1Request 
     * @return ApiResponse<EzsigntemplatepackagesignerCreateObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatepackagesignerCreateObjectV1WithHttpInfo(ezsigntemplatepackagesignerCreateObjectV1Request: EzsigntemplatepackagesignerCreateObjectV1Request) : ApiResponse<EzsigntemplatepackagesignerCreateObjectV1Response?> {
        val localVariableConfig = ezsigntemplatepackagesignerCreateObjectV1RequestConfig(ezsigntemplatepackagesignerCreateObjectV1Request = ezsigntemplatepackagesignerCreateObjectV1Request)

        return request<EzsigntemplatepackagesignerCreateObjectV1Request, EzsigntemplatepackagesignerCreateObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatepackagesignerCreateObjectV1
     *
     * @param ezsigntemplatepackagesignerCreateObjectV1Request 
     * @return RequestConfig
     */
    fun ezsigntemplatepackagesignerCreateObjectV1RequestConfig(ezsigntemplatepackagesignerCreateObjectV1Request: EzsigntemplatepackagesignerCreateObjectV1Request) : RequestConfig<EzsigntemplatepackagesignerCreateObjectV1Request> {
        val localVariableBody = ezsigntemplatepackagesignerCreateObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsigntemplatepackagesigner",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete an existing Ezsigntemplatepackagesigner
     * 
     * @param pkiEzsigntemplatepackagesignerID 
     * @return EzsigntemplatepackagesignerDeleteObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatepackagesignerDeleteObjectV1(pkiEzsigntemplatepackagesignerID: kotlin.Int) : EzsigntemplatepackagesignerDeleteObjectV1Response {
        val localVarResponse = ezsigntemplatepackagesignerDeleteObjectV1WithHttpInfo(pkiEzsigntemplatepackagesignerID = pkiEzsigntemplatepackagesignerID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatepackagesignerDeleteObjectV1Response
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
     * Delete an existing Ezsigntemplatepackagesigner
     * 
     * @param pkiEzsigntemplatepackagesignerID 
     * @return ApiResponse<EzsigntemplatepackagesignerDeleteObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatepackagesignerDeleteObjectV1WithHttpInfo(pkiEzsigntemplatepackagesignerID: kotlin.Int) : ApiResponse<EzsigntemplatepackagesignerDeleteObjectV1Response?> {
        val localVariableConfig = ezsigntemplatepackagesignerDeleteObjectV1RequestConfig(pkiEzsigntemplatepackagesignerID = pkiEzsigntemplatepackagesignerID)

        return request<Unit, EzsigntemplatepackagesignerDeleteObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatepackagesignerDeleteObjectV1
     *
     * @param pkiEzsigntemplatepackagesignerID 
     * @return RequestConfig
     */
    fun ezsigntemplatepackagesignerDeleteObjectV1RequestConfig(pkiEzsigntemplatepackagesignerID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}".replace("{"+"pkiEzsigntemplatepackagesignerID"+"}", encodeURIComponent(pkiEzsigntemplatepackagesignerID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Edit an existing Ezsigntemplatepackagesigner
     * 
     * @param pkiEzsigntemplatepackagesignerID 
     * @param ezsigntemplatepackagesignerEditObjectV1Request 
     * @return EzsigntemplatepackagesignerEditObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatepackagesignerEditObjectV1(pkiEzsigntemplatepackagesignerID: kotlin.Int, ezsigntemplatepackagesignerEditObjectV1Request: EzsigntemplatepackagesignerEditObjectV1Request) : EzsigntemplatepackagesignerEditObjectV1Response {
        val localVarResponse = ezsigntemplatepackagesignerEditObjectV1WithHttpInfo(pkiEzsigntemplatepackagesignerID = pkiEzsigntemplatepackagesignerID, ezsigntemplatepackagesignerEditObjectV1Request = ezsigntemplatepackagesignerEditObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatepackagesignerEditObjectV1Response
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
     * Edit an existing Ezsigntemplatepackagesigner
     * 
     * @param pkiEzsigntemplatepackagesignerID 
     * @param ezsigntemplatepackagesignerEditObjectV1Request 
     * @return ApiResponse<EzsigntemplatepackagesignerEditObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatepackagesignerEditObjectV1WithHttpInfo(pkiEzsigntemplatepackagesignerID: kotlin.Int, ezsigntemplatepackagesignerEditObjectV1Request: EzsigntemplatepackagesignerEditObjectV1Request) : ApiResponse<EzsigntemplatepackagesignerEditObjectV1Response?> {
        val localVariableConfig = ezsigntemplatepackagesignerEditObjectV1RequestConfig(pkiEzsigntemplatepackagesignerID = pkiEzsigntemplatepackagesignerID, ezsigntemplatepackagesignerEditObjectV1Request = ezsigntemplatepackagesignerEditObjectV1Request)

        return request<EzsigntemplatepackagesignerEditObjectV1Request, EzsigntemplatepackagesignerEditObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatepackagesignerEditObjectV1
     *
     * @param pkiEzsigntemplatepackagesignerID 
     * @param ezsigntemplatepackagesignerEditObjectV1Request 
     * @return RequestConfig
     */
    fun ezsigntemplatepackagesignerEditObjectV1RequestConfig(pkiEzsigntemplatepackagesignerID: kotlin.Int, ezsigntemplatepackagesignerEditObjectV1Request: EzsigntemplatepackagesignerEditObjectV1Request) : RequestConfig<EzsigntemplatepackagesignerEditObjectV1Request> {
        val localVariableBody = ezsigntemplatepackagesignerEditObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}".replace("{"+"pkiEzsigntemplatepackagesignerID"+"}", encodeURIComponent(pkiEzsigntemplatepackagesignerID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsigntemplatepackagesigner
     * 
     * @param pkiEzsigntemplatepackagesignerID 
     * @return EzsigntemplatepackagesignerGetObjectV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatepackagesignerGetObjectV2(pkiEzsigntemplatepackagesignerID: kotlin.Int) : EzsigntemplatepackagesignerGetObjectV2Response {
        val localVarResponse = ezsigntemplatepackagesignerGetObjectV2WithHttpInfo(pkiEzsigntemplatepackagesignerID = pkiEzsigntemplatepackagesignerID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatepackagesignerGetObjectV2Response
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
     * Retrieve an existing Ezsigntemplatepackagesigner
     * 
     * @param pkiEzsigntemplatepackagesignerID 
     * @return ApiResponse<EzsigntemplatepackagesignerGetObjectV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatepackagesignerGetObjectV2WithHttpInfo(pkiEzsigntemplatepackagesignerID: kotlin.Int) : ApiResponse<EzsigntemplatepackagesignerGetObjectV2Response?> {
        val localVariableConfig = ezsigntemplatepackagesignerGetObjectV2RequestConfig(pkiEzsigntemplatepackagesignerID = pkiEzsigntemplatepackagesignerID)

        return request<Unit, EzsigntemplatepackagesignerGetObjectV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatepackagesignerGetObjectV2
     *
     * @param pkiEzsigntemplatepackagesignerID 
     * @return RequestConfig
     */
    fun ezsigntemplatepackagesignerGetObjectV2RequestConfig(pkiEzsigntemplatepackagesignerID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}".replace("{"+"pkiEzsigntemplatepackagesignerID"+"}", encodeURIComponent(pkiEzsigntemplatepackagesignerID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
