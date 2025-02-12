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

import eZmaxApi.apis.ObjectDomainApi
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.DomainCreateObjectV1Request
import eZmaxApi.models.DomainCreateObjectV1Response
import eZmaxApi.models.DomainDeleteObjectV1Response
import eZmaxApi.models.DomainGetListV1Response
import eZmaxApi.models.DomainGetObjectV2Response
import eZmaxApi.models.HeaderAcceptLanguage

class ObjectDomainApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ObjectDomainApi
        //val apiInstance = ObjectDomainApi()

        // to test domainCreateObjectV1
        should("test domainCreateObjectV1") {
            // uncomment below to test domainCreateObjectV1
            //val domainCreateObjectV1Request : DomainCreateObjectV1Request =  // DomainCreateObjectV1Request | 
            //val result : DomainCreateObjectV1Response = apiInstance.domainCreateObjectV1(domainCreateObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test domainDeleteObjectV1
        should("test domainDeleteObjectV1") {
            // uncomment below to test domainDeleteObjectV1
            //val pkiDomainID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Domain
            //val result : DomainDeleteObjectV1Response = apiInstance.domainDeleteObjectV1(pkiDomainID)
            //result shouldBe ("TODO")
        }

        // to test domainGetListV1
        should("test domainGetListV1") {
            // uncomment below to test domainGetListV1
            //val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
            //val iRowMax : kotlin.Int = 56 // kotlin.Int | 
            //val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
            //val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
            //val sFilter : kotlin.String = sFilter_example // kotlin.String | 
            //val result : DomainGetListV1Response = apiInstance.domainGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
            //result shouldBe ("TODO")
        }

        // to test domainGetObjectV2
        should("test domainGetObjectV2") {
            // uncomment below to test domainGetObjectV2
            //val pkiDomainID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Domain
            //val result : DomainGetObjectV2Response = apiInstance.domainGetObjectV2(pkiDomainID)
            //result shouldBe ("TODO")
        }

    }
}
