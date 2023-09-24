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
import eZmaxApi.models.SignatureCreateObjectV1Request
import eZmaxApi.models.SignatureCreateObjectV1Response
import eZmaxApi.models.SignatureDeleteObjectV1Response
import eZmaxApi.models.SignatureEditObjectV1Request
import eZmaxApi.models.SignatureEditObjectV1Response
import eZmaxApi.models.SignatureGetObjectV2Response

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

class ObjectSignatureApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Signature
     * The endpoint allows to create one or many elements at once.
     * @param signatureCreateObjectV1Request 
     * @return SignatureCreateObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun signatureCreateObjectV1(signatureCreateObjectV1Request: SignatureCreateObjectV1Request) : SignatureCreateObjectV1Response {
        val localVarResponse = signatureCreateObjectV1WithHttpInfo(signatureCreateObjectV1Request = signatureCreateObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SignatureCreateObjectV1Response
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
     * Create a new Signature
     * The endpoint allows to create one or many elements at once.
     * @param signatureCreateObjectV1Request 
     * @return ApiResponse<SignatureCreateObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun signatureCreateObjectV1WithHttpInfo(signatureCreateObjectV1Request: SignatureCreateObjectV1Request) : ApiResponse<SignatureCreateObjectV1Response?> {
        val localVariableConfig = signatureCreateObjectV1RequestConfig(signatureCreateObjectV1Request = signatureCreateObjectV1Request)

        return request<SignatureCreateObjectV1Request, SignatureCreateObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation signatureCreateObjectV1
     *
     * @param signatureCreateObjectV1Request 
     * @return RequestConfig
     */
    fun signatureCreateObjectV1RequestConfig(signatureCreateObjectV1Request: SignatureCreateObjectV1Request) : RequestConfig<SignatureCreateObjectV1Request> {
        val localVariableBody = signatureCreateObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/signature",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete an existing Signature
     * 
     * @param pkiSignatureID The unique ID of the Signature
     * @return SignatureDeleteObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun signatureDeleteObjectV1(pkiSignatureID: kotlin.Int) : SignatureDeleteObjectV1Response {
        val localVarResponse = signatureDeleteObjectV1WithHttpInfo(pkiSignatureID = pkiSignatureID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SignatureDeleteObjectV1Response
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
     * Delete an existing Signature
     * 
     * @param pkiSignatureID The unique ID of the Signature
     * @return ApiResponse<SignatureDeleteObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun signatureDeleteObjectV1WithHttpInfo(pkiSignatureID: kotlin.Int) : ApiResponse<SignatureDeleteObjectV1Response?> {
        val localVariableConfig = signatureDeleteObjectV1RequestConfig(pkiSignatureID = pkiSignatureID)

        return request<Unit, SignatureDeleteObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation signatureDeleteObjectV1
     *
     * @param pkiSignatureID The unique ID of the Signature
     * @return RequestConfig
     */
    fun signatureDeleteObjectV1RequestConfig(pkiSignatureID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/signature/{pkiSignatureID}".replace("{"+"pkiSignatureID"+"}", encodeURIComponent(pkiSignatureID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Edit an existing Signature
     * 
     * @param pkiSignatureID The unique ID of the Signature
     * @param signatureEditObjectV1Request 
     * @return SignatureEditObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun signatureEditObjectV1(pkiSignatureID: kotlin.Int, signatureEditObjectV1Request: SignatureEditObjectV1Request) : SignatureEditObjectV1Response {
        val localVarResponse = signatureEditObjectV1WithHttpInfo(pkiSignatureID = pkiSignatureID, signatureEditObjectV1Request = signatureEditObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SignatureEditObjectV1Response
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
     * Edit an existing Signature
     * 
     * @param pkiSignatureID The unique ID of the Signature
     * @param signatureEditObjectV1Request 
     * @return ApiResponse<SignatureEditObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun signatureEditObjectV1WithHttpInfo(pkiSignatureID: kotlin.Int, signatureEditObjectV1Request: SignatureEditObjectV1Request) : ApiResponse<SignatureEditObjectV1Response?> {
        val localVariableConfig = signatureEditObjectV1RequestConfig(pkiSignatureID = pkiSignatureID, signatureEditObjectV1Request = signatureEditObjectV1Request)

        return request<SignatureEditObjectV1Request, SignatureEditObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation signatureEditObjectV1
     *
     * @param pkiSignatureID The unique ID of the Signature
     * @param signatureEditObjectV1Request 
     * @return RequestConfig
     */
    fun signatureEditObjectV1RequestConfig(pkiSignatureID: kotlin.Int, signatureEditObjectV1Request: SignatureEditObjectV1Request) : RequestConfig<SignatureEditObjectV1Request> {
        val localVariableBody = signatureEditObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/signature/{pkiSignatureID}".replace("{"+"pkiSignatureID"+"}", encodeURIComponent(pkiSignatureID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Signature
     * 
     * @param pkiSignatureID The unique ID of the Signature
     * @return SignatureGetObjectV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun signatureGetObjectV2(pkiSignatureID: kotlin.Int) : SignatureGetObjectV2Response {
        val localVarResponse = signatureGetObjectV2WithHttpInfo(pkiSignatureID = pkiSignatureID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as SignatureGetObjectV2Response
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
     * Retrieve an existing Signature
     * 
     * @param pkiSignatureID The unique ID of the Signature
     * @return ApiResponse<SignatureGetObjectV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun signatureGetObjectV2WithHttpInfo(pkiSignatureID: kotlin.Int) : ApiResponse<SignatureGetObjectV2Response?> {
        val localVariableConfig = signatureGetObjectV2RequestConfig(pkiSignatureID = pkiSignatureID)

        return request<Unit, SignatureGetObjectV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation signatureGetObjectV2
     *
     * @param pkiSignatureID The unique ID of the Signature
     * @return RequestConfig
     */
    fun signatureGetObjectV2RequestConfig(pkiSignatureID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/signature/{pkiSignatureID}".replace("{"+"pkiSignatureID"+"}", encodeURIComponent(pkiSignatureID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
