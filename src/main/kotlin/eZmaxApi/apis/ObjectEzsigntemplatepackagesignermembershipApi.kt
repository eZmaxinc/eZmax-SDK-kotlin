/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
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

import eZmaxApi.models.CommonMinusResponseMinusError
import eZmaxApi.models.EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest
import eZmaxApi.models.EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusResponse
import eZmaxApi.models.EzsigntemplatepackagesignermembershipMinusDeleteObjectMinusV1MinusResponse
import eZmaxApi.models.EzsigntemplatepackagesignermembershipMinusGetObjectMinusV1MinusResponse

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

class ObjectEzsigntemplatepackagesignermembershipApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Ezsigntemplatepackagesignermembership
     * The endpoint allows to create one or many elements at once.
     * @param ezsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest 
     * @return EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatepackagesignermembershipCreateObjectV1(ezsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest: EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest) : EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusResponse {
        val localVarResponse = ezsigntemplatepackagesignermembershipCreateObjectV1WithHttpInfo(ezsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest = ezsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusResponse
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
     * Create a new Ezsigntemplatepackagesignermembership
     * The endpoint allows to create one or many elements at once.
     * @param ezsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest 
     * @return ApiResponse<EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatepackagesignermembershipCreateObjectV1WithHttpInfo(ezsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest: EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest) : ApiResponse<EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsigntemplatepackagesignermembershipCreateObjectV1RequestConfig(ezsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest = ezsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest)

        return request<EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest, EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatepackagesignermembershipCreateObjectV1
     *
     * @param ezsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun ezsigntemplatepackagesignermembershipCreateObjectV1RequestConfig(ezsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest: EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest) : RequestConfig<EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest> {
        val localVariableBody = ezsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsigntemplatepackagesignermembership",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Delete an existing Ezsigntemplatepackagesignermembership
     * 
     * @param pkiEzsigntemplatepackagesignermembershipID 
     * @return EzsigntemplatepackagesignermembershipMinusDeleteObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatepackagesignermembershipDeleteObjectV1(pkiEzsigntemplatepackagesignermembershipID: kotlin.Int) : EzsigntemplatepackagesignermembershipMinusDeleteObjectMinusV1MinusResponse {
        val localVarResponse = ezsigntemplatepackagesignermembershipDeleteObjectV1WithHttpInfo(pkiEzsigntemplatepackagesignermembershipID = pkiEzsigntemplatepackagesignermembershipID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatepackagesignermembershipMinusDeleteObjectMinusV1MinusResponse
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
     * Delete an existing Ezsigntemplatepackagesignermembership
     * 
     * @param pkiEzsigntemplatepackagesignermembershipID 
     * @return ApiResponse<EzsigntemplatepackagesignermembershipMinusDeleteObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatepackagesignermembershipDeleteObjectV1WithHttpInfo(pkiEzsigntemplatepackagesignermembershipID: kotlin.Int) : ApiResponse<EzsigntemplatepackagesignermembershipMinusDeleteObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsigntemplatepackagesignermembershipDeleteObjectV1RequestConfig(pkiEzsigntemplatepackagesignermembershipID = pkiEzsigntemplatepackagesignermembershipID)

        return request<Unit, EzsigntemplatepackagesignermembershipMinusDeleteObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatepackagesignermembershipDeleteObjectV1
     *
     * @param pkiEzsigntemplatepackagesignermembershipID 
     * @return RequestConfig
     */
    fun ezsigntemplatepackagesignermembershipDeleteObjectV1RequestConfig(pkiEzsigntemplatepackagesignermembershipID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID}".replace("{"+"pkiEzsigntemplatepackagesignermembershipID"+"}", "$pkiEzsigntemplatepackagesignermembershipID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsigntemplatepackagesignermembership
     * 
     * @param pkiEzsigntemplatepackagesignermembershipID 
     * @return EzsigntemplatepackagesignermembershipMinusGetObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatepackagesignermembershipGetObjectV1(pkiEzsigntemplatepackagesignermembershipID: kotlin.Int) : EzsigntemplatepackagesignermembershipMinusGetObjectMinusV1MinusResponse {
        val localVarResponse = ezsigntemplatepackagesignermembershipGetObjectV1WithHttpInfo(pkiEzsigntemplatepackagesignermembershipID = pkiEzsigntemplatepackagesignermembershipID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatepackagesignermembershipMinusGetObjectMinusV1MinusResponse
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
     * Retrieve an existing Ezsigntemplatepackagesignermembership
     * 
     * @param pkiEzsigntemplatepackagesignermembershipID 
     * @return ApiResponse<EzsigntemplatepackagesignermembershipMinusGetObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatepackagesignermembershipGetObjectV1WithHttpInfo(pkiEzsigntemplatepackagesignermembershipID: kotlin.Int) : ApiResponse<EzsigntemplatepackagesignermembershipMinusGetObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsigntemplatepackagesignermembershipGetObjectV1RequestConfig(pkiEzsigntemplatepackagesignermembershipID = pkiEzsigntemplatepackagesignermembershipID)

        return request<Unit, EzsigntemplatepackagesignermembershipMinusGetObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplatepackagesignermembershipGetObjectV1
     *
     * @param pkiEzsigntemplatepackagesignermembershipID 
     * @return RequestConfig
     */
    fun ezsigntemplatepackagesignermembershipGetObjectV1RequestConfig(pkiEzsigntemplatepackagesignermembershipID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID}".replace("{"+"pkiEzsigntemplatepackagesignermembershipID"+"}", "$pkiEzsigntemplatepackagesignermembershipID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
