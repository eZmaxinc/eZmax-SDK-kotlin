/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.14
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
import eZmaxApi.models.EzsignsignatureMinusCreateObjectMinusV1MinusRequest
import eZmaxApi.models.EzsignsignatureMinusCreateObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignsignatureMinusCreateObjectMinusV2MinusRequest
import eZmaxApi.models.EzsignsignatureMinusCreateObjectMinusV2MinusResponse
import eZmaxApi.models.EzsignsignatureMinusDeleteObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignsignatureMinusEditObjectMinusV1MinusRequest
import eZmaxApi.models.EzsignsignatureMinusEditObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignsignatureMinusGetObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignsignatureMinusGetObjectMinusV2MinusResponse
import eZmaxApi.models.EzsignsignatureMinusSignMinusV1MinusRequest
import eZmaxApi.models.EzsignsignatureMinusSignMinusV1MinusResponse

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

class ObjectEzsignsignatureApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Ezsignsignature
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     * @param ezsignsignatureMinusCreateObjectMinusV1MinusRequest 
     * @return EzsignsignatureMinusCreateObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun ezsignsignatureCreateObjectV1(ezsignsignatureMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<EzsignsignatureMinusCreateObjectMinusV1MinusRequest>) : EzsignsignatureMinusCreateObjectMinusV1MinusResponse {
        @Suppress("DEPRECATION")
        val localVarResponse = ezsignsignatureCreateObjectV1WithHttpInfo(ezsignsignatureMinusCreateObjectMinusV1MinusRequest = ezsignsignatureMinusCreateObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignsignatureMinusCreateObjectMinusV1MinusResponse
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
     * Create a new Ezsignsignature
     * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
     * @param ezsignsignatureMinusCreateObjectMinusV1MinusRequest 
     * @return ApiResponse<EzsignsignatureMinusCreateObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun ezsignsignatureCreateObjectV1WithHttpInfo(ezsignsignatureMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<EzsignsignatureMinusCreateObjectMinusV1MinusRequest>) : ApiResponse<EzsignsignatureMinusCreateObjectMinusV1MinusResponse?> {
        @Suppress("DEPRECATION")
        val localVariableConfig = ezsignsignatureCreateObjectV1RequestConfig(ezsignsignatureMinusCreateObjectMinusV1MinusRequest = ezsignsignatureMinusCreateObjectMinusV1MinusRequest)

        return request<kotlin.collections.List<EzsignsignatureMinusCreateObjectMinusV1MinusRequest>, EzsignsignatureMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignsignatureCreateObjectV1
     *
     * @param ezsignsignatureMinusCreateObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    @Deprecated(message = "This operation is deprecated.")
    fun ezsignsignatureCreateObjectV1RequestConfig(ezsignsignatureMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<EzsignsignatureMinusCreateObjectMinusV1MinusRequest>) : RequestConfig<kotlin.collections.List<EzsignsignatureMinusCreateObjectMinusV1MinusRequest>> {
        val localVariableBody = ezsignsignatureMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsignsignature",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Create a new Ezsignsignature
     * The endpoint allows to create one or many elements at once.
     * @param ezsignsignatureMinusCreateObjectMinusV2MinusRequest 
     * @return EzsignsignatureMinusCreateObjectMinusV2MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignsignatureCreateObjectV2(ezsignsignatureMinusCreateObjectMinusV2MinusRequest: EzsignsignatureMinusCreateObjectMinusV2MinusRequest) : EzsignsignatureMinusCreateObjectMinusV2MinusResponse {
        val localVarResponse = ezsignsignatureCreateObjectV2WithHttpInfo(ezsignsignatureMinusCreateObjectMinusV2MinusRequest = ezsignsignatureMinusCreateObjectMinusV2MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignsignatureMinusCreateObjectMinusV2MinusResponse
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
     * Create a new Ezsignsignature
     * The endpoint allows to create one or many elements at once.
     * @param ezsignsignatureMinusCreateObjectMinusV2MinusRequest 
     * @return ApiResponse<EzsignsignatureMinusCreateObjectMinusV2MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignsignatureCreateObjectV2WithHttpInfo(ezsignsignatureMinusCreateObjectMinusV2MinusRequest: EzsignsignatureMinusCreateObjectMinusV2MinusRequest) : ApiResponse<EzsignsignatureMinusCreateObjectMinusV2MinusResponse?> {
        val localVariableConfig = ezsignsignatureCreateObjectV2RequestConfig(ezsignsignatureMinusCreateObjectMinusV2MinusRequest = ezsignsignatureMinusCreateObjectMinusV2MinusRequest)

        return request<EzsignsignatureMinusCreateObjectMinusV2MinusRequest, EzsignsignatureMinusCreateObjectMinusV2MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignsignatureCreateObjectV2
     *
     * @param ezsignsignatureMinusCreateObjectMinusV2MinusRequest 
     * @return RequestConfig
     */
    fun ezsignsignatureCreateObjectV2RequestConfig(ezsignsignatureMinusCreateObjectMinusV2MinusRequest: EzsignsignatureMinusCreateObjectMinusV2MinusRequest) : RequestConfig<EzsignsignatureMinusCreateObjectMinusV2MinusRequest> {
        val localVariableBody = ezsignsignatureMinusCreateObjectMinusV2MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/2/object/ezsignsignature",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Delete an existing Ezsignsignature
     * 
     * @param pkiEzsignsignatureID 
     * @return EzsignsignatureMinusDeleteObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignsignatureDeleteObjectV1(pkiEzsignsignatureID: kotlin.Int) : EzsignsignatureMinusDeleteObjectMinusV1MinusResponse {
        val localVarResponse = ezsignsignatureDeleteObjectV1WithHttpInfo(pkiEzsignsignatureID = pkiEzsignsignatureID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignsignatureMinusDeleteObjectMinusV1MinusResponse
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
     * Delete an existing Ezsignsignature
     * 
     * @param pkiEzsignsignatureID 
     * @return ApiResponse<EzsignsignatureMinusDeleteObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignsignatureDeleteObjectV1WithHttpInfo(pkiEzsignsignatureID: kotlin.Int) : ApiResponse<EzsignsignatureMinusDeleteObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsignsignatureDeleteObjectV1RequestConfig(pkiEzsignsignatureID = pkiEzsignsignatureID)

        return request<Unit, EzsignsignatureMinusDeleteObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignsignatureDeleteObjectV1
     *
     * @param pkiEzsignsignatureID 
     * @return RequestConfig
     */
    fun ezsignsignatureDeleteObjectV1RequestConfig(pkiEzsignsignatureID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/ezsignsignature/{pkiEzsignsignatureID}".replace("{"+"pkiEzsignsignatureID"+"}", pkiEzsignsignatureID.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Edit an existing Ezsignsignature
     * 
     * @param pkiEzsignsignatureID 
     * @param ezsignsignatureMinusEditObjectMinusV1MinusRequest 
     * @return EzsignsignatureMinusEditObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignsignatureEditObjectV1(pkiEzsignsignatureID: kotlin.Int, ezsignsignatureMinusEditObjectMinusV1MinusRequest: EzsignsignatureMinusEditObjectMinusV1MinusRequest) : EzsignsignatureMinusEditObjectMinusV1MinusResponse {
        val localVarResponse = ezsignsignatureEditObjectV1WithHttpInfo(pkiEzsignsignatureID = pkiEzsignsignatureID, ezsignsignatureMinusEditObjectMinusV1MinusRequest = ezsignsignatureMinusEditObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignsignatureMinusEditObjectMinusV1MinusResponse
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
     * Edit an existing Ezsignsignature
     * 
     * @param pkiEzsignsignatureID 
     * @param ezsignsignatureMinusEditObjectMinusV1MinusRequest 
     * @return ApiResponse<EzsignsignatureMinusEditObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignsignatureEditObjectV1WithHttpInfo(pkiEzsignsignatureID: kotlin.Int, ezsignsignatureMinusEditObjectMinusV1MinusRequest: EzsignsignatureMinusEditObjectMinusV1MinusRequest) : ApiResponse<EzsignsignatureMinusEditObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsignsignatureEditObjectV1RequestConfig(pkiEzsignsignatureID = pkiEzsignsignatureID, ezsignsignatureMinusEditObjectMinusV1MinusRequest = ezsignsignatureMinusEditObjectMinusV1MinusRequest)

        return request<EzsignsignatureMinusEditObjectMinusV1MinusRequest, EzsignsignatureMinusEditObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignsignatureEditObjectV1
     *
     * @param pkiEzsignsignatureID 
     * @param ezsignsignatureMinusEditObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun ezsignsignatureEditObjectV1RequestConfig(pkiEzsignsignatureID: kotlin.Int, ezsignsignatureMinusEditObjectMinusV1MinusRequest: EzsignsignatureMinusEditObjectMinusV1MinusRequest) : RequestConfig<EzsignsignatureMinusEditObjectMinusV1MinusRequest> {
        val localVariableBody = ezsignsignatureMinusEditObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/ezsignsignature/{pkiEzsignsignatureID}".replace("{"+"pkiEzsignsignatureID"+"}", pkiEzsignsignatureID.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsignsignature
     * 
     * @param pkiEzsignsignatureID 
     * @return EzsignsignatureMinusGetObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun ezsignsignatureGetObjectV1(pkiEzsignsignatureID: kotlin.Int) : EzsignsignatureMinusGetObjectMinusV1MinusResponse {
        @Suppress("DEPRECATION")
        val localVarResponse = ezsignsignatureGetObjectV1WithHttpInfo(pkiEzsignsignatureID = pkiEzsignsignatureID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignsignatureMinusGetObjectMinusV1MinusResponse
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
     * Retrieve an existing Ezsignsignature
     * 
     * @param pkiEzsignsignatureID 
     * @return ApiResponse<EzsignsignatureMinusGetObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun ezsignsignatureGetObjectV1WithHttpInfo(pkiEzsignsignatureID: kotlin.Int) : ApiResponse<EzsignsignatureMinusGetObjectMinusV1MinusResponse?> {
        @Suppress("DEPRECATION")
        val localVariableConfig = ezsignsignatureGetObjectV1RequestConfig(pkiEzsignsignatureID = pkiEzsignsignatureID)

        return request<Unit, EzsignsignatureMinusGetObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignsignatureGetObjectV1
     *
     * @param pkiEzsignsignatureID 
     * @return RequestConfig
     */
    @Deprecated(message = "This operation is deprecated.")
    fun ezsignsignatureGetObjectV1RequestConfig(pkiEzsignsignatureID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignsignature/{pkiEzsignsignatureID}".replace("{"+"pkiEzsignsignatureID"+"}", pkiEzsignsignatureID.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsignsignature
     * 
     * @param pkiEzsignsignatureID 
     * @return EzsignsignatureMinusGetObjectMinusV2MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignsignatureGetObjectV2(pkiEzsignsignatureID: kotlin.Int) : EzsignsignatureMinusGetObjectMinusV2MinusResponse {
        val localVarResponse = ezsignsignatureGetObjectV2WithHttpInfo(pkiEzsignsignatureID = pkiEzsignsignatureID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignsignatureMinusGetObjectMinusV2MinusResponse
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
     * Retrieve an existing Ezsignsignature
     * 
     * @param pkiEzsignsignatureID 
     * @return ApiResponse<EzsignsignatureMinusGetObjectMinusV2MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignsignatureGetObjectV2WithHttpInfo(pkiEzsignsignatureID: kotlin.Int) : ApiResponse<EzsignsignatureMinusGetObjectMinusV2MinusResponse?> {
        val localVariableConfig = ezsignsignatureGetObjectV2RequestConfig(pkiEzsignsignatureID = pkiEzsignsignatureID)

        return request<Unit, EzsignsignatureMinusGetObjectMinusV2MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignsignatureGetObjectV2
     *
     * @param pkiEzsignsignatureID 
     * @return RequestConfig
     */
    fun ezsignsignatureGetObjectV2RequestConfig(pkiEzsignsignatureID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/ezsignsignature/{pkiEzsignsignatureID}".replace("{"+"pkiEzsignsignatureID"+"}", pkiEzsignsignatureID.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Sign the Ezsignsignature
     * 
     * @param pkiEzsignsignatureID 
     * @param ezsignsignatureMinusSignMinusV1MinusRequest 
     * @return EzsignsignatureMinusSignMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignsignatureSignV1(pkiEzsignsignatureID: kotlin.Int, ezsignsignatureMinusSignMinusV1MinusRequest: EzsignsignatureMinusSignMinusV1MinusRequest) : EzsignsignatureMinusSignMinusV1MinusResponse {
        val localVarResponse = ezsignsignatureSignV1WithHttpInfo(pkiEzsignsignatureID = pkiEzsignsignatureID, ezsignsignatureMinusSignMinusV1MinusRequest = ezsignsignatureMinusSignMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignsignatureMinusSignMinusV1MinusResponse
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
     * Sign the Ezsignsignature
     * 
     * @param pkiEzsignsignatureID 
     * @param ezsignsignatureMinusSignMinusV1MinusRequest 
     * @return ApiResponse<EzsignsignatureMinusSignMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignsignatureSignV1WithHttpInfo(pkiEzsignsignatureID: kotlin.Int, ezsignsignatureMinusSignMinusV1MinusRequest: EzsignsignatureMinusSignMinusV1MinusRequest) : ApiResponse<EzsignsignatureMinusSignMinusV1MinusResponse?> {
        val localVariableConfig = ezsignsignatureSignV1RequestConfig(pkiEzsignsignatureID = pkiEzsignsignatureID, ezsignsignatureMinusSignMinusV1MinusRequest = ezsignsignatureMinusSignMinusV1MinusRequest)

        return request<EzsignsignatureMinusSignMinusV1MinusRequest, EzsignsignatureMinusSignMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignsignatureSignV1
     *
     * @param pkiEzsignsignatureID 
     * @param ezsignsignatureMinusSignMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun ezsignsignatureSignV1RequestConfig(pkiEzsignsignatureID: kotlin.Int, ezsignsignatureMinusSignMinusV1MinusRequest: EzsignsignatureMinusSignMinusV1MinusRequest) : RequestConfig<EzsignsignatureMinusSignMinusV1MinusRequest> {
        val localVariableBody = ezsignsignatureMinusSignMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsignsignature/{pkiEzsignsignatureID}/sign".replace("{"+"pkiEzsignsignatureID"+"}", pkiEzsignsignatureID.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
