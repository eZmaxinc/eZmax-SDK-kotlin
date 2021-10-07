/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.0
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

import eZmaxApi.models.CommonMinusResponseMinusError
import eZmaxApi.models.EzsignfoldertypeMinusGetListMinusV1MinusResponse
import eZmaxApi.models.HeaderMinusAcceptMinusLanguage

import eZmaxApi.infrastructure.ApiClient
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

class ObjectEzsignfoldertypeApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("eZmaxApi.baseUrl", "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
    * Retrieve Ezsignfoldertype list
    * ## ⚠️EARLY ADOPTERS WARNING  ### This endpoint is not officially released. Its definition might still change and it might not be available in every environment and region.  Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsignfoldertypePrivacylevel | User&lt;br&gt;Usergroup |
    * @param eOrderBy Specify how you want the results to be sorted (optional)
    * @param iRowMax  (optional)
    * @param iRowOffset  (optional)
    * @param acceptLanguage  (optional)
    * @param sFilter  (optional)
    * @return EzsignfoldertypeMinusGetListMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldertypeGetListV1(eOrderBy: kotlin.String?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderMinusAcceptMinusLanguage?, sFilter: kotlin.String?) : EzsignfoldertypeMinusGetListMinusV1MinusResponse {
        val localVariableConfig = ezsignfoldertypeGetListV1RequestConfig(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        val localVarResponse = request<Unit, EzsignfoldertypeMinusGetListMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldertypeMinusGetListMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsignfoldertypeGetListV1
    *
    * @param eOrderBy Specify how you want the results to be sorted (optional)
    * @param iRowMax  (optional)
    * @param iRowOffset  (optional)
    * @param acceptLanguage  (optional)
    * @param sFilter  (optional)
    * @return RequestConfig
    */
    fun ezsignfoldertypeGetListV1RequestConfig(eOrderBy: kotlin.String?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderMinusAcceptMinusLanguage?, sFilter: kotlin.String?) : RequestConfig<Unit> {
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

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignfoldertype/getList",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}