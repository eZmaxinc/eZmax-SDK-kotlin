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

import eZmaxApi.models.PermissionMinusResponseCompound

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Modulesection Object
 *
 * @param pkiModulesectionID The unique ID of the Modulesection
 * @param fkiModuleID The unique ID of the Module
 * @param sModulesectionInternalname The Internal name of the Module section.
 * @param sModulesectionNameX The Name of the Modulesection in the language of the requester
 * @param aObjPermission 
 */


data class ModulesectionMinusResponseCompound (

    /* The unique ID of the Modulesection */
    @Json(name = "pkiModulesectionID")
    val pkiModulesectionID: kotlin.Int,

    /* The unique ID of the Module */
    @Json(name = "fkiModuleID")
    val fkiModuleID: kotlin.Int,

    /* The Internal name of the Module section. */
    @Json(name = "sModulesectionInternalname")
    val sModulesectionInternalname: kotlin.String,

    /* The Name of the Modulesection in the language of the requester */
    @Json(name = "sModulesectionNameX")
    val sModulesectionNameX: kotlin.String,

    @Json(name = "a_objPermission")
    val aObjPermission: kotlin.collections.List<PermissionMinusResponseCompound>

)

