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

import eZmaxApi.models.WebhookEzsignFolderCompleted
import eZmaxApi.models.AttemptResponseCompound
import eZmaxApi.models.CustomWebhookResponse
import eZmaxApi.models.EzsignfolderResponse

class WebhookEzsignFolderCompletedTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of WebhookEzsignFolderCompleted
        //val modelInstance = WebhookEzsignFolderCompleted()

        // to test the property `objWebhook`
        should("test objWebhook") {
            // uncomment below to test the property
            //modelInstance.objWebhook shouldBe ("TODO")
        }

        // to test the property `aObjAttempt` - An array containing details of previous attempts that were made to deliver the message. The array is empty if it's the first attempt.
        should("test aObjAttempt") {
            // uncomment below to test the property
            //modelInstance.aObjAttempt shouldBe ("TODO")
        }

        // to test the property `objEzsignfolder`
        should("test objEzsignfolder") {
            // uncomment below to test the property
            //modelInstance.objEzsignfolder shouldBe ("TODO")
        }

    }
}
