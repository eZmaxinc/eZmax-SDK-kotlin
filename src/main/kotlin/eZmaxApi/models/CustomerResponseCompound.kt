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

import eZmaxApi.models.FieldECustomerMarketingcorrespondence
import eZmaxApi.models.FieldECustomerType

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

/**
 * A Customer Object
 *
 * @param pkiCustomerID The unique ID of the Customer.
 * @param fkiCompanyID The unique ID of the Company
 * @param fkiCustomergroupID The unique ID of the Customergroup
 * @param sCustomerName The name of the Customer
 * @param fkiContactinformationsID The unique ID of the Contactinformations
 * @param fkiContactcontainerID The unique ID of the Contactcontainer
 * @param fkiImageID The unique ID of the Image
 * @param fkiGlaccountcontainerID The unique ID of the Glaccountcontainer
 * @param fkiLanguageID The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English|
 * @param fkiDepartmentID The unique ID of the Department
 * @param fkiPaymentmethodID The unique ID of the Paymentmethod
 * @param fkiElectronicfundstransferbankaccountID The unique ID of the Electronicfundstransferbankaccount
 * @param fkiElectronicfundstransferbankaccountIDDirectdebit The unique ID of the Electronicfundstransferbankaccount
 * @param fkiSendingmethodID The unique ID of the Sendingmethod
 * @param fkiTaxassignmentID The unique ID of the Taxassignment.  Valid values:  |Value|Description| |-|-| |1|No tax| |2|GST| |3|HST (ON)| |4|HST (NB)| |5|HST (NS)| |6|HST (NL)| |7|HST (PE)| |8|GST + QST (QC)| |9|GST + QST (QC) Non-Recoverable| |10|GST + PST (BC)| |11|GST + PST (SK)| |12|GST + RST (MB)| |13|GST + PST (BC) Non-Recoverable| |14|GST + PST (SK) Non-Recoverable| |15|GST + RST (MB) Non-Recoverable|
 * @param fkiAttendancestatusID The unique ID of the Attendancestatus
 * @param fkiAgentIDVariableexpensechargeto The unique ID of the Agent.
 * @param fkiBrokerIDVariableexpensechargeto The unique ID of the Broker.
 * @param fkiCustomerIDVariableexpensechargeto The unique ID of the Customer.
 * @param fkiGlaccountcontainerIDVariableexpensechargeto The unique ID of the Glaccountcontainer
 * @param fkiAgentIDSupplychargechargeto The unique ID of the Agent.
 * @param fkiBrokerIDSupplychargechargeto The unique ID of the Broker.
 * @param fkiCustomerIDSupplychargechargeto The unique ID of the Customer.
 * @param fkiGlaccountcontainerIDSupplychargechargeto The unique ID of the Glaccountcontainer
 * @param fkiInvoicealternatelogoID The unique ID of the Invoicealternatelogo
 * @param fkiSynchronizationlinkserverID The unique ID of the Synchronizationlinkserver
 * @param sCustomerCode The code of the Customer
 * @param dCustomerFulltimeequivalent The fulltimeequivalent of the Customer
 * @param iCustomerPhotocopiercode The photocopiercode of the Customer
 * @param iCustomerLongdistancecode The longdistancecode of the Customer
 * @param iCustomerTimewindowstart The timewindowstart of the Customer
 * @param iCustomerTimewindowend The timewindowend of the Customer
 * @param dCustomerMinimumchargeableinterests The minimumchargeableinterests of the Customer
 * @param dtCustomerBirthdate The birthdate of the Customer
 * @param dtCustomerTransfer The transfer of the Customer
 * @param dtCustomerTransferappointment The transferappointment of the Customer
 * @param dtCustomerTransfersurvey The transfersurvey of the Customer
 * @param bCustomerIsactive Whether the customer is active or not
 * @param bCustomerVariableexpensefinanced Whether if it's an variableexpensefinanced
 * @param bCustomerVariableexpensefinancedtaxes Whether if it's an variableexpensefinancedtaxes
 * @param bCustomerSupplychargefinanced Whether if it's an supplychargefinanced
 * @param bCustomerSupplychargefinancedtaxes Whether if it's an supplychargefinancedtaxes
 * @param bCustomerAttendance Whether if it's an attendance
 * @param eCustomerType 
 * @param eCustomerMarketingcorrespondence 
 * @param bCustomerBlackcopycarbon Whether if it's an blackcopycarbon
 * @param bCustomerUnsubscribeinfo Whether if it's an unsubscribeinfo
 * @param tCustomerComment The comment of the Customer
 * @param efkiUserID The unique ID of the User
 * @param efksCustomerCode The code of the Customer
 * @param IMPORTID 
 */


