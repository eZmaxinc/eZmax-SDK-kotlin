/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.12
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
import eZmaxApi.models.EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest
import eZmaxApi.models.EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusResponse
import eZmaxApi.models.EzsigntemplatepackagemembershipMinusDeleteObjectMinusV1MinusResponse
import eZmaxApi.models.EzsigntemplatepackagemembershipMinusGetObjectMinusV1MinusResponse

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

class ObjectEzsigntemplatepackagemembershipApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Ezsigntemplatepackagemembership
     * The endpoint allows to create one or many elements at once.
     * @param ezsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest 
     * @return EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatepackagemembershipCreateObjectV1(ezsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest: EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest) : EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusResponse {
        val localVarResponse = ezsigntemplatepackagemembershipCreateObjectV1WithHttpInfo(ezsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest = ezsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusResponse
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
     * Create a new Ezsigntemplatepackagemembership
     * The endpoint allows to create one or many elements at once.
     * @param ezsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest 
     * @return ApiResponse<EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatepackagemembershipCreateObjectV1WithHttpInfo(ezsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest: EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest) : ApiResponse<EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsigntemplatepackagemembershipCreateObjectV1RequestConfig(ezsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest = ezsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest)

        return request<EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest, EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatepackagemembershipCreateObjectV1
     *
     * @param ezsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun ezsigntemplatepackagemembershipCreateObjectV1RequestConfig(ezsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest: EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest) : RequestConfig<EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest> {
        val localVariableBody = ezsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsigntemplatepackagemembership",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Delete an existing Ezsigntemplatepackagemembership
     * 
     * @param pkiEzsigntemplatepackagemembershipID 
     * @return EzsigntemplatepackagemembershipMinusDeleteObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatepackagemembershipDeleteObjectV1(pkiEzsigntemplatepackagemembershipID: kotlin.Int) : EzsigntemplatepackagemembershipMinusDeleteObjectMinusV1MinusResponse {
        val localVarResponse = ezsigntemplatepackagemembershipDeleteObjectV1WithHttpInfo(pkiEzsigntemplatepackagemembershipID = pkiEzsigntemplatepackagemembershipID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatepackagemembershipMinusDeleteObjectMinusV1MinusResponse
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
     * Delete an existing Ezsigntemplatepackagemembership
     * 
     * @param pkiEzsigntemplatepackagemembershipID 
     * @return ApiResponse<EzsigntemplatepackagemembershipMinusDeleteObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatepackagemembershipDeleteObjectV1WithHttpInfo(pkiEzsigntemplatepackagemembershipID: kotlin.Int) : ApiResponse<EzsigntemplatepackagemembershipMinusDeleteObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsigntemplatepackagemembershipDeleteObjectV1RequestConfig(pkiEzsigntemplatepackagemembershipID = pkiEzsigntemplatepackagemembershipID)

        return request<Unit, EzsigntemplatepackagemembershipMinusDeleteObjectMinusV1MinusResponse>(
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
            path = "/1/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID}".replace("{"+"pkiEzsigntemplatepackagemembershipID"+"}", pkiEzsigntemplatepackagemembershipID.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsigntemplatepackagemembership
     * 
     * @param pkiEzsigntemplatepackagemembershipID 
     * @return EzsigntemplatepackagemembershipMinusGetObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatepackagemembershipGetObjectV1(pkiEzsigntemplatepackagemembershipID: kotlin.Int) : EzsigntemplatepackagemembershipMinusGetObjectMinusV1MinusResponse {
        val localVarResponse = ezsigntemplatepackagemembershipGetObjectV1WithHttpInfo(pkiEzsigntemplatepackagemembershipID = pkiEzsigntemplatepackagemembershipID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatepackagemembershipMinusGetObjectMinusV1MinusResponse
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
     * Retrieve an existing Ezsigntemplatepackagemembership
     * 
     * @param pkiEzsigntemplatepackagemembershipID 
     * @return ApiResponse<EzsigntemplatepackagemembershipMinusGetObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatepackagemembershipGetObjectV1WithHttpInfo(pkiEzsigntemplatepackagemembershipID: kotlin.Int) : ApiResponse<EzsigntemplatepackagemembershipMinusGetObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsigntemplatepackagemembershipGetObjectV1RequestConfig(pkiEzsigntemplatepackagemembershipID = pkiEzsigntemplatepackagemembershipID)

        return request<Unit, EzsigntemplatepackagemembershipMinusGetObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatepackagemembershipGetObjectV1
     *
     * @param pkiEzsigntemplatepackagemembershipID 
     * @return RequestConfig
     */
    fun ezsigntemplatepackagemembershipGetObjectV1RequestConfig(pkiEzsigntemplatepackagemembershipID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID}".replace("{"+"pkiEzsigntemplatepackagemembershipID"+"}", pkiEzsigntemplatepackagemembershipID.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
