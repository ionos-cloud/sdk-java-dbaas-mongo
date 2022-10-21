

# ClusterList

List of clusters.
## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **type** | [**ResourceType**](ResourceType.md) |  |  [optional] |
| **id** | **String** | The unique ID of the resource. |  [optional] |
| **items** | [**List&lt;ClusterResponse&gt;**](ClusterResponse.md) |  |  [optional] |
| **offset** | **Integer** | The offset specified in the request (if none was specified, the default offset is 0) (not implemented yet).  |  [optional] [readonly] |
| **limit** | **Integer** | The limit specified in the request (if none was specified, use the endpoint&#39;s default pagination limit) (not implemented yet, always return number of items).  |  [optional] [readonly] |
| **links** | [**PaginationLinks**](PaginationLinks.md) |  |  [optional] |


