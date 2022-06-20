/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.9
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

import eZmaxApi.models.CommonMinusResponseMinusError
import eZmaxApi.models.NotificationsectionMinusGetNotificationtestsMinusV1MinusResponse

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

class ObjectNotificationsectionApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Retrieve an existing Notificationsection&#39;s Notificationtests
     * 
     * @param pkiNotificationsectionID 
     * @param bShowHidden Whether or not to return the hidden Notificationtests
     * @return NotificationsectionMinusGetNotificationtestsMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun notificationsectionGetNotificationtestsV1(pkiNotificationsectionID: kotlin.Int, bShowHidden: kotlin.Boolean) : NotificationsectionMinusGetNotificationtestsMinusV1MinusResponse {
        val localVarResponse = notificationsectionGetNotificationtestsV1WithHttpInfo(pkiNotificationsectionID = pkiNotificationsectionID, bShowHidden = bShowHidden)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as NotificationsectionMinusGetNotificationtestsMinusV1MinusResponse
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
     * Retrieve an existing Notificationsection&#39;s Notificationtests
     * 
     * @param pkiNotificationsectionID 
     * @param bShowHidden Whether or not to return the hidden Notificationtests
     * @return ApiResponse<NotificationsectionMinusGetNotificationtestsMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun notificationsectionGetNotificationtestsV1WithHttpInfo(pkiNotificationsectionID: kotlin.Int, bShowHidden: kotlin.Boolean) : ApiResponse<NotificationsectionMinusGetNotificationtestsMinusV1MinusResponse?> {
        val localVariableConfig = notificationsectionGetNotificationtestsV1RequestConfig(pkiNotificationsectionID = pkiNotificationsectionID, bShowHidden = bShowHidden)

        return request<Unit, NotificationsectionMinusGetNotificationtestsMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation notificationsectionGetNotificationtestsV1
     *
     * @param pkiNotificationsectionID 
     * @param bShowHidden Whether or not to return the hidden Notificationtests
     * @return RequestConfig
     */
    fun notificationsectionGetNotificationtestsV1RequestConfig(pkiNotificationsectionID: kotlin.Int, bShowHidden: kotlin.Boolean) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, kotlin.collections.List<kotlin.String>>()
            .apply {
                put("bShowHidden", listOf(bShowHidden.toString()))
            }
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/notificationsection/{pkiNotificationsectionID}/getNotificationtests".replace("{"+"pkiNotificationsectionID"+"}", "$pkiNotificationsectionID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
