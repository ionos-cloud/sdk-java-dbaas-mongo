

# ClusterProperties

Properties of a database cluster.
## Properties

| Name | Type | Description | Notes |
| ------------ | ------------- | ------------- | ------------- |
| **displayName** | **String** | The name of your cluster. |  [optional] |
| **mongoDBVersion** | **String** | The MongoDB version of your cluster. |  [optional] |
| **location** | **String** | The physical location where the cluster will be created. This is the location where all your instances will be located. This property is immutable.  |  [optional] |
| **instances** | **Integer** | The total number of instances in the cluster (one primary and n-1 secondaries).  |  [optional] |
| **connections** | [**List&lt;Connection&gt;**](Connection.md) |  |  [optional] |
| **maintenanceWindow** | [**MaintenanceWindow**](MaintenanceWindow.md) |  |  [optional] |
| **templateID** | **String** | The unique ID of the template, which specifies the number of cores, storage size, and memory.  |  [optional] |
| **connectionString** | **String** | The connection string for your cluster. |  [optional] |


