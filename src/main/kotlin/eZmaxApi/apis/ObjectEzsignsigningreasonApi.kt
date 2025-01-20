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

import eZmaxApi.models.CommonResponse
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.EzsignsigningreasonCreateObjectV1Request
import eZmaxApi.models.EzsignsigningreasonCreateObjectV1Response
import eZmaxApi.models.EzsignsigningreasonEditObjectV1Request
import eZmaxApi.models.EzsignsigningreasonGetAutocompleteV2Response
import eZmaxApi.models.EzsignsigningreasonGetListV1Response
import eZmaxApi.models.EzsignsigningreasonGetObjectV2Response
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

class ObjectEzsignsigningreasonApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Ezsignsigningreason
     * The endpoint allows to create one or many elements at once.
     * @param ezsignsigningreasonCreateObjectV1Request 
     * @return EzsignsigningreasonCreateObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignsigningreasonCreateObjectV1(ezsignsigningreasonCreateObjectV1Request: EzsignsigningreasonCreateObjectV1Request) : EzsignsigningreasonCreateObjectV1Response {
        val localVarResponse = ezsignsigningreasonCreateObjectV1WithHttpInfo(ezsignsigningreasonCreateObjectV1Request = ezsignsigningreasonCreateObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignsigningreasonCreateObjectV1Response
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
     * Create a new Ezsignsigningreason
     * The endpoint allows to create one or many elements at once.
     * @param ezsignsigningreasonCreateObjectV1Request 
     * @return ApiResponse<EzsignsigningreasonCreateObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignsigningreasonCreateObjectV1WithHttpInfo(ezsignsigningreasonCreateObjectV1Request: EzsignsigningreasonCreateObjectV1Request) : ApiResponse<EzsignsigningreasonCreateObjectV1Response?> {
        val localVariableConfig = ezsignsigningreasonCreateObjectV1RequestConfig(ezsignsigningreasonCreateObjectV1Request = ezsignsigningreasonCreateObjectV1Request)

        return request<EzsignsigningreasonCreateObjectV1Request, EzsignsigningreasonCreateObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignsigningreasonCreateObjectV1
     *
     * @param ezsignsigningreasonCreateObjectV1Request 
     * @return RequestConfig
     */
    fun ezsignsigningreasonCreateObjectV1RequestConfig(ezsignsigningreasonCreateObjectV1Request: EzsignsigningreasonCreateObjectV1Request) : RequestConfig<EzsignsigningreasonCreateObjectV1Request> {
        val localVariableBody = ezsignsigningreasonCreateObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsignsigningreason",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Edit an existing Ezsignsigningreason
     * 
     * @param pkiEzsignsigningreasonID The unique ID of the Ezsignsigningreason
     * @param ezsignsigningreasonEditObjectV1Request 
     * @return CommonResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignsigningreasonEditObjectV1(pkiEzsignsigningreasonID: kotlin.Int, ezsignsigningreasonEditObjectV1Request: EzsignsigningreasonEditObjectV1Request) : CommonResponse {
        val localVarResponse = ezsignsigningreasonEditObjectV1WithHttpInfo(pkiEzsignsigningreasonID = pkiEzsignsigningreasonID, ezsignsigningreasonEditObjectV1Request = ezsignsigningreasonEditObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CommonResponse
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
     * Edit an existing Ezsignsigningreason
     * 
     * @param pkiEzsignsigningreasonID The unique ID of the Ezsignsigningreason
     * @param ezsignsigningreasonEditObjectV1Request 
     * @return ApiResponse<CommonResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignsigningreasonEditObjectV1WithHttpInfo(pkiEzsignsigningreasonID: kotlin.Int, ezsignsigningreasonEditObjectV1Request: EzsignsigningreasonEditObjectV1Request) : ApiResponse<CommonResponse?> {
        val localVariableConfig = ezsignsigningreasonEditObjectV1RequestConfig(pkiEzsignsigningreasonID = pkiEzsignsigningreasonID, ezsignsigningreasonEditObjectV1Request = ezsignsigningreasonEditObjectV1Request)

        return request<EzsignsigningreasonEditObjectV1Request, CommonResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignsigningreasonEditObjectV1
     *
     * @param pkiEzsignsigningreasonID The unique ID of the Ezsignsigningreason
     * @param ezsignsigningreasonEditObjectV1Request 
     * @return RequestConfig
     */
    fun ezsignsigningreasonEditObjectV1RequestConfig(pkiEzsignsigningreasonID: kotlin.Int, ezsignsigningreasonEditObjectV1Request: EzsignsigningreasonEditObjectV1Request) : RequestConfig<EzsignsigningreasonEditObjectV1Request> {
        val localVariableBody = ezsignsigningreasonEditObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/ezsignsigningreason/{pkiEzsignsigningreasonID}".replace("{"+"pkiEzsignsigningreasonID"+"}", encodeURIComponent(pkiEzsignsigningreasonID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelectorEzsignsigningreasonGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "Active") Active("Active");

        /**
         * Override [toString()] to avoid using the enum variable name as the value, and instead use
         * the actual value defined in the API spec file.
         *
         * This solves a problem when the variable name and its value are different, and ensures that
         * the client sends the correct enum values to the server always.
         */
        override fun toString(): kotlin.String = "$value"
     }

    /**
     * enum for parameter eFilterActive
     */
     enum class EFilterActiveEzsignsigningreasonGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "Active") Active("Active"),
         @Json(name = "Inactive") Inactive("Inactive");

        /**
         * Override [toString()] to avoid using the enum variable name as the value, and instead use
         * the actual value defined in the API spec file.
         *
         * This solves a problem when the variable name and its value are different, and ensures that
         * the client sends the correct enum values to the server always.
         */
        override fun toString(): kotlin.String = "$value"
     }

    /**
     * Retrieve Ezsignsigningreasons and IDs
     * Get the list of Ezsignsigningreason to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezsignsigningreasons to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return EzsignsigningreasonGetAutocompleteV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignsigningreasonGetAutocompleteV2(sSelector: SSelectorEzsignsigningreasonGetAutocompleteV2, eFilterActive: EFilterActiveEzsignsigningreasonGetAutocompleteV2? = EFilterActiveEzsignsigningreasonGetAutocompleteV2.Active, sQuery: kotlin.String? = null, acceptLanguage: HeaderAcceptLanguage? = null) : EzsignsigningreasonGetAutocompleteV2Response {
        val localVarResponse = ezsignsigningreasonGetAutocompleteV2WithHttpInfo(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignsigningreasonGetAutocompleteV2Response
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
     * Retrieve Ezsignsigningreasons and IDs
     * Get the list of Ezsignsigningreason to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezsignsigningreasons to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return ApiResponse<EzsignsigningreasonGetAutocompleteV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignsigningreasonGetAutocompleteV2WithHttpInfo(sSelector: SSelectorEzsignsigningreasonGetAutocompleteV2, eFilterActive: EFilterActiveEzsignsigningreasonGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderAcceptLanguage?) : ApiResponse<EzsignsigningreasonGetAutocompleteV2Response?> {
        val localVariableConfig = ezsignsigningreasonGetAutocompleteV2RequestConfig(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, EzsignsigningreasonGetAutocompleteV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignsigningreasonGetAutocompleteV2
     *
     * @param sSelector The type of Ezsignsigningreasons to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return RequestConfig
     */
    fun ezsignsigningreasonGetAutocompleteV2RequestConfig(sSelector: SSelectorEzsignsigningreasonGetAutocompleteV2, eFilterActive: EFilterActiveEzsignsigningreasonGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderAcceptLanguage?) : RequestConfig<Unit> {
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
            path = "/2/object/ezsignsigningreason/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", encodeURIComponent(sSelector.value.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter eOrderBy
     */
     enum class EOrderByEzsignsigningreasonGetListV1(val value: kotlin.String) {
         @Json(name = "pkiEzsignsigningreasonID_ASC") pkiEzsignsigningreasonID_ASC("pkiEzsignsigningreasonID_ASC"),
         @Json(name = "pkiEzsignsigningreasonID_DESC") pkiEzsignsigningreasonID_DESC("pkiEzsignsigningreasonID_DESC"),
         @Json(name = "sEzsignsigningreasonDescriptionX_ASC") sEzsignsigningreasonDescriptionX_ASC("sEzsignsigningreasonDescriptionX_ASC"),
         @Json(name = "sEzsignsigningreasonDescriptionX_DESC") sEzsignsigningreasonDescriptionX_DESC("sEzsignsigningreasonDescriptionX_DESC"),
         @Json(name = "bEzsignsigningreasonIsactive_ASC") bEzsignsigningreasonIsactive_ASC("bEzsignsigningreasonIsactive_ASC"),
         @Json(name = "bEzsignsigningreasonIsactive_DESC") bEzsignsigningreasonIsactive_DESC("bEzsignsigningreasonIsactive_DESC");

        /**
         * Override [toString()] to avoid using the enum variable name as the value, and instead use
         * the actual value defined in the API spec file.
         *
         * This solves a problem when the variable name and its value are different, and ensures that
         * the client sends the correct enum values to the server always.
         */
        override fun toString(): kotlin.String = "$value"
     }

    /**
     * Retrieve Ezsignsigningreason list
     * 
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional, default to 0)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return EzsignsigningreasonGetListV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignsigningreasonGetListV1(eOrderBy: EOrderByEzsignsigningreasonGetListV1? = null, iRowMax: kotlin.Int? = null, iRowOffset: kotlin.Int? = 0, acceptLanguage: HeaderAcceptLanguage? = null, sFilter: kotlin.String? = null) : EzsignsigningreasonGetListV1Response {
        val localVarResponse = ezsignsigningreasonGetListV1WithHttpInfo(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignsigningreasonGetListV1Response
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
     * Retrieve Ezsignsigningreason list
     * 
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional, default to 0)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return ApiResponse<EzsignsigningreasonGetListV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignsigningreasonGetListV1WithHttpInfo(eOrderBy: EOrderByEzsignsigningreasonGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderAcceptLanguage?, sFilter: kotlin.String?) : ApiResponse<EzsignsigningreasonGetListV1Response?> {
        val localVariableConfig = ezsignsigningreasonGetListV1RequestConfig(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return request<Unit, EzsignsigningreasonGetListV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignsigningreasonGetListV1
     *
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional, default to 0)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return RequestConfig
     */
    fun ezsignsigningreasonGetListV1RequestConfig(eOrderBy: EOrderByEzsignsigningreasonGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderAcceptLanguage?, sFilter: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/1/object/ezsignsigningreason/getList",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsignsigningreason
     * 
     * @param pkiEzsignsigningreasonID The unique ID of the Ezsignsigningreason
     * @return EzsignsigningreasonGetObjectV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignsigningreasonGetObjectV2(pkiEzsignsigningreasonID: kotlin.Int) : EzsignsigningreasonGetObjectV2Response {
        val localVarResponse = ezsignsigningreasonGetObjectV2WithHttpInfo(pkiEzsignsigningreasonID = pkiEzsignsigningreasonID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignsigningreasonGetObjectV2Response
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
     * Retrieve an existing Ezsignsigningreason
     * 
     * @param pkiEzsignsigningreasonID The unique ID of the Ezsignsigningreason
     * @return ApiResponse<EzsignsigningreasonGetObjectV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignsigningreasonGetObjectV2WithHttpInfo(pkiEzsignsigningreasonID: kotlin.Int) : ApiResponse<EzsignsigningreasonGetObjectV2Response?> {
        val localVariableConfig = ezsignsigningreasonGetObjectV2RequestConfig(pkiEzsignsigningreasonID = pkiEzsignsigningreasonID)

        return request<Unit, EzsignsigningreasonGetObjectV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignsigningreasonGetObjectV2
     *
     * @param pkiEzsignsigningreasonID The unique ID of the Ezsignsigningreason
     * @return RequestConfig
     */
    fun ezsignsigningreasonGetObjectV2RequestConfig(pkiEzsignsigningreasonID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/ezsignsigningreason/{pkiEzsignsigningreasonID}".replace("{"+"pkiEzsignsigningreasonID"+"}", encodeURIComponent(pkiEzsignsigningreasonID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
