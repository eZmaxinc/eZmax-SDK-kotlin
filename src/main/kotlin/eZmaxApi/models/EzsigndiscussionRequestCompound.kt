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

import eZmaxApi.models.DiscussionRequest
import eZmaxApi.models.EzsigndiscussionRequest

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezsigndiscussion Object and children
 *
 * @param fkiEzsigndocumentID The unique ID of the Ezsigndocument
 * @param iEzsigndiscussionPagenumber The page number in the Ezsigndocument for the Ezsigndiscussion
 * @param iEzsigndiscussionX The x of the Ezsigndiscussion
 * @param iEzsigndiscussionY The y of the Ezsigndiscussion
 * @param objDiscussion 
 * @param pkiEzsigndiscussionID The unique ID of the Ezsigndiscussion
 */


class EzsigndiscussionRequestCompound (

    /* The unique ID of the Ezsigndocument */
    @Json(name = "fkiEzsigndocumentID")
    override val fkiEzsigndocumentID: kotlin.Int,

    /* The page number in the Ezsigndocument for the Ezsigndiscussion */
    @Json(name = "iEzsigndiscussionPagenumber")
    override val iEzsigndiscussionPagenumber: kotlin.Int,

    /* The x of the Ezsigndiscussion */
    @Json(name = "iEzsigndiscussionX")
    override val iEzsigndiscussionX: kotlin.Int,

    /* The y of the Ezsigndiscussion */
    @Json(name = "iEzsigndiscussionY")
    override val iEzsigndiscussionY: kotlin.Int,

    @Json(name = "objDiscussion")
    override val objDiscussion: DiscussionRequest,

    /* The unique ID of the Ezsigndiscussion */
    @Json(name = "pkiEzsigndiscussionID")
    override val pkiEzsigndiscussionID: kotlin.Int? = null

) : EzsigndiscussionRequest {


}

