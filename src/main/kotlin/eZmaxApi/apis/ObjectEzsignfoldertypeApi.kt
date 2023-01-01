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

import eZmaxApi.models.CommonMinusGetAutocompleteMinusV1MinusResponse
import eZmaxApi.models.CommonMinusResponseMinusError
import eZmaxApi.models.EzsignfoldertypeMinusCreateObjectMinusV1MinusRequest
import eZmaxApi.models.EzsignfoldertypeMinusCreateObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignfoldertypeMinusEditObjectMinusV1MinusRequest
import eZmaxApi.models.EzsignfoldertypeMinusEditObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignfoldertypeMinusGetAutocompleteMinusV2MinusResponse
import eZmaxApi.models.EzsignfoldertypeMinusGetListMinusV1MinusResponse
import eZmaxApi.models.EzsignfoldertypeMinusGetObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignfoldertypeMinusGetObjectMinusV2MinusResponse
import eZmaxApi.models.HeaderMinusAcceptMinusLanguage

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
     * @param ezsignfoldertypeMinusCreateObjectMinusV1MinusRequest 
     * @return EzsignfoldertypeMinusCreateObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldertypeCreateObjectV1(ezsignfoldertypeMinusCreateObjectMinusV1MinusRequest: EzsignfoldertypeMinusCreateObjectMinusV1MinusRequest) : EzsignfoldertypeMinusCreateObjectMinusV1MinusResponse {
        val localVarResponse = ezsignfoldertypeCreateObjectV1WithHttpInfo(ezsignfoldertypeMinusCreateObjectMinusV1MinusRequest = ezsignfoldertypeMinusCreateObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldertypeMinusCreateObjectMinusV1MinusResponse
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
     * Create a new Ezsignfoldertype
     * The endpoint allows to create one or many elements at once.
     * @param ezsignfoldertypeMinusCreateObjectMinusV1MinusRequest 
     * @return ApiResponse<EzsignfoldertypeMinusCreateObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignfoldertypeCreateObjectV1WithHttpInfo(ezsignfoldertypeMinusCreateObjectMinusV1MinusRequest: EzsignfoldertypeMinusCreateObjectMinusV1MinusRequest) : ApiResponse<EzsignfoldertypeMinusCreateObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsignfoldertypeCreateObjectV1RequestConfig(ezsignfoldertypeMinusCreateObjectMinusV1MinusRequest = ezsignfoldertypeMinusCreateObjectMinusV1MinusRequest)

        return request<EzsignfoldertypeMinusCreateObjectMinusV1MinusRequest, EzsignfoldertypeMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignfoldertypeCreateObjectV1
     *
     * @param ezsignfoldertypeMinusCreateObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun ezsignfoldertypeCreateObjectV1RequestConfig(ezsignfoldertypeMinusCreateObjectMinusV1MinusRequest: EzsignfoldertypeMinusCreateObjectMinusV1MinusRequest) : RequestConfig<EzsignfoldertypeMinusCreateObjectMinusV1MinusRequest> {
        val localVariableBody = ezsignfoldertypeMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsignfoldertype",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Edit an existing Ezsignfoldertype
     * 
     * @param pkiEzsignfoldertypeID 
     * @param ezsignfoldertypeMinusEditObjectMinusV1MinusRequest 
     * @return EzsignfoldertypeMinusEditObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldertypeEditObjectV1(pkiEzsignfoldertypeID: kotlin.Int, ezsignfoldertypeMinusEditObjectMinusV1MinusRequest: EzsignfoldertypeMinusEditObjectMinusV1MinusRequest) : EzsignfoldertypeMinusEditObjectMinusV1MinusResponse {
        val localVarResponse = ezsignfoldertypeEditObjectV1WithHttpInfo(pkiEzsignfoldertypeID = pkiEzsignfoldertypeID, ezsignfoldertypeMinusEditObjectMinusV1MinusRequest = ezsignfoldertypeMinusEditObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldertypeMinusEditObjectMinusV1MinusResponse
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
     * Edit an existing Ezsignfoldertype
     * 
     * @param pkiEzsignfoldertypeID 
     * @param ezsignfoldertypeMinusEditObjectMinusV1MinusRequest 
     * @return ApiResponse<EzsignfoldertypeMinusEditObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignfoldertypeEditObjectV1WithHttpInfo(pkiEzsignfoldertypeID: kotlin.Int, ezsignfoldertypeMinusEditObjectMinusV1MinusRequest: EzsignfoldertypeMinusEditObjectMinusV1MinusRequest) : ApiResponse<EzsignfoldertypeMinusEditObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsignfoldertypeEditObjectV1RequestConfig(pkiEzsignfoldertypeID = pkiEzsignfoldertypeID, ezsignfoldertypeMinusEditObjectMinusV1MinusRequest = ezsignfoldertypeMinusEditObjectMinusV1MinusRequest)

        return request<EzsignfoldertypeMinusEditObjectMinusV1MinusRequest, EzsignfoldertypeMinusEditObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignfoldertypeEditObjectV1
     *
     * @param pkiEzsignfoldertypeID 
     * @param ezsignfoldertypeMinusEditObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun ezsignfoldertypeEditObjectV1RequestConfig(pkiEzsignfoldertypeID: kotlin.Int, ezsignfoldertypeMinusEditObjectMinusV1MinusRequest: EzsignfoldertypeMinusEditObjectMinusV1MinusRequest) : RequestConfig<EzsignfoldertypeMinusEditObjectMinusV1MinusRequest> {
        val localVariableBody = ezsignfoldertypeMinusEditObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/ezsignfoldertype/{pkiEzsignfoldertypeID}".replace("{"+"pkiEzsignfoldertypeID"+"}", encodeURIComponent(pkiEzsignfoldertypeID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelector_ezsignfoldertypeGetAutocompleteV1(val value: kotlin.String) {
         @Json(name = "Active") Active("Active"),
         @Json(name = "All") All("All")
     }

    /**
     * enum for parameter eFilterActive
     */
     enum class EFilterActive_ezsignfoldertypeGetAutocompleteV1(val value: kotlin.String) {
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
     * @return CommonMinusGetAutocompleteMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun ezsignfoldertypeGetAutocompleteV1(sSelector: SSelector_ezsignfoldertypeGetAutocompleteV1, eFilterActive: EFilterActive_ezsignfoldertypeGetAutocompleteV1? = EFilterActive_ezsignfoldertypeGetAutocompleteV1.Active, sQuery: kotlin.String? = null, acceptLanguage: HeaderMinusAcceptMinusLanguage? = null) : CommonMinusGetAutocompleteMinusV1MinusResponse {
        @Suppress("DEPRECATION")
        val localVarResponse = ezsignfoldertypeGetAutocompleteV1WithHttpInfo(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

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
     * Retrieve Ezsignfoldertypes and IDs
     * Get the list of Ezsignfoldertypes to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezsignfoldertypes to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return ApiResponse<CommonMinusGetAutocompleteMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun ezsignfoldertypeGetAutocompleteV1WithHttpInfo(sSelector: SSelector_ezsignfoldertypeGetAutocompleteV1, eFilterActive: EFilterActive_ezsignfoldertypeGetAutocompleteV1?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : ApiResponse<CommonMinusGetAutocompleteMinusV1MinusResponse?> {
        @Suppress("DEPRECATION")
        val localVariableConfig = ezsignfoldertypeGetAutocompleteV1RequestConfig(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, CommonMinusGetAutocompleteMinusV1MinusResponse>(
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
    fun ezsignfoldertypeGetAutocompleteV1RequestConfig(sSelector: SSelector_ezsignfoldertypeGetAutocompleteV1, eFilterActive: EFilterActive_ezsignfoldertypeGetAutocompleteV1?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (eFilterActive != null) {
                    put("eFilterActive", listOf(eFilterActive.toString()))
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
            body = localVariableBody
        )
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelector_ezsignfoldertypeGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "Active") Active("Active"),
         @Json(name = "All") All("All")
     }

    /**
     * enum for parameter eFilterActive
     */
     enum class EFilterActive_ezsignfoldertypeGetAutocompleteV2(val value: kotlin.String) {
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
     * @return EzsignfoldertypeMinusGetAutocompleteMinusV2MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldertypeGetAutocompleteV2(sSelector: SSelector_ezsignfoldertypeGetAutocompleteV2, eFilterActive: EFilterActive_ezsignfoldertypeGetAutocompleteV2? = EFilterActive_ezsignfoldertypeGetAutocompleteV2.Active, sQuery: kotlin.String? = null, acceptLanguage: HeaderMinusAcceptMinusLanguage? = null) : EzsignfoldertypeMinusGetAutocompleteMinusV2MinusResponse {
        val localVarResponse = ezsignfoldertypeGetAutocompleteV2WithHttpInfo(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldertypeMinusGetAutocompleteMinusV2MinusResponse
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
     * Retrieve Ezsignfoldertypes and IDs
     * Get the list of Ezsignfoldertype to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezsignfoldertypes to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return ApiResponse<EzsignfoldertypeMinusGetAutocompleteMinusV2MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignfoldertypeGetAutocompleteV2WithHttpInfo(sSelector: SSelector_ezsignfoldertypeGetAutocompleteV2, eFilterActive: EFilterActive_ezsignfoldertypeGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : ApiResponse<EzsignfoldertypeMinusGetAutocompleteMinusV2MinusResponse?> {
        val localVariableConfig = ezsignfoldertypeGetAutocompleteV2RequestConfig(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, EzsignfoldertypeMinusGetAutocompleteMinusV2MinusResponse>(
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
    fun ezsignfoldertypeGetAutocompleteV2RequestConfig(sSelector: SSelector_ezsignfoldertypeGetAutocompleteV2, eFilterActive: EFilterActive_ezsignfoldertypeGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (eFilterActive != null) {
                    put("eFilterActive", listOf(eFilterActive.toString()))
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
            body = localVariableBody
        )
    }

    /**
     * enum for parameter eOrderBy
     */
     enum class EOrderBy_ezsignfoldertypeGetListV1(val value: kotlin.String) {
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
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return EzsignfoldertypeMinusGetListMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldertypeGetListV1(eOrderBy: EOrderBy_ezsignfoldertypeGetListV1? = null, iRowMax: kotlin.Int? = null, iRowOffset: kotlin.Int? = null, acceptLanguage: HeaderMinusAcceptMinusLanguage? = null, sFilter: kotlin.String? = null) : EzsignfoldertypeMinusGetListMinusV1MinusResponse {
        val localVarResponse = ezsignfoldertypeGetListV1WithHttpInfo(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

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
     * Retrieve Ezsignfoldertype list
     * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsignfoldertypePrivacylevel | User&lt;br&gt;Usergroup |
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return ApiResponse<EzsignfoldertypeMinusGetListMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignfoldertypeGetListV1WithHttpInfo(eOrderBy: EOrderBy_ezsignfoldertypeGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderMinusAcceptMinusLanguage?, sFilter: kotlin.String?) : ApiResponse<EzsignfoldertypeMinusGetListMinusV1MinusResponse?> {
        val localVariableConfig = ezsignfoldertypeGetListV1RequestConfig(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return request<Unit, EzsignfoldertypeMinusGetListMinusV1MinusResponse>(
            localVariableConfig
        )
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
    fun ezsignfoldertypeGetListV1RequestConfig(eOrderBy: EOrderBy_ezsignfoldertypeGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderMinusAcceptMinusLanguage?, sFilter: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
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
            path = "/1/object/ezsignfoldertype/getList",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsignfoldertype
     * 
     * @param pkiEzsignfoldertypeID 
     * @return EzsignfoldertypeMinusGetObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun ezsignfoldertypeGetObjectV1(pkiEzsignfoldertypeID: kotlin.Int) : EzsignfoldertypeMinusGetObjectMinusV1MinusResponse {
        @Suppress("DEPRECATION")
        val localVarResponse = ezsignfoldertypeGetObjectV1WithHttpInfo(pkiEzsignfoldertypeID = pkiEzsignfoldertypeID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldertypeMinusGetObjectMinusV1MinusResponse
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
     * Retrieve an existing Ezsignfoldertype
     * 
     * @param pkiEzsignfoldertypeID 
     * @return ApiResponse<EzsignfoldertypeMinusGetObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    @Deprecated(message = "This operation is deprecated.")
    fun ezsignfoldertypeGetObjectV1WithHttpInfo(pkiEzsignfoldertypeID: kotlin.Int) : ApiResponse<EzsignfoldertypeMinusGetObjectMinusV1MinusResponse?> {
        @Suppress("DEPRECATION")
        val localVariableConfig = ezsignfoldertypeGetObjectV1RequestConfig(pkiEzsignfoldertypeID = pkiEzsignfoldertypeID)

        return request<Unit, EzsignfoldertypeMinusGetObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsignfoldertypeGetObjectV1
     *
     * @param pkiEzsignfoldertypeID 
     * @return RequestConfig
     */
    @Deprecated(message = "This operation is deprecated.")
    fun ezsignfoldertypeGetObjectV1RequestConfig(pkiEzsignfoldertypeID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignfoldertype/{pkiEzsignfoldertypeID}".replace("{"+"pkiEzsignfoldertypeID"+"}", encodeURIComponent(pkiEzsignfoldertypeID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsignfoldertype
     * 
     * @param pkiEzsignfoldertypeID 
     * @return EzsignfoldertypeMinusGetObjectMinusV2MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldertypeGetObjectV2(pkiEzsignfoldertypeID: kotlin.Int) : EzsignfoldertypeMinusGetObjectMinusV2MinusResponse {
        val localVarResponse = ezsignfoldertypeGetObjectV2WithHttpInfo(pkiEzsignfoldertypeID = pkiEzsignfoldertypeID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldertypeMinusGetObjectMinusV2MinusResponse
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
     * Retrieve an existing Ezsignfoldertype
     * 
     * @param pkiEzsignfoldertypeID 
     * @return ApiResponse<EzsignfoldertypeMinusGetObjectMinusV2MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignfoldertypeGetObjectV2WithHttpInfo(pkiEzsignfoldertypeID: kotlin.Int) : ApiResponse<EzsignfoldertypeMinusGetObjectMinusV2MinusResponse?> {
        val localVariableConfig = ezsignfoldertypeGetObjectV2RequestConfig(pkiEzsignfoldertypeID = pkiEzsignfoldertypeID)

        return request<Unit, EzsignfoldertypeMinusGetObjectMinusV2MinusResponse>(
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
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
