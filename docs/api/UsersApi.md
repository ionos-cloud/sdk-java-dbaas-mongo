# UsersApi

All URIs are relative to *https://api.ionos.com/databases/mongodb*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**clustersUsersDelete**](UsersApi.md#clustersusersdelete) | **DELETE** /clusters/{clusterId}/users/{username} | Delete a MongoDB User by ID |
| [**clustersUsersFindById**](UsersApi.md#clustersusersfindbyid) | **GET** /clusters/{clusterId}/users/{username} | Get a MongoDB User by ID |
| [**clustersUsersGet**](UsersApi.md#clustersusersget) | **GET** /clusters/{clusterId}/users | Get all Cluster Users |
| [**clustersUsersPatch**](UsersApi.md#clustersuserspatch) | **PATCH** /clusters/{clusterId}/users/{username} | Patch a MongoDB User by ID |
| [**clustersUsersPost**](UsersApi.md#clustersuserspost) | **POST** /clusters/{clusterId}/users | Create MongoDB User |


<a name="clustersUsersDelete"></a>
# **clustersUsersDelete**
> User clustersUsersDelete(clusterId, username)

Delete a MongoDB User by ID

Deletes a MongoDB user specified by its ID.

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmongo.ApiClient;
import com.ionoscloud.dbaasmongo.ApiException;
import com.ionoscloud.dbaasmongo.Configuration;
import com.ionoscloud.dbaasmongo.auth.*;
import com.ionoscloud.dbaasmongo.model.*;
import com.ionoscloud.dbaasmongo.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String clusterId = "clusterId_example"; // String | The unique ID of the cluster.
    String username = "username_example"; // String | The authentication username.
    try {
      User result = apiInstance.clustersUsersDelete(clusterId, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#clustersUsersDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clusterId** | **String**| The unique ID of the cluster. |
| **username** | **String**| The authentication username. |

### Return type

[**User**](../models/User.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="clustersUsersFindById"></a>
# **clustersUsersFindById**
> User clustersUsersFindById(clusterId, username)

Get a MongoDB User by ID

Retrieves the MongoDB user identified by the username.

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmongo.ApiClient;
import com.ionoscloud.dbaasmongo.ApiException;
import com.ionoscloud.dbaasmongo.Configuration;
import com.ionoscloud.dbaasmongo.auth.*;
import com.ionoscloud.dbaasmongo.model.*;
import com.ionoscloud.dbaasmongo.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String clusterId = "clusterId_example"; // String | The unique ID of the cluster.
    String username = "username_example"; // String | The authentication username.
    try {
      User result = apiInstance.clustersUsersFindById(clusterId, username);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#clustersUsersFindById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clusterId** | **String**| The unique ID of the cluster. |
| **username** | **String**| The authentication username. |

### Return type

[**User**](../models/User.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="clustersUsersGet"></a>
# **clustersUsersGet**
> UsersList clustersUsersGet(clusterId, limit, offset)

Get all Cluster Users

Retrieves a list of MongoDB users.

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmongo.ApiClient;
import com.ionoscloud.dbaasmongo.ApiException;
import com.ionoscloud.dbaasmongo.Configuration;
import com.ionoscloud.dbaasmongo.auth.*;
import com.ionoscloud.dbaasmongo.model.*;
import com.ionoscloud.dbaasmongo.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String clusterId = "clusterId_example"; // String | The unique ID of the cluster.
    Integer limit = 100; // Integer | The maximum number of elements to return. Use together with 'offset' for pagination.
    Integer offset = 0; // Integer | The first element to return. Use together with 'limit' for pagination.
    try {
      UsersList result = apiInstance.clustersUsersGet(clusterId, limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#clustersUsersGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clusterId** | **String**| The unique ID of the cluster. |
| **limit** | **Integer**| The maximum number of elements to return. Use together with &#39;offset&#39; for pagination. | [optional] [default to 100]
| **offset** | **Integer**| The first element to return. Use together with &#39;limit&#39; for pagination. | [optional] [default to 0]

### Return type

[**UsersList**](../models/UsersList.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="clustersUsersPatch"></a>
# **clustersUsersPatch**
> User clustersUsersPatch(clusterId, username, patchUserRequest)

Patch a MongoDB User by ID

Patches a MongoDB user specified by its ID.

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmongo.ApiClient;
import com.ionoscloud.dbaasmongo.ApiException;
import com.ionoscloud.dbaasmongo.Configuration;
import com.ionoscloud.dbaasmongo.auth.*;
import com.ionoscloud.dbaasmongo.model.*;
import com.ionoscloud.dbaasmongo.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String clusterId = "clusterId_example"; // String | The unique ID of the cluster.
    String username = "username_example"; // String | The authentication username.
    PatchUserRequest patchUserRequest = new PatchUserRequest(); // PatchUserRequest | Part of the MongoDB user which should be modified.
    try {
      User result = apiInstance.clustersUsersPatch(clusterId, username, patchUserRequest);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#clustersUsersPatch");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clusterId** | **String**| The unique ID of the cluster. |
| **username** | **String**| The authentication username. |
| **patchUserRequest** |  [**PatchUserRequest**](../models/PatchUserRequest.md)| Part of the MongoDB user which should be modified. |

### Return type

[**User**](../models/User.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clustersUsersPost"></a>
# **clustersUsersPost**
> User clustersUsersPost(clusterId, user)

Create MongoDB User

Creates a MongoDB user. 

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmongo.ApiClient;
import com.ionoscloud.dbaasmongo.ApiException;
import com.ionoscloud.dbaasmongo.Configuration;
import com.ionoscloud.dbaasmongo.auth.*;
import com.ionoscloud.dbaasmongo.model.*;
import com.ionoscloud.dbaasmongo.api.UsersApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    UsersApi apiInstance = new UsersApi(defaultClient);
    String clusterId = "clusterId_example"; // String | The unique ID of the cluster.
    User user = new User(); // User | The user to be created.
    try {
      User result = apiInstance.clustersUsersPost(clusterId, user);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling UsersApi#clustersUsersPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```
⚠️ **Note**: for the example above, you need to provide all parameters to the method call. Null values will resolve to the API defaults.

### Parameters

| Name | Type | Description  | Notes |
| ------------- | ------------- | ------------- | ------------- |
| **clusterId** | **String**| The unique ID of the cluster. |
| **user** |  [**User**](../models/User.md)| The user to be created. |

### Return type

[**User**](../models/User.md)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

