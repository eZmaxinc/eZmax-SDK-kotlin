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
import eZmaxApi.models.CommunicationMinusGetCountMinusV1MinusResponse

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

class ModuleCommunicationApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * enum for parameter eCommunicationObjecttype
     */
     enum class ECommunicationObjecttype_communicationGetCommunicationCountV1(val value: kotlin.String) {
         @Json(name = "Ezsignfolder") Ezsignfolder("Ezsignfolder")
     }

    /**
     * Retrieve Communication count
     * 
     * @param eCommunicationObjecttype The object type for the Communication
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (optional)
     * @return CommunicationMinusGetCountMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun communicationGetCommunicationCountV1(eCommunicationObjecttype: ECommunicationObjecttype_communicationGetCommunicationCountV1, pkiEzsignfolderID: kotlin.Int? = null) : CommunicationMinusGetCountMinusV1MinusResponse {
        val localVarResponse = communicationGetCommunicationCountV1WithHttpInfo(eCommunicationObjecttype = eCommunicationObjecttype, pkiEzsignfolderID = pkiEzsignfolderID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as CommunicationMinusGetCountMinusV1MinusResponse
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
     * Retrieve Communication count
     * 
     * @param eCommunicationObjecttype The object type for the Communication
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (optional)
     * @return ApiResponse<CommunicationMinusGetCountMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun communicationGetCommunicationCountV1WithHttpInfo(eCommunicationObjecttype: ECommunicationObjecttype_communicationGetCommunicationCountV1, pkiEzsignfolderID: kotlin.Int?) : ApiResponse<CommunicationMinusGetCountMinusV1MinusResponse?> {
        val localVariableConfig = communicationGetCommunicationCountV1RequestConfig(eCommunicationObjecttype = eCommunicationObjecttype, pkiEzsignfolderID = pkiEzsignfolderID)

        return request<Unit, CommunicationMinusGetCountMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation communicationGetCommunicationCountV1
     *
     * @param eCommunicationObjecttype The object type for the Communication
     * @param pkiEzsignfolderID The unique ID of the Ezsignfolder (optional)
     * @return RequestConfig
     */
    fun communicationGetCommunicationCountV1RequestConfig(eCommunicationObjecttype: ECommunicationObjecttype_communicationGetCommunicationCountV1, pkiEzsignfolderID: kotlin.Int?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("eCommunicationObjecttype", listOf(eCommunicationObjecttype.toString()))
                if (pkiEzsignfolderID != null) {
                    put("pkiEzsignfolderID", listOf(pkiEzsignfolderID.toString()))
                }
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/module/communication/getCount",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