data class CustomerResponseCompound (

    /* The unique ID of the Customer. */
    @Json(name = "pkiCustomerID")
    val pkiCustomerID: kotlin.Int,

    /* The unique ID of the Company */
    @Json(name = "fkiCompanyID")
    val fkiCompanyID: kotlin.Int,

    /* The unique ID of the Customergroup */
    @Json(name = "fkiCustomergroupID")
    val fkiCustomergroupID: kotlin.Int,

    /* The name of the Customer */
    @Json(name = "sCustomerName")
    val sCustomerName: kotlin.String,

    /* The unique ID of the Contactinformations */
    @Json(name = "fkiContactinformationsID")
    val fkiContactinformationsID: kotlin.Int,

    /* The unique ID of the Contactcontainer */
    @Json(name = "fkiContactcontainerID")
    val fkiContactcontainerID: kotlin.Int,

    /* The unique ID of the Image */
    @Json(name = "fkiImageID")
    val fkiImageID: kotlin.Int,

    /* The unique ID of the Glaccountcontainer */
    @Json(name = "fkiGlaccountcontainerID")
    val fkiGlaccountcontainerID: kotlin.Int,

    /* The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| */
    @Json(name = "fkiLanguageID")
    val fkiLanguageID: kotlin.Int,

    /* The unique ID of the Department */
    @Json(name = "fkiDepartmentID")
    val fkiDepartmentID: kotlin.Int,

    /* The unique ID of the Paymentmethod */
    @Json(name = "fkiPaymentmethodID")
    val fkiPaymentmethodID: kotlin.Int,

    /* The unique ID of the Electronicfundstransferbankaccount */
    @Json(name = "fkiElectronicfundstransferbankaccountID")
    val fkiElectronicfundstransferbankaccountID: kotlin.Int,

    /* The unique ID of the Electronicfundstransferbankaccount */
    @Json(name = "fkiElectronicfundstransferbankaccountIDDirectdebit")
    val fkiElectronicfundstransferbankaccountIDDirectdebit: kotlin.Int,

    /* The unique ID of the Sendingmethod */
    @Json(name = "fkiSendingmethodID")
    val fkiSendingmethodID: kotlin.Int,

    /* The unique ID of the Taxassignment.  Valid values:  |Value|Description| |-|-| |1|No tax| |2|GST| |3|HST (ON)| |4|HST (NB)| |5|HST (NS)| |6|HST (NL)| |7|HST (PE)| |8|GST + QST (QC)| |9|GST + QST (QC) Non-Recoverable| |10|GST + PST (BC)| |11|GST + PST (SK)| |12|GST + RST (MB)| |13|GST + PST (BC) Non-Recoverable| |14|GST + PST (SK) Non-Recoverable| |15|GST + RST (MB) Non-Recoverable| */
    @Json(name = "fkiTaxassignmentID")
    val fkiTaxassignmentID: kotlin.Int,

    /* The unique ID of the Attendancestatus */
    @Json(name = "fkiAttendancestatusID")
    val fkiAttendancestatusID: kotlin.Int,

    /* The unique ID of the Agent. */
    @Json(name = "fkiAgentIDVariableexpensechargeto")
    val fkiAgentIDVariableexpensechargeto: kotlin.Int,

    /* The unique ID of the Broker. */
    @Json(name = "fkiBrokerIDVariableexpensechargeto")
    val fkiBrokerIDVariableexpensechargeto: kotlin.Int,

    /* The unique ID of the Customer. */
    @Json(name = "fkiCustomerIDVariableexpensechargeto")
    val fkiCustomerIDVariableexpensechargeto: kotlin.Int,

    /* The unique ID of the Glaccountcontainer */
    @Json(name = "fkiGlaccountcontainerIDVariableexpensechargeto")
    val fkiGlaccountcontainerIDVariableexpensechargeto: kotlin.Int,

    /* The unique ID of the Agent. */
    @Json(name = "fkiAgentIDSupplychargechargeto")
    val fkiAgentIDSupplychargechargeto: kotlin.Int,

    /* The unique ID of the Broker. */
    @Json(name = "fkiBrokerIDSupplychargechargeto")
    val fkiBrokerIDSupplychargechargeto: kotlin.Int,

    /* The unique ID of the Customer. */
    @Json(name = "fkiCustomerIDSupplychargechargeto")
    val fkiCustomerIDSupplychargechargeto: kotlin.Int,

    /* The unique ID of the Glaccountcontainer */
    @Json(name = "fkiGlaccountcontainerIDSupplychargechargeto")
    val fkiGlaccountcontainerIDSupplychargechargeto: kotlin.Int,

    /* The unique ID of the Invoicealternatelogo */
    @Json(name = "fkiInvoicealternatelogoID")
    val fkiInvoicealternatelogoID: kotlin.Int,

    /* The unique ID of the Synchronizationlinkserver */
    @Json(name = "fkiSynchronizationlinkserverID")
    val fkiSynchronizationlinkserverID: kotlin.Int,

    /* The code of the Customer */
    @Json(name = "sCustomerCode")
    val sCustomerCode: kotlin.String,

    /* The fulltimeequivalent of the Customer */
    @Json(name = "dCustomerFulltimeequivalent")
    val dCustomerFulltimeequivalent: kotlin.String,

    /* The photocopiercode of the Customer */
    @Json(name = "iCustomerPhotocopiercode")
    val iCustomerPhotocopiercode: kotlin.Int,

    /* The longdistancecode of the Customer */
    @Json(name = "iCustomerLongdistancecode")
    val iCustomerLongdistancecode: kotlin.Int,

    /* The timewindowstart of the Customer */
    @Json(name = "iCustomerTimewindowstart")
    val iCustomerTimewindowstart: kotlin.Int,

    /* The timewindowend of the Customer */
    @Json(name = "iCustomerTimewindowend")
    val iCustomerTimewindowend: kotlin.Int,

    /* The minimumchargeableinterests of the Customer */
    @Json(name = "dCustomerMinimumchargeableinterests")
    val dCustomerMinimumchargeableinterests: kotlin.String,

    /* The birthdate of the Customer */
    @Json(name = "dtCustomerBirthdate")
    val dtCustomerBirthdate: kotlin.String,

    /* The transfer of the Customer */
    @Json(name = "dtCustomerTransfer")
    val dtCustomerTransfer: kotlin.String,

    /* The transferappointment of the Customer */
    @Json(name = "dtCustomerTransferappointment")
    val dtCustomerTransferappointment: kotlin.String,

    /* The transfersurvey of the Customer */
    @Json(name = "dtCustomerTransfersurvey")
    val dtCustomerTransfersurvey: kotlin.String,

    /* Whether the customer is active or not */
    @Json(name = "bCustomerIsactive")
    val bCustomerIsactive: kotlin.Boolean,

    /* Whether if it's an variableexpensefinanced */
    @Json(name = "bCustomerVariableexpensefinanced")
    val bCustomerVariableexpensefinanced: kotlin.Boolean,

    /* Whether if it's an variableexpensefinancedtaxes */
    @Json(name = "bCustomerVariableexpensefinancedtaxes")
    val bCustomerVariableexpensefinancedtaxes: kotlin.Boolean,

    /* Whether if it's an supplychargefinanced */
    @Json(name = "bCustomerSupplychargefinanced")
    val bCustomerSupplychargefinanced: kotlin.Boolean,

    /* Whether if it's an supplychargefinancedtaxes */
    @Json(name = "bCustomerSupplychargefinancedtaxes")
    val bCustomerSupplychargefinancedtaxes: kotlin.Boolean,

    /* Whether if it's an attendance */
    @Json(name = "bCustomerAttendance")
    val bCustomerAttendance: kotlin.Boolean,

    @Json(name = "eCustomerType")
    val eCustomerType: FieldECustomerType,

    @Json(name = "eCustomerMarketingcorrespondence")
    val eCustomerMarketingcorrespondence: FieldECustomerMarketingcorrespondence,

    /* Whether if it's an blackcopycarbon */
    @Json(name = "bCustomerBlackcopycarbon")
    val bCustomerBlackcopycarbon: kotlin.Boolean,

    /* Whether if it's an unsubscribeinfo */
    @Json(name = "bCustomerUnsubscribeinfo")
    val bCustomerUnsubscribeinfo: kotlin.Boolean,

    /* The comment of the Customer */
    @Json(name = "tCustomerComment")
    val tCustomerComment: kotlin.String,

    /* The unique ID of the User */
    @Json(name = "efkiUserID")
    val efkiUserID: kotlin.Int? = null,

    /* The code of the Customer */
    @Json(name = "efksCustomerCode")
    val efksCustomerCode: kotlin.String? = null,

    @Json(name = "IMPORTID")
    val IMPORTID: kotlin.String? = null

) {


}

