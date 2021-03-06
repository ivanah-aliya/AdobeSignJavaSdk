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
 * MegaSignSecurityOption
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:31:25.254+05:30")
public class MegaSignSecurityOption {
  /**
   * The authentication method for the participants to have access to view and sign the document.
   */
  @JsonAdapter(ExternalAuthenticationMethodEnum.Adapter.class)
  public enum ExternalAuthenticationMethodEnum {
    NONE("NONE"),
    
    WEB_IDENTITY("WEB_IDENTITY"),
    
    KBA("KBA"),
    
    PASSWORD("PASSWORD");

    private String value;

    ExternalAuthenticationMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ExternalAuthenticationMethodEnum fromValue(String text) {
      for (ExternalAuthenticationMethodEnum b : ExternalAuthenticationMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<ExternalAuthenticationMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ExternalAuthenticationMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ExternalAuthenticationMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return ExternalAuthenticationMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("externalAuthenticationMethod")
  private ExternalAuthenticationMethodEnum externalAuthenticationMethod = null;

  @SerializedName("externalPassword")
  private String externalPassword = null;

  /**
   * The authentication method for the participants to have access to view and sign the document.
   */
  @JsonAdapter(InternalAuthenticationMethodEnum.Adapter.class)
  public enum InternalAuthenticationMethodEnum {
    NONE("NONE"),
    
    WEB_IDENTITY("WEB_IDENTITY"),
    
    KBA("KBA"),
    
    PASSWORD("PASSWORD");

    private String value;

    InternalAuthenticationMethodEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static InternalAuthenticationMethodEnum fromValue(String text) {
      for (InternalAuthenticationMethodEnum b : InternalAuthenticationMethodEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<InternalAuthenticationMethodEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final InternalAuthenticationMethodEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public InternalAuthenticationMethodEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return InternalAuthenticationMethodEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("internalAuthenticationMethod")
  private InternalAuthenticationMethodEnum internalAuthenticationMethod = null;

  @SerializedName("internalPassword")
  private String internalPassword = null;

  @SerializedName("openPassword")
  private String openPassword = null;

  public MegaSignSecurityOption externalAuthenticationMethod(ExternalAuthenticationMethodEnum externalAuthenticationMethod) {
    this.externalAuthenticationMethod = externalAuthenticationMethod;
    return this;
  }

   /**
   * The authentication method for the participants to have access to view and sign the document.
   * @return externalAuthenticationMethod
  **/
  @ApiModelProperty(value = "The authentication method for the participants to have access to view and sign the document.")
  public ExternalAuthenticationMethodEnum getExternalAuthenticationMethod() {
    return externalAuthenticationMethod;
  }

  public void setExternalAuthenticationMethod(ExternalAuthenticationMethodEnum externalAuthenticationMethod) {
    this.externalAuthenticationMethod = externalAuthenticationMethod;
  }

  public MegaSignSecurityOption externalPassword(String externalPassword) {
    this.externalPassword = externalPassword;
    return this;
  }

   /**
   * The secondary password that will be used to protect signing the document for internal signers. Note that Adobe Sign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. This password is applied only if password protection is specified for internal signers or all signers
   * @return externalPassword
  **/
  @ApiModelProperty(value = "The secondary password that will be used to protect signing the document for internal signers. Note that Adobe Sign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. This password is applied only if password protection is specified for internal signers or all signers")
  public String getExternalPassword() {
    return externalPassword;
  }

  public void setExternalPassword(String externalPassword) {
    this.externalPassword = externalPassword;
  }

  public MegaSignSecurityOption internalAuthenticationMethod(InternalAuthenticationMethodEnum internalAuthenticationMethod) {
    this.internalAuthenticationMethod = internalAuthenticationMethod;
    return this;
  }

   /**
   * The authentication method for the participants to have access to view and sign the document.
   * @return internalAuthenticationMethod
  **/
  @ApiModelProperty(value = "The authentication method for the participants to have access to view and sign the document.")
  public InternalAuthenticationMethodEnum getInternalAuthenticationMethod() {
    return internalAuthenticationMethod;
  }

  public void setInternalAuthenticationMethod(InternalAuthenticationMethodEnum internalAuthenticationMethod) {
    this.internalAuthenticationMethod = internalAuthenticationMethod;
  }

  public MegaSignSecurityOption internalPassword(String internalPassword) {
    this.internalPassword = internalPassword;
    return this;
  }

   /**
   * The secondary password that will be used to protect signing the document for external signers. Note that Adobe Sign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. This password is applied only if password protection is specified for external signers or all signers
   * @return internalPassword
  **/
  @ApiModelProperty(value = "The secondary password that will be used to protect signing the document for external signers. Note that Adobe Sign will never show this password to anyone, so you will need to separately communicate it to any relevant parties. This password is applied only if password protection is specified for external signers or all signers")
  public String getInternalPassword() {
    return internalPassword;
  }

  public void setInternalPassword(String internalPassword) {
    this.internalPassword = internalPassword;
  }

  public MegaSignSecurityOption openPassword(String openPassword) {
    this.openPassword = openPassword;
    return this;
  }

   /**
   * The secondary password that will be used to secure the PDF document. Note that AdobeSign will never show this password to anyone, so you will need to separately communicate it to any relevant parties
   * @return openPassword
  **/
  @ApiModelProperty(value = "The secondary password that will be used to secure the PDF document. Note that AdobeSign will never show this password to anyone, so you will need to separately communicate it to any relevant parties")
  public String getOpenPassword() {
    return openPassword;
  }

  public void setOpenPassword(String openPassword) {
    this.openPassword = openPassword;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MegaSignSecurityOption megaSignSecurityOption = (MegaSignSecurityOption) o;
    return Objects.equals(this.externalAuthenticationMethod, megaSignSecurityOption.externalAuthenticationMethod) &&
        Objects.equals(this.externalPassword, megaSignSecurityOption.externalPassword) &&
        Objects.equals(this.internalAuthenticationMethod, megaSignSecurityOption.internalAuthenticationMethod) &&
        Objects.equals(this.internalPassword, megaSignSecurityOption.internalPassword) &&
        Objects.equals(this.openPassword, megaSignSecurityOption.openPassword);
  }

  @Override
  public int hashCode() {
    return Objects.hash(externalAuthenticationMethod, externalPassword, internalAuthenticationMethod, internalPassword, openPassword);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MegaSignSecurityOption {\n");
    
    sb.append("    externalAuthenticationMethod: ").append(toIndentedString(externalAuthenticationMethod)).append("\n");
    sb.append("    externalPassword: ").append(toIndentedString(externalPassword)).append("\n");
    sb.append("    internalAuthenticationMethod: ").append(toIndentedString(internalAuthenticationMethod)).append("\n");
    sb.append("    internalPassword: ").append(toIndentedString(internalPassword)).append("\n");
    sb.append("    openPassword: ").append(toIndentedString(openPassword)).append("\n");
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

