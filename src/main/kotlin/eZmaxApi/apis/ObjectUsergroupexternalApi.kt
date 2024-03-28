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
import eZmaxApi.models.HeaderAcceptLanguage
import eZmaxApi.models.UsergroupexternalCreateObjectV1Request
import eZmaxApi.models.UsergroupexternalCreateObjectV1Response
import eZmaxApi.models.UsergroupexternalDeleteObjectV1Response
import eZmaxApi.models.UsergroupexternalEditObjectV1Request
import eZmaxApi.models.UsergroupexternalEditObjectV1Response
import eZmaxApi.models.UsergroupexternalGetAutocompleteV2Response
import eZmaxApi.models.UsergroupexternalGetListV1Response
import eZmaxApi.models.UsergroupexternalGetObjectV2Response
import eZmaxApi.models.UsergroupexternalGetUsergroupexternalmembershipsV1Response
import eZmaxApi.models.UsergroupexternalGetUsergroupsV1Response

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

class ObjectUsergroupexternalApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Usergroupexternal
     * The endpoint allows to create one or many elements at once.
     * @param usergroupexternalCreateObjectV1Request 
     * @return UsergroupexternalCreateObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun usergroupexternalCreateObjectV1(usergroupexternalCreateObjectV1Request: UsergroupexternalCreateObjectV1Request) : UsergroupexternalCreateObjectV1Response {
        val localVarResponse = usergroupexternalCreateObjectV1WithHttpInfo(usergroupexternalCreateObjectV1Request = usergroupexternalCreateObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UsergroupexternalCreateObjectV1Response
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
     * Create a new Usergroupexternal
     * The endpoint allows to create one or many elements at once.
     * @param usergroupexternalCreateObjectV1Request 
     * @return ApiResponse<UsergroupexternalCreateObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun usergroupexternalCreateObjectV1WithHttpInfo(usergroupexternalCreateObjectV1Request: UsergroupexternalCreateObjectV1Request) : ApiResponse<UsergroupexternalCreateObjectV1Response?> {
        val localVariableConfig = usergroupexternalCreateObjectV1RequestConfig(usergroupexternalCreateObjectV1Request = usergroupexternalCreateObjectV1Request)

        return request<UsergroupexternalCreateObjectV1Request, UsergroupexternalCreateObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation usergroupexternalCreateObjectV1
     *
     * @param usergroupexternalCreateObjectV1Request 
     * @return RequestConfig
     */
    fun usergroupexternalCreateObjectV1RequestConfig(usergroupexternalCreateObjectV1Request: UsergroupexternalCreateObjectV1Request) : RequestConfig<UsergroupexternalCreateObjectV1Request> {
        val localVariableBody = usergroupexternalCreateObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/usergroupexternal",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete an existing Usergroupexternal
     * 
     * @param pkiUsergroupexternalID The unique ID of the Usergroupexternal
     * @return UsergroupexternalDeleteObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun usergroupexternalDeleteObjectV1(pkiUsergroupexternalID: kotlin.Int) : UsergroupexternalDeleteObjectV1Response {
        val localVarResponse = usergroupexternalDeleteObjectV1WithHttpInfo(pkiUsergroupexternalID = pkiUsergroupexternalID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UsergroupexternalDeleteObjectV1Response
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
     * Delete an existing Usergroupexternal
     * 
     * @param pkiUsergroupexternalID The unique ID of the Usergroupexternal
     * @return ApiResponse<UsergroupexternalDeleteObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun usergroupexternalDeleteObjectV1WithHttpInfo(pkiUsergroupexternalID: kotlin.Int) : ApiResponse<UsergroupexternalDeleteObjectV1Response?> {
        val localVariableConfig = usergroupexternalDeleteObjectV1RequestConfig(pkiUsergroupexternalID = pkiUsergroupexternalID)

        return request<Unit, UsergroupexternalDeleteObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation usergroupexternalDeleteObjectV1
     *
     * @param pkiUsergroupexternalID The unique ID of the Usergroupexternal
     * @return RequestConfig
     */
    fun usergroupexternalDeleteObjectV1RequestConfig(pkiUsergroupexternalID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/usergroupexternal/{pkiUsergroupexternalID}".replace("{"+"pkiUsergroupexternalID"+"}", encodeURIComponent(pkiUsergroupexternalID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Edit an existing Usergroupexternal
     * 
     * @param pkiUsergroupexternalID The unique ID of the Usergroupexternal
     * @param usergroupexternalEditObjectV1Request 
     * @return UsergroupexternalEditObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun usergroupexternalEditObjectV1(pkiUsergroupexternalID: kotlin.Int, usergroupexternalEditObjectV1Request: UsergroupexternalEditObjectV1Request) : UsergroupexternalEditObjectV1Response {
        val localVarResponse = usergroupexternalEditObjectV1WithHttpInfo(pkiUsergroupexternalID = pkiUsergroupexternalID, usergroupexternalEditObjectV1Request = usergroupexternalEditObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UsergroupexternalEditObjectV1Response
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
     * Edit an existing Usergroupexternal
     * 
     * @param pkiUsergroupexternalID The unique ID of the Usergroupexternal
     * @param usergroupexternalEditObjectV1Request 
     * @return ApiResponse<UsergroupexternalEditObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun usergroupexternalEditObjectV1WithHttpInfo(pkiUsergroupexternalID: kotlin.Int, usergroupexternalEditObjectV1Request: UsergroupexternalEditObjectV1Request) : ApiResponse<UsergroupexternalEditObjectV1Response?> {
        val localVariableConfig = usergroupexternalEditObjectV1RequestConfig(pkiUsergroupexternalID = pkiUsergroupexternalID, usergroupexternalEditObjectV1Request = usergroupexternalEditObjectV1Request)

        return request<UsergroupexternalEditObjectV1Request, UsergroupexternalEditObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation usergroupexternalEditObjectV1
     *
     * @param pkiUsergroupexternalID The unique ID of the Usergroupexternal
     * @param usergroupexternalEditObjectV1Request 
     * @return RequestConfig
     */
    fun usergroupexternalEditObjectV1RequestConfig(pkiUsergroupexternalID: kotlin.Int, usergroupexternalEditObjectV1Request: UsergroupexternalEditObjectV1Request) : RequestConfig<UsergroupexternalEditObjectV1Request> {
        val localVariableBody = usergroupexternalEditObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/usergroupexternal/{pkiUsergroupexternalID}".replace("{"+"pkiUsergroupexternalID"+"}", encodeURIComponent(pkiUsergroupexternalID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelectorUsergroupexternalGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All")
     }

    /**
     * enum for parameter eFilterActive
     */
     enum class EFilterActiveUsergroupexternalGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "Active") Active("Active"),
         @Json(name = "Inactive") Inactive("Inactive")
     }

    /**
     * Retrieve Usergroupexternals and IDs
     * Get the list of Usergroupexternal to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Usergroupexternals to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return UsergroupexternalGetAutocompleteV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun usergroupexternalGetAutocompleteV2(sSelector: SSelectorUsergroupexternalGetAutocompleteV2, eFilterActive: EFilterActiveUsergroupexternalGetAutocompleteV2? = EFilterActiveUsergroupexternalGetAutocompleteV2.Active, sQuery: kotlin.String? = null, acceptLanguage: HeaderAcceptLanguage? = null) : UsergroupexternalGetAutocompleteV2Response {
        val localVarResponse = usergroupexternalGetAutocompleteV2WithHttpInfo(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UsergroupexternalGetAutocompleteV2Response
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
     * Retrieve Usergroupexternals and IDs
     * Get the list of Usergroupexternal to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Usergroupexternals to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return ApiResponse<UsergroupexternalGetAutocompleteV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun usergroupexternalGetAutocompleteV2WithHttpInfo(sSelector: SSelectorUsergroupexternalGetAutocompleteV2, eFilterActive: EFilterActiveUsergroupexternalGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderAcceptLanguage?) : ApiResponse<UsergroupexternalGetAutocompleteV2Response?> {
        val localVariableConfig = usergroupexternalGetAutocompleteV2RequestConfig(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, UsergroupexternalGetAutocompleteV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation usergroupexternalGetAutocompleteV2
     *
     * @param sSelector The type of Usergroupexternals to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return RequestConfig
     */
    fun usergroupexternalGetAutocompleteV2RequestConfig(sSelector: SSelectorUsergroupexternalGetAutocompleteV2, eFilterActive: EFilterActiveUsergroupexternalGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderAcceptLanguage?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (eFilterActive != null) {
                    put("eFilterActive", listOf(eFilterActive.value))
                }
                if (sQuery != null) {
                    put("sQuery", listOf(sQuery.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        acceptLanguage?.apply { localVariableHeaders["Accept-Language"] = this.toString() }
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/usergroupexternal/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", encodeURIComponent(sSelector.value.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter eOrderBy
     */
     enum class EOrderByUsergroupexternalGetListV1(val value: kotlin.String) {
         @Json(name = "pkiUsergroupexternalID_ASC") pkiUsergroupexternalID_ASC("pkiUsergroupexternalID_ASC"),
         @Json(name = "pkiUsergroupexternalID_DESC") pkiUsergroupexternalID_DESC("pkiUsergroupexternalID_DESC"),
         @Json(name = "sUsergroupexternalName_ASC") sUsergroupexternalName_ASC("sUsergroupexternalName_ASC"),
         @Json(name = "sUsergroupexternalName_DESC") sUsergroupexternalName_DESC("sUsergroupexternalName_DESC"),
         @Json(name = "sUsergroupexternalID_ASC") sUsergroupexternalID_ASC("sUsergroupexternalID_ASC"),
         @Json(name = "sUsergroupexternalID_DESC") sUsergroupexternalID_DESC("sUsergroupexternalID_DESC")
     }

    /**
     * Retrieve Usergroupexternal list
     * 
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional, default to 0)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return UsergroupexternalGetListV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun usergroupexternalGetListV1(eOrderBy: EOrderByUsergroupexternalGetListV1? = null, iRowMax: kotlin.Int? = null, iRowOffset: kotlin.Int? = 0, acceptLanguage: HeaderAcceptLanguage? = null, sFilter: kotlin.String? = null) : UsergroupexternalGetListV1Response {
        val localVarResponse = usergroupexternalGetListV1WithHttpInfo(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UsergroupexternalGetListV1Response
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
     * Retrieve Usergroupexternal list
     * 
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional, default to 0)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return ApiResponse<UsergroupexternalGetListV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun usergroupexternalGetListV1WithHttpInfo(eOrderBy: EOrderByUsergroupexternalGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderAcceptLanguage?, sFilter: kotlin.String?) : ApiResponse<UsergroupexternalGetListV1Response?> {
        val localVariableConfig = usergroupexternalGetListV1RequestConfig(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return request<Unit, UsergroupexternalGetListV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation usergroupexternalGetListV1
     *
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional, default to 0)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return RequestConfig
     */
    fun usergroupexternalGetListV1RequestConfig(eOrderBy: EOrderByUsergroupexternalGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderAcceptLanguage?, sFilter: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/1/object/usergroupexternal/getList",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Usergroupexternal
     * 
     * @param pkiUsergroupexternalID The unique ID of the Usergroupexternal
     * @return UsergroupexternalGetObjectV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun usergroupexternalGetObjectV2(pkiUsergroupexternalID: kotlin.Int) : UsergroupexternalGetObjectV2Response {
        val localVarResponse = usergroupexternalGetObjectV2WithHttpInfo(pkiUsergroupexternalID = pkiUsergroupexternalID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UsergroupexternalGetObjectV2Response
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
     * Retrieve an existing Usergroupexternal
     * 
     * @param pkiUsergroupexternalID The unique ID of the Usergroupexternal
     * @return ApiResponse<UsergroupexternalGetObjectV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun usergroupexternalGetObjectV2WithHttpInfo(pkiUsergroupexternalID: kotlin.Int) : ApiResponse<UsergroupexternalGetObjectV2Response?> {
        val localVariableConfig = usergroupexternalGetObjectV2RequestConfig(pkiUsergroupexternalID = pkiUsergroupexternalID)

        return request<Unit, UsergroupexternalGetObjectV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation usergroupexternalGetObjectV2
     *
     * @param pkiUsergroupexternalID The unique ID of the Usergroupexternal
     * @return RequestConfig
     */
    fun usergroupexternalGetObjectV2RequestConfig(pkiUsergroupexternalID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/usergroupexternal/{pkiUsergroupexternalID}".replace("{"+"pkiUsergroupexternalID"+"}", encodeURIComponent(pkiUsergroupexternalID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Usergroupexternal&#39;s Usergroupexternalmemberships
     * 
     * @param pkiUsergroupexternalID 
     * @return UsergroupexternalGetUsergroupexternalmembershipsV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun usergroupexternalGetUsergroupexternalmembershipsV1(pkiUsergroupexternalID: kotlin.Int) : UsergroupexternalGetUsergroupexternalmembershipsV1Response {
        val localVarResponse = usergroupexternalGetUsergroupexternalmembershipsV1WithHttpInfo(pkiUsergroupexternalID = pkiUsergroupexternalID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UsergroupexternalGetUsergroupexternalmembershipsV1Response
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
     * Retrieve an existing Usergroupexternal&#39;s Usergroupexternalmemberships
     * 
     * @param pkiUsergroupexternalID 
     * @return ApiResponse<UsergroupexternalGetUsergroupexternalmembershipsV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun usergroupexternalGetUsergroupexternalmembershipsV1WithHttpInfo(pkiUsergroupexternalID: kotlin.Int) : ApiResponse<UsergroupexternalGetUsergroupexternalmembershipsV1Response?> {
        val localVariableConfig = usergroupexternalGetUsergroupexternalmembershipsV1RequestConfig(pkiUsergroupexternalID = pkiUsergroupexternalID)

        return request<Unit, UsergroupexternalGetUsergroupexternalmembershipsV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation usergroupexternalGetUsergroupexternalmembershipsV1
     *
     * @param pkiUsergroupexternalID 
     * @return RequestConfig
     */
    fun usergroupexternalGetUsergroupexternalmembershipsV1RequestConfig(pkiUsergroupexternalID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/usergroupexternal/{pkiUsergroupexternalID}/getUsergroupexternalmemberships".replace("{"+"pkiUsergroupexternalID"+"}", encodeURIComponent(pkiUsergroupexternalID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Get Usergroupexternal&#39;s Usergroups
     * 
     * @param pkiUsergroupexternalID 
     * @return UsergroupexternalGetUsergroupsV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun usergroupexternalGetUsergroupsV1(pkiUsergroupexternalID: kotlin.Int) : UsergroupexternalGetUsergroupsV1Response {
        val localVarResponse = usergroupexternalGetUsergroupsV1WithHttpInfo(pkiUsergroupexternalID = pkiUsergroupexternalID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UsergroupexternalGetUsergroupsV1Response
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
     * Get Usergroupexternal&#39;s Usergroups
     * 
     * @param pkiUsergroupexternalID 
     * @return ApiResponse<UsergroupexternalGetUsergroupsV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun usergroupexternalGetUsergroupsV1WithHttpInfo(pkiUsergroupexternalID: kotlin.Int) : ApiResponse<UsergroupexternalGetUsergroupsV1Response?> {
        val localVariableConfig = usergroupexternalGetUsergroupsV1RequestConfig(pkiUsergroupexternalID = pkiUsergroupexternalID)

        return request<Unit, UsergroupexternalGetUsergroupsV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation usergroupexternalGetUsergroupsV1
     *
     * @param pkiUsergroupexternalID 
     * @return RequestConfig
     */
    fun usergroupexternalGetUsergroupsV1RequestConfig(pkiUsergroupexternalID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/usergroupexternal/{pkiUsergroupexternalID}/getUsergroups".replace("{"+"pkiUsergroupexternalID"+"}", encodeURIComponent(pkiUsergroupexternalID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}