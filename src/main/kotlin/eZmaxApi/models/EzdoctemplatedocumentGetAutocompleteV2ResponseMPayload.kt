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

import eZmaxApi.models.EzdoctemplatedocumentAutocompleteElementResponse

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * Payload for POST /2/object/ezdoctemplatedocument/getAutocomplete
 *
 * @param aObjEzdoctemplatedocument An array of Ezdoctemplatedocument autocomplete element response.
 */


data class EzdoctemplatedocumentGetAutocompleteV2ResponseMPayload (

    /* An array of Ezdoctemplatedocument autocomplete element response. */
    @Json(name = "a_objEzdoctemplatedocument")
    val aObjEzdoctemplatedocument: kotlin.collections.List<EzdoctemplatedocumentAutocompleteElementResponse>

) {


}

