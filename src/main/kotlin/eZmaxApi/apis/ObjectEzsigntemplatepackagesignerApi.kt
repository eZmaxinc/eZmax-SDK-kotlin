/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
 * Contact: support-api@ezmax.ca
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
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

import eZmaxApi.models.CommonMinusResponseMinusError
import eZmaxApi.models.EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest
import eZmaxApi.models.EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusResponse
import eZmaxApi.models.EzsigntemplatepackagesignerMinusDeleteObjectMinusV1MinusResponse
import eZmaxApi.models.EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest
import eZmaxApi.models.EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusResponse
import eZmaxApi.models.EzsigntemplatepackagesignerMinusGetObjectMinusV1MinusResponse

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
     * @param ezsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest 
     * @return EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatepackagesignerCreateObjectV1(ezsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest: EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest) : EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusResponse {
        val localVarResponse = ezsigntemplatepackagesignerCreateObjectV1WithHttpInfo(ezsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest = ezsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusResponse
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
     * @param ezsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest 
     * @return ApiResponse<EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatepackagesignerCreateObjectV1WithHttpInfo(ezsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest: EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest) : ApiResponse<EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsigntemplatepackagesignerCreateObjectV1RequestConfig(ezsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest = ezsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest)

        return request<EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest, EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatepackagesignerCreateObjectV1
     *
     * @param ezsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun ezsigntemplatepackagesignerCreateObjectV1RequestConfig(ezsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest: EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest) : RequestConfig<EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest> {
        val localVariableBody = ezsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsigntemplatepackagesigner",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Delete an existing Ezsigntemplatepackagesigner
     * 
     * @param pkiEzsigntemplatepackagesignerID 
     * @return EzsigntemplatepackagesignerMinusDeleteObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatepackagesignerDeleteObjectV1(pkiEzsigntemplatepackagesignerID: kotlin.Int) : EzsigntemplatepackagesignerMinusDeleteObjectMinusV1MinusResponse {
        val localVarResponse = ezsigntemplatepackagesignerDeleteObjectV1WithHttpInfo(pkiEzsigntemplatepackagesignerID = pkiEzsigntemplatepackagesignerID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatepackagesignerMinusDeleteObjectMinusV1MinusResponse
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
     * @return ApiResponse<EzsigntemplatepackagesignerMinusDeleteObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatepackagesignerDeleteObjectV1WithHttpInfo(pkiEzsigntemplatepackagesignerID: kotlin.Int) : ApiResponse<EzsigntemplatepackagesignerMinusDeleteObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsigntemplatepackagesignerDeleteObjectV1RequestConfig(pkiEzsigntemplatepackagesignerID = pkiEzsigntemplatepackagesignerID)

        return request<Unit, EzsigntemplatepackagesignerMinusDeleteObjectMinusV1MinusResponse>(
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
            path = "/1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}".replace("{"+"pkiEzsigntemplatepackagesignerID"+"}", pkiEzsigntemplatepackagesignerID.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Edit an existing Ezsigntemplatepackagesigner
     * 
     * @param pkiEzsigntemplatepackagesignerID 
     * @param ezsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest 
     * @return EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatepackagesignerEditObjectV1(pkiEzsigntemplatepackagesignerID: kotlin.Int, ezsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest: EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest) : EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusResponse {
        val localVarResponse = ezsigntemplatepackagesignerEditObjectV1WithHttpInfo(pkiEzsigntemplatepackagesignerID = pkiEzsigntemplatepackagesignerID, ezsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest = ezsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusResponse
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
     * @param ezsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest 
     * @return ApiResponse<EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatepackagesignerEditObjectV1WithHttpInfo(pkiEzsigntemplatepackagesignerID: kotlin.Int, ezsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest: EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest) : ApiResponse<EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsigntemplatepackagesignerEditObjectV1RequestConfig(pkiEzsigntemplatepackagesignerID = pkiEzsigntemplatepackagesignerID, ezsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest = ezsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest)

        return request<EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest, EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatepackagesignerEditObjectV1
     *
     * @param pkiEzsigntemplatepackagesignerID 
     * @param ezsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun ezsigntemplatepackagesignerEditObjectV1RequestConfig(pkiEzsigntemplatepackagesignerID: kotlin.Int, ezsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest: EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest) : RequestConfig<EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest> {
        val localVariableBody = ezsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}".replace("{"+"pkiEzsigntemplatepackagesignerID"+"}", pkiEzsigntemplatepackagesignerID.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsigntemplatepackagesigner
     * 
     * @param pkiEzsigntemplatepackagesignerID 
     * @return EzsigntemplatepackagesignerMinusGetObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatepackagesignerGetObjectV1(pkiEzsigntemplatepackagesignerID: kotlin.Int) : EzsigntemplatepackagesignerMinusGetObjectMinusV1MinusResponse {
        val localVarResponse = ezsigntemplatepackagesignerGetObjectV1WithHttpInfo(pkiEzsigntemplatepackagesignerID = pkiEzsigntemplatepackagesignerID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatepackagesignerMinusGetObjectMinusV1MinusResponse
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
     * @return ApiResponse<EzsigntemplatepackagesignerMinusGetObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatepackagesignerGetObjectV1WithHttpInfo(pkiEzsigntemplatepackagesignerID: kotlin.Int) : ApiResponse<EzsigntemplatepackagesignerMinusGetObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsigntemplatepackagesignerGetObjectV1RequestConfig(pkiEzsigntemplatepackagesignerID = pkiEzsigntemplatepackagesignerID)

        return request<Unit, EzsigntemplatepackagesignerMinusGetObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatepackagesignerGetObjectV1
     *
     * @param pkiEzsigntemplatepackagesignerID 
     * @return RequestConfig
     */
    fun ezsigntemplatepackagesignerGetObjectV1RequestConfig(pkiEzsigntemplatepackagesignerID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID}".replace("{"+"pkiEzsigntemplatepackagesignerID"+"}", pkiEzsigntemplatepackagesignerID.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
