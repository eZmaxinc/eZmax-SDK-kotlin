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
import eZmaxApi.models.EzsignbulksendtransmissionMinusGetFormsDataMinusV1MinusResponse
import eZmaxApi.models.EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponse

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

class ObjectEzsignbulksendtransmissionApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Retrieve an existing Ezsignbulksendtransmission&#39;s Csv containing errors
     * 
     * @param pkiEzsignbulksendtransmissionID 
     * @return kotlin.String
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignbulksendtransmissionGetCsvErrorsV1(pkiEzsignbulksendtransmissionID: kotlin.Int) : kotlin.String {
        val localVarResponse = ezsignbulksendtransmissionGetCsvErrorsV1WithHttpInfo(pkiEzsignbulksendtransmissionID = pkiEzsignbulksendtransmissionID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as kotlin.String
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
     * Retrieve an existing Ezsignbulksendtransmission&#39;s Csv containing errors
     * 
     * @param pkiEzsignbulksendtransmissionID 
     * @return ApiResponse<kotlin.String?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignbulksendtransmissionGetCsvErrorsV1WithHttpInfo(pkiEzsignbulksendtransmissionID: kotlin.Int) : ApiResponse<kotlin.String?> {
        val localVariableConfig = ezsignbulksendtransmissionGetCsvErrorsV1RequestConfig(pkiEzsignbulksendtransmissionID = pkiEzsignbulksendtransmissionID)

        return request<Unit, kotlin.String>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignbulksendtransmissionGetCsvErrorsV1
     *
     * @param pkiEzsignbulksendtransmissionID 
     * @return RequestConfig
     */
    fun ezsignbulksendtransmissionGetCsvErrorsV1RequestConfig(pkiEzsignbulksendtransmissionID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getCsvErrors".replace("{"+"pkiEzsignbulksendtransmissionID"+"}", "$pkiEzsignbulksendtransmissionID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsignbulksendtransmission&#39;s forms data
     * 
     * @param pkiEzsignbulksendtransmissionID 
     * @return EzsignbulksendtransmissionMinusGetFormsDataMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignbulksendtransmissionGetFormsDataV1(pkiEzsignbulksendtransmissionID: kotlin.Int) : EzsignbulksendtransmissionMinusGetFormsDataMinusV1MinusResponse {
        val localVarResponse = ezsignbulksendtransmissionGetFormsDataV1WithHttpInfo(pkiEzsignbulksendtransmissionID = pkiEzsignbulksendtransmissionID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignbulksendtransmissionMinusGetFormsDataMinusV1MinusResponse
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
     * Retrieve an existing Ezsignbulksendtransmission&#39;s forms data
     * 
     * @param pkiEzsignbulksendtransmissionID 
     * @return ApiResponse<EzsignbulksendtransmissionMinusGetFormsDataMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignbulksendtransmissionGetFormsDataV1WithHttpInfo(pkiEzsignbulksendtransmissionID: kotlin.Int) : ApiResponse<EzsignbulksendtransmissionMinusGetFormsDataMinusV1MinusResponse?> {
        val localVariableConfig = ezsignbulksendtransmissionGetFormsDataV1RequestConfig(pkiEzsignbulksendtransmissionID = pkiEzsignbulksendtransmissionID)

        return request<Unit, EzsignbulksendtransmissionMinusGetFormsDataMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignbulksendtransmissionGetFormsDataV1
     *
     * @param pkiEzsignbulksendtransmissionID 
     * @return RequestConfig
     */
    fun ezsignbulksendtransmissionGetFormsDataV1RequestConfig(pkiEzsignbulksendtransmissionID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getFormsData".replace("{"+"pkiEzsignbulksendtransmissionID"+"}", "$pkiEzsignbulksendtransmissionID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsignbulksendtransmission
     * 
     * @param pkiEzsignbulksendtransmissionID 
     * @return EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignbulksendtransmissionGetObjectV1(pkiEzsignbulksendtransmissionID: kotlin.Int) : EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponse {
        val localVarResponse = ezsignbulksendtransmissionGetObjectV1WithHttpInfo(pkiEzsignbulksendtransmissionID = pkiEzsignbulksendtransmissionID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponse
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
     * Retrieve an existing Ezsignbulksendtransmission
     * 
     * @param pkiEzsignbulksendtransmissionID 
     * @return ApiResponse<EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignbulksendtransmissionGetObjectV1WithHttpInfo(pkiEzsignbulksendtransmissionID: kotlin.Int) : ApiResponse<EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsignbulksendtransmissionGetObjectV1RequestConfig(pkiEzsignbulksendtransmissionID = pkiEzsignbulksendtransmissionID)

        return request<Unit, EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignbulksendtransmissionGetObjectV1
     *
     * @param pkiEzsignbulksendtransmissionID 
     * @return RequestConfig
     */
    fun ezsignbulksendtransmissionGetObjectV1RequestConfig(pkiEzsignbulksendtransmissionID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}".replace("{"+"pkiEzsignbulksendtransmissionID"+"}", "$pkiEzsignbulksendtransmissionID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
