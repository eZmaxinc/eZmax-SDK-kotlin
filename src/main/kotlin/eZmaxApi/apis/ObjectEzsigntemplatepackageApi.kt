/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.3
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
import eZmaxApi.models.EzsigntemplatepackageMinusGetListMinusV1MinusResponse
import eZmaxApi.models.HeaderMinusAcceptMinusLanguage

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

class ObjectEzsigntemplatepackageApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
    * Retrieve Ezsigntemplatepackage list
    * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsigntemplatepackageType | Company&lt;br&gt;Department&lt;br&gt;Team&lt;br&gt;User&lt;br&gt;Usergroup |
    * @param eOrderBy Specify how you want the results to be sorted (optional)
    * @param iRowMax  (optional)
    * @param iRowOffset  (optional)
    * @param acceptLanguage  (optional)
    * @param sFilter  (optional)
    * @return EzsigntemplatepackageMinusGetListMinusV1MinusResponse
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplatepackageGetListV1(eOrderBy: kotlin.String?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderMinusAcceptMinusLanguage?, sFilter: kotlin.String?) : EzsigntemplatepackageMinusGetListMinusV1MinusResponse {
        val localVarResponse = ezsigntemplatepackageGetListV1WithHttpInfo(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplatepackageMinusGetListMinusV1MinusResponse
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
    * Retrieve Ezsigntemplatepackage list
    * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsigntemplatepackageType | Company&lt;br&gt;Department&lt;br&gt;Team&lt;br&gt;User&lt;br&gt;Usergroup |
    * @param eOrderBy Specify how you want the results to be sorted (optional)
    * @param iRowMax  (optional)
    * @param iRowOffset  (optional)
    * @param acceptLanguage  (optional)
    * @param sFilter  (optional)
    * @return ApiResponse<EzsigntemplatepackageMinusGetListMinusV1MinusResponse?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplatepackageGetListV1WithHttpInfo(eOrderBy: kotlin.String?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderMinusAcceptMinusLanguage?, sFilter: kotlin.String?) : ApiResponse<EzsigntemplatepackageMinusGetListMinusV1MinusResponse?> {
        val localVariableConfig = ezsigntemplatepackageGetListV1RequestConfig(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return request<Unit, EzsigntemplatepackageMinusGetListMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation ezsigntemplatepackageGetListV1
    *
    * @param eOrderBy Specify how you want the results to be sorted (optional)
    * @param iRowMax  (optional)
    * @param iRowOffset  (optional)
    * @param acceptLanguage  (optional)
    * @param sFilter  (optional)
    * @return RequestConfig
    */
    fun ezsigntemplatepackageGetListV1RequestConfig(eOrderBy: kotlin.String?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderMinusAcceptMinusLanguage?, sFilter: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
            .apply {
                if (eOrderBy != null) {
                    put("eOrderBy", listOf(eOrderBy.toString()))
                }
                if (iRowMax != null) {
                    put("iRowMax", listOf(iRowMax.toString()))
                }
                if (iRowOffset != null) {
                    put("iRowOffset", listOf(iRowOffset.toString()))
                }
                if (sFilter != null) {
                    put("sFilter", listOf(sFilter.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        acceptLanguage?.apply { localVariableHeaders["Accept-Language"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsigntemplatepackage/getList",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
