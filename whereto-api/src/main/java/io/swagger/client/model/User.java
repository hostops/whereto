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
import org.threeten.bp.OffsetDateTime;

/**
 * User
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-11T13:57:16.194+02:00[Europe/Ljubljana]")public class User {

  @SerializedName("activated")
  private Boolean activated = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("firstName")
  private String firstName = null;

  @SerializedName("id")
  private Long id = null;

  @SerializedName("imageUrl")
  private String imageUrl = null;

  @SerializedName("langKey")
  private String langKey = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("login")
  private String login = null;

  @SerializedName("resetDate")
  private OffsetDateTime resetDate = null;
  public User activated(Boolean activated) {
    this.activated = activated;
    return this;
  }

  

  /**
  * Get activated
  * @return activated
  **/
  @Schema(required = true, description = "")
  public Boolean isActivated() {
    return activated;
  }
  public void setActivated(Boolean activated) {
    this.activated = activated;
  }
  public User email(String email) {
    this.email = email;
    return this;
  }

  

  /**
  * Get email
  * @return email
  **/
  @Schema(description = "")
  public String getEmail() {
    return email;
  }
  public void setEmail(String email) {
    this.email = email;
  }
  public User firstName(String firstName) {
    this.firstName = firstName;
    return this;
  }

  

  /**
  * Get firstName
  * @return firstName
  **/
  @Schema(description = "")
  public String getFirstName() {
    return firstName;
  }
  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }
  public User id(Long id) {
    this.id = id;
    return this;
  }

  

  /**
  * Get id
  * @return id
  **/
  @Schema(description = "")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }
  public User imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

  

  /**
  * Get imageUrl
  * @return imageUrl
  **/
  @Schema(description = "")
  public String getImageUrl() {
    return imageUrl;
  }
  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }
  public User langKey(String langKey) {
    this.langKey = langKey;
    return this;
  }

  

  /**
  * Get langKey
  * @return langKey
  **/
  @Schema(description = "")
  public String getLangKey() {
    return langKey;
  }
  public void setLangKey(String langKey) {
    this.langKey = langKey;
  }
  public User lastName(String lastName) {
    this.lastName = lastName;
    return this;
  }

  

  /**
  * Get lastName
  * @return lastName
  **/
  @Schema(description = "")
  public String getLastName() {
    return lastName;
  }
  public void setLastName(String lastName) {
    this.lastName = lastName;
  }
  public User login(String login) {
    this.login = login;
    return this;
  }

  

  /**
  * Get login
  * @return login
  **/
  @Schema(required = true, description = "")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }
  public User resetDate(OffsetDateTime resetDate) {
    this.resetDate = resetDate;
    return this;
  }

  

  /**
  * Get resetDate
  * @return resetDate
  **/
  @Schema(description = "")
  public OffsetDateTime getResetDate() {
    return resetDate;
  }
  public void setResetDate(OffsetDateTime resetDate) {
    this.resetDate = resetDate;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.activated, user.activated) &&
        Objects.equals(this.email, user.email) &&
        Objects.equals(this.firstName, user.firstName) &&
        Objects.equals(this.id, user.id) &&
        Objects.equals(this.imageUrl, user.imageUrl) &&
        Objects.equals(this.langKey, user.langKey) &&
        Objects.equals(this.lastName, user.lastName) &&
        Objects.equals(this.login, user.login) &&
        Objects.equals(this.resetDate, user.resetDate);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(activated, email, firstName, id, imageUrl, langKey, lastName, login, resetDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    langKey: ").append(toIndentedString(langKey)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
    sb.append("    resetDate: ").append(toIndentedString(resetDate)).append("\n");
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