/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.43
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxApi.models


import com.squareup.moshi.Json

/**
* The signature step of the Ezsignfolder.
* Values: Unsent,Sent,PartiallySigned,Expired,Signed,Completed,Archived
*/

enum class FieldMinusEEzsignfolderStep(val value: kotlin.String) {


    @Json(name = "Unsent")
    Unsent("Unsent"),

    @Json(name = "Sent")
    Sent("Sent"),

    @Json(name = "PartiallySigned")
    PartiallySigned("PartiallySigned"),

    @Json(name = "Expired")
    Expired("Expired"),

    @Json(name = "Signed")
    Signed("Signed"),

    @Json(name = "Completed")
    Completed("Completed"),

    @Json(name = "Archived")
    Archived("Archived");


    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }
}

