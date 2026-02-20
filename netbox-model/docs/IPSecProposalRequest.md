

# IPSecProposalRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**encryptionAlgorithm** | [**EncryptionAlgorithmEnum**](#EncryptionAlgorithmEnum) | * &#x60;aes-128-cbc&#x60; - 128-bit AES (CBC) * &#x60;aes-128-gcm&#x60; - 128-bit AES (GCM) * &#x60;aes-192-cbc&#x60; - 192-bit AES (CBC) * &#x60;aes-192-gcm&#x60; - 192-bit AES (GCM) * &#x60;aes-256-cbc&#x60; - 256-bit AES (CBC) * &#x60;aes-256-gcm&#x60; - 256-bit AES (GCM) * &#x60;3des-cbc&#x60; - 3DES * &#x60;des-cbc&#x60; - DES |  [optional] |
|**authenticationAlgorithm** | [**AuthenticationAlgorithmEnum**](#AuthenticationAlgorithmEnum) | * &#x60;hmac-sha1&#x60; - SHA-1 HMAC * &#x60;hmac-sha256&#x60; - SHA-256 HMAC * &#x60;hmac-sha384&#x60; - SHA-384 HMAC * &#x60;hmac-sha512&#x60; - SHA-512 HMAC * &#x60;hmac-md5&#x60; - MD5 HMAC |  [optional] |
|**saLifetimeSeconds** | **Integer** | Security association lifetime (seconds) |  [optional] |
|**saLifetimeData** | **Integer** | Security association lifetime (in kilobytes) |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: EncryptionAlgorithmEnum

| Name | Value |
|---- | -----|
| AES_128_CBC | &quot;aes-128-cbc&quot; |
| AES_128_GCM | &quot;aes-128-gcm&quot; |
| AES_192_CBC | &quot;aes-192-cbc&quot; |
| AES_192_GCM | &quot;aes-192-gcm&quot; |
| AES_256_CBC | &quot;aes-256-cbc&quot; |
| AES_256_GCM | &quot;aes-256-gcm&quot; |
| _3DES_CBC | &quot;3des-cbc&quot; |
| DES_CBC | &quot;des-cbc&quot; |



## Enum: AuthenticationAlgorithmEnum

| Name | Value |
|---- | -----|
| HMAC_SHA1 | &quot;hmac-sha1&quot; |
| HMAC_SHA256 | &quot;hmac-sha256&quot; |
| HMAC_SHA384 | &quot;hmac-sha384&quot; |
| HMAC_SHA512 | &quot;hmac-sha512&quot; |
| HMAC_MD5 | &quot;hmac-md5&quot; |


## Implemented Interfaces

* Serializable


