/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.2
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

import eZmaxApi.models.CommonMinusResponseMinusError
import eZmaxApi.models.EzsignfolderMinusCreateObjectMinusV1MinusRequest
import eZmaxApi.models.EzsignfolderMinusCreateObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignfolderMinusDeleteObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignfolderMinusGetFormsDataMinusV1MinusResponse
import eZmaxApi.models.EzsignfolderMinusGetListMinusV1MinusResponse
import eZmaxApi.models.EzsignfolderMinusGetObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignfolderMinusSendMinusV1MinusRequest
import eZmaxApi.models.EzsignfolderMinusSendMinusV1MinusResponse
import eZmaxApi.models.EzsignfolderMinusUnsendMinusV1MinusResponse
import eZmaxApi.models.HeaderMinusAcceptMinusLanguage

import eZmaxApi.infrastructure.ApiClient
import eZmaxApi.infrastructure.ClientException
import eZmaxApi.infrastructure.ClientError
import eZmaxApi.infrastructure.ServerException
import eZmaxApi.infrastructure.ServerError
import eZmaxApi.infrastructure.MultiValueMap
import eZmaxApi.infrastructure.RequestConfig
import eZmaxApi.infrastructure.RequestMethod
import eZmaxApi.infrastructure.ResponseType
import eZmaxApi.infrastructure.Success
import eZmaxApi.infrastructure.toMultiValue

class ObjectEzsignfolderApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("eZmaxApi.baseUrl", "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
    * Create a new Ezsignfolder
    * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
    * @param ezsignfolderMinusCreateObjectMinusV1MinusRequest  
    * @return EzsignfolderMinusCreateObjectMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfolderCreateObjectV1(ezsignfolderMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<EzsignfolderMinusCreateObjectMinusV1MinusRequest>) : EzsignfolderMinusCreateObjectMinusV1MinusResponse {
        val localVariableConfig = ezsignfolderCreateObjectV1RequestConfig(ezsignfolderMinusCreateObjectMinusV1MinusRequest = ezsignfolderMinusCreateObjectMinusV1MinusRequest)

        val localVarResponse = request<kotlin.collections.List<EzsignfolderMinusCreateObjectMinusV1MinusRequest>, EzsignfolderMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfolderMinusCreateObjectMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsignfolderCreateObjectV1
    *
    * @param ezsignfolderMinusCreateObjectMinusV1MinusRequest  
    * @return RequestConfig
    */
    fun ezsignfolderCreateObjectV1RequestConfig(ezsignfolderMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<EzsignfolderMinusCreateObjectMinusV1MinusRequest>) : RequestConfig<kotlin.collections.List<EzsignfolderMinusCreateObjectMinusV1MinusRequest>> {
        val localVariableBody = ezsignfolderMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsignfolder",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Delete an existing Ezsignfolder
    * 
    * @param pkiEzsignfolderID  
    * @return EzsignfolderMinusDeleteObjectMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfolderDeleteObjectV1(pkiEzsignfolderID: kotlin.Int) : EzsignfolderMinusDeleteObjectMinusV1MinusResponse {
        val localVariableConfig = ezsignfolderDeleteObjectV1RequestConfig(pkiEzsignfolderID = pkiEzsignfolderID)

        val localVarResponse = request<Unit, EzsignfolderMinusDeleteObjectMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfolderMinusDeleteObjectMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsignfolderDeleteObjectV1
    *
    * @param pkiEzsignfolderID  
    * @return RequestConfig
    */
    fun ezsignfolderDeleteObjectV1RequestConfig(pkiEzsignfolderID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/ezsignfolder/{pkiEzsignfolderID}".replace("{"+"pkiEzsignfolderID"+"}", "$pkiEzsignfolderID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Retrieve an existing Ezsignfolder&#39;s children IDs
    * ## ⚠️EARLY ADOPTERS WARNING  ### This endpoint is not officially released. Its definition might still change and it might not be available in every environment and region.
    * @param pkiEzsignfolderID  
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfolderGetChildrenV1(pkiEzsignfolderID: kotlin.Int) : Unit {
        val localVariableConfig = ezsignfolderGetChildrenV1RequestConfig(pkiEzsignfolderID = pkiEzsignfolderID)

        val localVarResponse = request<Unit, Unit>(
            localVariableConfig
        )

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
                throw ServerException("Server error : ${localVarError.statusCode} ${localVarError.message.orEmpty()}", localVarError.statusCode, localVarResponse)
            }
        }
    }

    /**
    * To obtain the request config of the operation ezsignfolderGetChildrenV1
    *
    * @param pkiEzsignfolderID  
    * @return RequestConfig
    */
    fun ezsignfolderGetChildrenV1RequestConfig(pkiEzsignfolderID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignfolder/{pkiEzsignfolderID}/getChildren".replace("{"+"pkiEzsignfolderID"+"}", "$pkiEzsignfolderID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Retrieve an existing Ezsignfolder&#39;s forms data
    * 
    * @param pkiEzsignfolderID  
    * @return EzsignfolderMinusGetFormsDataMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfolderGetFormsDataV1(pkiEzsignfolderID: kotlin.Int) : EzsignfolderMinusGetFormsDataMinusV1MinusResponse {
        val localVariableConfig = ezsignfolderGetFormsDataV1RequestConfig(pkiEzsignfolderID = pkiEzsignfolderID)

        val localVarResponse = request<Unit, EzsignfolderMinusGetFormsDataMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfolderMinusGetFormsDataMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsignfolderGetFormsDataV1
    *
    * @param pkiEzsignfolderID  
    * @return RequestConfig
    */
    fun ezsignfolderGetFormsDataV1RequestConfig(pkiEzsignfolderID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignfolder/{pkiEzsignfolderID}/getFormsData".replace("{"+"pkiEzsignfolderID"+"}", "$pkiEzsignfolderID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Retrieve Ezsignfolder list
    * Enum values that can be filtered in query parameter *sFilter*:  | Variable | Valid values | |---|---| | eEzsignfolderStep | Unsent&lt;br&gt;Sent&lt;br&gt;PartiallySigned&lt;br&gt;Expired&lt;br&gt;Completed&lt;br&gt;Archived | | eEzsignfoldertypePrivacylevel | User&lt;br&gt;Usergroup |
    * @param eOrderBy Specify how you want the results to be sorted (optional)
    * @param iRowMax  (optional)
    * @param iRowOffset  (optional)
    * @param acceptLanguage  (optional)
    * @param sFilter  (optional)
    * @return EzsignfolderMinusGetListMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfolderGetListV1(eOrderBy: kotlin.String?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderMinusAcceptMinusLanguage?, sFilter: kotlin.String?) : EzsignfolderMinusGetListMinusV1MinusResponse {
        val localVariableConfig = ezsignfolderGetListV1RequestConfig(eOrderBy = eOrderBy, iRowMax = iRowMax, iRowOffset = iRowOffset, acceptLanguage = acceptLanguage, sFilter = sFilter)

        val localVarResponse = request<Unit, EzsignfolderMinusGetListMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfolderMinusGetListMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsignfolderGetListV1
    *
    * @param eOrderBy Specify how you want the results to be sorted (optional)
    * @param iRowMax  (optional)
    * @param iRowOffset  (optional)
    * @param acceptLanguage  (optional)
    * @param sFilter  (optional)
    * @return RequestConfig
    */
    fun ezsignfolderGetListV1RequestConfig(eOrderBy: kotlin.String?, iRowMax: kotlin.Int?, iRowOffset: kotlin.Int?, acceptLanguage: HeaderMinusAcceptMinusLanguage?, sFilter: kotlin.String?) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf<kotlin.String, List<kotlin.String>>()
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

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignfolder/getList",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Retrieve an existing Ezsignfolder
    * ## ⚠️EARLY ADOPTERS WARNING  ### This endpoint is not officially released. Its definition might still change and it might not be available in every environment and region.
    * @param pkiEzsignfolderID  
    * @return EzsignfolderMinusGetObjectMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfolderGetObjectV1(pkiEzsignfolderID: kotlin.Int) : EzsignfolderMinusGetObjectMinusV1MinusResponse {
        val localVariableConfig = ezsignfolderGetObjectV1RequestConfig(pkiEzsignfolderID = pkiEzsignfolderID)

        val localVarResponse = request<Unit, EzsignfolderMinusGetObjectMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfolderMinusGetObjectMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsignfolderGetObjectV1
    *
    * @param pkiEzsignfolderID  
    * @return RequestConfig
    */
    fun ezsignfolderGetObjectV1RequestConfig(pkiEzsignfolderID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignfolder/{pkiEzsignfolderID}".replace("{"+"pkiEzsignfolderID"+"}", "$pkiEzsignfolderID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Send the Ezsignfolder to the signatories for signature
    * 
    * @param pkiEzsignfolderID  
    * @param ezsignfolderMinusSendMinusV1MinusRequest  
    * @return EzsignfolderMinusSendMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfolderSendV1(pkiEzsignfolderID: kotlin.Int, ezsignfolderMinusSendMinusV1MinusRequest: EzsignfolderMinusSendMinusV1MinusRequest) : EzsignfolderMinusSendMinusV1MinusResponse {
        val localVariableConfig = ezsignfolderSendV1RequestConfig(pkiEzsignfolderID = pkiEzsignfolderID, ezsignfolderMinusSendMinusV1MinusRequest = ezsignfolderMinusSendMinusV1MinusRequest)

        val localVarResponse = request<EzsignfolderMinusSendMinusV1MinusRequest, EzsignfolderMinusSendMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfolderMinusSendMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsignfolderSendV1
    *
    * @param pkiEzsignfolderID  
    * @param ezsignfolderMinusSendMinusV1MinusRequest  
    * @return RequestConfig
    */
    fun ezsignfolderSendV1RequestConfig(pkiEzsignfolderID: kotlin.Int, ezsignfolderMinusSendMinusV1MinusRequest: EzsignfolderMinusSendMinusV1MinusRequest) : RequestConfig<EzsignfolderMinusSendMinusV1MinusRequest> {
        val localVariableBody = ezsignfolderMinusSendMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsignfolder/{pkiEzsignfolderID}/send".replace("{"+"pkiEzsignfolderID"+"}", "$pkiEzsignfolderID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Unsend the Ezsignfolder
    * Once an Ezsignfolder has been sent to signatories, it cannot be modified.  Using this endpoint, you can unsend the Ezsignfolder and make it modifiable again.  Signatories will receive an email informing them the signature process was aborted and they might receive a new invitation to sign.  ⚠️ Warning: Any signature previously made by signatories on \&quot;Non-completed\&quot; Ezsigndocuments will be lost.
    * @param pkiEzsignfolderID  
    * @param body  
    * @return EzsignfolderMinusUnsendMinusV1MinusResponse
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfolderUnsendV1(pkiEzsignfolderID: kotlin.Int, body: kotlin.String) : EzsignfolderMinusUnsendMinusV1MinusResponse {
        val localVariableConfig = ezsignfolderUnsendV1RequestConfig(pkiEzsignfolderID = pkiEzsignfolderID, body = body)

        val localVarResponse = request<kotlin.String, EzsignfolderMinusUnsendMinusV1MinusResponse>(
            localVariableConfig
        )

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfolderMinusUnsendMinusV1MinusResponse
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
    * To obtain the request config of the operation ezsignfolderUnsendV1
    *
    * @param pkiEzsignfolderID  
    * @param body  
    * @return RequestConfig
    */
    fun ezsignfolderUnsendV1RequestConfig(pkiEzsignfolderID: kotlin.Int, body: kotlin.String) : RequestConfig<kotlin.String> {
        val localVariableBody = body
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsignfolder/{pkiEzsignfolderID}/unsend".replace("{"+"pkiEzsignfolderID"+"}", "$pkiEzsignfolderID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
