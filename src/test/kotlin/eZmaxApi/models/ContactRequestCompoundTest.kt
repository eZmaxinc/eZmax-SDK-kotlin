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

import eZmaxApi.models.ContactRequestCompound
import eZmaxApi.models.ContactinformationsRequestCompound

class ContactRequestCompoundTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ContactRequestCompound
        //val modelInstance = ContactRequestCompound()

        // to test the property `fkiContacttitleID` - The unique ID of the Contacttitle.  Valid values:  |Value|Description| |-|-| |1|Ms.| |2|Mr.| |4|(Blank)| |5|Me (For Notaries)|
        should("test fkiContacttitleID") {
            // uncomment below to test the property
            //modelInstance.fkiContacttitleID shouldBe ("TODO")
        }

        // to test the property `fkiLanguageID` - The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
        should("test fkiLanguageID") {
            // uncomment below to test the property
            //modelInstance.fkiLanguageID shouldBe ("TODO")
        }

        // to test the property `sContactFirstname` - The First name of the contact
        should("test sContactFirstname") {
            // uncomment below to test the property
            //modelInstance.sContactFirstname shouldBe ("TODO")
        }

        // to test the property `sContactLastname` - The Last name of the contact
        should("test sContactLastname") {
            // uncomment below to test the property
            //modelInstance.sContactLastname shouldBe ("TODO")
        }

        // to test the property `sContactCompany` - The Company name of the contact
        should("test sContactCompany") {
            // uncomment below to test the property
            //modelInstance.sContactCompany shouldBe ("TODO")
        }

        // to test the property `objContactinformations`
        should("test objContactinformations") {
            // uncomment below to test the property
            //modelInstance.objContactinformations shouldBe ("TODO")
        }

        // to test the property `dtContactBirthdate` - The Birth Date of the contact
        should("test dtContactBirthdate") {
            // uncomment below to test the property
            //modelInstance.dtContactBirthdate shouldBe ("TODO")
        }

    }
}
