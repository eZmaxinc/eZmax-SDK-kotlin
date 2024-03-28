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

import eZmaxApi.apis.ObjectUserApi
import eZmaxApi.models.CommonResponseError
import eZmaxApi.models.HeaderAcceptLanguage
import eZmaxApi.models.UserCreateObjectV1Request
import eZmaxApi.models.UserCreateObjectV1Response
import eZmaxApi.models.UserCreateObjectV2Request
import eZmaxApi.models.UserCreateObjectV2Response
import eZmaxApi.models.UserEditObjectV1Request
import eZmaxApi.models.UserEditObjectV1Response
import eZmaxApi.models.UserEditPermissionsV1Request
import eZmaxApi.models.UserEditPermissionsV1Response
import eZmaxApi.models.UserGetApikeysV1Response
import eZmaxApi.models.UserGetAutocompleteV2Response
import eZmaxApi.models.UserGetEffectivePermissionsV1Response
import eZmaxApi.models.UserGetListV1Response
import eZmaxApi.models.UserGetObjectV2Response
import eZmaxApi.models.UserGetPermissionsV1Response
import eZmaxApi.models.UserGetSubnetsV1Response
import eZmaxApi.models.UserGetUsergroupexternalsV1Response
import eZmaxApi.models.UserGetUsergroupsV1Response
import eZmaxApi.models.UserSendPasswordResetV1Response

class ObjectUserApiTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ObjectUserApi
        //val apiInstance = ObjectUserApi()

        // to test userCreateObjectV1
        should("test userCreateObjectV1") {
            // uncomment below to test userCreateObjectV1
            //val userCreateObjectV1Request : UserCreateObjectV1Request =  // UserCreateObjectV1Request | 
            //val result : UserCreateObjectV1Response = apiInstance.userCreateObjectV1(userCreateObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test userCreateObjectV2
        should("test userCreateObjectV2") {
            // uncomment below to test userCreateObjectV2
            //val userCreateObjectV2Request : UserCreateObjectV2Request =  // UserCreateObjectV2Request | 
            //val result : UserCreateObjectV2Response = apiInstance.userCreateObjectV2(userCreateObjectV2Request)
            //result shouldBe ("TODO")
        }

        // to test userEditObjectV1
        should("test userEditObjectV1") {
            // uncomment below to test userEditObjectV1
            //val pkiUserID : kotlin.Int = 56 // kotlin.Int | The unique ID of the User
            //val userEditObjectV1Request : UserEditObjectV1Request =  // UserEditObjectV1Request | 
            //val result : UserEditObjectV1Response = apiInstance.userEditObjectV1(pkiUserID, userEditObjectV1Request)
            //result shouldBe ("TODO")
        }

        // to test userEditPermissionsV1
        should("test userEditPermissionsV1") {
            // uncomment below to test userEditPermissionsV1
            //val pkiUserID : kotlin.Int = 56 // kotlin.Int | 
            //val userEditPermissionsV1Request : UserEditPermissionsV1Request =  // UserEditPermissionsV1Request | 
            //val result : UserEditPermissionsV1Response = apiInstance.userEditPermissionsV1(pkiUserID, userEditPermissionsV1Request)
            //result shouldBe ("TODO")
        }

        // to test userGetApikeysV1
        should("test userGetApikeysV1") {
            // uncomment below to test userGetApikeysV1
            //val pkiUserID : kotlin.Int = 56 // kotlin.Int | 
            //val result : UserGetApikeysV1Response = apiInstance.userGetApikeysV1(pkiUserID)
            //result shouldBe ("TODO")
        }

        // to test userGetAutocompleteV2
        should("test userGetAutocompleteV2") {
            // uncomment below to test userGetAutocompleteV2
            //val sSelector : kotlin.String = sSelector_example // kotlin.String | The type of Users to return
            //val eFilterActive : kotlin.String = eFilterActive_example // kotlin.String | Specify which results we want to display.
            //val sQuery : kotlin.String = sQuery_example // kotlin.String | Allow to filter the returned results
            //val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
            //val result : UserGetAutocompleteV2Response = apiInstance.userGetAutocompleteV2(sSelector, eFilterActive, sQuery, acceptLanguage)
            //result shouldBe ("TODO")
        }

        // to test userGetEffectivePermissionsV1
        should("test userGetEffectivePermissionsV1") {
            // uncomment below to test userGetEffectivePermissionsV1
            //val pkiUserID : kotlin.Int = 56 // kotlin.Int | 
            //val result : UserGetEffectivePermissionsV1Response = apiInstance.userGetEffectivePermissionsV1(pkiUserID)
            //result shouldBe ("TODO")
        }

        // to test userGetListV1
        should("test userGetListV1") {
            // uncomment below to test userGetListV1
            //val eOrderBy : kotlin.String = eOrderBy_example // kotlin.String | Specify how you want the results to be sorted
            //val iRowMax : kotlin.Int = 56 // kotlin.Int | 
            //val iRowOffset : kotlin.Int = 56 // kotlin.Int | 
            //val acceptLanguage : HeaderAcceptLanguage =  // HeaderAcceptLanguage | 
            //val sFilter : kotlin.String = sFilter_example // kotlin.String | 
            //val result : UserGetListV1Response = apiInstance.userGetListV1(eOrderBy, iRowMax, iRowOffset, acceptLanguage, sFilter)
            //result shouldBe ("TODO")
        }

        // to test userGetObjectV2
        should("test userGetObjectV2") {
            // uncomment below to test userGetObjectV2
            //val pkiUserID : kotlin.Int = 56 // kotlin.Int | The unique ID of the User
            //val result : UserGetObjectV2Response = apiInstance.userGetObjectV2(pkiUserID)
            //result shouldBe ("TODO")
        }

        // to test userGetPermissionsV1
        should("test userGetPermissionsV1") {
            // uncomment below to test userGetPermissionsV1
            //val pkiUserID : kotlin.Int = 56 // kotlin.Int | 
            //val result : UserGetPermissionsV1Response = apiInstance.userGetPermissionsV1(pkiUserID)
            //result shouldBe ("TODO")
        }

        // to test userGetSubnetsV1
        should("test userGetSubnetsV1") {
            // uncomment below to test userGetSubnetsV1
            //val pkiUserID : kotlin.Int = 56 // kotlin.Int | 
            //val result : UserGetSubnetsV1Response = apiInstance.userGetSubnetsV1(pkiUserID)
            //result shouldBe ("TODO")
        }

        // to test userGetUsergroupexternalsV1
        should("test userGetUsergroupexternalsV1") {
            // uncomment below to test userGetUsergroupexternalsV1
            //val pkiUserID : kotlin.Int = 56 // kotlin.Int | 
            //val result : UserGetUsergroupexternalsV1Response = apiInstance.userGetUsergroupexternalsV1(pkiUserID)
            //result shouldBe ("TODO")
        }

        // to test userGetUsergroupsV1
        should("test userGetUsergroupsV1") {
            // uncomment below to test userGetUsergroupsV1
            //val pkiUserID : kotlin.Int = 56 // kotlin.Int | 
            //val result : UserGetUsergroupsV1Response = apiInstance.userGetUsergroupsV1(pkiUserID)
            //result shouldBe ("TODO")
        }

        // to test userSendPasswordResetV1
        should("test userSendPasswordResetV1") {
            // uncomment below to test userSendPasswordResetV1
            //val pkiUserID : kotlin.Int = 56 // kotlin.Int | 
            //val body : kotlin.Any = Object // kotlin.Any | 
            //val result : UserSendPasswordResetV1Response = apiInstance.userSendPasswordResetV1(pkiUserID, body)
            //result shouldBe ("TODO")
        }

    }
}
