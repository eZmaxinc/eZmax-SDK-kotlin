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
 * A Ezdoctemplatetype AutocompleteElement Response
 *
 * @param pkiEzdoctemplatetypeID The unique ID of the Ezdoctemplatetype
 * @param sEzdoctemplatetypeDescriptionX The description of the Ezdoctemplatetype in the language of the requester
 * @param bEzdoctemplatetypeIsactive Whether the Ezdoctemplatetype is active or not
 */


data class EzdoctemplatetypeAutocompleteElementResponse (

    /* The unique ID of the Ezdoctemplatetype */
    @Json(name = "pkiEzdoctemplatetypeID")
    val pkiEzdoctemplatetypeID: kotlin.Int,

    /* The description of the Ezdoctemplatetype in the language of the requester */
    @Json(name = "sEzdoctemplatetypeDescriptionX")
    val sEzdoctemplatetypeDescriptionX: kotlin.String,

    /* Whether the Ezdoctemplatetype is active or not */
    @Json(name = "bEzdoctemplatetypeIsactive")
    val bEzdoctemplatetypeIsactive: kotlin.Boolean

) {


}

