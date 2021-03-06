/*
 * 
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 6.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * WebhookWidgetEvents
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:31:42.944+05:30")
public class WebhookWidgetEvents {
  @SerializedName("includeDetailedInfo")
  private Boolean includeDetailedInfo = null;

  @SerializedName("includeDocumentsInfo")
  private Boolean includeDocumentsInfo = null;

  @SerializedName("includeParticipantsInfo")
  private Boolean includeParticipantsInfo = null;

  public WebhookWidgetEvents includeDetailedInfo(Boolean includeDetailedInfo) {
    this.includeDetailedInfo = includeDetailedInfo;
    return this;
  }

   /**
   * Determines whether agreement detailed info will be returned in the response payload
   * @return includeDetailedInfo
  **/
  @ApiModelProperty(value = "Determines whether agreement detailed info will be returned in the response payload")
  public Boolean isIncludeDetailedInfo() {
    return includeDetailedInfo;
  }

  public void setIncludeDetailedInfo(Boolean includeDetailedInfo) {
    this.includeDetailedInfo = includeDetailedInfo;
  }

  public WebhookWidgetEvents includeDocumentsInfo(Boolean includeDocumentsInfo) {
    this.includeDocumentsInfo = includeDocumentsInfo;
    return this;
  }

   /**
   * Determines whether document info will be returned in the response payload
   * @return includeDocumentsInfo
  **/
  @ApiModelProperty(value = "Determines whether document info will be returned in the response payload")
  public Boolean isIncludeDocumentsInfo() {
    return includeDocumentsInfo;
  }

  public void setIncludeDocumentsInfo(Boolean includeDocumentsInfo) {
    this.includeDocumentsInfo = includeDocumentsInfo;
  }

  public WebhookWidgetEvents includeParticipantsInfo(Boolean includeParticipantsInfo) {
    this.includeParticipantsInfo = includeParticipantsInfo;
    return this;
  }

   /**
   * Determines whether participants info will be returned in the response payload
   * @return includeParticipantsInfo
  **/
  @ApiModelProperty(value = "Determines whether participants info will be returned in the response payload")
  public Boolean isIncludeParticipantsInfo() {
    return includeParticipantsInfo;
  }

  public void setIncludeParticipantsInfo(Boolean includeParticipantsInfo) {
    this.includeParticipantsInfo = includeParticipantsInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    WebhookWidgetEvents webhookWidgetEvents = (WebhookWidgetEvents) o;
    return Objects.equals(this.includeDetailedInfo, webhookWidgetEvents.includeDetailedInfo) &&
        Objects.equals(this.includeDocumentsInfo, webhookWidgetEvents.includeDocumentsInfo) &&
        Objects.equals(this.includeParticipantsInfo, webhookWidgetEvents.includeParticipantsInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(includeDetailedInfo, includeDocumentsInfo, includeParticipantsInfo);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WebhookWidgetEvents {\n");
    
    sb.append("    includeDetailedInfo: ").append(toIndentedString(includeDetailedInfo)).append("\n");
    sb.append("    includeDocumentsInfo: ").append(toIndentedString(includeDocumentsInfo)).append("\n");
    sb.append("    includeParticipantsInfo: ").append(toIndentedString(includeParticipantsInfo)).append("\n");
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

