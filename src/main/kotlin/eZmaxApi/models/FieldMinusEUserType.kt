/**
 * eZmax API Definition (Full)
 *
 * This API expose all the functionnalities for the eZmax and eZsign applications.
 *
 * The version of the OpenAPI document: 1.1.9
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


import com.squareup.moshi.Json

/**
 * The user type of the User.
 *
 * Values: AgentBroker,Assistant,Attendance,Customer,Employee,Ezcom,EzsignSigner,EzsignUser,FranchiseCustomerServer,Normal,RewardAdministration,RewardMember,RewardRepresentative,RewardCustomer,RewardDistributorServer,Supplier,VetrxCustomer,Vetrxcustomergroup,VetrxCustomerServer,VetrxManufacturer,VetrxVendor
 */

enum class FieldMinusEUserType(val value: kotlin.String) {

    @Json(name = "AgentBroker")
    AgentBroker("AgentBroker"),

    @Json(name = "Assistant")
    Assistant("Assistant"),

    @Json(name = "Attendance")
    Attendance("Attendance"),

    @Json(name = "Customer")
    Customer("Customer"),

    @Json(name = "Employee")
    Employee("Employee"),

    @Json(name = "Ezcom")
    Ezcom("Ezcom"),

    @Json(name = "EzsignSigner")
    EzsignSigner("EzsignSigner"),

    @Json(name = "EzsignUser")
    EzsignUser("EzsignUser"),

    @Json(name = "FranchiseCustomerServer")
    FranchiseCustomerServer("FranchiseCustomerServer"),

    @Json(name = "Normal")
    Normal("Normal"),

    @Json(name = "RewardAdministration")
    RewardAdministration("RewardAdministration"),

    @Json(name = "RewardMember")
    RewardMember("RewardMember"),

    @Json(name = "RewardRepresentative")
    RewardRepresentative("RewardRepresentative"),

    @Json(name = "RewardCustomer")
    RewardCustomer("RewardCustomer"),

    @Json(name = "RewardDistributorServer")
    RewardDistributorServer("RewardDistributorServer"),

    @Json(name = "Supplier")
    Supplier("Supplier"),

    @Json(name = "VetrxCustomer")
    VetrxCustomer("VetrxCustomer"),

    @Json(name = "Vetrxcustomergroup")
    Vetrxcustomergroup("Vetrxcustomergroup"),

    @Json(name = "VetrxCustomerServer")
    VetrxCustomerServer("VetrxCustomerServer"),

    @Json(name = "VetrxManufacturer")
    VetrxManufacturer("VetrxManufacturer"),

    @Json(name = "VetrxVendor")
    VetrxVendor("VetrxVendor");

    /**
     * Override toString() to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldMinusEUserType) "$data" else null

        /**
         * Returns a valid [FieldMinusEUserType] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldMinusEUserType? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

