
# CustomMinusEzsignfoldersignerassociationActionableElementMinusResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**pkiEzsignfoldersignerassociationID** | **kotlin.Int** | The unique ID of the Ezsignfoldersignerassociation | 
**fkiEzsignfolderID** | **kotlin.Int** | The unique ID of the Ezsignfolder | 
**bEzsignfoldersignerassociationDelayedsend** | **kotlin.Boolean** | If this flag is true the signatory is part of a delayed send. | 
**bEzsignfoldersignerassociationReceivecopy** | **kotlin.Boolean** | If this flag is true. The signatory will receive a copy of every signed Ezsigndocument even if it ain&#39;t required to sign the document. | 
**tEzsignfoldersignerassociationMessage** | **kotlin.String** | A custom text message that will be added to the email sent. | 
**bEzsignfoldersignerassociationHasactionableelementsCurrent** | **kotlin.Boolean** | Indicates if the Ezsignfoldersignerassociation has actionable elements in the current step | 
**objEzsignsignergroup** | [**EzsignsignergroupMinusResponseCompound**](EzsignsignergroupMinusResponseCompound.md) |  |  [optional]
**objUser** | [**EzsignfoldersignerassociationMinusResponseCompoundMinusUser**](EzsignfoldersignerassociationMinusResponseCompoundMinusUser.md) |  |  [optional]
**objEzsignsigner** | [**EzsignsignerMinusResponseCompound**](EzsignsignerMinusResponseCompound.md) |  |  [optional]
**bEzsignfoldersignerassociationHasactionableelementsFuture** | **kotlin.Boolean** | Indicates if the Ezsignfoldersignerassociation has actionable elements in a future step |  [optional]



