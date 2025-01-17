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

import eZmaxApi.models.ContactResponseCompound
import eZmaxApi.models.ContactinformationsResponseCompound
import eZmaxApi.models.FieldEContactType

class ContactResponseCompoundTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ContactResponseCompound
        //val modelInstance = ContactResponseCompound()

        // to test the property `pkiContactID` - The unique ID of the Contact
        should("test pkiContactID") {
            // uncomment below to test the property
            //modelInstance.pkiContactID shouldBe ("TODO")
        }

        // to test the property `fkiLanguageID` - The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
        should("test fkiLanguageID") {
            // uncomment below to test the property
            //modelInstance.fkiLanguageID shouldBe ("TODO")
        }

        // to test the property `fkiContacttitleID` - The unique ID of the Contacttitle.  Valid values:  |Value|Description| |-|-| |1|Ms.| |2|Mr.| |4|(Blank)| |5|Me (For Notaries)|
        should("test fkiContacttitleID") {
            // uncomment below to test the property
            //modelInstance.fkiContacttitleID shouldBe ("TODO")
        }

        // to test the property `fkiContactinformationsID` - The unique ID of the Contactinformations
        should("test fkiContactinformationsID") {
            // uncomment below to test the property
            //modelInstance.fkiContactinformationsID shouldBe ("TODO")
        }

        // to test the property `eContactType`
        should("test eContactType") {
            // uncomment below to test the property
            //modelInstance.eContactType shouldBe ("TODO")
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

        // to test the property `bContactIsactive` - Whether the contact is active or not
        should("test bContactIsactive") {
            // uncomment below to test the property
            //modelInstance.bContactIsactive shouldBe ("TODO")
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

        // to test the property `sContactCompany` - The Company name of the contact
        should("test sContactCompany") {
            // uncomment below to test the property
            //modelInstance.sContactCompany shouldBe ("TODO")
        }

        // to test the property `sContactOccupation` - The occupation of the Contact
        should("test sContactOccupation") {
            // uncomment below to test the property
            //modelInstance.sContactOccupation shouldBe ("TODO")
        }

        // to test the property `tContactNote` - The note of the Contact
        should("test tContactNote") {
            // uncomment below to test the property
            //modelInstance.tContactNote shouldBe ("TODO")
        }

    }
}
