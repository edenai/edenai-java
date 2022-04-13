# OcrApi

All URIs are relative to *https://api.edenai.run/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**ocr**](OcrApi.md#ocr) | **POST** /pretrained/ocr/ocr | 
[**ocrInvoice**](OcrApi.md#ocrInvoice) | **POST** /pretrained/ocr/ocr_invoice | 


<a name="ocr"></a>
# **ocr**
> InlineResponse2003 ocr(files, providers, language)



Optical Character Recognition or optical character reader (OCR) is the electronic or mechanical conversion of images of typed, handwritten or printed text into machine-encoded text, whether from a scanned document, a photo of a document  **SUPPORTED LANGUAGE**  |Name|Type|Value| |----|----|-----| |**Arabic**|&#x60;string&#x60;|&#x60;ar-XA&#x60;| |**Chinese - Simplified**|&#x60;string&#x60;|&#x60;zh-CN&#x60;| |**Chinese - Traditional**|&#x60;string&#x60;|&#x60;zh-TW&#x60;| |**Czech**|&#x60;string&#x60;|&#x60;cz-CZ&#x60;| |**Danish**|&#x60;string&#x60;|&#x60;da-DK&#x60;| |**Dutch**|&#x60;string&#x60;|&#x60;nl-NL&#x60;| |**English**|&#x60;string&#x60;|&#x60;en-US&#x60;| |**Finnish**|&#x60;string&#x60;|&#x60;fn-FN&#x60;| |**French**|&#x60;string&#x60;|&#x60;fr-FR&#x60;| |**German**|&#x60;string&#x60;|&#x60;de-DE&#x60;| |**Greek**|&#x60;string&#x60;|&#x60;gr-GR&#x60;| |**Hungarian**|&#x60;string&#x60;|&#x60;hu-HU&#x60;| |**Italian**|&#x60;string&#x60;|&#x60;it-IT&#x60;| |**Japanese**|&#x60;string&#x60;|&#x60;ja-JP&#x60;| |**Korean**|&#x60;string&#x60;|&#x60;ko-KR&#x60;| |**Polish**|&#x60;string&#x60;|&#x60;pl-PO&#x60;| |**Portuguese**|&#x60;string&#x60;|&#x60;pt-PT&#x60;| |**Russian**|&#x60;string&#x60;|&#x60;ru-RU&#x60;| |**Swedish**|&#x60;string&#x60;|&#x60;sw-SW&#x60;| |**Spanish**|&#x60;string&#x60;|&#x60;es-ES&#x60;| |**Turkish**|&#x60;string&#x60;|&#x60;tr-TR&#x60;|  **AVAILABLE PROVIDERS**   |Name|Value|Version| |----|-----|-------| |**Google Cloud**|&#x60;google&#x60;| &#x60;v1&#x60;  |**Microsoft Azure**|&#x60;microsoft&#x60;| &#x60;v3.2&#x60;  |**Amazon Web Services**|&#x60;amazon&#x60;| &#x60;boto3 (v1.15.18)&#x60;  |**Clarifai**|&#x60;clarifai&#x60;| &#x60;8.0.0&#x60;  |**Base64**|&#x60;base64&#x60;| &#x60;latest&#x60;  |**Tesseract**|&#x60;tesseract&#x60;| &#x60;latest&#x60; 

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.OcrApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

OcrApi apiInstance = new OcrApi();
File files = new File("/path/to/file.txt"); // File | File to analyse (ex: pdf, jpg, jpeg, png, tiff)
String providers = "providers_example"; // String | Providers to compare (ex: [ 'amazon', 'microsoft', 'ibm', 'google'])
String language = "language_example"; // String | Language code expected (ex: fr-FR)
try {
    InlineResponse2003 result = apiInstance.ocr(files, providers, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OcrApi#ocr");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **files** | **File**| File to analyse (ex: pdf, jpg, jpeg, png, tiff) |
 **providers** | **String**| Providers to compare (ex: [ &#39;amazon&#39;, &#39;microsoft&#39;, &#39;ibm&#39;, &#39;google&#39;]) |
 **language** | **String**| Language code expected (ex: fr-FR) |

### Return type

[**InlineResponse2003**](InlineResponse/InlineResponse2003.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

<a name="ocrInvoice"></a>
# **ocrInvoice**
> InlineResponse2004 ocrInvoice(files, providers, language)



The OCR Invoice API enables customers to take invoices in a variety of formats and return structured data to automate the invoice processing.  **SUPPORTED LANGUAGE**  |Name|Type|Value| |----|----|-----| |**English(US)**|&#x60;string&#x60;|&#x60;en-US&#x60;| |**French**|&#x60;string&#x60;|&#x60;fr-FR&#x60;| |**Spanish**|&#x60;string&#x60;|&#x60;es-ES&#x60;|  **AVAILABLE PROVIDERS**   |Name|Value|Version| |----|-----|-------| |**Mindee**|&#x60;mindee&#x60;| &#x60;v2&#x60;  |**Base64**|&#x60;base64&#x60;| &#x60;latest&#x60;  |**Dataleon**|&#x60;dataleon&#x60;| &#x60;v3.1.0&#x60;  |**Microsoft Azure**|&#x60;microsoft&#x60;| &#x60;v2.1-preview.3&#x60; 

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.OcrApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

OcrApi apiInstance = new OcrApi();
File files = new File("/path/to/file.txt"); // File | File Image to analyse (ex: pdf, jpg, jpeg, png)
String providers = "providers_example"; // String | Provider to compare (ex: [ 'mindee', 'microsoft'])
String language = "language_example"; // String | Language code of invoice (ex: fr-FR (French), en-US (English), es-ES (Spanish))
try {
    InlineResponse2004 result = apiInstance.ocrInvoice(files, providers, language);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling OcrApi#ocrInvoice");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **files** | **File**| File Image to analyse (ex: pdf, jpg, jpeg, png) |
 **providers** | **String**| Provider to compare (ex: [ &#39;mindee&#39;, &#39;microsoft&#39;]) |
 **language** | **String**| Language code of invoice (ex: fr-FR (French), en-US (English), es-ES (Spanish)) |

### Return type

[**InlineResponse2004**](InlineResponse/InlineResponse2004.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: application/json

