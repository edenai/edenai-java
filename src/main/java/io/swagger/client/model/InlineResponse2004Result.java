/*
 * Eden AI API Documentation
 * <a href=\"https://app.edenai.run/user/login\" target=\"_blank\"><img src=\"/static/images/welcome.png\"></a>. # Welcome  Eden AI simplifies the use and integration of AI technologies by providing a unique API connected to the best AI engines and combined with a powerful management platform. The platform covers a wide range of AI technologies: * Vision:  <a href=\"https://www.edenai.co/vision\" target=\"_blank\">www.edenai.co/vision</a>. * Text & NLP: <a href=\"https://www.edenai.co/text\" target=\"_blank\">www.edenai.co/text</a>. * Speech & Audio: <a href=\"https://www.edenai.co/speech\" target=\"_blank\">www.edenai.co/speech</a>. * OCR: <a href=\"https://www.edenai.co/ocr\" target=\"_blank\">www.edenai.co/ocr</a>. * Machine Translation: <a href=\"https://www.edenai.co/translation\" target=\"_blank\">www.edenai.co/translation</a>. * Prediction: <a href=\"https://www.edenai.co/prediction\" target=\"_blank\">www.edenai.co/prediction</a>.  For all the proposed technologies, we provide a single endpoint:  the service provider is only a parameter that can be changed very easily. All the engines available on Eden AI are listed here: www.edenai.co/catalog  # Support & community  ### 1- Support If you have any problems, please contact us at this email address: contact@edenai.co. We will be happy to help you in the use of Eden AI.   ### 2- Community  You can interact personally with other people actively using and working with Eden AI and join our  <a href=\"https://join.slack.com/t/edenai/shared_invite/zt-t68c2pr9-4lDKQ_qEqmLiWNptQzB_6w\" target=\"_blank\">Slack community</a>.  We are always updating our docs, so a good way to always stay up to date is to watch our documentation repo on Github: <a href=\"https://github.com/edenai\" target=\"_blank\">https://github.com/edenai</a>.  ### 3- Blog  We also regularly publish various articles with Eden AI news and technical articles on the different AI engines that exist. You can find these articles here: <a href=\"https://www.edenai.co/blog\" target=\"_blank\">https://www.edenai.co/blog</a>.   # Authentication  ## Create account ![Register](/static/images/register.png)  To create an account, please go to this link: <a href=\"https://app.edenai.run/user/login\" target=\"_blank\">app.edenai.run/user/login</a>. You can create an account with your email address or by using your account on available platforms (Gmail, Github, etc.).   By creating an account with your email address, you will receive a confirmation email with a link to click. Check your spam if needed and contact us if you have any problem: contact@edenai.co  ![Login](/static/images/login.png) ## API key  By going to your account page on the platform: <a href=\"https://app.edenai.run/admin/account\" target=\"_blank\">https://app.edenai.run/admin/account</a>, you will have access to your API key to start using the different AI engines offered by Eden AI.   ![api_key](/static/images/api_key.png)  ## Sandbox API key  By going to your account page on the platform: <a href=\"https://app.edenai.run/admin/account\" target=\"_blank\">https://app.edenai.run/admin/account</a>, you will also have access to your **Sandbox** API key that will allow you to make free calls and get dummy responses in order to implement and debug Eden AI without consuming credits.   ![api_key](/static/images/sandbox_api_key.png)  # Portal Guide  Eden AI provides a web portal that allows you to do several tasks:  ![portal](/static/images/portal.png)  ### 1- Benchmark and test The platform allows you to easily compare competing engines without having to code. By uploading your data, you have access to the prediction results of the different engines. This gives you a first overview of the performance of AI engines.   ![benchmark](/static/images/benchmark.png)  ### 2- Cost management The <a href=\"https://app.edenai.run/admin/cost-management\" target=\"_blank\">cost management page</a> also allows you to centralize the costs associated with the different engines with various filters to simplify the analysis.   This page also allows you to define monthly budget limits not to be exceeded to secure the use of different AI engines.   ![cost-management](/static/images/cost_management.png) ### 3- Account The <a href=\"https://app.edenai.run/admin/account\" target=\"_blank\">account page</a> allows you to change your information and password. It also gives you access to your API key that you can renew if needed.   This page also allows you to add a credit card and to buy with credits to use all the engines offered by Eden AI.   ![account](/static/images/account.png)   # API Guide  Eden AI API has different endpoints that refer to different AI services. The connected providers are thus parameters that the user can easily change. 
 *
 * OpenAPI spec version: v1
 * Contact: contact@edenai.co
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.InlineResponse2004CustomerInformation;
import io.swagger.client.model.InlineResponse2004ItemLines;
import io.swagger.client.model.InlineResponse2004Locale;
import io.swagger.client.model.InlineResponse2004MerchantInformation;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2004Result
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2022-04-13T08:49:08.469Z")
public class InlineResponse2004Result {
  @SerializedName("customer_information")
  private InlineResponse2004CustomerInformation customerInformation = null;

  @SerializedName("merchant_information")
  private InlineResponse2004MerchantInformation merchantInformation = null;

  @SerializedName("invoice_total")
  private String invoiceTotal = null;

  @SerializedName("subtotal")
  private String subtotal = null;

  @SerializedName("date")
  private String date = null;

  @SerializedName("due_date")
  private String dueDate = null;

  @SerializedName("invoice_number")
  private String invoiceNumber = null;

  @SerializedName("taxes")
  private Object taxes = null;

  @SerializedName("locale")
  private InlineResponse2004Locale locale = null;

  @SerializedName("item_lines")
  private List<InlineResponse2004ItemLines> itemLines = null;

  public InlineResponse2004Result customerInformation(InlineResponse2004CustomerInformation customerInformation) {
    this.customerInformation = customerInformation;
    return this;
  }

   /**
   * Get customerInformation
   * @return customerInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2004CustomerInformation getCustomerInformation() {
    return customerInformation;
  }

  public void setCustomerInformation(InlineResponse2004CustomerInformation customerInformation) {
    this.customerInformation = customerInformation;
  }

  public InlineResponse2004Result merchantInformation(InlineResponse2004MerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
    return this;
  }

   /**
   * Get merchantInformation
   * @return merchantInformation
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2004MerchantInformation getMerchantInformation() {
    return merchantInformation;
  }

  public void setMerchantInformation(InlineResponse2004MerchantInformation merchantInformation) {
    this.merchantInformation = merchantInformation;
  }

  public InlineResponse2004Result invoiceTotal(String invoiceTotal) {
    this.invoiceTotal = invoiceTotal;
    return this;
  }

   /**
   * Get invoiceTotal
   * @return invoiceTotal
  **/
  @ApiModelProperty(value = "")
  public String getInvoiceTotal() {
    return invoiceTotal;
  }

  public void setInvoiceTotal(String invoiceTotal) {
    this.invoiceTotal = invoiceTotal;
  }

  public InlineResponse2004Result subtotal(String subtotal) {
    this.subtotal = subtotal;
    return this;
  }

   /**
   * Get subtotal
   * @return subtotal
  **/
  @ApiModelProperty(value = "")
  public String getSubtotal() {
    return subtotal;
  }

  public void setSubtotal(String subtotal) {
    this.subtotal = subtotal;
  }

  public InlineResponse2004Result date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  @ApiModelProperty(value = "")
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public InlineResponse2004Result dueDate(String dueDate) {
    this.dueDate = dueDate;
    return this;
  }

   /**
   * Get dueDate
   * @return dueDate
  **/
  @ApiModelProperty(value = "")
  public String getDueDate() {
    return dueDate;
  }

  public void setDueDate(String dueDate) {
    this.dueDate = dueDate;
  }

  public InlineResponse2004Result invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Get invoiceNumber
   * @return invoiceNumber
  **/
  @ApiModelProperty(value = "")
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public InlineResponse2004Result taxes(Object taxes) {
    this.taxes = taxes;
    return this;
  }

   /**
   * Get taxes
   * @return taxes
  **/
  @ApiModelProperty(value = "")
  public Object getTaxes() {
    return taxes;
  }

  public void setTaxes(Object taxes) {
    this.taxes = taxes;
  }

  public InlineResponse2004Result locale(InlineResponse2004Locale locale) {
    this.locale = locale;
    return this;
  }

   /**
   * Get locale
   * @return locale
  **/
  @ApiModelProperty(value = "")
  public InlineResponse2004Locale getLocale() {
    return locale;
  }

  public void setLocale(InlineResponse2004Locale locale) {
    this.locale = locale;
  }

  public InlineResponse2004Result itemLines(List<InlineResponse2004ItemLines> itemLines) {
    this.itemLines = itemLines;
    return this;
  }

  public InlineResponse2004Result addItemLinesItem(InlineResponse2004ItemLines itemLinesItem) {
    if (this.itemLines == null) {
      this.itemLines = new ArrayList<InlineResponse2004ItemLines>();
    }
    this.itemLines.add(itemLinesItem);
    return this;
  }

   /**
   * Get itemLines
   * @return itemLines
  **/
  @ApiModelProperty(value = "")
  public List<InlineResponse2004ItemLines> getItemLines() {
    return itemLines;
  }

  public void setItemLines(List<InlineResponse2004ItemLines> itemLines) {
    this.itemLines = itemLines;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2004Result inlineResponse2004Result = (InlineResponse2004Result) o;
    return Objects.equals(this.customerInformation, inlineResponse2004Result.customerInformation) &&
        Objects.equals(this.merchantInformation, inlineResponse2004Result.merchantInformation) &&
        Objects.equals(this.invoiceTotal, inlineResponse2004Result.invoiceTotal) &&
        Objects.equals(this.subtotal, inlineResponse2004Result.subtotal) &&
        Objects.equals(this.date, inlineResponse2004Result.date) &&
        Objects.equals(this.dueDate, inlineResponse2004Result.dueDate) &&
        Objects.equals(this.invoiceNumber, inlineResponse2004Result.invoiceNumber) &&
        Objects.equals(this.taxes, inlineResponse2004Result.taxes) &&
        Objects.equals(this.locale, inlineResponse2004Result.locale) &&
        Objects.equals(this.itemLines, inlineResponse2004Result.itemLines);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerInformation, merchantInformation, invoiceTotal, subtotal, date, dueDate, invoiceNumber, taxes, locale, itemLines);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2004Result {\n");
    
    sb.append("    customerInformation: ").append(toIndentedString(customerInformation)).append("\n");
    sb.append("    merchantInformation: ").append(toIndentedString(merchantInformation)).append("\n");
    sb.append("    invoiceTotal: ").append(toIndentedString(invoiceTotal)).append("\n");
    sb.append("    subtotal: ").append(toIndentedString(subtotal)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    dueDate: ").append(toIndentedString(dueDate)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    taxes: ").append(toIndentedString(taxes)).append("\n");
    sb.append("    locale: ").append(toIndentedString(locale)).append("\n");
    sb.append("    itemLines: ").append(toIndentedString(itemLines)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

