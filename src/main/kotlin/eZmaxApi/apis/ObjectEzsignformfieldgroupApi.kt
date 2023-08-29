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
import eZmaxApi.models.EzsignformfieldgroupCreateObjectV1Request
import eZmaxApi.models.EzsignformfieldgroupCreateObjectV1Response
import eZmaxApi.models.EzsignformfieldgroupDeleteObjectV1Response
import eZmaxApi.models.EzsignformfieldgroupEditObjectV1Request
import eZmaxApi.models.EzsignformfieldgroupEditObjectV1Response
import eZmaxApi.models.EzsignformfieldgroupGetObjectV2Response

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
     * @param ezsignformfieldgroupCreateObjectV1Request 
     * @return EzsignformfieldgroupCreateObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignformfieldgroupCreateObjectV1(ezsignformfieldgroupCreateObjectV1Request: EzsignformfieldgroupCreateObjectV1Request) : EzsignformfieldgroupCreateObjectV1Response {
        val localVarResponse = ezsignformfieldgroupCreateObjectV1WithHttpInfo(ezsignformfieldgroupCreateObjectV1Request = ezsignformfieldgroupCreateObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignformfieldgroupCreateObjectV1Response
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
     * @param ezsignformfieldgroupCreateObjectV1Request 
     * @return ApiResponse<EzsignformfieldgroupCreateObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignformfieldgroupCreateObjectV1WithHttpInfo(ezsignformfieldgroupCreateObjectV1Request: EzsignformfieldgroupCreateObjectV1Request) : ApiResponse<EzsignformfieldgroupCreateObjectV1Response?> {
        val localVariableConfig = ezsignformfieldgroupCreateObjectV1RequestConfig(ezsignformfieldgroupCreateObjectV1Request = ezsignformfieldgroupCreateObjectV1Request)

        return request<EzsignformfieldgroupCreateObjectV1Request, EzsignformfieldgroupCreateObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignformfieldgroupCreateObjectV1
     *
     * @param ezsignformfieldgroupCreateObjectV1Request 
     * @return RequestConfig
     */
    fun ezsignformfieldgroupCreateObjectV1RequestConfig(ezsignformfieldgroupCreateObjectV1Request: EzsignformfieldgroupCreateObjectV1Request) : RequestConfig<EzsignformfieldgroupCreateObjectV1Request> {
        val localVariableBody = ezsignformfieldgroupCreateObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsignformfieldgroup",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete an existing Ezsignformfieldgroup
     * 
     * @param pkiEzsignformfieldgroupID 
     * @return EzsignformfieldgroupDeleteObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignformfieldgroupDeleteObjectV1(pkiEzsignformfieldgroupID: kotlin.Int) : EzsignformfieldgroupDeleteObjectV1Response {
        val localVarResponse = ezsignformfieldgroupDeleteObjectV1WithHttpInfo(pkiEzsignformfieldgroupID = pkiEzsignformfieldgroupID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignformfieldgroupDeleteObjectV1Response
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
     * @return ApiResponse<EzsignformfieldgroupDeleteObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignformfieldgroupDeleteObjectV1WithHttpInfo(pkiEzsignformfieldgroupID: kotlin.Int) : ApiResponse<EzsignformfieldgroupDeleteObjectV1Response?> {
        val localVariableConfig = ezsignformfieldgroupDeleteObjectV1RequestConfig(pkiEzsignformfieldgroupID = pkiEzsignformfieldgroupID)

        return request<Unit, EzsignformfieldgroupDeleteObjectV1Response>(
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
            path = "/1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID}".replace("{"+"pkiEzsignformfieldgroupID"+"}", encodeURIComponent(pkiEzsignformfieldgroupID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Edit an existing Ezsignformfieldgroup
     * 
     * @param pkiEzsignformfieldgroupID 
     * @param ezsignformfieldgroupEditObjectV1Request 
     * @return EzsignformfieldgroupEditObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignformfieldgroupEditObjectV1(pkiEzsignformfieldgroupID: kotlin.Int, ezsignformfieldgroupEditObjectV1Request: EzsignformfieldgroupEditObjectV1Request) : EzsignformfieldgroupEditObjectV1Response {
        val localVarResponse = ezsignformfieldgroupEditObjectV1WithHttpInfo(pkiEzsignformfieldgroupID = pkiEzsignformfieldgroupID, ezsignformfieldgroupEditObjectV1Request = ezsignformfieldgroupEditObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignformfieldgroupEditObjectV1Response
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
     * @param ezsignformfieldgroupEditObjectV1Request 
     * @return ApiResponse<EzsignformfieldgroupEditObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignformfieldgroupEditObjectV1WithHttpInfo(pkiEzsignformfieldgroupID: kotlin.Int, ezsignformfieldgroupEditObjectV1Request: EzsignformfieldgroupEditObjectV1Request) : ApiResponse<EzsignformfieldgroupEditObjectV1Response?> {
        val localVariableConfig = ezsignformfieldgroupEditObjectV1RequestConfig(pkiEzsignformfieldgroupID = pkiEzsignformfieldgroupID, ezsignformfieldgroupEditObjectV1Request = ezsignformfieldgroupEditObjectV1Request)

        return request<EzsignformfieldgroupEditObjectV1Request, EzsignformfieldgroupEditObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignformfieldgroupEditObjectV1
     *
     * @param pkiEzsignformfieldgroupID 
     * @param ezsignformfieldgroupEditObjectV1Request 
     * @return RequestConfig
     */
    fun ezsignformfieldgroupEditObjectV1RequestConfig(pkiEzsignformfieldgroupID: kotlin.Int, ezsignformfieldgroupEditObjectV1Request: EzsignformfieldgroupEditObjectV1Request) : RequestConfig<EzsignformfieldgroupEditObjectV1Request> {
        val localVariableBody = ezsignformfieldgroupEditObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID}".replace("{"+"pkiEzsignformfieldgroupID"+"}", encodeURIComponent(pkiEzsignformfieldgroupID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsignformfieldgroup
     * 
     * @param pkiEzsignformfieldgroupID 
     * @return EzsignformfieldgroupGetObjectV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignformfieldgroupGetObjectV2(pkiEzsignformfieldgroupID: kotlin.Int) : EzsignformfieldgroupGetObjectV2Response {
        val localVarResponse = ezsignformfieldgroupGetObjectV2WithHttpInfo(pkiEzsignformfieldgroupID = pkiEzsignformfieldgroupID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignformfieldgroupGetObjectV2Response
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
     * @return ApiResponse<EzsignformfieldgroupGetObjectV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignformfieldgroupGetObjectV2WithHttpInfo(pkiEzsignformfieldgroupID: kotlin.Int) : ApiResponse<EzsignformfieldgroupGetObjectV2Response?> {
        val localVariableConfig = ezsignformfieldgroupGetObjectV2RequestConfig(pkiEzsignformfieldgroupID = pkiEzsignformfieldgroupID)

        return request<Unit, EzsignformfieldgroupGetObjectV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignformfieldgroupGetObjectV2
     *
     * @param pkiEzsignformfieldgroupID 
     * @return RequestConfig
     */
    fun ezsignformfieldgroupGetObjectV2RequestConfig(pkiEzsignformfieldgroupID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID}".replace("{"+"pkiEzsignformfieldgroupID"+"}", encodeURIComponent(pkiEzsignformfieldgroupID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
