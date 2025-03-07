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
import eZmaxApi.models.EzmaxcasePatchObjectV1Request
import eZmaxApi.models.EzmaxcasePatchObjectV1Response

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

class ObjectEzmaxcaseApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * PATCH /1/object/ezmaxcase/{pkiEzmaxcaseID}
     * Patch an existing Ezmaxcase
     * 
     * @param pkiEzmaxcaseID The unique ID of the Ezmaxcase
     * @param ezmaxcasePatchObjectV1Request 
     * @return EzmaxcasePatchObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezmaxcasePatchObjectV1(pkiEzmaxcaseID: kotlin.Int, ezmaxcasePatchObjectV1Request: EzmaxcasePatchObjectV1Request) : EzmaxcasePatchObjectV1Response {
        val localVarResponse = ezmaxcasePatchObjectV1WithHttpInfo(pkiEzmaxcaseID = pkiEzmaxcaseID, ezmaxcasePatchObjectV1Request = ezmaxcasePatchObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzmaxcasePatchObjectV1Response
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
     * PATCH /1/object/ezmaxcase/{pkiEzmaxcaseID}
     * Patch an existing Ezmaxcase
     * 
     * @param pkiEzmaxcaseID The unique ID of the Ezmaxcase
     * @param ezmaxcasePatchObjectV1Request 
     * @return ApiResponse<EzmaxcasePatchObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezmaxcasePatchObjectV1WithHttpInfo(pkiEzmaxcaseID: kotlin.Int, ezmaxcasePatchObjectV1Request: EzmaxcasePatchObjectV1Request) : ApiResponse<EzmaxcasePatchObjectV1Response?> {
        val localVariableConfig = ezmaxcasePatchObjectV1RequestConfig(pkiEzmaxcaseID = pkiEzmaxcaseID, ezmaxcasePatchObjectV1Request = ezmaxcasePatchObjectV1Request)

        return request<EzmaxcasePatchObjectV1Request, EzmaxcasePatchObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezmaxcasePatchObjectV1
     *
     * @param pkiEzmaxcaseID The unique ID of the Ezmaxcase
     * @param ezmaxcasePatchObjectV1Request 
     * @return RequestConfig
     */
    fun ezmaxcasePatchObjectV1RequestConfig(pkiEzmaxcaseID: kotlin.Int, ezmaxcasePatchObjectV1Request: EzmaxcasePatchObjectV1Request) : RequestConfig<EzmaxcasePatchObjectV1Request> {
        val localVariableBody = ezmaxcasePatchObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PATCH,
            path = "/1/object/ezmaxcase/{pkiEzmaxcaseID}".replace("{"+"pkiEzmaxcaseID"+"}", encodeURIComponent(pkiEzmaxcaseID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
