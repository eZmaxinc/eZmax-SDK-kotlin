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
import eZmaxApi.models.EzsigntemplatepackagemembershipCreateObjectV1Request
import eZmaxApi.models.EzsigntemplatepackagemembershipCreateObjectV1Response
import eZmaxApi.models.EzsigntemplatepackagemembershipDeleteObjectV1Response
import eZmaxApi.models.EzsigntemplatepackagemembershipGetObjectV2Response

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

class ObjectEzsigntemplatepackagemembershipApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Ezsigntemplatepackagemembership
     * The endpoint allows to create one or many elements at once.
     * @param ezsigntemplatepackagemembershipCreateObjectV1Request 
     * @return EzsigntemplatepackagemembershipCreateObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatepackagemembershipCreateObjectV1(ezsigntemplatepackagemembershipCreateObjectV1Request: EzsigntemplatepackagemembershipCreateObjectV1Request) : EzsigntemplatepackagemembershipCreateObjectV1Response {
        val localVarResponse = ezsigntemplatepackagemembershipCreateObjectV1WithHttpInfo(ezsigntemplatepackagemembershipCreateObjectV1Request = ezsigntemplatepackagemembershipCreateObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatepackagemembershipCreateObjectV1Response
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
     * Create a new Ezsigntemplatepackagemembership
     * The endpoint allows to create one or many elements at once.
     * @param ezsigntemplatepackagemembershipCreateObjectV1Request 
     * @return ApiResponse<EzsigntemplatepackagemembershipCreateObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatepackagemembershipCreateObjectV1WithHttpInfo(ezsigntemplatepackagemembershipCreateObjectV1Request: EzsigntemplatepackagemembershipCreateObjectV1Request) : ApiResponse<EzsigntemplatepackagemembershipCreateObjectV1Response?> {
        val localVariableConfig = ezsigntemplatepackagemembershipCreateObjectV1RequestConfig(ezsigntemplatepackagemembershipCreateObjectV1Request = ezsigntemplatepackagemembershipCreateObjectV1Request)

        return request<EzsigntemplatepackagemembershipCreateObjectV1Request, EzsigntemplatepackagemembershipCreateObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatepackagemembershipCreateObjectV1
     *
     * @param ezsigntemplatepackagemembershipCreateObjectV1Request 
     * @return RequestConfig
     */
    fun ezsigntemplatepackagemembershipCreateObjectV1RequestConfig(ezsigntemplatepackagemembershipCreateObjectV1Request: EzsigntemplatepackagemembershipCreateObjectV1Request) : RequestConfig<EzsigntemplatepackagemembershipCreateObjectV1Request> {
        val localVariableBody = ezsigntemplatepackagemembershipCreateObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsigntemplatepackagemembership",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete an existing Ezsigntemplatepackagemembership
     * 
     * @param pkiEzsigntemplatepackagemembershipID 
     * @return EzsigntemplatepackagemembershipDeleteObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatepackagemembershipDeleteObjectV1(pkiEzsigntemplatepackagemembershipID: kotlin.Int) : EzsigntemplatepackagemembershipDeleteObjectV1Response {
        val localVarResponse = ezsigntemplatepackagemembershipDeleteObjectV1WithHttpInfo(pkiEzsigntemplatepackagemembershipID = pkiEzsigntemplatepackagemembershipID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatepackagemembershipDeleteObjectV1Response
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
     * Delete an existing Ezsigntemplatepackagemembership
     * 
     * @param pkiEzsigntemplatepackagemembershipID 
     * @return ApiResponse<EzsigntemplatepackagemembershipDeleteObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatepackagemembershipDeleteObjectV1WithHttpInfo(pkiEzsigntemplatepackagemembershipID: kotlin.Int) : ApiResponse<EzsigntemplatepackagemembershipDeleteObjectV1Response?> {
        val localVariableConfig = ezsigntemplatepackagemembershipDeleteObjectV1RequestConfig(pkiEzsigntemplatepackagemembershipID = pkiEzsigntemplatepackagemembershipID)

        return request<Unit, EzsigntemplatepackagemembershipDeleteObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatepackagemembershipDeleteObjectV1
     *
     * @param pkiEzsigntemplatepackagemembershipID 
     * @return RequestConfig
     */
    fun ezsigntemplatepackagemembershipDeleteObjectV1RequestConfig(pkiEzsigntemplatepackagemembershipID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID}".replace("{"+"pkiEzsigntemplatepackagemembershipID"+"}", encodeURIComponent(pkiEzsigntemplatepackagemembershipID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsigntemplatepackagemembership
     * 
     * @param pkiEzsigntemplatepackagemembershipID 
     * @return EzsigntemplatepackagemembershipGetObjectV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatepackagemembershipGetObjectV2(pkiEzsigntemplatepackagemembershipID: kotlin.Int) : EzsigntemplatepackagemembershipGetObjectV2Response {
        val localVarResponse = ezsigntemplatepackagemembershipGetObjectV2WithHttpInfo(pkiEzsigntemplatepackagemembershipID = pkiEzsigntemplatepackagemembershipID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatepackagemembershipGetObjectV2Response
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
     * Retrieve an existing Ezsigntemplatepackagemembership
     * 
     * @param pkiEzsigntemplatepackagemembershipID 
     * @return ApiResponse<EzsigntemplatepackagemembershipGetObjectV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatepackagemembershipGetObjectV2WithHttpInfo(pkiEzsigntemplatepackagemembershipID: kotlin.Int) : ApiResponse<EzsigntemplatepackagemembershipGetObjectV2Response?> {
        val localVariableConfig = ezsigntemplatepackagemembershipGetObjectV2RequestConfig(pkiEzsigntemplatepackagemembershipID = pkiEzsigntemplatepackagemembershipID)

        return request<Unit, EzsigntemplatepackagemembershipGetObjectV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatepackagemembershipGetObjectV2
     *
     * @param pkiEzsigntemplatepackagemembershipID 
     * @return RequestConfig
     */
    fun ezsigntemplatepackagemembershipGetObjectV2RequestConfig(pkiEzsigntemplatepackagemembershipID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID}".replace("{"+"pkiEzsigntemplatepackagemembershipID"+"}", encodeURIComponent(pkiEzsigntemplatepackagemembershipID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
