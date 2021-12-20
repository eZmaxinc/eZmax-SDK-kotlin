/**
 * eZmax API Definition
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.4
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

import eZmaxApi.models.CommonMinusResponseMinusError
import eZmaxApi.models.EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest
import eZmaxApi.models.EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse
import eZmaxApi.models.EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse
import eZmaxApi.models.EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse

import eZmaxApi.infrastructure.ApiClient
import eZmaxApi.infrastructure.ApiResponse
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

class ObjectEzsignfoldersignerassociationApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty(ApiClient.baseUrlKey, "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
    * Create a new Ezsignfoldersignerassociation
    * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
    * @param ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest  
    * @return EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldersignerassociationCreateObjectV1(ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest>) : EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse {
        val localVarResponse = ezsignfoldersignerassociationCreateObjectV1WithHttpInfo(ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest = ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse
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
    * Create a new Ezsignfoldersignerassociation
    * The endpoint allows to create one or many elements at once.  The array can contain simple (Just the object) or compound (The object and its child) objects.  Creating compound elements allows to reduce the multiple requests to create all child objects.
    * @param ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest  
    * @return ApiResponse<EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignfoldersignerassociationCreateObjectV1WithHttpInfo(ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest>) : ApiResponse<EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsignfoldersignerassociationCreateObjectV1RequestConfig(ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest = ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest)

        return request<kotlin.collections.List<EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest>, EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation ezsignfoldersignerassociationCreateObjectV1
    *
    * @param ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest  
    * @return RequestConfig
    */
    fun ezsignfoldersignerassociationCreateObjectV1RequestConfig(ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest: kotlin.collections.List<EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest>) : RequestConfig<kotlin.collections.List<EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest>> {
        val localVariableBody = ezsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Content-Type"] = "application/json"
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.POST,
            path = "/1/object/ezsignfoldersignerassociation",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Delete an existing Ezsignfoldersignerassociation
    * 
    * @param pkiEzsignfoldersignerassociationID  
    * @return EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldersignerassociationDeleteObjectV1(pkiEzsignfoldersignerassociationID: kotlin.Int) : EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse {
        val localVarResponse = ezsignfoldersignerassociationDeleteObjectV1WithHttpInfo(pkiEzsignfoldersignerassociationID = pkiEzsignfoldersignerassociationID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse
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
    * Delete an existing Ezsignfoldersignerassociation
    * 
    * @param pkiEzsignfoldersignerassociationID  
    * @return ApiResponse<EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignfoldersignerassociationDeleteObjectV1WithHttpInfo(pkiEzsignfoldersignerassociationID: kotlin.Int) : ApiResponse<EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsignfoldersignerassociationDeleteObjectV1RequestConfig(pkiEzsignfoldersignerassociationID = pkiEzsignfoldersignerassociationID)

        return request<Unit, EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation ezsignfoldersignerassociationDeleteObjectV1
    *
    * @param pkiEzsignfoldersignerassociationID  
    * @return RequestConfig
    */
    fun ezsignfoldersignerassociationDeleteObjectV1RequestConfig(pkiEzsignfoldersignerassociationID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.DELETE,
            path = "/1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}".replace("{"+"pkiEzsignfoldersignerassociationID"+"}", "$pkiEzsignfoldersignerassociationID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Retrieve a Login Url to allow In-Person signing
    * This endpoint returns a Login Url that can be used in a browser or embedded in an I-Frame to allow in person signing.  The signer Login type must be configured as In-Person.
    * @param pkiEzsignfoldersignerassociationID  
    * @return EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldersignerassociationGetInPersonLoginUrlV1(pkiEzsignfoldersignerassociationID: kotlin.Int) : EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse {
        val localVarResponse = ezsignfoldersignerassociationGetInPersonLoginUrlV1WithHttpInfo(pkiEzsignfoldersignerassociationID = pkiEzsignfoldersignerassociationID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse
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
    * Retrieve a Login Url to allow In-Person signing
    * This endpoint returns a Login Url that can be used in a browser or embedded in an I-Frame to allow in person signing.  The signer Login type must be configured as In-Person.
    * @param pkiEzsignfoldersignerassociationID  
    * @return ApiResponse<EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignfoldersignerassociationGetInPersonLoginUrlV1WithHttpInfo(pkiEzsignfoldersignerassociationID: kotlin.Int) : ApiResponse<EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse?> {
        val localVariableConfig = ezsignfoldersignerassociationGetInPersonLoginUrlV1RequestConfig(pkiEzsignfoldersignerassociationID = pkiEzsignfoldersignerassociationID)

        return request<Unit, EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation ezsignfoldersignerassociationGetInPersonLoginUrlV1
    *
    * @param pkiEzsignfoldersignerassociationID  
    * @return RequestConfig
    */
    fun ezsignfoldersignerassociationGetInPersonLoginUrlV1RequestConfig(pkiEzsignfoldersignerassociationID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getInPersonLoginUrl".replace("{"+"pkiEzsignfoldersignerassociationID"+"}", "$pkiEzsignfoldersignerassociationID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

    /**
    * Retrieve an existing Ezsignfoldersignerassociation
    * 
    * @param pkiEzsignfoldersignerassociationID  
    * @return EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class, UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ezsignfoldersignerassociationGetObjectV1(pkiEzsignfoldersignerassociationID: kotlin.Int) : EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse {
        val localVarResponse = ezsignfoldersignerassociationGetObjectV1WithHttpInfo(pkiEzsignfoldersignerassociationID = pkiEzsignfoldersignerassociationID)

        return when (localVarResponse.responseType) {
            ResponseType.Success -> (localVarResponse as Success<*>).data as EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse
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
    * Retrieve an existing Ezsignfoldersignerassociation
    * 
    * @param pkiEzsignfoldersignerassociationID  
    * @return ApiResponse<EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse?>
    * @throws IllegalStateException If the request is not correctly configured
    * @throws IOException Rethrows the OkHttp execute method exception
    */
    @Suppress("UNCHECKED_CAST")
    @Throws(IllegalStateException::class, IOException::class)
    fun ezsignfoldersignerassociationGetObjectV1WithHttpInfo(pkiEzsignfoldersignerassociationID: kotlin.Int) : ApiResponse<EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse?> {
        val localVariableConfig = ezsignfoldersignerassociationGetObjectV1RequestConfig(pkiEzsignfoldersignerassociationID = pkiEzsignfoldersignerassociationID)

        return request<Unit, EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse>(
            localVariableConfig
        )
    }

    /**
    * To obtain the request config of the operation ezsignfoldersignerassociationGetObjectV1
    *
    * @param pkiEzsignfoldersignerassociationID  
    * @return RequestConfig
    */
    fun ezsignfoldersignerassociationGetObjectV1RequestConfig(pkiEzsignfoldersignerassociationID: kotlin.Int) : RequestConfig<Unit> {
        val localVariableBody = null
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        localVariableHeaders["Accept"] = "application/json"

        return RequestConfig(
            method = RequestMethod.GET,
            path = "/1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}".replace("{"+"pkiEzsignfoldersignerassociationID"+"}", "$pkiEzsignfoldersignerassociationID"),
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )
    }

}
