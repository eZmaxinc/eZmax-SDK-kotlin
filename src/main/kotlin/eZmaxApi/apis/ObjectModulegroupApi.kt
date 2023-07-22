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

import eZmaxApi.models.ModulegroupMinusGetAllMinusV1MinusResponse

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

class ObjectModulegroupApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * enum for parameter eContext
     */
     enum class EContext_modulegroupGetAllV1(val value: kotlin.String) {
         @Json(name = "Api") Api("Api"),
         @Json(name = "User") User("User")
     }

    /**
     * Retrieve all Modulegroups
     * 
     * @param eContext The context of the Modulegroup
     * @return ModulegroupMinusGetAllMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun modulegroupGetAllV1(eContext: EContext_modulegroupGetAllV1) : ModulegroupMinusGetAllMinusV1MinusResponse {
        val localVarResponse = modulegroupGetAllV1WithHttpInfo(eContext = eContext)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ModulegroupMinusGetAllMinusV1MinusResponse
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
     * Retrieve all Modulegroups
     * 
     * @param eContext The context of the Modulegroup
     * @return ApiResponse<ModulegroupMinusGetAllMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun modulegroupGetAllV1WithHttpInfo(eContext: EContext_modulegroupGetAllV1) : ApiResponse<ModulegroupMinusGetAllMinusV1MinusResponse?> {
        val localVariableConfig = modulegroupGetAllV1RequestConfig(eContext = eContext)

        return request<Unit, ModulegroupMinusGetAllMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation modulegroupGetAllV1
     *
     * @param eContext The context of the Modulegroup
     * @return RequestConfig
     */
    fun modulegroupGetAllV1RequestConfig(eContext: EContext_modulegroupGetAllV1) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/modulegroup/getAll/{eContext}".replace("{"+"eContext"+"}", encodeURIComponent(eContext.value.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
