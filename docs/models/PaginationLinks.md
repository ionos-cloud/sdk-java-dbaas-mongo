

# PaginationLinks

The URLs to navigate the different pages. 
## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **prev** | [**URI**](URI.md) | The URL (with offset and limit parameters) of the previous page; only present if the offset is greater than 0.  |  [optional] [readonly] |
| **self** | [**URI**](URI.md) | The URL (with offset and limit parameters) of the current page.  |  [optional] [readonly] |
| **next** | [**URI**](URI.md) | The URL (with offset and limit parameters) of the next page; only present if the offset and limit is less than the total number of elements.  |  [optional] [readonly] |


