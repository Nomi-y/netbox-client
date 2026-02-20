

# IPSecProposal

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
|**encryptionAlgorithm** | [**IKEProposalEncryptionAlgorithm**](IKEProposalEncryptionAlgorithm.md) |  |  [optional] |
|**authenticationAlgorithm** | [**IKEProposalAuthenticationAlgorithm**](IKEProposalAuthenticationAlgorithm.md) |  |  [optional] |
|**saLifetimeSeconds** | **Integer** | Security association lifetime (seconds) |  [optional] |
|**saLifetimeData** | **Integer** | Security association lifetime (in kilobytes) |  [optional] |
|**owner** | [**BriefOwner**](BriefOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTag&gt;**](NestedTag.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  [readonly] |
|**lastUpdated** | **OffsetDateTime** |  |  [readonly] |


## Implemented Interfaces

* Serializable


