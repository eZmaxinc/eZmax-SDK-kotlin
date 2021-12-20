/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
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

import eZmaxApi.models.CommonMinusGetAutocompleteMinusV1MinusResponse

import eZmaxApi.infrastructure.ApiClient
import eZmaxApi.infrastructure.ApiResponse
import eZmaxApi.infrastructure.ClientException
import eZmaxApi.infrastructure.ClientError
import eZmaxApi.infrastructure.ServerException
import eZmaxApi.infrastructure.ServerError
import eZmaxApi.infrastructure.MultiValueMap
import eZmaxApi.infrastructure.RequestConfig
import eZmaxApi.infrastructure.RequestMethod
import eZmaxApi.infrastructure.ResponseType
import eZmaxApi.infrastructure.Success
import eZmaxApi.infrastructure.toMultiValue

class ObjectFranchiseofficeApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
    * Retrieve Franchiseoffices and IDs
    * Get the list of Franchiseoffices to be used in a dropdown or autocomplete control.
    * @param sSelector The type of Franchiseoffices to return 
    * @param sQuery Allow to filter the returned results (optional)
    * @return CommonMinusGetAutocompleteMinusV1MinusResponse
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun franchiseofficeGetAutocompleteV1(sSelector: kotlin.String, sQuery: kotlin.String?) : CommonMinusGetAutocompleteMinusV1MinusResponse {
        val localVarResponse = franchiseofficeGetAutocompleteV1WithHttpInfo(sSelector = sSelector, sQuery = sQuery)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CommonMinusGetAutocompleteMinusV1MinusResponse
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
    * Retrieve Franchiseoffices and IDs
    * Get the list of Franchiseoffices to be used in a dropdown or autocomplete control.
    * @param sSelector The type of Franchiseoffices to return 
    * @param sQuery Allow to filter the returned results (optional)
    * @return ApiResponse<CommonMinusGetAutocompleteMinusV1MinusResponse?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun franchiseofficeGetAutocompleteV1WithHttpInfo(sSelector: kotlin.String, sQuery: kotlin.String?) : ApiResponse<CommonMinusGetAutocompleteMinusV1MinusResponse?> {
        val localVariableConfig = franchiseofficeGetAutocompleteV1RequestConfig(sSelector = sSelector, sQuery = sQuery)

        return request<Unit, CommonMinusGetAutocompleteMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation franchiseofficeGetAutocompleteV1
    *
    * @param sSelector The type of Franchiseoffices to return 
    * @param sQuery Allow to filter the returned results (optional)
    * @return RequestConfig
    */
    fun franchiseofficeGetAutocompleteV1RequestConfig(sSelector: kotlin.String, sQuery: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (sQuery != null) {
                    put("sQuery", listOf(sQuery.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/franchiseoffice/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", "$sSelector"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
