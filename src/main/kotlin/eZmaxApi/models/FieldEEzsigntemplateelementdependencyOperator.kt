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


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * The operator of the Ezsigntemplateelementdependency
 *
 * Values: eq,neq,gt,gte,lt,lte,`in`,nin,rg,like,between
 */

@JsonClass(generateAdapter = false)
enum class FieldEEzsigntemplateelementdependencyOperator(val value: kotlin.String) {

    @Json(name = "eq")
    eq("eq"),

    @Json(name = "neq")
    neq("neq"),

    @Json(name = "gt")
    gt("gt"),

    @Json(name = "gte")
    gte("gte"),

    @Json(name = "lt")
    lt("lt"),

    @Json(name = "lte")
    lte("lte"),

    @Json(name = "in")
    `in`("in"),

    @Json(name = "nin")
    nin("nin"),

    @Json(name = "rg")
    rg("rg"),

    @Json(name = "like")
    like("like"),

    @Json(name = "between")
    between("between");

    /**
     * Override [toString()] to avoid using the enum variable name as the value, and instead use
     * the actual value defined in the API spec file.
     *
     * This solves a problem when the variable name and its value are different, and ensures that
     * the client sends the correct enum values to the server always.
     */
    override fun toString(): kotlin.String = value

    companion object {
        /**
         * Converts the provided [data] to a [String] on success, null otherwise.
         */
        fun encode(data: kotlin.Any?): kotlin.String? = if (data is FieldEEzsigntemplateelementdependencyOperator) "$data" else null

        /**
         * Returns a valid [FieldEEzsigntemplateelementdependencyOperator] for [data], null otherwise.
         */
        fun decode(data: kotlin.Any?): FieldEEzsigntemplateelementdependencyOperator? = data?.let {
          val normalizedData = "$it".lowercase()
          values().firstOrNull { value ->
            it == value || normalizedData == "$value".lowercase()
          }
        }
    }
}

