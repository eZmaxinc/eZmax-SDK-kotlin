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

import eZmaxApi.models.EzsigndocumentGetWordsPositionsV1Request

class EzsigndocumentGetWordsPositionsV1RequestTest : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsigndocumentGetWordsPositionsV1Request
        //val modelInstance = EzsigndocumentGetWordsPositionsV1Request()

        // to test the property `eGet` - Specify if you want to retrieve *All* words or specific *Words* from the document. If you specify *Words*, you must send the list of words to search for in *a_sWord*.
        should("test eGet") {
            // uncomment below to test the property
            //modelInstance.eGet shouldBe ("TODO")
        }

        // to test the property `bWordCaseSensitive` - IF *true*, words will be searched case-sensitive and results will be returned case-sensitive. IF *false*, words will be searched case-insensitive and results will be returned case-insensitive.
        should("test bWordCaseSensitive") {
            // uncomment below to test the property
            //modelInstance.bWordCaseSensitive shouldBe ("TODO")
        }

        // to test the property `aSWord` - Array of words to find in the document
        should("test aSWord") {
            // uncomment below to test the property
            //modelInstance.aSWord shouldBe ("TODO")
        }

    }
}
