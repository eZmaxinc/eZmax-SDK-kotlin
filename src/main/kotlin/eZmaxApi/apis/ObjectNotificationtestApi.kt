/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
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
import eZmaxApi.models.NotificationtestMinusGetElementsMinusV1MinusResponse

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

class ObjectNotificationtestApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Retrieve an existing Notificationtest&#39;s Elements
     * 
     * @param pkiNotificationtestID 
     * @return NotificationtestMinusGetElementsMinusV1MinusResponse
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun notificationtestGetElementsV1(pkiNotificationtestID: kotlin.Int) : NotificationtestMinusGetElementsMinusV1MinusResponse {
        val localVarResponse = notificationtestGetElementsV1WithHttpInfo(pkiNotificationtestID = pkiNotificationtestID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as NotificationtestMinusGetElementsMinusV1MinusResponse
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
     * Retrieve an existing Notificationtest&#39;s Elements
     * 
     * @param pkiNotificationtestID 
     * @return ApiResponse<NotificationtestMinusGetElementsMinusV1MinusResponse?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun notificationtestGetElementsV1WithHttpInfo(pkiNotificationtestID: kotlin.Int) : ApiResponse<NotificationtestMinusGetElementsMinusV1MinusResponse?> {
        val localVariableConfig = notificationtestGetElementsV1RequestConfig(pkiNotificationtestID = pkiNotificationtestID)

        return request<Unit, NotificationtestMinusGetElementsMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation notificationtestGetElementsV1
     *
     * @param pkiNotificationtestID 
     * @return RequestConfig
     */
    fun notificationtestGetElementsV1RequestConfig(pkiNotificationtestID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/notificationtest/{pkiNotificationtestID}/getElements".replace("{"+"pkiNotificationtestID"+"}", pkiNotificationtestID.toString()),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
