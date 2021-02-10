# eZmaxinc/eZmax-SDK-kotlin - Kotlin client library for eZmax API Definition

## Requires

* Kotlin 1.3.61
* Gradle 4.9

## Build

First, create the gradle wrapper script:

```
gradle wrapper
```

Then, run:

```
./gradlew check assemble
```

This runs all tests and packages the library.

## Features/Implementation Notes

* Supports JSON inputs/outputs, File inputs, and Form inputs.
* Supports collection formats for query parameters: csv, tsv, ssv, pipes.
* Some Kotlin and Java types are fully qualified to avoid conflicts with types defined in OpenAPI definitions.
* Implementation of ApiClient is intended to reduce method counts, specifically to benefit Android targets.

<a name="documentation-for-api-endpoints"></a>
## Documentation for API Endpoints

All URIs are relative to *https://prod.api.appcluster01.ca-central-1.ezmax.com/rest*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*GlobalCustomerApi* | [**globalCustomerGetEndpointV1**](docs/GlobalCustomerApi.md#globalcustomergetendpointv1) | **GET** /1/customer/{pksCustomerCode}/endpoint | Get customer endpoint
*ModuleUserApi* | [**userCreateEzsignuserV1**](docs/ModuleUserApi.md#usercreateezsignuserv1) | **POST** /1/module/user/createezsignuser | Create a new User of type Ezsignuser
*ObjectActivesessionApi* | [**activesessionGetCurrentV1**](docs/ObjectActivesessionApi.md#activesessiongetcurrentv1) | **GET** /1/object/activesession/getCurrent | Get Current Activesession
*ObjectApikeyApi* | [**apikeyCreateObjectV1**](docs/ObjectApikeyApi.md#apikeycreateobjectv1) | **POST** /1/object/apikey | Create a new Apikey
*ObjectEzsigndocumentApi* | [**ezsigndocumentApplyEzsigntemplateV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentapplyezsigntemplatev1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate | Apply an Ezsign Template to the Ezsigndocument.
*ObjectEzsigndocumentApi* | [**ezsigndocumentCreateObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentcreateobjectv1) | **POST** /1/object/ezsigndocument | Create a new Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentDeleteObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentdeleteobjectv1) | **DELETE** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Delete an existing Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentEditObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumenteditobjectv1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Modify an existing Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetChildrenV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetchildrenv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getChildren | Retrieve an existing Ezsigndocument's children IDs
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetDownloadUrlV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetdownloadurlv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getDownloadUrl/{eDocumentType} | Retrieve a URL to download documents.
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetobjectv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument
*ObjectEzsignfolderApi* | [**ezsignfolderCreateObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldercreateobjectv1) | **POST** /1/object/ezsignfolder | Create a new Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderDeleteObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderdeleteobjectv1) | **DELETE** /1/object/ezsignfolder/{pkiEzsignfolderID} | Delete an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderEditObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldereditobjectv1) | **PUT** /1/object/ezsignfolder/{pkiEzsignfolderID} | Modify an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderGetChildrenV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldergetchildrenv1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getChildren | Retrieve an existing Ezsignfolder's children IDs
*ObjectEzsignfolderApi* | [**ezsignfolderGetObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldergetobjectv1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID} | Retrieve an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderSendV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldersendv1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/send | Send the Ezsignfolder to the signatories for signature
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationCreateObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationcreateobjectv1) | **POST** /1/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationDeleteObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationdeleteobjectv1) | **DELETE** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Delete an existing Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationEditObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationeditobjectv1) | **PUT** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Modify an existing Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationGetChildrenV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationgetchildrenv1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getChildren | Retrieve an existing Ezsignfoldersignerassociation's children IDs
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationGetInPersonLoginUrlV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationgetinpersonloginurlv1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getInPersonLoginUrl | Retrieve a Login Url to allow In-Person signing
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationGetObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationgetobjectv1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Retrieve an existing Ezsignfoldersignerassociation
*ObjectEzsignsignatureApi* | [**ezsignsignatureCreateObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignaturecreateobjectv1) | **POST** /1/object/ezsignsignature | Create a new Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureDeleteObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignaturedeleteobjectv1) | **DELETE** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Delete an existing Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureEditObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureeditobjectv1) | **PUT** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Modify an existing Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureGetChildrenV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignaturegetchildrenv1) | **GET** /1/object/ezsignsignature/{pkiEzsignsignatureID}/getChildren | Retrieve an existing Ezsignsignature's children IDs
*ObjectEzsignsignatureApi* | [**ezsignsignatureGetObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignaturegetobjectv1) | **GET** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Retrieve an existing Ezsignsignature
*ObjectFranchisebrokerApi* | [**franchisebrokerGetAutocompleteV1**](docs/ObjectFranchisebrokerApi.md#franchisebrokergetautocompletev1) | **GET** /1/object/franchisebroker/getAutocomplete/{sSelector} | Retrieve Franchisebrokers and IDs
*ObjectFranchiseofficeApi* | [**franchiseofficeGetAutocompleteV1**](docs/ObjectFranchiseofficeApi.md#franchiseofficegetautocompletev1) | **GET** /1/object/franchiseoffice/getAutocomplete/{sSelector} | Retrieve Franchiseoffices and IDs
*ObjectFranchisereferalincomeApi* | [**franchisereferalincomeCreateObjectV1**](docs/ObjectFranchisereferalincomeApi.md#franchisereferalincomecreateobjectv1) | **POST** /1/object/franchisereferalincome | Create a new Franchisereferalincome
*ObjectPeriodApi* | [**periodGetAutocompleteV1**](docs/ObjectPeriodApi.md#periodgetautocompletev1) | **GET** /1/object/period/getAutocomplete/{sSelector} | Retrieve Periods and IDs


<a name="documentation-for-models"></a>
## Documentation for Models

 - [eZmaxinc/eZmax-SDK-kotlin.models.ActivesessionMinusGetCurrentMinusV1MinusResponse](docs/ActivesessionMinusGetCurrentMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.ActivesessionMinusGetCurrentMinusV1MinusResponseMinusMPayload](docs/ActivesessionMinusGetCurrentMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.AddressMinusRequest](docs/AddressMinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.ApikeyMinusCreateObjectMinusV1MinusRequest](docs/ApikeyMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.ApikeyMinusCreateObjectMinusV1MinusResponse](docs/ApikeyMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.ApikeyMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/ApikeyMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.ApikeyMinusRequest](docs/ApikeyMinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.ApikeyMinusRequestCompound](docs/ApikeyMinusRequestCompound.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.ApikeyMinusResponse](docs/ApikeyMinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.AttemptMinusResponse](docs/AttemptMinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusAudit](docs/CommonMinusAudit.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusGetAutocompleteMinusV1MinusResponse](docs/CommonMinusGetAutocompleteMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusGetAutocompleteMinusV1MinusResponseMinusMPayload](docs/CommonMinusGetAutocompleteMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusResponse](docs/CommonMinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusResponseMinusError](docs/CommonMinusResponseMinusError.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusResponseMinusObjDebug](docs/CommonMinusResponseMinusObjDebug.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusResponseMinusObjDebugPayload](docs/CommonMinusResponseMinusObjDebugPayload.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusResponseMinusObjSQLQuery](docs/CommonMinusResponseMinusObjSQLQuery.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.CommonMinusWebhook](docs/CommonMinusWebhook.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.ContactMinusRequest](docs/ContactMinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.ContactMinusRequestCompound](docs/ContactMinusRequestCompound.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.ContactRequestCompoundAllOf](docs/ContactRequestCompoundAllOf.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.ContactinformationsMinusRequest](docs/ContactinformationsMinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.ContactinformationsMinusRequestCompound](docs/ContactinformationsMinusRequestCompound.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EmailMinusRequest](docs/EmailMinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest](docs/EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusResponse](docs/EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusCreateObjectMinusV1MinusRequest](docs/EzsigndocumentMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusCreateObjectMinusV1MinusResponse](docs/EzsigndocumentMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsigndocumentMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusDeleteObjectMinusV1MinusResponse](docs/EzsigndocumentMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusEditObjectMinusV1MinusRequest](docs/EzsigndocumentMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusEditObjectMinusV1MinusResponse](docs/EzsigndocumentMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponse](docs/EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponseMinusMPayload](docs/EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusGetObjectMinusV1MinusResponse](docs/EzsigndocumentMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsigndocumentMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusRequest](docs/EzsigndocumentMinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusRequestCompound](docs/EzsigndocumentMinusRequestCompound.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusResponse](docs/EzsigndocumentMinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentMinusResponseCompound](docs/EzsigndocumentMinusResponseCompound.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsigndocumentResponseAllOf](docs/EzsigndocumentResponseAllOf.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusCreateObjectMinusV1MinusRequest](docs/EzsignfolderMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusCreateObjectMinusV1MinusResponse](docs/EzsignfolderMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsignfolderMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusDeleteObjectMinusV1MinusResponse](docs/EzsignfolderMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusEditObjectMinusV1MinusRequest](docs/EzsignfolderMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusEditObjectMinusV1MinusResponse](docs/EzsignfolderMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusGetObjectMinusV1MinusResponse](docs/EzsignfolderMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsignfolderMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusRequest](docs/EzsignfolderMinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusRequestCompound](docs/EzsignfolderMinusRequestCompound.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusResponse](docs/EzsignfolderMinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusResponseCompound](docs/EzsignfolderMinusResponseCompound.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusSendMinusV1MinusRequest](docs/EzsignfolderMinusSendMinusV1MinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderMinusSendMinusV1MinusResponse](docs/EzsignfolderMinusSendMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfolderResponseAllOf](docs/EzsignfolderResponseAllOf.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest](docs/EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse](docs/EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse](docs/EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfoldersignerassociationMinusEditObjectMinusV1MinusRequest](docs/EzsignfoldersignerassociationMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfoldersignerassociationMinusEditObjectMinusV1MinusResponse](docs/EzsignfoldersignerassociationMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse](docs/EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponseMinusMPayload](docs/EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse](docs/EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfoldersignerassociationMinusRequest](docs/EzsignfoldersignerassociationMinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignfoldersignerassociationMinusRequestCompound](docs/EzsignfoldersignerassociationMinusRequestCompound.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignsignatureMinusCreateObjectMinusV1MinusRequest](docs/EzsignsignatureMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignsignatureMinusCreateObjectMinusV1MinusResponse](docs/EzsignsignatureMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignsignatureMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsignsignatureMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignsignatureMinusDeleteObjectMinusV1MinusResponse](docs/EzsignsignatureMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignsignatureMinusEditObjectMinusV1MinusRequest](docs/EzsignsignatureMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignsignatureMinusEditObjectMinusV1MinusResponse](docs/EzsignsignatureMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignsignatureMinusGetObjectMinusV1MinusResponse](docs/EzsignsignatureMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignsignatureMinusRequest](docs/EzsignsignatureMinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignsignatureMinusRequestCompound](docs/EzsignsignatureMinusRequestCompound.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignsignerMinusRequest](docs/EzsignsignerMinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignsignerMinusRequestCompound](docs/EzsignsignerMinusRequestCompound.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.EzsignsignerMinusRequestCompoundMinusContact](docs/EzsignsignerMinusRequestCompoundMinusContact.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.FieldMinusEEzsigndocumentStep](docs/FieldMinusEEzsigndocumentStep.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.FieldMinusEEzsignfolderSendreminderfrequency](docs/FieldMinusEEzsignfolderSendreminderfrequency.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.FieldMinusEEzsignfolderStep](docs/FieldMinusEEzsignfolderStep.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.FieldMinusEPhoneType](docs/FieldMinusEPhoneType.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.FieldMinusEUserType](docs/FieldMinusEUserType.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.FranchisereferalincomeMinusCreateObjectMinusV1MinusRequest](docs/FranchisereferalincomeMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.FranchisereferalincomeMinusCreateObjectMinusV1MinusResponse](docs/FranchisereferalincomeMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.FranchisereferalincomeMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/FranchisereferalincomeMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.FranchisereferalincomeMinusRequest](docs/FranchisereferalincomeMinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.FranchisereferalincomeMinusRequestCompound](docs/FranchisereferalincomeMinusRequestCompound.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse](docs/GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.MultilingualMinusApikeyDescription](docs/MultilingualMinusApikeyDescription.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.PhoneMinusRequest](docs/PhoneMinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.UserMinusCreateEzsignuserMinusV1MinusRequest](docs/UserMinusCreateEzsignuserMinusV1MinusRequest.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.UserMinusCreateEzsignuserMinusV1MinusResponse](docs/UserMinusCreateEzsignuserMinusV1MinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.UserMinusCreateEzsignuserMinusV1MinusResponseMinusMPayload](docs/UserMinusCreateEzsignuserMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.UserMinusResponse](docs/UserMinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.UserResponseAllOf](docs/UserResponseAllOf.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.WebhookEzsignDocumentCompletedAllOf](docs/WebhookEzsignDocumentCompletedAllOf.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.WebhookEzsignFolderCompletedAllOf](docs/WebhookEzsignFolderCompletedAllOf.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.WebhookMinusEzsignMinusDocumentCompleted](docs/WebhookMinusEzsignMinusDocumentCompleted.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.WebhookMinusEzsignMinusFolderCompleted](docs/WebhookMinusEzsignMinusFolderCompleted.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.WebhookMinusResponse](docs/WebhookMinusResponse.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.WebhookMinusUserMinusUserCreated](docs/WebhookMinusUserMinusUserCreated.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.WebhookUserUserCreatedAllOf](docs/WebhookUserUserCreatedAllOf.md)
 - [eZmaxinc/eZmax-SDK-kotlin.models.WebsiteMinusRequest](docs/WebsiteMinusRequest.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="Authorization"></a>
### Authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

