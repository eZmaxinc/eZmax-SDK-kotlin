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

import eZmaxApi.models.EzsignbulksendCreateEzsignbulksendtransmissionV1Request
import eZmaxApi.models.FieldEEzsignfolderSendreminderfrequency

class EzsignbulksendCreateEzsignbulksendtransmissionV1RequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsignbulksendCreateEzsignbulksendtransmissionV1Request
        //val modelInstance = EzsignbulksendCreateEzsignbulksendtransmissionV1Request()

        // to test the property `fkiUserlogintypeID` - The unique ID of the Userlogintype  Valid values:  |Value|Description|Detail| |-|-|-| |1|**Email Only**|The Ezsignsigner will receive a secure link by email| |2|**Email and phone or SMS**|The Ezsignsigner will receive a secure link by email and will need to authenticate using SMS or Phone call. **Additional fee applies**| |3|**Email and secret question**|The Ezsignsigner will receive a secure link by email and will need to authenticate using a predefined question and answer| |4|**In person only**|The Ezsignsigner will only be able to sign \"In-Person\" and there won't be any authentication. No email will be sent for invitation to sign. Make sure you evaluate the risk of signature denial and at minimum, we recommend you use a handwritten signature type| |5|**In person with phone or SMS**|The Ezsignsigner will only be able to sign \"In-Person\" and will need to authenticate using SMS or Phone call. No email will be sent for invitation to sign. **Additional fee applies**|
        should("test fkiUserlogintypeID") {
            // uncomment below to test the property
            //modelInstance.fkiUserlogintypeID shouldBe ("TODO")
        }

        // to test the property `sEzsignbulksendtransmissionDescription` - The description of the Ezsignbulksendtransmission
        should("test sEzsignbulksendtransmissionDescription") {
            // uncomment below to test the property
            //modelInstance.sEzsignbulksendtransmissionDescription shouldBe ("TODO")
        }

        // to test the property `dtEzsigndocumentDuedate` - The maximum date and time at which the Ezsigndocument can be signed.
        should("test dtEzsigndocumentDuedate") {
            // uncomment below to test the property
            //modelInstance.dtEzsigndocumentDuedate shouldBe ("TODO")
        }

        // to test the property `eEzsignfolderSendreminderfrequency`
        should("test eEzsignfolderSendreminderfrequency") {
            // uncomment below to test the property
            //modelInstance.eEzsignfolderSendreminderfrequency shouldBe ("TODO")
        }

        // to test the property `tExtraMessage` - A custom text message that will be added to the email sent.
        should("test tExtraMessage") {
            // uncomment below to test the property
            //modelInstance.tExtraMessage shouldBe ("TODO")
        }

        // to test the property `sCsvBase64` - The Base64 encoded binary content of the CSV file.
        should("test sCsvBase64") {
            // uncomment below to test the property
            //modelInstance.sCsvBase64 shouldBe ("TODO")
        }

        // to test the property `fkiEzsigntsarequirementID` - The unique ID of the Ezsigntsarequirement.  Determine if a Time Stamping Authority should add a timestamp on each of the signature. Valid values:  |Value|Description| |-|-| |1|No. TSA Timestamping will requested. This will make all signatures a lot faster since no round-trip to the TSA server will be required. Timestamping will be made using eZsign server's time.| |2|Best effort. Timestamping from a Time Stamping Authority will be requested but is not mandatory. In the very improbable case it cannot be completed, the timestamping will be made using eZsign server's time. **Additional fee applies**| |3|Mandatory. Timestamping from a Time Stamping Authority will be requested and is mandatory. In the very improbable case it cannot be completed, the signature will fail and the user will be asked to retry. **Additional fee applies**|
        should("test fkiEzsigntsarequirementID") {
            // uncomment below to test the property
            //modelInstance.fkiEzsigntsarequirementID shouldBe ("TODO")
        }

    }
}
