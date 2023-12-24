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

import eZmaxApi.models.AttachmentGetAttachmentlogsV1Response
import eZmaxApi.models.AttachmentGetDownloadUrlV1Response
import eZmaxApi.models.CommonResponseError

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

class ObjectAttachmentApi(basePath: kotlin.String = defaultBasePath, client: OkHttpClient = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * Retrieve the content
     * Using this endpoint, you can retrieve the content of an attachment.
     * @param pkiAttachmentID 
     * @return void
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun attachmentDownloadV1(pkiAttachmentID: kotlin.Int) : Unit {
        val localVarResponse = attachmentDownloadV1WithHttpInfo(pkiAttachmentID = pkiAttachmentID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> Unit
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
     * Retrieve the content
     * Using this endpoint, you can retrieve the content of an attachment.
     * @param pkiAttachmentID 
     * @return ApiResponse<Unit?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Throws(IllegalStateException::class, IOException::class)
    fun attachmentDownloadV1WithHttpInfo(pkiAttachmentID: kotlin.Int) : ApiResponse<Unit?> {
        val localVariableConfig = attachmentDownloadV1RequestConfig(pkiAttachmentID = pkiAttachmentID)

        return request<Unit, Unit>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation attachmentDownloadV1
     *
     * @param pkiAttachmentID 
     * @return RequestConfig
     */
    fun attachmentDownloadV1RequestConfig(pkiAttachmentID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/attachment/{pkiAttachmentID}/download".replace("{"+"pkiAttachmentID"+"}", encodeURIComponent(pkiAttachmentID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve the Attachmentlogs
     * Using this endpoint, you can retrieve the Attachmentlogs of an attachment.
     * @param pkiAttachmentID 
     * @return AttachmentGetAttachmentlogsV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun attachmentGetAttachmentlogsV1(pkiAttachmentID: kotlin.Int) : AttachmentGetAttachmentlogsV1Response {
        val localVarResponse = attachmentGetAttachmentlogsV1WithHttpInfo(pkiAttachmentID = pkiAttachmentID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AttachmentGetAttachmentlogsV1Response
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
     * Retrieve the Attachmentlogs
     * Using this endpoint, you can retrieve the Attachmentlogs of an attachment.
     * @param pkiAttachmentID 
     * @return ApiResponse<AttachmentGetAttachmentlogsV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun attachmentGetAttachmentlogsV1WithHttpInfo(pkiAttachmentID: kotlin.Int) : ApiResponse<AttachmentGetAttachmentlogsV1Response?> {
        val localVariableConfig = attachmentGetAttachmentlogsV1RequestConfig(pkiAttachmentID = pkiAttachmentID)

        return request<Unit, AttachmentGetAttachmentlogsV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation attachmentGetAttachmentlogsV1
     *
     * @param pkiAttachmentID 
     * @return RequestConfig
     */
    fun attachmentGetAttachmentlogsV1RequestConfig(pkiAttachmentID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/attachment/{pkiAttachmentID}/getAttachmentlogs".replace("{"+"pkiAttachmentID"+"}", encodeURIComponent(pkiAttachmentID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * Retrieve a URL to download attachments.
     * This endpoint returns an URL to download the attachment.  These links will expire after 5 minutes so the download of the file should be made soon after retrieving the link.
     * @param pkiAttachmentID 
     * @return AttachmentGetDownloadUrlV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun attachmentGetDownloadUrlV1(pkiAttachmentID: kotlin.Int) : AttachmentGetDownloadUrlV1Response {
        val localVarResponse = attachmentGetDownloadUrlV1WithHttpInfo(pkiAttachmentID = pkiAttachmentID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as AttachmentGetDownloadUrlV1Response
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
     * Retrieve a URL to download attachments.
     * This endpoint returns an URL to download the attachment.  These links will expire after 5 minutes so the download of the file should be made soon after retrieving the link.
     * @param pkiAttachmentID 
     * @return ApiResponse<AttachmentGetDownloadUrlV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun attachmentGetDownloadUrlV1WithHttpInfo(pkiAttachmentID: kotlin.Int) : ApiResponse<AttachmentGetDownloadUrlV1Response?> {
        val localVariableConfig = attachmentGetDownloadUrlV1RequestConfig(pkiAttachmentID = pkiAttachmentID)

        return request<Unit, AttachmentGetDownloadUrlV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation attachmentGetDownloadUrlV1
     *
     * @param pkiAttachmentID 
     * @return RequestConfig
     */
    fun attachmentGetDownloadUrlV1RequestConfig(pkiAttachmentID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/attachment/{pkiAttachmentID}/getDownloadUrl".replace("{"+"pkiAttachmentID"+"}", encodeURIComponent(pkiAttachmentID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}