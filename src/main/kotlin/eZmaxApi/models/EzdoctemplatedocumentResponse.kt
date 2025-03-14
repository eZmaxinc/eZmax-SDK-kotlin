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

import eZmaxApi.models.FieldEEzdoctemplatedocumentPrivacylevel
import eZmaxApi.models.MultilingualEzdoctemplatedocumentName

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Ezdoctemplatedocument Object
 *
 * @param pkiEzdoctemplatedocumentID The unique ID of the Ezdoctemplatedocument
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param fkiEzdoctemplatetypeID The unique ID of the Ezdoctemplatetype
 * @param fkiEzdoctemplatefieldtypecategoryID The unique ID of the Ezdoctemplatefieldtypecategory
 * @param bEzdoctemplatedocumentIsactive Whether the ezdoctemplatedocument is active or not
 * @param objEzdoctemplatedocumentName 
 * @param sEzdoctemplatefieldtypecategoryDescriptionX The description of the Ezdoctemplatefieldtypecategory in the language of the requester
 * @param sEzdoctemplatetypeDescriptionX The description of the Ezdoctemplatetype in the language of the requester
 * @param fkiEzsignfoldertypeID The unique ID of the Ezsignfoldertype.
 * @param eEzdoctemplatedocumentPrivacylevel 
 * @param sEzdoctemplatedocumentNameX The name of the Ezdoctemplatedocument in the language of the requester
 * @param sEzsignfoldertypeNameX The name of the Ezsignfoldertype in the language of the requester
 */


data class EzdoctemplatedocumentResponse (

    /* The unique ID of the Ezdoctemplatedocument */
    @Json(name = "pkiEzdoctemplatedocumentID")
    val pkiEzdoctemplatedocumentID: kotlin.Int,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    /* The unique ID of the Ezdoctemplatetype */
    @Json(name = "fkiEzdoctemplatetypeID")
    val fkiEzdoctemplatetypeID: kotlin.Int,

    /* The unique ID of the Ezdoctemplatefieldtypecategory */
    @Json(name = "fkiEzdoctemplatefieldtypecategoryID")
    val fkiEzdoctemplatefieldtypecategoryID: kotlin.Int,

    /* Whether the ezdoctemplatedocument is active or not */
    @Json(name = "bEzdoctemplatedocumentIsactive")
    val bEzdoctemplatedocumentIsactive: kotlin.Boolean,

    @Json(name = "objEzdoctemplatedocumentName")
    val objEzdoctemplatedocumentName: MultilingualEzdoctemplatedocumentName,

    /* The description of the Ezdoctemplatefieldtypecategory in the language of the requester */
    @Json(name = "sEzdoctemplatefieldtypecategoryDescriptionX")
    val sEzdoctemplatefieldtypecategoryDescriptionX: kotlin.String,

    /* The description of the Ezdoctemplatetype in the language of the requester */
    @Json(name = "sEzdoctemplatetypeDescriptionX")
    val sEzdoctemplatetypeDescriptionX: kotlin.String,

    /* The unique ID of the Ezsignfoldertype. */
    @Json(name = "fkiEzsignfoldertypeID")
    val fkiEzsignfoldertypeID: kotlin.Int? = null,

    @Json(name = "eEzdoctemplatedocumentPrivacylevel")
    val eEzdoctemplatedocumentPrivacylevel: FieldEEzdoctemplatedocumentPrivacylevel? = null,

    /* The name of the Ezdoctemplatedocument in the language of the requester */
    @Json(name = "sEzdoctemplatedocumentNameX")
    val sEzdoctemplatedocumentNameX: kotlin.String? = null,

    /* The name of the Ezsignfoldertype in the language of the requester */
    @Json(name = "sEzsignfoldertypeNameX")
    val sEzsignfoldertypeNameX: kotlin.String? = null

) {


}

