/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
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
import eZmaxApi.models.EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest
import eZmaxApi.models.EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignbulksendsignermappingMinusDeleteObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignbulksendsignermappingMinusGetObjectMinusV1MinusResponse

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

class ObjectEzsignbulksendsignermappingApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Ezsignbulksendsignermapping
     * The endpoint allows to create one or many elements at once.
     * @param ezsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest 
     * @return EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignbulksendsignermappingCreateObjectV1(ezsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest: EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest) : EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusResponse {
        val localVarResponse = ezsignbulksendsignermappingCreateObjectV1WithHttpInfo(ezsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest = ezsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusResponse
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
     * Create a new Ezsignbulksendsignermapping
     * The endpoint allows to create one or many elements at once.
     * @param ezsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest 
     * @return ApiResponse<EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignbulksendsignermappingCreateObjectV1WithHttpInfo(ezsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest: EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest) : ApiResponse<EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsignbulksendsignermappingCreateObjectV1RequestConfig(ezsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest = ezsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest)

        return request<EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest, EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignbulksendsignermappingCreateObjectV1
     *
     * @param ezsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun ezsignbulksendsignermappingCreateObjectV1RequestConfig(ezsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest: EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest) : RequestConfig<EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest> {
        val localVariableBody = ezsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsignbulksendsignermapping",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Delete an existing Ezsignbulksendsignermapping
     * 
     * @param pkiEzsignbulksendsignermappingID 
     * @return EzsignbulksendsignermappingMinusDeleteObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignbulksendsignermappingDeleteObjectV1(pkiEzsignbulksendsignermappingID: kotlin.Int) : EzsignbulksendsignermappingMinusDeleteObjectMinusV1MinusResponse {
        val localVarResponse = ezsignbulksendsignermappingDeleteObjectV1WithHttpInfo(pkiEzsignbulksendsignermappingID = pkiEzsignbulksendsignermappingID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignbulksendsignermappingMinusDeleteObjectMinusV1MinusResponse
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
     * Delete an existing Ezsignbulksendsignermapping
     * 
     * @param pkiEzsignbulksendsignermappingID 
     * @return ApiResponse<EzsignbulksendsignermappingMinusDeleteObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignbulksendsignermappingDeleteObjectV1WithHttpInfo(pkiEzsignbulksendsignermappingID: kotlin.Int) : ApiResponse<EzsignbulksendsignermappingMinusDeleteObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsignbulksendsignermappingDeleteObjectV1RequestConfig(pkiEzsignbulksendsignermappingID = pkiEzsignbulksendsignermappingID)

        return request<Unit, EzsignbulksendsignermappingMinusDeleteObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignbulksendsignermappingDeleteObjectV1
     *
     * @param pkiEzsignbulksendsignermappingID 
     * @return RequestConfig
     */
    fun ezsignbulksendsignermappingDeleteObjectV1RequestConfig(pkiEzsignbulksendsignermappingID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID}".replace("{"+"pkiEzsignbulksendsignermappingID"+"}", pkiEzsignbulksendsignermappingID.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsignbulksendsignermapping
     * 
     * @param pkiEzsignbulksendsignermappingID 
     * @return EzsignbulksendsignermappingMinusGetObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignbulksendsignermappingGetObjectV1(pkiEzsignbulksendsignermappingID: kotlin.Int) : EzsignbulksendsignermappingMinusGetObjectMinusV1MinusResponse {
        val localVarResponse = ezsignbulksendsignermappingGetObjectV1WithHttpInfo(pkiEzsignbulksendsignermappingID = pkiEzsignbulksendsignermappingID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignbulksendsignermappingMinusGetObjectMinusV1MinusResponse
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
     * Retrieve an existing Ezsignbulksendsignermapping
     * 
     * @param pkiEzsignbulksendsignermappingID 
     * @return ApiResponse<EzsignbulksendsignermappingMinusGetObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignbulksendsignermappingGetObjectV1WithHttpInfo(pkiEzsignbulksendsignermappingID: kotlin.Int) : ApiResponse<EzsignbulksendsignermappingMinusGetObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsignbulksendsignermappingGetObjectV1RequestConfig(pkiEzsignbulksendsignermappingID = pkiEzsignbulksendsignermappingID)

        return request<Unit, EzsignbulksendsignermappingMinusGetObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignbulksendsignermappingGetObjectV1
     *
     * @param pkiEzsignbulksendsignermappingID 
     * @return RequestConfig
     */
    fun ezsignbulksendsignermappingGetObjectV1RequestConfig(pkiEzsignbulksendsignermappingID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID}".replace("{"+"pkiEzsignbulksendsignermappingID"+"}", pkiEzsignbulksendsignermappingID.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
