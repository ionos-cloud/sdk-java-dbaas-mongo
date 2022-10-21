

# CreateClusterProperties

The properties with all data needed to create a new MongoDB cluster. 
## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **templateID** | **String** | The unique ID of the template, which specifies the number of cores, storage size, and memory.  |  |
| **mongoDBVersion** | **String** | The MongoDB version of your cluster. |  [optional] |
| **instances** | **Integer** | The total number of instances in the cluster (one primary and n-1 secondaries).  |  |
| **connections** | [**List&lt;Connection&gt;**](Connection.md) |  |  |
| **location** | **String** | The physical location where the cluster will be created. This is the location where all your instances will be located. This property is immutable.  |  |
| **displayName** | **String** | The name of your cluster. |  |
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md) |  |  [optional] |


