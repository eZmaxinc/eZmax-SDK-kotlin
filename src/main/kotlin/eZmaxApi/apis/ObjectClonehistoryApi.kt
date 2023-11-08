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

import eZmaxApi.models.ClonehistoryGetListV1Response
import eZmaxApi.models.CommonResponseError
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

class ObjectClonehistoryApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * enum for parameter eOrderBy
     */
     enum class EOrderByClonehistoryGetListV1(val value: kotlin.String) {
         @Json(name = "pkiClonehistoryID_ASC") pkiClonehistoryID_ASC("pkiClonehistoryID_ASC"),
         @Json(name = "pkiClonehistoryID_DESC") pkiClonehistoryID_DESC("pkiClonehistoryID_DESC"),
         @Json(name = "fkiUserIDCloning_ASC") fkiUserIDCloning_ASC("fkiUserIDCloning_ASC"),
         @Json(name = "fkiUserIDCloning_DESC") fkiUserIDCloning_DESC("fkiUserIDCloning_DESC"),
         @Json(name = "fkiUserIDCloned_ASC") fkiUserIDCloned_ASC("fkiUserIDCloned_ASC"),
         @Json(name = "fkiUserIDCloned_DESC") fkiUserIDCloned_DESC("fkiUserIDCloned_DESC"),
         @Json(name = "dtClonehistoryFirsthit_ASC") dtClonehistoryFirsthit_ASC("dtClonehistoryFirsthit_ASC"),
         @Json(name = "dtClonehistoryFirsthit_DESC") dtClonehistoryFirsthit_DESC("dtClonehistoryFirsthit_DESC"),
         @Json(name = "dtClonehistoryLasthit_ASC") dtClonehistoryLasthit_ASC("dtClonehistoryLasthit_ASC"),
         @Json(name = "dtClonehistoryLasthit_DESC") dtClonehistoryLasthit_DESC("dtClonehistoryLasthit_DESC"),
         @Json(name = "sUserLoginnameCloning_ASC") sUserLoginnameCloning_ASC("sUserLoginnameCloning_ASC"),
         @Json(name = "sUserLoginnameCloning_DESC") sUserLoginnameCloning_DESC("sUserLoginnameCloning_DESC"),
         @Json(name = "sUserFirstnameCloning_ASC") sUserFirstnameCloning_ASC("sUserFirstnameCloning_ASC"),
         @Json(name = "sUserFirstnameCloning_DESC") sUserFirstnameCloning_DESC("sUserFirstnameCloning_DESC"),
         @Json(name = "sUserLastnameCloning_ASC") sUserLastnameCloning_ASC("sUserLastnameCloning_ASC"),
         @Json(name = "sUserLastnameCloning_DESC") sUserLastnameCloning_DESC("sUserLastnameCloning_DESC"),
         @Json(name = "sUserLoginnameCloned_ASC") sUserLoginnameCloned_ASC("sUserLoginnameCloned_ASC"),
         @Json(name = "sUserLoginnameCloned_DESC") sUserLoginnameCloned_DESC("sUserLoginnameCloned_DESC"),
         @Json(name = "sUserFirstnameCloned_ASC") sUserFirstnameCloned_ASC("sUserFirstnameCloned_ASC"),
         @Json(name = "sUserFirstnameCloned_DESC") sUserFirstnameCloned_DESC("sUserFirstnameCloned_DESC"),
         @Json(name = "sUserLastnameCloned_ASC") sUserLastnameCloned_ASC("sUserLastnameCloned_ASC"),
         @Json(name = "sUserLastnameCloned_DESC") sUserLastnameCloned_DESC("sUserLastnameCloned_DESC")
     }

    /**
     * Retrieve Clonehistory list
     * 
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional, default to 0)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return ClonehistoryGetListV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun clonehistoryGetListV1(eOrderBy: EOrderByClonehistoryGetListV1? = null, iRowMax: kotlin.Int? = null, iRowOffset: kotlin.Int? = 0, acceptLanguage: HeaderAcceptLanguage? = null, sFilter: kotlin.String? = null) : ClonehistoryGetListV1Response {
        val localVarResponse = clonehistoryGetListV1WithHttpInfo(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ClonehistoryGetListV1Response
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
     * Retrieve Clonehistory list
     * 
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional, default to 0)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return ApiResponse<ClonehistoryGetListV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun clonehistoryGetListV1WithHttpInfo(eOrderBy: EOrderByClonehistoryGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderAcceptLanguage?, sFilter: kotlin.String?) : ApiResponse<ClonehistoryGetListV1Response?> {
        val localVariableConfig = clonehistoryGetListV1RequestConfig(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return request<Unit, ClonehistoryGetListV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation clonehistoryGetListV1
     *
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional, default to 0)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return RequestConfig
     */
    fun clonehistoryGetListV1RequestConfig(eOrderBy: EOrderByClonehistoryGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderAcceptLanguage?, sFilter: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/1/object/clonehistory/getList",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
