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

import eZmaxApi.apis.ObjectUsergroupApi
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.HeaderAcceptLanguage
import eZmaxApi.models.UsergroupCreateObjectV1Request
import eZmaxApi.models.UsergroupCreateObjectV1Response
import eZmaxApi.models.UsergroupEditObjectV1Request
import eZmaxApi.models.UsergroupEditObjectV1Response
import eZmaxApi.models.UsergroupEditPermissionsV1Request
import eZmaxApi.models.UsergroupEditPermissionsV1Response
import eZmaxApi.models.UsergroupEditUsergroupdelegationsV1Request
import eZmaxApi.models.UsergroupEditUsergroupdelegationsV1Response
import eZmaxApi.models.UsergroupEditUsergroupmembershipsV1Request
import eZmaxApi.models.UsergroupEditUsergroupmembershipsV1Response
import eZmaxApi.models.UsergroupGetAutocompleteV2Response
import eZmaxApi.models.UsergroupGetListV1Response
import eZmaxApi.models.UsergroupGetObjectV2Response
import eZmaxApi.models.UsergroupGetPermissionsV1Response
import eZmaxApi.models.UsergroupGetUsergroupdelegationsV1Response
import eZmaxApi.models.UsergroupGetUsergroupmembershipsV1Response

class ObjectUsergroupApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ObjectUsergroupApi
        //val apiInstance = ObjectUsergroupApi()

        // to test usergroupCreateObjectV1
        should("test usergroupCreateObjectV1") {
            // uncomment below to test usergroupCreateObjectV1
            //val usergroupCreateObjectV1Request : UsergroupCreateObjectV1Request =  // UsergroupCreateObjectV1Request | 
            //val result : UsergroupCreateObjectV1Response = apiInstance.usergroupCreateObjectV1(usergroupCreateObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test usergroupEditObjectV1
        should("test usergroupEditObjectV1") {
            // uncomment below to test usergroupEditObjectV1
            //val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
            //val usergroupEditObjectV1Request : UsergroupEditObjectV1Request =  // UsergroupEditObjectV1Request | 
            //val result : UsergroupEditObjectV1Response = apiInstance.usergroupEditObjectV1(pkiUsergroupID, usergroupEditObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test usergroupEditPermissionsV1
        should("test usergroupEditPermissionsV1") {
            // uncomment below to test usergroupEditPermissionsV1
            //val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
            //val usergroupEditPermissionsV1Request : UsergroupEditPermissionsV1Request =  // UsergroupEditPermissionsV1Request | 
            //val result : UsergroupEditPermissionsV1Response = apiInstance.usergroupEditPermissionsV1(pkiUsergroupID, usergroupEditPermissionsV1Request)
            //result shouldBe ("TODO")
        }

        // to test usergroupEditUsergroupdelegationsV1
        should("test usergroupEditUsergroupdelegationsV1") {
            // uncomment below to test usergroupEditUsergroupdelegationsV1
            //val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
            //val usergroupEditUsergroupdelegationsV1Request : UsergroupEditUsergroupdelegationsV1Request =  // UsergroupEditUsergroupdelegationsV1Request | 
            //val result : UsergroupEditUsergroupdelegationsV1Response = apiInstance.usergroupEditUsergroupdelegationsV1(pkiUsergroupID, usergroupEditUsergroupdelegationsV1Request)
            //result shouldBe ("TODO")
        }

        // to test usergroupEditUsergroupmembershipsV1
        should("test usergroupEditUsergroupmembershipsV1") {
            // uncomment below to test usergroupEditUsergroupmembershipsV1
            //val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
            //val usergroupEditUsergroupmembershipsV1Request : UsergroupEditUsergroupmembershipsV1Request =  // UsergroupEditUsergroupmembershipsV1Request | 
            //val result : UsergroupEditUsergroupmembershipsV1Response = apiInstance.usergroupEditUsergroupmembershipsV1(pkiUsergroupID, usergroupEditUsergroupmembershipsV1Request)
            //result shouldBe ("TODO")
        }

        // to test usergroupGetAutocompleteV2
        should("test usergroupGetAutocompleteV2") {
            // uncomment below to test usergroupGetAutocompleteV2
            //val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Usergroups to return
            //val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
            //val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
            //val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
            //val result : UsergroupGetAutocompleteV2Response = apiInstance.usergroupGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
            //result shouldBe ("TODO")
        }

        // to test usergroupGetListV1
        should("test usergroupGetListV1") {
            // uncomment below to test usergroupGetListV1
            //val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
            //val iRowMax : kotlin.Int = 56 // kotlin.Int | 
            //val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
            //val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
            //val sFilter : kotlin.String = sFilter_example // kotlin.String | 
            //val result : UsergroupGetListV1Response = apiInstance.usergroupGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
            //result shouldBe ("TODO")
        }

        // to test usergroupGetObjectV2
        should("test usergroupGetObjectV2") {
            // uncomment below to test usergroupGetObjectV2
            //val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
            //val result : UsergroupGetObjectV2Response = apiInstance.usergroupGetObjectV2(pkiUsergroupID)
            //result shouldBe ("TODO")
        }

        // to test usergroupGetPermissionsV1
        should("test usergroupGetPermissionsV1") {
            // uncomment below to test usergroupGetPermissionsV1
            //val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
            //val result : UsergroupGetPermissionsV1Response = apiInstance.usergroupGetPermissionsV1(pkiUsergroupID)
            //result shouldBe ("TODO")
        }

        // to test usergroupGetUsergroupdelegationsV1
        should("test usergroupGetUsergroupdelegationsV1") {
            // uncomment below to test usergroupGetUsergroupdelegationsV1
            //val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
            //val result : UsergroupGetUsergroupdelegationsV1Response = apiInstance.usergroupGetUsergroupdelegationsV1(pkiUsergroupID)
            //result shouldBe ("TODO")
        }

        // to test usergroupGetUsergroupmembershipsV1
        should("test usergroupGetUsergroupmembershipsV1") {
            // uncomment below to test usergroupGetUsergroupmembershipsV1
            //val pkiUsergroupID : kotlin.Int = 56 // kotlin.Int | 
            //val result : UsergroupGetUsergroupmembershipsV1Response = apiInstance.usergroupGetUsergroupmembershipsV1(pkiUsergroupID)
            //result shouldBe ("TODO")
        }

    }
}