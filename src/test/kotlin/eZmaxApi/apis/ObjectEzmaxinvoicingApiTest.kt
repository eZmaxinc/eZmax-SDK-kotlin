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

import eZmaxApi.apis.ObjectEzmaxinvoicingApi
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.EzmaxinvoicingGetAutocompleteV2Response
import eZmaxApi.models.EzmaxinvoicingGetObjectV2Response
import eZmaxApi.models.EzmaxinvoicingGetProvisionalV1Response
import eZmaxApi.models.HeaderAcceptLanguage

class ObjectEzmaxinvoicingApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ObjectEzmaxinvoicingApi
        //val apiInstance = ObjectEzmaxinvoicingApi()

        // to test ezmaxinvoicingGetAutocompleteV2
        should("test ezmaxinvoicingGetAutocompleteV2") {
            // uncomment below to test ezmaxinvoicingGetAutocompleteV2
            //val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Ezmaxinvoicings to return
            //val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
            //val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
            //val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
            //val result : EzmaxinvoicingGetAutocompleteV2Response = apiInstance.ezmaxinvoicingGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
            //result shouldBe ("TODO")
        }

        // to test ezmaxinvoicingGetObjectV2
        should("test ezmaxinvoicingGetObjectV2") {
            // uncomment below to test ezmaxinvoicingGetObjectV2
            //val pkiEzmaxinvoicingID : kotlin.Int = 56 // kotlin.Int | 
            //val result : EzmaxinvoicingGetObjectV2Response = apiInstance.ezmaxinvoicingGetObjectV2(pkiEzmaxinvoicingID)
            //result shouldBe ("TODO")
        }

        // to test ezmaxinvoicingGetProvisionalV1
        should("test ezmaxinvoicingGetProvisionalV1") {
            // uncomment below to test ezmaxinvoicingGetProvisionalV1
            //val result : EzmaxinvoicingGetProvisionalV1Response = apiInstance.ezmaxinvoicingGetProvisionalV1()
            //result shouldBe ("TODO")
        }

    }
}