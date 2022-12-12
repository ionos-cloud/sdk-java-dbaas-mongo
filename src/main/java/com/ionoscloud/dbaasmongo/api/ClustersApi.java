/*
 * IONOS DBaaS MongoDB REST API
 * With IONOS Cloud Database as a Service, you have the ability to quickly set up and manage a MongoDB database. You can also delete clusters, manage backups and users via the API.   MongoDB is an open source, cross-platform, document-oriented database program. Classified as a NoSQL database program, it uses JSON-like documents with optional schemas.  The MongoDB API allows you to create additional database clusters or modify existing ones. Both tools, the Data Center Designer (DCD) and the API use the same concepts consistently and are well suited for smooth and intuitive use. 
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.ionoscloud.dbaasmongo.api;

import com.ionoscloud.dbaasmongo.ApiCallback;
import com.ionoscloud.dbaasmongo.ApiClient;
import com.ionoscloud.dbaasmongo.ApiException;
import com.ionoscloud.dbaasmongo.ApiResponse;
import com.ionoscloud.dbaasmongo.Configuration;
import com.ionoscloud.dbaasmongo.Pair;
import com.ionoscloud.dbaasmongo.ProgressRequestBody;
import com.ionoscloud.dbaasmongo.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.ionoscloud.dbaasmongo.model.ClusterList;
import com.ionoscloud.dbaasmongo.model.ClusterResponse;
import com.ionoscloud.dbaasmongo.model.CreateClusterRequest;
import com.ionoscloud.dbaasmongo.model.ErrorResponse;
import com.ionoscloud.dbaasmongo.model.PatchClusterRequest;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ClustersApi {
    private ApiClient localVarApiClient;

    public ClustersApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ClustersApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for clustersDelete
     * @param clusterId The unique ID of the cluster. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The cluster to be deleted is automatically set to &#x60;state &#x3D; DESTROYING&#x60;.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call clustersDeleteCall(String clusterId, final ApiCallback<ClusterResponse> _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/clusters/{clusterId}"
            .replaceAll("\\{" + "clusterId" + "\\}", localVarApiClient.escapeString(clusterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call clustersDeleteValidateBeforeCall(String clusterId, final ApiCallback<ClusterResponse> _callback) throws ApiException {
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling clustersDelete(Async)");
        }
        

        okhttp3.Call localVarCall = clustersDeleteCall(clusterId, _callback);
        return localVarCall;

    }

    /**
     * Delete a Cluster
     * Deletes a MongoDB cluster.
     * @param clusterId The unique ID of the cluster. (required)
     * @return ClusterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The cluster to be deleted is automatically set to &#x60;state &#x3D; DESTROYING&#x60;.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public ClusterResponse clustersDelete(String clusterId) throws ApiException {
        ApiResponse<ClusterResponse> localVarResp = clustersDeleteWithHttpInfo(clusterId);
        return localVarResp.getData();
    }

    /**
     * Delete a Cluster
     * Deletes a MongoDB cluster.
     * @param clusterId The unique ID of the cluster. (required)
     * @return ApiResponse&lt;ClusterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The cluster to be deleted is automatically set to &#x60;state &#x3D; DESTROYING&#x60;.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public ApiResponse<ClusterResponse> clustersDeleteWithHttpInfo(String clusterId) throws ApiException {
        okhttp3.Call localVarCall = clustersDeleteValidateBeforeCall(clusterId, null);
        Type localVarReturnType = new TypeToken<ClusterResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Delete a Cluster (asynchronously)
     * Deletes a MongoDB cluster.
     * @param clusterId The unique ID of the cluster. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The cluster to be deleted is automatically set to &#x60;state &#x3D; DESTROYING&#x60;.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call clustersDeleteAsync(String clusterId, final ApiCallback<ClusterResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = clustersDeleteValidateBeforeCall(clusterId, _callback);
        Type localVarReturnType = new TypeToken<ClusterResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for clustersFindById
     * @param clusterId The unique ID of the cluster. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call clustersFindByIdCall(String clusterId, final ApiCallback<ClusterResponse> _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/clusters/{clusterId}"
            .replaceAll("\\{" + "clusterId" + "\\}", localVarApiClient.escapeString(clusterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call clustersFindByIdValidateBeforeCall(String clusterId, final ApiCallback<ClusterResponse> _callback) throws ApiException {
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling clustersFindById(Async)");
        }
        

        okhttp3.Call localVarCall = clustersFindByIdCall(clusterId, _callback);
        return localVarCall;

    }

    /**
     * Get a cluster by id
     * Get a cluster by id.
     * @param clusterId The unique ID of the cluster. (required)
     * @return ClusterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public ClusterResponse clustersFindById(String clusterId) throws ApiException {
        ApiResponse<ClusterResponse> localVarResp = clustersFindByIdWithHttpInfo(clusterId);
        return localVarResp.getData();
    }

    /**
     * Get a cluster by id
     * Get a cluster by id.
     * @param clusterId The unique ID of the cluster. (required)
     * @return ApiResponse&lt;ClusterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public ApiResponse<ClusterResponse> clustersFindByIdWithHttpInfo(String clusterId) throws ApiException {
        okhttp3.Call localVarCall = clustersFindByIdValidateBeforeCall(clusterId, null);
        Type localVarReturnType = new TypeToken<ClusterResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get a cluster by id (asynchronously)
     * Get a cluster by id.
     * @param clusterId The unique ID of the cluster. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call clustersFindByIdAsync(String clusterId, final ApiCallback<ClusterResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = clustersFindByIdValidateBeforeCall(clusterId, _callback);
        Type localVarReturnType = new TypeToken<ClusterResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for clustersGet
     * @param filterName Response filter to list only the MongoDB clusters that contain the specified name. The value is case insensitive and matched on the &#39;displayName&#39; field.  (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call clustersGetCall(String filterName, final ApiCallback<ClusterList> _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/clusters";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (filterName != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("filter.name", filterName));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call clustersGetValidateBeforeCall(String filterName, final ApiCallback<ClusterList> _callback) throws ApiException {
        

        okhttp3.Call localVarCall = clustersGetCall(filterName, _callback);
        return localVarCall;

    }

    /**
     * Get Clusters
     * Retrieves a list of MongoDB clusters.
     * @param filterName Response filter to list only the MongoDB clusters that contain the specified name. The value is case insensitive and matched on the &#39;displayName&#39; field.  (optional)
     * @return ClusterList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public ClusterList clustersGet(String filterName) throws ApiException {
        ApiResponse<ClusterList> localVarResp = clustersGetWithHttpInfo(filterName);
        return localVarResp.getData();
    }

    /**
     * Get Clusters
     * Retrieves a list of MongoDB clusters.
     * @param filterName Response filter to list only the MongoDB clusters that contain the specified name. The value is case insensitive and matched on the &#39;displayName&#39; field.  (optional)
     * @return ApiResponse&lt;ClusterList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public ApiResponse<ClusterList> clustersGetWithHttpInfo(String filterName) throws ApiException {
        okhttp3.Call localVarCall = clustersGetValidateBeforeCall(filterName, null);
        Type localVarReturnType = new TypeToken<ClusterList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get Clusters (asynchronously)
     * Retrieves a list of MongoDB clusters.
     * @param filterName Response filter to list only the MongoDB clusters that contain the specified name. The value is case insensitive and matched on the &#39;displayName&#39; field.  (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call clustersGetAsync(String filterName, final ApiCallback<ClusterList> _callback) throws ApiException {

        okhttp3.Call localVarCall = clustersGetValidateBeforeCall(filterName, _callback);
        Type localVarReturnType = new TypeToken<ClusterList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for clustersPatch
     * @param clusterId The unique ID of the cluster. (required)
     * @param patchClusterRequest Part of the cluster which should be modified. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call clustersPatchCall(String clusterId, PatchClusterRequest patchClusterRequest, final ApiCallback<ClusterResponse> _callback) throws ApiException {
        Object localVarPostBody = patchClusterRequest;

        // create path and map variables
        String localVarPath = "/clusters/{clusterId}"
            .replaceAll("\\{" + "clusterId" + "\\}", localVarApiClient.escapeString(clusterId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "PATCH", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call clustersPatchValidateBeforeCall(String clusterId, PatchClusterRequest patchClusterRequest, final ApiCallback<ClusterResponse> _callback) throws ApiException {
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling clustersPatch(Async)");
        }
        
        // verify the required parameter 'patchClusterRequest' is set
        if (patchClusterRequest == null) {
            throw new ApiException("Missing the required parameter 'patchClusterRequest' when calling clustersPatch(Async)");
        }
        

        okhttp3.Call localVarCall = clustersPatchCall(clusterId, patchClusterRequest, _callback);
        return localVarCall;

    }

    /**
     * Patch a cluster
     * Patch attributes of a MongoDB cluster.
     * @param clusterId The unique ID of the cluster. (required)
     * @param patchClusterRequest Part of the cluster which should be modified. (required)
     * @return ClusterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public ClusterResponse clustersPatch(String clusterId, PatchClusterRequest patchClusterRequest) throws ApiException {
        ApiResponse<ClusterResponse> localVarResp = clustersPatchWithHttpInfo(clusterId, patchClusterRequest);
        return localVarResp.getData();
    }

    /**
     * Patch a cluster
     * Patch attributes of a MongoDB cluster.
     * @param clusterId The unique ID of the cluster. (required)
     * @param patchClusterRequest Part of the cluster which should be modified. (required)
     * @return ApiResponse&lt;ClusterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public ApiResponse<ClusterResponse> clustersPatchWithHttpInfo(String clusterId, PatchClusterRequest patchClusterRequest) throws ApiException {
        okhttp3.Call localVarCall = clustersPatchValidateBeforeCall(clusterId, patchClusterRequest, null);
        Type localVarReturnType = new TypeToken<ClusterResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Patch a cluster (asynchronously)
     * Patch attributes of a MongoDB cluster.
     * @param clusterId The unique ID of the cluster. (required)
     * @param patchClusterRequest Part of the cluster which should be modified. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call clustersPatchAsync(String clusterId, PatchClusterRequest patchClusterRequest, final ApiCallback<ClusterResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = clustersPatchValidateBeforeCall(clusterId, patchClusterRequest, _callback);
        Type localVarReturnType = new TypeToken<ClusterResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for clustersPost
     * @param createClusterRequest The cluster to be created. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The created cluster is returned and is automatically set to &#x60;state &#x3D; BUSY&#x60;.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call clustersPostCall(CreateClusterRequest createClusterRequest, final ApiCallback<ClusterResponse> _callback) throws ApiException {
        Object localVarPostBody = createClusterRequest;

        // create path and map variables
        String localVarPath = "/clusters";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        String[] localVarAuthNames = new String[] { "basicAuth", "tokenAuth" };
        return localVarApiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call clustersPostValidateBeforeCall(CreateClusterRequest createClusterRequest, final ApiCallback<ClusterResponse> _callback) throws ApiException {
        
        // verify the required parameter 'createClusterRequest' is set
        if (createClusterRequest == null) {
            throw new ApiException("Missing the required parameter 'createClusterRequest' when calling clustersPost(Async)");
        }
        

        okhttp3.Call localVarCall = clustersPostCall(createClusterRequest, _callback);
        return localVarCall;

    }

    /**
     * Create a Cluster
     * Creates a new MongoDB cluster. 
     * @param createClusterRequest The cluster to be created. (required)
     * @return ClusterResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The created cluster is returned and is automatically set to &#x60;state &#x3D; BUSY&#x60;.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public ClusterResponse clustersPost(CreateClusterRequest createClusterRequest) throws ApiException {
        ApiResponse<ClusterResponse> localVarResp = clustersPostWithHttpInfo(createClusterRequest);
        return localVarResp.getData();
    }

    /**
     * Create a Cluster
     * Creates a new MongoDB cluster. 
     * @param createClusterRequest The cluster to be created. (required)
     * @return ApiResponse&lt;ClusterResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The created cluster is returned and is automatically set to &#x60;state &#x3D; BUSY&#x60;.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public ApiResponse<ClusterResponse> clustersPostWithHttpInfo(CreateClusterRequest createClusterRequest) throws ApiException {
        okhttp3.Call localVarCall = clustersPostValidateBeforeCall(createClusterRequest, null);
        Type localVarReturnType = new TypeToken<ClusterResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a Cluster (asynchronously)
     * Creates a new MongoDB cluster. 
     * @param createClusterRequest The cluster to be created. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The created cluster is returned and is automatically set to &#x60;state &#x3D; BUSY&#x60;.  </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public okhttp3.Call clustersPostAsync(CreateClusterRequest createClusterRequest, final ApiCallback<ClusterResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = clustersPostValidateBeforeCall(createClusterRequest, _callback);
        Type localVarReturnType = new TypeToken<ClusterResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
