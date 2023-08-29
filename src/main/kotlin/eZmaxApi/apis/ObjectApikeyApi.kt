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

import eZmaxApi.models.ApikeyCreateObjectV2Request
import eZmaxApi.models.ApikeyCreateObjectV2Response
import eZmaxApi.models.ApikeyEditObjectV1Request
import eZmaxApi.models.ApikeyEditObjectV1Response
import eZmaxApi.models.ApikeyEditPermissionsV1Request
import eZmaxApi.models.ApikeyEditPermissionsV1Response
import eZmaxApi.models.ApikeyGetCorsV1Response
import eZmaxApi.models.ApikeyGetListV1Response
import eZmaxApi.models.ApikeyGetObjectV2Response
import eZmaxApi.models.ApikeyGetPermissionsV1Response
import eZmaxApi.models.ApikeyGetSubnetsV1Response
import eZmaxApi.models.ApikeyRegenerateV1Request
import eZmaxApi.models.ApikeyRegenerateV1Response
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

class ObjectApikeyApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Create a new Apikey
     * The endpoint allows to create one or many elements at once.
     * @param apikeyCreateObjectV2Request 
     * @return ApikeyCreateObjectV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apikeyCreateObjectV2(apikeyCreateObjectV2Request: ApikeyCreateObjectV2Request) : ApikeyCreateObjectV2Response {
        val localVarResponse = apikeyCreateObjectV2WithHttpInfo(apikeyCreateObjectV2Request = apikeyCreateObjectV2Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApikeyCreateObjectV2Response
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
     * Create a new Apikey
     * The endpoint allows to create one or many elements at once.
     * @param apikeyCreateObjectV2Request 
     * @return ApiResponse<ApikeyCreateObjectV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apikeyCreateObjectV2WithHttpInfo(apikeyCreateObjectV2Request: ApikeyCreateObjectV2Request) : ApiResponse<ApikeyCreateObjectV2Response?> {
        val localVariableConfig = apikeyCreateObjectV2RequestConfig(apikeyCreateObjectV2Request = apikeyCreateObjectV2Request)

        return request<ApikeyCreateObjectV2Request, ApikeyCreateObjectV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apikeyCreateObjectV2
     *
     * @param apikeyCreateObjectV2Request 
     * @return RequestConfig
     */
    fun apikeyCreateObjectV2RequestConfig(apikeyCreateObjectV2Request: ApikeyCreateObjectV2Request) : RequestConfig<ApikeyCreateObjectV2Request> {
        val localVariableBody = apikeyCreateObjectV2Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/2/object/apikey",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Edit an existing Apikey
     * 
     * @param pkiApikeyID The unique ID of the Apikey
     * @param apikeyEditObjectV1Request 
     * @return ApikeyEditObjectV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apikeyEditObjectV1(pkiApikeyID: kotlin.Int, apikeyEditObjectV1Request: ApikeyEditObjectV1Request) : ApikeyEditObjectV1Response {
        val localVarResponse = apikeyEditObjectV1WithHttpInfo(pkiApikeyID = pkiApikeyID, apikeyEditObjectV1Request = apikeyEditObjectV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApikeyEditObjectV1Response
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
     * Edit an existing Apikey
     * 
     * @param pkiApikeyID The unique ID of the Apikey
     * @param apikeyEditObjectV1Request 
     * @return ApiResponse<ApikeyEditObjectV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apikeyEditObjectV1WithHttpInfo(pkiApikeyID: kotlin.Int, apikeyEditObjectV1Request: ApikeyEditObjectV1Request) : ApiResponse<ApikeyEditObjectV1Response?> {
        val localVariableConfig = apikeyEditObjectV1RequestConfig(pkiApikeyID = pkiApikeyID, apikeyEditObjectV1Request = apikeyEditObjectV1Request)

        return request<ApikeyEditObjectV1Request, ApikeyEditObjectV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apikeyEditObjectV1
     *
     * @param pkiApikeyID The unique ID of the Apikey
     * @param apikeyEditObjectV1Request 
     * @return RequestConfig
     */
    fun apikeyEditObjectV1RequestConfig(pkiApikeyID: kotlin.Int, apikeyEditObjectV1Request: ApikeyEditObjectV1Request) : RequestConfig<ApikeyEditObjectV1Request> {
        val localVariableBody = apikeyEditObjectV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/apikey/{pkiApikeyID}".replace("{"+"pkiApikeyID"+"}", encodeURIComponent(pkiApikeyID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Edit multiple Permissions
     * Using this endpoint, you can edit multiple Permissions at the same time.
     * @param pkiApikeyID 
     * @param apikeyEditPermissionsV1Request 
     * @return ApikeyEditPermissionsV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apikeyEditPermissionsV1(pkiApikeyID: kotlin.Int, apikeyEditPermissionsV1Request: ApikeyEditPermissionsV1Request) : ApikeyEditPermissionsV1Response {
        val localVarResponse = apikeyEditPermissionsV1WithHttpInfo(pkiApikeyID = pkiApikeyID, apikeyEditPermissionsV1Request = apikeyEditPermissionsV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApikeyEditPermissionsV1Response
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
     * Edit multiple Permissions
     * Using this endpoint, you can edit multiple Permissions at the same time.
     * @param pkiApikeyID 
     * @param apikeyEditPermissionsV1Request 
     * @return ApiResponse<ApikeyEditPermissionsV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apikeyEditPermissionsV1WithHttpInfo(pkiApikeyID: kotlin.Int, apikeyEditPermissionsV1Request: ApikeyEditPermissionsV1Request) : ApiResponse<ApikeyEditPermissionsV1Response?> {
        val localVariableConfig = apikeyEditPermissionsV1RequestConfig(pkiApikeyID = pkiApikeyID, apikeyEditPermissionsV1Request = apikeyEditPermissionsV1Request)

        return request<ApikeyEditPermissionsV1Request, ApikeyEditPermissionsV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apikeyEditPermissionsV1
     *
     * @param pkiApikeyID 
     * @param apikeyEditPermissionsV1Request 
     * @return RequestConfig
     */
    fun apikeyEditPermissionsV1RequestConfig(pkiApikeyID: kotlin.Int, apikeyEditPermissionsV1Request: ApikeyEditPermissionsV1Request) : RequestConfig<ApikeyEditPermissionsV1Request> {
        val localVariableBody = apikeyEditPermissionsV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.PUT,
            path = "/1/object/apikey/{pkiApikeyID}/editPermissions".replace("{"+"pkiApikeyID"+"}", encodeURIComponent(pkiApikeyID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Apikey&#39;s cors
     * 
     * @param pkiApikeyID 
     * @return ApikeyGetCorsV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apikeyGetCorsV1(pkiApikeyID: kotlin.Int) : ApikeyGetCorsV1Response {
        val localVarResponse = apikeyGetCorsV1WithHttpInfo(pkiApikeyID = pkiApikeyID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApikeyGetCorsV1Response
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
     * Retrieve an existing Apikey&#39;s cors
     * 
     * @param pkiApikeyID 
     * @return ApiResponse<ApikeyGetCorsV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apikeyGetCorsV1WithHttpInfo(pkiApikeyID: kotlin.Int) : ApiResponse<ApikeyGetCorsV1Response?> {
        val localVariableConfig = apikeyGetCorsV1RequestConfig(pkiApikeyID = pkiApikeyID)

        return request<Unit, ApikeyGetCorsV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apikeyGetCorsV1
     *
     * @param pkiApikeyID 
     * @return RequestConfig
     */
    fun apikeyGetCorsV1RequestConfig(pkiApikeyID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/apikey/{pkiApikeyID}/getCors".replace("{"+"pkiApikeyID"+"}", encodeURIComponent(pkiApikeyID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * enum for parameter eOrderBy
     */
     enum class EOrderByApikeyGetListV1(val value: kotlin.String) {
         @Json(name = "pkiApikeyID_ASC") pkiApikeyID_ASC("pkiApikeyID_ASC"),
         @Json(name = "pkiApikeyID_DESC") pkiApikeyID_DESC("pkiApikeyID_DESC"),
         @Json(name = "sApikeyDescriptionX_ASC") sApikeyDescriptionX_ASC("sApikeyDescriptionX_ASC"),
         @Json(name = "sApikeyDescriptionX_DESC") sApikeyDescriptionX_DESC("sApikeyDescriptionX_DESC"),
         @Json(name = "bApikeyIssigned_ASC") bApikeyIssigned_ASC("bApikeyIssigned_ASC"),
         @Json(name = "bApikeyIssigned_DESC") bApikeyIssigned_DESC("bApikeyIssigned_DESC"),
         @Json(name = "bApikeyIsactive_ASC") bApikeyIsactive_ASC("bApikeyIsactive_ASC"),
         @Json(name = "bApikeyIsactive_DESC") bApikeyIsactive_DESC("bApikeyIsactive_DESC"),
         @Json(name = "sUserFirstname_ASC") sUserFirstname_ASC("sUserFirstname_ASC"),
         @Json(name = "sUserFirstname_DESC") sUserFirstname_DESC("sUserFirstname_DESC"),
         @Json(name = "sUserLastname_ASC") sUserLastname_ASC("sUserLastname_ASC"),
         @Json(name = "sUserLastname_DESC") sUserLastname_DESC("sUserLastname_DESC")
     }

    /**
     * Retrieve Apikey list
     * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---|
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional, default to 10000)
     * @param iRowOffset  (optional, default to 0)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return ApikeyGetListV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apikeyGetListV1(eOrderBy: EOrderByApikeyGetListV1? = null, iRowMax: kotlin.Int? = 10000, iRowOffset: kotlin.Int? = 0, acceptLanguage: HeaderAcceptLanguage? = null, sFilter: kotlin.String? = null) : ApikeyGetListV1Response {
        val localVarResponse = apikeyGetListV1WithHttpInfo(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApikeyGetListV1Response
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
     * Retrieve Apikey list
     * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---|
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional, default to 10000)
     * @param iRowOffset  (optional, default to 0)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return ApiResponse<ApikeyGetListV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apikeyGetListV1WithHttpInfo(eOrderBy: EOrderByApikeyGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderAcceptLanguage?, sFilter: kotlin.String?) : ApiResponse<ApikeyGetListV1Response?> {
        val localVariableConfig = apikeyGetListV1RequestConfig(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        return request<Unit, ApikeyGetListV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apikeyGetListV1
     *
     * @param eOrderBy Specify how you want the results to be sorted (optional)
     * @param iRowMax  (optional, default to 10000)
     * @param iRowOffset  (optional, default to 0)
     * @param acceptLanguage  (optional)
     * @param sFilter  (optional)
     * @return RequestConfig
     */
    fun apikeyGetListV1RequestConfig(eOrderBy: EOrderByApikeyGetListV1?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderAcceptLanguage?, sFilter: kotlin.String?) : RequestConfig<Unit> {
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
            path = "/1/object/apikey/getList",
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Apikey
     * 
     * @param pkiApikeyID The unique ID of the Apikey
     * @return ApikeyGetObjectV2Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apikeyGetObjectV2(pkiApikeyID: kotlin.Int) : ApikeyGetObjectV2Response {
        val localVarResponse = apikeyGetObjectV2WithHttpInfo(pkiApikeyID = pkiApikeyID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApikeyGetObjectV2Response
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
     * Retrieve an existing Apikey
     * 
     * @param pkiApikeyID The unique ID of the Apikey
     * @return ApiResponse<ApikeyGetObjectV2Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apikeyGetObjectV2WithHttpInfo(pkiApikeyID: kotlin.Int) : ApiResponse<ApikeyGetObjectV2Response?> {
        val localVariableConfig = apikeyGetObjectV2RequestConfig(pkiApikeyID = pkiApikeyID)

        return request<Unit, ApikeyGetObjectV2Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apikeyGetObjectV2
     *
     * @param pkiApikeyID The unique ID of the Apikey
     * @return RequestConfig
     */
    fun apikeyGetObjectV2RequestConfig(pkiApikeyID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/2/object/apikey/{pkiApikeyID}".replace("{"+"pkiApikeyID"+"}", encodeURIComponent(pkiApikeyID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Apikey&#39;s Permissions
     * 
     * @param pkiApikeyID 
     * @return ApikeyGetPermissionsV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apikeyGetPermissionsV1(pkiApikeyID: kotlin.Int) : ApikeyGetPermissionsV1Response {
        val localVarResponse = apikeyGetPermissionsV1WithHttpInfo(pkiApikeyID = pkiApikeyID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApikeyGetPermissionsV1Response
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
     * Retrieve an existing Apikey&#39;s Permissions
     * 
     * @param pkiApikeyID 
     * @return ApiResponse<ApikeyGetPermissionsV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apikeyGetPermissionsV1WithHttpInfo(pkiApikeyID: kotlin.Int) : ApiResponse<ApikeyGetPermissionsV1Response?> {
        val localVariableConfig = apikeyGetPermissionsV1RequestConfig(pkiApikeyID = pkiApikeyID)

        return request<Unit, ApikeyGetPermissionsV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apikeyGetPermissionsV1
     *
     * @param pkiApikeyID 
     * @return RequestConfig
     */
    fun apikeyGetPermissionsV1RequestConfig(pkiApikeyID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/apikey/{pkiApikeyID}/getPermissions".replace("{"+"pkiApikeyID"+"}", encodeURIComponent(pkiApikeyID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve an existing Apikey&#39;s subnets
     * 
     * @param pkiApikeyID 
     * @return ApikeyGetSubnetsV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apikeyGetSubnetsV1(pkiApikeyID: kotlin.Int) : ApikeyGetSubnetsV1Response {
        val localVarResponse = apikeyGetSubnetsV1WithHttpInfo(pkiApikeyID = pkiApikeyID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApikeyGetSubnetsV1Response
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
     * Retrieve an existing Apikey&#39;s subnets
     * 
     * @param pkiApikeyID 
     * @return ApiResponse<ApikeyGetSubnetsV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apikeyGetSubnetsV1WithHttpInfo(pkiApikeyID: kotlin.Int) : ApiResponse<ApikeyGetSubnetsV1Response?> {
        val localVariableConfig = apikeyGetSubnetsV1RequestConfig(pkiApikeyID = pkiApikeyID)

        return request<Unit, ApikeyGetSubnetsV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apikeyGetSubnetsV1
     *
     * @param pkiApikeyID 
     * @return RequestConfig
     */
    fun apikeyGetSubnetsV1RequestConfig(pkiApikeyID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/apikey/{pkiApikeyID}/getSubnets".replace("{"+"pkiApikeyID"+"}", encodeURIComponent(pkiApikeyID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Regenerate the Apikey
     * 
     * @param pkiApikeyID 
     * @param apikeyRegenerateV1Request 
     * @return ApikeyRegenerateV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun apikeyRegenerateV1(pkiApikeyID: kotlin.Int, apikeyRegenerateV1Request: ApikeyRegenerateV1Request) : ApikeyRegenerateV1Response {
        val localVarResponse = apikeyRegenerateV1WithHttpInfo(pkiApikeyID = pkiApikeyID, apikeyRegenerateV1Request = apikeyRegenerateV1Request)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as ApikeyRegenerateV1Response
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
     * Regenerate the Apikey
     * 
     * @param pkiApikeyID 
     * @param apikeyRegenerateV1Request 
     * @return ApiResponse<ApikeyRegenerateV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun apikeyRegenerateV1WithHttpInfo(pkiApikeyID: kotlin.Int, apikeyRegenerateV1Request: ApikeyRegenerateV1Request) : ApiResponse<ApikeyRegenerateV1Response?> {
        val localVariableConfig = apikeyRegenerateV1RequestConfig(pkiApikeyID = pkiApikeyID, apikeyRegenerateV1Request = apikeyRegenerateV1Request)

        return request<ApikeyRegenerateV1Request, ApikeyRegenerateV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation apikeyRegenerateV1
     *
     * @param pkiApikeyID 
     * @param apikeyRegenerateV1Request 
     * @return RequestConfig
     */
    fun apikeyRegenerateV1RequestConfig(pkiApikeyID: kotlin.Int, apikeyRegenerateV1Request: ApikeyRegenerateV1Request) : RequestConfig<ApikeyRegenerateV1Request> {
        val localVariableBody = apikeyRegenerateV1Request
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/apikey/{pkiApikeyID}/regenerate".replace("{"+"pkiApikeyID"+"}", encodeURIComponent(pkiApikeyID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
