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

import eZmaxApi.models.ContactinformationsRequestCompoundV2
import eZmaxApi.models.AddressRequest
import eZmaxApi.models.EmailRequest
import eZmaxApi.models.FieldEContactinformationsType
import eZmaxApi.models.PhoneRequest
import eZmaxApi.models.WebsiteRequest

class ContactinformationsRequestCompoundV2Test : ShouldSpec() {
    init {
        // uncomment below to create an instance of ContactinformationsRequestCompoundV2
        //val modelInstance = ContactinformationsRequestCompoundV2()

        // to test the property `eContactinformationsType`
        should("test eContactinformationsType") {
            // uncomment below to test the property
            //modelInstance.eContactinformationsType shouldBe ("TODO")
        }

        // to test the property `iAddressDefault` - The index in the a_objAddress array (zero based index) representing the Address object that should become the default one.  You can leave the value to 0 if the array is empty.
        should("test iAddressDefault") {
            // uncomment below to test the property
            //modelInstance.iAddressDefault shouldBe ("TODO")
        }

        // to test the property `iPhoneDefault` - The index in the a_objPhone array (zero based index) representing the Phone object that should become the default one.  You can leave the value to 0 if the array is empty.
        should("test iPhoneDefault") {
            // uncomment below to test the property
            //modelInstance.iPhoneDefault shouldBe ("TODO")
        }

        // to test the property `iEmailDefault` - The index in the a_objEmail array (zero based index) representing the Email object that should become the default one.  You can leave the value to 0 if the array is empty.
        should("test iEmailDefault") {
            // uncomment below to test the property
            //modelInstance.iEmailDefault shouldBe ("TODO")
        }

        // to test the property `iWebsiteDefault` - The index in the a_objWebsite array (zero based index) representing the Website object that should become the default one.  You can leave the value to 0 if the array is empty.
        should("test iWebsiteDefault") {
            // uncomment below to test the property
            //modelInstance.iWebsiteDefault shouldBe ("TODO")
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

    }
}
