/*
 * IONOS DBaaS MongoDB REST API
 * With IONOS Cloud Database as a Service, you have the ability to quickly set up and manage a MongoDB database. You can also delete clusters, manage backups and users via the API.   MongoDB is an open source, cross-platform, document-oriented database program. Classified as a NoSQL database program, it uses JSON-like documents with optional schemas.  The MongoDB API allows you to create additional database clusters or modify existing ones. Both tools, the Data Center Designer (DCD) and the API use the same concepts consistently and are well suited for smooth and intuitive use. 
 *
 * The version of the OpenAPI document: 0.1.0
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


import com.ionoscloud.dbaasmongo.model.ErrorResponse;
import com.ionoscloud.dbaasmongo.model.SnapshotList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SnapshotsApi {
    private ApiClient localVarApiClient;

    public SnapshotsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public SnapshotsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    /**
     * Build call for clustersSnapshotsGet
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
    public okhttp3.Call clustersSnapshotsGetCall(String clusterId, final ApiCallback<SnapshotList> _callback) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/clusters/{clusterId}/snapshots"
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
    private okhttp3.Call clustersSnapshotsGetValidateBeforeCall(String clusterId, final ApiCallback<SnapshotList> _callback) throws ApiException {
        
        // verify the required parameter 'clusterId' is set
        if (clusterId == null) {
            throw new ApiException("Missing the required parameter 'clusterId' when calling clustersSnapshotsGet(Async)");
        }
        

        okhttp3.Call localVarCall = clustersSnapshotsGetCall(clusterId, _callback);
        return localVarCall;

    }

    /**
     * Get the snapshots of your cluster
     * Retrieves MongoDB snapshots.
     * @param clusterId The unique ID of the cluster. (required)
     * @return SnapshotList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public SnapshotList clustersSnapshotsGet(String clusterId) throws ApiException {
        ApiResponse<SnapshotList> localVarResp = clustersSnapshotsGetWithHttpInfo(clusterId);
        return localVarResp.getData();
    }

    /**
     * Get the snapshots of your cluster
     * Retrieves MongoDB snapshots.
     * @param clusterId The unique ID of the cluster. (required)
     * @return ApiResponse&lt;SnapshotList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Successful operation. </td><td>  -  </td></tr>
        <tr><td> 0 </td><td> Any erroneous status code: 400 (parse error), 401 (auth error), 402 (trial access), 403 (insufficient permissions), 404 (not found), 405 (unsupported HTTP method), 415 (unsupported content type), 422 (validation error), 429 (request rate limit exceeded), 500 (server error), 503 (maintenance)  </td><td>  * Content-Type - The content type of the response. <br>  </td></tr>
     </table>
     */
    public ApiResponse<SnapshotList> clustersSnapshotsGetWithHttpInfo(String clusterId) throws ApiException {
        okhttp3.Call localVarCall = clustersSnapshotsGetValidateBeforeCall(clusterId, null);
        Type localVarReturnType = new TypeToken<SnapshotList>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the snapshots of your cluster (asynchronously)
     * Retrieves MongoDB snapshots.
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
    public okhttp3.Call clustersSnapshotsGetAsync(String clusterId, final ApiCallback<SnapshotList> _callback) throws ApiException {

        okhttp3.Call localVarCall = clustersSnapshotsGetValidateBeforeCall(clusterId, _callback);
        Type localVarReturnType = new TypeToken<SnapshotList>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
