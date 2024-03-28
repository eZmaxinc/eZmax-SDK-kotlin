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

import eZmaxApi.models.AttemptResponse

class AttemptResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AttemptResponse
        //val modelInstance = AttemptResponse()

        // to test the property `dtAttemptStart` - Represent a Date Time. The timezone is the one configured in the User's profile.
        should("test dtAttemptStart") {
            // uncomment below to test the property
            //modelInstance.dtAttemptStart shouldBe ("TODO")
        }

        // to test the property `sAttemptResult` - The Success or Failure message of the attempt when we tried to call the URL to deliver the webhook event.
        should("test sAttemptResult") {
            // uncomment below to test the property
            //modelInstance.sAttemptResult shouldBe ("TODO")
        }

        // to test the property `iAttemptDuration` - The number of second it took to process the webhook or get an error
        should("test iAttemptDuration") {
            // uncomment below to test the property
            //modelInstance.iAttemptDuration shouldBe ("TODO")
        }

    }
}