/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.10
 * Contact: support-api@ezmax.ca
 *
 * Please note:
 * This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * Do not edit this file manually.
 */

@file:Suppress(
    "ArrayInDataClass",
    "EnumEntryName",
    "RemoveRedundantQualifierName",
    "UnusedImport"
)

package eZmaxApi.models

import eZmaxApi.models.EzsigntemplateMinusResponseCompound
import eZmaxApi.models.EzsigntemplatedocumentMinusResponse
import eZmaxApi.models.EzsigntemplatesignerMinusResponseCompound

import com.squareup.moshi.Json

/**
 * Payload for GET /1/object/ezsigntemplate/{pkiEzsigntemplateID}
 *
 * @param pkiEzsigntemplateID The unique ID of the Ezsigntemplate
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sLanguageNameX The Name of the Language in the language of the requester
 * @param sEzsigntemplateDescription The description of the Ezsigntemplate
 * @param bEzsigntemplateAdminonly Whether the Ezsigntemplate can be accessed by admin users only (eUserType=Normal)
 * @param sEzsignfoldertypeNameX The name of the Ezsignfoldertype in the language of the requester
 * @param aObjEzsigntemplatesigner 
 * @param fkiEzsigntemplatedocumentID The unique ID of the Ezsigntemplatedocument
 * @param objEzsigntemplatedocument 
 */

data class EzsigntemplateMinusGetObjectMinusV1MinusResponseMinusMPayload (

    /* The unique ID of the Ezsigntemplate */
    @Json(name = "pkiEzsigntemplateID")
    val pkiEzsigntemplateID: kotlin.Int,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    /* The Name of the Language in the language of the requester */
    @Json(name = "sLanguageNameX")
    val sLanguageNameX: kotlin.String,

    /* The description of the Ezsigntemplate */
    @Json(name = "sEzsigntemplateDescription")
    val sEzsigntemplateDescription: kotlin.String,

    /* Whether the Ezsigntemplate can be accessed by admin users only (eUserType=Normal) */
    @Json(name = "bEzsigntemplateAdminonly")
    val bEzsigntemplateAdminonly: kotlin.Boolean,

    /* The name of the Ezsignfoldertype in the language of the requester */
    @Json(name = "sEzsignfoldertypeNameX")
    val sEzsignfoldertypeNameX: kotlin.String,

    @Json(name = "a_objEzsigntemplatesigner")
    val aObjEzsigntemplatesigner: kotlin.collections.List<EzsigntemplatesignerMinusResponseCompound>,

    /* The unique ID of the Ezsigntemplatedocument */
    @Json(name = "fkiEzsigntemplatedocumentID")
    val fkiEzsigntemplatedocumentID: kotlin.Int? = null,

    @Json(name = "objEzsigntemplatedocument")
    val objEzsigntemplatedocument: EzsigntemplatedocumentMinusResponse? = null

)

