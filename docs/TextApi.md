# TextApi

All URIs are relative to *https://api.edenai.run/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**keywordExtraction**](TextApi.md#keywordExtraction) | **POST** /pretrained/text/keyword_extraction | 
[**namedEntityRecognition**](TextApi.md#namedEntityRecognition) | **POST** /pretrained/text/named_entity_recognition | 
[**sentimentAnalysis**](TextApi.md#sentimentAnalysis) | **POST** /pretrained/text/sentiment_analysis | 
[**syntaxAnalysis**](TextApi.md#syntaxAnalysis) | **POST** /pretrained/text/syntax_analysis | 


<a name="keywordExtraction"></a>
# **keywordExtraction**
> InlineResponse2005 keywordExtraction(language, text, providers)



Keyword extraction (also known as keyword detection or keyword analysis) is a text analysis technique that consists of automatically extracting the mostimportant words and expressions in a text.  **SUPPORTED LANGUAGE**  |Name|Type|Value| |----|----|-----| |**English(US)**|&#x60;string&#x60;|&#x60;en-US&#x60;| |**French**|&#x60;string&#x60;|&#x60;fr-FR&#x60;| |**Spanish**|&#x60;string&#x60;|&#x60;es-ES&#x60;|  **AVAILABLE PROVIDERS**   |Name|Value|Version| |----|-----|-------| |**Microsoft Azure**|&#x60;microsoft&#x60;| &#x60;v3.1&#x60;  |**Amazon Web Services**|&#x60;amazon&#x60;| &#x60;boto3 (v1.15.18)&#x60;  |**IBM Watson**|&#x60;ibm&#x60;| &#x60;v1 (2021-08-01)&#x60; 

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.TextApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

TextApi apiInstance = new TextApi();
String language = "language_example"; // String | Language code of text (ex: fr-FR (French), en-US (English), es-ES (Spanish))
String text = "text_example"; // String | Text to analyze
String providers = "providers_example"; // String | Provider to compare (ex: [ 'amazon', 'microsoft', 'ibm'])
try {
    InlineResponse2005 result = apiInstance.keywordExtraction(language, text, providers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextApi#keywordExtraction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Language code of text (ex: fr-FR (French), en-US (English), es-ES (Spanish)) |
 **text** | **String**| Text to analyze |
 **providers** | **String**| Provider to compare (ex: [ &#39;amazon&#39;, &#39;microsoft&#39;, &#39;ibm&#39;]) |

### Return type

[**InlineResponse2005**](InlineResponse/InlineResponse2005.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="namedEntityRecognition"></a>
# **namedEntityRecognition**
> InlineResponse2006 namedEntityRecognition(language, text, providers)



Named Entity Recognition (also called entity identification or entity extraction) is an information extraction technique that automatically identifies named entities in a text and classifies them into predefined categories.  **SUPPORTED LANGUAGE**  |Name|Type|Value| |----|----|-----| |**English(US)**|&#x60;string&#x60;|&#x60;en-US&#x60;| |**French**|&#x60;string&#x60;|&#x60;fr-FR&#x60;| |**Spanish**|&#x60;string&#x60;|&#x60;es-ES&#x60;|  **AVAILABLE PROVIDERS**   |Name|Value|Version| |----|-----|-------| |**Microsoft Azure**|&#x60;microsoft&#x60;| &#x60;v3.1&#x60;  |**Amazon Web Services**|&#x60;amazon&#x60;| &#x60;boto3 (v1.15.18)&#x60;  |**IBM Watson**|&#x60;ibm&#x60;| &#x60;v1 (2021-08-01)&#x60;  |**Google Cloud**|&#x60;google&#x60;| &#x60;v1&#x60; 

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.TextApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

TextApi apiInstance = new TextApi();
String language = "language_example"; // String | Language code of text (ex: fr-FR (French), en-US (English), es-ES (Spanish))
String text = "text_example"; // String | Text to analyze
String providers = "providers_example"; // String | Provider to compare (ex: [ 'amazon', 'microsoft', 'ibm','google'])
try {
    InlineResponse2006 result = apiInstance.namedEntityRecognition(language, text, providers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextApi#namedEntityRecognition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Language code of text (ex: fr-FR (French), en-US (English), es-ES (Spanish)) |
 **text** | **String**| Text to analyze |
 **providers** | **String**| Provider to compare (ex: [ &#39;amazon&#39;, &#39;microsoft&#39;, &#39;ibm&#39;,&#39;google&#39;]) |

### Return type

[**InlineResponse2006**](InlineResponse/InlineResponse2006.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="sentimentAnalysis"></a>
# **sentimentAnalysis**
> InlineResponse2007 sentimentAnalysis(language, text, providers)



Sentiment analysis API extracts sentiment in a given string of text.Sentiment analysis, also called &#39;opinion mining&#39;,uses natural language processing, text analysis and computational linguistics to identify and detect subjective information from the input text.  **SUPPORTED LANGUAGE**  |Name|Type|Value| |----|----|-----| |**English(US)**|&#x60;string&#x60;|&#x60;en-US&#x60;| |**French**|&#x60;string&#x60;|&#x60;fr-FR&#x60;| |**Spanish**|&#x60;string&#x60;|&#x60;es-ES&#x60;| |**Dutch**|&#x60;string&#x60;|&#x60;nl-NL&#x60;|  **AVAILABLE PROVIDERS**   |Name|Value|Version| |----|-----|-------| |**Microsoft Azure**|&#x60;microsoft&#x60;| &#x60;v3.1&#x60;  |**Amazon Web Services**|&#x60;amazon&#x60;| &#x60;boto3 (v1.15.18)&#x60;  |**IBM Watson**|&#x60;ibm&#x60;| &#x60;v1 (2021-08-01)&#x60;  |**Google Cloud**|&#x60;google&#x60;| &#x60;v1&#x60; 

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.TextApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

TextApi apiInstance = new TextApi();
String language = "language_example"; // String | Language code of text (ex: fr-FR (French), en-US (English), es-ES (Spanish))
String text = "text_example"; // String | Text to analyze
String providers = "providers_example"; // String | Provider to compare (ex: [ 'amazon', 'microsoft', 'ibm', 'google'])
try {
    InlineResponse2007 result = apiInstance.sentimentAnalysis(language, text, providers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextApi#sentimentAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Language code of text (ex: fr-FR (French), en-US (English), es-ES (Spanish)) |
 **text** | **String**| Text to analyze |
 **providers** | **String**| Provider to compare (ex: [ &#39;amazon&#39;, &#39;microsoft&#39;, &#39;ibm&#39;, &#39;google&#39;]) |

### Return type

[**InlineResponse2007**](InlineResponse/InlineResponse2007.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="syntaxAnalysis"></a>
# **syntaxAnalysis**
> InlineResponse2008 syntaxAnalysis(language, text, providers)



Syntax analysis consists principaly in highlighting the structure of a text.  **SUPPORTED LANGUAGE**  |Name|Type|Value| |----|----|-----| |**English(US)**|&#x60;string&#x60;|&#x60;en-US&#x60;| |**French**|&#x60;string&#x60;|&#x60;fr-FR&#x60;| |**Spanish**|&#x60;string&#x60;|&#x60;es-ES&#x60;|  **AVAILABLE PROVIDERS**   |Name|Value|Version| |----|-----|-------| |**Amazon Web Services**|&#x60;amazon&#x60;| &#x60;boto3 (v1.15.18)&#x60;  |**IBM Watson**|&#x60;ibm&#x60;| &#x60;v1 (2021-08-01)&#x60;  |**Google Cloud**|&#x60;google&#x60;| &#x60;v1&#x60; 

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.TextApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

TextApi apiInstance = new TextApi();
String language = "language_example"; // String | Language code of text (ex: fr-FR (French), en-US (English), es-ES (Spanish))
String text = "text_example"; // String | Text to analyze
String providers = "providers_example"; // String | Provider to compare (ex: [ 'amazon', 'microsoft', 'ibm','google'])
try {
    InlineResponse2008 result = apiInstance.syntaxAnalysis(language, text, providers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TextApi#syntaxAnalysis");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Language code of text (ex: fr-FR (French), en-US (English), es-ES (Spanish)) |
 **text** | **String**| Text to analyze |
 **providers** | **String**| Provider to compare (ex: [ &#39;amazon&#39;, &#39;microsoft&#39;, &#39;ibm&#39;,&#39;google&#39;]) |

### Return type

[**InlineResponse2008**](InlineResponse/InlineResponse2008.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

