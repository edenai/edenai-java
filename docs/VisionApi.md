# VisionApi

All URIs are relative to *https://api.edenai.run/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**explicitContentDetection**](VisionApi.md#explicitContentDetection) | **POST** /pretrained/vision/explicit_content_detection | 
[**faceDetection**](VisionApi.md#faceDetection) | **POST** /pretrained/vision/face_detection | 
[**objectDetection**](VisionApi.md#objectDetection) | **POST** /pretrained/vision/object_detection | 


<a name="explicitContentDetection"></a>
# **explicitContentDetection**
> InlineResponse20011 explicitContentDetection(files, providers)



Explicit Content Detection detects adult only content in videos, who is generally inappropriate for people under the age of 18 and includes nudity, sexual activity and pornography ...  **AVAILABLE PROVIDERS**   |Name|Value|Version| |----|-----|-------| |**Microsoft Azure**|&#x60;microsoft&#x60;| &#x60;v3.2&#x60;  |**Amazon Web Services**|&#x60;amazon&#x60;| &#x60;boto3 (v1.15.18)&#x60;  |**Google Cloud**|&#x60;google&#x60;| &#x60;v1&#x60; 

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.VisionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

VisionApi apiInstance = new VisionApi();
File files = new File("/path/to/file.txt"); // File | File Image to analyse (ex: pdf, jpg, jpeg, png, tiff)
String providers = "providers_example"; // String | Provider to compare (ex: [ 'amazon', 'microsoft', 'google'])
try {
    InlineResponse20011 result = apiInstance.explicitContentDetection(files, providers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisionApi#explicitContentDetection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **files** | **File**| File Image to analyse (ex: pdf, jpg, jpeg, png, tiff) |
 **providers** | **String**| Provider to compare (ex: [ &#39;amazon&#39;, &#39;microsoft&#39;, &#39;google&#39;]) |

### Return type

[**InlineResponse20011**](InlineResponse/InlineResponse20011.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="faceDetection"></a>
# **faceDetection**
> InlineResponse20012 faceDetection(files, providers)



Face Detection is a computer technology being used in a variety of applicationsthat identifies human faces in digital images.  **AVAILABLE PROVIDERS**   |Name|Value|Version| |----|-----|-------| |**Google Cloud**|&#x60;google&#x60;| &#x60;v1&#x60; 

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.VisionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

VisionApi apiInstance = new VisionApi();
File files = new File("/path/to/file.txt"); // File | File Image to analyse (ex: pdf, jpg, jpeg, png, tiff)
String providers = "providers_example"; // String | Provider to compare (ex: [ 'amazon', 'microsoft','google'])
try {
    InlineResponse20012 result = apiInstance.faceDetection(files, providers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisionApi#faceDetection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **files** | **File**| File Image to analyse (ex: pdf, jpg, jpeg, png, tiff) |
 **providers** | **String**| Provider to compare (ex: [ &#39;amazon&#39;, &#39;microsoft&#39;,&#39;google&#39;]) |

### Return type

[**InlineResponse20012**](InlineResponse/InlineResponse20012.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="objectDetection"></a>
# **objectDetection**
> InlineResponse20013 objectDetection(files, providers)



Object Detection is a computer vision technique that allows us to identify and locate objects in an image or video  **AVAILABLE PROVIDERS**   |Name|Value|Version| |----|-----|-------| |**Microsoft Azure**|&#x60;microsoft&#x60;| &#x60;v3.2&#x60;  |**Amazon Web Services**|&#x60;amazon&#x60;| &#x60;boto3 (v1.15.18)&#x60;  |**Google Cloud**|&#x60;google&#x60;| &#x60;v1&#x60; 

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.VisionApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

VisionApi apiInstance = new VisionApi();
File files = new File("/path/to/file.txt"); // File | File Image to analyse (ex: pdf, jpg, jpeg, png, tiff)
String providers = "providers_example"; // String | Provider to compare (ex: [ 'amazon', 'microsoft','google'])
try {
    InlineResponse20013 result = apiInstance.objectDetection(files, providers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling VisionApi#objectDetection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **files** | **File**| File Image to analyse (ex: pdf, jpg, jpeg, png, tiff) |
 **providers** | **String**| Provider to compare (ex: [ &#39;amazon&#39;, &#39;microsoft&#39;,&#39;google&#39;]) |

### Return type

[**InlineResponse20013**](InlineResponse/InlineResponse20013.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

