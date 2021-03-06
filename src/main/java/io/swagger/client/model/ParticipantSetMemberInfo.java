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
import io.swagger.client.model.ParticipantSecurityOption;
import java.io.IOException;

/**
 * ParticipantSetMemberInfo
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-09-06T11:31:50.276+05:30")
public class ParticipantSetMemberInfo {
  @SerializedName("email")
  private String email = null;

  @SerializedName("securityOption")
  private ParticipantSecurityOption securityOption = null;

  public ParticipantSetMemberInfo email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email of the particpant. In case of creating new Agreements(POST/PUT), this is a required field. In case of GET, this is the required field and will always be returned unless it is a fax workflow( legacy agreements) that were created using fax as input
   * @return email
  **/
  @ApiModelProperty(value = "Email of the particpant. In case of creating new Agreements(POST/PUT), this is a required field. In case of GET, this is the required field and will always be returned unless it is a fax workflow( legacy agreements) that were created using fax as input")
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public ParticipantSetMemberInfo securityOption(ParticipantSecurityOption securityOption) {
    this.securityOption = securityOption;
    return this;
  }

   /**
   * Security options that apply to the participant
   * @return securityOption
  **/
  @ApiModelProperty(value = "Security options that apply to the participant")
  public ParticipantSecurityOption getSecurityOption() {
    return securityOption;
  }

  public void setSecurityOption(ParticipantSecurityOption securityOption) {
    this.securityOption = securityOption;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParticipantSetMemberInfo participantSetMemberInfo = (ParticipantSetMemberInfo) o;
    return Objects.equals(this.email, participantSetMemberInfo.email) &&
        Objects.equals(this.securityOption, participantSetMemberInfo.securityOption);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, securityOption);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParticipantSetMemberInfo {\n");
    
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    securityOption: ").append(toIndentedString(securityOption)).append("\n");
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

