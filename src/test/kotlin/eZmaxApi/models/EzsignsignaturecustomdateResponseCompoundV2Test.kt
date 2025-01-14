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

import eZmaxApi.models.EzsignsignaturecustomdateResponseCompoundV2

class EzsignsignaturecustomdateResponseCompoundV2Test : ShouldSpec() {
    init {
        // uncomment below to create an instance of EzsignsignaturecustomdateResponseCompoundV2
        //val modelInstance = EzsignsignaturecustomdateResponseCompoundV2()

        // to test the property `pkiEzsignsignaturecustomdateID` - The unique ID of the Ezsignsignaturecustomdate
        should("test pkiEzsignsignaturecustomdateID") {
            // uncomment below to test the property
            //modelInstance.pkiEzsignsignaturecustomdateID shouldBe ("TODO")
        }

        // to test the property `iEzsignsignaturecustomdateOffsetx` - The X coordinate (Horizontal) where to put the Ezsignsignaturecustomdate on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignaturecustomdate block 2 inches from the left of the signature, you would use \"200\" for the X coordinate.
        should("test iEzsignsignaturecustomdateOffsetx") {
            // uncomment below to test the property
            //modelInstance.iEzsignsignaturecustomdateOffsetx shouldBe ("TODO")
        }

        // to test the property `iEzsignsignaturecustomdateOffsety` - The Y coordinate (Vertical) where to put the Ezsignsignaturecustomdate on the page.  Coordinate is calculated at 100dpi (dot per inch). So for example, if you want to put the Ezsignsignaturecustomdate block 3 inches from the top of the signature, you would use \"300\" for the Y coordinate.
        should("test iEzsignsignaturecustomdateOffsety") {
            // uncomment below to test the property
            //modelInstance.iEzsignsignaturecustomdateOffsety shouldBe ("TODO")
        }

        // to test the property `sEzsignsignaturecustomdateFormat` - The custom date format to use  You can use the codes below and they will be replaced at signature time. Text values like month and day names will be rendered in the proper language. Other text will be left as-is.  The codes examples below are based on the following datetime: Thursday, January 6, 2022 at 08:07:09 EST  For example, the format \"Signature date: {MM}/{DD}/{YYYY} {hh}:{mm}\" would become \"Signature date: 01/06/2022 08:07\"  **Year**  | Code | Example | | - | - | | {YYYY} | 2022 | | {YY} | 22 |  **Month**  | Code | Example | | - | - | | {MonthCapitalize} | Janvier | | {Month} | janvier | | {MM} | 01 | | {M} | 1 |  **Day**  | Code | Example | | - | - | | {DayCapitalize} | Jeudi | | {Day} | jeudi | | {DD} | 06 | | {D} | 6 |  **Hour**  | Code | Example | | - | - | | {hh} | 08 |  **Minute**  | Code | Example | | - | - | | {mm} | 07 |  **Second**  | Code | Example | | - | - | | {ss} | 09 |        **Timezone**  | Code | Example | | - | - | | {Z} | EST |       **Time**  | Code | Example | | - | - | | {Time} | 08:07:09 |   | {TimeZ} | 08:07:09 EST |     **Date**  | Code | Example | | - | - | | {Date} | 2022-01-06 |   | {DateText} | 1er Janvier 2022 |  **Full**  | Code | Example | | - | - | | {DateTime} | 2022-01-06 08:07:09 |   | {DateTimeZ} | 2022-01-06 08:07:09 EST | 
        should("test sEzsignsignaturecustomdateFormat") {
            // uncomment below to test the property
            //modelInstance.sEzsignsignaturecustomdateFormat shouldBe ("TODO")
        }

    }
}
