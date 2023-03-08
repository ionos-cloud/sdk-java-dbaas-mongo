# TemplatesApi

All URIs are relative to *https://api.ionos.com/databases/mongodb*

| Method | HTTP request | Description |
| ------------- | ------------- | ------------- |
| [**templatesGet**](TemplatesApi.md#templatesget) | **GET** /templates | Get Templates |


<a name="templatesGet"></a>
# **templatesGet**
> TemplateList templatesGet(limit, offset)

Get Templates

Retrieves a list of valid templates. These templates can be used to create MongoDB clusters; they contain properties, such as number of cores, RAM, and the storage size. 

### Example
```java
// Import classes:
import com.ionoscloud.dbaasmongo.ApiClient;
import com.ionoscloud.dbaasmongo.ApiException;
import com.ionoscloud.dbaasmongo.Configuration;
import com.ionoscloud.dbaasmongo.auth.*;
import com.ionoscloud.dbaasmongo.model.*;
import com.ionoscloud.dbaasmongo.api.TemplatesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuthentication = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuthentication.setUsername("YOUR USERNAME");
    basicAuthentication.setPassword("YOUR PASSWORD");


    TemplatesApi apiInstance = new TemplatesApi(defaultClient);
    Integer limit = 100; // Integer | The maximum number of elements to return. Use together with 'offset' for pagination.
    Integer offset = 0; // Integer | The first element to return. Use together with 'limit' for pagination.
    try {
      TemplateList result = apiInstance.templatesGet(limit, offset);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TemplatesApi#templatesGet");
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
| **limit** | **Integer**| The maximum number of elements to return. Use together with &#39;offset&#39; for pagination. | [optional] [default to 100]
| **offset** | **Integer**| The first element to return. Use together with &#39;limit&#39; for pagination. | [optional] [default to 0]

### Return type

[**TemplateList**](../models/TemplateList.md)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

