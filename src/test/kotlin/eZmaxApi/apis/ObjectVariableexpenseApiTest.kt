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

import eZmaxApi.apis.ObjectVariableexpenseApi
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.HeaderAcceptLanguage
import eZmaxApi.models.VariableexpenseCreateObjectV1Request
import eZmaxApi.models.VariableexpenseCreateObjectV1Response
import eZmaxApi.models.VariableexpenseEditObjectV1Request
import eZmaxApi.models.VariableexpenseEditObjectV1Response
import eZmaxApi.models.VariableexpenseGetAutocompleteV2Response
import eZmaxApi.models.VariableexpenseGetListV1Response
import eZmaxApi.models.VariableexpenseGetObjectV2Response

class ObjectVariableexpenseApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ObjectVariableexpenseApi
        //val apiInstance = ObjectVariableexpenseApi()

        // to test variableexpenseCreateObjectV1
        should("test variableexpenseCreateObjectV1") {
            // uncomment below to test variableexpenseCreateObjectV1
            //val variableexpenseCreateObjectV1Request : VariableexpenseCreateObjectV1Request =  // VariableexpenseCreateObjectV1Request | 
            //val result : VariableexpenseCreateObjectV1Response = apiInstance.variableexpenseCreateObjectV1(variableexpenseCreateObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test variableexpenseEditObjectV1
        should("test variableexpenseEditObjectV1") {
            // uncomment below to test variableexpenseEditObjectV1
            //val pkiVariableexpenseID : kotlin.Int = 56 // kotlin.Int | 
            //val variableexpenseEditObjectV1Request : VariableexpenseEditObjectV1Request =  // VariableexpenseEditObjectV1Request | 
            //val result : VariableexpenseEditObjectV1Response = apiInstance.variableexpenseEditObjectV1(pkiVariableexpenseID, variableexpenseEditObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test variableexpenseGetAutocompleteV2
        should("test variableexpenseGetAutocompleteV2") {
            // uncomment below to test variableexpenseGetAutocompleteV2
            //val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Variableexpenses to return
            //val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
            //val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
            //val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
            //val result : VariableexpenseGetAutocompleteV2Response = apiInstance.variableexpenseGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
            //result shouldBe ("TODO")
        }

        // to test variableexpenseGetListV1
        should("test variableexpenseGetListV1") {
            // uncomment below to test variableexpenseGetListV1
            //val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
            //val iRowMax : kotlin.Int = 56 // kotlin.Int | 
            //val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
            //val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
            //val sFilter : kotlin.String = sFilter_example // kotlin.String | 
            //val result : VariableexpenseGetListV1Response = apiInstance.variableexpenseGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
            //result shouldBe ("TODO")
        }

        // to test variableexpenseGetObjectV2
        should("test variableexpenseGetObjectV2") {
            // uncomment below to test variableexpenseGetObjectV2
            //val pkiVariableexpenseID : kotlin.Int = 56 // kotlin.Int | 
            //val result : VariableexpenseGetObjectV2Response = apiInstance.variableexpenseGetObjectV2(pkiVariableexpenseID)
            //result shouldBe ("TODO")
        }

    }
}
