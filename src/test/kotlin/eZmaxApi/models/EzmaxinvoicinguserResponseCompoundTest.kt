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

import eZmaxApi.models.EzmaxinvoicinguserResponseCompound
import eZmaxApi.models.CustomContactNameResponse
import eZmaxApi.models.FieldEEzmaxinvoicinguserVariationezsign

class EzmaxinvoicinguserResponseCompoundTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzmaxinvoicinguserResponseCompound
        //val modelInstance = EzmaxinvoicinguserResponseCompound()

        // to test the property `fkiBillingentityinternalID` - The unique ID of the Billingentityinternal.
        should("test fkiBillingentityinternalID") {
            // uncomment below to test the property
            //modelInstance.fkiBillingentityinternalID shouldBe ("TODO")
        }

        // to test the property `sBillingentityinternalDescriptionX` - The description of the Billingentityinternal in the language of the requester
        should("test sBillingentityinternalDescriptionX") {
            // uncomment below to test the property
            //modelInstance.sBillingentityinternalDescriptionX shouldBe ("TODO")
        }

        // to test the property `fkiUserID` - The unique ID of the User
        should("test fkiUserID") {
            // uncomment below to test the property
            //modelInstance.fkiUserID shouldBe ("TODO")
        }

        // to test the property `iEzmaxinvoicinguserEzsigndocument` - The number of ezsign documents
        should("test iEzmaxinvoicinguserEzsigndocument") {
            // uncomment below to test the property
            //modelInstance.iEzmaxinvoicinguserEzsigndocument shouldBe ("TODO")
        }

        // to test the property `bEzmaxinvoicinguserEzsignaccount` - Whether there is an eZsign account
        should("test bEzmaxinvoicinguserEzsignaccount") {
            // uncomment below to test the property
            //modelInstance.bEzmaxinvoicinguserEzsignaccount shouldBe ("TODO")
        }

        // to test the property `bEzmaxinvoicinguserBillableezsign` - Whether it is billable for eZsign
        should("test bEzmaxinvoicinguserBillableezsign") {
            // uncomment below to test the property
            //modelInstance.bEzmaxinvoicinguserBillableezsign shouldBe ("TODO")
        }

        // to test the property `eEzmaxinvoicinguserVariationezsign`
        should("test eEzmaxinvoicinguserVariationezsign") {
            // uncomment below to test the property
            //modelInstance.eEzmaxinvoicinguserVariationezsign shouldBe ("TODO")
        }

        // to test the property `objContactName`
        should("test objContactName") {
            // uncomment below to test the property
            //modelInstance.objContactName shouldBe ("TODO")
        }

        // to test the property `pkiEzmaxinvoicinguserID` - The unique ID of the Ezmaxinvoicinguser
        should("test pkiEzmaxinvoicinguserID") {
            // uncomment below to test the property
            //modelInstance.pkiEzmaxinvoicinguserID shouldBe ("TODO")
        }

        // to test the property `fkiEzmaxinvoicingID` - The unique ID of the Ezmaxinvoicing
        should("test fkiEzmaxinvoicingID") {
            // uncomment below to test the property
            //modelInstance.fkiEzmaxinvoicingID shouldBe ("TODO")
        }

    }
}
