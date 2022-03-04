# eZmaxApi - Kotlin client library for eZmax API Definition

## Requires

* Kotlin 1.4.30
* Gradle 6.8.3

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
*ModuleAuthenticateApi* | [**authenticateAuthenticateV2**](docs/ModuleAuthenticateApi.md#authenticateauthenticatev2) | **POST** /2/module/authenticate/authenticate/{eSessionType} | Authenticate a user
*ModuleListApi* | [**listGetListpresentationV1**](docs/ModuleListApi.md#listgetlistpresentationv1) | **GET** /1/module/list/listpresentation/{sListName} | Get all Listpresentation for a specific list
*ModuleListApi* | [**listSaveListpresentationV1**](docs/ModuleListApi.md#listsavelistpresentationv1) | **POST** /1/module/list/listpresentation/{sListName} | Save all Listpresentation for a specific list
*ModuleUserApi* | [**userCreateEzsignuserV1**](docs/ModuleUserApi.md#usercreateezsignuserv1) | **POST** /1/module/user/createezsignuser | Create a new User of type Ezsignuser
*ObjectActivesessionApi* | [**activesessionGetCurrentV1**](docs/ObjectActivesessionApi.md#activesessiongetcurrentv1) | **GET** /1/object/activesession/getCurrent | Get Current Activesession
*ObjectApikeyApi* | [**apikeyCreateObjectV1**](docs/ObjectApikeyApi.md#apikeycreateobjectv1) | **POST** /1/object/apikey | Create a new Apikey
*ObjectApikeyApi* | [**apikeyCreateObjectV2**](docs/ObjectApikeyApi.md#apikeycreateobjectv2) | **POST** /2/object/apikey | Create a new Apikey
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetEzsignbulksendtransmissionsV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendgetezsignbulksendtransmissionsv1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getEzsignbulksendtransmissions | Retrieve an existing Ezsignbulksend's Ezsignbulksendtransmissions
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetListV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendgetlistv1) | **GET** /1/object/ezsignbulksend/getList | Retrieve Ezsignbulksend list
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetObjectV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendgetobjectv1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID} | Retrieve an existing Ezsignbulksend
*ObjectEzsignbulksendtransmissionApi* | [**ezsignbulksendtransmissionGetObjectV1**](docs/ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissiongetobjectv1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID} | Retrieve an existing Ezsignbulksendtransmission
*ObjectEzsigndocumentApi* | [**ezsigndocumentApplyEzsigntemplateV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentapplyezsigntemplatev1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate | Apply an Ezsign Template to the Ezsigndocument.
*ObjectEzsigndocumentApi* | [**ezsigndocumentApplyEzsigntemplateV2**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentapplyezsigntemplatev2) | **POST** /2/object/ezsigndocument/{pkiEzsigndocumentID}/applyEzsigntemplate | Apply an Ezsign Template to the Ezsigndocument.
*ObjectEzsigndocumentApi* | [**ezsigndocumentCreateObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentcreateobjectv1) | **POST** /1/object/ezsigndocument | Create a new Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentCreateObjectV2**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentcreateobjectv2) | **POST** /2/object/ezsigndocument | Create a new Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentDeleteObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentdeleteobjectv1) | **DELETE** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Delete an existing Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentEditEzsignformfieldgroupsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumenteditezsignformfieldgroupsv1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignformfieldgroups | Edit multiple Ezsignformfieldgroups
*ObjectEzsigndocumentApi* | [**ezsigndocumentEditEzsignsignaturesV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumenteditezsignsignaturesv1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignsignatures | Edit multiple Ezsignsignatures
*ObjectEzsigndocumentApi* | [**ezsigndocumentEndPrematurelyV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentendprematurelyv1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/endPrematurely | End prematurely
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetDownloadUrlV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetdownloadurlv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getDownloadUrl/{eDocumentType} | Retrieve a URL to download documents.
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetEzsignformfieldgroupsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetezsignformfieldgroupsv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignformfieldgroups | Retrieve an existing Ezsigndocument's Ezsignformfieldgroups
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetEzsignpagesV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetezsignpagesv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignpages | Retrieve an existing Ezsigndocument's Ezsignpages
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetEzsignsignaturesV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetezsignsignaturesv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignsignatures | Retrieve an existing Ezsigndocument's Ezsignsignatures
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetFormDataV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetformdatav1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getFormData | Retrieve an existing Ezsigndocument's Form Data
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetobjectv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetTemporaryProofV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgettemporaryproofv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getTemporaryProof | Retrieve the temporary proof
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetWordsPositionsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetwordspositionsv1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions | Retrieve positions X,Y of given words from a Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentPatchObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentpatchobjectv1) | **PATCH** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Patch an existing Ezsigndocument
*ObjectEzsignfolderApi* | [**ezsignfolderCreateObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldercreateobjectv1) | **POST** /1/object/ezsignfolder | Create a new Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderCreateObjectV2**](docs/ObjectEzsignfolderApi.md#ezsignfoldercreateobjectv2) | **POST** /2/object/ezsignfolder | Create a new Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderDeleteObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderdeleteobjectv1) | **DELETE** /1/object/ezsignfolder/{pkiEzsignfolderID} | Delete an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderEditObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldereditobjectv1) | **PUT** /1/object/ezsignfolder/{pkiEzsignfolderID} | Edit an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderGetEzsigndocumentsV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldergetezsigndocumentsv1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getEzsigndocuments | Retrieve an existing Ezsignfolder's Ezsigndocuments
*ObjectEzsignfolderApi* | [**ezsignfolderGetEzsignfoldersignerassociationsV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldergetezsignfoldersignerassociationsv1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getEzsignfoldersignerassociations | Retrieve an existing Ezsignfolder's Ezsignfoldersignerassociations
*ObjectEzsignfolderApi* | [**ezsignfolderGetFormsDataV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldergetformsdatav1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getFormsData | Retrieve an existing Ezsignfolder's forms data
*ObjectEzsignfolderApi* | [**ezsignfolderGetListV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldergetlistv1) | **GET** /1/object/ezsignfolder/getList | Retrieve Ezsignfolder list
*ObjectEzsignfolderApi* | [**ezsignfolderGetObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldergetobjectv1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID} | Retrieve an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderSendV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldersendv1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/send | Send the Ezsignfolder to the signatories for signature
*ObjectEzsignfolderApi* | [**ezsignfolderUnsendV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderunsendv1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/unsend | Unsend the Ezsignfolder
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationCreateObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationcreateobjectv1) | **POST** /1/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationCreateObjectV2**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationcreateobjectv2) | **POST** /2/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationDeleteObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationdeleteobjectv1) | **DELETE** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Delete an existing Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationGetInPersonLoginUrlV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationgetinpersonloginurlv1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getInPersonLoginUrl | Retrieve a Login Url to allow In-Person signing
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationGetObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationgetobjectv1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Retrieve an existing Ezsignfoldersignerassociation
*ObjectEzsignfoldertypeApi* | [**ezsignfoldertypeGetAutocompleteV1**](docs/ObjectEzsignfoldertypeApi.md#ezsignfoldertypegetautocompletev1) | **GET** /1/object/ezsignfoldertype/getAutocomplete/{sSelector} | Retrieve Ezsignfoldertypes and IDs
*ObjectEzsignfoldertypeApi* | [**ezsignfoldertypeGetListV1**](docs/ObjectEzsignfoldertypeApi.md#ezsignfoldertypegetlistv1) | **GET** /1/object/ezsignfoldertype/getList | Retrieve Ezsignfoldertype list
*ObjectEzsignformfieldgroupApi* | [**ezsignformfieldgroupCreateObjectV1**](docs/ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupcreateobjectv1) | **POST** /1/object/ezsignformfieldgroup | Create a new Ezsignformfieldgroup
*ObjectEzsignformfieldgroupApi* | [**ezsignformfieldgroupDeleteObjectV1**](docs/ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupdeleteobjectv1) | **DELETE** /1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Delete an existing Ezsignformfieldgroup
*ObjectEzsignformfieldgroupApi* | [**ezsignformfieldgroupEditObjectV1**](docs/ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupeditobjectv1) | **PUT** /1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Edit an existing Ezsignformfieldgroup
*ObjectEzsignformfieldgroupApi* | [**ezsignformfieldgroupGetObjectV1**](docs/ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupgetobjectv1) | **GET** /1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Retrieve an existing Ezsignformfieldgroup
*ObjectEzsignsignatureApi* | [**ezsignsignatureCreateObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignaturecreateobjectv1) | **POST** /1/object/ezsignsignature | Create a new Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureCreateObjectV2**](docs/ObjectEzsignsignatureApi.md#ezsignsignaturecreateobjectv2) | **POST** /2/object/ezsignsignature | Create a new Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureDeleteObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignaturedeleteobjectv1) | **DELETE** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Delete an existing Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureEditObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureeditobjectv1) | **PUT** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Edit an existing Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureGetObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignaturegetobjectv1) | **GET** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Retrieve an existing Ezsignsignature
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageGetListV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackagegetlistv1) | **GET** /1/object/ezsigntemplatepackage/getList | Retrieve Ezsigntemplatepackage list
*ObjectFranchisebrokerApi* | [**franchisebrokerGetAutocompleteV1**](docs/ObjectFranchisebrokerApi.md#franchisebrokergetautocompletev1) | **GET** /1/object/franchisebroker/getAutocomplete/{sSelector} | Retrieve Franchisebrokers and IDs
*ObjectFranchiseofficeApi* | [**franchiseofficeGetAutocompleteV1**](docs/ObjectFranchiseofficeApi.md#franchiseofficegetautocompletev1) | **GET** /1/object/franchiseoffice/getAutocomplete/{sSelector} | Retrieve Franchiseoffices and IDs
*ObjectFranchisereferalincomeApi* | [**franchisereferalincomeCreateObjectV1**](docs/ObjectFranchisereferalincomeApi.md#franchisereferalincomecreateobjectv1) | **POST** /1/object/franchisereferalincome | Create a new Franchisereferalincome
*ObjectFranchisereferalincomeApi* | [**franchisereferalincomeCreateObjectV2**](docs/ObjectFranchisereferalincomeApi.md#franchisereferalincomecreateobjectv2) | **POST** /2/object/franchisereferalincome | Create a new Franchisereferalincome
*ObjectPeriodApi* | [**periodGetAutocompleteV1**](docs/ObjectPeriodApi.md#periodgetautocompletev1) | **GET** /1/object/period/getAutocomplete/{sSelector} | Retrieve Periods and IDs


<a name="documentation-for-models"></a>
## Documentation for Models

 - [eZmaxApi.models.ActivesessionGetCurrentV1ResponseAllOf](docs/ActivesessionGetCurrentV1ResponseAllOf.md)
 - [eZmaxApi.models.ActivesessionMinusGetCurrentMinusV1MinusResponse](docs/ActivesessionMinusGetCurrentMinusV1MinusResponse.md)
 - [eZmaxApi.models.ActivesessionMinusGetCurrentMinusV1MinusResponseMinusMPayload](docs/ActivesessionMinusGetCurrentMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.ActivesessionMinusResponse](docs/ActivesessionMinusResponse.md)
 - [eZmaxApi.models.ActivesessionMinusResponseCompound](docs/ActivesessionMinusResponseCompound.md)
 - [eZmaxApi.models.ActivesessionMinusResponseCompoundMinusApikey](docs/ActivesessionMinusResponseCompoundMinusApikey.md)
 - [eZmaxApi.models.ActivesessionMinusResponseCompoundMinusUser](docs/ActivesessionMinusResponseCompoundMinusUser.md)
 - [eZmaxApi.models.ActivesessionResponseCompoundAllOf](docs/ActivesessionResponseCompoundAllOf.md)
 - [eZmaxApi.models.AddressMinusRequest](docs/AddressMinusRequest.md)
 - [eZmaxApi.models.AddressMinusRequestCompound](docs/AddressMinusRequestCompound.md)
 - [eZmaxApi.models.ApikeyCreateObjectV1ResponseAllOf](docs/ApikeyCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.ApikeyCreateObjectV2ResponseAllOf](docs/ApikeyCreateObjectV2ResponseAllOf.md)
 - [eZmaxApi.models.ApikeyMinusCreateObjectMinusV1MinusRequest](docs/ApikeyMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.ApikeyMinusCreateObjectMinusV1MinusResponse](docs/ApikeyMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.ApikeyMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/ApikeyMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.ApikeyMinusCreateObjectMinusV2MinusRequest](docs/ApikeyMinusCreateObjectMinusV2MinusRequest.md)
 - [eZmaxApi.models.ApikeyMinusCreateObjectMinusV2MinusResponse](docs/ApikeyMinusCreateObjectMinusV2MinusResponse.md)
 - [eZmaxApi.models.ApikeyMinusCreateObjectMinusV2MinusResponseMinusMPayload](docs/ApikeyMinusCreateObjectMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.ApikeyMinusRequest](docs/ApikeyMinusRequest.md)
 - [eZmaxApi.models.ApikeyMinusRequestCompound](docs/ApikeyMinusRequestCompound.md)
 - [eZmaxApi.models.ApikeyMinusResponse](docs/ApikeyMinusResponse.md)
 - [eZmaxApi.models.ApikeyMinusResponseCompound](docs/ApikeyMinusResponseCompound.md)
 - [eZmaxApi.models.AttemptMinusResponse](docs/AttemptMinusResponse.md)
 - [eZmaxApi.models.AttemptMinusResponseCompound](docs/AttemptMinusResponseCompound.md)
 - [eZmaxApi.models.AuthenticateAuthenticateV2ResponseAllOf](docs/AuthenticateAuthenticateV2ResponseAllOf.md)
 - [eZmaxApi.models.AuthenticateMinusAuthenticateMinusV2MinusRequest](docs/AuthenticateMinusAuthenticateMinusV2MinusRequest.md)
 - [eZmaxApi.models.AuthenticateMinusAuthenticateMinusV2MinusResponse](docs/AuthenticateMinusAuthenticateMinusV2MinusResponse.md)
 - [eZmaxApi.models.AuthenticateMinusAuthenticateMinusV2MinusResponseMinusMPayload](docs/AuthenticateMinusAuthenticateMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.CommonGetAutocompleteV1ResponseAllOf](docs/CommonGetAutocompleteV1ResponseAllOf.md)
 - [eZmaxApi.models.CommonMinusAudit](docs/CommonMinusAudit.md)
 - [eZmaxApi.models.CommonMinusAuditdetail](docs/CommonMinusAuditdetail.md)
 - [eZmaxApi.models.CommonMinusGetAutocompleteMinusV1MinusResponse](docs/CommonMinusGetAutocompleteMinusV1MinusResponse.md)
 - [eZmaxApi.models.CommonMinusGetListMinusV1MinusResponseMinusMPayload](docs/CommonMinusGetListMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.CommonMinusResponse](docs/CommonMinusResponse.md)
 - [eZmaxApi.models.CommonMinusResponseGetList](docs/CommonMinusResponseGetList.md)
 - [eZmaxApi.models.CommonMinusResponseMinusError](docs/CommonMinusResponseMinusError.md)
 - [eZmaxApi.models.CommonMinusResponseMinusErrorMinusSTemporaryFileUrl](docs/CommonMinusResponseMinusErrorMinusSTemporaryFileUrl.md)
 - [eZmaxApi.models.CommonMinusResponseMinusFilter](docs/CommonMinusResponseMinusFilter.md)
 - [eZmaxApi.models.CommonMinusResponseMinusObjDebug](docs/CommonMinusResponseMinusObjDebug.md)
 - [eZmaxApi.models.CommonMinusResponseMinusObjDebugPayload](docs/CommonMinusResponseMinusObjDebugPayload.md)
 - [eZmaxApi.models.CommonMinusResponseMinusObjDebugPayloadGetList](docs/CommonMinusResponseMinusObjDebugPayloadGetList.md)
 - [eZmaxApi.models.CommonMinusResponseMinusObjSQLQuery](docs/CommonMinusResponseMinusObjSQLQuery.md)
 - [eZmaxApi.models.CommonMinusWebhook](docs/CommonMinusWebhook.md)
 - [eZmaxApi.models.CommonResponseErrorSTemporaryFileUrlAllOf](docs/CommonResponseErrorSTemporaryFileUrlAllOf.md)
 - [eZmaxApi.models.CommonResponseObjDebugPayloadGetListAllOf](docs/CommonResponseObjDebugPayloadGetListAllOf.md)
 - [eZmaxApi.models.ContactMinusRequest](docs/ContactMinusRequest.md)
 - [eZmaxApi.models.ContactMinusRequestCompound](docs/ContactMinusRequestCompound.md)
 - [eZmaxApi.models.ContactRequestCompoundAllOf](docs/ContactRequestCompoundAllOf.md)
 - [eZmaxApi.models.ContactinformationsMinusRequest](docs/ContactinformationsMinusRequest.md)
 - [eZmaxApi.models.ContactinformationsMinusRequestCompound](docs/ContactinformationsMinusRequestCompound.md)
 - [eZmaxApi.models.ContactinformationsRequestCompoundAllOf](docs/ContactinformationsRequestCompoundAllOf.md)
 - [eZmaxApi.models.CustomMinusAutocompleteElementMinusResponse](docs/CustomMinusAutocompleteElementMinusResponse.md)
 - [eZmaxApi.models.CustomMinusDropdownElementMinusRequest](docs/CustomMinusDropdownElementMinusRequest.md)
 - [eZmaxApi.models.CustomMinusDropdownElementMinusRequestCompound](docs/CustomMinusDropdownElementMinusRequestCompound.md)
 - [eZmaxApi.models.CustomMinusDropdownElementMinusResponse](docs/CustomMinusDropdownElementMinusResponse.md)
 - [eZmaxApi.models.CustomMinusDropdownElementMinusResponseCompound](docs/CustomMinusDropdownElementMinusResponseCompound.md)
 - [eZmaxApi.models.CustomMinusEzsignfoldersignerassociationstatusMinusResponse](docs/CustomMinusEzsignfoldersignerassociationstatusMinusResponse.md)
 - [eZmaxApi.models.CustomMinusEzsignsignaturestatusMinusResponse](docs/CustomMinusEzsignsignaturestatusMinusResponse.md)
 - [eZmaxApi.models.CustomMinusFormDataDocumentMinusResponse](docs/CustomMinusFormDataDocumentMinusResponse.md)
 - [eZmaxApi.models.CustomMinusFormDataEzsignformfieldMinusResponse](docs/CustomMinusFormDataEzsignformfieldMinusResponse.md)
 - [eZmaxApi.models.CustomMinusFormDataEzsignformfieldgroupMinusResponse](docs/CustomMinusFormDataEzsignformfieldgroupMinusResponse.md)
 - [eZmaxApi.models.CustomMinusFormDataSignerMinusResponse](docs/CustomMinusFormDataSignerMinusResponse.md)
 - [eZmaxApi.models.CustomMinusFormsDataFolderMinusResponse](docs/CustomMinusFormsDataFolderMinusResponse.md)
 - [eZmaxApi.models.CustomMinusWordPositionOccurenceMinusResponse](docs/CustomMinusWordPositionOccurenceMinusResponse.md)
 - [eZmaxApi.models.CustomMinusWordPositionWordMinusResponse](docs/CustomMinusWordPositionWordMinusResponse.md)
 - [eZmaxApi.models.EmailMinusRequest](docs/EmailMinusRequest.md)
 - [eZmaxApi.models.EmailMinusRequestCompound](docs/EmailMinusRequestCompound.md)
 - [eZmaxApi.models.EzsignbulksendGetEzsignbulksendtransmissionsV1ResponseAllOf](docs/EzsignbulksendGetEzsignbulksendtransmissionsV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignbulksendGetListV1ResponseAllOf](docs/EzsignbulksendGetListV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignbulksendGetListV1ResponseMPayloadAllOf](docs/EzsignbulksendGetListV1ResponseMPayloadAllOf.md)
 - [eZmaxApi.models.EzsignbulksendGetObjectV1ResponseAllOf](docs/EzsignbulksendGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignbulksendMinusGetEzsignbulksendtransmissionsMinusV1MinusResponse](docs/EzsignbulksendMinusGetEzsignbulksendtransmissionsMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendMinusGetEzsignbulksendtransmissionsMinusV1MinusResponseMinusMPayload](docs/EzsignbulksendMinusGetEzsignbulksendtransmissionsMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignbulksendMinusGetListMinusV1MinusResponse](docs/EzsignbulksendMinusGetListMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendMinusGetListMinusV1MinusResponseMinusMPayload](docs/EzsignbulksendMinusGetListMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignbulksendMinusGetObjectMinusV1MinusResponse](docs/EzsignbulksendMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsignbulksendMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignbulksendMinusListElement](docs/EzsignbulksendMinusListElement.md)
 - [eZmaxApi.models.EzsignbulksendMinusResponse](docs/EzsignbulksendMinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendMinusResponseCompound](docs/EzsignbulksendMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignbulksendtransmissionGetObjectV1ResponseAllOf](docs/EzsignbulksendtransmissionGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponse](docs/EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignbulksendtransmissionMinusResponse](docs/EzsignbulksendtransmissionMinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendtransmissionMinusResponseCompound](docs/EzsignbulksendtransmissionMinusResponseCompound.md)
 - [eZmaxApi.models.EzsigndocumentCreateObjectV1ResponseAllOf](docs/EzsigndocumentCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigndocumentCreateObjectV2ResponseAllOf](docs/EzsigndocumentCreateObjectV2ResponseAllOf.md)
 - [eZmaxApi.models.EzsigndocumentGetDownloadUrlV1ResponseAllOf](docs/EzsigndocumentGetDownloadUrlV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigndocumentGetEzsignformfieldgroupsV1ResponseAllOf](docs/EzsigndocumentGetEzsignformfieldgroupsV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigndocumentGetEzsignpagesV1ResponseAllOf](docs/EzsigndocumentGetEzsignpagesV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigndocumentGetEzsignsignaturesV1ResponseAllOf](docs/EzsigndocumentGetEzsignsignaturesV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigndocumentGetFormDataV1ResponseAllOf](docs/EzsigndocumentGetFormDataV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigndocumentGetObjectV1ResponseAllOf](docs/EzsigndocumentGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigndocumentGetTemporaryProofV1ResponseAllOf](docs/EzsigndocumentGetTemporaryProofV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigndocumentGetWordsPositionsV1ResponseAllOf](docs/EzsigndocumentGetWordsPositionsV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest](docs/EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusResponse](docs/EzsigndocumentMinusApplyEzsigntemplateMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusApplyEzsigntemplateMinusV2MinusRequest](docs/EzsigndocumentMinusApplyEzsigntemplateMinusV2MinusRequest.md)
 - [eZmaxApi.models.EzsigndocumentMinusApplyEzsigntemplateMinusV2MinusResponse](docs/EzsigndocumentMinusApplyEzsigntemplateMinusV2MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusCreateObjectMinusV1MinusRequest](docs/EzsigndocumentMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigndocumentMinusCreateObjectMinusV1MinusResponse](docs/EzsigndocumentMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsigndocumentMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigndocumentMinusCreateObjectMinusV2MinusRequest](docs/EzsigndocumentMinusCreateObjectMinusV2MinusRequest.md)
 - [eZmaxApi.models.EzsigndocumentMinusCreateObjectMinusV2MinusResponse](docs/EzsigndocumentMinusCreateObjectMinusV2MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusCreateObjectMinusV2MinusResponseMinusMPayload](docs/EzsigndocumentMinusCreateObjectMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigndocumentMinusDeleteObjectMinusV1MinusResponse](docs/EzsigndocumentMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusEditEzsignformfieldgroupsMinusV1MinusRequest](docs/EzsigndocumentMinusEditEzsignformfieldgroupsMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigndocumentMinusEditEzsignformfieldgroupsMinusV1MinusResponse](docs/EzsigndocumentMinusEditEzsignformfieldgroupsMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusEditEzsignsignaturesMinusV1MinusRequest](docs/EzsigndocumentMinusEditEzsignsignaturesMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigndocumentMinusEditEzsignsignaturesMinusV1MinusResponse](docs/EzsigndocumentMinusEditEzsignsignaturesMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusEndPrematurelyMinusV1MinusResponse](docs/EzsigndocumentMinusEndPrematurelyMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponse](docs/EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponseMinusMPayload](docs/EzsigndocumentMinusGetDownloadUrlMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetEzsignformfieldgroupsMinusV1MinusResponse](docs/EzsigndocumentMinusGetEzsignformfieldgroupsMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetEzsignformfieldgroupsMinusV1MinusResponseMinusMPayload](docs/EzsigndocumentMinusGetEzsignformfieldgroupsMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetEzsignpagesMinusV1MinusResponse](docs/EzsigndocumentMinusGetEzsignpagesMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetEzsignpagesMinusV1MinusResponseMinusMPayload](docs/EzsigndocumentMinusGetEzsignpagesMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetEzsignsignaturesMinusV1MinusResponse](docs/EzsigndocumentMinusGetEzsignsignaturesMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetEzsignsignaturesMinusV1MinusResponseMinusMPayload](docs/EzsigndocumentMinusGetEzsignsignaturesMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetFormDataMinusV1MinusResponse](docs/EzsigndocumentMinusGetFormDataMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetFormDataMinusV1MinusResponseMinusMPayload](docs/EzsigndocumentMinusGetFormDataMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetObjectMinusV1MinusResponse](docs/EzsigndocumentMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsigndocumentMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetTemporaryProofMinusV1MinusResponse](docs/EzsigndocumentMinusGetTemporaryProofMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetTemporaryProofMinusV1MinusResponseMinusMPayload](docs/EzsigndocumentMinusGetTemporaryProofMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetWordsPositionsMinusV1MinusRequest](docs/EzsigndocumentMinusGetWordsPositionsMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetWordsPositionsMinusV1MinusResponse](docs/EzsigndocumentMinusGetWordsPositionsMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusPatchObjectMinusV1MinusRequest](docs/EzsigndocumentMinusPatchObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigndocumentMinusPatchObjectMinusV1MinusResponse](docs/EzsigndocumentMinusPatchObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusRequest](docs/EzsigndocumentMinusRequest.md)
 - [eZmaxApi.models.EzsigndocumentMinusRequestCompound](docs/EzsigndocumentMinusRequestCompound.md)
 - [eZmaxApi.models.EzsigndocumentMinusRequestPatch](docs/EzsigndocumentMinusRequestPatch.md)
 - [eZmaxApi.models.EzsigndocumentMinusResponse](docs/EzsigndocumentMinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusResponseCompound](docs/EzsigndocumentMinusResponseCompound.md)
 - [eZmaxApi.models.EzsigndocumentResponseCompoundAllOf](docs/EzsigndocumentResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzsigndocumentlogMinusResponse](docs/EzsigndocumentlogMinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentlogMinusResponseCompound](docs/EzsigndocumentlogMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignfolderCreateObjectV1ResponseAllOf](docs/EzsignfolderCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfolderCreateObjectV2ResponseAllOf](docs/EzsignfolderCreateObjectV2ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfolderGetEzsigndocumentsV1ResponseAllOf](docs/EzsignfolderGetEzsigndocumentsV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfolderGetEzsignfoldersignerassociationsV1ResponseAllOf](docs/EzsignfolderGetEzsignfoldersignerassociationsV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfolderGetFormsDataV1ResponseAllOf](docs/EzsignfolderGetFormsDataV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfolderGetListV1ResponseAllOf](docs/EzsignfolderGetListV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfolderGetListV1ResponseMPayloadAllOf](docs/EzsignfolderGetListV1ResponseMPayloadAllOf.md)
 - [eZmaxApi.models.EzsignfolderGetObjectV1ResponseAllOf](docs/EzsignfolderGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfolderMinusCreateObjectMinusV1MinusRequest](docs/EzsignfolderMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusCreateObjectMinusV1MinusResponse](docs/EzsignfolderMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsignfolderMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfolderMinusCreateObjectMinusV2MinusRequest](docs/EzsignfolderMinusCreateObjectMinusV2MinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusCreateObjectMinusV2MinusResponse](docs/EzsignfolderMinusCreateObjectMinusV2MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusCreateObjectMinusV2MinusResponseMinusMPayload](docs/EzsignfolderMinusCreateObjectMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfolderMinusDeleteObjectMinusV1MinusResponse](docs/EzsignfolderMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusEditObjectMinusV1MinusRequest](docs/EzsignfolderMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusEditObjectMinusV1MinusResponse](docs/EzsignfolderMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusGetEzsigndocumentsMinusV1MinusResponse](docs/EzsignfolderMinusGetEzsigndocumentsMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusGetEzsigndocumentsMinusV1MinusResponseMinusMPayload](docs/EzsignfolderMinusGetEzsigndocumentsMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfolderMinusGetEzsignfoldersignerassociationsMinusV1MinusResponse](docs/EzsignfolderMinusGetEzsignfoldersignerassociationsMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusGetEzsignfoldersignerassociationsMinusV1MinusResponseMinusMPayload](docs/EzsignfolderMinusGetEzsignfoldersignerassociationsMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfolderMinusGetFormsDataMinusV1MinusResponse](docs/EzsignfolderMinusGetFormsDataMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusGetFormsDataMinusV1MinusResponseMinusMPayload](docs/EzsignfolderMinusGetFormsDataMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfolderMinusGetListMinusV1MinusResponse](docs/EzsignfolderMinusGetListMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusGetListMinusV1MinusResponseMinusMPayload](docs/EzsignfolderMinusGetListMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfolderMinusGetObjectMinusV1MinusResponse](docs/EzsignfolderMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsignfolderMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfolderMinusListElement](docs/EzsignfolderMinusListElement.md)
 - [eZmaxApi.models.EzsignfolderMinusRequest](docs/EzsignfolderMinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusRequestCompound](docs/EzsignfolderMinusRequestCompound.md)
 - [eZmaxApi.models.EzsignfolderMinusResponse](docs/EzsignfolderMinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusResponseCompound](docs/EzsignfolderMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignfolderMinusSendMinusV1MinusRequest](docs/EzsignfolderMinusSendMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusSendMinusV1MinusResponse](docs/EzsignfolderMinusSendMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusUnsendMinusV1MinusResponse](docs/EzsignfolderMinusUnsendMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationCreateObjectV1ResponseAllOf](docs/EzsignfoldersignerassociationCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationCreateObjectV2ResponseAllOf](docs/EzsignfoldersignerassociationCreateObjectV2ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseAllOf](docs/EzsignfoldersignerassociationGetInPersonLoginUrlV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationGetObjectV1ResponseAllOf](docs/EzsignfoldersignerassociationGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest](docs/EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse](docs/EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsignfoldersignerassociationMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusCreateObjectMinusV2MinusRequest](docs/EzsignfoldersignerassociationMinusCreateObjectMinusV2MinusRequest.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusCreateObjectMinusV2MinusResponse](docs/EzsignfoldersignerassociationMinusCreateObjectMinusV2MinusResponse.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusCreateObjectMinusV2MinusResponseMinusMPayload](docs/EzsignfoldersignerassociationMinusCreateObjectMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse](docs/EzsignfoldersignerassociationMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse](docs/EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponseMinusMPayload](docs/EzsignfoldersignerassociationMinusGetInPersonLoginUrlMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse](docs/EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsignfoldersignerassociationMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusRequest](docs/EzsignfoldersignerassociationMinusRequest.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusRequestCompound](docs/EzsignfoldersignerassociationMinusRequestCompound.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusResponse](docs/EzsignfoldersignerassociationMinusResponse.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusResponseCompound](docs/EzsignfoldersignerassociationMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusResponseCompoundMinusUser](docs/EzsignfoldersignerassociationMinusResponseCompoundMinusUser.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationRequestCompoundAllOf](docs/EzsignfoldersignerassociationRequestCompoundAllOf.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationResponseCompoundAllOf](docs/EzsignfoldersignerassociationResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzsignfoldertypeGetListV1ResponseAllOf](docs/EzsignfoldertypeGetListV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfoldertypeGetListV1ResponseMPayloadAllOf](docs/EzsignfoldertypeGetListV1ResponseMPayloadAllOf.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusGetListMinusV1MinusResponse](docs/EzsignfoldertypeMinusGetListMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusGetListMinusV1MinusResponseMinusMPayload](docs/EzsignfoldertypeMinusGetListMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusListElement](docs/EzsignfoldertypeMinusListElement.md)
 - [eZmaxApi.models.EzsignformfieldMinusRequest](docs/EzsignformfieldMinusRequest.md)
 - [eZmaxApi.models.EzsignformfieldMinusRequestCompound](docs/EzsignformfieldMinusRequestCompound.md)
 - [eZmaxApi.models.EzsignformfieldMinusResponse](docs/EzsignformfieldMinusResponse.md)
 - [eZmaxApi.models.EzsignformfieldMinusResponseCompound](docs/EzsignformfieldMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignformfieldgroupCreateObjectV1ResponseAllOf](docs/EzsignformfieldgroupCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignformfieldgroupGetObjectV1ResponseAllOf](docs/EzsignformfieldgroupGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignformfieldgroupMinusCreateObjectMinusV1MinusRequest](docs/EzsignformfieldgroupMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignformfieldgroupMinusCreateObjectMinusV1MinusResponse](docs/EzsignformfieldgroupMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignformfieldgroupMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsignformfieldgroupMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignformfieldgroupMinusDeleteObjectMinusV1MinusResponse](docs/EzsignformfieldgroupMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignformfieldgroupMinusEditObjectMinusV1MinusRequest](docs/EzsignformfieldgroupMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignformfieldgroupMinusEditObjectMinusV1MinusResponse](docs/EzsignformfieldgroupMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignformfieldgroupMinusGetObjectMinusV1MinusResponse](docs/EzsignformfieldgroupMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignformfieldgroupMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsignformfieldgroupMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignformfieldgroupMinusRequest](docs/EzsignformfieldgroupMinusRequest.md)
 - [eZmaxApi.models.EzsignformfieldgroupMinusRequestCompound](docs/EzsignformfieldgroupMinusRequestCompound.md)
 - [eZmaxApi.models.EzsignformfieldgroupMinusResponse](docs/EzsignformfieldgroupMinusResponse.md)
 - [eZmaxApi.models.EzsignformfieldgroupMinusResponseCompound](docs/EzsignformfieldgroupMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignformfieldgroupRequestCompoundAllOf](docs/EzsignformfieldgroupRequestCompoundAllOf.md)
 - [eZmaxApi.models.EzsignformfieldgroupResponseCompoundAllOf](docs/EzsignformfieldgroupResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzsignformfieldgroupsignerMinusRequest](docs/EzsignformfieldgroupsignerMinusRequest.md)
 - [eZmaxApi.models.EzsignformfieldgroupsignerMinusRequestCompound](docs/EzsignformfieldgroupsignerMinusRequestCompound.md)
 - [eZmaxApi.models.EzsignformfieldgroupsignerMinusResponse](docs/EzsignformfieldgroupsignerMinusResponse.md)
 - [eZmaxApi.models.EzsignformfieldgroupsignerMinusResponseCompound](docs/EzsignformfieldgroupsignerMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignpageMinusResponse](docs/EzsignpageMinusResponse.md)
 - [eZmaxApi.models.EzsignpageMinusResponseCompound](docs/EzsignpageMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignsignatureCreateObjectV1ResponseAllOf](docs/EzsignsignatureCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignsignatureCreateObjectV2ResponseAllOf](docs/EzsignsignatureCreateObjectV2ResponseAllOf.md)
 - [eZmaxApi.models.EzsignsignatureGetObjectV1ResponseAllOf](docs/EzsignsignatureGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignsignatureMinusCreateObjectMinusV1MinusRequest](docs/EzsignsignatureMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignsignatureMinusCreateObjectMinusV1MinusResponse](docs/EzsignsignatureMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignsignatureMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsignsignatureMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignsignatureMinusCreateObjectMinusV2MinusRequest](docs/EzsignsignatureMinusCreateObjectMinusV2MinusRequest.md)
 - [eZmaxApi.models.EzsignsignatureMinusCreateObjectMinusV2MinusResponse](docs/EzsignsignatureMinusCreateObjectMinusV2MinusResponse.md)
 - [eZmaxApi.models.EzsignsignatureMinusCreateObjectMinusV2MinusResponseMinusMPayload](docs/EzsignsignatureMinusCreateObjectMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignsignatureMinusDeleteObjectMinusV1MinusResponse](docs/EzsignsignatureMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignsignatureMinusEditObjectMinusV1MinusRequest](docs/EzsignsignatureMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignsignatureMinusEditObjectMinusV1MinusResponse](docs/EzsignsignatureMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignsignatureMinusGetObjectMinusV1MinusResponse](docs/EzsignsignatureMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignsignatureMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsignsignatureMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignsignatureMinusRequest](docs/EzsignsignatureMinusRequest.md)
 - [eZmaxApi.models.EzsignsignatureMinusRequestCompound](docs/EzsignsignatureMinusRequestCompound.md)
 - [eZmaxApi.models.EzsignsignatureMinusResponse](docs/EzsignsignatureMinusResponse.md)
 - [eZmaxApi.models.EzsignsignatureMinusResponseCompound](docs/EzsignsignatureMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignsignatureRequestCompoundAllOf](docs/EzsignsignatureRequestCompoundAllOf.md)
 - [eZmaxApi.models.EzsignsignatureResponseCompoundAllOf](docs/EzsignsignatureResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzsignsignaturecustomdateMinusRequest](docs/EzsignsignaturecustomdateMinusRequest.md)
 - [eZmaxApi.models.EzsignsignaturecustomdateMinusRequestCompound](docs/EzsignsignaturecustomdateMinusRequestCompound.md)
 - [eZmaxApi.models.EzsignsignaturecustomdateMinusResponse](docs/EzsignsignaturecustomdateMinusResponse.md)
 - [eZmaxApi.models.EzsignsignaturecustomdateMinusResponseCompound](docs/EzsignsignaturecustomdateMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignsignerMinusRequest](docs/EzsignsignerMinusRequest.md)
 - [eZmaxApi.models.EzsignsignerMinusRequestCompound](docs/EzsignsignerMinusRequestCompound.md)
 - [eZmaxApi.models.EzsignsignerMinusRequestCompoundMinusContact](docs/EzsignsignerMinusRequestCompoundMinusContact.md)
 - [eZmaxApi.models.EzsignsignerMinusResponse](docs/EzsignsignerMinusResponse.md)
 - [eZmaxApi.models.EzsignsignerMinusResponseCompound](docs/EzsignsignerMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignsignerMinusResponseCompoundMinusContact](docs/EzsignsignerMinusResponseCompoundMinusContact.md)
 - [eZmaxApi.models.EzsignsignerRequestCompoundAllOf](docs/EzsignsignerRequestCompoundAllOf.md)
 - [eZmaxApi.models.EzsignsignerResponseCompoundAllOf](docs/EzsignsignerResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackageGetListV1ResponseAllOf](docs/EzsigntemplatepackageGetListV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackageGetListV1ResponseMPayloadAllOf](docs/EzsigntemplatepackageGetListV1ResponseMPayloadAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusGetListMinusV1MinusResponse](docs/EzsigntemplatepackageMinusGetListMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusGetListMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatepackageMinusGetListMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusListElement](docs/EzsigntemplatepackageMinusListElement.md)
 - [eZmaxApi.models.FieldMinusEActivesessionSessiontype](docs/FieldMinusEActivesessionSessiontype.md)
 - [eZmaxApi.models.FieldMinusEActivesessionWeekdaystart](docs/FieldMinusEActivesessionWeekdaystart.md)
 - [eZmaxApi.models.FieldMinusEEzsigndocumentStep](docs/FieldMinusEEzsigndocumentStep.md)
 - [eZmaxApi.models.FieldMinusEEzsigndocumentlogType](docs/FieldMinusEEzsigndocumentlogType.md)
 - [eZmaxApi.models.FieldMinusEEzsignfolderSendreminderfrequency](docs/FieldMinusEEzsignfolderSendreminderfrequency.md)
 - [eZmaxApi.models.FieldMinusEEzsignfolderStep](docs/FieldMinusEEzsignfolderStep.md)
 - [eZmaxApi.models.FieldMinusEEzsignfoldertypePrivacylevel](docs/FieldMinusEEzsignfoldertypePrivacylevel.md)
 - [eZmaxApi.models.FieldMinusEEzsignformfieldgroupSignerrequirement](docs/FieldMinusEEzsignformfieldgroupSignerrequirement.md)
 - [eZmaxApi.models.FieldMinusEEzsignformfieldgroupTooltipposition](docs/FieldMinusEEzsignformfieldgroupTooltipposition.md)
 - [eZmaxApi.models.FieldMinusEEzsignformfieldgroupType](docs/FieldMinusEEzsignformfieldgroupType.md)
 - [eZmaxApi.models.FieldMinusEEzsignsignatureType](docs/FieldMinusEEzsignsignatureType.md)
 - [eZmaxApi.models.FieldMinusEEzsigntemplatepackageType](docs/FieldMinusEEzsigntemplatepackageType.md)
 - [eZmaxApi.models.FieldMinusEPhoneType](docs/FieldMinusEPhoneType.md)
 - [eZmaxApi.models.FieldMinusEUserType](docs/FieldMinusEUserType.md)
 - [eZmaxApi.models.FieldMinusEUserTypeSSPR](docs/FieldMinusEUserTypeSSPR.md)
 - [eZmaxApi.models.FranchisereferalincomeCreateObjectV1ResponseAllOf](docs/FranchisereferalincomeCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.FranchisereferalincomeCreateObjectV2ResponseAllOf](docs/FranchisereferalincomeCreateObjectV2ResponseAllOf.md)
 - [eZmaxApi.models.FranchisereferalincomeMinusCreateObjectMinusV1MinusRequest](docs/FranchisereferalincomeMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.FranchisereferalincomeMinusCreateObjectMinusV1MinusResponse](docs/FranchisereferalincomeMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.FranchisereferalincomeMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/FranchisereferalincomeMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.FranchisereferalincomeMinusCreateObjectMinusV2MinusRequest](docs/FranchisereferalincomeMinusCreateObjectMinusV2MinusRequest.md)
 - [eZmaxApi.models.FranchisereferalincomeMinusCreateObjectMinusV2MinusResponse](docs/FranchisereferalincomeMinusCreateObjectMinusV2MinusResponse.md)
 - [eZmaxApi.models.FranchisereferalincomeMinusCreateObjectMinusV2MinusResponseMinusMPayload](docs/FranchisereferalincomeMinusCreateObjectMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.FranchisereferalincomeMinusRequest](docs/FranchisereferalincomeMinusRequest.md)
 - [eZmaxApi.models.FranchisereferalincomeMinusRequestCompound](docs/FranchisereferalincomeMinusRequestCompound.md)
 - [eZmaxApi.models.FranchisereferalincomeRequestCompoundAllOf](docs/FranchisereferalincomeRequestCompoundAllOf.md)
 - [eZmaxApi.models.GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse](docs/GlobalMinusCustomerMinusGetEndpointMinusV1MinusResponse.md)
 - [eZmaxApi.models.HeaderMinusAcceptMinusLanguage](docs/HeaderMinusAcceptMinusLanguage.md)
 - [eZmaxApi.models.ListGetListpresentationV1ResponseAllOf](docs/ListGetListpresentationV1ResponseAllOf.md)
 - [eZmaxApi.models.ListMinusGetListpresentationMinusV1MinusResponse](docs/ListMinusGetListpresentationMinusV1MinusResponse.md)
 - [eZmaxApi.models.ListMinusGetListpresentationMinusV1MinusResponseMinusMPayload](docs/ListMinusGetListpresentationMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.ListMinusSaveListpresentationMinusV1MinusRequest](docs/ListMinusSaveListpresentationMinusV1MinusRequest.md)
 - [eZmaxApi.models.ListMinusSaveListpresentationMinusV1MinusResponse](docs/ListMinusSaveListpresentationMinusV1MinusResponse.md)
 - [eZmaxApi.models.ListpresentationMinusRequest](docs/ListpresentationMinusRequest.md)
 - [eZmaxApi.models.ListpresentationMinusRequestCompound](docs/ListpresentationMinusRequestCompound.md)
 - [eZmaxApi.models.ListpresentationMinusResponseCompound](docs/ListpresentationMinusResponseCompound.md)
 - [eZmaxApi.models.MultilingualMinusApikeyDescription](docs/MultilingualMinusApikeyDescription.md)
 - [eZmaxApi.models.PhoneMinusRequest](docs/PhoneMinusRequest.md)
 - [eZmaxApi.models.PhoneMinusRequestCompound](docs/PhoneMinusRequestCompound.md)
 - [eZmaxApi.models.SsprMinusResetPasswordMinusV1MinusRequest](docs/SsprMinusResetPasswordMinusV1MinusRequest.md)
 - [eZmaxApi.models.SsprMinusResetPasswordRequestMinusV1MinusRequest](docs/SsprMinusResetPasswordRequestMinusV1MinusRequest.md)
 - [eZmaxApi.models.SsprMinusSendUsernamesMinusV1MinusRequest](docs/SsprMinusSendUsernamesMinusV1MinusRequest.md)
 - [eZmaxApi.models.SsprMinusUnlockAccountMinusV1MinusRequest](docs/SsprMinusUnlockAccountMinusV1MinusRequest.md)
 - [eZmaxApi.models.SsprMinusUnlockAccountRequestMinusV1MinusRequest](docs/SsprMinusUnlockAccountRequestMinusV1MinusRequest.md)
 - [eZmaxApi.models.SsprMinusValidateTokenMinusV1MinusRequest](docs/SsprMinusValidateTokenMinusV1MinusRequest.md)
 - [eZmaxApi.models.UserCreateEzsignuserV1ResponseAllOf](docs/UserCreateEzsignuserV1ResponseAllOf.md)
 - [eZmaxApi.models.UserMinusCreateEzsignuserMinusV1MinusRequest](docs/UserMinusCreateEzsignuserMinusV1MinusRequest.md)
 - [eZmaxApi.models.UserMinusCreateEzsignuserMinusV1MinusResponse](docs/UserMinusCreateEzsignuserMinusV1MinusResponse.md)
 - [eZmaxApi.models.UserMinusCreateEzsignuserMinusV1MinusResponseMinusMPayload](docs/UserMinusCreateEzsignuserMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.UserMinusResponse](docs/UserMinusResponse.md)
 - [eZmaxApi.models.UserMinusResponseCompound](docs/UserMinusResponseCompound.md)
 - [eZmaxApi.models.WebhookEzsignDocumentCompletedAllOf](docs/WebhookEzsignDocumentCompletedAllOf.md)
 - [eZmaxApi.models.WebhookEzsignFolderCompletedAllOf](docs/WebhookEzsignFolderCompletedAllOf.md)
 - [eZmaxApi.models.WebhookMinusEzsignMinusDocumentCompleted](docs/WebhookMinusEzsignMinusDocumentCompleted.md)
 - [eZmaxApi.models.WebhookMinusEzsignMinusFolderCompleted](docs/WebhookMinusEzsignMinusFolderCompleted.md)
 - [eZmaxApi.models.WebhookMinusResponse](docs/WebhookMinusResponse.md)
 - [eZmaxApi.models.WebhookMinusUserMinusUserCreated](docs/WebhookMinusUserMinusUserCreated.md)
 - [eZmaxApi.models.WebhookUserUserCreatedAllOf](docs/WebhookUserUserCreatedAllOf.md)
 - [eZmaxApi.models.WebsiteMinusRequest](docs/WebsiteMinusRequest.md)
 - [eZmaxApi.models.WebsiteMinusRequestCompound](docs/WebsiteMinusRequestCompound.md)


<a name="documentation-for-authorization"></a>
## Documentation for Authorization

<a name="Authorization"></a>
### Authorization

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header

