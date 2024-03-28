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

import eZmaxApi.models.ScimServiceProviderConfigFilter

class ScimServiceProviderConfigFilterTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of ScimServiceProviderConfigFilter
        //val modelInstance = ScimServiceProviderConfigFilter()

        // to test the property `supported` - A Boolean value specifying whether or not the operation is supported.
        should("test supported") {
            // uncomment below to test the property
            //modelInstance.supported shouldBe ("TODO")
        }

        // to test the property `maxResults` - An integer value specifying the maximum number of resources returned in a response.
        should("test maxResults") {
            // uncomment below to test the property
            //modelInstance.maxResults shouldBe ("TODO")
        }

    }
}