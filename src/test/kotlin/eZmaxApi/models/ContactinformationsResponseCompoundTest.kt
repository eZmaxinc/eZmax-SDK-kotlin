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

import eZmaxApi.models.ContactinformationsResponseCompound
import eZmaxApi.models.AddressResponse
import eZmaxApi.models.EmailResponse
import eZmaxApi.models.FieldEContactinformationsType
import eZmaxApi.models.PhoneResponseCompound
import eZmaxApi.models.WebsiteResponse

class ContactinformationsResponseCompoundTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ContactinformationsResponseCompound
        //val modelInstance = ContactinformationsResponseCompound()

        // to test the property `pkiContactinformationsID` - The unique ID of the Contactinformations
        should("test pkiContactinformationsID") {
            // uncomment below to test the property
            //modelInstance.pkiContactinformationsID shouldBe ("TODO")
        }

        // to test the property `eContactinformationsType`
        should("test eContactinformationsType") {
            // uncomment below to test the property
            //modelInstance.eContactinformationsType shouldBe ("TODO")
        }

        // to test the property `aObjAddress`
        should("test aObjAddress") {
            // uncomment below to test the property
            //modelInstance.aObjAddress shouldBe ("TODO")
        }

        // to test the property `aObjPhone`
        should("test aObjPhone") {
            // uncomment below to test the property
            //modelInstance.aObjPhone shouldBe ("TODO")
        }

        // to test the property `aObjEmail`
        should("test aObjEmail") {
            // uncomment below to test the property
            //modelInstance.aObjEmail shouldBe ("TODO")
        }

        // to test the property `aObjWebsite`
        should("test aObjWebsite") {
            // uncomment below to test the property
            //modelInstance.aObjWebsite shouldBe ("TODO")
        }

        // to test the property `fkiAddressIDDefault` - The unique ID of the Address
        should("test fkiAddressIDDefault") {
            // uncomment below to test the property
            //modelInstance.fkiAddressIDDefault shouldBe ("TODO")
        }

        // to test the property `fkiPhoneIDDefault` - The unique ID of the Phone.
        should("test fkiPhoneIDDefault") {
            // uncomment below to test the property
            //modelInstance.fkiPhoneIDDefault shouldBe ("TODO")
        }

        // to test the property `fkiEmailIDDefault` - The unique ID of the Email
        should("test fkiEmailIDDefault") {
            // uncomment below to test the property
            //modelInstance.fkiEmailIDDefault shouldBe ("TODO")
        }

        // to test the property `fkiWebsiteIDDefault` - The unique ID of the Website Default
        should("test fkiWebsiteIDDefault") {
            // uncomment below to test the property
            //modelInstance.fkiWebsiteIDDefault shouldBe ("TODO")
        }

        // to test the property `sContactinformationsUrl` - The url of the Contactinformations
        should("test sContactinformationsUrl") {
            // uncomment below to test the property
            //modelInstance.sContactinformationsUrl shouldBe ("TODO")
        }

        // to test the property `objAddressDefault` - An Address Object and children to create a complete structure
        should("test objAddressDefault") {
            // uncomment below to test the property
            //modelInstance.objAddressDefault shouldBe ("TODO")
        }

        // to test the property `objPhoneDefault`
        should("test objPhoneDefault") {
            // uncomment below to test the property
            //modelInstance.objPhoneDefault shouldBe ("TODO")
        }

        // to test the property `objEmailDefault` - An Email Object and children to create a complete structure
        should("test objEmailDefault") {
            // uncomment below to test the property
            //modelInstance.objEmailDefault shouldBe ("TODO")
        }

        // to test the property `objWebsiteDefault` - A Website Object and children to create a complete structure
        should("test objWebsiteDefault") {
            // uncomment below to test the property
            //modelInstance.objWebsiteDefault shouldBe ("TODO")
        }

    }
}
