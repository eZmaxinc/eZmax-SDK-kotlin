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

import eZmaxApi.models.CommonGetAutocompleteV1Response
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.EzsignfoldertypeCreateObjectV1Request
import eZmaxApi.models.EzsignfoldertypeCreateObjectV1Response
import eZmaxApi.models.EzsignfoldertypeEditObjectV1Request
import eZmaxApi.models.EzsignfoldertypeEditObjectV1Response
import eZmaxApi.models.EzsignfoldertypeGetAutocompleteV2Response
import eZmaxApi.models.EzsignfoldertypeGetListV1Response
import eZmaxApi.models.EzsignfoldertypeGetObjectV2Response
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

class ObjectEzsignfoldertypeApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Ezsignfoldertype
     * The endpoint allows to create one or many elements at once.
     * @param ezsignfoldertypeCreateObjectV1Request 
     * @return EzsignfoldertypeCreateObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldertypeCreateObjectV1(ezsignfoldertypeCreateObjectV1Request: EzsignfoldertypeCreateObjectV1Request) : EzsignfoldertypeCreateObjectV1Response {
        val localVarResponse = ezsignfoldertypeCreateObjectV1WithHttpInfo(ezsignfoldertypeCreateObjectV1Request = ezsignfoldertypeCreateObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldertypeCreateObjectV1Response
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
     * Create a new Ezsignfoldertype
     * The endpoint allows to create one or many elements at once.
     * @param ezsignfoldertypeCreateObjectV1Request 
     * @return ApiResponse<EzsignfoldertypeCreateObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignfoldertypeCreateObjectV1WithHttpInfo(ezsignfoldertypeCreateObjectV1Request: EzsignfoldertypeCreateObjectV1Request) : ApiResponse<EzsignfoldertypeCreateObjectV1Response?> {
        val localVariableConfig = ezsignfoldertypeCreateObjectV1RequestConfig(ezsignfoldertypeCreateObjectV1Request = ezsignfoldertypeCreateObjectV1Request)

        return request<EzsignfoldertypeCreateObjectV1Request, EzsignfoldertypeCreateObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignfoldertypeCreateObjectV1
     *
     * @param ezsignfoldertypeCreateObjectV1Request 
     * @return RequestConfig
     */
    fun ezsignfoldertypeCreateObjectV1RequestConfig(ezsignfoldertypeCreateObjectV1Request: EzsignfoldertypeCreateObjectV1Request) : RequestConfig<EzsignfoldertypeCreateObjectV1Request> {
        val localVariableBody = ezsignfoldertypeCreateObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsignfoldertype",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Edit an existing Ezsignfoldertype
     * 
     * @param pkiEzsignfoldertypeID 
     * @param ezsignfoldertypeEditObjectV1Request 
     * @return EzsignfoldertypeEditObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldertypeEditObjectV1(pkiEzsignfoldertypeID: kotlin.Int, ezsignfoldertypeEditObjectV1Request: EzsignfoldertypeEditObjectV1Request) : EzsignfoldertypeEditObjectV1Response {
        val localVarResponse = ezsignfoldertypeEditObjectV1WithHttpInfo(pkiEzsignfoldertypeID = pkiEzsignfoldertypeID, ezsignfoldertypeEditObjectV1Request = ezsignfoldertypeEditObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldertypeEditObjectV1Response
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
     * Edit an existing Ezsignfoldertype
     * 
     * @param pkiEzsignfoldertypeID 
     * @param ezsignfoldertypeEditObjectV1Request 
     * @return ApiResponse<EzsignfoldertypeEditObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignfoldertypeEditObjectV1WithHttpInfo(pkiEzsignfoldertypeID: kotlin.Int, ezsignfoldertypeEditObjectV1Request: EzsignfoldertypeEditObjectV1Request) : ApiResponse<EzsignfoldertypeEditObjectV1Response?> {
        val localVariableConfig = ezsignfoldertypeEditObjectV1RequestConfig(pkiEzsignfoldertypeID = pkiEzsignfoldertypeID, ezsignfoldertypeEditObjectV1Request = ezsignfoldertypeEditObjectV1Request)

        return request<EzsignfoldertypeEditObjectV1Request, EzsignfoldertypeEditObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignfoldertypeEditObjectV1
     *
     * @param pkiEzsignfoldertypeID 
     * @param ezsignfoldertypeEditObjectV1Request 
     * @return RequestConfig
     */
    fun ezsignfoldertypeEditObjectV1RequestConfig(pkiEzsignfoldertypeID: kotlin.Int, ezsignfoldertypeEditObjectV1Request: EzsignfoldertypeEditObjectV1Request) : RequestConfig<EzsignfoldertypeEditObjectV1Request> {
        val localVariableBody = ezsignfoldertypeEditObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/ezsignfoldertype/{pkiEzsignfoldertypeID}".replace("{"+"pkiEzsignfoldertypeID"+"}", encodeURIComponent(pkiEzsignfoldertypeID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelectorEzsignfoldertypeGetAutocompleteV1(val value: kotlin.String) {
         @Json(name = "Active") Active("Active"),
         @Json(name = "All") All("All")
     }

    /**
     * enum for parameter eFilterActive
     */
     enum class EFilterActiveEzsignfoldertypeGetAutocompleteV1(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "Active") Active("Active"),
         @Json(name = "Inactive") Inactive("Inactive")
     }

    /**
     * Retrieve Ezsignfoldertypes and IDs
     * Get the list of Ezsignfoldertypes to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezsignfoldertypes to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return CommonGetAutocompleteV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun ezsignfoldertypeGetAutocompleteV1(sSelector: SSelectorEzsignfoldertypeGetAutocompleteV1, eFilterActive: EFilterActiveEzsignfoldertypeGetAutocompleteV1? = EFilterActiveEzsignfoldertypeGetAutocompleteV1.Active, sQuery: kotlin.String? = null, acceptLanguage: HeaderAcceptLanguage? = null) : CommonGetAutocompleteV1Response {
        @Suppress("DEPRECATION")
        val localVarResponse = ezsignfoldertypeGetAutocompleteV1WithHttpInfo(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CommonGetAutocompleteV1Response
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
     * Retrieve Ezsignfoldertypes and IDs
     * Get the list of Ezsignfoldertypes to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezsignfoldertypes to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return ApiResponse<CommonGetAutocompleteV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun ezsignfoldertypeGetAutocompleteV1WithHttpInfo(sSelector: SSelectorEzsignfoldertypeGetAutocompleteV1, eFilterActive: EFilterActiveEzsignfoldertypeGetAutocompleteV1?, sQuery: kotlin.String?, acceptLanguage: HeaderAcceptLanguage?) : ApiResponse<CommonGetAutocompleteV1Response?> {
        @Suppress("DEPRECATION")
        val localVariableConfig = ezsignfoldertypeGetAutocompleteV1RequestConfig(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, CommonGetAutocompleteV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignfoldertypeGetAutocompleteV1
     *
     * @param sSelector The type of Ezsignfoldertypes to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return RequestConfig
     */
    @Deprecated(message = "This operation is deprecated.")
    fun ezsignfoldertypeGetAutocompleteV1RequestConfig(sSelector: SSelectorEzsignfoldertypeGetAutocompleteV1, eFilterActive: EFilterActiveEzsignfoldertypeGetAutocompleteV1?, sQuery: kotlin.String?, acceptLanguage: HeaderAcceptLanguage?) : RequestConfig<Unit> {
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
            path = "/1/object/ezsignfoldertype/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", encodeURIComponent(sSelector.value.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelectorEzsignfoldertypeGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "Active") Active("Active"),
         @Json(name = "All") All("All")
     }

    /**
     * enum for parameter eFilterActive
     */
     enum class EFilterActiveEzsignfoldertypeGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "Active") Active("Active"),
         @Json(name = "Inactive") Inactive("Inactive")
     }

    /**
     * Retrieve Ezsignfoldertypes and IDs
     * Get the list of Ezsignfoldertype to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezsignfoldertypes to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return EzsignfoldertypeGetAutocompleteV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldertypeGetAutocompleteV2(sSelector: SSelectorEzsignfoldertypeGetAutocompleteV2, eFilterActive: EFilterActiveEzsignfoldertypeGetAutocompleteV2? = EFilterActiveEzsignfoldertypeGetAutocompleteV2.Active, sQuery: kotlin.String? = null, acceptLanguage: HeaderAcceptLanguage? = null) : EzsignfoldertypeGetAutocompleteV2Response {
        val localVarResponse = ezsignfoldertypeGetAutocompleteV2WithHttpInfo(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldertypeGetAutocompleteV2Response
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
     * Retrieve Ezsignfoldertypes and IDs
     * Get the list of Ezsignfoldertype to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezsignfoldertypes to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return ApiResponse<EzsignfoldertypeGetAutocompleteV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignfoldertypeGetAutocompleteV2WithHttpInfo(sSelector: SSelectorEzsignfoldertypeGetAutocompleteV2, eFilterActive: EFilterActiveEzsignfoldertypeGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderAcceptLanguage?) : ApiResponse<EzsignfoldertypeGetAutocompleteV2Response?> {
        val localVariableConfig = ezsignfoldertypeGetAutocompleteV2RequestConfig(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, EzsignfoldertypeGetAutocompleteV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignfoldertypeGetAutocompleteV2
     *
     * @param sSelector The type of Ezsignfoldertypes to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return RequestConfig
     */
    fun ezsignfoldertypeGetAutocompleteV2RequestConfig(sSelector: SSelectorEzsignfoldertypeGetAutocompleteV2, eFilterActive: EFilterActiveEzsignfoldertypeGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderAcceptLanguage?) : RequestConfig<Unit> {
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
            path = "/2/object/ezsignfoldertype/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", encodeURIComponent(sSelector.value.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter eOrderBy
     */
     enum class EOrderByEzsignfoldertypeGetListV1(val value: kotlin.String) {
         @Json(name = "pkiEzsignfoldertypeID_ASC") pkiEzsignfoldertypeID_ASC("pkiEzsignfoldertypeID_ASC"),
         @Json(name = "pkiEzsignfoldertypeID_DESC") pkiEzsignfoldertypeID_DESC("pkiEzsignfoldertypeID_DESC"),
         @Json(name = "eEzsignfoldertypePrivacylevel_ASC") eEzsignfoldertypePrivacylevel_ASC("eEzsignfoldertypePrivacylevel_ASC"),
         @Json(name = "eEzsignfoldertypePrivacylevel_DESC") eEzsignfoldertypePrivacylevel_DESC("eEzsignfoldertypePrivacylevel_DESC"),
         @Json(name = "sEzsignfoldertypeNameX_ASC") sEzsignfoldertypeNameX_ASC("sEzsignfoldertypeNameX_ASC"),
         @Json(name = "sEzsignfoldertypeNameX_DESC") sEzsignfoldertypeNameX_DESC("sEzsignfoldertypeNameX_DESC"),
         @Json(name = "bEzsignfoldertypeIsactive_ASC") bEzsignfoldertypeIsactive_ASC("bEzsignfoldertypeIsactive_ASC"),
         @Json(name = "bEzsignfoldertypeIsactive_DESC") bEzsignfoldertypeIsactive_DESC("bEzsignfoldertypeIsactive_DESC")
     }

    /**
     * Retrieve Ezsignfoldertype list
     * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsignfoldertypePrivacylevel | User&lt;br&gt;Usergroup |
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional, default to 10000)
     * @param iRowOffset  (optional, default to 0)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return EzsignfoldertypeGetListV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldertypeGetListV1(eOrderBy: EOrderByEzsignfoldertypeGetListV1? = null, iRowMax: kotlin.Int? = 10000, iRowOffset: kotlin.Int? = 0, acceptLanguage: HeaderAcceptLanguage? = null, sFilter: kotlin.String? = null) : EzsignfoldertypeGetListV1Response {
        val localVarResponse = ezsignfoldertypeGetListV1WithHttpInfo(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldertypeGetListV1Response
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
     * Retrieve Ezsignfoldertype list
     * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsignfoldertypePrivacylevel | User&lt;br&gt;Usergroup |
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional, default to 10000)
     * @param iRowOffset  (optional, default to 0)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return ApiResponse<EzsignfoldertypeGetListV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignfoldertypeGetListV1WithHttpInfo(eOrderBy: EOrderByEzsignfoldertypeGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderAcceptLanguage?, sFilter: kotlin.String?) : ApiResponse<EzsignfoldertypeGetListV1Response?> {
        val localVariableConfig = ezsignfoldertypeGetListV1RequestConfig(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return request<Unit, EzsignfoldertypeGetListV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignfoldertypeGetListV1
     *
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional, default to 10000)
     * @param iRowOffset  (optional, default to 0)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return RequestConfig
     */
    fun ezsignfoldertypeGetListV1RequestConfig(eOrderBy: EOrderByEzsignfoldertypeGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderAcceptLanguage?, sFilter: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/1/object/ezsignfoldertype/getList",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsignfoldertype
     * 
     * @param pkiEzsignfoldertypeID 
     * @return EzsignfoldertypeGetObjectV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldertypeGetObjectV2(pkiEzsignfoldertypeID: kotlin.Int) : EzsignfoldertypeGetObjectV2Response {
        val localVarResponse = ezsignfoldertypeGetObjectV2WithHttpInfo(pkiEzsignfoldertypeID = pkiEzsignfoldertypeID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldertypeGetObjectV2Response
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
     * Retrieve an existing Ezsignfoldertype
     * 
     * @param pkiEzsignfoldertypeID 
     * @return ApiResponse<EzsignfoldertypeGetObjectV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignfoldertypeGetObjectV2WithHttpInfo(pkiEzsignfoldertypeID: kotlin.Int) : ApiResponse<EzsignfoldertypeGetObjectV2Response?> {
        val localVariableConfig = ezsignfoldertypeGetObjectV2RequestConfig(pkiEzsignfoldertypeID = pkiEzsignfoldertypeID)

        return request<Unit, EzsignfoldertypeGetObjectV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignfoldertypeGetObjectV2
     *
     * @param pkiEzsignfoldertypeID 
     * @return RequestConfig
     */
    fun ezsignfoldertypeGetObjectV2RequestConfig(pkiEzsignfoldertypeID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/ezsignfoldertype/{pkiEzsignfoldertypeID}".replace("{"+"pkiEzsignfoldertypeID"+"}", encodeURIComponent(pkiEzsignfoldertypeID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
