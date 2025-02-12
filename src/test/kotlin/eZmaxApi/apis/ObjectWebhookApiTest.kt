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

import eZmaxApi.apis.ObjectWebhookApi
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.CommonResponseErrorTooManyRequests
import eZmaxApi.models.HeaderAcceptLanguage
import eZmaxApi.models.WebhookCreateObjectV2Request
import eZmaxApi.models.WebhookCreateObjectV2Response
import eZmaxApi.models.WebhookDeleteObjectV1Response
import eZmaxApi.models.WebhookEditObjectV1Request
import eZmaxApi.models.WebhookEditObjectV1Response
import eZmaxApi.models.WebhookGetHistoryV1Response
import eZmaxApi.models.WebhookGetListV1Response
import eZmaxApi.models.WebhookGetObjectV2Response
import eZmaxApi.models.WebhookRegenerateApikeyV1Request
import eZmaxApi.models.WebhookRegenerateApikeyV1Response
import eZmaxApi.models.WebhookSendWebhookV1Request
import eZmaxApi.models.WebhookSendWebhookV1Response
import eZmaxApi.models.WebhookTestV1Response

class ObjectWebhookApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ObjectWebhookApi
        //val apiInstance = ObjectWebhookApi()

        // to test webhookCreateObjectV2
        should("test webhookCreateObjectV2") {
            // uncomment below to test webhookCreateObjectV2
            //val webhookCreateObjectV2Request : WebhookCreateObjectV2Request =  // WebhookCreateObjectV2Request | 
            //val result : WebhookCreateObjectV2Response = apiInstance.webhookCreateObjectV2(webhookCreateObjectV2Request)
            //result shouldBe ("TODO")
        }

        // to test webhookDeleteObjectV1
        should("test webhookDeleteObjectV1") {
            // uncomment below to test webhookDeleteObjectV1
            //val pkiWebhookID : kotlin.Int = 56 // kotlin.Int | 
            //val result : WebhookDeleteObjectV1Response = apiInstance.webhookDeleteObjectV1(pkiWebhookID)
            //result shouldBe ("TODO")
        }

        // to test webhookEditObjectV1
        should("test webhookEditObjectV1") {
            // uncomment below to test webhookEditObjectV1
            //val pkiWebhookID : kotlin.Int = 56 // kotlin.Int | 
            //val webhookEditObjectV1Request : WebhookEditObjectV1Request =  // WebhookEditObjectV1Request | 
            //val result : WebhookEditObjectV1Response = apiInstance.webhookEditObjectV1(pkiWebhookID, webhookEditObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test webhookGetHistoryV1
        should("test webhookGetHistoryV1") {
            // uncomment below to test webhookGetHistoryV1
            //val pkiWebhookID : kotlin.Int = 56 // kotlin.Int | 
            //val eWebhookHistoryinterval : kotlin.String = eWebhookHistoryinterval_example // kotlin.String | The number of days to return
            //val result : WebhookGetHistoryV1Response = apiInstance.webhookGetHistoryV1(pkiWebhookID, eWebhookHistoryinterval)
            //result shouldBe ("TODO")
        }

        // to test webhookGetListV1
        should("test webhookGetListV1") {
            // uncomment below to test webhookGetListV1
            //val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
            //val iRowMax : kotlin.Int = 56 // kotlin.Int | 
            //val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
            //val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
            //val sFilter : kotlin.String = sFilter_example // kotlin.String | 
            //val result : WebhookGetListV1Response = apiInstance.webhookGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
            //result shouldBe ("TODO")
        }

        // to test webhookGetObjectV2
        should("test webhookGetObjectV2") {
            // uncomment below to test webhookGetObjectV2
            //val pkiWebhookID : kotlin.Int = 56 // kotlin.Int | 
            //val result : WebhookGetObjectV2Response = apiInstance.webhookGetObjectV2(pkiWebhookID)
            //result shouldBe ("TODO")
        }

        // to test webhookRegenerateApikeyV1
        should("test webhookRegenerateApikeyV1") {
            // uncomment below to test webhookRegenerateApikeyV1
            //val pkiWebhookID : kotlin.Int = 56 // kotlin.Int | 
            //val webhookRegenerateApikeyV1Request : WebhookRegenerateApikeyV1Request =  // WebhookRegenerateApikeyV1Request | 
            //val result : WebhookRegenerateApikeyV1Response = apiInstance.webhookRegenerateApikeyV1(pkiWebhookID, webhookRegenerateApikeyV1Request)
            //result shouldBe ("TODO")
        }

        // to test webhookSendWebhookV1
        should("test webhookSendWebhookV1") {
            // uncomment below to test webhookSendWebhookV1
            //val webhookSendWebhookV1Request : WebhookSendWebhookV1Request =  // WebhookSendWebhookV1Request | 
            //val result : WebhookSendWebhookV1Response = apiInstance.webhookSendWebhookV1(webhookSendWebhookV1Request)
            //result shouldBe ("TODO")
        }

        // to test webhookTestV1
        should("test webhookTestV1") {
            // uncomment below to test webhookTestV1
            //val pkiWebhookID : kotlin.Int = 56 // kotlin.Int | 
            //val body : kotlin.Any = Object // kotlin.Any | 
            //val result : WebhookTestV1Response = apiInstance.webhookTestV1(pkiWebhookID, body)
            //result shouldBe ("TODO")
        }

    }
}
