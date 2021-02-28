/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.31
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxinc/eZmax-SDK-kotlin.apis

import eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusResponseMinusError
import eZmaxinc/eZmax-SDK-kotlin.models.SsprMinusResetPasswordMinusV1MinusRequest
import eZmaxinc/eZmax-SDK-kotlin.models.SsprMinusResetPasswordRequestMinusV1MinusRequest
import eZmaxinc/eZmax-SDK-kotlin.models.SsprMinusSendUsernamesMinusV1MinusRequest
import eZmaxinc/eZmax-SDK-kotlin.models.SsprMinusUnlockAccountMinusV1MinusRequest
import eZmaxinc/eZmax-SDK-kotlin.models.SsprMinusUnlockAccountRequestMinusV1MinusRequest

import eZmaxinc/eZmax-SDK-kotlin.infrastructure.ApiClient
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.ClientException
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.ClientError
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.ServerException
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.ServerError
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.MultiValueMap
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.RequestConfig
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.RequestMethod
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.ResponseType
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.Success
import eZmaxinc/eZmax-SDK-kotlin.infrastructure.toMultiValue

class ModuleSsprApi(basePath: kotlin.String = defaultBasePath) : ApiClient(basePath) {
    companion object {
        @JvmStatic
        val defaultBasePath: String by lazy {
            System.getProperties().getProperty("eZmaxinc/eZmax-SDK-kotlin.baseUrl", "https://prod.api.appcluster01.ca-central-1.ezmax.com/rest")
        }
    }

