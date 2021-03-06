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
import java.util.ArrayList;
import java.util.List;
import org.threeten.bp.OffsetDateTime;

/**
 * UserDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-11T13:57:16.194+02:00[Europe/Ljubljana]")public class UserDTO {

  @SerializedName("activated")
  private Boolean activated = null;

  @SerializedName("authorities")
  private List<String> authorities = null;

  @SerializedName("createdBy")
  private String createdBy = null;

  @SerializedName("createdDate")
  private OffsetDateTime createdDate = null;

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

  @SerializedName("lastModifiedBy")
  private String lastModifiedBy = null;

  @SerializedName("lastModifiedDate")
  private OffsetDateTime lastModifiedDate = null;

  @SerializedName("lastName")
  private String lastName = null;

  @SerializedName("login")
  private String login = null;
  public UserDTO activated(Boolean activated) {
    this.activated = activated;
    return this;
  }

  

  /**
  * Get activated
  * @return activated
  **/
  @Schema(description = "")
  public Boolean isActivated() {
    return activated;
  }
  public void setActivated(Boolean activated) {
    this.activated = activated;
  }
  public UserDTO authorities(List<String> authorities) {
    this.authorities = authorities;
    return this;
  }

  public UserDTO addAuthoritiesItem(String authoritiesItem) {
    if (this.authorities == null) {
      this.authorities = new ArrayList<String>();
    }
    this.authorities.add(authoritiesItem);
    return this;
  }

  /**
  * Get authorities
  * @return authorities
  **/
  @Schema(description = "")
  public List<String> getAuthorities() {
    return authorities;
  }
  public void setAuthorities(List<String> authorities) {
    this.authorities = authorities;
  }
  public UserDTO createdBy(String createdBy) {
    this.createdBy = createdBy;
    return this;
  }

  

  /**
  * Get createdBy
  * @return createdBy
  **/
  @Schema(description = "")
  public String getCreatedBy() {
    return createdBy;
  }
  public void setCreatedBy(String createdBy) {
    this.createdBy = createdBy;
  }
  public UserDTO createdDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
    return this;
  }

  

  /**
  * Get createdDate
  * @return createdDate
  **/
  @Schema(description = "")
  public OffsetDateTime getCreatedDate() {
    return createdDate;
  }
  public void setCreatedDate(OffsetDateTime createdDate) {
    this.createdDate = createdDate;
  }
  public UserDTO email(String email) {
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
  public UserDTO firstName(String firstName) {
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
  public UserDTO id(Long id) {
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
  public UserDTO imageUrl(String imageUrl) {
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
  public UserDTO langKey(String langKey) {
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
  public UserDTO lastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
    return this;
  }

  

  /**
  * Get lastModifiedBy
  * @return lastModifiedBy
  **/
  @Schema(description = "")
  public String getLastModifiedBy() {
    return lastModifiedBy;
  }
  public void setLastModifiedBy(String lastModifiedBy) {
    this.lastModifiedBy = lastModifiedBy;
  }
  public UserDTO lastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
    return this;
  }

  

  /**
  * Get lastModifiedDate
  * @return lastModifiedDate
  **/
  @Schema(description = "")
  public OffsetDateTime getLastModifiedDate() {
    return lastModifiedDate;
  }
  public void setLastModifiedDate(OffsetDateTime lastModifiedDate) {
    this.lastModifiedDate = lastModifiedDate;
  }
  public UserDTO lastName(String lastName) {
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
  public UserDTO login(String login) {
    this.login = login;
    return this;
  }

  

  /**
  * Get login
  * @return login
  **/
  @Schema(description = "")
  public String getLogin() {
    return login;
  }
  public void setLogin(String login) {
    this.login = login;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserDTO userDTO = (UserDTO) o;
    return Objects.equals(this.activated, userDTO.activated) &&
        Objects.equals(this.authorities, userDTO.authorities) &&
        Objects.equals(this.createdBy, userDTO.createdBy) &&
        Objects.equals(this.createdDate, userDTO.createdDate) &&
        Objects.equals(this.email, userDTO.email) &&
        Objects.equals(this.firstName, userDTO.firstName) &&
        Objects.equals(this.id, userDTO.id) &&
        Objects.equals(this.imageUrl, userDTO.imageUrl) &&
        Objects.equals(this.langKey, userDTO.langKey) &&
        Objects.equals(this.lastModifiedBy, userDTO.lastModifiedBy) &&
        Objects.equals(this.lastModifiedDate, userDTO.lastModifiedDate) &&
        Objects.equals(this.lastName, userDTO.lastName) &&
        Objects.equals(this.login, userDTO.login);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(activated, authorities, createdBy, createdDate, email, firstName, id, imageUrl, langKey, lastModifiedBy, lastModifiedDate, lastName, login);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserDTO {\n");
    
    sb.append("    activated: ").append(toIndentedString(activated)).append("\n");
    sb.append("    authorities: ").append(toIndentedString(authorities)).append("\n");
    sb.append("    createdBy: ").append(toIndentedString(createdBy)).append("\n");
    sb.append("    createdDate: ").append(toIndentedString(createdDate)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    firstName: ").append(toIndentedString(firstName)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    langKey: ").append(toIndentedString(langKey)).append("\n");
    sb.append("    lastModifiedBy: ").append(toIndentedString(lastModifiedBy)).append("\n");
    sb.append("    lastModifiedDate: ").append(toIndentedString(lastModifiedDate)).append("\n");
    sb.append("    lastName: ").append(toIndentedString(lastName)).append("\n");
    sb.append("    login: ").append(toIndentedString(login)).append("\n");
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
