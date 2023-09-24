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

import eZmaxApi.models.ActivesessionGetCurrentV1Response
import eZmaxApi.models.ActivesessionGetListV1Response
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.CommonResponseRedirectSSecretquestionTextX
import eZmaxApi.models.HeaderAcceptLanguage

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

class ObjectActivesessionApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Get Current Activesession
     * Retrieve the details about the current activesession
     * @return ActivesessionGetCurrentV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun activesessionGetCurrentV1() : ActivesessionGetCurrentV1Response {
        val localVarResponse = activesessionGetCurrentV1WithHttpInfo()

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ActivesessionGetCurrentV1Response
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
     * Get Current Activesession
     * Retrieve the details about the current activesession
     * @return ApiResponse<ActivesessionGetCurrentV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun activesessionGetCurrentV1WithHttpInfo() : ApiResponse<ActivesessionGetCurrentV1Response?> {
        val localVariableConfig = activesessionGetCurrentV1RequestConfig()

        return request<Unit, ActivesessionGetCurrentV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation activesessionGetCurrentV1
     *
     * @return RequestConfig
     */
    fun activesessionGetCurrentV1RequestConfig() : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/activesession/getCurrent",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter eOrderBy
     */
     enum class EOrderByActivesessionGetListV1(val value: kotlin.String) {
         @Json(name = "pkiActivesessionID_ASC") pkiActivesessionID_ASC("pkiActivesessionID_ASC"),
         @Json(name = "pkiActivesessionID_DESC") pkiActivesessionID_DESC("pkiActivesessionID_DESC"),
         @Json(name = "fkiUserID_ASC") fkiUserID_ASC("fkiUserID_ASC"),
         @Json(name = "fkiUserID_DESC") fkiUserID_DESC("fkiUserID_DESC"),
         @Json(name = "fkiComputerID_ASC") fkiComputerID_ASC("fkiComputerID_ASC"),
         @Json(name = "fkiComputerID_DESC") fkiComputerID_DESC("fkiComputerID_DESC"),
         @Json(name = "fkiCompanyID_ASC") fkiCompanyID_ASC("fkiCompanyID_ASC"),
         @Json(name = "fkiCompanyID_DESC") fkiCompanyID_DESC("fkiCompanyID_DESC"),
         @Json(name = "fkiDepartmentID_ASC") fkiDepartmentID_ASC("fkiDepartmentID_ASC"),
         @Json(name = "fkiDepartmentID_DESC") fkiDepartmentID_DESC("fkiDepartmentID_DESC"),
         @Json(name = "sCompanyNameX_ASC") sCompanyNameX_ASC("sCompanyNameX_ASC"),
         @Json(name = "sCompanyNameX_DESC") sCompanyNameX_DESC("sCompanyNameX_DESC"),
         @Json(name = "sDepartmentNameX_ASC") sDepartmentNameX_ASC("sDepartmentNameX_ASC"),
         @Json(name = "sDepartmentNameX_DESC") sDepartmentNameX_DESC("sDepartmentNameX_DESC"),
         @Json(name = "sActivesessionLoginname_ASC") sActivesessionLoginname_ASC("sActivesessionLoginname_ASC"),
         @Json(name = "sActivesessionLoginname_DESC") sActivesessionLoginname_DESC("sActivesessionLoginname_DESC"),
         @Json(name = "sComputerDescription_ASC") sComputerDescription_ASC("sComputerDescription_ASC"),
         @Json(name = "sComputerDescription_DESC") sComputerDescription_DESC("sComputerDescription_DESC"),
         @Json(name = "dtActivesessionFirsthit_ASC") dtActivesessionFirsthit_ASC("dtActivesessionFirsthit_ASC"),
         @Json(name = "dtActivesessionFirsthit_DESC") dtActivesessionFirsthit_DESC("dtActivesessionFirsthit_DESC"),
         @Json(name = "dtActivesessionLasthit_ASC") dtActivesessionLasthit_ASC("dtActivesessionLasthit_ASC"),
         @Json(name = "dtActivesessionLasthit_DESC") dtActivesessionLasthit_DESC("dtActivesessionLasthit_DESC"),
         @Json(name = "sActivesessionIP_ASC") sActivesessionIP_ASC("sActivesessionIP_ASC"),
         @Json(name = "sActivesessionIP_DESC") sActivesessionIP_DESC("sActivesessionIP_DESC")
     }

    /**
     * Retrieve Activesession list
     * 
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional, default to 10000)
     * @param iRowOffset  (optional, default to 0)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return ActivesessionGetListV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun activesessionGetListV1(eOrderBy: EOrderByActivesessionGetListV1? = null, iRowMax: kotlin.Int? = 10000, iRowOffset: kotlin.Int? = 0, acceptLanguage: HeaderAcceptLanguage? = null, sFilter: kotlin.String? = null) : ActivesessionGetListV1Response {
        val localVarResponse = activesessionGetListV1WithHttpInfo(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ActivesessionGetListV1Response
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
     * Retrieve Activesession list
     * 
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional, default to 10000)
     * @param iRowOffset  (optional, default to 0)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return ApiResponse<ActivesessionGetListV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun activesessionGetListV1WithHttpInfo(eOrderBy: EOrderByActivesessionGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderAcceptLanguage?, sFilter: kotlin.String?) : ApiResponse<ActivesessionGetListV1Response?> {
        val localVariableConfig = activesessionGetListV1RequestConfig(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return request<Unit, ActivesessionGetListV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation activesessionGetListV1
     *
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional, default to 10000)
     * @param iRowOffset  (optional, default to 0)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return RequestConfig
     */
    fun activesessionGetListV1RequestConfig(eOrderBy: EOrderByActivesessionGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderAcceptLanguage?, sFilter: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (eOrderBy != null) {
                    put("eOrderBy", listOf(eOrderBy.value))
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
            path = "/1/object/activesession/getList",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
