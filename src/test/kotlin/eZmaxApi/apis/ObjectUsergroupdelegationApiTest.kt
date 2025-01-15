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

import eZmaxApi.apis.ObjectUsergroupdelegationApi
import eZmaxApi.models.CommonResponse
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.UsergroupdelegationCreateObjectV1Request
import eZmaxApi.models.UsergroupdelegationCreateObjectV1Response
import eZmaxApi.models.UsergroupdelegationEditObjectV1Request
import eZmaxApi.models.UsergroupdelegationGetObjectV2Response

class ObjectUsergroupdelegationApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ObjectUsergroupdelegationApi
        //val apiInstance = ObjectUsergroupdelegationApi()

        // to test usergroupdelegationCreateObjectV1
        should("test usergroupdelegationCreateObjectV1") {
            // uncomment below to test usergroupdelegationCreateObjectV1
            //val usergroupdelegationCreateObjectV1Request : UsergroupdelegationCreateObjectV1Request =  // UsergroupdelegationCreateObjectV1Request | 
            //val result : UsergroupdelegationCreateObjectV1Response = apiInstance.usergroupdelegationCreateObjectV1(usergroupdelegationCreateObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test usergroupdelegationDeleteObjectV1
        should("test usergroupdelegationDeleteObjectV1") {
            // uncomment below to test usergroupdelegationDeleteObjectV1
            //val pkiUsergroupdelegationID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Usergroupdelegation
            //val result : CommonResponse = apiInstance.usergroupdelegationDeleteObjectV1(pkiUsergroupdelegationID)
            //result shouldBe ("TODO")
        }

        // to test usergroupdelegationEditObjectV1
        should("test usergroupdelegationEditObjectV1") {
            // uncomment below to test usergroupdelegationEditObjectV1
            //val pkiUsergroupdelegationID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Usergroupdelegation
            //val usergroupdelegationEditObjectV1Request : UsergroupdelegationEditObjectV1Request =  // UsergroupdelegationEditObjectV1Request | 
            //val result : CommonResponse = apiInstance.usergroupdelegationEditObjectV1(pkiUsergroupdelegationID, usergroupdelegationEditObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test usergroupdelegationGetObjectV2
        should("test usergroupdelegationGetObjectV2") {
            // uncomment below to test usergroupdelegationGetObjectV2
            //val pkiUsergroupdelegationID : kotlin.Int = 56 // kotlin.Int | The unique ID of the Usergroupdelegation
            //val result : UsergroupdelegationGetObjectV2Response = apiInstance.usergroupdelegationGetObjectV2(pkiUsergroupdelegationID)
            //result shouldBe ("TODO")
        }

    }
}
