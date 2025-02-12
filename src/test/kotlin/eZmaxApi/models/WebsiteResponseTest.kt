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

import eZmaxApi.models.WebsiteResponse

class WebsiteResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of WebsiteResponse
        //val modelInstance = WebsiteResponse()

        // to test the property `pkiWebsiteID` - The unique ID of the Website Default
        should("test pkiWebsiteID") {
            // uncomment below to test the property
            //modelInstance.pkiWebsiteID shouldBe ("TODO")
        }

        // to test the property `fkiWebsitetypeID` - The unique ID of the Websitetype.  Valid values:  |Value|Description| |-|-| |1|Website| |2|Twitter| |3|Facebook| |4|Survey|
        should("test fkiWebsitetypeID") {
            // uncomment below to test the property
            //modelInstance.fkiWebsitetypeID shouldBe ("TODO")
        }

        // to test the property `sWebsiteAddress` - The URL of the website.
        should("test sWebsiteAddress") {
            // uncomment below to test the property
            //modelInstance.sWebsiteAddress shouldBe ("TODO")
        }

    }
}
