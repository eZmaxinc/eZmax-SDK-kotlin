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

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import eZmaxApi.apis.ObjectCommunicationApi
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.CommunicationSendV1Request
import eZmaxApi.models.CommunicationSendV1Response

class ObjectCommunicationApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ObjectCommunicationApi
        //val apiInstance = ObjectCommunicationApi()

        // to test communicationGetCommunicationBodyV1
        should("test communicationGetCommunicationBodyV1") {
            // uncomment below to test communicationGetCommunicationBodyV1
            //val pkiCommunicationID : kotlin.Int = 56 // kotlin.Int | 
            //apiInstance.communicationGetCommunicationBodyV1(pkiCommunicationID)
        }

        // to test communicationSendV1
        should("test communicationSendV1") {
            // uncomment below to test communicationSendV1
            //val communicationSendV1Request : CommunicationSendV1Request =  // CommunicationSendV1Request | 
            //val result : CommunicationSendV1Response = apiInstance.communicationSendV1(communicationSendV1Request)
            //result shouldBe ("TODO")
        }

    }
}
