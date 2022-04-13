# AutoMlTextDataApi

All URIs are relative to *https://api.edenai.run/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**automlTextDataDelete**](AutoMlTextDataApi.md#automlTextDataDelete) | **DELETE** /automl/text/project/{project_id}/train/{train_id} | 
[**automlTextDataLaunchPrediction**](AutoMlTextDataApi.md#automlTextDataLaunchPrediction) | **POST** /automl/text/project/{project_id}/train/{train_id}/prediction | 
[**automlTextDataPredictionDetail**](AutoMlTextDataApi.md#automlTextDataPredictionDetail) | **GET** /automl/text/project/{project_id}/train/{train_id}/prediction/{predict_id} | 
[**automlTextDataPredictionResults**](AutoMlTextDataApi.md#automlTextDataPredictionResults) | **GET** /automl/text/project/{project_id}/train/{train_id}/prediction/{predict_id}/results | 
[**automlTextDataTrain**](AutoMlTextDataApi.md#automlTextDataTrain) | **POST** /automl/text/project/{project_id}/train | 
[**automlTextDataTrainDetail**](AutoMlTextDataApi.md#automlTextDataTrainDetail) | **GET** /automl/text/project/{project_id}/train/{train_id} | 
[**automlTextProjectCreate**](AutoMlTextDataApi.md#automlTextProjectCreate) | **POST** /automl/text/project | 
[**automlTextProjectDelete**](AutoMlTextDataApi.md#automlTextProjectDelete) | **DELETE** /automl/text/project/{project_id} | 
[**automlTextProjectDetail**](AutoMlTextDataApi.md#automlTextProjectDetail) | **GET** /automl/text/project/{project_id} | 
[**automlTextProjectList**](AutoMlTextDataApi.md#automlTextProjectList) | **GET** /automl/text/project | 
[**automlTextProjectUpdate**](AutoMlTextDataApi.md#automlTextProjectUpdate) | **PUT** /automl/text/project/{project_id} | 


<a name="automlTextDataDelete"></a>
# **automlTextDataDelete**
> automlTextDataDelete(projectId, trainId)



AutoML Text Data Delete

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.AutoMlTextDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AutoMlTextDataApi apiInstance = new AutoMlTextDataApi();
String projectId = "projectId_example"; // String | 
String trainId = "trainId_example"; // String | 
try {
    apiInstance.automlTextDataDelete(projectId, trainId);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoMlTextDataApi#automlTextDataDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **trainId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="automlTextDataLaunchPrediction"></a>
# **automlTextDataLaunchPrediction**
> automlTextDataLaunchPrediction(projectId, trainId, files)



  **SUPPORTED FILES**  The API takes a csv file with no header and only one column, where each line contains a document to classify.  

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.AutoMlTextDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AutoMlTextDataApi apiInstance = new AutoMlTextDataApi();
String projectId = "projectId_example"; // String | 
String trainId = "trainId_example"; // String | 
File files = new File("/path/to/file.txt"); // File | 
try {
    apiInstance.automlTextDataLaunchPrediction(projectId, trainId, files);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoMlTextDataApi#automlTextDataLaunchPrediction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **trainId** | **String**|  |
 **files** | **File**|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="automlTextDataPredictionDetail"></a>
# **automlTextDataPredictionDetail**
> automlTextDataPredictionDetail(predictId, projectId, trainId)



  **SUPPORTED FILES**  The API takes a csv file with no header and only one column, where each line contains a document to classify.  

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.AutoMlTextDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AutoMlTextDataApi apiInstance = new AutoMlTextDataApi();
String predictId = "predictId_example"; // String | 
String projectId = "projectId_example"; // String | 
String trainId = "trainId_example"; // String | 
try {
    apiInstance.automlTextDataPredictionDetail(predictId, projectId, trainId);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoMlTextDataApi#automlTextDataPredictionDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **predictId** | **String**|  |
 **projectId** | **String**|  |
 **trainId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="automlTextDataPredictionResults"></a>
# **automlTextDataPredictionResults**
> automlTextDataPredictionResults(predictId, projectId, trainId)



  **SUPPORTED FILES**  The API takes a csv file with no header and only one column, where each line contains a document to classify.  

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.AutoMlTextDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AutoMlTextDataApi apiInstance = new AutoMlTextDataApi();
String predictId = "predictId_example"; // String | 
String projectId = "projectId_example"; // String | 
String trainId = "trainId_example"; // String | 
try {
    apiInstance.automlTextDataPredictionResults(predictId, projectId, trainId);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoMlTextDataApi#automlTextDataPredictionResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **predictId** | **String**|  |
 **projectId** | **String**|  |
 **trainId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="automlTextDataTrain"></a>
# **automlTextDataTrain**
> automlTextDataTrain(projectId, provider, trainingName)



  **AVAILABLE PROVIDERS**  |Name|Value| |-------------------------------|---------------| |[**Google Cloud Services**](https://www.edenai.co/catalog/google-cloud-natural-language)|&#x60;google&#x60;| |[**Amazon Web Services**](https://www.edenai.co/catalog/amazon-comprehend)|&#x60;amazon&#x60;|  

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.AutoMlTextDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AutoMlTextDataApi apiInstance = new AutoMlTextDataApi();
String projectId = "projectId_example"; // String | 
String provider = "provider_example"; // String | 
String trainingName = "trainingName_example"; // String | 
try {
    apiInstance.automlTextDataTrain(projectId, provider, trainingName);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoMlTextDataApi#automlTextDataTrain");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **provider** | **String**|  |
 **trainingName** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="automlTextDataTrainDetail"></a>
# **automlTextDataTrainDetail**
> automlTextDataTrainDetail(projectId, trainId)



AutoML Text Data Train Detail

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.AutoMlTextDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AutoMlTextDataApi apiInstance = new AutoMlTextDataApi();
String projectId = "projectId_example"; // String | 
String trainId = "trainId_example"; // String | 
try {
    apiInstance.automlTextDataTrainDetail(projectId, trainId);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoMlTextDataApi#automlTextDataTrainDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **trainId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="automlTextProjectCreate"></a>
# **automlTextProjectCreate**
> automlTextProjectCreate(projectName, projectDescription, files, type, language)



  **SUPPORTED FILES**  The API takes csv files separated using &#39;,&#39;. The csv must contain a header and exactly two columns, named &#x60;docs&#x60; and &#x60;labels&#x60; In case a document might have several labels, please separate your labels using &#39;|&#39;     **SUPPORTED LANGUAGE**  |Name|Type|Value| |---------------------------|-------------------------------|---------------| | **English (US)**|*&#x60;string&#x60;*|&#x60;en&#x60;| | **French**      |*&#x60;string&#x60;*|&#x60;fr&#x60;| | **German**      |*&#x60;string&#x60;*|&#x60;de&#x60;| | **Italian**     |*&#x60;string&#x60;*|&#x60;it&#x60;| | **Portuguese**  |*&#x60;string&#x60;*|&#x60;pt&#x60;| | **Arabic**      |*&#x60;string&#x60;*|&#x60;ar&#x60;| | **Chinese-Simplified**|*&#x60;string&#x60;*|&#x60;zh&#x60;| | **Chinese-Traditional**|*&#x60;string&#x60;*|&#x60;zh-TW&#x60;| | **Korean**      |*&#x60;string&#x60;*|&#x60;ko&#x60;| | **Japanese**    |*&#x60;string&#x60;*|&#x60;ja&#x60;| | **Hindi**       |*&#x60;string&#x60;*|&#x60;hi&#x60;| | **Spanish**     |*&#x60;string&#x60;*|&#x60;es&#x60;|    **AVAILABLE CLASSIFICATION TYPES**  |Type|Value|Description| |---------------------------|-------------------------------|---------------| | **Single Label Classification**|&#x60;single_label_classification&#x60;|Each document belongs to one category (label)| | **Multi Label Classification**|&#x60;multi_label_classification&#x60;|Documents might have several labels|  

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.AutoMlTextDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AutoMlTextDataApi apiInstance = new AutoMlTextDataApi();
String projectName = "projectName_example"; // String | 
String projectDescription = "projectDescription_example"; // String | 
File files = new File("/path/to/file.txt"); // File | 
String type = "type_example"; // String | 
String language = "language_example"; // String | 
try {
    apiInstance.automlTextProjectCreate(projectName, projectDescription, files, type, language);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoMlTextDataApi#automlTextProjectCreate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectName** | **String**|  |
 **projectDescription** | **String**|  |
 **files** | **File**|  |
 **type** | **String**|  |
 **language** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="automlTextProjectDelete"></a>
# **automlTextProjectDelete**
> automlTextProjectDelete(projectId)



AutoML Text Project Delete

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.AutoMlTextDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AutoMlTextDataApi apiInstance = new AutoMlTextDataApi();
String projectId = "projectId_example"; // String | 
try {
    apiInstance.automlTextProjectDelete(projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoMlTextDataApi#automlTextProjectDelete");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="automlTextProjectDetail"></a>
# **automlTextProjectDetail**
> automlTextProjectDetail(projectId)



AutoML Text Project Detail

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.AutoMlTextDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AutoMlTextDataApi apiInstance = new AutoMlTextDataApi();
String projectId = "projectId_example"; // String | 
try {
    apiInstance.automlTextProjectDetail(projectId);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoMlTextDataApi#automlTextProjectDetail");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="automlTextProjectList"></a>
# **automlTextProjectList**
> automlTextProjectList()



AutoML Text Project List

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.AutoMlTextDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AutoMlTextDataApi apiInstance = new AutoMlTextDataApi();
try {
    apiInstance.automlTextProjectList();
} catch (ApiException e) {
    System.err.println("Exception when calling AutoMlTextDataApi#automlTextProjectList");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="automlTextProjectUpdate"></a>
# **automlTextProjectUpdate**
> automlTextProjectUpdate(projectId, projectName, projectDescription, type, language)



AutoML Text Project Update

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.AutoMlTextDataApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

AutoMlTextDataApi apiInstance = new AutoMlTextDataApi();
String projectId = "projectId_example"; // String | 
String projectName = "projectName_example"; // String | 
String projectDescription = "projectDescription_example"; // String | 
String type = "type_example"; // String | 
String language = "language_example"; // String | 
try {
    apiInstance.automlTextProjectUpdate(projectId, projectName, projectDescription, type, language);
} catch (ApiException e) {
    System.err.println("Exception when calling AutoMlTextDataApi#automlTextProjectUpdate");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **projectId** | **String**|  |
 **projectName** | **String**|  |
 **projectDescription** | **String**|  |
 **type** | **String**|  |
 **language** | **String**|  |

### Return type

null (empty response body)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

