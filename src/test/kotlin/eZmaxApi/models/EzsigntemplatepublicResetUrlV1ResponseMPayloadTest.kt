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

import eZmaxApi.models.EzsigntemplatepublicResetUrlV1ResponseMPayload

class EzsigntemplatepublicResetUrlV1ResponseMPayloadTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsigntemplatepublicResetUrlV1ResponseMPayload
        //val modelInstance = EzsigntemplatepublicResetUrlV1ResponseMPayload()

        // to test the property `sEzsigntemplatepublicUrl` - The url of the Ezsigntemplatepublic  You can add these value as query parameters to prefill the corresponding role  |Parameter|Description| |-|-| |sEzsigntemplatesignerDescription|The role to fill| |sContactFirstname|The contact firstname| |sContactLastname|The contact lastname| |sEmailAddress|The contact email| |sPhoneE164|The contact phone number| |sPhoneE164Cell|The contact cell phone number|
        should("test sEzsigntemplatepublicUrl") {
            // uncomment below to test the property
            //modelInstance.sEzsigntemplatepublicUrl shouldBe ("TODO")
        }

    }
}
