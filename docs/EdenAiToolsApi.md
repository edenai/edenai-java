# EdenAiToolsApi

All URIs are relative to *https://api.edenai.run/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**search**](EdenAiToolsApi.md#search) | **POST** /tools/search | 


<a name="search"></a>
# **search**
> InlineResponse20014 search(text, words)



This is an easy tool to lookup for a list of words in a given text

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.EdenAiToolsApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

EdenAiToolsApi apiInstance = new EdenAiToolsApi();
String text = "text_example"; // String | Text to analyze
String words = "words_example"; // String | (ex: [ 'Happy', 'New', 'Year'])
try {
    InlineResponse20014 result = apiInstance.search(text, words);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling EdenAiToolsApi#search");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Text to analyze |
 **words** | **String**| (ex: [ &#39;Happy&#39;, &#39;New&#39;, &#39;Year&#39;]) |

### Return type

[**InlineResponse20014**](InlineResponse/InlineResponse20014.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

