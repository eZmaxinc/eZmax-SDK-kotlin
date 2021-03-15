/**
* eZmax API Definition
* This API expose all the functionnalities for the eZmax and eZsign applications.
*
* The version of the OpenAPI document: 1.0.35
* Contact: support-api@ezmax.ca
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
package eZmaxinc/eZmax-SDK-kotlin.models


import com.squareup.moshi.Json

/**
* The signature step of the Ezsigndocument.
* Values: Unsent,Unsigned,PartiallySigned,Completed
*/

enum class FieldMinusEEzsigndocumentStep(val value: kotlin.String){


    @Json(name = "Unsent")
    Unsent("Unsent"),


    @Json(name = "Unsigned")
    Unsigned("Unsigned"),


    @Json(name = "PartiallySigned")
    PartiallySigned("PartiallySigned"),


    @Json(name = "Completed")
    Completed("Completed");



    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }

}

