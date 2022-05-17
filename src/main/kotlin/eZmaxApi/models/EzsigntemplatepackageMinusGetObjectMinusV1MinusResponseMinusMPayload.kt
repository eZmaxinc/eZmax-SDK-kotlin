/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.7
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

import eZmaxApi.models.EzsigntemplatepackageMinusResponseCompound
import eZmaxApi.models.EzsigntemplatepackagemembershipMinusResponseCompound
import eZmaxApi.models.EzsigntemplatepackagesignerMinusResponseCompound

import com.squareup.moshi.Json

/**
 * Payload for GET /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID}
 *
 * @param pkiEzsigntemplatepackageID The unique ID of the Ezsigntemplatepackage
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param sLanguageNameX The Name of the Language in the language of the requester
 * @param sEzsigntemplatepackageDescription The description of the Ezsigntemplatepackage
 * @param bEzsigntemplatepackageAdminonly Whether the Ezsigntemplatepackage can be accessed by admin users only (eUserType=Normal)
 * @param bEzsigntemplatepackageNeedvalidation Whether the Ezsignbulksend was automatically modified and needs a manual validation
 * @param bEzsigntemplatepackageIsactive Whether the Ezsigntemplatepackage is active or not
 * @param sEzsignfoldertypeNameX The name of the Ezsignfoldertype in the language of the requester
 * @param aObjEzsigntemplatepackagesigner 
 * @param aObjEzsigntemplatepackagemembership 
 */

data class EzsigntemplatepackageMinusGetObjectMinusV1MinusResponseMinusMPayload (

    /* The unique ID of the Ezsigntemplatepackage */
    @Json(name = "pkiEzsigntemplatepackageID")
    val pkiEzsigntemplatepackageID: kotlin.Int,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    /* The Name of the Language in the language of the requester */
    @Json(name = "sLanguageNameX")
    val sLanguageNameX: kotlin.String,

    /* The description of the Ezsigntemplatepackage */
    @Json(name = "sEzsigntemplatepackageDescription")
    val sEzsigntemplatepackageDescription: kotlin.String,

    /* Whether the Ezsigntemplatepackage can be accessed by admin users only (eUserType=Normal) */
    @Json(name = "bEzsigntemplatepackageAdminonly")
    val bEzsigntemplatepackageAdminonly: kotlin.Boolean,

    /* Whether the Ezsignbulksend was automatically modified and needs a manual validation */
    @Json(name = "bEzsigntemplatepackageNeedvalidation")
    val bEzsigntemplatepackageNeedvalidation: kotlin.Boolean,

    /* Whether the Ezsigntemplatepackage is active or not */
    @Json(name = "bEzsigntemplatepackageIsactive")
    val bEzsigntemplatepackageIsactive: kotlin.Boolean,

    /* The name of the Ezsignfoldertype in the language of the requester */
    @Json(name = "sEzsignfoldertypeNameX")
    val sEzsignfoldertypeNameX: kotlin.String,

    @Json(name = "a_objEzsigntemplatepackagesigner")
    val aObjEzsigntemplatepackagesigner: kotlin.collections.List<EzsigntemplatepackagesignerMinusResponseCompound>,

    @Json(name = "a_objEzsigntemplatepackagemembership")
    val aObjEzsigntemplatepackagemembership: kotlin.collections.List<EzsigntemplatepackagemembershipMinusResponseCompound>

)

