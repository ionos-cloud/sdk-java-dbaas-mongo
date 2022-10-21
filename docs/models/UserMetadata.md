

# UserMetadata

The metadata of the resource.
## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **createdDate** | [**OffsetDateTime**](OffsetDateTime.md) | The date the resource was created. |  [optional] |
| **createdBy** | **String** | The user who created the resource. |  [optional] |
| **createdByUserId** | **String** | The ID of the user who created the resource. |  [optional] |
| **state** | [**StateEnum**](#StateEnum) | The user state. |  [optional] |



## Enum: StateEnum

| Name | Value |
| ---- | -----
| AVAILABLE | &quot;AVAILABLE&quot; |
| CREATING | &quot;CREATING&quot; |
| DESTROYING | &quot;DESTROYING&quot; |