    /**
    * Reset Password Request
    * This endpoint sends an email with a link to reset the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
    * @param ssprMinusResetPasswordRequestMinusV1MinusRequest  
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ssprResetPasswordRequestV1(ssprMinusResetPasswordRequestMinusV1MinusRequest: SsprMinusResetPasswordRequestMinusV1MinusRequest) : Unit {
        val localVariableConfig = ssprResetPasswordRequestV1RequestConfig(ssprMinusResetPasswordRequestMinusV1MinusRequest = ssprMinusResetPasswordRequestMinusV1MinusRequest)

        val localVarResponse = request<Any?>(
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
    * To obtain the request config of the operation ssprResetPasswordRequestV1
    *
    * @param ssprMinusResetPasswordRequestMinusV1MinusRequest  
    * @return RequestConfig
    */
    fun ssprResetPasswordRequestV1RequestConfig(ssprMinusResetPasswordRequestMinusV1MinusRequest: SsprMinusResetPasswordRequestMinusV1MinusRequest) : RequestConfig {
        val localVariableBody: kotlin.Any? = ssprMinusResetPasswordRequestMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/1/module/sspr/resetPasswordRequest/",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Reset Password
    * This endpoint resets the user&#39;s password.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
    * @param ssprMinusResetPasswordMinusV1MinusRequest  
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ssprResetPasswordV1(ssprMinusResetPasswordMinusV1MinusRequest: SsprMinusResetPasswordMinusV1MinusRequest) : Unit {
        val localVariableConfig = ssprResetPasswordV1RequestConfig(ssprMinusResetPasswordMinusV1MinusRequest = ssprMinusResetPasswordMinusV1MinusRequest)

        val localVarResponse = request<Any?>(
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
    * To obtain the request config of the operation ssprResetPasswordV1
    *
    * @param ssprMinusResetPasswordMinusV1MinusRequest  
    * @return RequestConfig
    */
    fun ssprResetPasswordV1RequestConfig(ssprMinusResetPasswordMinusV1MinusRequest: SsprMinusResetPasswordMinusV1MinusRequest) : RequestConfig {
        val localVariableBody: kotlin.Any? = ssprMinusResetPasswordMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/1/module/sspr/resetPassword",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Send username(s)
    * This endpoint returns an email with the username(s) matching the email address provided in case of forgotten username
    * @param ssprMinusSendUsernamesMinusV1MinusRequest  
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ssprSendUsernamesV1(ssprMinusSendUsernamesMinusV1MinusRequest: SsprMinusSendUsernamesMinusV1MinusRequest) : Unit {
        val localVariableConfig = ssprSendUsernamesV1RequestConfig(ssprMinusSendUsernamesMinusV1MinusRequest = ssprMinusSendUsernamesMinusV1MinusRequest)

        val localVarResponse = request<Any?>(
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
    * To obtain the request config of the operation ssprSendUsernamesV1
    *
    * @param ssprMinusSendUsernamesMinusV1MinusRequest  
    * @return RequestConfig
    */
    fun ssprSendUsernamesV1RequestConfig(ssprMinusSendUsernamesMinusV1MinusRequest: SsprMinusSendUsernamesMinusV1MinusRequest) : RequestConfig {
        val localVariableBody: kotlin.Any? = ssprMinusSendUsernamesMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/1/module/sspr/sendUsernames",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Unlock Account Request
    * This endpoint sends an email with a link to unlock the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
    * @param ssprMinusUnlockAccountRequestMinusV1MinusRequest  
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ssprUnlockAccountRequestV1(ssprMinusUnlockAccountRequestMinusV1MinusRequest: SsprMinusUnlockAccountRequestMinusV1MinusRequest) : Unit {
        val localVariableConfig = ssprUnlockAccountRequestV1RequestConfig(ssprMinusUnlockAccountRequestMinusV1MinusRequest = ssprMinusUnlockAccountRequestMinusV1MinusRequest)

        val localVarResponse = request<Any?>(
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
    * To obtain the request config of the operation ssprUnlockAccountRequestV1
    *
    * @param ssprMinusUnlockAccountRequestMinusV1MinusRequest  
    * @return RequestConfig
    */
    fun ssprUnlockAccountRequestV1RequestConfig(ssprMinusUnlockAccountRequestMinusV1MinusRequest: SsprMinusUnlockAccountRequestMinusV1MinusRequest) : RequestConfig {
        val localVariableBody: kotlin.Any? = ssprMinusUnlockAccountRequestMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/1/module/sspr/unlockAccountRequest",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

    /**
    * Unlock Account
    * This endpoint unlocks the user account.  sEmailAddress must be set if eUserTypeSSPR &#x3D; EzsignUser  sUserLoginname must be set if eUserTypeSSPR &#x3D; Native
    * @param ssprMinusUnlockAccountMinusV1MinusRequest  
    * @return void
    * @throws UnsupportedOperationException If the API returns an informational or redirection response
    * @throws ClientException If the API returns a client error response
    * @throws ServerException If the API returns a server error response
    */
    @Throws(UnsupportedOperationException::class, ClientException::class, ServerException::class)
    fun ssprUnlockAccountV1(ssprMinusUnlockAccountMinusV1MinusRequest: SsprMinusUnlockAccountMinusV1MinusRequest) : Unit {
        val localVariableConfig = ssprUnlockAccountV1RequestConfig(ssprMinusUnlockAccountMinusV1MinusRequest = ssprMinusUnlockAccountMinusV1MinusRequest)

        val localVarResponse = request<Any?>(
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
    * To obtain the request config of the operation ssprUnlockAccountV1
    *
    * @param ssprMinusUnlockAccountMinusV1MinusRequest  
    * @return RequestConfig
    */
    fun ssprUnlockAccountV1RequestConfig(ssprMinusUnlockAccountMinusV1MinusRequest: SsprMinusUnlockAccountMinusV1MinusRequest) : RequestConfig {
        val localVariableBody: kotlin.Any? = ssprMinusUnlockAccountMinusV1MinusRequest
        val localVariableQuery: MultiValueMap = mutableMapOf()
        val localVariableHeaders: MutableMap<String, String> = mutableMapOf()
        
        val localVariableConfig = RequestConfig(
            method = RequestMethod.POST,
            path = "/1/module/sspr/unlockAccount",
            query = localVariableQuery,
            headers = localVariableHeaders,
            body = localVariableBody
        )

        return localVariableConfig
    }

}
