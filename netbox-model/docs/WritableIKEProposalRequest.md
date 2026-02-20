

# WritableIKEProposalRequest

Base serializer class for models inheriting from PrimaryModel.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**name** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**authenticationMethod** | [**AuthenticationMethodEnum**](#AuthenticationMethodEnum) | * &#x60;preshared-keys&#x60; - Pre-shared keys * &#x60;certificates&#x60; - Certificates * &#x60;rsa-signatures&#x60; - RSA signatures * &#x60;dsa-signatures&#x60; - DSA signatures |  |
|**encryptionAlgorithm** | [**EncryptionAlgorithmEnum**](#EncryptionAlgorithmEnum) | * &#x60;aes-128-cbc&#x60; - 128-bit AES (CBC) * &#x60;aes-128-gcm&#x60; - 128-bit AES (GCM) * &#x60;aes-192-cbc&#x60; - 192-bit AES (CBC) * &#x60;aes-192-gcm&#x60; - 192-bit AES (GCM) * &#x60;aes-256-cbc&#x60; - 256-bit AES (CBC) * &#x60;aes-256-gcm&#x60; - 256-bit AES (GCM) * &#x60;3des-cbc&#x60; - 3DES * &#x60;des-cbc&#x60; - DES |  |
|**authenticationAlgorithm** | [**AuthenticationAlgorithmEnum**](#AuthenticationAlgorithmEnum) | * &#x60;hmac-sha1&#x60; - SHA-1 HMAC * &#x60;hmac-sha256&#x60; - SHA-256 HMAC * &#x60;hmac-sha384&#x60; - SHA-384 HMAC * &#x60;hmac-sha512&#x60; - SHA-512 HMAC * &#x60;hmac-md5&#x60; - MD5 HMAC |  [optional] |
|**group** | [**GroupEnum**](#GroupEnum) | Diffie-Hellman group ID  * &#x60;1&#x60; - Group 1 * &#x60;2&#x60; - Group 2 * &#x60;5&#x60; - Group 5 * &#x60;14&#x60; - Group 14 * &#x60;15&#x60; - Group 15 * &#x60;16&#x60; - Group 16 * &#x60;17&#x60; - Group 17 * &#x60;18&#x60; - Group 18 * &#x60;19&#x60; - Group 19 * &#x60;20&#x60; - Group 20 * &#x60;21&#x60; - Group 21 * &#x60;22&#x60; - Group 22 * &#x60;23&#x60; - Group 23 * &#x60;24&#x60; - Group 24 * &#x60;25&#x60; - Group 25 * &#x60;26&#x60; - Group 26 * &#x60;27&#x60; - Group 27 * &#x60;28&#x60; - Group 28 * &#x60;29&#x60; - Group 29 * &#x60;30&#x60; - Group 30 * &#x60;31&#x60; - Group 31 * &#x60;32&#x60; - Group 32 * &#x60;33&#x60; - Group 33 * &#x60;34&#x60; - Group 34 |  |
|**saLifetime** | **Integer** | Security association lifetime (in seconds) |  [optional] |
|**owner** | [**ASNRangeRequestOwner**](ASNRangeRequestOwner.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**tags** | [**List&lt;NestedTagRequest&gt;**](NestedTagRequest.md) |  |  [optional] |
|**customFields** | **Map&lt;String, Object&gt;** |  |  [optional] |



## Enum: AuthenticationMethodEnum

| Name | Value |
|---- | -----|
| PRESHARED_KEYS | &quot;preshared-keys&quot; |
| CERTIFICATES | &quot;certificates&quot; |
| RSA_SIGNATURES | &quot;rsa-signatures&quot; |
| DSA_SIGNATURES | &quot;dsa-signatures&quot; |



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
| EMPTY | &quot;&quot; |



## Enum: GroupEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_5 | 5 |
| NUMBER_14 | 14 |
| NUMBER_15 | 15 |
| NUMBER_16 | 16 |
| NUMBER_17 | 17 |
| NUMBER_18 | 18 |
| NUMBER_19 | 19 |
| NUMBER_20 | 20 |
| NUMBER_21 | 21 |
| NUMBER_22 | 22 |
| NUMBER_23 | 23 |
| NUMBER_24 | 24 |
| NUMBER_25 | 25 |
| NUMBER_26 | 26 |
| NUMBER_27 | 27 |
| NUMBER_28 | 28 |
| NUMBER_29 | 29 |
| NUMBER_30 | 30 |
| NUMBER_31 | 31 |
| NUMBER_32 | 32 |
| NUMBER_33 | 33 |
| NUMBER_34 | 34 |


## Implemented Interfaces

* Serializable


