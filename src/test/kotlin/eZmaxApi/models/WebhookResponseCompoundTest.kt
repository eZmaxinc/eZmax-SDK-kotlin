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

import eZmaxApi.models.WebhookResponseCompound
import eZmaxApi.models.CommonAudit
import eZmaxApi.models.FieldEWebhookEzsignevent
import eZmaxApi.models.FieldEWebhookManagementevent
import eZmaxApi.models.FieldEWebhookModule
import eZmaxApi.models.WebhookheaderResponseCompound

class WebhookResponseCompoundTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of WebhookResponseCompound
        //val modelInstance = WebhookResponseCompound()

        // to test the property `pkiWebhookID` - The unique ID of the Webhook
        should("test pkiWebhookID") {
            // uncomment below to test the property
            //modelInstance.pkiWebhookID shouldBe ("TODO")
        }

        // to test the property `sWebhookDescription` - The description of the Webhook
        should("test sWebhookDescription") {
            // uncomment below to test the property
            //modelInstance.sWebhookDescription shouldBe ("TODO")
        }

        // to test the property `eWebhookModule`
        should("test eWebhookModule") {
            // uncomment below to test the property
            //modelInstance.eWebhookModule shouldBe ("TODO")
        }

        // to test the property `sWebhookUrl` - The URL of the Webhook callback
        should("test sWebhookUrl") {
            // uncomment below to test the property
            //modelInstance.sWebhookUrl shouldBe ("TODO")
        }

        // to test the property `sWebhookEmailfailed` - The email that will receive the Webhook in case all attempts fail
        should("test sWebhookEmailfailed") {
            // uncomment below to test the property
            //modelInstance.sWebhookEmailfailed shouldBe ("TODO")
        }

        // to test the property `bWebhookIsactive` - Whether the Webhook is active or not
        should("test bWebhookIsactive") {
            // uncomment below to test the property
            //modelInstance.bWebhookIsactive shouldBe ("TODO")
        }

        // to test the property `bWebhookIssigned` - Whether the requests will be signed or not
        should("test bWebhookIssigned") {
            // uncomment below to test the property
            //modelInstance.bWebhookIssigned shouldBe ("TODO")
        }

        // to test the property `bWebhookSkipsslvalidation` - Wheter the server's SSL certificate should be validated or not. Not recommended to skip for production use
        should("test bWebhookSkipsslvalidation") {
            // uncomment below to test the property
            //modelInstance.bWebhookSkipsslvalidation shouldBe ("TODO")
        }

        // to test the property `objAudit`
        should("test objAudit") {
            // uncomment below to test the property
            //modelInstance.objAudit shouldBe ("TODO")
        }

        // to test the property `fkiAuthenticationexternalID` - The unique ID of the Authenticationexternal
        should("test fkiAuthenticationexternalID") {
            // uncomment below to test the property
            //modelInstance.fkiAuthenticationexternalID shouldBe ("TODO")
        }

        // to test the property `fkiEzsignfoldertypeID` - The unique ID of the Ezsignfoldertype.
        should("test fkiEzsignfoldertypeID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsignfoldertypeID shouldBe ("TODO")
        }

        // to test the property `sEzsignfoldertypeNameX` - The name of the Ezsignfoldertype in the language of the requester
        should("test sEzsignfoldertypeNameX") {
            // uncomment below to test the property
            //modelInstance.sEzsignfoldertypeNameX shouldBe ("TODO")
        }

        // to test the property `eWebhookEzsignevent`
        should("test eWebhookEzsignevent") {
            // uncomment below to test the property
            //modelInstance.eWebhookEzsignevent shouldBe ("TODO")
        }

        // to test the property `eWebhookManagementevent`
        should("test eWebhookManagementevent") {
            // uncomment below to test the property
            //modelInstance.eWebhookManagementevent shouldBe ("TODO")
        }

        // to test the property `sWebhookApikey` - The Apikey for the Webhook.  This will be hidden if we are not creating or regenerating the Apikey.
        should("test sWebhookApikey") {
            // uncomment below to test the property
            //modelInstance.sWebhookApikey shouldBe ("TODO")
        }

        // to test the property `sWebhookSecret` - The Secret for the Webhook.  This will be hidden if we are not creating or regenerating the Apikey.
        should("test sWebhookSecret") {
            // uncomment below to test the property
            //modelInstance.sWebhookSecret shouldBe ("TODO")
        }

        // to test the property `sAuthenticationexternalDescription` - The description of the Authenticationexternal
        should("test sAuthenticationexternalDescription") {
            // uncomment below to test the property
            //modelInstance.sAuthenticationexternalDescription shouldBe ("TODO")
        }

        // to test the property `sWebhookEvent` - The concatenated string to describe the Webhook event
        should("test sWebhookEvent") {
            // uncomment below to test the property
            //modelInstance.sWebhookEvent shouldBe ("TODO")
        }

        // to test the property `aObjWebhookheader`
        should("test aObjWebhookheader") {
            // uncomment below to test the property
            //modelInstance.aObjWebhookheader shouldBe ("TODO")
        }

    }
}
