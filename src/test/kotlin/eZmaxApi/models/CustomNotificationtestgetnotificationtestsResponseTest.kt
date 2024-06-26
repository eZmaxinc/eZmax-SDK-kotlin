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

import eZmaxApi.models.CustomNotificationtestgetnotificationtestsResponse
import eZmaxApi.models.FieldENotificationpreferenceStatus
import eZmaxApi.models.MultilingualNotificationtestName

class CustomNotificationtestgetnotificationtestsResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of CustomNotificationtestgetnotificationtestsResponse
        //val modelInstance = CustomNotificationtestgetnotificationtestsResponse()

        // to test the property `pkiNotificationtestID` - The unique ID of the Notificationtest
        should("test pkiNotificationtestID") {
            // uncomment below to test the property
            //modelInstance.pkiNotificationtestID shouldBe ("TODO")
        }

        // to test the property `objNotificationtestName`
        should("test objNotificationtestName") {
            // uncomment below to test the property
            //modelInstance.objNotificationtestName shouldBe ("TODO")
        }

        // to test the property `fkiNotificationsubsectionID` - The unique ID of the Notificationsubsection
        should("test fkiNotificationsubsectionID") {
            // uncomment below to test the property
            //modelInstance.fkiNotificationsubsectionID shouldBe ("TODO")
        }

        // to test the property `sNotificationtestFunction` - The function name of the Notificationtest
        should("test sNotificationtestFunction") {
            // uncomment below to test the property
            //modelInstance.sNotificationtestFunction shouldBe ("TODO")
        }

        // to test the property `sNotificationtestNameX` - The name of the Notificationtest in the language of the requester
        should("test sNotificationtestNameX") {
            // uncomment below to test the property
            //modelInstance.sNotificationtestNameX shouldBe ("TODO")
        }

        // to test the property `eNotificationpreferenceStatus`
        should("test eNotificationpreferenceStatus") {
            // uncomment below to test the property
            //modelInstance.eNotificationpreferenceStatus shouldBe ("TODO")
        }

        // to test the property `iNotificationtest` - The number of elements returned by the Notificationtest
        should("test iNotificationtest") {
            // uncomment below to test the property
            //modelInstance.iNotificationtest shouldBe ("TODO")
        }

    }
}
