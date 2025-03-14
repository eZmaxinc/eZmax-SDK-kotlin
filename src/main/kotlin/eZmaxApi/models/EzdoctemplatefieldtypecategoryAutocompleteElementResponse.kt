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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezdoctemplatefieldtypecategory AutocompleteElement Response
 *
 * @param pkiEzdoctemplatefieldtypecategoryID The unique ID of the Ezdoctemplatefieldtypecategory
 * @param fkiEzdoctemplatetypeID The unique ID of the Ezdoctemplatetype
 * @param sEzdoctemplatefieldtypecategoryDescriptionX The description of the Ezdoctemplatefieldtypecategory in the language of the requester
 * @param bEzdoctemplatefieldtypecategoryIsactive Whether the Ezdoctemplatefieldtypecategory is active or not
 */


data class EzdoctemplatefieldtypecategoryAutocompleteElementResponse (

    /* The unique ID of the Ezdoctemplatefieldtypecategory */
    @Json(name = "pkiEzdoctemplatefieldtypecategoryID")
    val pkiEzdoctemplatefieldtypecategoryID: kotlin.Int,

    /* The unique ID of the Ezdoctemplatetype */
    @Json(name = "fkiEzdoctemplatetypeID")
    val fkiEzdoctemplatetypeID: kotlin.Int,

    /* The description of the Ezdoctemplatefieldtypecategory in the language of the requester */
    @Json(name = "sEzdoctemplatefieldtypecategoryDescriptionX")
    val sEzdoctemplatefieldtypecategoryDescriptionX: kotlin.String,

    /* Whether the Ezdoctemplatefieldtypecategory is active or not */
    @Json(name = "bEzdoctemplatefieldtypecategoryIsactive")
    val bEzdoctemplatefieldtypecategoryIsactive: kotlin.Boolean

) {


}

