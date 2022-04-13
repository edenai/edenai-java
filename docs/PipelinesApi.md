# PipelinesApi

All URIs are relative to *https://api.edenai.run/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**pipelines**](PipelinesApi.md#pipelines) | **POST** /pipelines | 


<a name="pipelines"></a>
# **pipelines**
> InlineResponse200 pipelines(description, returnOnlyLast, text, files)



Pipelines let you combine different AI APIs from different providers into a single ready to use pipeline that you can run on your data.   **AVAILABLE FEATURES**   |Feature                   |Value|Can be first|Can be followed by| |--------------------------|-----------------------|------------|------------------| |**OCR**                     |&#x60;ocr&#x60;                  |&#x60;True&#x60;      |Sentiment Analysis, Syntax Analysis, Keyword Analysis, Named Entity Recognition, Text to speech, Translation,  Language Detection  | |**Translation**             |&#x60;automatic_translation&#x60;|&#x60;True&#x60;      |Sentiment Analysis, Syntax Analysis, Keyword Analysis, Named Entity Recognition, Text to speech, Language Detection                | |**Speech recognition**      |&#x60;speech_to_text&#x60;       |&#x60;True&#x60;      |Sentiment Analysis, Syntax Analysis, Keyword Analysis, Named Entity Recognition, Text to speech, Translation,  Language Detection  | |**Sentiment Analysis**      |&#x60;sentiment_analysis&#x60;   |&#x60;False&#x60;     |None                                                                                                                               | |**Syntax Analysis**         |&#x60;syntax_analysis&#x60;      |&#x60;False&#x60;     |None                                                                                                                               | |**Keyword Analysis**        |&#x60;keyword_extraction&#x60;   |&#x60;False&#x60;     |None                                                                                                                               | |**Named Entity Recognition**|&#x60;language_detection&#x60;   |&#x60;False&#x60;-    |None                                                                                                                               | |**Language Detection**      |&#x60;language_detection&#x60;   |&#x60;False&#x60;     |None                                                                                                                               | |**Text to speech**          |&#x60;text_to_speech&#x60;       |&#x60;False&#x60;     |None                                                                                                                               | 

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.PipelinesApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

PipelinesApi apiInstance = new PipelinesApi();
String description = "description_example"; // String | The desciption field must be an array of ordered dictionaries.                                                      Each dictionary describes the feature to call. in fact, it has to contain two keys \"feature\" and \"params\".   * feature conatins a string (the value of the feature ex : automatic_translation).  * params contains a dictionary of parameters to be used to call the feature, see the feature corresponding documentation to know which parameters well be needed.   ex : `[ { \"feature\": \"ocr\",  \"params\": { \"providers\": \"['amazon']\",\"language\": \"en-US\" } }, { \"feature\": \"syntax_analysis\",  \"params\": { \"providers\": \"['amazon']\",\"language\": \"en-US\" } }]`                                                      
Boolean returnOnlyLast = true; // Boolean | This parameter allows user to choose to output only the final result or all the intermediate results.
String text = "text_example"; // String | The input text for the first feature of the pipeline
File files = new File("/path/to/file.txt"); // File | The input file for the first feature of the pipeline
try {
    InlineResponse200 result = apiInstance.pipelines(description, returnOnlyLast, text, files);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PipelinesApi#pipelines");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **description** | **String**| The desciption field must be an array of ordered dictionaries.                                                      Each dictionary describes the feature to call. in fact, it has to contain two keys \&quot;feature\&quot; and \&quot;params\&quot;.   * feature conatins a string (the value of the feature ex : automatic_translation).  * params contains a dictionary of parameters to be used to call the feature, see the feature corresponding documentation to know which parameters well be needed.   ex : &#x60;[ { \&quot;feature\&quot;: \&quot;ocr\&quot;,  \&quot;params\&quot;: { \&quot;providers\&quot;: \&quot;[&#39;amazon&#39;]\&quot;,\&quot;language\&quot;: \&quot;en-US\&quot; } }, { \&quot;feature\&quot;: \&quot;syntax_analysis\&quot;,  \&quot;params\&quot;: { \&quot;providers\&quot;: \&quot;[&#39;amazon&#39;]\&quot;,\&quot;language\&quot;: \&quot;en-US\&quot; } }]&#x60;                                                       |
 **returnOnlyLast** | **Boolean**| This parameter allows user to choose to output only the final result or all the intermediate results. |
 **text** | **String**| The input text for the first feature of the pipeline | [optional]
 **files** | **File**| The input file for the first feature of the pipeline | [optional]

### Return type

[**InlineResponse200**](InlineResponse/InlineResponse200.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

