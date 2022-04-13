# SpeechApi

All URIs are relative to *https://api.edenai.run/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**asyncSpeechToText**](SpeechApi.md#asyncSpeechToText) | **POST** /pretrained/audio/speech_recognition_async | 
[**asyncSpeechToTextJobid**](SpeechApi.md#asyncSpeechToTextJobid) | **GET** /pretrained/audio/speech_recognition_async/{job_id} | 
[**speechToText**](SpeechApi.md#speechToText) | **POST** /pretrained/audio/speech_to_text | 
[**textToSpeech**](SpeechApi.md#textToSpeech) | **POST** /pretrained/audio/text_to_speech | 


<a name="asyncSpeechToText"></a>
# **asyncSpeechToText**
> InlineResponse2001 asyncSpeechToText(language, files, providers, webhookReceiver, usersWebhookParameters, vocab)



Speech recognition is technology that can recognize spoken words, which can then be converted to text. This endpoint allows you to launch asynchronous speech recognition jobs.  **SUPPORTED LANGUAGE**  |Name|Type|Value| |----|----|-----| |**English (US)**|&#x60;string&#x60;|&#x60;en-US&#x60;| |**English (GB)**|&#x60;string&#x60;|&#x60;en-GB&#x60;| |**French**|&#x60;string&#x60;|&#x60;fr-FR&#x60;| |**Spanish**|&#x60;string&#x60;|&#x60;es-ES&#x60;| |**Dutch (Netherlands)**|&#x60;string&#x60;|&#x60;nl-NL&#x60;| |**Japanese**|&#x60;string&#x60;|&#x60;ja-JP&#x60;| |**Russian**|&#x60;string&#x60;|&#x60;ru-RU&#x60;| |**Arabic**|&#x60;string&#x60;|&#x60;ar-SA&#x60;| |**Italian**|&#x60;string&#x60;|&#x60;it-IT&#x60;| |**Korean**|&#x60;string&#x60;|&#x60;ko-KR&#x60;| |**Portuguese**|&#x60;string&#x60;|&#x60;pt-PT&#x60;| |**Turkish**|&#x60;string&#x60;|&#x60;tr-TR&#x60;| |**Indonesian**|&#x60;string&#x60;|&#x60;id-ID&#x60;| |**Malay**|&#x60;string&#x60;|&#x60;ms-MY&#x60;|  **AVAILABLE PROVIDERS**   |Name|Value|Version| |----|-----|-------| |**Amazon Web Services**|&#x60;amazon&#x60;| &#x60;boto3 (v1.15.18)&#x60;  |**Speechmatics**|&#x60;speechmatics&#x60;| &#x60;2.7.0&#x60; 

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.SpeechApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

SpeechApi apiInstance = new SpeechApi();
String language = "language_example"; // String | Language code expected (ex: fr-FR (French), en-US (English), es-ES (Spanish), nl-NL Dutch (Netherlands))
File files = new File("/path/to/file.txt"); // File | File to analyse (ex: mp3, wav, m4a)
String providers = "providers_example"; // String | Provider to compare (ex: [ 'amazon', 'microsoft', 'ibm','google', 'threescribe])
String webhookReceiver = "webhookReceiver_example"; // String | Webhook reciever should be a valid https URL (ex : https://your.listner.com/endpoint)
String usersWebhookParameters = "usersWebhookParameters_example"; // String | Json data that consist of additional parameters that will be sent back to the webhook receiver (ex: api key for security).                    **NOTE : The data will be returned back as a string that should be decoded into a json object!**
String vocab = "vocab_example"; // String | Speechmatics allows to add a custom vocab dictionnary (json format) for better recognition, you can add it via this parameter.                     It has to be a list of dictionaries : {'content'(Required) : 'string', 'sounds_like'(Optional) : 'list of strings'}
try {
    InlineResponse2001 result = apiInstance.asyncSpeechToText(language, files, providers, webhookReceiver, usersWebhookParameters, vocab);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechApi#asyncSpeechToText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Language code expected (ex: fr-FR (French), en-US (English), es-ES (Spanish), nl-NL Dutch (Netherlands)) |
 **files** | **File**| File to analyse (ex: mp3, wav, m4a) |
 **providers** | **String**| Provider to compare (ex: [ &#39;amazon&#39;, &#39;microsoft&#39;, &#39;ibm&#39;,&#39;google&#39;, &#39;threescribe]) |
 **webhookReceiver** | **String**| Webhook reciever should be a valid https URL (ex : https://your.listner.com/endpoint) | [optional]
 **usersWebhookParameters** | **String**| Json data that consist of additional parameters that will be sent back to the webhook receiver (ex: api key for security).                    **NOTE : The data will be returned back as a string that should be decoded into a json object!** | [optional]
 **vocab** | **String**| Speechmatics allows to add a custom vocab dictionnary (json format) for better recognition, you can add it via this parameter.                     It has to be a list of dictionaries : {&#39;content&#39;(Required) : &#39;string&#39;, &#39;sounds_like&#39;(Optional) : &#39;list of strings&#39;} | [optional]

### Return type

[**InlineResponse2001**](InlineResponse/InlineResponse2001.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="asyncSpeechToTextJobid"></a>
# **asyncSpeechToTextJobid**
> InlineResponse2002 asyncSpeechToTextJobid(jobId)



This endpoint allows you to check the state of  your asynchronous speech recognition job and returns the results if they are ready.

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.SpeechApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

SpeechApi apiInstance = new SpeechApi();
String jobId = "jobId_example"; // String | 
try {
    InlineResponse2002 result = apiInstance.asyncSpeechToTextJobid(jobId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechApi#asyncSpeechToTextJobid");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **jobId** | **String**|  |

### Return type

[**InlineResponse2002**](InlineResponse/InlineResponse2002.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="speechToText"></a>
# **speechToText**
> InlineResponse201 speechToText(language, files, providers, vocab)



Speech recognition is technology that can recognize spoken words, which can then be converted to text.  **SUPPORTED LANGUAGE**  |Name|Type|Value| |----|----|-----| |**English (US)**|&#x60;string&#x60;|&#x60;en-US&#x60;| |**English (GB)**|&#x60;string&#x60;|&#x60;en-GB&#x60;| |**French**|&#x60;string&#x60;|&#x60;fr-FR&#x60;| |**Spanish**|&#x60;string&#x60;|&#x60;es-ES&#x60;| |**Dutch (Netherlands)**|&#x60;string&#x60;|&#x60;nl-NL&#x60;| |**Japanese**|&#x60;string&#x60;|&#x60;ja-JP&#x60;| |**Russian**|&#x60;string&#x60;|&#x60;ru-RU&#x60;| |**Arabic**|&#x60;string&#x60;|&#x60;ar-SA&#x60;| |**Italian**|&#x60;string&#x60;|&#x60;it-IT&#x60;| |**Korean**|&#x60;string&#x60;|&#x60;ko-KR&#x60;| |**Portuguese**|&#x60;string&#x60;|&#x60;pt-PT&#x60;| |**Turkish**|&#x60;string&#x60;|&#x60;tr-TR&#x60;| |**Indonesian**|&#x60;string&#x60;|&#x60;id-ID&#x60;| |**Malay**|&#x60;string&#x60;|&#x60;ms-MY&#x60;|  **AVAILABLE PROVIDERS**   |Name|Value|Version| |----|-----|-------| |**Microsoft Azure**|&#x60;microsoft&#x60;| &#x60;v1.0&#x60;  |**Amazon Web Services**|&#x60;amazon&#x60;| &#x60;boto3 (v1.15.18)&#x60;  |**Google Cloud**|&#x60;google&#x60;| &#x60;v1p1beta1&#x60;  |**Deepgram**|&#x60;deepgram&#x60;| &#x60;v1&#x60;  |**RevAi**|&#x60;revai&#x60;| &#x60;v1&#x60; 

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.SpeechApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

SpeechApi apiInstance = new SpeechApi();
String language = "language_example"; // String | Language code expected (ex: fr-FR (French), en-US (English), es-ES (Spanish), nl-NL Dutch (Netherlands))
File files = new File("/path/to/file.txt"); // File | File to analyse (ex: mp3, wav, m4a)
String providers = "providers_example"; // String | Provider to compare (ex: [ 'amazon', 'microsoft', 'ibm','google', 'threescribe])
String vocab = "vocab_example"; // String | Speechmatics allows to add a custom vocab dictionnary (json format) for better recognition, you can add it via this parameter.                     It has to be a list of dictionaries : {'content'(Required) : 'string', 'sounds_like'(Optional) : 'list of strings'}
try {
    InlineResponse201 result = apiInstance.speechToText(language, files, providers, vocab);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechApi#speechToText");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **language** | **String**| Language code expected (ex: fr-FR (French), en-US (English), es-ES (Spanish), nl-NL Dutch (Netherlands)) |
 **files** | **File**| File to analyse (ex: mp3, wav, m4a) |
 **providers** | **String**| Provider to compare (ex: [ &#39;amazon&#39;, &#39;microsoft&#39;, &#39;ibm&#39;,&#39;google&#39;, &#39;threescribe]) |
 **vocab** | **String**| Speechmatics allows to add a custom vocab dictionnary (json format) for better recognition, you can add it via this parameter.                     It has to be a list of dictionaries : {&#39;content&#39;(Required) : &#39;string&#39;, &#39;sounds_like&#39;(Optional) : &#39;list of strings&#39;} | [optional]

### Return type

[**InlineResponse201**](InlineResponse/InlineResponse201.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="textToSpeech"></a>
# **textToSpeech**
> InlineResponse2011 textToSpeech(text, language, option, providers)



Text-to-speech (TTS) system converts normal language text into speech.  **SUPPORTED LANGUAGE**  |Name|Type|Value| |----|----|-----| |**Arabic**|&#x60;string&#x60;|&#x60;ar-XA&#x60;| |**Chinese**|&#x60;string&#x60;|&#x60;cmn-CN&#x60;| |**Danish**|&#x60;string&#x60;|&#x60;da-DK&#x60;| |**Dutch**|&#x60;string&#x60;|&#x60;nl-NL&#x60;| |**English (US)**|&#x60;string&#x60;|&#x60;en-US&#x60;| |**English (UK)**|&#x60;string&#x60;|&#x60;en-GB&#x60;| |**German**|&#x60;string&#x60;|&#x60;de-DE&#x60;| |**Italy**|&#x60;string&#x60;|&#x60;it-IT&#x60;| |**Japanese**|&#x60;string&#x60;|&#x60;ja-JP&#x60;| |**Portuguese (Brazil)**|&#x60;string&#x60;|&#x60;pt-BR&#x60;| |**Portuguese (Portugal)**|&#x60;string&#x60;|&#x60;pt-PT&#x60;| |**Russian**|&#x60;string&#x60;|&#x60;ru-RU&#x60;| |**Spanish**|&#x60;string&#x60;|&#x60;es-ES&#x60;|  **AVAILABLE PROVIDERS**   |Name|Value|Version| |----|-----|-------| |**Microsoft Azure**|&#x60;microsoft&#x60;| &#x60;v1.0&#x60;  |**Amazon Web Services**|&#x60;amazon&#x60;| &#x60;boto3 (v1.15.18)&#x60;  |**Google Cloud**|&#x60;google&#x60;| &#x60;v1&#x60; 

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.SpeechApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

SpeechApi apiInstance = new SpeechApi();
String text = "text_example"; // String | Text to transform
String language = "language_example"; // String | Language code expected (ex: fr-FR (French), en-US (English), es-ES (Spanish))
String option = "option_example"; // String | Voice gender selected (ex: FEMALE ou MALE)
String providers = "providers_example"; // String | Provider to compare (ex: [ 'amazon', 'microsoft', 'ibm','google'])
try {
    InlineResponse2011 result = apiInstance.textToSpeech(text, language, option, providers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SpeechApi#textToSpeech");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Text to transform |
 **language** | **String**| Language code expected (ex: fr-FR (French), en-US (English), es-ES (Spanish)) |
 **option** | **String**| Voice gender selected (ex: FEMALE ou MALE) |
 **providers** | **String**| Provider to compare (ex: [ &#39;amazon&#39;, &#39;microsoft&#39;, &#39;ibm&#39;,&#39;google&#39;]) |

### Return type

[**InlineResponse2011**](InlineResponse/InlineResponse2011.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

