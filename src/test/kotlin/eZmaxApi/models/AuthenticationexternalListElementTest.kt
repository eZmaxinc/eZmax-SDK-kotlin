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

import eZmaxApi.models.AuthenticationexternalListElement
import eZmaxApi.models.FieldEAuthenticationexternalType

class AuthenticationexternalListElementTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of AuthenticationexternalListElement
        //val modelInstance = AuthenticationexternalListElement()

        // to test the property `pkiAuthenticationexternalID` - The unique ID of the Authenticationexternal
        should("test pkiAuthenticationexternalID") {
            // uncomment below to test the property
            //modelInstance.pkiAuthenticationexternalID shouldBe ("TODO")
        }

        // to test the property `sAuthenticationexternalDescription` - The description of the Authenticationexternal
        should("test sAuthenticationexternalDescription") {
            // uncomment below to test the property
            //modelInstance.sAuthenticationexternalDescription shouldBe ("TODO")
        }

        // to test the property `eAuthenticationexternalType`
        should("test eAuthenticationexternalType") {
            // uncomment below to test the property
            //modelInstance.eAuthenticationexternalType shouldBe ("TODO")
        }

        // to test the property `bAuthenticationexternalConnected` - Whether the Authenticationexternal has been connected or not
        should("test bAuthenticationexternalConnected") {
            // uncomment below to test the property
            //modelInstance.bAuthenticationexternalConnected shouldBe ("TODO")
        }

    }
}
