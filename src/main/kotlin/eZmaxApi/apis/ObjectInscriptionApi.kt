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

import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.InscriptionGetAttachmentsV1Response
import eZmaxApi.models.InscriptionGetCommunicationCountV1Response
import eZmaxApi.models.InscriptionGetCommunicationListV1Response
import eZmaxApi.models.InscriptionGetCommunicationrecipientsV1Response
import eZmaxApi.models.InscriptionGetCommunicationsendersV1Response

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

class ObjectInscriptionApi(basePath: kotlin.String = defaultBasePath, client: Call.Factory = ApiClient.defaultClient) : ApiClient(basePath, client) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
     * GET /1/object/inscription/{pkiInscriptionID}/getAttachments
     * Retrieve Inscription&#39;s Attachments
     * 
     * @param pkiInscriptionID 
     * @return InscriptionGetAttachmentsV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun inscriptionGetAttachmentsV1(pkiInscriptionID: kotlin.Int) : InscriptionGetAttachmentsV1Response {
        val localVarResponse = inscriptionGetAttachmentsV1WithHttpInfo(pkiInscriptionID = pkiInscriptionID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as InscriptionGetAttachmentsV1Response
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
     * GET /1/object/inscription/{pkiInscriptionID}/getAttachments
     * Retrieve Inscription&#39;s Attachments
     * 
     * @param pkiInscriptionID 
     * @return ApiResponse<InscriptionGetAttachmentsV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun inscriptionGetAttachmentsV1WithHttpInfo(pkiInscriptionID: kotlin.Int) : ApiResponse<InscriptionGetAttachmentsV1Response?> {
        val localVariableConfig = inscriptionGetAttachmentsV1RequestConfig(pkiInscriptionID = pkiInscriptionID)

        return request<Unit, InscriptionGetAttachmentsV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation inscriptionGetAttachmentsV1
     *
     * @param pkiInscriptionID 
     * @return RequestConfig
     */
    fun inscriptionGetAttachmentsV1RequestConfig(pkiInscriptionID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/inscription/{pkiInscriptionID}/getAttachments".replace("{"+"pkiInscriptionID"+"}", encodeURIComponent(pkiInscriptionID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * GET /1/object/inscription/{pkiInscriptionID}/getCommunicationCount
     * Retrieve Communication count
     * 
     * @param pkiInscriptionID 
     * @return InscriptionGetCommunicationCountV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun inscriptionGetCommunicationCountV1(pkiInscriptionID: kotlin.Int) : InscriptionGetCommunicationCountV1Response {
        val localVarResponse = inscriptionGetCommunicationCountV1WithHttpInfo(pkiInscriptionID = pkiInscriptionID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as InscriptionGetCommunicationCountV1Response
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
     * GET /1/object/inscription/{pkiInscriptionID}/getCommunicationCount
     * Retrieve Communication count
     * 
     * @param pkiInscriptionID 
     * @return ApiResponse<InscriptionGetCommunicationCountV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun inscriptionGetCommunicationCountV1WithHttpInfo(pkiInscriptionID: kotlin.Int) : ApiResponse<InscriptionGetCommunicationCountV1Response?> {
        val localVariableConfig = inscriptionGetCommunicationCountV1RequestConfig(pkiInscriptionID = pkiInscriptionID)

        return request<Unit, InscriptionGetCommunicationCountV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation inscriptionGetCommunicationCountV1
     *
     * @param pkiInscriptionID 
     * @return RequestConfig
     */
    fun inscriptionGetCommunicationCountV1RequestConfig(pkiInscriptionID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/inscription/{pkiInscriptionID}/getCommunicationCount".replace("{"+"pkiInscriptionID"+"}", encodeURIComponent(pkiInscriptionID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * GET /1/object/inscription/{pkiInscriptionID}/getCommunicationList
     * Retrieve Communication list
     * 
     * @param pkiInscriptionID 
     * @return InscriptionGetCommunicationListV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun inscriptionGetCommunicationListV1(pkiInscriptionID: kotlin.Int) : InscriptionGetCommunicationListV1Response {
        val localVarResponse = inscriptionGetCommunicationListV1WithHttpInfo(pkiInscriptionID = pkiInscriptionID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as InscriptionGetCommunicationListV1Response
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
     * GET /1/object/inscription/{pkiInscriptionID}/getCommunicationList
     * Retrieve Communication list
     * 
     * @param pkiInscriptionID 
     * @return ApiResponse<InscriptionGetCommunicationListV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun inscriptionGetCommunicationListV1WithHttpInfo(pkiInscriptionID: kotlin.Int) : ApiResponse<InscriptionGetCommunicationListV1Response?> {
        val localVariableConfig = inscriptionGetCommunicationListV1RequestConfig(pkiInscriptionID = pkiInscriptionID)

        return request<Unit, InscriptionGetCommunicationListV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation inscriptionGetCommunicationListV1
     *
     * @param pkiInscriptionID 
     * @return RequestConfig
     */
    fun inscriptionGetCommunicationListV1RequestConfig(pkiInscriptionID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/inscription/{pkiInscriptionID}/getCommunicationList".replace("{"+"pkiInscriptionID"+"}", encodeURIComponent(pkiInscriptionID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * GET /1/object/inscription/{pkiInscriptionID}/getCommunicationrecipients
     * Retrieve Inscription&#39;s Communicationrecipient
     * 
     * @param pkiInscriptionID 
     * @return InscriptionGetCommunicationrecipientsV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun inscriptionGetCommunicationrecipientsV1(pkiInscriptionID: kotlin.Int) : InscriptionGetCommunicationrecipientsV1Response {
        val localVarResponse = inscriptionGetCommunicationrecipientsV1WithHttpInfo(pkiInscriptionID = pkiInscriptionID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as InscriptionGetCommunicationrecipientsV1Response
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
     * GET /1/object/inscription/{pkiInscriptionID}/getCommunicationrecipients
     * Retrieve Inscription&#39;s Communicationrecipient
     * 
     * @param pkiInscriptionID 
     * @return ApiResponse<InscriptionGetCommunicationrecipientsV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun inscriptionGetCommunicationrecipientsV1WithHttpInfo(pkiInscriptionID: kotlin.Int) : ApiResponse<InscriptionGetCommunicationrecipientsV1Response?> {
        val localVariableConfig = inscriptionGetCommunicationrecipientsV1RequestConfig(pkiInscriptionID = pkiInscriptionID)

        return request<Unit, InscriptionGetCommunicationrecipientsV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation inscriptionGetCommunicationrecipientsV1
     *
     * @param pkiInscriptionID 
     * @return RequestConfig
     */
    fun inscriptionGetCommunicationrecipientsV1RequestConfig(pkiInscriptionID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/inscription/{pkiInscriptionID}/getCommunicationrecipients".replace("{"+"pkiInscriptionID"+"}", encodeURIComponent(pkiInscriptionID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }

    /**
     * GET /1/object/inscription/{pkiInscriptionID}/getCommunicationsenders
     * Retrieve Inscription&#39;s Communicationsender
     * 
     * @param pkiInscriptionID 
     * @return InscriptionGetCommunicationsendersV1Response
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     * @throws UnsupportedOperationException If the API returns an informational or redirection response
     * @throws ClientException If the API returns a client error response
     * @throws ServerException If the API returns a server error response
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun inscriptionGetCommunicationsendersV1(pkiInscriptionID: kotlin.Int) : InscriptionGetCommunicationsendersV1Response {
        val localVarResponse = inscriptionGetCommunicationsendersV1WithHttpInfo(pkiInscriptionID = pkiInscriptionID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as InscriptionGetCommunicationsendersV1Response
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
     * GET /1/object/inscription/{pkiInscriptionID}/getCommunicationsenders
     * Retrieve Inscription&#39;s Communicationsender
     * 
     * @param pkiInscriptionID 
     * @return ApiResponse<InscriptionGetCommunicationsendersV1Response?>
     * @throws IllegalStateException If the request is not correctly configured
     * @throws IOException Rethrows the OkHttp execute method exception
     */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun inscriptionGetCommunicationsendersV1WithHttpInfo(pkiInscriptionID: kotlin.Int) : ApiResponse<InscriptionGetCommunicationsendersV1Response?> {
        val localVariableConfig = inscriptionGetCommunicationsendersV1RequestConfig(pkiInscriptionID = pkiInscriptionID)

        return request<Unit, InscriptionGetCommunicationsendersV1Response>(
            localVariableConfig
        )
    }

    /**
     * To obtain the request config of the operation inscriptionGetCommunicationsendersV1
     *
     * @param pkiInscriptionID 
     * @return RequestConfig
     */
    fun inscriptionGetCommunicationsendersV1RequestConfig(pkiInscriptionID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/inscription/{pkiInscriptionID}/getCommunicationsenders".replace("{"+"pkiInscriptionID"+"}", encodeURIComponent(pkiInscriptionID.toString())),
            query = localVariableQuery,
            headers = localVariableHeaders,
            requiresAuthentication = true,
            body = localVariableBody
        )
    }


    private fun encodeURIComponent(uriComponent: kotlin.String): kotlin.String =
        HttpUrl.Builder().scheme("http").host("localhost").addPathSegment(uriComponent).build().encodedPathSegments[0]
}
