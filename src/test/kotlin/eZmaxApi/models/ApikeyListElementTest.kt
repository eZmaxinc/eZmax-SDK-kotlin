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

import eZmaxApi.models.ApikeyListElement

class ApikeyListElementTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ApikeyListElement
        //val modelInstance = ApikeyListElement()

        // to test the property `pkiApikeyID` - The unique ID of the Apikey
        should("test pkiApikeyID") {
            // uncomment below to test the property
            //modelInstance.pkiApikeyID shouldBe ("TODO")
        }

        // to test the property `sApikeyDescriptionX` - The description of the Apikey in the language of the requester
        should("test sApikeyDescriptionX") {
            // uncomment below to test the property
            //modelInstance.sApikeyDescriptionX shouldBe ("TODO")
        }

        // to test the property `sUserFirstname` - The first name of the user
        should("test sUserFirstname") {
            // uncomment below to test the property
            //modelInstance.sUserFirstname shouldBe ("TODO")
        }

        // to test the property `sUserLastname` - The last name of the user
        should("test sUserLastname") {
            // uncomment below to test the property
            //modelInstance.sUserLastname shouldBe ("TODO")
        }

        // to test the property `bApikeyIsactive` - Whether the apikey is active or not
        should("test bApikeyIsactive") {
            // uncomment below to test the property
            //modelInstance.bApikeyIsactive shouldBe ("TODO")
        }

        // to test the property `bApikeyIssigned` - Whether the apikey is signed or not
        should("test bApikeyIssigned") {
            // uncomment below to test the property
            //modelInstance.bApikeyIssigned shouldBe ("TODO")
        }

    }
}
