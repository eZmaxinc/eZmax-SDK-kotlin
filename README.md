# eZmaxApi - Kotlin client library for eZmax API Definition (Full)

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
*ModuleEzsignApi* | [**ezsignSuggestSignersV1**](docs/ModuleEzsignApi.md#ezsignsuggestsignersv1) | **GET** /1/module/ezsign/suggestSigners | Suggest signers
*ModuleEzsignApi* | [**ezsignSuggestTemplatesV1**](docs/ModuleEzsignApi.md#ezsignsuggesttemplatesv1) | **GET** /1/module/ezsign/suggestTemplates | Suggest templates
*ModuleUserApi* | [**userCreateEzsignuserV1**](docs/ModuleUserApi.md#usercreateezsignuserv1) | **POST** /1/module/user/createezsignuser | Create a new User of type Ezsignuser
*ObjectActivesessionApi* | [**activesessionGetCurrentV1**](docs/ObjectActivesessionApi.md#activesessiongetcurrentv1) | **GET** /1/object/activesession/getCurrent | Get Current Activesession
*ObjectApikeyApi* | [**apikeyCreateObjectV1**](docs/ObjectApikeyApi.md#apikeycreateobjectv1) | **POST** /1/object/apikey | Create a new Apikey
*ObjectApikeyApi* | [**apikeyCreateObjectV2**](docs/ObjectApikeyApi.md#apikeycreateobjectv2) | **POST** /2/object/apikey | Create a new Apikey
*ObjectBillingentityinternalApi* | [**billingentityinternalGetAutocompleteV1**](docs/ObjectBillingentityinternalApi.md#billingentityinternalgetautocompletev1) | **GET** /1/object/billingentityinternal/getAutocomplete/{sSelector} | Retrieve Billingentityinternals and IDs
*ObjectBillingentityinternalApi* | [**billingentityinternalGetAutocompleteV2**](docs/ObjectBillingentityinternalApi.md#billingentityinternalgetautocompletev2) | **GET** /2/object/billingentityinternal/getAutocomplete/{sSelector} | Retrieve Billingentityinternals and IDs
*ObjectBrandingApi* | [**brandingCreateObjectV1**](docs/ObjectBrandingApi.md#brandingcreateobjectv1) | **POST** /1/object/branding | Create a new Branding
*ObjectBrandingApi* | [**brandingEditObjectV1**](docs/ObjectBrandingApi.md#brandingeditobjectv1) | **PUT** /1/object/branding/{pkiBrandingID} | Edit an existing Branding
*ObjectBrandingApi* | [**brandingGetAutocompleteV1**](docs/ObjectBrandingApi.md#brandinggetautocompletev1) | **GET** /1/object/branding/getAutocomplete/{sSelector} | Retrieve Brandings and IDs
*ObjectBrandingApi* | [**brandingGetAutocompleteV2**](docs/ObjectBrandingApi.md#brandinggetautocompletev2) | **GET** /2/object/branding/getAutocomplete/{sSelector} | Retrieve Brandings and IDs
*ObjectBrandingApi* | [**brandingGetListV1**](docs/ObjectBrandingApi.md#brandinggetlistv1) | **GET** /1/object/branding/getList | Retrieve Branding list
*ObjectBrandingApi* | [**brandingGetObjectV1**](docs/ObjectBrandingApi.md#brandinggetobjectv1) | **GET** /1/object/branding/{pkiBrandingID} | Retrieve an existing Branding
*ObjectDepartmentApi* | [**departmentGetAutocompleteV1**](docs/ObjectDepartmentApi.md#departmentgetautocompletev1) | **GET** /1/object/department/getAutocomplete/{sSelector} | Retrieve Departments and IDs
*ObjectDepartmentApi* | [**departmentGetAutocompleteV2**](docs/ObjectDepartmentApi.md#departmentgetautocompletev2) | **GET** /2/object/department/getAutocomplete/{sSelector} | Retrieve Departments and IDs
*ObjectDepartmentApi* | [**departmentGetMembersV1**](docs/ObjectDepartmentApi.md#departmentgetmembersv1) | **GET** /1/object/department/{pkiDepartmentID}/getMembers | Retrieve an existing Department's members
*ObjectEzmaxinvoicingApi* | [**ezmaxinvoicingGetAutocompleteV1**](docs/ObjectEzmaxinvoicingApi.md#ezmaxinvoicinggetautocompletev1) | **GET** /1/object/ezmaxinvoicing/getAutocomplete/{sSelector} | Retrieve Ezmaxinvoicings and IDs
*ObjectEzmaxinvoicingApi* | [**ezmaxinvoicingGetAutocompleteV2**](docs/ObjectEzmaxinvoicingApi.md#ezmaxinvoicinggetautocompletev2) | **GET** /2/object/ezmaxinvoicing/getAutocomplete/{sSelector} | Retrieve Ezmaxinvoicings and IDs
*ObjectEzmaxinvoicingApi* | [**ezmaxinvoicingGetObjectV1**](docs/ObjectEzmaxinvoicingApi.md#ezmaxinvoicinggetobjectv1) | **GET** /1/object/ezmaxinvoicing/{pkiEzmaxinvoicingID} | Retrieve an existing Ezmaxinvoicing
*ObjectEzmaxinvoicingApi* | [**ezmaxinvoicingGetProvisionalV1**](docs/ObjectEzmaxinvoicingApi.md#ezmaxinvoicinggetprovisionalv1) | **GET** /1/object/ezmaxinvoicing/getProvisional | Retrieve provisional Ezmaxinvoicing
*ObjectEzsignbulksendApi* | [**ezsignbulksendCreateEzsignbulksendtransmissionV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendcreateezsignbulksendtransmissionv1) | **POST** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/createEzsignbulksendtransmission | Create a new Ezsignbulksendtransmission in the Ezsignbulksend
*ObjectEzsignbulksendApi* | [**ezsignbulksendCreateObjectV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendcreateobjectv1) | **POST** /1/object/ezsignbulksend | Create a new Ezsignbulksend
*ObjectEzsignbulksendApi* | [**ezsignbulksendDeleteObjectV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksenddeleteobjectv1) | **DELETE** /1/object/ezsignbulksend/{pkiEzsignbulksendID} | Delete an existing Ezsignbulksend
*ObjectEzsignbulksendApi* | [**ezsignbulksendEditObjectV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendeditobjectv1) | **PUT** /1/object/ezsignbulksend/{pkiEzsignbulksendID} | Edit an existing Ezsignbulksend
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetCsvTemplateV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendgetcsvtemplatev1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getCsvTemplate | Retrieve an existing Ezsignbulksend's empty Csv template
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetEzsignbulksendtransmissionsV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendgetezsignbulksendtransmissionsv1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getEzsignbulksendtransmissions | Retrieve an existing Ezsignbulksend's Ezsignbulksendtransmissions
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetFormsDataV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendgetformsdatav1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/getFormsData | Retrieve an existing Ezsignbulksend's forms data
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetListV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendgetlistv1) | **GET** /1/object/ezsignbulksend/getList | Retrieve Ezsignbulksend list
*ObjectEzsignbulksendApi* | [**ezsignbulksendGetObjectV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendgetobjectv1) | **GET** /1/object/ezsignbulksend/{pkiEzsignbulksendID} | Retrieve an existing Ezsignbulksend
*ObjectEzsignbulksendApi* | [**ezsignbulksendReorderV1**](docs/ObjectEzsignbulksendApi.md#ezsignbulksendreorderv1) | **POST** /1/object/ezsignbulksend/{pkiEzsignbulksendID}/reorder | Reorder Ezsignbulksenddocumentmappings in the Ezsignbulksend
*ObjectEzsignbulksenddocumentmappingApi* | [**ezsignbulksenddocumentmappingCreateObjectV1**](docs/ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingcreateobjectv1) | **POST** /1/object/ezsignbulksenddocumentmapping | Create a new Ezsignbulksenddocumentmapping
*ObjectEzsignbulksenddocumentmappingApi* | [**ezsignbulksenddocumentmappingDeleteObjectV1**](docs/ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappingdeleteobjectv1) | **DELETE** /1/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID} | Delete an existing Ezsignbulksenddocumentmapping
*ObjectEzsignbulksenddocumentmappingApi* | [**ezsignbulksenddocumentmappingGetObjectV1**](docs/ObjectEzsignbulksenddocumentmappingApi.md#ezsignbulksenddocumentmappinggetobjectv1) | **GET** /1/object/ezsignbulksenddocumentmapping/{pkiEzsignbulksenddocumentmappingID} | Retrieve an existing Ezsignbulksenddocumentmapping
*ObjectEzsignbulksendsignermappingApi* | [**ezsignbulksendsignermappingCreateObjectV1**](docs/ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingcreateobjectv1) | **POST** /1/object/ezsignbulksendsignermapping | Create a new Ezsignbulksendsignermapping
*ObjectEzsignbulksendsignermappingApi* | [**ezsignbulksendsignermappingDeleteObjectV1**](docs/ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappingdeleteobjectv1) | **DELETE** /1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID} | Delete an existing Ezsignbulksendsignermapping
*ObjectEzsignbulksendsignermappingApi* | [**ezsignbulksendsignermappingGetObjectV1**](docs/ObjectEzsignbulksendsignermappingApi.md#ezsignbulksendsignermappinggetobjectv1) | **GET** /1/object/ezsignbulksendsignermapping/{pkiEzsignbulksendsignermappingID} | Retrieve an existing Ezsignbulksendsignermapping
*ObjectEzsignbulksendtransmissionApi* | [**ezsignbulksendtransmissionGetCsvErrorsV1**](docs/ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissiongetcsverrorsv1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getCsvErrors | Retrieve an existing Ezsignbulksendtransmission's Csv containing errors
*ObjectEzsignbulksendtransmissionApi* | [**ezsignbulksendtransmissionGetFormsDataV1**](docs/ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissiongetformsdatav1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID}/getFormsData | Retrieve an existing Ezsignbulksendtransmission's forms data
*ObjectEzsignbulksendtransmissionApi* | [**ezsignbulksendtransmissionGetObjectV1**](docs/ObjectEzsignbulksendtransmissionApi.md#ezsignbulksendtransmissiongetobjectv1) | **GET** /1/object/ezsignbulksendtransmission/{pkiEzsignbulksendtransmissionID} | Retrieve an existing Ezsignbulksendtransmission
*ObjectEzsigndocumentApi* | [**ezsigndocumentApplyEzsigntemplateV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentapplyezsigntemplatev1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/applyezsigntemplate | Apply an Ezsigntemplate to the Ezsigndocument.
*ObjectEzsigndocumentApi* | [**ezsigndocumentApplyEzsigntemplateV2**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentapplyezsigntemplatev2) | **POST** /2/object/ezsigndocument/{pkiEzsigndocumentID}/applyEzsigntemplate | Apply an Ezsigntemplate to the Ezsigndocument.
*ObjectEzsigndocumentApi* | [**ezsigndocumentCreateObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentcreateobjectv1) | **POST** /1/object/ezsigndocument | Create a new Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentCreateObjectV2**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentcreateobjectv2) | **POST** /2/object/ezsigndocument | Create a new Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentDeleteObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentdeleteobjectv1) | **DELETE** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Delete an existing Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentEditEzsignformfieldgroupsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumenteditezsignformfieldgroupsv1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignformfieldgroups | Edit multiple Ezsignformfieldgroups
*ObjectEzsigndocumentApi* | [**ezsigndocumentEditEzsignsignaturesV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumenteditezsignsignaturesv1) | **PUT** /1/object/ezsigndocument/{pkiEzsigndocumentID}/editEzsignsignatures | Edit multiple Ezsignsignatures
*ObjectEzsigndocumentApi* | [**ezsigndocumentEndPrematurelyV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentendprematurelyv1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/endPrematurely | End prematurely
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetActionableElementsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetactionableelementsv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getActionableElements | Retrieve actionable elements for the Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetDownloadUrlV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetdownloadurlv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getDownloadUrl/{eDocumentType} | Retrieve a URL to download documents.
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetEzsignformfieldgroupsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetezsignformfieldgroupsv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignformfieldgroups | Retrieve an existing Ezsigndocument's Ezsignformfieldgroups
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetEzsignpagesV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetezsignpagesv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignpages | Retrieve an existing Ezsigndocument's Ezsignpages
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetEzsignsignaturesV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetezsignsignaturesv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getEzsignsignatures | Retrieve an existing Ezsigndocument's Ezsignsignatures
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetFormDataV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetformdatav1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getFormData | Retrieve an existing Ezsigndocument's Form Data
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetobjectv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Retrieve an existing Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetTemporaryProofV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgettemporaryproofv1) | **GET** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getTemporaryProof | Retrieve the temporary proof
*ObjectEzsigndocumentApi* | [**ezsigndocumentGetWordsPositionsV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentgetwordspositionsv1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/getWordsPositions | Retrieve positions X,Y of given words from a Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentPatchObjectV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentpatchobjectv1) | **PATCH** /1/object/ezsigndocument/{pkiEzsigndocumentID} | Patch an existing Ezsigndocument
*ObjectEzsigndocumentApi* | [**ezsigndocumentUnsendV1**](docs/ObjectEzsigndocumentApi.md#ezsigndocumentunsendv1) | **POST** /1/object/ezsigndocument/{pkiEzsigndocumentID}/unsend | Unsend the Ezsigndocument
*ObjectEzsignfolderApi* | [**ezsignfolderArchiveV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderarchivev1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/archive | Archive the Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderBatchDownloadV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderbatchdownloadv1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/batchDownload | Download multiples files from an Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderCreateObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldercreateobjectv1) | **POST** /1/object/ezsignfolder | Create a new Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderCreateObjectV2**](docs/ObjectEzsignfolderApi.md#ezsignfoldercreateobjectv2) | **POST** /2/object/ezsignfolder | Create a new Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderDeleteObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderdeleteobjectv1) | **DELETE** /1/object/ezsignfolder/{pkiEzsignfolderID} | Delete an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderDisposeEzsignfoldersV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderdisposeezsignfoldersv1) | **POST** /1/object/ezsignfolder/disposeEzsignfolders | Dispose Ezsignfolders
*ObjectEzsignfolderApi* | [**ezsignfolderDisposeV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderdisposev1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/dispose | Dispose the Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderEditObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldereditobjectv1) | **PUT** /1/object/ezsignfolder/{pkiEzsignfolderID} | Edit an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderGetActionableElementsV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldergetactionableelementsv1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getActionableElements | Retrieve actionable elements for the Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderGetEzsigndocumentsV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldergetezsigndocumentsv1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getEzsigndocuments | Retrieve an existing Ezsignfolder's Ezsigndocuments
*ObjectEzsignfolderApi* | [**ezsignfolderGetEzsignfoldersignerassociationsV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldergetezsignfoldersignerassociationsv1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getEzsignfoldersignerassociations | Retrieve an existing Ezsignfolder's Ezsignfoldersignerassociations
*ObjectEzsignfolderApi* | [**ezsignfolderGetFormsDataV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldergetformsdatav1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID}/getFormsData | Retrieve an existing Ezsignfolder's forms data
*ObjectEzsignfolderApi* | [**ezsignfolderGetListV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldergetlistv1) | **GET** /1/object/ezsignfolder/getList | Retrieve Ezsignfolder list
*ObjectEzsignfolderApi* | [**ezsignfolderGetObjectV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldergetobjectv1) | **GET** /1/object/ezsignfolder/{pkiEzsignfolderID} | Retrieve an existing Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderImportEzsignfoldersignerassociationsV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderimportezsignfoldersignerassociationsv1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/importEzsignfoldersignerassociations | Import an existing Ezsignfoldersignerassociation into this Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderImportEzsigntemplatepackageV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderimportezsigntemplatepackagev1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/importEzsigntemplatepackage | Import an Ezsigntemplatepackage in the Ezsignfolder.
*ObjectEzsignfolderApi* | [**ezsignfolderReorderV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderreorderv1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/reorder | Reorder Ezsigndocuments in the Ezsignfolder
*ObjectEzsignfolderApi* | [**ezsignfolderSendV1**](docs/ObjectEzsignfolderApi.md#ezsignfoldersendv1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/send | Send the Ezsignfolder to the signatories for signature
*ObjectEzsignfolderApi* | [**ezsignfolderSendV2**](docs/ObjectEzsignfolderApi.md#ezsignfoldersendv2) | **POST** /2/object/ezsignfolder/{pkiEzsignfolderID}/send | Send the Ezsignfolder to the signatories for signature
*ObjectEzsignfolderApi* | [**ezsignfolderUnsendV1**](docs/ObjectEzsignfolderApi.md#ezsignfolderunsendv1) | **POST** /1/object/ezsignfolder/{pkiEzsignfolderID}/unsend | Unsend the Ezsignfolder
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationCreateObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationcreateobjectv1) | **POST** /1/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationCreateObjectV2**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationcreateobjectv2) | **POST** /2/object/ezsignfoldersignerassociation | Create a new Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationDeleteObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationdeleteobjectv1) | **DELETE** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Delete an existing Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationEditObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationeditobjectv1) | **PUT** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Edit an existing Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationForceDisconnectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationforcedisconnectv1) | **POST** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/forceDisconnect | Disconnects the Ezsignfoldersignerassociation
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationGetInPersonLoginUrlV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationgetinpersonloginurlv1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID}/getInPersonLoginUrl | Retrieve a Login Url to allow In-Person signing
*ObjectEzsignfoldersignerassociationApi* | [**ezsignfoldersignerassociationGetObjectV1**](docs/ObjectEzsignfoldersignerassociationApi.md#ezsignfoldersignerassociationgetobjectv1) | **GET** /1/object/ezsignfoldersignerassociation/{pkiEzsignfoldersignerassociationID} | Retrieve an existing Ezsignfoldersignerassociation
*ObjectEzsignfoldertypeApi* | [**ezsignfoldertypeCreateObjectV1**](docs/ObjectEzsignfoldertypeApi.md#ezsignfoldertypecreateobjectv1) | **POST** /1/object/ezsignfoldertype | Create a new Ezsignfoldertype
*ObjectEzsignfoldertypeApi* | [**ezsignfoldertypeEditObjectV1**](docs/ObjectEzsignfoldertypeApi.md#ezsignfoldertypeeditobjectv1) | **PUT** /1/object/ezsignfoldertype/{pkiEzsignfoldertypeID} | Edit an existing Ezsignfoldertype
*ObjectEzsignfoldertypeApi* | [**ezsignfoldertypeGetAutocompleteV1**](docs/ObjectEzsignfoldertypeApi.md#ezsignfoldertypegetautocompletev1) | **GET** /1/object/ezsignfoldertype/getAutocomplete/{sSelector} | Retrieve Ezsignfoldertypes and IDs
*ObjectEzsignfoldertypeApi* | [**ezsignfoldertypeGetAutocompleteV2**](docs/ObjectEzsignfoldertypeApi.md#ezsignfoldertypegetautocompletev2) | **GET** /2/object/ezsignfoldertype/getAutocomplete/{sSelector} | Retrieve Ezsignfoldertypes and IDs
*ObjectEzsignfoldertypeApi* | [**ezsignfoldertypeGetListV1**](docs/ObjectEzsignfoldertypeApi.md#ezsignfoldertypegetlistv1) | **GET** /1/object/ezsignfoldertype/getList | Retrieve Ezsignfoldertype list
*ObjectEzsignfoldertypeApi* | [**ezsignfoldertypeGetObjectV1**](docs/ObjectEzsignfoldertypeApi.md#ezsignfoldertypegetobjectv1) | **GET** /1/object/ezsignfoldertype/{pkiEzsignfoldertypeID} | Retrieve an existing Ezsignfoldertype
*ObjectEzsignformfieldgroupApi* | [**ezsignformfieldgroupCreateObjectV1**](docs/ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupcreateobjectv1) | **POST** /1/object/ezsignformfieldgroup | Create a new Ezsignformfieldgroup
*ObjectEzsignformfieldgroupApi* | [**ezsignformfieldgroupDeleteObjectV1**](docs/ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupdeleteobjectv1) | **DELETE** /1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Delete an existing Ezsignformfieldgroup
*ObjectEzsignformfieldgroupApi* | [**ezsignformfieldgroupEditObjectV1**](docs/ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupeditobjectv1) | **PUT** /1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Edit an existing Ezsignformfieldgroup
*ObjectEzsignformfieldgroupApi* | [**ezsignformfieldgroupGetObjectV1**](docs/ObjectEzsignformfieldgroupApi.md#ezsignformfieldgroupgetobjectv1) | **GET** /1/object/ezsignformfieldgroup/{pkiEzsignformfieldgroupID} | Retrieve an existing Ezsignformfieldgroup
*ObjectEzsignsignatureApi* | [**ezsignsignatureCreateObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignaturecreateobjectv1) | **POST** /1/object/ezsignsignature | Create a new Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureCreateObjectV2**](docs/ObjectEzsignsignatureApi.md#ezsignsignaturecreateobjectv2) | **POST** /2/object/ezsignsignature | Create a new Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureDeleteObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignaturedeleteobjectv1) | **DELETE** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Delete an existing Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureEditObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignatureeditobjectv1) | **PUT** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Edit an existing Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureGetObjectV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignaturegetobjectv1) | **GET** /1/object/ezsignsignature/{pkiEzsignsignatureID} | Retrieve an existing Ezsignsignature
*ObjectEzsignsignatureApi* | [**ezsignsignatureSignV1**](docs/ObjectEzsignsignatureApi.md#ezsignsignaturesignv1) | **POST** /1/object/ezsignsignature/{pkiEzsignsignatureID}/sign | Sign the Ezsignsignature
*ObjectEzsigntemplateApi* | [**ezsigntemplateCreateObjectV1**](docs/ObjectEzsigntemplateApi.md#ezsigntemplatecreateobjectv1) | **POST** /1/object/ezsigntemplate | Create a new Ezsigntemplate
*ObjectEzsigntemplateApi* | [**ezsigntemplateDeleteObjectV1**](docs/ObjectEzsigntemplateApi.md#ezsigntemplatedeleteobjectv1) | **DELETE** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Delete an existing Ezsigntemplate
*ObjectEzsigntemplateApi* | [**ezsigntemplateEditObjectV1**](docs/ObjectEzsigntemplateApi.md#ezsigntemplateeditobjectv1) | **PUT** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Edit an existing Ezsigntemplate
*ObjectEzsigntemplateApi* | [**ezsigntemplateGetAutocompleteV1**](docs/ObjectEzsigntemplateApi.md#ezsigntemplategetautocompletev1) | **GET** /1/object/ezsigntemplate/getAutocomplete/{sSelector} | Retrieve Ezsigntemplate and IDs
*ObjectEzsigntemplateApi* | [**ezsigntemplateGetAutocompleteV2**](docs/ObjectEzsigntemplateApi.md#ezsigntemplategetautocompletev2) | **GET** /2/object/ezsigntemplate/getAutocomplete/{sSelector} | Retrieve Ezsigntemplates and IDs
*ObjectEzsigntemplateApi* | [**ezsigntemplateGetListV1**](docs/ObjectEzsigntemplateApi.md#ezsigntemplategetlistv1) | **GET** /1/object/ezsigntemplate/getList | Retrieve Ezsigntemplate list
*ObjectEzsigntemplateApi* | [**ezsigntemplateGetObjectV1**](docs/ObjectEzsigntemplateApi.md#ezsigntemplategetobjectv1) | **GET** /1/object/ezsigntemplate/{pkiEzsigntemplateID} | Retrieve an existing Ezsigntemplate
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentCreateObjectV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentcreateobjectv1) | **POST** /1/object/ezsigntemplatedocument | Create a new Ezsigntemplatedocument
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumenteditezsigntemplateformfieldgroupsv1) | **PUT** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplateformfieldgroups | Edit multiple Ezsigntemplateformfieldgroups
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentEditEzsigntemplatesignaturesV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumenteditezsigntemplatesignaturesv1) | **PUT** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/editEzsigntemplatesignatures | Edit multiple Ezsigntemplatesignatures
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentEditObjectV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumenteditobjectv1) | **PUT** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID} | Edit an existing Ezsigntemplatedocument
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentGetEzsigntemplatedocumentpagesV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentgetezsigntemplatedocumentpagesv1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplatedocumentpages | Retrieve an existing Ezsigntemplatedocument's Ezsigntemplatedocumentpages
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentgetezsigntemplateformfieldgroupsv1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplateformfieldgroups | Retrieve an existing Ezsigntemplatedocument's Ezsigntemplateformfieldgroups
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentGetEzsigntemplatesignaturesV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentgetezsigntemplatesignaturesv1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getEzsigntemplatesignatures | Retrieve an existing Ezsigntemplatedocument's Ezsigntemplatesignatures
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentGetObjectV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentgetobjectv1) | **GET** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID} | Retrieve an existing Ezsigntemplatedocument
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentGetWordsPositionsV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentgetwordspositionsv1) | **POST** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID}/getWordsPositions | Retrieve positions X,Y of given words from a Ezsigntemplatedocument
*ObjectEzsigntemplatedocumentApi* | [**ezsigntemplatedocumentPatchObjectV1**](docs/ObjectEzsigntemplatedocumentApi.md#ezsigntemplatedocumentpatchobjectv1) | **PATCH** /1/object/ezsigntemplatedocument/{pkiEzsigntemplatedocumentID} | Patch an existing Ezsigntemplatedocument
*ObjectEzsigntemplateformfieldgroupApi* | [**ezsigntemplateformfieldgroupCreateObjectV1**](docs/ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupcreateobjectv1) | **POST** /1/object/ezsigntemplateformfieldgroup | Create a new Ezsigntemplateformfieldgroup
*ObjectEzsigntemplateformfieldgroupApi* | [**ezsigntemplateformfieldgroupDeleteObjectV1**](docs/ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupdeleteobjectv1) | **DELETE** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Delete an existing Ezsigntemplateformfieldgroup
*ObjectEzsigntemplateformfieldgroupApi* | [**ezsigntemplateformfieldgroupEditObjectV1**](docs/ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupeditobjectv1) | **PUT** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Edit an existing Ezsigntemplateformfieldgroup
*ObjectEzsigntemplateformfieldgroupApi* | [**ezsigntemplateformfieldgroupGetObjectV1**](docs/ObjectEzsigntemplateformfieldgroupApi.md#ezsigntemplateformfieldgroupgetobjectv1) | **GET** /1/object/ezsigntemplateformfieldgroup/{pkiEzsigntemplateformfieldgroupID} | Retrieve an existing Ezsigntemplateformfieldgroup
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageCreateObjectV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackagecreateobjectv1) | **POST** /1/object/ezsigntemplatepackage | Create a new Ezsigntemplatepackage
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageDeleteObjectV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackagedeleteobjectv1) | **DELETE** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Delete an existing Ezsigntemplatepackage
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageEditEzsigntemplatepackagesignersV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageeditezsigntemplatepackagesignersv1) | **PUT** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID}/editEzsigntemplatepackagesigners | Edit multiple Ezsigntemplatepackagesigners
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageEditObjectV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackageeditobjectv1) | **PUT** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Edit an existing Ezsigntemplatepackage
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageGetAutocompleteV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackagegetautocompletev1) | **GET** /1/object/ezsigntemplatepackage/getAutocomplete/{sSelector} | Retrieve Ezsigntemplatepackages and IDs
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageGetAutocompleteV2**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackagegetautocompletev2) | **GET** /2/object/ezsigntemplatepackage/getAutocomplete/{sSelector} | Retrieve Ezsigntemplatepackages and IDs
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageGetListV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackagegetlistv1) | **GET** /1/object/ezsigntemplatepackage/getList | Retrieve Ezsigntemplatepackage list
*ObjectEzsigntemplatepackageApi* | [**ezsigntemplatepackageGetObjectV1**](docs/ObjectEzsigntemplatepackageApi.md#ezsigntemplatepackagegetobjectv1) | **GET** /1/object/ezsigntemplatepackage/{pkiEzsigntemplatepackageID} | Retrieve an existing Ezsigntemplatepackage
*ObjectEzsigntemplatepackagemembershipApi* | [**ezsigntemplatepackagemembershipCreateObjectV1**](docs/ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipcreateobjectv1) | **POST** /1/object/ezsigntemplatepackagemembership | Create a new Ezsigntemplatepackagemembership
*ObjectEzsigntemplatepackagemembershipApi* | [**ezsigntemplatepackagemembershipDeleteObjectV1**](docs/ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipdeleteobjectv1) | **DELETE** /1/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID} | Delete an existing Ezsigntemplatepackagemembership
*ObjectEzsigntemplatepackagemembershipApi* | [**ezsigntemplatepackagemembershipGetObjectV1**](docs/ObjectEzsigntemplatepackagemembershipApi.md#ezsigntemplatepackagemembershipgetobjectv1) | **GET** /1/object/ezsigntemplatepackagemembership/{pkiEzsigntemplatepackagemembershipID} | Retrieve an existing Ezsigntemplatepackagemembership
*ObjectEzsigntemplatepackagesignerApi* | [**ezsigntemplatepackagesignerCreateObjectV1**](docs/ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignercreateobjectv1) | **POST** /1/object/ezsigntemplatepackagesigner | Create a new Ezsigntemplatepackagesigner
*ObjectEzsigntemplatepackagesignerApi* | [**ezsigntemplatepackagesignerDeleteObjectV1**](docs/ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignerdeleteobjectv1) | **DELETE** /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Delete an existing Ezsigntemplatepackagesigner
*ObjectEzsigntemplatepackagesignerApi* | [**ezsigntemplatepackagesignerEditObjectV1**](docs/ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignereditobjectv1) | **PUT** /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Edit an existing Ezsigntemplatepackagesigner
*ObjectEzsigntemplatepackagesignerApi* | [**ezsigntemplatepackagesignerGetObjectV1**](docs/ObjectEzsigntemplatepackagesignerApi.md#ezsigntemplatepackagesignergetobjectv1) | **GET** /1/object/ezsigntemplatepackagesigner/{pkiEzsigntemplatepackagesignerID} | Retrieve an existing Ezsigntemplatepackagesigner
*ObjectEzsigntemplatepackagesignermembershipApi* | [**ezsigntemplatepackagesignermembershipCreateObjectV1**](docs/ObjectEzsigntemplatepackagesignermembershipApi.md#ezsigntemplatepackagesignermembershipcreateobjectv1) | **POST** /1/object/ezsigntemplatepackagesignermembership | Create a new Ezsigntemplatepackagesignermembership
*ObjectEzsigntemplatepackagesignermembershipApi* | [**ezsigntemplatepackagesignermembershipDeleteObjectV1**](docs/ObjectEzsigntemplatepackagesignermembershipApi.md#ezsigntemplatepackagesignermembershipdeleteobjectv1) | **DELETE** /1/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID} | Delete an existing Ezsigntemplatepackagesignermembership
*ObjectEzsigntemplatepackagesignermembershipApi* | [**ezsigntemplatepackagesignermembershipGetObjectV1**](docs/ObjectEzsigntemplatepackagesignermembershipApi.md#ezsigntemplatepackagesignermembershipgetobjectv1) | **GET** /1/object/ezsigntemplatepackagesignermembership/{pkiEzsigntemplatepackagesignermembershipID} | Retrieve an existing Ezsigntemplatepackagesignermembership
*ObjectEzsigntemplatesignatureApi* | [**ezsigntemplatesignatureCreateObjectV1**](docs/ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignaturecreateobjectv1) | **POST** /1/object/ezsigntemplatesignature | Create a new Ezsigntemplatesignature
*ObjectEzsigntemplatesignatureApi* | [**ezsigntemplatesignatureDeleteObjectV1**](docs/ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignaturedeleteobjectv1) | **DELETE** /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Delete an existing Ezsigntemplatesignature
*ObjectEzsigntemplatesignatureApi* | [**ezsigntemplatesignatureEditObjectV1**](docs/ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignatureeditobjectv1) | **PUT** /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Edit an existing Ezsigntemplatesignature
*ObjectEzsigntemplatesignatureApi* | [**ezsigntemplatesignatureGetObjectV1**](docs/ObjectEzsigntemplatesignatureApi.md#ezsigntemplatesignaturegetobjectv1) | **GET** /1/object/ezsigntemplatesignature/{pkiEzsigntemplatesignatureID} | Retrieve an existing Ezsigntemplatesignature
*ObjectEzsigntemplatesignerApi* | [**ezsigntemplatesignerCreateObjectV1**](docs/ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignercreateobjectv1) | **POST** /1/object/ezsigntemplatesigner | Create a new Ezsigntemplatesigner
*ObjectEzsigntemplatesignerApi* | [**ezsigntemplatesignerDeleteObjectV1**](docs/ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignerdeleteobjectv1) | **DELETE** /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Delete an existing Ezsigntemplatesigner
*ObjectEzsigntemplatesignerApi* | [**ezsigntemplatesignerEditObjectV1**](docs/ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignereditobjectv1) | **PUT** /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Edit an existing Ezsigntemplatesigner
*ObjectEzsigntemplatesignerApi* | [**ezsigntemplatesignerGetObjectV1**](docs/ObjectEzsigntemplatesignerApi.md#ezsigntemplatesignergetobjectv1) | **GET** /1/object/ezsigntemplatesigner/{pkiEzsigntemplatesignerID} | Retrieve an existing Ezsigntemplatesigner
*ObjectEzsigntsarequirementApi* | [**ezsigntsarequirementGetAutocompleteV1**](docs/ObjectEzsigntsarequirementApi.md#ezsigntsarequirementgetautocompletev1) | **GET** /1/object/ezsigntsarequirement/getAutocomplete/{sSelector} | Retrieve Ezsigntsarequirements and IDs
*ObjectEzsigntsarequirementApi* | [**ezsigntsarequirementGetAutocompleteV2**](docs/ObjectEzsigntsarequirementApi.md#ezsigntsarequirementgetautocompletev2) | **GET** /2/object/ezsigntsarequirement/getAutocomplete/{sSelector} | Retrieve Ezsigntsarequirements and IDs
*ObjectFranchisebrokerApi* | [**franchisebrokerGetAutocompleteV1**](docs/ObjectFranchisebrokerApi.md#franchisebrokergetautocompletev1) | **GET** /1/object/franchisebroker/getAutocomplete/{sSelector} | Retrieve Franchisebrokers and IDs
*ObjectFranchiseofficeApi* | [**franchiseofficeGetAutocompleteV1**](docs/ObjectFranchiseofficeApi.md#franchiseofficegetautocompletev1) | **GET** /1/object/franchiseoffice/getAutocomplete/{sSelector} | Retrieve Franchiseoffices and IDs
*ObjectFranchisereferalincomeApi* | [**franchisereferalincomeCreateObjectV1**](docs/ObjectFranchisereferalincomeApi.md#franchisereferalincomecreateobjectv1) | **POST** /1/object/franchisereferalincome | Create a new Franchisereferalincome
*ObjectFranchisereferalincomeApi* | [**franchisereferalincomeCreateObjectV2**](docs/ObjectFranchisereferalincomeApi.md#franchisereferalincomecreateobjectv2) | **POST** /2/object/franchisereferalincome | Create a new Franchisereferalincome
*ObjectNotificationsectionApi* | [**notificationsectionGetNotificationtestsV1**](docs/ObjectNotificationsectionApi.md#notificationsectiongetnotificationtestsv1) | **GET** /1/object/notificationsection/{pkiNotificationsectionID}/getNotificationtests | Retrieve an existing Notificationsection's Notificationtests
*ObjectNotificationtestApi* | [**notificationtestGetElementsV1**](docs/ObjectNotificationtestApi.md#notificationtestgetelementsv1) | **GET** /1/object/notificationtest/{pkiNotificationtestID}/getElements | Retrieve an existing Notificationtest's Elements
*ObjectPeriodApi* | [**periodGetAutocompleteV1**](docs/ObjectPeriodApi.md#periodgetautocompletev1) | **GET** /1/object/period/getAutocomplete/{sSelector} | Retrieve Periods and IDs
*ObjectSecretquestionApi* | [**secretquestionGetAutocompleteV1**](docs/ObjectSecretquestionApi.md#secretquestiongetautocompletev1) | **GET** /1/object/secretquestion/getAutocomplete/{sSelector} | Retrieve Secretquestions and IDs
*ObjectSecretquestionApi* | [**secretquestionGetAutocompleteV2**](docs/ObjectSecretquestionApi.md#secretquestiongetautocompletev2) | **GET** /2/object/secretquestion/getAutocomplete/{sSelector} | Retrieve Secretquestions and IDs
*ObjectTaxassignmentApi* | [**taxassignmentGetAutocompleteV1**](docs/ObjectTaxassignmentApi.md#taxassignmentgetautocompletev1) | **GET** /1/object/taxassignment/getAutocomplete/{sSelector} | Retrieve Taxassignments and IDs
*ObjectTaxassignmentApi* | [**taxassignmentGetAutocompleteV2**](docs/ObjectTaxassignmentApi.md#taxassignmentgetautocompletev2) | **GET** /2/object/taxassignment/getAutocomplete/{sSelector} | Retrieve Taxassignments and IDs
*ObjectTimezoneApi* | [**timezoneGetAutocompleteV1**](docs/ObjectTimezoneApi.md#timezonegetautocompletev1) | **GET** /1/object/timezone/getAutocomplete/{sSelector} | Retrieve Timezones and IDs
*ObjectTimezoneApi* | [**timezoneGetAutocompleteV2**](docs/ObjectTimezoneApi.md#timezonegetautocompletev2) | **GET** /2/object/timezone/getAutocomplete/{sSelector} | Retrieve Timezones and IDs
*ObjectUserApi* | [**userGetAutocompleteV1**](docs/ObjectUserApi.md#usergetautocompletev1) | **GET** /1/object/user/getAutocomplete/{sSelector} | Retrieve Users and IDs
*ObjectUserApi* | [**userGetAutocompleteV2**](docs/ObjectUserApi.md#usergetautocompletev2) | **GET** /2/object/user/getAutocomplete/{sSelector} | Retrieve Users and IDs
*ObjectUsergroupApi* | [**usergroupGetAutocompleteV1**](docs/ObjectUsergroupApi.md#usergroupgetautocompletev1) | **GET** /1/object/usergroup/getAutocomplete/{sSelector} | Retrieve Usergroups and IDs
*ObjectUsergroupApi* | [**usergroupGetAutocompleteV2**](docs/ObjectUsergroupApi.md#usergroupgetautocompletev2) | **GET** /2/object/usergroup/getAutocomplete/{sSelector} | Retrieve Usergroups and IDs
*ObjectWebhookApi* | [**webhookCreateObjectV1**](docs/ObjectWebhookApi.md#webhookcreateobjectv1) | **POST** /1/object/webhook | Create a new Webhook
*ObjectWebhookApi* | [**webhookDeleteObjectV1**](docs/ObjectWebhookApi.md#webhookdeleteobjectv1) | **DELETE** /1/object/webhook/{pkiWebhookID} | Delete an existing Webhook
*ObjectWebhookApi* | [**webhookEditObjectV1**](docs/ObjectWebhookApi.md#webhookeditobjectv1) | **PUT** /1/object/webhook/{pkiWebhookID} | Edit an existing Webhook
*ObjectWebhookApi* | [**webhookGetHistoryV1**](docs/ObjectWebhookApi.md#webhookgethistoryv1) | **GET** /1/object/webhook/{pkiWebhookID}/getHistory | Retrieve the logs for recent Webhook calls
*ObjectWebhookApi* | [**webhookGetListV1**](docs/ObjectWebhookApi.md#webhookgetlistv1) | **GET** /1/object/webhook/getList | Retrieve Webhook list
*ObjectWebhookApi* | [**webhookGetObjectV1**](docs/ObjectWebhookApi.md#webhookgetobjectv1) | **GET** /1/object/webhook/{pkiWebhookID} | Retrieve an existing Webhook
*ObjectWebhookApi* | [**webhookTestV1**](docs/ObjectWebhookApi.md#webhooktestv1) | **POST** /1/object/webhook/{pkiWebhookID}/test | Test the Webhook by calling the Url


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
 - [eZmaxApi.models.BillingentityinternalGetAutocompleteV2ResponseAllOf](docs/BillingentityinternalGetAutocompleteV2ResponseAllOf.md)
 - [eZmaxApi.models.BillingentityinternalMinusAutocompleteElementMinusResponse](docs/BillingentityinternalMinusAutocompleteElementMinusResponse.md)
 - [eZmaxApi.models.BillingentityinternalMinusGetAutocompleteMinusV2MinusResponse](docs/BillingentityinternalMinusGetAutocompleteMinusV2MinusResponse.md)
 - [eZmaxApi.models.BillingentityinternalMinusGetAutocompleteMinusV2MinusResponseMinusMPayload](docs/BillingentityinternalMinusGetAutocompleteMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.BrandingCreateObjectV1ResponseAllOf](docs/BrandingCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.BrandingGetAutocompleteV2ResponseAllOf](docs/BrandingGetAutocompleteV2ResponseAllOf.md)
 - [eZmaxApi.models.BrandingGetListV1ResponseAllOf](docs/BrandingGetListV1ResponseAllOf.md)
 - [eZmaxApi.models.BrandingGetListV1ResponseMPayloadAllOf](docs/BrandingGetListV1ResponseMPayloadAllOf.md)
 - [eZmaxApi.models.BrandingGetObjectV1ResponseAllOf](docs/BrandingGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.BrandingMinusAutocompleteElementMinusResponse](docs/BrandingMinusAutocompleteElementMinusResponse.md)
 - [eZmaxApi.models.BrandingMinusCreateObjectMinusV1MinusRequest](docs/BrandingMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.BrandingMinusCreateObjectMinusV1MinusResponse](docs/BrandingMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.BrandingMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/BrandingMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.BrandingMinusEditObjectMinusV1MinusRequest](docs/BrandingMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.BrandingMinusEditObjectMinusV1MinusResponse](docs/BrandingMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.BrandingMinusGetAutocompleteMinusV2MinusResponse](docs/BrandingMinusGetAutocompleteMinusV2MinusResponse.md)
 - [eZmaxApi.models.BrandingMinusGetAutocompleteMinusV2MinusResponseMinusMPayload](docs/BrandingMinusGetAutocompleteMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.BrandingMinusGetListMinusV1MinusResponse](docs/BrandingMinusGetListMinusV1MinusResponse.md)
 - [eZmaxApi.models.BrandingMinusGetListMinusV1MinusResponseMinusMPayload](docs/BrandingMinusGetListMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.BrandingMinusGetObjectMinusV1MinusResponse](docs/BrandingMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.BrandingMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/BrandingMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.BrandingMinusListElement](docs/BrandingMinusListElement.md)
 - [eZmaxApi.models.BrandingMinusRequest](docs/BrandingMinusRequest.md)
 - [eZmaxApi.models.BrandingMinusRequestCompound](docs/BrandingMinusRequestCompound.md)
 - [eZmaxApi.models.BrandingMinusResponse](docs/BrandingMinusResponse.md)
 - [eZmaxApi.models.BrandingMinusResponseCompound](docs/BrandingMinusResponseCompound.md)
 - [eZmaxApi.models.BrandingResponseCompoundAllOf](docs/BrandingResponseCompoundAllOf.md)
 - [eZmaxApi.models.CommonGetAutocompleteDisabledV1ResponseAllOf](docs/CommonGetAutocompleteDisabledV1ResponseAllOf.md)
 - [eZmaxApi.models.CommonGetAutocompleteV1ResponseAllOf](docs/CommonGetAutocompleteV1ResponseAllOf.md)
 - [eZmaxApi.models.CommonMinusAudit](docs/CommonMinusAudit.md)
 - [eZmaxApi.models.CommonMinusAuditdetail](docs/CommonMinusAuditdetail.md)
 - [eZmaxApi.models.CommonMinusGetAutocompleteDisabledMinusV1MinusResponse](docs/CommonMinusGetAutocompleteDisabledMinusV1MinusResponse.md)
 - [eZmaxApi.models.CommonMinusGetAutocompleteMinusV1MinusResponse](docs/CommonMinusGetAutocompleteMinusV1MinusResponse.md)
 - [eZmaxApi.models.CommonMinusGetListMinusV1MinusResponseMinusMPayload](docs/CommonMinusGetListMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.CommonMinusResponse](docs/CommonMinusResponse.md)
 - [eZmaxApi.models.CommonMinusResponseGetList](docs/CommonMinusResponseGetList.md)
 - [eZmaxApi.models.CommonMinusResponseMinusError](docs/CommonMinusResponseMinusError.md)
 - [eZmaxApi.models.CommonMinusResponseMinusErrorMinusSTemporaryFileUrl](docs/CommonMinusResponseMinusErrorMinusSTemporaryFileUrl.md)
 - [eZmaxApi.models.CommonMinusResponseMinusErrorMinusTooManyRequests](docs/CommonMinusResponseMinusErrorMinusTooManyRequests.md)
 - [eZmaxApi.models.CommonMinusResponseMinusFilter](docs/CommonMinusResponseMinusFilter.md)
 - [eZmaxApi.models.CommonMinusResponseMinusObjDebug](docs/CommonMinusResponseMinusObjDebug.md)
 - [eZmaxApi.models.CommonMinusResponseMinusObjDebugPayload](docs/CommonMinusResponseMinusObjDebugPayload.md)
 - [eZmaxApi.models.CommonMinusResponseMinusObjDebugPayloadGetList](docs/CommonMinusResponseMinusObjDebugPayloadGetList.md)
 - [eZmaxApi.models.CommonMinusResponseMinusObjSQLQuery](docs/CommonMinusResponseMinusObjSQLQuery.md)
 - [eZmaxApi.models.CommonMinusResponseMinusRedirectMinusSSecretquestionTextX](docs/CommonMinusResponseMinusRedirectMinusSSecretquestionTextX.md)
 - [eZmaxApi.models.CommonMinusResponseMinusWarning](docs/CommonMinusResponseMinusWarning.md)
 - [eZmaxApi.models.CommonMinusWebhook](docs/CommonMinusWebhook.md)
 - [eZmaxApi.models.CommonResponseErrorSTemporaryFileUrlAllOf](docs/CommonResponseErrorSTemporaryFileUrlAllOf.md)
 - [eZmaxApi.models.CommonResponseObjDebugPayloadGetListAllOf](docs/CommonResponseObjDebugPayloadGetListAllOf.md)
 - [eZmaxApi.models.ContactMinusRequest](docs/ContactMinusRequest.md)
 - [eZmaxApi.models.ContactMinusRequestCompound](docs/ContactMinusRequestCompound.md)
 - [eZmaxApi.models.ContactRequestCompoundAllOf](docs/ContactRequestCompoundAllOf.md)
 - [eZmaxApi.models.ContactinformationsMinusRequest](docs/ContactinformationsMinusRequest.md)
 - [eZmaxApi.models.ContactinformationsMinusRequestCompound](docs/ContactinformationsMinusRequestCompound.md)
 - [eZmaxApi.models.ContactinformationsRequestCompoundAllOf](docs/ContactinformationsRequestCompoundAllOf.md)
 - [eZmaxApi.models.CustomAutocompleteElementDisabledResponseAllOf](docs/CustomAutocompleteElementDisabledResponseAllOf.md)
 - [eZmaxApi.models.CustomEzmaxinvoicingEzsigndocumentResponseAllOf](docs/CustomEzmaxinvoicingEzsigndocumentResponseAllOf.md)
 - [eZmaxApi.models.CustomEzmaxinvoicingEzsignfolderResponseAllOf](docs/CustomEzmaxinvoicingEzsignfolderResponseAllOf.md)
 - [eZmaxApi.models.CustomEzsignfoldersignerassociationActionableElementResponseAllOf](docs/CustomEzsignfoldersignerassociationActionableElementResponseAllOf.md)
 - [eZmaxApi.models.CustomMinusAutocompleteElementDisabledMinusResponse](docs/CustomMinusAutocompleteElementDisabledMinusResponse.md)
 - [eZmaxApi.models.CustomMinusAutocompleteElementMinusResponse](docs/CustomMinusAutocompleteElementMinusResponse.md)
 - [eZmaxApi.models.CustomMinusContactNameMinusResponse](docs/CustomMinusContactNameMinusResponse.md)
 - [eZmaxApi.models.CustomMinusDropdownElementMinusRequest](docs/CustomMinusDropdownElementMinusRequest.md)
 - [eZmaxApi.models.CustomMinusDropdownElementMinusRequestCompound](docs/CustomMinusDropdownElementMinusRequestCompound.md)
 - [eZmaxApi.models.CustomMinusDropdownElementMinusResponse](docs/CustomMinusDropdownElementMinusResponse.md)
 - [eZmaxApi.models.CustomMinusDropdownElementMinusResponseCompound](docs/CustomMinusDropdownElementMinusResponseCompound.md)
 - [eZmaxApi.models.CustomMinusEzmaxinvoicingEzsigndocumentMinusResponse](docs/CustomMinusEzmaxinvoicingEzsigndocumentMinusResponse.md)
 - [eZmaxApi.models.CustomMinusEzmaxinvoicingEzsignfolderMinusResponse](docs/CustomMinusEzmaxinvoicingEzsignfolderMinusResponse.md)
 - [eZmaxApi.models.CustomMinusEzmaxpricingMinusResponse](docs/CustomMinusEzmaxpricingMinusResponse.md)
 - [eZmaxApi.models.CustomMinusEzsignfoldersignerassociationActionableElementMinusResponse](docs/CustomMinusEzsignfoldersignerassociationActionableElementMinusResponse.md)
 - [eZmaxApi.models.CustomMinusEzsignfoldersignerassociationmessageMinusRequest](docs/CustomMinusEzsignfoldersignerassociationmessageMinusRequest.md)
 - [eZmaxApi.models.CustomMinusEzsignfoldersignerassociationstatusMinusResponse](docs/CustomMinusEzsignfoldersignerassociationstatusMinusResponse.md)
 - [eZmaxApi.models.CustomMinusEzsignfoldertransmissionMinusResponse](docs/CustomMinusEzsignfoldertransmissionMinusResponse.md)
 - [eZmaxApi.models.CustomMinusEzsignfoldertransmissionSignerMinusResponse](docs/CustomMinusEzsignfoldertransmissionSignerMinusResponse.md)
 - [eZmaxApi.models.CustomMinusEzsignsignaturestatusMinusResponse](docs/CustomMinusEzsignsignaturestatusMinusResponse.md)
 - [eZmaxApi.models.CustomMinusFormDataDocumentMinusResponse](docs/CustomMinusFormDataDocumentMinusResponse.md)
 - [eZmaxApi.models.CustomMinusFormDataEzsignformfieldMinusResponse](docs/CustomMinusFormDataEzsignformfieldMinusResponse.md)
 - [eZmaxApi.models.CustomMinusFormDataEzsignformfieldgroupMinusResponse](docs/CustomMinusFormDataEzsignformfieldgroupMinusResponse.md)
 - [eZmaxApi.models.CustomMinusFormDataSignerMinusResponse](docs/CustomMinusFormDataSignerMinusResponse.md)
 - [eZmaxApi.models.CustomMinusFormsDataFolderMinusResponse](docs/CustomMinusFormsDataFolderMinusResponse.md)
 - [eZmaxApi.models.CustomMinusImportEzsigntemplatepackageRelationMinusRequest](docs/CustomMinusImportEzsigntemplatepackageRelationMinusRequest.md)
 - [eZmaxApi.models.CustomMinusNotificationsubsectiongetnotificationtestsMinusResponse](docs/CustomMinusNotificationsubsectiongetnotificationtestsMinusResponse.md)
 - [eZmaxApi.models.CustomMinusNotificationtestgetnotificationtestsMinusResponse](docs/CustomMinusNotificationtestgetnotificationtestsMinusResponse.md)
 - [eZmaxApi.models.CustomMinusUserMinusResponse](docs/CustomMinusUserMinusResponse.md)
 - [eZmaxApi.models.CustomMinusWebhookMinusResponse](docs/CustomMinusWebhookMinusResponse.md)
 - [eZmaxApi.models.CustomMinusWebhooklogMinusResponse](docs/CustomMinusWebhooklogMinusResponse.md)
 - [eZmaxApi.models.CustomMinusWordPositionOccurenceMinusResponse](docs/CustomMinusWordPositionOccurenceMinusResponse.md)
 - [eZmaxApi.models.CustomMinusWordPositionWordMinusResponse](docs/CustomMinusWordPositionWordMinusResponse.md)
 - [eZmaxApi.models.CustomNotificationsubsectiongetnotificationtestsResponseAllOf](docs/CustomNotificationsubsectiongetnotificationtestsResponseAllOf.md)
 - [eZmaxApi.models.CustomNotificationtestgetnotificationtestsResponseAllOf](docs/CustomNotificationtestgetnotificationtestsResponseAllOf.md)
 - [eZmaxApi.models.CustomWebhookResponseAllOf](docs/CustomWebhookResponseAllOf.md)
 - [eZmaxApi.models.CustomWebhooklogResponseAllOf](docs/CustomWebhooklogResponseAllOf.md)
 - [eZmaxApi.models.DepartmentGetAutocompleteV2ResponseAllOf](docs/DepartmentGetAutocompleteV2ResponseAllOf.md)
 - [eZmaxApi.models.DepartmentGetMembersV1ResponseAllOf](docs/DepartmentGetMembersV1ResponseAllOf.md)
 - [eZmaxApi.models.DepartmentMinusAutocompleteElementMinusResponse](docs/DepartmentMinusAutocompleteElementMinusResponse.md)
 - [eZmaxApi.models.DepartmentMinusGetAutocompleteMinusV2MinusResponse](docs/DepartmentMinusGetAutocompleteMinusV2MinusResponse.md)
 - [eZmaxApi.models.DepartmentMinusGetAutocompleteMinusV2MinusResponseMinusMPayload](docs/DepartmentMinusGetAutocompleteMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.DepartmentMinusGetMembersMinusV1MinusResponse](docs/DepartmentMinusGetMembersMinusV1MinusResponse.md)
 - [eZmaxApi.models.DepartmentMinusGetMembersMinusV1MinusResponseMinusMPayload](docs/DepartmentMinusGetMembersMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EmailMinusRequest](docs/EmailMinusRequest.md)
 - [eZmaxApi.models.EmailMinusRequestCompound](docs/EmailMinusRequestCompound.md)
 - [eZmaxApi.models.EzmaxinvoicingGetAutocompleteV2ResponseAllOf](docs/EzmaxinvoicingGetAutocompleteV2ResponseAllOf.md)
 - [eZmaxApi.models.EzmaxinvoicingGetObjectV1ResponseAllOf](docs/EzmaxinvoicingGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzmaxinvoicingGetProvisionalV1ResponseAllOf](docs/EzmaxinvoicingGetProvisionalV1ResponseAllOf.md)
 - [eZmaxApi.models.EzmaxinvoicingMinusAutocompleteElementMinusResponse](docs/EzmaxinvoicingMinusAutocompleteElementMinusResponse.md)
 - [eZmaxApi.models.EzmaxinvoicingMinusGetAutocompleteMinusV2MinusResponse](docs/EzmaxinvoicingMinusGetAutocompleteMinusV2MinusResponse.md)
 - [eZmaxApi.models.EzmaxinvoicingMinusGetAutocompleteMinusV2MinusResponseMinusMPayload](docs/EzmaxinvoicingMinusGetAutocompleteMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzmaxinvoicingMinusGetObjectMinusV1MinusResponse](docs/EzmaxinvoicingMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzmaxinvoicingMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzmaxinvoicingMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzmaxinvoicingMinusGetProvisionalMinusV1MinusResponse](docs/EzmaxinvoicingMinusGetProvisionalMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzmaxinvoicingMinusGetProvisionalMinusV1MinusResponseMinusMPayload](docs/EzmaxinvoicingMinusGetProvisionalMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzmaxinvoicingMinusResponse](docs/EzmaxinvoicingMinusResponse.md)
 - [eZmaxApi.models.EzmaxinvoicingMinusResponseCompound](docs/EzmaxinvoicingMinusResponseCompound.md)
 - [eZmaxApi.models.EzmaxinvoicingResponseCompoundAllOf](docs/EzmaxinvoicingResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzmaxinvoicingagentMinusResponse](docs/EzmaxinvoicingagentMinusResponse.md)
 - [eZmaxApi.models.EzmaxinvoicingagentMinusResponseCompound](docs/EzmaxinvoicingagentMinusResponseCompound.md)
 - [eZmaxApi.models.EzmaxinvoicingagentResponseCompoundAllOf](docs/EzmaxinvoicingagentResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzmaxinvoicingcommissionMinusResponse](docs/EzmaxinvoicingcommissionMinusResponse.md)
 - [eZmaxApi.models.EzmaxinvoicingcommissionMinusResponseCompound](docs/EzmaxinvoicingcommissionMinusResponseCompound.md)
 - [eZmaxApi.models.EzmaxinvoicingcommissionResponseCompoundAllOf](docs/EzmaxinvoicingcommissionResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzmaxinvoicingcontractMinusResponse](docs/EzmaxinvoicingcontractMinusResponse.md)
 - [eZmaxApi.models.EzmaxinvoicingcontractMinusResponseCompound](docs/EzmaxinvoicingcontractMinusResponseCompound.md)
 - [eZmaxApi.models.EzmaxinvoicingsummaryexternalMinusResponse](docs/EzmaxinvoicingsummaryexternalMinusResponse.md)
 - [eZmaxApi.models.EzmaxinvoicingsummaryexternalMinusResponseCompound](docs/EzmaxinvoicingsummaryexternalMinusResponseCompound.md)
 - [eZmaxApi.models.EzmaxinvoicingsummaryexternalResponseCompoundAllOf](docs/EzmaxinvoicingsummaryexternalResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzmaxinvoicingsummaryexternaldetailMinusResponse](docs/EzmaxinvoicingsummaryexternaldetailMinusResponse.md)
 - [eZmaxApi.models.EzmaxinvoicingsummaryexternaldetailMinusResponseCompound](docs/EzmaxinvoicingsummaryexternaldetailMinusResponseCompound.md)
 - [eZmaxApi.models.EzmaxinvoicingsummaryglobalMinusResponse](docs/EzmaxinvoicingsummaryglobalMinusResponse.md)
 - [eZmaxApi.models.EzmaxinvoicingsummaryglobalMinusResponseCompound](docs/EzmaxinvoicingsummaryglobalMinusResponseCompound.md)
 - [eZmaxApi.models.EzmaxinvoicingsummaryglobalResponseCompoundAllOf](docs/EzmaxinvoicingsummaryglobalResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzmaxinvoicingsummaryinternalMinusResponse](docs/EzmaxinvoicingsummaryinternalMinusResponse.md)
 - [eZmaxApi.models.EzmaxinvoicingsummaryinternalMinusResponseCompound](docs/EzmaxinvoicingsummaryinternalMinusResponseCompound.md)
 - [eZmaxApi.models.EzmaxinvoicingsummaryinternalResponseCompoundAllOf](docs/EzmaxinvoicingsummaryinternalResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzmaxinvoicingsummaryinternaldetailMinusResponse](docs/EzmaxinvoicingsummaryinternaldetailMinusResponse.md)
 - [eZmaxApi.models.EzmaxinvoicingsummaryinternaldetailMinusResponseCompound](docs/EzmaxinvoicingsummaryinternaldetailMinusResponseCompound.md)
 - [eZmaxApi.models.EzmaxinvoicinguserMinusResponse](docs/EzmaxinvoicinguserMinusResponse.md)
 - [eZmaxApi.models.EzmaxinvoicinguserMinusResponseCompound](docs/EzmaxinvoicinguserMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignMinusSuggestSignersMinusV1MinusResponse](docs/EzsignMinusSuggestSignersMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignMinusSuggestSignersMinusV1MinusResponseMinusMPayload](docs/EzsignMinusSuggestSignersMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignMinusSuggestTemplatesMinusV1MinusResponse](docs/EzsignMinusSuggestTemplatesMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignMinusSuggestTemplatesMinusV1MinusResponseMinusMPayload](docs/EzsignMinusSuggestTemplatesMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignSuggestSignersV1ResponseAllOf](docs/EzsignSuggestSignersV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignSuggestTemplatesV1ResponseAllOf](docs/EzsignSuggestTemplatesV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseAllOf](docs/EzsignbulksendCreateEzsignbulksendtransmissionV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignbulksendCreateObjectV1ResponseAllOf](docs/EzsignbulksendCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignbulksendGetEzsignbulksendtransmissionsV1ResponseAllOf](docs/EzsignbulksendGetEzsignbulksendtransmissionsV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignbulksendGetFormsDataV1ResponseAllOf](docs/EzsignbulksendGetFormsDataV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignbulksendGetListV1ResponseAllOf](docs/EzsignbulksendGetListV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignbulksendGetListV1ResponseMPayloadAllOf](docs/EzsignbulksendGetListV1ResponseMPayloadAllOf.md)
 - [eZmaxApi.models.EzsignbulksendGetObjectV1ResponseAllOf](docs/EzsignbulksendGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusRequest](docs/EzsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusResponse](docs/EzsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusResponseMinusMPayload](docs/EzsignbulksendMinusCreateEzsignbulksendtransmissionMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignbulksendMinusCreateObjectMinusV1MinusRequest](docs/EzsignbulksendMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignbulksendMinusCreateObjectMinusV1MinusResponse](docs/EzsignbulksendMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsignbulksendMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignbulksendMinusDeleteObjectMinusV1MinusResponse](docs/EzsignbulksendMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendMinusEditObjectMinusV1MinusRequest](docs/EzsignbulksendMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignbulksendMinusEditObjectMinusV1MinusResponse](docs/EzsignbulksendMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendMinusGetEzsignbulksendtransmissionsMinusV1MinusResponse](docs/EzsignbulksendMinusGetEzsignbulksendtransmissionsMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendMinusGetEzsignbulksendtransmissionsMinusV1MinusResponseMinusMPayload](docs/EzsignbulksendMinusGetEzsignbulksendtransmissionsMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignbulksendMinusGetFormsDataMinusV1MinusResponse](docs/EzsignbulksendMinusGetFormsDataMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendMinusGetFormsDataMinusV1MinusResponseMinusMPayload](docs/EzsignbulksendMinusGetFormsDataMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignbulksendMinusGetListMinusV1MinusResponse](docs/EzsignbulksendMinusGetListMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendMinusGetListMinusV1MinusResponseMinusMPayload](docs/EzsignbulksendMinusGetListMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignbulksendMinusGetObjectMinusV1MinusResponse](docs/EzsignbulksendMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsignbulksendMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignbulksendMinusListElement](docs/EzsignbulksendMinusListElement.md)
 - [eZmaxApi.models.EzsignbulksendMinusReorderMinusV1MinusRequest](docs/EzsignbulksendMinusReorderMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignbulksendMinusReorderMinusV1MinusResponse](docs/EzsignbulksendMinusReorderMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendMinusRequest](docs/EzsignbulksendMinusRequest.md)
 - [eZmaxApi.models.EzsignbulksendMinusRequestCompound](docs/EzsignbulksendMinusRequestCompound.md)
 - [eZmaxApi.models.EzsignbulksendMinusResponse](docs/EzsignbulksendMinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendMinusResponseCompound](docs/EzsignbulksendMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignbulksendResponseCompoundAllOf](docs/EzsignbulksendResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzsignbulksenddocumentmappingCreateObjectV1ResponseAllOf](docs/EzsignbulksenddocumentmappingCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignbulksenddocumentmappingGetObjectV1ResponseAllOf](docs/EzsignbulksenddocumentmappingGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignbulksenddocumentmappingMinusCreateObjectMinusV1MinusRequest](docs/EzsignbulksenddocumentmappingMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignbulksenddocumentmappingMinusCreateObjectMinusV1MinusResponse](docs/EzsignbulksenddocumentmappingMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksenddocumentmappingMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsignbulksenddocumentmappingMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignbulksenddocumentmappingMinusDeleteObjectMinusV1MinusResponse](docs/EzsignbulksenddocumentmappingMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksenddocumentmappingMinusGetObjectMinusV1MinusResponse](docs/EzsignbulksenddocumentmappingMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksenddocumentmappingMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsignbulksenddocumentmappingMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignbulksenddocumentmappingMinusRequest](docs/EzsignbulksenddocumentmappingMinusRequest.md)
 - [eZmaxApi.models.EzsignbulksenddocumentmappingMinusRequestCompound](docs/EzsignbulksenddocumentmappingMinusRequestCompound.md)
 - [eZmaxApi.models.EzsignbulksenddocumentmappingMinusResponse](docs/EzsignbulksenddocumentmappingMinusResponse.md)
 - [eZmaxApi.models.EzsignbulksenddocumentmappingMinusResponseCompound](docs/EzsignbulksenddocumentmappingMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignbulksenddocumentmappingResponseCompoundAllOf](docs/EzsignbulksenddocumentmappingResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzsignbulksendsignermappingCreateObjectV1ResponseAllOf](docs/EzsignbulksendsignermappingCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignbulksendsignermappingGetObjectV1ResponseAllOf](docs/EzsignbulksendsignermappingGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest](docs/EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusResponse](docs/EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsignbulksendsignermappingMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignbulksendsignermappingMinusDeleteObjectMinusV1MinusResponse](docs/EzsignbulksendsignermappingMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendsignermappingMinusGetObjectMinusV1MinusResponse](docs/EzsignbulksendsignermappingMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendsignermappingMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsignbulksendsignermappingMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignbulksendsignermappingMinusRequest](docs/EzsignbulksendsignermappingMinusRequest.md)
 - [eZmaxApi.models.EzsignbulksendsignermappingMinusRequestCompound](docs/EzsignbulksendsignermappingMinusRequestCompound.md)
 - [eZmaxApi.models.EzsignbulksendsignermappingMinusResponse](docs/EzsignbulksendsignermappingMinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendsignermappingMinusResponseCompound](docs/EzsignbulksendsignermappingMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignbulksendtransmissionGetFormsDataV1ResponseAllOf](docs/EzsignbulksendtransmissionGetFormsDataV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignbulksendtransmissionGetObjectV1ResponseAllOf](docs/EzsignbulksendtransmissionGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignbulksendtransmissionMinusGetFormsDataMinusV1MinusResponse](docs/EzsignbulksendtransmissionMinusGetFormsDataMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendtransmissionMinusGetFormsDataMinusV1MinusResponseMinusMPayload](docs/EzsignbulksendtransmissionMinusGetFormsDataMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponse](docs/EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsignbulksendtransmissionMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignbulksendtransmissionMinusResponse](docs/EzsignbulksendtransmissionMinusResponse.md)
 - [eZmaxApi.models.EzsignbulksendtransmissionMinusResponseCompound](docs/EzsignbulksendtransmissionMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignbulksendtransmissionResponseCompoundAllOf](docs/EzsignbulksendtransmissionResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzsigndocumentCreateObjectV1ResponseAllOf](docs/EzsigndocumentCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigndocumentCreateObjectV2ResponseAllOf](docs/EzsigndocumentCreateObjectV2ResponseAllOf.md)
 - [eZmaxApi.models.EzsigndocumentEditEzsignformfieldgroupsV1ResponseAllOf](docs/EzsigndocumentEditEzsignformfieldgroupsV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigndocumentEditEzsignsignaturesV1ResponseAllOf](docs/EzsigndocumentEditEzsignsignaturesV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigndocumentGetActionableElementsV1ResponseAllOf](docs/EzsigndocumentGetActionableElementsV1ResponseAllOf.md)
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
 - [eZmaxApi.models.EzsigndocumentMinusEditEzsignformfieldgroupsMinusV1MinusResponseMinusMPayload](docs/EzsigndocumentMinusEditEzsignformfieldgroupsMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigndocumentMinusEditEzsignsignaturesMinusV1MinusRequest](docs/EzsigndocumentMinusEditEzsignsignaturesMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigndocumentMinusEditEzsignsignaturesMinusV1MinusResponse](docs/EzsigndocumentMinusEditEzsignsignaturesMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusEditEzsignsignaturesMinusV1MinusResponseMinusMPayload](docs/EzsigndocumentMinusEditEzsignsignaturesMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigndocumentMinusEndPrematurelyMinusV1MinusResponse](docs/EzsigndocumentMinusEndPrematurelyMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetActionableElementsMinusV1MinusResponse](docs/EzsigndocumentMinusGetActionableElementsMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentMinusGetActionableElementsMinusV1MinusResponseMinusMPayload](docs/EzsigndocumentMinusGetActionableElementsMinusV1MinusResponseMinusMPayload.md)
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
 - [eZmaxApi.models.EzsigndocumentMinusUnsendMinusV1MinusResponse](docs/EzsigndocumentMinusUnsendMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentResponseCompoundAllOf](docs/EzsigndocumentResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzsigndocumentlogMinusResponse](docs/EzsigndocumentlogMinusResponse.md)
 - [eZmaxApi.models.EzsigndocumentlogMinusResponseCompound](docs/EzsigndocumentlogMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignfolderCreateObjectV1ResponseAllOf](docs/EzsignfolderCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfolderCreateObjectV2ResponseAllOf](docs/EzsignfolderCreateObjectV2ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfolderGetActionableElementsV1ResponseAllOf](docs/EzsignfolderGetActionableElementsV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfolderGetEzsigndocumentsV1ResponseAllOf](docs/EzsignfolderGetEzsigndocumentsV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfolderGetEzsignfoldersignerassociationsV1ResponseAllOf](docs/EzsignfolderGetEzsignfoldersignerassociationsV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfolderGetFormsDataV1ResponseAllOf](docs/EzsignfolderGetFormsDataV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfolderGetListV1ResponseAllOf](docs/EzsignfolderGetListV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfolderGetListV1ResponseMPayloadAllOf](docs/EzsignfolderGetListV1ResponseMPayloadAllOf.md)
 - [eZmaxApi.models.EzsignfolderGetObjectV1ResponseAllOf](docs/EzsignfolderGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfolderImportEzsignfoldersignerassociationsV1ResponseAllOf](docs/EzsignfolderImportEzsignfoldersignerassociationsV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfolderImportEzsigntemplatepackageV1ResponseAllOf](docs/EzsignfolderImportEzsigntemplatepackageV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfolderMinusArchiveMinusV1MinusResponse](docs/EzsignfolderMinusArchiveMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusBatchDownloadMinusV1MinusRequest](docs/EzsignfolderMinusBatchDownloadMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusCreateObjectMinusV1MinusRequest](docs/EzsignfolderMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusCreateObjectMinusV1MinusResponse](docs/EzsignfolderMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsignfolderMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfolderMinusCreateObjectMinusV2MinusRequest](docs/EzsignfolderMinusCreateObjectMinusV2MinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusCreateObjectMinusV2MinusResponse](docs/EzsignfolderMinusCreateObjectMinusV2MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusCreateObjectMinusV2MinusResponseMinusMPayload](docs/EzsignfolderMinusCreateObjectMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfolderMinusDeleteObjectMinusV1MinusResponse](docs/EzsignfolderMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusDisposeEzsignfoldersMinusV1MinusRequest](docs/EzsignfolderMinusDisposeEzsignfoldersMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusDisposeEzsignfoldersMinusV1MinusResponse](docs/EzsignfolderMinusDisposeEzsignfoldersMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusDisposeMinusV1MinusResponse](docs/EzsignfolderMinusDisposeMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusEditObjectMinusV1MinusRequest](docs/EzsignfolderMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusEditObjectMinusV1MinusResponse](docs/EzsignfolderMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusGetActionableElementsMinusV1MinusResponse](docs/EzsignfolderMinusGetActionableElementsMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusGetActionableElementsMinusV1MinusResponseMinusMPayload](docs/EzsignfolderMinusGetActionableElementsMinusV1MinusResponseMinusMPayload.md)
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
 - [eZmaxApi.models.EzsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusRequest](docs/EzsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusResponse](docs/EzsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusResponseMinusMPayload](docs/EzsignfolderMinusImportEzsignfoldersignerassociationsMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfolderMinusImportEzsigntemplatepackageMinusV1MinusRequest](docs/EzsignfolderMinusImportEzsigntemplatepackageMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusImportEzsigntemplatepackageMinusV1MinusResponse](docs/EzsignfolderMinusImportEzsigntemplatepackageMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusImportEzsigntemplatepackageMinusV1MinusResponseMinusMPayload](docs/EzsignfolderMinusImportEzsigntemplatepackageMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfolderMinusListElement](docs/EzsignfolderMinusListElement.md)
 - [eZmaxApi.models.EzsignfolderMinusReorderMinusV1MinusRequest](docs/EzsignfolderMinusReorderMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusReorderMinusV1MinusResponse](docs/EzsignfolderMinusReorderMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusRequest](docs/EzsignfolderMinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusRequestCompound](docs/EzsignfolderMinusRequestCompound.md)
 - [eZmaxApi.models.EzsignfolderMinusResponse](docs/EzsignfolderMinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusResponseCompound](docs/EzsignfolderMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignfolderMinusSendMinusV1MinusRequest](docs/EzsignfolderMinusSendMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusSendMinusV1MinusResponse](docs/EzsignfolderMinusSendMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfolderMinusSendMinusV2MinusRequest](docs/EzsignfolderMinusSendMinusV2MinusRequest.md)
 - [eZmaxApi.models.EzsignfolderMinusSendMinusV2MinusResponse](docs/EzsignfolderMinusSendMinusV2MinusResponse.md)
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
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusEditObjectMinusV1MinusRequest](docs/EzsignfoldersignerassociationMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusEditObjectMinusV1MinusResponse](docs/EzsignfoldersignerassociationMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfoldersignerassociationMinusForceDisconnectMinusV1MinusResponse](docs/EzsignfoldersignerassociationMinusForceDisconnectMinusV1MinusResponse.md)
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
 - [eZmaxApi.models.EzsignfoldertypeCreateObjectV1ResponseAllOf](docs/EzsignfoldertypeCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfoldertypeGetAutocompleteV2ResponseAllOf](docs/EzsignfoldertypeGetAutocompleteV2ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfoldertypeGetListV1ResponseAllOf](docs/EzsignfoldertypeGetListV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfoldertypeGetListV1ResponseMPayloadAllOf](docs/EzsignfoldertypeGetListV1ResponseMPayloadAllOf.md)
 - [eZmaxApi.models.EzsignfoldertypeGetObjectV1ResponseAllOf](docs/EzsignfoldertypeGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusAutocompleteElementMinusResponse](docs/EzsignfoldertypeMinusAutocompleteElementMinusResponse.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusCreateObjectMinusV1MinusRequest](docs/EzsignfoldertypeMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusCreateObjectMinusV1MinusResponse](docs/EzsignfoldertypeMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsignfoldertypeMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusEditObjectMinusV1MinusRequest](docs/EzsignfoldertypeMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusEditObjectMinusV1MinusResponse](docs/EzsignfoldertypeMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusGetAutocompleteMinusV2MinusResponse](docs/EzsignfoldertypeMinusGetAutocompleteMinusV2MinusResponse.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusGetAutocompleteMinusV2MinusResponseMinusMPayload](docs/EzsignfoldertypeMinusGetAutocompleteMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusGetListMinusV1MinusResponse](docs/EzsignfoldertypeMinusGetListMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusGetListMinusV1MinusResponseMinusMPayload](docs/EzsignfoldertypeMinusGetListMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusGetObjectMinusV1MinusResponse](docs/EzsignfoldertypeMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsignfoldertypeMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusListElement](docs/EzsignfoldertypeMinusListElement.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusRequest](docs/EzsignfoldertypeMinusRequest.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusRequestCompound](docs/EzsignfoldertypeMinusRequestCompound.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusResponse](docs/EzsignfoldertypeMinusResponse.md)
 - [eZmaxApi.models.EzsignfoldertypeMinusResponseCompound](docs/EzsignfoldertypeMinusResponseCompound.md)
 - [eZmaxApi.models.EzsignfoldertypeRequestCompoundAllOf](docs/EzsignfoldertypeRequestCompoundAllOf.md)
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
 - [eZmaxApi.models.EzsignsignatureMinusSignMinusV1MinusRequest](docs/EzsignsignatureMinusSignMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsignsignatureMinusSignMinusV1MinusResponse](docs/EzsignsignatureMinusSignMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsignsignatureRequestCompoundAllOf](docs/EzsignsignatureRequestCompoundAllOf.md)
 - [eZmaxApi.models.EzsignsignatureResponseCompoundAllOf](docs/EzsignsignatureResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzsignsignatureSignV1ResponseAllOf](docs/EzsignsignatureSignV1ResponseAllOf.md)
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
 - [eZmaxApi.models.EzsigntemplateCreateObjectV1ResponseAllOf](docs/EzsigntemplateCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplateGetAutocompleteV2ResponseAllOf](docs/EzsigntemplateGetAutocompleteV2ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplateGetListV1ResponseAllOf](docs/EzsigntemplateGetListV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplateGetListV1ResponseMPayloadAllOf](docs/EzsigntemplateGetListV1ResponseMPayloadAllOf.md)
 - [eZmaxApi.models.EzsigntemplateGetObjectV1ResponseAllOf](docs/EzsigntemplateGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplateMinusAutocompleteElementMinusResponse](docs/EzsigntemplateMinusAutocompleteElementMinusResponse.md)
 - [eZmaxApi.models.EzsigntemplateMinusCreateObjectMinusV1MinusRequest](docs/EzsigntemplateMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplateMinusCreateObjectMinusV1MinusResponse](docs/EzsigntemplateMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplateMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplateMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplateMinusDeleteObjectMinusV1MinusResponse](docs/EzsigntemplateMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplateMinusEditObjectMinusV1MinusRequest](docs/EzsigntemplateMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplateMinusEditObjectMinusV1MinusResponse](docs/EzsigntemplateMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplateMinusGetAutocompleteMinusV2MinusResponse](docs/EzsigntemplateMinusGetAutocompleteMinusV2MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplateMinusGetAutocompleteMinusV2MinusResponseMinusMPayload](docs/EzsigntemplateMinusGetAutocompleteMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplateMinusGetListMinusV1MinusResponse](docs/EzsigntemplateMinusGetListMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplateMinusGetListMinusV1MinusResponseMinusMPayload](docs/EzsigntemplateMinusGetListMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplateMinusGetObjectMinusV1MinusResponse](docs/EzsigntemplateMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplateMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplateMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplateMinusListElement](docs/EzsigntemplateMinusListElement.md)
 - [eZmaxApi.models.EzsigntemplateMinusRequest](docs/EzsigntemplateMinusRequest.md)
 - [eZmaxApi.models.EzsigntemplateMinusRequestCompound](docs/EzsigntemplateMinusRequestCompound.md)
 - [eZmaxApi.models.EzsigntemplateMinusResponse](docs/EzsigntemplateMinusResponse.md)
 - [eZmaxApi.models.EzsigntemplateMinusResponseCompound](docs/EzsigntemplateMinusResponseCompound.md)
 - [eZmaxApi.models.EzsigntemplateResponseCompoundAllOf](docs/EzsigntemplateResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzsigntemplatedocumentCreateObjectV1ResponseAllOf](docs/EzsigntemplatedocumentCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1ResponseAllOf](docs/EzsigntemplatedocumentEditEzsigntemplateformfieldgroupsV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseAllOf](docs/EzsigntemplatedocumentEditEzsigntemplatesignaturesV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatedocumentEditObjectV1ResponseAllOf](docs/EzsigntemplatedocumentEditObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1ResponseAllOf](docs/EzsigntemplatedocumentGetEzsigntemplatedocumentpagesV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1ResponseAllOf](docs/EzsigntemplatedocumentGetEzsigntemplateformfieldgroupsV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatedocumentGetEzsigntemplatesignaturesV1ResponseAllOf](docs/EzsigntemplatedocumentGetEzsigntemplatesignaturesV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatedocumentGetObjectV1ResponseAllOf](docs/EzsigntemplatedocumentGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatedocumentGetWordsPositionsV1ResponseAllOf](docs/EzsigntemplatedocumentGetWordsPositionsV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusCreateObjectMinusV1MinusRequest](docs/EzsigntemplatedocumentMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusCreateObjectMinusV1MinusResponse](docs/EzsigntemplatedocumentMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatedocumentMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusRequest](docs/EzsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusResponse](docs/EzsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatedocumentMinusEditEzsigntemplateformfieldgroupsMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusRequest](docs/EzsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusResponse](docs/EzsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatedocumentMinusEditEzsigntemplatesignaturesMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusEditObjectMinusV1MinusRequest](docs/EzsigntemplatedocumentMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusEditObjectMinusV1MinusResponse](docs/EzsigntemplatedocumentMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusGetEzsigntemplatedocumentpagesMinusV1MinusResponse](docs/EzsigntemplatedocumentMinusGetEzsigntemplatedocumentpagesMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusGetEzsigntemplatedocumentpagesMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatedocumentMinusGetEzsigntemplatedocumentpagesMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusGetEzsigntemplateformfieldgroupsMinusV1MinusResponse](docs/EzsigntemplatedocumentMinusGetEzsigntemplateformfieldgroupsMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusGetEzsigntemplateformfieldgroupsMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatedocumentMinusGetEzsigntemplateformfieldgroupsMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusGetEzsigntemplatesignaturesMinusV1MinusResponse](docs/EzsigntemplatedocumentMinusGetEzsigntemplatesignaturesMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusGetEzsigntemplatesignaturesMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatedocumentMinusGetEzsigntemplatesignaturesMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusGetObjectMinusV1MinusResponse](docs/EzsigntemplatedocumentMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatedocumentMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusGetWordsPositionsMinusV1MinusRequest](docs/EzsigntemplatedocumentMinusGetWordsPositionsMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusGetWordsPositionsMinusV1MinusResponse](docs/EzsigntemplatedocumentMinusGetWordsPositionsMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusPatchObjectMinusV1MinusRequest](docs/EzsigntemplatedocumentMinusPatchObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusPatchObjectMinusV1MinusResponse](docs/EzsigntemplatedocumentMinusPatchObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusRequest](docs/EzsigntemplatedocumentMinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusRequestCompound](docs/EzsigntemplatedocumentMinusRequestCompound.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusRequestPatch](docs/EzsigntemplatedocumentMinusRequestPatch.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusResponse](docs/EzsigntemplatedocumentMinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatedocumentMinusResponseCompound](docs/EzsigntemplatedocumentMinusResponseCompound.md)
 - [eZmaxApi.models.EzsigntemplatedocumentpageMinusResponse](docs/EzsigntemplatedocumentpageMinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatedocumentpageMinusResponseCompound](docs/EzsigntemplatedocumentpageMinusResponseCompound.md)
 - [eZmaxApi.models.EzsigntemplateformfieldMinusRequest](docs/EzsigntemplateformfieldMinusRequest.md)
 - [eZmaxApi.models.EzsigntemplateformfieldMinusRequestCompound](docs/EzsigntemplateformfieldMinusRequestCompound.md)
 - [eZmaxApi.models.EzsigntemplateformfieldMinusResponse](docs/EzsigntemplateformfieldMinusResponse.md)
 - [eZmaxApi.models.EzsigntemplateformfieldMinusResponseCompound](docs/EzsigntemplateformfieldMinusResponseCompound.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf](docs/EzsigntemplateformfieldgroupCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupGetObjectV1ResponseAllOf](docs/EzsigntemplateformfieldgroupGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupMinusCreateObjectMinusV1MinusRequest](docs/EzsigntemplateformfieldgroupMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupMinusCreateObjectMinusV1MinusResponse](docs/EzsigntemplateformfieldgroupMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplateformfieldgroupMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupMinusDeleteObjectMinusV1MinusResponse](docs/EzsigntemplateformfieldgroupMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupMinusEditObjectMinusV1MinusRequest](docs/EzsigntemplateformfieldgroupMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupMinusEditObjectMinusV1MinusResponse](docs/EzsigntemplateformfieldgroupMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupMinusGetObjectMinusV1MinusResponse](docs/EzsigntemplateformfieldgroupMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplateformfieldgroupMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupMinusRequest](docs/EzsigntemplateformfieldgroupMinusRequest.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupMinusRequestCompound](docs/EzsigntemplateformfieldgroupMinusRequestCompound.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupMinusResponse](docs/EzsigntemplateformfieldgroupMinusResponse.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupMinusResponseCompound](docs/EzsigntemplateformfieldgroupMinusResponseCompound.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupRequestCompoundAllOf](docs/EzsigntemplateformfieldgroupRequestCompoundAllOf.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupResponseCompoundAllOf](docs/EzsigntemplateformfieldgroupResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupsignerMinusRequest](docs/EzsigntemplateformfieldgroupsignerMinusRequest.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupsignerMinusRequestCompound](docs/EzsigntemplateformfieldgroupsignerMinusRequestCompound.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupsignerMinusResponse](docs/EzsigntemplateformfieldgroupsignerMinusResponse.md)
 - [eZmaxApi.models.EzsigntemplateformfieldgroupsignerMinusResponseCompound](docs/EzsigntemplateformfieldgroupsignerMinusResponseCompound.md)
 - [eZmaxApi.models.EzsigntemplatepackageCreateObjectV1ResponseAllOf](docs/EzsigntemplatepackageCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackageEditEzsigntemplatepackagesignersV1ResponseAllOf](docs/EzsigntemplatepackageEditEzsigntemplatepackagesignersV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackageGetAutocompleteV2ResponseAllOf](docs/EzsigntemplatepackageGetAutocompleteV2ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackageGetListV1ResponseAllOf](docs/EzsigntemplatepackageGetListV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackageGetListV1ResponseMPayloadAllOf](docs/EzsigntemplatepackageGetListV1ResponseMPayloadAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackageGetObjectV1ResponseAllOf](docs/EzsigntemplatepackageGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusAutocompleteElementMinusResponse](docs/EzsigntemplatepackageMinusAutocompleteElementMinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusCreateObjectMinusV1MinusRequest](docs/EzsigntemplatepackageMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusCreateObjectMinusV1MinusResponse](docs/EzsigntemplatepackageMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatepackageMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusDeleteObjectMinusV1MinusResponse](docs/EzsigntemplatepackageMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusEditEzsigntemplatepackagesignersMinusV1MinusRequest](docs/EzsigntemplatepackageMinusEditEzsigntemplatepackagesignersMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusEditEzsigntemplatepackagesignersMinusV1MinusResponse](docs/EzsigntemplatepackageMinusEditEzsigntemplatepackagesignersMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusEditEzsigntemplatepackagesignersMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatepackageMinusEditEzsigntemplatepackagesignersMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusEditObjectMinusV1MinusRequest](docs/EzsigntemplatepackageMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusEditObjectMinusV1MinusResponse](docs/EzsigntemplatepackageMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusGetAutocompleteMinusV2MinusResponse](docs/EzsigntemplatepackageMinusGetAutocompleteMinusV2MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusGetAutocompleteMinusV2MinusResponseMinusMPayload](docs/EzsigntemplatepackageMinusGetAutocompleteMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusGetListMinusV1MinusResponse](docs/EzsigntemplatepackageMinusGetListMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusGetListMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatepackageMinusGetListMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusGetObjectMinusV1MinusResponse](docs/EzsigntemplatepackageMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatepackageMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusListElement](docs/EzsigntemplatepackageMinusListElement.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusRequest](docs/EzsigntemplatepackageMinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusRequestCompound](docs/EzsigntemplatepackageMinusRequestCompound.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusResponse](docs/EzsigntemplatepackageMinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackageMinusResponseCompound](docs/EzsigntemplatepackageMinusResponseCompound.md)
 - [eZmaxApi.models.EzsigntemplatepackageResponseCompoundAllOf](docs/EzsigntemplatepackageResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackagemembershipCreateObjectV1ResponseAllOf](docs/EzsigntemplatepackagemembershipCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackagemembershipGetObjectV1ResponseAllOf](docs/EzsigntemplatepackagemembershipGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest](docs/EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusResponse](docs/EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatepackagemembershipMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatepackagemembershipMinusDeleteObjectMinusV1MinusResponse](docs/EzsigntemplatepackagemembershipMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackagemembershipMinusGetObjectMinusV1MinusResponse](docs/EzsigntemplatepackagemembershipMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackagemembershipMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatepackagemembershipMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatepackagemembershipMinusRequest](docs/EzsigntemplatepackagemembershipMinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatepackagemembershipMinusRequestCompound](docs/EzsigntemplatepackagemembershipMinusRequestCompound.md)
 - [eZmaxApi.models.EzsigntemplatepackagemembershipMinusResponse](docs/EzsigntemplatepackagemembershipMinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackagemembershipMinusResponseCompound](docs/EzsigntemplatepackagemembershipMinusResponseCompound.md)
 - [eZmaxApi.models.EzsigntemplatepackagemembershipResponseCompoundAllOf](docs/EzsigntemplatepackagemembershipResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignerCreateObjectV1ResponseAllOf](docs/EzsigntemplatepackagesignerCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignerDeleteObjectV1ResponseAllOf](docs/EzsigntemplatepackagesignerDeleteObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignerGetObjectV1ResponseAllOf](docs/EzsigntemplatepackagesignerGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest](docs/EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusResponse](docs/EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatepackagesignerMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignerMinusDeleteObjectMinusV1MinusResponse](docs/EzsigntemplatepackagesignerMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignerMinusDeleteObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatepackagesignerMinusDeleteObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest](docs/EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusResponse](docs/EzsigntemplatepackagesignerMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignerMinusGetObjectMinusV1MinusResponse](docs/EzsigntemplatepackagesignerMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignerMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatepackagesignerMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignerMinusRequest](docs/EzsigntemplatepackagesignerMinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignerMinusRequestCompound](docs/EzsigntemplatepackagesignerMinusRequestCompound.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignerMinusResponse](docs/EzsigntemplatepackagesignerMinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignerMinusResponseCompound](docs/EzsigntemplatepackagesignerMinusResponseCompound.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignermembershipCreateObjectV1ResponseAllOf](docs/EzsigntemplatepackagesignermembershipCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignermembershipDeleteObjectV1ResponseAllOf](docs/EzsigntemplatepackagesignermembershipDeleteObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignermembershipGetObjectV1ResponseAllOf](docs/EzsigntemplatepackagesignermembershipGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest](docs/EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusResponse](docs/EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatepackagesignermembershipMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignermembershipMinusDeleteObjectMinusV1MinusResponse](docs/EzsigntemplatepackagesignermembershipMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignermembershipMinusDeleteObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatepackagesignermembershipMinusDeleteObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignermembershipMinusGetObjectMinusV1MinusResponse](docs/EzsigntemplatepackagesignermembershipMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignermembershipMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatepackagesignermembershipMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignermembershipMinusRequest](docs/EzsigntemplatepackagesignermembershipMinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignermembershipMinusRequestCompound](docs/EzsigntemplatepackagesignermembershipMinusRequestCompound.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignermembershipMinusResponse](docs/EzsigntemplatepackagesignermembershipMinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatepackagesignermembershipMinusResponseCompound](docs/EzsigntemplatepackagesignermembershipMinusResponseCompound.md)
 - [eZmaxApi.models.EzsigntemplatesignatureCreateObjectV1ResponseAllOf](docs/EzsigntemplatesignatureCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatesignatureGetObjectV1ResponseAllOf](docs/EzsigntemplatesignatureGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatesignatureMinusCreateObjectMinusV1MinusRequest](docs/EzsigntemplatesignatureMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatesignatureMinusCreateObjectMinusV1MinusResponse](docs/EzsigntemplatesignatureMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatesignatureMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatesignatureMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatesignatureMinusDeleteObjectMinusV1MinusResponse](docs/EzsigntemplatesignatureMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatesignatureMinusEditObjectMinusV1MinusRequest](docs/EzsigntemplatesignatureMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatesignatureMinusEditObjectMinusV1MinusResponse](docs/EzsigntemplatesignatureMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatesignatureMinusGetObjectMinusV1MinusResponse](docs/EzsigntemplatesignatureMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatesignatureMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatesignatureMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatesignatureMinusRequest](docs/EzsigntemplatesignatureMinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatesignatureMinusRequestCompound](docs/EzsigntemplatesignatureMinusRequestCompound.md)
 - [eZmaxApi.models.EzsigntemplatesignatureMinusResponse](docs/EzsigntemplatesignatureMinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatesignatureMinusResponseCompound](docs/EzsigntemplatesignatureMinusResponseCompound.md)
 - [eZmaxApi.models.EzsigntemplatesignatureRequestCompoundAllOf](docs/EzsigntemplatesignatureRequestCompoundAllOf.md)
 - [eZmaxApi.models.EzsigntemplatesignatureResponseCompoundAllOf](docs/EzsigntemplatesignatureResponseCompoundAllOf.md)
 - [eZmaxApi.models.EzsigntemplatesignaturecustomdateMinusRequest](docs/EzsigntemplatesignaturecustomdateMinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatesignaturecustomdateMinusRequestCompound](docs/EzsigntemplatesignaturecustomdateMinusRequestCompound.md)
 - [eZmaxApi.models.EzsigntemplatesignaturecustomdateMinusResponse](docs/EzsigntemplatesignaturecustomdateMinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatesignaturecustomdateMinusResponseCompound](docs/EzsigntemplatesignaturecustomdateMinusResponseCompound.md)
 - [eZmaxApi.models.EzsigntemplatesignerCreateObjectV1ResponseAllOf](docs/EzsigntemplatesignerCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatesignerGetObjectV1ResponseAllOf](docs/EzsigntemplatesignerGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntemplatesignerMinusCreateObjectMinusV1MinusRequest](docs/EzsigntemplatesignerMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatesignerMinusCreateObjectMinusV1MinusResponse](docs/EzsigntemplatesignerMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatesignerMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatesignerMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatesignerMinusDeleteObjectMinusV1MinusResponse](docs/EzsigntemplatesignerMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatesignerMinusEditObjectMinusV1MinusRequest](docs/EzsigntemplatesignerMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatesignerMinusEditObjectMinusV1MinusResponse](docs/EzsigntemplatesignerMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatesignerMinusGetObjectMinusV1MinusResponse](docs/EzsigntemplatesignerMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatesignerMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/EzsigntemplatesignerMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.EzsigntemplatesignerMinusRequest](docs/EzsigntemplatesignerMinusRequest.md)
 - [eZmaxApi.models.EzsigntemplatesignerMinusRequestCompound](docs/EzsigntemplatesignerMinusRequestCompound.md)
 - [eZmaxApi.models.EzsigntemplatesignerMinusResponse](docs/EzsigntemplatesignerMinusResponse.md)
 - [eZmaxApi.models.EzsigntemplatesignerMinusResponseCompound](docs/EzsigntemplatesignerMinusResponseCompound.md)
 - [eZmaxApi.models.EzsigntsarequirementGetAutocompleteV2ResponseAllOf](docs/EzsigntsarequirementGetAutocompleteV2ResponseAllOf.md)
 - [eZmaxApi.models.EzsigntsarequirementMinusAutocompleteElementMinusResponse](docs/EzsigntsarequirementMinusAutocompleteElementMinusResponse.md)
 - [eZmaxApi.models.EzsigntsarequirementMinusGetAutocompleteMinusV2MinusResponse](docs/EzsigntsarequirementMinusGetAutocompleteMinusV2MinusResponse.md)
 - [eZmaxApi.models.EzsigntsarequirementMinusGetAutocompleteMinusV2MinusResponseMinusMPayload](docs/EzsigntsarequirementMinusGetAutocompleteMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.FieldMinusEActivesessionUsertype](docs/FieldMinusEActivesessionUsertype.md)
 - [eZmaxApi.models.FieldMinusEActivesessionWeekdaystart](docs/FieldMinusEActivesessionWeekdaystart.md)
 - [eZmaxApi.models.FieldMinusEBrandingLogo](docs/FieldMinusEBrandingLogo.md)
 - [eZmaxApi.models.FieldMinusEEzmaxinvoicingPaymenttype](docs/FieldMinusEEzmaxinvoicingPaymenttype.md)
 - [eZmaxApi.models.FieldMinusEEzmaxinvoicingagentVariationezmax](docs/FieldMinusEEzmaxinvoicingagentVariationezmax.md)
 - [eZmaxApi.models.FieldMinusEEzmaxinvoicingagentVariationezsign](docs/FieldMinusEEzmaxinvoicingagentVariationezsign.md)
 - [eZmaxApi.models.FieldMinusEEzmaxinvoicingcontractPaymenttype](docs/FieldMinusEEzmaxinvoicingcontractPaymenttype.md)
 - [eZmaxApi.models.FieldMinusEEzmaxinvoicinguserVariationezsign](docs/FieldMinusEEzmaxinvoicinguserVariationezsign.md)
 - [eZmaxApi.models.FieldMinusEEzsigndocumentStep](docs/FieldMinusEEzsigndocumentStep.md)
 - [eZmaxApi.models.FieldMinusEEzsigndocumentlogType](docs/FieldMinusEEzsigndocumentlogType.md)
 - [eZmaxApi.models.FieldMinusEEzsignfolderSendreminderfrequency](docs/FieldMinusEEzsignfolderSendreminderfrequency.md)
 - [eZmaxApi.models.FieldMinusEEzsignfolderStep](docs/FieldMinusEEzsignfolderStep.md)
 - [eZmaxApi.models.FieldMinusEEzsignfoldertypeDisposal](docs/FieldMinusEEzsignfoldertypeDisposal.md)
 - [eZmaxApi.models.FieldMinusEEzsignfoldertypePrivacylevel](docs/FieldMinusEEzsignfoldertypePrivacylevel.md)
 - [eZmaxApi.models.FieldMinusEEzsignfoldertypeSendreminderfrequency](docs/FieldMinusEEzsignfoldertypeSendreminderfrequency.md)
 - [eZmaxApi.models.FieldMinusEEzsignformfieldgroupSignerrequirement](docs/FieldMinusEEzsignformfieldgroupSignerrequirement.md)
 - [eZmaxApi.models.FieldMinusEEzsignformfieldgroupTooltipposition](docs/FieldMinusEEzsignformfieldgroupTooltipposition.md)
 - [eZmaxApi.models.FieldMinusEEzsignformfieldgroupType](docs/FieldMinusEEzsignformfieldgroupType.md)
 - [eZmaxApi.models.FieldMinusEEzsignsignatureAttachmentnamesource](docs/FieldMinusEEzsignsignatureAttachmentnamesource.md)
 - [eZmaxApi.models.FieldMinusEEzsignsignatureFont](docs/FieldMinusEEzsignsignatureFont.md)
 - [eZmaxApi.models.FieldMinusEEzsignsignatureTooltipposition](docs/FieldMinusEEzsignsignatureTooltipposition.md)
 - [eZmaxApi.models.FieldMinusEEzsignsignatureType](docs/FieldMinusEEzsignsignatureType.md)
 - [eZmaxApi.models.FieldMinusEEzsigntemplateformfieldgroupSignerrequirement](docs/FieldMinusEEzsigntemplateformfieldgroupSignerrequirement.md)
 - [eZmaxApi.models.FieldMinusEEzsigntemplateformfieldgroupTooltipposition](docs/FieldMinusEEzsigntemplateformfieldgroupTooltipposition.md)
 - [eZmaxApi.models.FieldMinusEEzsigntemplateformfieldgroupType](docs/FieldMinusEEzsigntemplateformfieldgroupType.md)
 - [eZmaxApi.models.FieldMinusEEzsigntemplatesignatureAttachmentnamesource](docs/FieldMinusEEzsigntemplatesignatureAttachmentnamesource.md)
 - [eZmaxApi.models.FieldMinusEEzsigntemplatesignatureFont](docs/FieldMinusEEzsigntemplatesignatureFont.md)
 - [eZmaxApi.models.FieldMinusEEzsigntemplatesignatureTooltipposition](docs/FieldMinusEEzsigntemplatesignatureTooltipposition.md)
 - [eZmaxApi.models.FieldMinusEEzsigntemplatesignatureType](docs/FieldMinusEEzsigntemplatesignatureType.md)
 - [eZmaxApi.models.FieldMinusENotificationpreferenceStatus](docs/FieldMinusENotificationpreferenceStatus.md)
 - [eZmaxApi.models.FieldMinusEPhoneType](docs/FieldMinusEPhoneType.md)
 - [eZmaxApi.models.FieldMinusEUserEzsignsendreminderfrequency](docs/FieldMinusEUserEzsignsendreminderfrequency.md)
 - [eZmaxApi.models.FieldMinusEUserType](docs/FieldMinusEUserType.md)
 - [eZmaxApi.models.FieldMinusEWebhookEzsignevent](docs/FieldMinusEWebhookEzsignevent.md)
 - [eZmaxApi.models.FieldMinusEWebhookManagementevent](docs/FieldMinusEWebhookManagementevent.md)
 - [eZmaxApi.models.FieldMinusEWebhookModule](docs/FieldMinusEWebhookModule.md)
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
 - [eZmaxApi.models.MultilingualMinusApikeyDescription](docs/MultilingualMinusApikeyDescription.md)
 - [eZmaxApi.models.MultilingualMinusBrandingDescription](docs/MultilingualMinusBrandingDescription.md)
 - [eZmaxApi.models.MultilingualMinusEzmaxinvoicingsummaryinternalDescription](docs/MultilingualMinusEzmaxinvoicingsummaryinternalDescription.md)
 - [eZmaxApi.models.MultilingualMinusEzsignfoldertypeName](docs/MultilingualMinusEzsignfoldertypeName.md)
 - [eZmaxApi.models.MultilingualMinusNotificationsubsectionName](docs/MultilingualMinusNotificationsubsectionName.md)
 - [eZmaxApi.models.MultilingualMinusNotificationtestName](docs/MultilingualMinusNotificationtestName.md)
 - [eZmaxApi.models.NotificationsectionGetNotificationtestsV1ResponseAllOf](docs/NotificationsectionGetNotificationtestsV1ResponseAllOf.md)
 - [eZmaxApi.models.NotificationsectionMinusGetNotificationtestsMinusV1MinusResponse](docs/NotificationsectionMinusGetNotificationtestsMinusV1MinusResponse.md)
 - [eZmaxApi.models.NotificationsectionMinusGetNotificationtestsMinusV1MinusResponseMinusMPayload](docs/NotificationsectionMinusGetNotificationtestsMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.NotificationsubsectionMinusResponse](docs/NotificationsubsectionMinusResponse.md)
 - [eZmaxApi.models.NotificationtestGetElementsV1ResponseAllOf](docs/NotificationtestGetElementsV1ResponseAllOf.md)
 - [eZmaxApi.models.NotificationtestMinusGetElementsMinusV1MinusResponse](docs/NotificationtestMinusGetElementsMinusV1MinusResponse.md)
 - [eZmaxApi.models.NotificationtestMinusGetElementsMinusV1MinusResponseMinusMPayload](docs/NotificationtestMinusGetElementsMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.NotificationtestMinusResponse](docs/NotificationtestMinusResponse.md)
 - [eZmaxApi.models.PhoneMinusRequest](docs/PhoneMinusRequest.md)
 - [eZmaxApi.models.PhoneMinusRequestCompound](docs/PhoneMinusRequestCompound.md)
 - [eZmaxApi.models.SecretquestionGetAutocompleteV2ResponseAllOf](docs/SecretquestionGetAutocompleteV2ResponseAllOf.md)
 - [eZmaxApi.models.SecretquestionMinusAutocompleteElementMinusResponse](docs/SecretquestionMinusAutocompleteElementMinusResponse.md)
 - [eZmaxApi.models.SecretquestionMinusGetAutocompleteMinusV2MinusResponse](docs/SecretquestionMinusGetAutocompleteMinusV2MinusResponse.md)
 - [eZmaxApi.models.SecretquestionMinusGetAutocompleteMinusV2MinusResponseMinusMPayload](docs/SecretquestionMinusGetAutocompleteMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.TaxassignmentGetAutocompleteV2ResponseAllOf](docs/TaxassignmentGetAutocompleteV2ResponseAllOf.md)
 - [eZmaxApi.models.TaxassignmentMinusAutocompleteElementMinusResponse](docs/TaxassignmentMinusAutocompleteElementMinusResponse.md)
 - [eZmaxApi.models.TaxassignmentMinusGetAutocompleteMinusV2MinusResponse](docs/TaxassignmentMinusGetAutocompleteMinusV2MinusResponse.md)
 - [eZmaxApi.models.TaxassignmentMinusGetAutocompleteMinusV2MinusResponseMinusMPayload](docs/TaxassignmentMinusGetAutocompleteMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.TimezoneGetAutocompleteV2ResponseAllOf](docs/TimezoneGetAutocompleteV2ResponseAllOf.md)
 - [eZmaxApi.models.TimezoneMinusAutocompleteElementMinusResponse](docs/TimezoneMinusAutocompleteElementMinusResponse.md)
 - [eZmaxApi.models.TimezoneMinusGetAutocompleteMinusV2MinusResponse](docs/TimezoneMinusGetAutocompleteMinusV2MinusResponse.md)
 - [eZmaxApi.models.TimezoneMinusGetAutocompleteMinusV2MinusResponseMinusMPayload](docs/TimezoneMinusGetAutocompleteMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.UserCreateEzsignuserV1ResponseAllOf](docs/UserCreateEzsignuserV1ResponseAllOf.md)
 - [eZmaxApi.models.UserGetAutocompleteV2ResponseAllOf](docs/UserGetAutocompleteV2ResponseAllOf.md)
 - [eZmaxApi.models.UserMinusAutocompleteElementMinusResponse](docs/UserMinusAutocompleteElementMinusResponse.md)
 - [eZmaxApi.models.UserMinusCreateEzsignuserMinusV1MinusRequest](docs/UserMinusCreateEzsignuserMinusV1MinusRequest.md)
 - [eZmaxApi.models.UserMinusCreateEzsignuserMinusV1MinusResponse](docs/UserMinusCreateEzsignuserMinusV1MinusResponse.md)
 - [eZmaxApi.models.UserMinusCreateEzsignuserMinusV1MinusResponseMinusMPayload](docs/UserMinusCreateEzsignuserMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.UserMinusGetAutocompleteMinusV2MinusResponse](docs/UserMinusGetAutocompleteMinusV2MinusResponse.md)
 - [eZmaxApi.models.UserMinusGetAutocompleteMinusV2MinusResponseMinusMPayload](docs/UserMinusGetAutocompleteMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.UserMinusResponse](docs/UserMinusResponse.md)
 - [eZmaxApi.models.UserMinusResponseCompound](docs/UserMinusResponseCompound.md)
 - [eZmaxApi.models.UsergroupGetAutocompleteV2ResponseAllOf](docs/UsergroupGetAutocompleteV2ResponseAllOf.md)
 - [eZmaxApi.models.UsergroupMinusAutocompleteElementMinusResponse](docs/UsergroupMinusAutocompleteElementMinusResponse.md)
 - [eZmaxApi.models.UsergroupMinusGetAutocompleteMinusV2MinusResponse](docs/UsergroupMinusGetAutocompleteMinusV2MinusResponse.md)
 - [eZmaxApi.models.UsergroupMinusGetAutocompleteMinusV2MinusResponseMinusMPayload](docs/UsergroupMinusGetAutocompleteMinusV2MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.WebhookCreateObjectV1ResponseAllOf](docs/WebhookCreateObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.WebhookEzsignDocumentCompletedAllOf](docs/WebhookEzsignDocumentCompletedAllOf.md)
 - [eZmaxApi.models.WebhookEzsignFolderCompletedAllOf](docs/WebhookEzsignFolderCompletedAllOf.md)
 - [eZmaxApi.models.WebhookGetHistoryV1ResponseAllOf](docs/WebhookGetHistoryV1ResponseAllOf.md)
 - [eZmaxApi.models.WebhookGetHistoryV1ResponseMPayloadAllOf](docs/WebhookGetHistoryV1ResponseMPayloadAllOf.md)
 - [eZmaxApi.models.WebhookGetListV1ResponseAllOf](docs/WebhookGetListV1ResponseAllOf.md)
 - [eZmaxApi.models.WebhookGetListV1ResponseMPayloadAllOf](docs/WebhookGetListV1ResponseMPayloadAllOf.md)
 - [eZmaxApi.models.WebhookGetObjectV1ResponseAllOf](docs/WebhookGetObjectV1ResponseAllOf.md)
 - [eZmaxApi.models.WebhookMinusCreateObjectMinusV1MinusRequest](docs/WebhookMinusCreateObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.WebhookMinusCreateObjectMinusV1MinusResponse](docs/WebhookMinusCreateObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.WebhookMinusCreateObjectMinusV1MinusResponseMinusMPayload](docs/WebhookMinusCreateObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.WebhookMinusDeleteObjectMinusV1MinusResponse](docs/WebhookMinusDeleteObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.WebhookMinusEditObjectMinusV1MinusRequest](docs/WebhookMinusEditObjectMinusV1MinusRequest.md)
 - [eZmaxApi.models.WebhookMinusEditObjectMinusV1MinusResponse](docs/WebhookMinusEditObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.WebhookMinusEzsignMinusDocumentCompleted](docs/WebhookMinusEzsignMinusDocumentCompleted.md)
 - [eZmaxApi.models.WebhookMinusEzsignMinusFolderCompleted](docs/WebhookMinusEzsignMinusFolderCompleted.md)
 - [eZmaxApi.models.WebhookMinusGetHistoryMinusV1MinusResponse](docs/WebhookMinusGetHistoryMinusV1MinusResponse.md)
 - [eZmaxApi.models.WebhookMinusGetHistoryMinusV1MinusResponseMinusMPayload](docs/WebhookMinusGetHistoryMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.WebhookMinusGetListMinusV1MinusResponse](docs/WebhookMinusGetListMinusV1MinusResponse.md)
 - [eZmaxApi.models.WebhookMinusGetListMinusV1MinusResponseMinusMPayload](docs/WebhookMinusGetListMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.WebhookMinusGetObjectMinusV1MinusResponse](docs/WebhookMinusGetObjectMinusV1MinusResponse.md)
 - [eZmaxApi.models.WebhookMinusGetObjectMinusV1MinusResponseMinusMPayload](docs/WebhookMinusGetObjectMinusV1MinusResponseMinusMPayload.md)
 - [eZmaxApi.models.WebhookMinusListElement](docs/WebhookMinusListElement.md)
 - [eZmaxApi.models.WebhookMinusRequest](docs/WebhookMinusRequest.md)
 - [eZmaxApi.models.WebhookMinusRequestCompound](docs/WebhookMinusRequestCompound.md)
 - [eZmaxApi.models.WebhookMinusResponse](docs/WebhookMinusResponse.md)
 - [eZmaxApi.models.WebhookMinusResponseCompound](docs/WebhookMinusResponseCompound.md)
 - [eZmaxApi.models.WebhookMinusTestMinusV1MinusResponse](docs/WebhookMinusTestMinusV1MinusResponse.md)
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

