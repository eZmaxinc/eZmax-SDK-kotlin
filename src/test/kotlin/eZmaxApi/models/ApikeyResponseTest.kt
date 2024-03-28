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

import eZmaxApi.models.ApikeyResponse
import eZmaxApi.models.CommonAudit
import eZmaxApi.models.CustomContactNameResponse
import eZmaxApi.models.MultilingualApikeyDescription

class ApikeyResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ApikeyResponse
        //val modelInstance = ApikeyResponse()

        // to test the property `pkiApikeyID` - The unique ID of the Apikey
        should("test pkiApikeyID") {
            // uncomment below to test the property
            //modelInstance.pkiApikeyID shouldBe ("TODO")
        }

        // to test the property `fkiUserID` - The unique ID of the User
        should("test fkiUserID") {
            // uncomment below to test the property
            //modelInstance.fkiUserID shouldBe ("TODO")
        }

        // to test the property `objApikeyDescription`
        should("test objApikeyDescription") {
            // uncomment below to test the property
            //modelInstance.objApikeyDescription shouldBe ("TODO")
        }

        // to test the property `objContactName`
        should("test objContactName") {
            // uncomment below to test the property
            //modelInstance.objContactName shouldBe ("TODO")
        }

        // to test the property `bApikeyIsactive` - Whether the apikey is active or not
        should("test bApikeyIsactive") {
            // uncomment below to test the property
            //modelInstance.bApikeyIsactive shouldBe ("TODO")
        }

        // to test the property `objAudit`
        should("test objAudit") {
            // uncomment below to test the property
            //modelInstance.objAudit shouldBe ("TODO")
        }

        // to test the property `sApikeyApikey` - The Apikey for the API key.  This will be hidden if we are not creating or regenerating the Apikey.
        should("test sApikeyApikey") {
            // uncomment below to test the property
            //modelInstance.sApikeyApikey shouldBe ("TODO")
        }

        // to test the property `sApikeySecret` - The Secret for the API key.  This will be hidden if we are not creating or regenerating the Apikey.
        should("test sApikeySecret") {
            // uncomment below to test the property
            //modelInstance.sApikeySecret shouldBe ("TODO")
        }

        // to test the property `bApikeyIssigned` - Whether the apikey is signed or not
        should("test bApikeyIssigned") {
            // uncomment below to test the property
            //modelInstance.bApikeyIssigned shouldBe ("TODO")
        }

    }
}