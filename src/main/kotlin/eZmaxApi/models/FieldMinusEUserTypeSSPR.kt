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
* The user type of the User for SSPR
* Values: EzsignUser,Native
*/

enum class FieldMinusEUserTypeSSPR(val value: kotlin.String) {


    @Json(name = "EzsignUser")
    EzsignUser("EzsignUser"),

    @Json(name = "Native")
    Native("Native");


    /**
    This override toString avoids using the enum var name and uses the actual api value instead.
    In cases the var name and value are different, the client would send incorrect enums to the server.
    **/
    override fun toString(): String {
        return value
    }
}

