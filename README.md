# swagger-java-client

Eden AI API Documentation
- API version: v1
  - Build date: 2022-04-13T08:49:08.469Z

  For more information, please visit [https://www.edenai.co](https://www.edenai.co)

## Requirements

Building the API client library requires:
1. Java 1.7+
2. Maven/Gradle

## Installation

Add those line in the pom.xml inside the dependencies bracket
```
<dependency>
    <groupId>javax.annotation</groupId>
    <artifactId>javax.annotation-api</artifactId>
    <version>1.3.1</version>
</dependency>
```

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>io.swagger</groupId>
  <artifactId>swagger-java-client</artifactId>
  <version>1.1.4</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "io.swagger:swagger-java-client:1.1.4"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/swagger-java-client-1.1.4.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import edenai.*;
import edenai.auth.*;
import io.swagger.client.model.*;
import io.swagger.client.api.AutoMlTextDataApi;

import java.io.File;
import java.util.*;

public class AutoMlTextDataApiExample {

    public static void main(String[] args) {
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
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.edenai.run/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*EdenAiToolsApi* | [**search**](docs/EdenAiToolsApi.md#search) | **POST** /tools/search | 
*OcrApi* | [**ocr**](docs/OcrApi.md#ocr) | **POST** /pretrained/ocr/ocr | 
*OcrApi* | [**ocrInvoice**](docs/OcrApi.md#ocrInvoice) | **POST** /pretrained/ocr/ocr_invoice | 
*PipelinesApi* | [**pipelines**](docs/PipelinesApi.md#pipelines) | **POST** /pipelines | 
*SpeechApi* | [**asyncSpeechToText**](docs/SpeechApi.md#asyncSpeechToText) | **POST** /pretrained/audio/speech_recognition_async | 
*SpeechApi* | [**asyncSpeechToTextJobid**](docs/SpeechApi.md#asyncSpeechToTextJobid) | **GET** /pretrained/audio/speech_recognition_async/{job_id} | 
*SpeechApi* | [**speechToText**](docs/SpeechApi.md#speechToText) | **POST** /pretrained/audio/speech_to_text | 
*SpeechApi* | [**textToSpeech**](docs/SpeechApi.md#textToSpeech) | **POST** /pretrained/audio/text_to_speech | 
*TextApi* | [**keywordExtraction**](docs/TextApi.md#keywordExtraction) | **POST** /pretrained/text/keyword_extraction | 
*TextApi* | [**namedEntityRecognition**](docs/TextApi.md#namedEntityRecognition) | **POST** /pretrained/text/named_entity_recognition | 
*TextApi* | [**sentimentAnalysis**](docs/TextApi.md#sentimentAnalysis) | **POST** /pretrained/text/sentiment_analysis | 
*TextApi* | [**syntaxAnalysis**](docs/TextApi.md#syntaxAnalysis) | **POST** /pretrained/text/syntax_analysis | 
*TranslationApi* | [**automaticTranslation**](docs/TranslationApi.md#automaticTranslation) | **POST** /pretrained/translation/automatic_translation | 
*TranslationApi* | [**languageDetection**](docs/TranslationApi.md#languageDetection) | **POST** /pretrained/translation/language_detection | 
*VisionApi* | [**explicitContentDetection**](docs/VisionApi.md#explicitContentDetection) | **POST** /pretrained/vision/explicit_content_detection | 
*VisionApi* | [**faceDetection**](docs/VisionApi.md#faceDetection) | **POST** /pretrained/vision/face_detection | 
*VisionApi* | [**objectDetection**](docs/VisionApi.md#objectDetection) | **POST** /pretrained/vision/object_detection |

## Documentation for Authorization

Authentication schemes defined for the API:
### Bearer

- **Type**: API key
- **API key parameter name**: Authorization
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author

contact@edenai.co

