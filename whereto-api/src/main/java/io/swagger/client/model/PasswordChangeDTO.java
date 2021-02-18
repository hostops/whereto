/*
 * WhereTo API
 * WhereTo API documentation
 *
 * OpenAPI spec version: 0.0.1
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
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * PasswordChangeDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-11T13:57:16.194+02:00[Europe/Ljubljana]")public class PasswordChangeDTO {

  @SerializedName("currentPassword")
  private String currentPassword = null;

  @SerializedName("newPassword")
  private String newPassword = null;
  public PasswordChangeDTO currentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
    return this;
  }

  

  /**
  * Get currentPassword
  * @return currentPassword
  **/
  @Schema(description = "")
  public String getCurrentPassword() {
    return currentPassword;
  }
  public void setCurrentPassword(String currentPassword) {
    this.currentPassword = currentPassword;
  }
  public PasswordChangeDTO newPassword(String newPassword) {
    this.newPassword = newPassword;
    return this;
  }

  

  /**
  * Get newPassword
  * @return newPassword
  **/
  @Schema(description = "")
  public String getNewPassword() {
    return newPassword;
  }
  public void setNewPassword(String newPassword) {
    this.newPassword = newPassword;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PasswordChangeDTO passwordChangeDTO = (PasswordChangeDTO) o;
    return Objects.equals(this.currentPassword, passwordChangeDTO.currentPassword) &&
        Objects.equals(this.newPassword, passwordChangeDTO.newPassword);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(currentPassword, newPassword);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PasswordChangeDTO {\n");
    
    sb.append("    currentPassword: ").append(toIndentedString(currentPassword)).append("\n");
    sb.append("    newPassword: ").append(toIndentedString(newPassword)).append("\n");
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
