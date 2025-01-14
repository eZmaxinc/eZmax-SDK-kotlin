
# CustomerResponse

## Properties
| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **pkiCustomerID** | **kotlin.Int** | The unique ID of the Customer. |  |
| **fkiCompanyID** | **kotlin.Int** | The unique ID of the Company |  |
| **fkiCustomergroupID** | **kotlin.Int** | The unique ID of the Customergroup |  |
| **sCustomerName** | **kotlin.String** | The name of the Customer |  |
| **fkiContactinformationsID** | **kotlin.Int** | The unique ID of the Contactinformations |  |
| **fkiContactcontainerID** | **kotlin.Int** | The unique ID of the Contactcontainer |  |
| **fkiImageID** | **kotlin.Int** | The unique ID of the Image |  |
| **fkiGlaccountcontainerID** | **kotlin.Int** | The unique ID of the Glaccountcontainer |  |
| **fkiLanguageID** | **kotlin.Int** | The unique ID of the Language.  Valid values:  |Value|Description| |-|-| |1|French| |2|English| |  |
| **fkiDepartmentID** | **kotlin.Int** | The unique ID of the Department |  |
| **fkiPaymentmethodID** | **kotlin.Int** | The unique ID of the Paymentmethod |  |
| **fkiElectronicfundstransferbankaccountID** | **kotlin.Int** | The unique ID of the Electronicfundstransferbankaccount |  |
| **fkiElectronicfundstransferbankaccountIDDirectdebit** | **kotlin.Int** | The unique ID of the Electronicfundstransferbankaccount |  |
| **fkiSendingmethodID** | **kotlin.Int** | The unique ID of the Sendingmethod |  |
| **fkiTaxassignmentID** | **kotlin.Int** | The unique ID of the Taxassignment.  Valid values:  |Value|Description| |-|-| |1|No tax| |2|GST| |3|HST (ON)| |4|HST (NB)| |5|HST (NS)| |6|HST (NL)| |7|HST (PE)| |8|GST + QST (QC)| |9|GST + QST (QC) Non-Recoverable| |10|GST + PST (BC)| |11|GST + PST (SK)| |12|GST + RST (MB)| |13|GST + PST (BC) Non-Recoverable| |14|GST + PST (SK) Non-Recoverable| |15|GST + RST (MB) Non-Recoverable| |  |
| **fkiAttendancestatusID** | **kotlin.Int** | The unique ID of the Attendancestatus |  |
| **fkiAgentIDVariableexpensechargeto** | **kotlin.Int** | The unique ID of the Agent. |  |
| **fkiBrokerIDVariableexpensechargeto** | **kotlin.Int** | The unique ID of the Broker. |  |
| **fkiCustomerIDVariableexpensechargeto** | **kotlin.Int** | The unique ID of the Customer. |  |
| **fkiGlaccountcontainerIDVariableexpensechargeto** | **kotlin.Int** | The unique ID of the Glaccountcontainer |  |
| **fkiAgentIDSupplychargechargeto** | **kotlin.Int** | The unique ID of the Agent. |  |
| **fkiBrokerIDSupplychargechargeto** | **kotlin.Int** | The unique ID of the Broker. |  |
| **fkiCustomerIDSupplychargechargeto** | **kotlin.Int** | The unique ID of the Customer. |  |
| **fkiGlaccountcontainerIDSupplychargechargeto** | **kotlin.Int** | The unique ID of the Glaccountcontainer |  |
| **fkiInvoicealternatelogoID** | **kotlin.Int** | The unique ID of the Invoicealternatelogo |  |
| **fkiSynchronizationlinkserverID** | **kotlin.Int** | The unique ID of the Synchronizationlinkserver |  |
| **sCustomerCode** | **kotlin.String** | The code of the Customer |  |
| **dCustomerFulltimeequivalent** | **kotlin.String** | The fulltimeequivalent of the Customer |  |
| **iCustomerPhotocopiercode** | **kotlin.Int** | The photocopiercode of the Customer |  |
| **iCustomerLongdistancecode** | **kotlin.Int** | The longdistancecode of the Customer |  |
| **iCustomerTimewindowstart** | **kotlin.Int** | The timewindowstart of the Customer |  |
| **iCustomerTimewindowend** | **kotlin.Int** | The timewindowend of the Customer |  |
| **dCustomerMinimumchargeableinterests** | **kotlin.String** | The minimumchargeableinterests of the Customer |  |
| **dtCustomerBirthdate** | **kotlin.String** | The birthdate of the Customer |  |
| **dtCustomerTransfer** | **kotlin.String** | The transfer of the Customer |  |
| **dtCustomerTransferappointment** | **kotlin.String** | The transferappointment of the Customer |  |
| **dtCustomerTransfersurvey** | **kotlin.String** | The transfersurvey of the Customer |  |
| **bCustomerIsactive** | **kotlin.Boolean** | Whether the customer is active or not |  |
| **bCustomerVariableexpensefinanced** | **kotlin.Boolean** | Whether if it&#39;s an variableexpensefinanced |  |
| **bCustomerVariableexpensefinancedtaxes** | **kotlin.Boolean** | Whether if it&#39;s an variableexpensefinancedtaxes |  |
| **bCustomerSupplychargefinanced** | **kotlin.Boolean** | Whether if it&#39;s an supplychargefinanced |  |
| **bCustomerSupplychargefinancedtaxes** | **kotlin.Boolean** | Whether if it&#39;s an supplychargefinancedtaxes |  |
| **bCustomerAttendance** | **kotlin.Boolean** | Whether if it&#39;s an attendance |  |
| **eCustomerType** | [**FieldECustomerType**](FieldECustomerType.md) |  |  |
| **eCustomerMarketingcorrespondence** | [**FieldECustomerMarketingcorrespondence**](FieldECustomerMarketingcorrespondence.md) |  |  |
| **bCustomerBlackcopycarbon** | **kotlin.Boolean** | Whether if it&#39;s an blackcopycarbon |  |
| **bCustomerUnsubscribeinfo** | **kotlin.Boolean** | Whether if it&#39;s an unsubscribeinfo |  |
| **tCustomerComment** | **kotlin.String** | The comment of the Customer |  |
| **efkiUserID** | **kotlin.Int** | The unique ID of the User |  [optional] |
| **efksCustomerCode** | **kotlin.String** | The code of the Customer |  [optional] |
| **IMPORTID** | **kotlin.String** |  |  [optional] |



