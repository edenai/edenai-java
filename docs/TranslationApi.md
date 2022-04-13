# TranslationApi

All URIs are relative to *https://api.edenai.run/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**automaticTranslation**](TranslationApi.md#automaticTranslation) | **POST** /pretrained/translation/automatic_translation | 
[**languageDetection**](TranslationApi.md#languageDetection) | **POST** /pretrained/translation/language_detection | 


<a name="automaticTranslation"></a>
# **automaticTranslation**
> InlineResponse2009 automaticTranslation(text, sourceLanguage, targetLanguage, providers)



Machine translation refers to the translation of a text into another language using rules, statics or ml technics.  **SUPPORTED LANGUAGE**  |Name|Type|Value| |----|----|-----| |**Afrikaans**|&#x60;string&#x60;|&#x60;af-AF&#x60;| |**Albanian**|&#x60;string&#x60;|&#x60;sq-SQ&#x60;| |**Amharic**|&#x60;string&#x60;|&#x60;am-AM&#x60;| |**Arabic**|&#x60;string&#x60;|&#x60;ar-XA&#x60;| |**Armenian**|&#x60;string&#x60;|&#x60;hy-HY&#x60;| |**Azerbaijani**|&#x60;string&#x60;|&#x60;az-AZ&#x60;| |**Basque**|&#x60;string&#x60;|&#x60;eu-BA&#x60;| |**Belarusian**|&#x60;string&#x60;|&#x60;be-BE&#x60;| |**Bengali**|&#x60;string&#x60;|&#x60;bn-BN&#x60;| |**Bosnian**|&#x60;string&#x60;|&#x60;bs-BS&#x60;| |**Bulgarian**|&#x60;string&#x60;|&#x60;bg-BG&#x60;| |**Catalan**|&#x60;string&#x60;|&#x60;ca-ES&#x60;| |**Cebuano**|&#x60;string&#x60;|&#x60;ceb-CB&#x60;| |**Chinese-Simplified**|&#x60;string&#x60;|&#x60;zh-CN&#x60;| |**Chinese-Traditional**|&#x60;string&#x60;|&#x60;zh-TW&#x60;| |**Corsican**|&#x60;string&#x60;|&#x60;co-CO&#x60;| |**Croatian**|&#x60;string&#x60;|&#x60;hr-HR&#x60;| |**Czech**|&#x60;string&#x60;|&#x60;cz-CZ&#x60;| |**Danish**|&#x60;string&#x60;|&#x60;da-DK&#x60;| |**Dutch**|&#x60;string&#x60;|&#x60;nl-NL&#x60;| |**English**|&#x60;string&#x60;|&#x60;en-US&#x60;| |**Esperanto**|&#x60;string&#x60;|&#x60;eo-EO&#x60;| |**Estonian**|&#x60;string&#x60;|&#x60;et-ET&#x60;| |**Finnish**|&#x60;string&#x60;|&#x60;fn-FN&#x60;| |**French**|&#x60;string&#x60;|&#x60;fr-FR&#x60;| |**French-Canadian**|&#x60;string&#x60;|&#x60;fr-CA&#x60;| |**Frisian**|&#x60;string&#x60;|&#x60;fy-FY&#x60;| |**Galician**|&#x60;string&#x60;|&#x60;gl-GL&#x60;| |**Georgian**|&#x60;string&#x60;|&#x60;ka-KA&#x60;| |**German**|&#x60;string&#x60;|&#x60;de-DE&#x60;| |**Greek**|&#x60;string&#x60;|&#x60;gr-GR&#x60;| |**Gujarati**|&#x60;string&#x60;|&#x60;gu-GU&#x60;| |**Haitian-Creole**|&#x60;string&#x60;|&#x60;ht-HT&#x60;| |**Hausa**|&#x60;string&#x60;|&#x60;ha-HA&#x60;| |**Hawaiian**|&#x60;string&#x60;|&#x60;haw-HA&#x60;| |**Hebrew**|&#x60;string&#x60;|&#x60;he-HE&#x60;| |**Hindi**|&#x60;string&#x60;|&#x60;hi-HI&#x60;| |**Hmong**|&#x60;string&#x60;|&#x60;hmn_HM&#x60;| |**Hungarian**|&#x60;string&#x60;|&#x60;hu-HU&#x60;| |**Icelandic**|&#x60;string&#x60;|&#x60;is-IS&#x60;| |**Igbo**|&#x60;string&#x60;|&#x60;ig-IG&#x60;| |**Indonesian**|&#x60;string&#x60;|&#x60;id-ID&#x60;| |**Irish**|&#x60;string&#x60;|&#x60;ga-IR&#x60;| |**Italian**|&#x60;string&#x60;|&#x60;it-IT&#x60;| |**Japanese**|&#x60;string&#x60;|&#x60;ja-JP&#x60;| |**Javanese**|&#x60;string&#x60;|&#x60;jv-JV&#x60;| |**Kannada**|&#x60;string&#x60;|&#x60;kn-KN&#x60;| |**Kazakh**|&#x60;string&#x60;|&#x60;kk-KK&#x60;| |**Khmer**|&#x60;string&#x60;|&#x60;km-KM&#x60;| |**Korean**|&#x60;string&#x60;|&#x60;ko-KR&#x60;| |**Kurdish**|&#x60;string&#x60;|&#x60;ku-KU&#x60;| |**Kyrgyz**|&#x60;string&#x60;|&#x60;ky-KY&#x60;| |**Lao**|&#x60;string&#x60;|&#x60;lo-LO&#x60;| |**Latin**|&#x60;string&#x60;|&#x60;la-LA&#x60;| |**Latvian**|&#x60;string&#x60;|&#x60;lv-LV&#x60;| |**Lithuanian**|&#x60;string&#x60;|&#x60;lt-LT&#x60;| |**Luxembourgish**|&#x60;string&#x60;|&#x60;lb-LB&#x60;| |**Macedonian**|&#x60;string&#x60;|&#x60;mk-MK&#x60;| |**Malagasy**|&#x60;string&#x60;|&#x60;mg-MG&#x60;| |**Malay**|&#x60;string&#x60;|&#x60;ms-MY&#x60;| |**Malayalam**|&#x60;string&#x60;|&#x60;ml-ML&#x60;| |**Maltese**|&#x60;string&#x60;|&#x60;mt-MT&#x60;| |**Maori**|&#x60;string&#x60;|&#x60;mi-MI&#x60;| |**Marathi**|&#x60;string&#x60;|&#x60;mr-MR&#x60;| |**Mongolian**|&#x60;string&#x60;|&#x60;mn-MN&#x60;| |**Myanmar-Burmese**|&#x60;string&#x60;|&#x60;my-MY&#x60;| |**Nepali**|&#x60;string&#x60;|&#x60;ne-NE&#x60;| |**Norwegian**|&#x60;string&#x60;|&#x60;no-NO&#x60;| |**Nyanja Chichewa**|&#x60;string&#x60;|&#x60;ny-NY&#x60;| |**Pashto**|&#x60;string&#x60;|&#x60;ps-PS&#x60;| |**Persian**|&#x60;string&#x60;|&#x60;fa-FA&#x60;| |**Polish**|&#x60;string&#x60;|&#x60;pl-PO&#x60;| |**Portuguese**|&#x60;string&#x60;|&#x60;pt-PT&#x60;| |**Punjabi**|&#x60;string&#x60;|&#x60;pa-PA&#x60;| |**Romanian**|&#x60;string&#x60;|&#x60;ro-RO&#x60;| |**Russian**|&#x60;string&#x60;|&#x60;ru-RU&#x60;| |**Samoan**|&#x60;string&#x60;|&#x60;sm-SM&#x60;| |**Scots Gaelic**|&#x60;string&#x60;|&#x60;gd-GD&#x60;| |**Serbian**|&#x60;string&#x60;|&#x60;sr-SR&#x60;| |**Sesotho**|&#x60;string&#x60;|&#x60;st-ST&#x60;| |**Shona**|&#x60;string&#x60;|&#x60;sn-SN&#x60;| |**Sindhi**|&#x60;string&#x60;|&#x60;sd-SD&#x60;| |**Sinhala-Sinhalese**|&#x60;string&#x60;|&#x60;si-SI&#x60;| |**Slovak**|&#x60;string&#x60;|&#x60;sk-SK&#x60;| |**Slovenian**|&#x60;string&#x60;|&#x60;sl-SL&#x60;| |**Somali**|&#x60;string&#x60;|&#x60;so-SO&#x60;| |**Spanish**|&#x60;string&#x60;|&#x60;es-ES&#x60;| |**Sundanese**|&#x60;string&#x60;|&#x60;su-SU&#x60;| |**Swahili**|&#x60;string&#x60;|&#x60;sh-SH&#x60;| |**Swedish**|&#x60;string&#x60;|&#x60;sw-SW&#x60;| |**Tagalog-Filipino**|&#x60;string&#x60;|&#x60;tl-TL&#x60;| |**Tajik**|&#x60;string&#x60;|&#x60;tg-TG&#x60;| |**Tamil**|&#x60;string&#x60;|&#x60;ta-TA&#x60;| |**Telugu**|&#x60;string&#x60;|&#x60;te-TE&#x60;| |**Thai**|&#x60;string&#x60;|&#x60;th-TH&#x60;| |**Turkish**|&#x60;string&#x60;|&#x60;tr-TR&#x60;| |**Ukrainian**|&#x60;string&#x60;|&#x60;uk-UK&#x60;| |**Urdu**|&#x60;string&#x60;|&#x60;ur-UR&#x60;| |**Uzbek**|&#x60;string&#x60;|&#x60;uz-UZ&#x60;| |**Vietnamese**|&#x60;string&#x60;|&#x60;vi-VI&#x60;| |**Welsh**|&#x60;string&#x60;|&#x60;cy-CY&#x60;| |**Xhosa**|&#x60;string&#x60;|&#x60;xh-XH&#x60;| |**Yiddish**|&#x60;string&#x60;|&#x60;yi-YI&#x60;| |**Yoruba**|&#x60;string&#x60;|&#x60;yo-YO&#x60;|  **AVAILABLE PROVIDERS**   |Name|Value|Version| |----|-----|-------| |**Microsoft Azure**|&#x60;microsoft&#x60;| &#x60;v3.0&#x60;  |**Amazon Web Services**|&#x60;amazon&#x60;| &#x60;boto3 (v1.15.18)&#x60;  |**Google Cloud**|&#x60;google&#x60;| &#x60;v3&#x60; 

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.TranslationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

TranslationApi apiInstance = new TranslationApi();
String text = "text_example"; // String | Text to translate
String sourceLanguage = "sourceLanguage_example"; // String | Language code of text (ex: fr (French), en (English), es (Spanish))
String targetLanguage = "targetLanguage_example"; // String | Language code of text (ex: fr (French), en (English), es (Spanish))
String providers = "providers_example"; // String | Provider to compare (ex: [ 'amazon', 'microsoft', 'ibm', 'google'])
try {
    InlineResponse2009 result = apiInstance.automaticTranslation(text, sourceLanguage, targetLanguage, providers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranslationApi#automaticTranslation");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Text to translate |
 **sourceLanguage** | **String**| Language code of text (ex: fr (French), en (English), es (Spanish)) |
 **targetLanguage** | **String**| Language code of text (ex: fr (French), en (English), es (Spanish)) |
 **providers** | **String**| Provider to compare (ex: [ &#39;amazon&#39;, &#39;microsoft&#39;, &#39;ibm&#39;, &#39;google&#39;]) |

### Return type

[**InlineResponse2009**](InlineResponse/InlineResponse2009.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

<a name="languageDetection"></a>
# **languageDetection**
> InlineResponse20010 languageDetection(text, providers)



Language Detection or language guessing is the algorithm of determining which natural language given content is in.  **AVAILABLE PROVIDERS**   |Name|Value|Version| |----|-----|-------| |**Microsoft Azure**|&#x60;microsoft&#x60;| &#x60;v3.1&#x60;  |**Amazon Web Services**|&#x60;amazon&#x60;| &#x60;boto3 (v1.15.18)&#x60;  |**Google Cloud**|&#x60;google&#x60;| &#x60;v1&#x60; 

### Example
```java
// Import classes:
//import edenai.ApiClient;
//import edenai.ApiException;
//import edenai.Configuration;
//import edenai.auth.*;
//import io.swagger.client.api.TranslationApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Bearer
ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
Bearer.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Bearer.setApiKeyPrefix("Token");

TranslationApi apiInstance = new TranslationApi();
String text = "text_example"; // String | Text to analyze
String providers = "providers_example"; // String | Provider to compare (ex: [ 'amazon', 'microsoft', 'ibm','google'])
try {
    InlineResponse20010 result = apiInstance.languageDetection(text, providers);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling TranslationApi#languageDetection");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **text** | **String**| Text to analyze |
 **providers** | **String**| Provider to compare (ex: [ &#39;amazon&#39;, &#39;microsoft&#39;, &#39;ibm&#39;,&#39;google&#39;]) |

### Return type

[**InlineResponse20010**](InlineResponse/InlineResponse20010.md)

### Authorization

[Bearer](../README.md#Bearer)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

