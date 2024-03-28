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

import eZmaxApi.apis.ObjectPaymenttermApi
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.HeaderAcceptLanguage
import eZmaxApi.models.PaymenttermCreateObjectV1Request
import eZmaxApi.models.PaymenttermCreateObjectV1Response
import eZmaxApi.models.PaymenttermEditObjectV1Request
import eZmaxApi.models.PaymenttermEditObjectV1Response
import eZmaxApi.models.PaymenttermGetAutocompleteV2Response
import eZmaxApi.models.PaymenttermGetListV1Response
import eZmaxApi.models.PaymenttermGetObjectV2Response

class ObjectPaymenttermApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ObjectPaymenttermApi
        //val apiInstance = ObjectPaymenttermApi()

        // to test paymenttermCreateObjectV1
        should("test paymenttermCreateObjectV1") {
            // uncomment below to test paymenttermCreateObjectV1
            //val paymenttermCreateObjectV1Request : PaymenttermCreateObjectV1Request =  // PaymenttermCreateObjectV1Request | 
            //val result : PaymenttermCreateObjectV1Response = apiInstance.paymenttermCreateObjectV1(paymenttermCreateObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test paymenttermEditObjectV1
        should("test paymenttermEditObjectV1") {
            // uncomment below to test paymenttermEditObjectV1
            //val pkiPaymenttermID : kotlin.Int = 56 // kotlin.Int | 
            //val paymenttermEditObjectV1Request : PaymenttermEditObjectV1Request =  // PaymenttermEditObjectV1Request | 
            //val result : PaymenttermEditObjectV1Response = apiInstance.paymenttermEditObjectV1(pkiPaymenttermID, paymenttermEditObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test paymenttermGetAutocompleteV2
        should("test paymenttermGetAutocompleteV2") {
            // uncomment below to test paymenttermGetAutocompleteV2
            //val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Paymentterms to return
            //val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
            //val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
            //val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
            //val result : PaymenttermGetAutocompleteV2Response = apiInstance.paymenttermGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
            //result shouldBe ("TODO")
        }

        // to test paymenttermGetListV1
        should("test paymenttermGetListV1") {
            // uncomment below to test paymenttermGetListV1
            //val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
            //val iRowMax : kotlin.Int = 56 // kotlin.Int | 
            //val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
            //val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
            //val sFilter : kotlin.String = sFilter_example // kotlin.String | 
            //val result : PaymenttermGetListV1Response = apiInstance.paymenttermGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
            //result shouldBe ("TODO")
        }

        // to test paymenttermGetObjectV2
        should("test paymenttermGetObjectV2") {
            // uncomment below to test paymenttermGetObjectV2
            //val pkiPaymenttermID : kotlin.Int = 56 // kotlin.Int | 
            //val result : PaymenttermGetObjectV2Response = apiInstance.paymenttermGetObjectV2(pkiPaymenttermID)
            //result shouldBe ("TODO")
        }

    }
}