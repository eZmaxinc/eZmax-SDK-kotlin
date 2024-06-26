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

import eZmaxApi.models.NotificationsubsectionResponse
import eZmaxApi.models.MultilingualNotificationsubsectionName

class NotificationsubsectionResponseTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of NotificationsubsectionResponse
        //val modelInstance = NotificationsubsectionResponse()

        // to test the property `pkiNotificationsubsectionID` - The unique ID of the Notificationsubsection
        should("test pkiNotificationsubsectionID") {
            // uncomment below to test the property
            //modelInstance.pkiNotificationsubsectionID shouldBe ("TODO")
        }

        // to test the property `fkiNotificationsectionID` - The unique ID of the Notificationsection
        should("test fkiNotificationsectionID") {
            // uncomment below to test the property
            //modelInstance.fkiNotificationsectionID shouldBe ("TODO")
        }

        // to test the property `sNotificationsubsectionNameX` - The name of the Notificationsubsection in the language of the requester
        should("test sNotificationsubsectionNameX") {
            // uncomment below to test the property
            //modelInstance.sNotificationsubsectionNameX shouldBe ("TODO")
        }

        // to test the property `objNotificationsubsectionName`
        should("test objNotificationsubsectionName") {
            // uncomment below to test the property
            //modelInstance.objNotificationsubsectionName shouldBe ("TODO")
        }

        // to test the property `sNotificationsectionNameX` - The name of the Notificationsection in the language of the requester
        should("test sNotificationsectionNameX") {
            // uncomment below to test the property
            //modelInstance.sNotificationsectionNameX shouldBe ("TODO")
        }

    }
}
