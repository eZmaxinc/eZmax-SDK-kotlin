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

import eZmaxApi.models.EzsigndocumentRequestCompound

class EzsigndocumentRequestCompoundTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsigndocumentRequestCompound
        //val modelInstance = EzsigndocumentRequestCompound()

        // to test the property `fkiEzsignfolderID` - The unique ID of the Ezsignfolder
        should("test fkiEzsignfolderID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsignfolderID shouldBe ("TODO")
        }

        // to test the property `fkiLanguageID` - The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
        should("test fkiLanguageID") {
            // uncomment below to test the property
            //modelInstance.fkiLanguageID shouldBe ("TODO")
        }

        // to test the property `eEzsigndocumentSource` - Indicates where to look for the document binary content.
        should("test eEzsigndocumentSource") {
            // uncomment below to test the property
            //modelInstance.eEzsigndocumentSource shouldBe ("TODO")
        }

        // to test the property `dtEzsigndocumentDuedate` - The maximum date and time at which the Ezsigndocument can be signed.
        should("test dtEzsigndocumentDuedate") {
            // uncomment below to test the property
            //modelInstance.dtEzsigndocumentDuedate shouldBe ("TODO")
        }

        // to test the property `sEzsigndocumentName` - The name of the document that will be presented to Ezsignfoldersignerassociations
        should("test sEzsigndocumentName") {
            // uncomment below to test the property
            //modelInstance.sEzsigndocumentName shouldBe ("TODO")
        }

        // to test the property `pkiEzsigndocumentID` - The unique ID of the Ezsigndocument
        should("test pkiEzsigndocumentID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsigndocumentID shouldBe ("TODO")
        }

        // to test the property `fkiEzsigntemplateID` - The unique ID of the Ezsigntemplate
        should("test fkiEzsigntemplateID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsigntemplateID shouldBe ("TODO")
        }

        // to test the property `fkiEzsignfoldersignerassociationID` - The unique ID of the Ezsignfoldersignerassociation
        should("test fkiEzsignfoldersignerassociationID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsignfoldersignerassociationID shouldBe ("TODO")
        }

        // to test the property `eEzsigndocumentFormat` - Indicates the format of the document.
        should("test eEzsigndocumentFormat") {
            // uncomment below to test the property
            //modelInstance.eEzsigndocumentFormat shouldBe ("TODO")
        }

        // to test the property `sEzsigndocumentBase64` - The Base64 encoded binary content of the document.  This field is Required when eEzsigndocumentSource = Base64.
        should("test sEzsigndocumentBase64") {
            // uncomment below to test the property
            //modelInstance.sEzsigndocumentBase64 shouldBe ("TODO")
        }

        // to test the property `sEzsigndocumentUrl` - The url where the document content resides.  This field is Required when eEzsigndocumentSource = Url.
        should("test sEzsigndocumentUrl") {
            // uncomment below to test the property
            //modelInstance.sEzsigndocumentUrl shouldBe ("TODO")
        }

        // to test the property `bEzsigndocumentForcerepair` - Try to repair the document or flatten it if it cannot be used for electronic signature. 
        should("test bEzsigndocumentForcerepair") {
            // uncomment below to test the property
            //modelInstance.bEzsigndocumentForcerepair shouldBe ("TODO")
        }

        // to test the property `sEzsigndocumentPassword` - If the source document is password protected, the password to open/modify it.
        should("test sEzsigndocumentPassword") {
            // uncomment below to test the property
            //modelInstance.sEzsigndocumentPassword shouldBe ("TODO")
        }

        // to test the property `eEzsigndocumentForm` - If the document contains an existing PDF form this property must be set.  **Keep** leaves the form as-is in the document.  **Convert** removes the form and convert all the existing fields to Ezsignformfieldgroups and assign them to the specified **fkiEzsignfoldersignerassociationID**  **Discard** removes the form from the document.
        should("test eEzsigndocumentForm") {
            // uncomment below to test the property
            //modelInstance.eEzsigndocumentForm shouldBe ("TODO")
        }

        // to test the property `sEzsigndocumentExternalid` - This field can be used to store an External ID from the client's system.  Anything can be stored in this field, it will never be evaluated by the eZmax system and will be returned AS-IS.  To store multiple values, consider using a JSON formatted structure, a URL encoded string, a CSV or any other custom format. 
        should("test sEzsigndocumentExternalid") {
            // uncomment below to test the property
            //modelInstance.sEzsigndocumentExternalid shouldBe ("TODO")
        }

    }
}