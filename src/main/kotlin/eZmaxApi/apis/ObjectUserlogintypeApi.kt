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

import eZmaxApi.models.HeaderAcceptLanguage
import eZmaxApi.models.UserlogintypeGetAutocompleteV2Response

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

class ObjectUserlogintypeApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * enum for parameter sSelector
     */
     enum class SSelectorUserlogintypeGetAutocompleteV2(val value: kotlin.String) {
         @Json(name = "All") All("All"),
         @Json(name = "Ezsignfoldertype") Ezsignfoldertype("Ezsignfoldertype"),
         @Json(name = "Ezsigntemplatepublic") Ezsigntemplatepublic("Ezsigntemplatepublic");

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
     enum class EFilterActiveUserlogintypeGetAutocompleteV2(val value: kotlin.String) {
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
     * GET /2/object/userlogintype/getAutocomplete/{sSelector}
     * Retrieve Userlogintypes and IDs
     * Get the list of Userlogintype to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Userlogintypes to return
     * @param fkiEzsignfoldertypeID  (optional)
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return UserlogintypeGetAutocompleteV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun userlogintypeGetAutocompleteV2(sSelector: SSelectorUserlogintypeGetAutocompleteV2, fkiEzsignfoldertypeID: kotlin.Int? = null, eFilterActive: EFilterActiveUserlogintypeGetAutocompleteV2? = EFilterActiveUserlogintypeGetAutocompleteV2.Active, sQuery: kotlin.String? = null, acceptLanguage: HeaderAcceptLanguage? = null) : UserlogintypeGetAutocompleteV2Response {
        val localVarResponse = userlogintypeGetAutocompleteV2WithHttpInfo(sSelector = sSelector, fkiEzsignfoldertypeID = fkiEzsignfoldertypeID, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as UserlogintypeGetAutocompleteV2Response
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
     * GET /2/object/userlogintype/getAutocomplete/{sSelector}
     * Retrieve Userlogintypes and IDs
     * Get the list of Userlogintype to be used in a dropdown or autocomplete control.
     * @param sSelector The type of Userlogintypes to return
     * @param fkiEzsignfoldertypeID  (optional)
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return ApiResponse<UserlogintypeGetAutocompleteV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun userlogintypeGetAutocompleteV2WithHttpInfo(sSelector: SSelectorUserlogintypeGetAutocompleteV2, fkiEzsignfoldertypeID: kotlin.Int?, eFilterActive: EFilterActiveUserlogintypeGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderAcceptLanguage?) : ApiResponse<UserlogintypeGetAutocompleteV2Response?> {
        val localVariableConfig = userlogintypeGetAutocompleteV2RequestConfig(sSelector = sSelector, fkiEzsignfoldertypeID = fkiEzsignfoldertypeID, eFilterActive = eFilterActive, sQuery = sQuery, acceptLanguage = acceptLanguage)

        return request<Unit, UserlogintypeGetAutocompleteV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation userlogintypeGetAutocompleteV2
     *
     * @param sSelector The type of Userlogintypes to return
     * @param fkiEzsignfoldertypeID  (optional)
     * @param eFilterActive Specify which results we want to display. (optional, default to Active)
     * @param sQuery Allow to filter the returned results (optional)
     * @param acceptLanguage  (optional)
     * @return RequestConfig
     */
    fun userlogintypeGetAutocompleteV2RequestConfig(sSelector: SSelectorUserlogintypeGetAutocompleteV2, fkiEzsignfoldertypeID: kotlin.Int?, eFilterActive: EFilterActiveUserlogintypeGetAutocompleteV2?, sQuery: kotlin.String?, acceptLanguage: HeaderAcceptLanguage?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                if (fkiEzsignfoldertypeID != null) {
                    put("fkiEzsignfoldertypeID", listOf(fkiEzsignfoldertypeID.toString()))
                }
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
            path = "/2/object/userlogintype/getAutocomplete/{sSelector}".replace("{"+"sSelector"+"}", encodeURIComponent(sSelector.value.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
