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
import java.util.Date;

/**
 * UserView
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:31:37.495+05:30")
public class UserView {
  @SerializedName("embeddedCode")
  private String embeddedCode = null;

  @SerializedName("expiration")
  private Date expiration = null;

  /**
   * Name of the requested user view
   */
  @JsonAdapter(NameEnum.Adapter.class)
  public enum NameEnum {
    MANAGE("MANAGE"),
    
    ACCOUNT_SETTINGS("ACCOUNT_SETTINGS"),
    
    USER_PROFILE("USER_PROFILE"),
    
    ALL("ALL");

    private String value;

    NameEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static NameEnum fromValue(String text) {
      for (NameEnum b : NameEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<NameEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final NameEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public NameEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return NameEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("name")
  private NameEnum name = null;

  @SerializedName("url")
  private String url = null;

  public UserView embeddedCode(String embeddedCode) {
    this.embeddedCode = embeddedCode;
    return this;
  }

   /**
   * Embedded code of url of resource 
   * @return embeddedCode
  **/
  @ApiModelProperty(value = "Embedded code of url of resource ")
  public String getEmbeddedCode() {
    return embeddedCode;
  }

  public void setEmbeddedCode(String embeddedCode) {
    this.embeddedCode = embeddedCode;
  }

  public UserView expiration(Date expiration) {
    this.expiration = expiration;
    return this;
  }

   /**
   * Expiration of user url 
   * @return expiration
  **/
  @ApiModelProperty(value = "Expiration of user url ")
  public Date getExpiration() {
    return expiration;
  }

  public void setExpiration(Date expiration) {
    this.expiration = expiration;
  }

  public UserView name(NameEnum name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the requested user view
   * @return name
  **/
  @ApiModelProperty(value = "Name of the requested user view")
  public NameEnum getName() {
    return name;
  }

  public void setName(NameEnum name) {
    this.name = name;
  }

  public UserView url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Url of resource location
   * @return url
  **/
  @ApiModelProperty(value = "Url of resource location")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserView userView = (UserView) o;
    return Objects.equals(this.embeddedCode, userView.embeddedCode) &&
        Objects.equals(this.expiration, userView.expiration) &&
        Objects.equals(this.name, userView.name) &&
        Objects.equals(this.url, userView.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(embeddedCode, expiration, name, url);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserView {\n");
    
    sb.append("    embeddedCode: ").append(toIndentedString(embeddedCode)).append("\n");
    sb.append("    expiration: ").append(toIndentedString(expiration)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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
