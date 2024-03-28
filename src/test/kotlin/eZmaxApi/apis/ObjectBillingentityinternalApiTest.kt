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

import eZmaxApi.apis.ObjectBillingentityinternalApi
import eZmaxApi.models.BillingentityinternalCreateObjectV1Request
import eZmaxApi.models.BillingentityinternalCreateObjectV1Response
import eZmaxApi.models.BillingentityinternalEditObjectV1Request
import eZmaxApi.models.BillingentityinternalEditObjectV1Response
import eZmaxApi.models.BillingentityinternalGetAutocompleteV2Response
import eZmaxApi.models.BillingentityinternalGetListV1Response
import eZmaxApi.models.BillingentityinternalGetObjectV2Response
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.HeaderAcceptLanguage

class ObjectBillingentityinternalApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ObjectBillingentityinternalApi
        //val apiInstance = ObjectBillingentityinternalApi()

        // to test billingentityinternalCreateObjectV1
        should("test billingentityinternalCreateObjectV1") {
            // uncomment below to test billingentityinternalCreateObjectV1
            //val billingentityinternalCreateObjectV1Request : BillingentityinternalCreateObjectV1Request =  // BillingentityinternalCreateObjectV1Request | 
            //val result : BillingentityinternalCreateObjectV1Response = apiInstance.billingentityinternalCreateObjectV1(billingentityinternalCreateObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test billingentityinternalEditObjectV1
        should("test billingentityinternalEditObjectV1") {
            // uncomment below to test billingentityinternalEditObjectV1
            //val pkiBillingentityinternalID : kotlin.Int = 56 // kotlin.Int | 
            //val billingentityinternalEditObjectV1Request : BillingentityinternalEditObjectV1Request =  // BillingentityinternalEditObjectV1Request | 
            //val result : BillingentityinternalEditObjectV1Response = apiInstance.billingentityinternalEditObjectV1(pkiBillingentityinternalID, billingentityinternalEditObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test billingentityinternalGetAutocompleteV2
        should("test billingentityinternalGetAutocompleteV2") {
            // uncomment below to test billingentityinternalGetAutocompleteV2
            //val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Billingentityinternals to return
            //val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
            //val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
            //val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
            //val result : BillingentityinternalGetAutocompleteV2Response = apiInstance.billingentityinternalGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
            //result shouldBe ("TODO")
        }

        // to test billingentityinternalGetListV1
        should("test billingentityinternalGetListV1") {
            // uncomment below to test billingentityinternalGetListV1
            //val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
            //val iRowMax : kotlin.Int = 56 // kotlin.Int | 
            //val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
            //val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
            //val sFilter : kotlin.String = sFilter_example // kotlin.String | 
            //val result : BillingentityinternalGetListV1Response = apiInstance.billingentityinternalGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
            //result shouldBe ("TODO")
        }

        // to test billingentityinternalGetObjectV2
        should("test billingentityinternalGetObjectV2") {
            // uncomment below to test billingentityinternalGetObjectV2
            //val pkiBillingentityinternalID : kotlin.Int = 56 // kotlin.Int | 
            //val result : BillingentityinternalGetObjectV2Response = apiInstance.billingentityinternalGetObjectV2(pkiBillingentityinternalID)
            //result shouldBe ("TODO")
        }

    }
}