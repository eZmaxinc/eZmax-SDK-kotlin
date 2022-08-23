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

import eZmaxApi.models.EzsignMinusSuggestSignersMinusV1MinusResponse
import eZmaxApi.models.EzsignMinusSuggestTemplatesMinusV1MinusResponse

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

class ModuleEzsignApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Suggest signers
     * Retrieve previously used Ezsignsigners and all users from the system
     * @return EzsignMinusSuggestSignersMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignSuggestSignersV1() : EzsignMinusSuggestSignersMinusV1MinusResponse {
        val localVarResponse = ezsignSuggestSignersV1WithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignMinusSuggestSignersMinusV1MinusResponse
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
     * Suggest signers
     * Retrieve previously used Ezsignsigners and all users from the system
     * @return ApiResponse<EzsignMinusSuggestSignersMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignSuggestSignersV1WithHttpInfo() : ApiResponse<EzsignMinusSuggestSignersMinusV1MinusResponse?> {
        val localVariableConfig = ezsignSuggestSignersV1RequestConfig()

        return request<Unit, EzsignMinusSuggestSignersMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignSuggestSignersV1
     *
     * @return RequestConfig
     */
    fun ezsignSuggestSignersV1RequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/module/ezsign/suggestSigners",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Suggest templates
     * Retrieve Ezsigntemplates and Ezsigntemplatepackages that can be imported in a Ezsignfolder
     * @param fkiEzsignfoldertypeID  (optional)
     * @return EzsignMinusSuggestTemplatesMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignSuggestTemplatesV1(fkiEzsignfoldertypeID: kotlin.Int? = null) : EzsignMinusSuggestTemplatesMinusV1MinusResponse {
        val localVarResponse = ezsignSuggestTemplatesV1WithHttpInfo(fkiEzsignfoldertypeID = fkiEzsignfoldertypeID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignMinusSuggestTemplatesMinusV1MinusResponse
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
     * Suggest templates
     * Retrieve Ezsigntemplates and Ezsigntemplatepackages that can be imported in a Ezsignfolder
     * @param fkiEzsignfoldertypeID  (optional)
     * @return ApiResponse<EzsignMinusSuggestTemplatesMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignSuggestTemplatesV1WithHttpInfo(fkiEzsignfoldertypeID: kotlin.Int?) : ApiResponse<EzsignMinusSuggestTemplatesMinusV1MinusResponse?> {
        val localVariableConfig = ezsignSuggestTemplatesV1RequestConfig(fkiEzsignfoldertypeID = fkiEzsignfoldertypeID)

        return request<Unit, EzsignMinusSuggestTemplatesMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignSuggestTemplatesV1
     *
     * @param fkiEzsignfoldertypeID  (optional)
     * @return RequestConfig
     */
    fun ezsignSuggestTemplatesV1RequestConfig(fkiEzsignfoldertypeID: kotlin.Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (fkiEzsignfoldertypeID != null) {
                    put("fkiEzsignfoldertypeID", listOf(fkiEzsignfoldertypeID.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/module/ezsign/suggestTemplates",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
