/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.9
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
import eZmaxApi.models.EzsignformfieldgroupMinusCreateObjectMinusV1MinusRequest
import eZmaxApi.models.EzsignformfieldgroupMinusCreateObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignformfieldgroupMinusDeleteObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignformfieldgroupMinusEditObjectMinusV1MinusRequest
import eZmaxApi.models.EzsignformfieldgroupMinusEditObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignformfieldgroupMinusGetObjectMinusV1MinusResponse

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

class ObjectEzsignformfieldgroupApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Ezsignformfieldgroup
     * The endpoint allows to create one or many elements at once.
     * @param ezsignformfieldgroupMinusCreateObjectMinusV1MinusRequest 
     * @return EzsignformfieldgroupMinusCreateObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignformfieldgroupCreateObjectV1(ezsignformfieldgroupMinusCreateObjectMinusV1MinusRequest: EzsignformfieldgroupMinusCreateObjectMinusV1MinusRequest) : EzsignformfieldgroupMinusCreateObjectMinusV1MinusResponse {
        val localVarResponse = ezsignformfieldgroupCreateObjectV1WithHttpInfo(ezsignformfieldgroupMinusCreateObjectMinusV1MinusRequest = ezsignformfieldgroupMinusCreateObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignformfieldgroupMinusCreateObjectMinusV1MinusResponse
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
     * Create a new Ezsignformfieldgroup
     * The endpoint allows to create one or many elements at once.
     * @param ezsignformfieldgroupMinusCreateObjectMinusV1MinusRequest 
     * @return ApiResponse<EzsignformfieldgroupMinusCreateObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignformfieldgroupCreateObjectV1WithHttpInfo(ezsignformfieldgroupMinusCreateObjectMinusV1MinusRequest: EzsignformfieldgroupMinusCreateObjectMinusV1MinusRequest) : ApiResponse<EzsignformfieldgroupMinusCreateObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsignformfieldgroupCreateObjectV1RequestConfig(ezsignformfieldgroupMinusCreateObjectMinusV1MinusRequest = ezsignformfieldgroupMinusCreateObjectMinusV1MinusRequest)

        return request<EzsignformfieldgroupMinusCreateObjectMinusV1MinusRequest, EzsignformfieldgroupMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignformfieldgroupCreateObjectV1
     *
     * @param ezsignformfieldgroupMinusCreateObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun ezsignformfieldgroupCreateObjectV1RequestConfig(ezsignformfieldgroupMinusCreateObjectMinusV1MinusRequest: EzsignformfieldgroupMinusCreateObjectMinusV1MinusRequest) : RequestConfig<EzsignformfieldgroupMinusCreateObjectMinusV1MinusRequest> {
        val localVariableBody = ezsignformfieldgroupMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsignformfieldgroup",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Delete an existing Ezsignformfieldgroup
     * 
     * @param pkiEzsignformfieldgroupID 
     * @return EzsignformfieldgroupMinusDeleteObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignformfieldgroupDeleteObjectV1(pkiEzsignformfieldgroupID: kotlin.Int) : EzsignformfieldgroupMinusDeleteObjectMinusV1MinusResponse {
        val localVarResponse = ezsignformfieldgroupDeleteObjectV1WithHttpInfo(pkiEzsignformfieldgroupID = pkiEzsignformfieldgroupID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignformfieldgroupMinusDeleteObjectMinusV1MinusResponse
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
     * Delete an existing Ezsignformfieldgroup
     * 
     * @param pkiEzsignformfieldgroupID 
     * @return ApiResponse<EzsignformfieldgroupMinusDeleteObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignformfieldgroupDeleteObjectV1WithHttpInfo(pkiEzsignformfieldgroupID: kotlin.Int) : ApiResponse<EzsignformfieldgroupMinusDeleteObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsignformfieldgroupDeleteObjectV1RequestConfig(pkiEzsignformfieldgroupID = pkiEzsignformfieldgroupID)

        return request<Unit, EzsignformfieldgroupMinusDeleteObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignformfieldgroupDeleteObjectV1
     *
     * @param pkiEzsignformfieldgroupID 
     * @return RequestConfig
     */
    fun ezsignformfieldgroupDeleteObjectV1RequestConfig(pkiEzsignformfieldgroupID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID}".replace("{"+"pkiEzsignformfieldgroupID"+"}", "$pkiEzsignformfieldgroupID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Edit an existing Ezsignformfieldgroup
     * 
     * @param pkiEzsignformfieldgroupID 
     * @param ezsignformfieldgroupMinusEditObjectMinusV1MinusRequest 
     * @return EzsignformfieldgroupMinusEditObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignformfieldgroupEditObjectV1(pkiEzsignformfieldgroupID: kotlin.Int, ezsignformfieldgroupMinusEditObjectMinusV1MinusRequest: EzsignformfieldgroupMinusEditObjectMinusV1MinusRequest) : EzsignformfieldgroupMinusEditObjectMinusV1MinusResponse {
        val localVarResponse = ezsignformfieldgroupEditObjectV1WithHttpInfo(pkiEzsignformfieldgroupID = pkiEzsignformfieldgroupID, ezsignformfieldgroupMinusEditObjectMinusV1MinusRequest = ezsignformfieldgroupMinusEditObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignformfieldgroupMinusEditObjectMinusV1MinusResponse
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
     * Edit an existing Ezsignformfieldgroup
     * 
     * @param pkiEzsignformfieldgroupID 
     * @param ezsignformfieldgroupMinusEditObjectMinusV1MinusRequest 
     * @return ApiResponse<EzsignformfieldgroupMinusEditObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignformfieldgroupEditObjectV1WithHttpInfo(pkiEzsignformfieldgroupID: kotlin.Int, ezsignformfieldgroupMinusEditObjectMinusV1MinusRequest: EzsignformfieldgroupMinusEditObjectMinusV1MinusRequest) : ApiResponse<EzsignformfieldgroupMinusEditObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsignformfieldgroupEditObjectV1RequestConfig(pkiEzsignformfieldgroupID = pkiEzsignformfieldgroupID, ezsignformfieldgroupMinusEditObjectMinusV1MinusRequest = ezsignformfieldgroupMinusEditObjectMinusV1MinusRequest)

        return request<EzsignformfieldgroupMinusEditObjectMinusV1MinusRequest, EzsignformfieldgroupMinusEditObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignformfieldgroupEditObjectV1
     *
     * @param pkiEzsignformfieldgroupID 
     * @param ezsignformfieldgroupMinusEditObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun ezsignformfieldgroupEditObjectV1RequestConfig(pkiEzsignformfieldgroupID: kotlin.Int, ezsignformfieldgroupMinusEditObjectMinusV1MinusRequest: EzsignformfieldgroupMinusEditObjectMinusV1MinusRequest) : RequestConfig<EzsignformfieldgroupMinusEditObjectMinusV1MinusRequest> {
        val localVariableBody = ezsignformfieldgroupMinusEditObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID}".replace("{"+"pkiEzsignformfieldgroupID"+"}", "$pkiEzsignformfieldgroupID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsignformfieldgroup
     * 
     * @param pkiEzsignformfieldgroupID 
     * @return EzsignformfieldgroupMinusGetObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignformfieldgroupGetObjectV1(pkiEzsignformfieldgroupID: kotlin.Int) : EzsignformfieldgroupMinusGetObjectMinusV1MinusResponse {
        val localVarResponse = ezsignformfieldgroupGetObjectV1WithHttpInfo(pkiEzsignformfieldgroupID = pkiEzsignformfieldgroupID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignformfieldgroupMinusGetObjectMinusV1MinusResponse
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
     * Retrieve an existing Ezsignformfieldgroup
     * 
     * @param pkiEzsignformfieldgroupID 
     * @return ApiResponse<EzsignformfieldgroupMinusGetObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignformfieldgroupGetObjectV1WithHttpInfo(pkiEzsignformfieldgroupID: kotlin.Int) : ApiResponse<EzsignformfieldgroupMinusGetObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsignformfieldgroupGetObjectV1RequestConfig(pkiEzsignformfieldgroupID = pkiEzsignformfieldgroupID)

        return request<Unit, EzsignformfieldgroupMinusGetObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignformfieldgroupGetObjectV1
     *
     * @param pkiEzsignformfieldgroupID 
     * @return RequestConfig
     */
    fun ezsignformfieldgroupGetObjectV1RequestConfig(pkiEzsignformfieldgroupID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID}".replace("{"+"pkiEzsignformfieldgroupID"+"}", "$pkiEzsignformfieldgroupID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
