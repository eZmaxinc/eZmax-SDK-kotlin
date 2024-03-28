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

import eZmaxApi.models.CustomEzsignformfieldRequest

class CustomEzsignformfieldRequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CustomEzsignformfieldRequest
        //val modelInstance = CustomEzsignformfieldRequest()

        // to test the property `pkiEzsignformfieldID` - The unique ID of the Ezsignformfield
        should("test pkiEzsignformfieldID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsignformfieldID shouldBe ("TODO")
        }

        // to test the property `sEzsignformfieldLabel` - The Label for the Ezsignformfield
        should("test sEzsignformfieldLabel") {
            // uncomment below to test the property
            //modelInstance.sEzsignformfieldLabel shouldBe ("TODO")
        }

        // to test the property `bEzsignformfieldSelected` - Whether the Ezsignformfield is selected or not by default.  This can only be set if eEzsignformfieldgroupType is **Checkbox** or **Radio**
        should("test bEzsignformfieldSelected") {
            // uncomment below to test the property
            //modelInstance.bEzsignformfieldSelected shouldBe ("TODO")
        }

        // to test the property `sEzsignformfieldEnteredvalue` - This is the value enterred for the Ezsignformfield  This can only be set if eEzsignformfieldgroupType is **Dropdown**, **Text** or **Textarea**
        should("test sEzsignformfieldEnteredvalue") {
            // uncomment below to test the property
            //modelInstance.sEzsignformfieldEnteredvalue shouldBe ("TODO")
        }

    }
}
