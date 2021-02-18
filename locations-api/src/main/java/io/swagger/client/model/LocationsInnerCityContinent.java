/*
 * Locations API
 * This document describes the Kiwi.com locations search API.  **Locations** is a simple API used to search, suggest and resolve locations in various situations.  ## Contact us In case you cannot find what you are looking for in this document please contact us directly at **[tequila-support@kiwi.com](mailto:tequila-support@kiwi.com)**.  **The responses are G-zipped and need to be unpacked (response header Content-Encoding: gzip).**
 *
 * OpenAPI spec version: 1.0.0
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
 * LocationsInnerCityContinent
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-10T23:04:34.003+02:00[Europe/Ljubljana]")public class LocationsInnerCityContinent {

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("code")
  private String code = null;
  public LocationsInnerCityContinent id(String id) {
    this.id = id;
    return this;
  }

  

  /**
  * Get id
  * @return id
  **/
  @Schema(example = "europe", description = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public LocationsInnerCityContinent name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * Get name
  * @return name
  **/
  @Schema(example = "Europe", description = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public LocationsInnerCityContinent slug(String slug) {
    this.slug = slug;
    return this;
  }

  

  /**
  * Get slug
  * @return slug
  **/
  @Schema(example = "europe", description = "")
  public String getSlug() {
    return slug;
  }
  public void setSlug(String slug) {
    this.slug = slug;
  }
  public LocationsInnerCityContinent code(String code) {
    this.code = code;
    return this;
  }

  

  /**
  * Get code
  * @return code
  **/
  @Schema(example = "EU", description = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationsInnerCityContinent locationsInnerCityContinent = (LocationsInnerCityContinent) o;
    return Objects.equals(this.id, locationsInnerCityContinent.id) &&
        Objects.equals(this.name, locationsInnerCityContinent.name) &&
        Objects.equals(this.slug, locationsInnerCityContinent.slug) &&
        Objects.equals(this.code, locationsInnerCityContinent.code);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, slug, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationsInnerCityContinent {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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