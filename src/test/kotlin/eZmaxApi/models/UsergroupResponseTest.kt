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

package eZmaxApi.models

import io.kotlintest.shouldBe
import io.kotlintest.specs.ShouldSpec

import eZmaxApi.models.UsergroupResponse
import eZmaxApi.models.MultilingualUsergroupName

class UsergroupResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of UsergroupResponse
        //val modelInstance = UsergroupResponse()

        // to test the property `pkiUsergroupID` - The unique ID of the Usergroup
        should("test pkiUsergroupID") {
            // uncomment below to test the property
            //modelInstance.pkiUsergroupID shouldBe ("TODO")
        }

        // to test the property `objUsergroupName`
        should("test objUsergroupName") {
            // uncomment below to test the property
            //modelInstance.objUsergroupName shouldBe ("TODO")
        }

        // to test the property `sUsergroupNameX` - The Name of the Usergroup in the language of the requester
        should("test sUsergroupNameX") {
            // uncomment below to test the property
            //modelInstance.sUsergroupNameX shouldBe ("TODO")
        }

    }
}
