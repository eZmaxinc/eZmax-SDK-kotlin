/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.11
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

import eZmaxApi.models.CommonMinusGetAutocompleteMinusV1MinusResponse
import eZmaxApi.models.CommonMinusResponseMinusError
import eZmaxApi.models.EzsigntemplateMinusCreateObjectMinusV1MinusRequest
import eZmaxApi.models.EzsigntemplateMinusCreateObjectMinusV1MinusResponse
import eZmaxApi.models.EzsigntemplateMinusDeleteObjectMinusV1MinusResponse
import eZmaxApi.models.EzsigntemplateMinusEditObjectMinusV1MinusRequest
import eZmaxApi.models.EzsigntemplateMinusEditObjectMinusV1MinusResponse
import eZmaxApi.models.EzsigntemplateMinusGetAutocompleteMinusV2MinusResponse
import eZmaxApi.models.EzsigntemplateMinusGetListMinusV1MinusResponse
import eZmaxApi.models.EzsigntemplateMinusGetObjectMinusV1MinusResponse
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

class ObjectEzsigntemplateApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Ezsigntemplate
     * The endpoint allows to create one or many elements at once.
     * @param ezsigntemplateMinusCreateObjectMinusV1MinusRequest 
     * @return EzsigntemplateMinusCreateObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplateCreateObjectV1(ezsigntemplateMinusCreateObjectMinusV1MinusRequest: EzsigntemplateMinusCreateObjectMinusV1MinusRequest) : EzsigntemplateMinusCreateObjectMinusV1MinusResponse {
        val localVarResponse = ezsigntemplateCreateObjectV1WithHttpInfo(ezsigntemplateMinusCreateObjectMinusV1MinusRequest = ezsigntemplateMinusCreateObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplateMinusCreateObjectMinusV1MinusResponse
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
     * Create a new Ezsigntemplate
     * The endpoint allows to create one or many elements at once.
     * @param ezsigntemplateMinusCreateObjectMinusV1MinusRequest 
     * @return ApiResponse<EzsigntemplateMinusCreateObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplateCreateObjectV1WithHttpInfo(ezsigntemplateMinusCreateObjectMinusV1MinusRequest: EzsigntemplateMinusCreateObjectMinusV1MinusRequest) : ApiResponse<EzsigntemplateMinusCreateObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsigntemplateCreateObjectV1RequestConfig(ezsigntemplateMinusCreateObjectMinusV1MinusRequest = ezsigntemplateMinusCreateObjectMinusV1MinusRequest)

        return request<EzsigntemplateMinusCreateObjectMinusV1MinusRequest, EzsigntemplateMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplateCreateObjectV1
     *
     * @param ezsigntemplateMinusCreateObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun ezsigntemplateCreateObjectV1RequestConfig(ezsigntemplateMinusCreateObjectMinusV1MinusRequest: EzsigntemplateMinusCreateObjectMinusV1MinusRequest) : RequestConfig<EzsigntemplateMinusCreateObjectMinusV1MinusRequest> {
        val localVariableBody = ezsigntemplateMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsigntemplate",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Delete an existing Ezsigntemplate
     * 
     * @param pkiEzsigntemplateID 
     * @return EzsigntemplateMinusDeleteObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplateDeleteObjectV1(pkiEzsigntemplateID: kotlin.Int) : EzsigntemplateMinusDeleteObjectMinusV1MinusResponse {
        val localVarResponse = ezsigntemplateDeleteObjectV1WithHttpInfo(pkiEzsigntemplateID = pkiEzsigntemplateID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplateMinusDeleteObjectMinusV1MinusResponse
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
     * Delete an existing Ezsigntemplate
     * 
     * @param pkiEzsigntemplateID 
     * @return ApiResponse<EzsigntemplateMinusDeleteObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplateDeleteObjectV1WithHttpInfo(pkiEzsigntemplateID: kotlin.Int) : ApiResponse<EzsigntemplateMinusDeleteObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsigntemplateDeleteObjectV1RequestConfig(pkiEzsigntemplateID = pkiEzsigntemplateID)

        return request<Unit, EzsigntemplateMinusDeleteObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplateDeleteObjectV1
     *
     * @param pkiEzsigntemplateID 
     * @return RequestConfig
     */
    fun ezsigntemplateDeleteObjectV1RequestConfig(pkiEzsigntemplateID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/ezsigntemplate/{pkiEzsigntemplateID}".replace("{"+"pkiEzsigntemplateID"+"}", pkiEzsigntemplateID.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Edit an existing Ezsigntemplate
     * 
     * @param pkiEzsigntemplateID 
     * @param ezsigntemplateMinusEditObjectMinusV1MinusRequest 
     * @return EzsigntemplateMinusEditObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplateEditObjectV1(pkiEzsigntemplateID: kotlin.Int, ezsigntemplateMinusEditObjectMinusV1MinusRequest: EzsigntemplateMinusEditObjectMinusV1MinusRequest) : EzsigntemplateMinusEditObjectMinusV1MinusResponse {
        val localVarResponse = ezsigntemplateEditObjectV1WithHttpInfo(pkiEzsigntemplateID = pkiEzsigntemplateID, ezsigntemplateMinusEditObjectMinusV1MinusRequest = ezsigntemplateMinusEditObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplateMinusEditObjectMinusV1MinusResponse
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
     * Edit an existing Ezsigntemplate
     * 
     * @param pkiEzsigntemplateID 
     * @param ezsigntemplateMinusEditObjectMinusV1MinusRequest 
     * @return ApiResponse<EzsigntemplateMinusEditObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplateEditObjectV1WithHttpInfo(pkiEzsigntemplateID: kotlin.Int, ezsigntemplateMinusEditObjectMinusV1MinusRequest: EzsigntemplateMinusEditObjectMinusV1MinusRequest) : ApiResponse<EzsigntemplateMinusEditObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsigntemplateEditObjectV1RequestConfig(pkiEzsigntemplateID = pkiEzsigntemplateID, ezsigntemplateMinusEditObjectMinusV1MinusRequest = ezsigntemplateMinusEditObjectMinusV1MinusRequest)

        return request<EzsigntemplateMinusEditObjectMinusV1MinusRequest, EzsigntemplateMinusEditObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplateEditObjectV1
     *
     * @param pkiEzsigntemplateID 
     * @param ezsigntemplateMinusEditObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun ezsigntemplateEditObjectV1RequestConfig(pkiEzsigntemplateID: kotlin.Int, ezsigntemplateMinusEditObjectMinusV1MinusRequest: EzsigntemplateMinusEditObjectMinusV1MinusRequest) : RequestConfig<EzsigntemplateMinusEditObjectMinusV1MinusRequest> {
        val localVariableBody = ezsigntemplateMinusEditObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/ezsigntemplate/{pkiEzsigntemplateID}".replace("{"+"pkiEzsigntemplateID"+"}", pkiEzsigntemplateID.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelector_ezsigntemplateGetAutocompleteV1(val value: kotlin.String) {
         @Json(name = "All") All("All")
     }

    /**
     * enum for parameter eFilterActive
     */
     enum class EFilterActive_ezsigntemplateGetAutocompleteV1(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "Active") Active("Active"),
         @Json(name = "Inactive") Inactive("Inactive")
     }

    /**
     * Retrieve Ezsigntemplate and IDs
     * Get the list of Ezsigntemplate to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezsigntemplate to return
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
    fun ezsigntemplateGetAutocompleteV1(sSelector: SSelector_ezsigntemplateGetAutocompleteV1, eFilterActive: EFilterActive_ezsigntemplateGetAutocompleteV1? = Active, sQuery: kotlin.String? = null, acceptLanguage: HeaderMinusAcceptMinusLanguage? = null) : CommonMinusGetAutocompleteMinusV1MinusResponse {
        @Suppress("DEPRECATION")
        val localVarResponse = ezsigntemplateGetAutocompleteV1WithHttpInfo(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

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
     * Retrieve Ezsigntemplate and IDs
     * Get the list of Ezsigntemplate to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezsigntemplate to return
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
    fun ezsigntemplateGetAutocompleteV1WithHttpInfo(sSelector: SSelector_ezsigntemplateGetAutocompleteV1, eFilterActive: EFilterActive_ezsigntemplateGetAutocompleteV1?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : ApiResponse<CommonMinusGetAutocompleteMinusV1MinusResponse?> {
        @Suppress("DEPRECATION")
        val localVariableConfig = ezsigntemplateGetAutocompleteV1RequestConfig(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, CommonMinusGetAutocompleteMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplateGetAutocompleteV1
     *
     * @param sSelector The type of Ezsigntemplate to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return RequestConfig
     */
    @Deprecated(message = "This operation is deprecated.")
    fun ezsigntemplateGetAutocompleteV1RequestConfig(sSelector: SSelector_ezsigntemplateGetAutocompleteV1, eFilterActive: EFilterActive_ezsigntemplateGetAutocompleteV1?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : RequestConfig<Unit> {
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
            path = "/1/object/ezsigntemplate/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", sSelector.value.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelector_ezsigntemplateGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All")
     }

    /**
     * enum for parameter eFilterActive
     */
     enum class EFilterActive_ezsigntemplateGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "Active") Active("Active"),
         @Json(name = "Inactive") Inactive("Inactive")
     }

    /**
     * Retrieve Ezsigntemplates and IDs
     * Get the list of Ezsigntemplate to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezsigntemplates to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return EzsigntemplateMinusGetAutocompleteMinusV2MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplateGetAutocompleteV2(sSelector: SSelector_ezsigntemplateGetAutocompleteV2, eFilterActive: EFilterActive_ezsigntemplateGetAutocompleteV2? = Active, sQuery: kotlin.String? = null, acceptLanguage: HeaderMinusAcceptMinusLanguage? = null) : EzsigntemplateMinusGetAutocompleteMinusV2MinusResponse {
        val localVarResponse = ezsigntemplateGetAutocompleteV2WithHttpInfo(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplateMinusGetAutocompleteMinusV2MinusResponse
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
     * Retrieve Ezsigntemplates and IDs
     * Get the list of Ezsigntemplate to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Ezsigntemplates to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return ApiResponse<EzsigntemplateMinusGetAutocompleteMinusV2MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplateGetAutocompleteV2WithHttpInfo(sSelector: SSelector_ezsigntemplateGetAutocompleteV2, eFilterActive: EFilterActive_ezsigntemplateGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : ApiResponse<EzsigntemplateMinusGetAutocompleteMinusV2MinusResponse?> {
        val localVariableConfig = ezsigntemplateGetAutocompleteV2RequestConfig(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, EzsigntemplateMinusGetAutocompleteMinusV2MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplateGetAutocompleteV2
     *
     * @param sSelector The type of Ezsigntemplates to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return RequestConfig
     */
    fun ezsigntemplateGetAutocompleteV2RequestConfig(sSelector: SSelector_ezsigntemplateGetAutocompleteV2, eFilterActive: EFilterActive_ezsigntemplateGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : RequestConfig<Unit> {
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
            path = "/2/object/ezsigntemplate/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", sSelector.value.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter eOrderBy
     */
     enum class EOrderBy_ezsigntemplateGetListV1(val value: kotlin.String) {
         @Json(name = "pkiEzsigntemplateID_ASC") pkiEzsigntemplateID_ASC("pkiEzsigntemplateID_ASC"),
         @Json(name = "pkiEzsigntemplateID_DESC") pkiEzsigntemplateID_DESC("pkiEzsigntemplateID_DESC"),
         @Json(name = "fkiTeamID_ASC") fkiTeamID_ASC("fkiTeamID_ASC"),
         @Json(name = "fkiTeamID_DESC") fkiTeamID_DESC("fkiTeamID_DESC"),
         @Json(name = "fkiEzsignfoldertypeID_ASC") fkiEzsignfoldertypeID_ASC("fkiEzsignfoldertypeID_ASC"),
         @Json(name = "fkiEzsignfoldertypeID_DESC") fkiEzsignfoldertypeID_DESC("fkiEzsignfoldertypeID_DESC"),
         @Json(name = "fkiUserIDOwner_ASC") fkiUserIDOwner_ASC("fkiUserIDOwner_ASC"),
         @Json(name = "fkiUserIDOwner_DESC") fkiUserIDOwner_DESC("fkiUserIDOwner_DESC"),
         @Json(name = "fkiLanguageID_ASC") fkiLanguageID_ASC("fkiLanguageID_ASC"),
         @Json(name = "fkiLanguageID_DESC") fkiLanguageID_DESC("fkiLanguageID_DESC"),
         @Json(name = "eEzsigntemplateType_ASC") eEzsigntemplateType_ASC("eEzsigntemplateType_ASC"),
         @Json(name = "eEzsigntemplateType_DESC") eEzsigntemplateType_DESC("eEzsigntemplateType_DESC"),
         @Json(name = "sEzsigntemplateTypedescriptionX_ASC") sEzsigntemplateTypedescriptionX_ASC("sEzsigntemplateTypedescriptionX_ASC"),
         @Json(name = "sEzsigntemplateTypedescriptionX_DESC") sEzsigntemplateTypedescriptionX_DESC("sEzsigntemplateTypedescriptionX_DESC"),
         @Json(name = "sEzsigntemplatedocumentDescription_ASC") sEzsigntemplatedocumentDescription_ASC("sEzsigntemplatedocumentDescription_ASC"),
         @Json(name = "sEzsigntemplatedocumentDescription_DESC") sEzsigntemplatedocumentDescription_DESC("sEzsigntemplatedocumentDescription_DESC"),
         @Json(name = "iEzsigntemplatedocumentPagetotal_ASC") iEzsigntemplatedocumentPagetotal_ASC("iEzsigntemplatedocumentPagetotal_ASC"),
         @Json(name = "iEzsigntemplatedocumentPagetotal_DESC") iEzsigntemplatedocumentPagetotal_DESC("iEzsigntemplatedocumentPagetotal_DESC"),
         @Json(name = "iEzsigntemplateSignaturetotal_ASC") iEzsigntemplateSignaturetotal_ASC("iEzsigntemplateSignaturetotal_ASC"),
         @Json(name = "iEzsigntemplateSignaturetotal_DESC") iEzsigntemplateSignaturetotal_DESC("iEzsigntemplateSignaturetotal_DESC")
     }

    /**
     * Retrieve Ezsigntemplate list
     * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsigntemplateType | Company&lt;br&gt;Team&lt;br&gt;User&lt;br&gt;Usergroup | 
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return EzsigntemplateMinusGetListMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplateGetListV1(eOrderBy: EOrderBy_ezsigntemplateGetListV1? = null, iRowMax: kotlin.Int? = null, iRowOffset: kotlin.Int? = null, acceptLanguage: HeaderMinusAcceptMinusLanguage? = null, sFilter: kotlin.String? = null) : EzsigntemplateMinusGetListMinusV1MinusResponse {
        val localVarResponse = ezsigntemplateGetListV1WithHttpInfo(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplateMinusGetListMinusV1MinusResponse
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
     * Retrieve Ezsigntemplate list
     * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsigntemplateType | Company&lt;br&gt;Team&lt;br&gt;User&lt;br&gt;Usergroup | 
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return ApiResponse<EzsigntemplateMinusGetListMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplateGetListV1WithHttpInfo(eOrderBy: EOrderBy_ezsigntemplateGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderMinusAcceptMinusLanguage?, sFilter: kotlin.String?) : ApiResponse<EzsigntemplateMinusGetListMinusV1MinusResponse?> {
        val localVariableConfig = ezsigntemplateGetListV1RequestConfig(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return request<Unit, EzsigntemplateMinusGetListMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplateGetListV1
     *
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return RequestConfig
     */
    fun ezsigntemplateGetListV1RequestConfig(eOrderBy: EOrderBy_ezsigntemplateGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderMinusAcceptMinusLanguage?, sFilter: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/1/object/ezsigntemplate/getList",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Ezsigntemplate
     * 
     * @param pkiEzsigntemplateID 
     * @return EzsigntemplateMinusGetObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsigntemplateGetObjectV1(pkiEzsigntemplateID: kotlin.Int) : EzsigntemplateMinusGetObjectMinusV1MinusResponse {
        val localVarResponse = ezsigntemplateGetObjectV1WithHttpInfo(pkiEzsigntemplateID = pkiEzsigntemplateID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsigntemplateMinusGetObjectMinusV1MinusResponse
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
     * Retrieve an existing Ezsigntemplate
     * 
     * @param pkiEzsigntemplateID 
     * @return ApiResponse<EzsigntemplateMinusGetObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsigntemplateGetObjectV1WithHttpInfo(pkiEzsigntemplateID: kotlin.Int) : ApiResponse<EzsigntemplateMinusGetObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsigntemplateGetObjectV1RequestConfig(pkiEzsigntemplateID = pkiEzsigntemplateID)

        return request<Unit, EzsigntemplateMinusGetObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation ezsigntemplateGetObjectV1
     *
     * @param pkiEzsigntemplateID 
     * @return RequestConfig
     */
    fun ezsigntemplateGetObjectV1RequestConfig(pkiEzsigntemplateID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsigntemplate/{pkiEzsigntemplateID}".replace("{"+"pkiEzsigntemplateID"+"}", pkiEzsigntemplateID.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
