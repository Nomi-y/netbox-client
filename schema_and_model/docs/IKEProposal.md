

# IKEProposal

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [readonly] |
|**url** | **URI** |  |  [readonly] |
|**displayUrl** | **URI** |  |  [readonly] |
|**display** | **String** |  |  [readonly] |
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**authenticationMethod** | [**IKEProposalAuthenticationMethod**](IKEProposalAuthenticationMethod.md) |  |  |
|**encryptionAlgorithm** | [**IKEProposalEncryptionAlgorithm**](IKEProposalEncryptionAlgorithm.md) |  |  |
|**authenticationAlgorithm** | [**IKEProposalAuthenticationAlgorithm**](IKEProposalAuthenticationAlgorithm.md) |  |  [optional] |
|**group** | [**IKEProposalGroup**](IKEProposalGroup.md) |  |  |
|**saLifetime** | **Integer** | Security association lifetime (in seconds) |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


