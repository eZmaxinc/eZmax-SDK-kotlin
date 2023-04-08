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

import eZmaxApi.models.CommonMinusResponseMinusError
import eZmaxApi.models.HeaderMinusAcceptMinusLanguage
import eZmaxApi.models.PaymenttermMinusCreateObjectMinusV1MinusRequest
import eZmaxApi.models.PaymenttermMinusCreateObjectMinusV1MinusResponse
import eZmaxApi.models.PaymenttermMinusDeleteObjectMinusV1MinusResponse
import eZmaxApi.models.PaymenttermMinusEditObjectMinusV1MinusRequest
import eZmaxApi.models.PaymenttermMinusEditObjectMinusV1MinusResponse
import eZmaxApi.models.PaymenttermMinusGetAutocompleteMinusV2MinusResponse
import eZmaxApi.models.PaymenttermMinusGetListMinusV1MinusResponse
import eZmaxApi.models.PaymenttermMinusGetObjectMinusV2MinusResponse

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

class ObjectPaymenttermApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Paymentterm
     * The endpoint allows to create one or many elements at once.
     * @param paymenttermMinusCreateObjectMinusV1MinusRequest 
     * @return PaymenttermMinusCreateObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun paymenttermCreateObjectV1(paymenttermMinusCreateObjectMinusV1MinusRequest: PaymenttermMinusCreateObjectMinusV1MinusRequest) : PaymenttermMinusCreateObjectMinusV1MinusResponse {
        val localVarResponse = paymenttermCreateObjectV1WithHttpInfo(paymenttermMinusCreateObjectMinusV1MinusRequest = paymenttermMinusCreateObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaymenttermMinusCreateObjectMinusV1MinusResponse
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
     * Create a new Paymentterm
     * The endpoint allows to create one or many elements at once.
     * @param paymenttermMinusCreateObjectMinusV1MinusRequest 
     * @return ApiResponse<PaymenttermMinusCreateObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun paymenttermCreateObjectV1WithHttpInfo(paymenttermMinusCreateObjectMinusV1MinusRequest: PaymenttermMinusCreateObjectMinusV1MinusRequest) : ApiResponse<PaymenttermMinusCreateObjectMinusV1MinusResponse?> {
        val localVariableConfig = paymenttermCreateObjectV1RequestConfig(paymenttermMinusCreateObjectMinusV1MinusRequest = paymenttermMinusCreateObjectMinusV1MinusRequest)

        return request<PaymenttermMinusCreateObjectMinusV1MinusRequest, PaymenttermMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation paymenttermCreateObjectV1
     *
     * @param paymenttermMinusCreateObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun paymenttermCreateObjectV1RequestConfig(paymenttermMinusCreateObjectMinusV1MinusRequest: PaymenttermMinusCreateObjectMinusV1MinusRequest) : RequestConfig<PaymenttermMinusCreateObjectMinusV1MinusRequest> {
        val localVariableBody = paymenttermMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/paymentterm",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Delete an existing Paymentterm
     * 
     * @param pkiPaymenttermID 
     * @return PaymenttermMinusDeleteObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun paymenttermDeleteObjectV1(pkiPaymenttermID: kotlin.Int) : PaymenttermMinusDeleteObjectMinusV1MinusResponse {
        val localVarResponse = paymenttermDeleteObjectV1WithHttpInfo(pkiPaymenttermID = pkiPaymenttermID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaymenttermMinusDeleteObjectMinusV1MinusResponse
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
     * Delete an existing Paymentterm
     * 
     * @param pkiPaymenttermID 
     * @return ApiResponse<PaymenttermMinusDeleteObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun paymenttermDeleteObjectV1WithHttpInfo(pkiPaymenttermID: kotlin.Int) : ApiResponse<PaymenttermMinusDeleteObjectMinusV1MinusResponse?> {
        val localVariableConfig = paymenttermDeleteObjectV1RequestConfig(pkiPaymenttermID = pkiPaymenttermID)

        return request<Unit, PaymenttermMinusDeleteObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation paymenttermDeleteObjectV1
     *
     * @param pkiPaymenttermID 
     * @return RequestConfig
     */
    fun paymenttermDeleteObjectV1RequestConfig(pkiPaymenttermID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/paymentterm/{pkiPaymenttermID}".replace("{"+"pkiPaymenttermID"+"}", encodeURIComponent(pkiPaymenttermID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Edit an existing Paymentterm
     * 
     * @param pkiPaymenttermID 
     * @param paymenttermMinusEditObjectMinusV1MinusRequest 
     * @return PaymenttermMinusEditObjectMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun paymenttermEditObjectV1(pkiPaymenttermID: kotlin.Int, paymenttermMinusEditObjectMinusV1MinusRequest: PaymenttermMinusEditObjectMinusV1MinusRequest) : PaymenttermMinusEditObjectMinusV1MinusResponse {
        val localVarResponse = paymenttermEditObjectV1WithHttpInfo(pkiPaymenttermID = pkiPaymenttermID, paymenttermMinusEditObjectMinusV1MinusRequest = paymenttermMinusEditObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaymenttermMinusEditObjectMinusV1MinusResponse
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
     * Edit an existing Paymentterm
     * 
     * @param pkiPaymenttermID 
     * @param paymenttermMinusEditObjectMinusV1MinusRequest 
     * @return ApiResponse<PaymenttermMinusEditObjectMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun paymenttermEditObjectV1WithHttpInfo(pkiPaymenttermID: kotlin.Int, paymenttermMinusEditObjectMinusV1MinusRequest: PaymenttermMinusEditObjectMinusV1MinusRequest) : ApiResponse<PaymenttermMinusEditObjectMinusV1MinusResponse?> {
        val localVariableConfig = paymenttermEditObjectV1RequestConfig(pkiPaymenttermID = pkiPaymenttermID, paymenttermMinusEditObjectMinusV1MinusRequest = paymenttermMinusEditObjectMinusV1MinusRequest)

        return request<PaymenttermMinusEditObjectMinusV1MinusRequest, PaymenttermMinusEditObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation paymenttermEditObjectV1
     *
     * @param pkiPaymenttermID 
     * @param paymenttermMinusEditObjectMinusV1MinusRequest 
     * @return RequestConfig
     */
    fun paymenttermEditObjectV1RequestConfig(pkiPaymenttermID: kotlin.Int, paymenttermMinusEditObjectMinusV1MinusRequest: PaymenttermMinusEditObjectMinusV1MinusRequest) : RequestConfig<PaymenttermMinusEditObjectMinusV1MinusRequest> {
        val localVariableBody = paymenttermMinusEditObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/paymentterm/{pkiPaymenttermID}".replace("{"+"pkiPaymenttermID"+"}", encodeURIComponent(pkiPaymenttermID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelector_paymenttermGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All")
     }

    /**
     * enum for parameter eFilterActive
     */
     enum class EFilterActive_paymenttermGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "Active") Active("Active"),
         @Json(name = "Inactive") Inactive("Inactive")
     }

    /**
     * Retrieve Paymentterms and IDs
     * Get the list of Paymentterm to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Paymentterms to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return PaymenttermMinusGetAutocompleteMinusV2MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun paymenttermGetAutocompleteV2(sSelector: SSelector_paymenttermGetAutocompleteV2, eFilterActive: EFilterActive_paymenttermGetAutocompleteV2? = EFilterActive_paymenttermGetAutocompleteV2.Active, sQuery: kotlin.String? = null, acceptLanguage: HeaderMinusAcceptMinusLanguage? = null) : PaymenttermMinusGetAutocompleteMinusV2MinusResponse {
        val localVarResponse = paymenttermGetAutocompleteV2WithHttpInfo(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaymenttermMinusGetAutocompleteMinusV2MinusResponse
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
     * Retrieve Paymentterms and IDs
     * Get the list of Paymentterm to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Paymentterms to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return ApiResponse<PaymenttermMinusGetAutocompleteMinusV2MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun paymenttermGetAutocompleteV2WithHttpInfo(sSelector: SSelector_paymenttermGetAutocompleteV2, eFilterActive: EFilterActive_paymenttermGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : ApiResponse<PaymenttermMinusGetAutocompleteMinusV2MinusResponse?> {
        val localVariableConfig = paymenttermGetAutocompleteV2RequestConfig(sSelector = sSelector, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, PaymenttermMinusGetAutocompleteMinusV2MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation paymenttermGetAutocompleteV2
     *
     * @param sSelector The type of Paymentterms to return
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return RequestConfig
     */
    fun paymenttermGetAutocompleteV2RequestConfig(sSelector: SSelector_paymenttermGetAutocompleteV2, eFilterActive: EFilterActive_paymenttermGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderMinusAcceptMinusLanguage?) : RequestConfig<Unit> {
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
            path = "/2/object/paymentterm/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", encodeURIComponent(sSelector.value.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter eOrderBy
     */
     enum class EOrderBy_paymenttermGetListV1(val value: kotlin.String) {
         @Json(name = "pkiPaymenttermID_ASC") pkiPaymenttermID_ASC("pkiPaymenttermID_ASC"),
         @Json(name = "pkiPaymenttermID_DESC") pkiPaymenttermID_DESC("pkiPaymenttermID_DESC"),
         @Json(name = "sPaymenttermCode_ASC") sPaymenttermCode_ASC("sPaymenttermCode_ASC"),
         @Json(name = "sPaymenttermCode_DESC") sPaymenttermCode_DESC("sPaymenttermCode_DESC"),
         @Json(name = "ePaymenttermType_ASC") ePaymenttermType_ASC("ePaymenttermType_ASC"),
         @Json(name = "ePaymenttermType_DESC") ePaymenttermType_DESC("ePaymenttermType_DESC"),
         @Json(name = "iPaymenttermDay_ASC") iPaymenttermDay_ASC("iPaymenttermDay_ASC"),
         @Json(name = "iPaymenttermDay_DESC") iPaymenttermDay_DESC("iPaymenttermDay_DESC"),
         @Json(name = "sPaymenttermDescriptionX_ASC") sPaymenttermDescriptionX_ASC("sPaymenttermDescriptionX_ASC"),
         @Json(name = "sPaymenttermDescriptionX_DESC") sPaymenttermDescriptionX_DESC("sPaymenttermDescriptionX_DESC"),
         @Json(name = "bPaymenttermIsactive_ASC") bPaymenttermIsactive_ASC("bPaymenttermIsactive_ASC"),
         @Json(name = "bPaymenttermIsactive_DESC") bPaymenttermIsactive_DESC("bPaymenttermIsactive_DESC")
     }

    /**
     * Retrieve Paymentterm list
     * 
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return PaymenttermMinusGetListMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun paymenttermGetListV1(eOrderBy: EOrderBy_paymenttermGetListV1? = null, iRowMax: kotlin.Int? = null, iRowOffset: kotlin.Int? = null, acceptLanguage: HeaderMinusAcceptMinusLanguage? = null, sFilter: kotlin.String? = null) : PaymenttermMinusGetListMinusV1MinusResponse {
        val localVarResponse = paymenttermGetListV1WithHttpInfo(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaymenttermMinusGetListMinusV1MinusResponse
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
     * Retrieve Paymentterm list
     * 
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return ApiResponse<PaymenttermMinusGetListMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun paymenttermGetListV1WithHttpInfo(eOrderBy: EOrderBy_paymenttermGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderMinusAcceptMinusLanguage?, sFilter: kotlin.String?) : ApiResponse<PaymenttermMinusGetListMinusV1MinusResponse?> {
        val localVariableConfig = paymenttermGetListV1RequestConfig(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return request<Unit, PaymenttermMinusGetListMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation paymenttermGetListV1
     *
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional)
     * @param iRowOffset  (optional)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return RequestConfig
     */
    fun paymenttermGetListV1RequestConfig(eOrderBy: EOrderBy_paymenttermGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderMinusAcceptMinusLanguage?, sFilter: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/1/object/paymentterm/getList",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Paymentterm
     * 
     * @param pkiPaymenttermID 
     * @return PaymenttermMinusGetObjectMinusV2MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun paymenttermGetObjectV2(pkiPaymenttermID: kotlin.Int) : PaymenttermMinusGetObjectMinusV2MinusResponse {
        val localVarResponse = paymenttermGetObjectV2WithHttpInfo(pkiPaymenttermID = pkiPaymenttermID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as PaymenttermMinusGetObjectMinusV2MinusResponse
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
     * Retrieve an existing Paymentterm
     * 
     * @param pkiPaymenttermID 
     * @return ApiResponse<PaymenttermMinusGetObjectMinusV2MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun paymenttermGetObjectV2WithHttpInfo(pkiPaymenttermID: kotlin.Int) : ApiResponse<PaymenttermMinusGetObjectMinusV2MinusResponse?> {
        val localVariableConfig = paymenttermGetObjectV2RequestConfig(pkiPaymenttermID = pkiPaymenttermID)

        return request<Unit, PaymenttermMinusGetObjectMinusV2MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation paymenttermGetObjectV2
     *
     * @param pkiPaymenttermID 
     * @return RequestConfig
     */
    fun paymenttermGetObjectV2RequestConfig(pkiPaymenttermID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/paymentterm/{pkiPaymenttermID}".replace("{"+"pkiPaymenttermID"+"}", encodeURIComponent(pkiPaymenttermID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}