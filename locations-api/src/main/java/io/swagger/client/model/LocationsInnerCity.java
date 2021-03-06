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
import io.swagger.client.model.LocationsInnerCityContinent;
import io.swagger.client.model.LocationsInnerCityCountry;
import io.swagger.client.model.LocationsInnerCityRegion;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * LocationsInnerCity
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-10T23:04:34.003+02:00[Europe/Ljubljana]")public class LocationsInnerCity {

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("slug")
  private String slug = null;

  @SerializedName("subdivision")
  private String subdivision = null;

  @SerializedName("autonomous_territory")
  private String autonomousTerritory = null;

  @SerializedName("country")
  private LocationsInnerCityCountry country = null;

  @SerializedName("region")
  private LocationsInnerCityRegion region = null;

  @SerializedName("continent")
  private LocationsInnerCityContinent continent = null;
  public LocationsInnerCity id(String id) {
    this.id = id;
    return this;
  }

  

  /**
  * Get id
  * @return id
  **/
  @Schema(example = "london_gb", description = "")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }
  public LocationsInnerCity name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * Get name
  * @return name
  **/
  @Schema(example = "London", description = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public LocationsInnerCity code(String code) {
    this.code = code;
    return this;
  }

  

  /**
  * Get code
  * @return code
  **/
  @Schema(example = "LON", description = "")
  public String getCode() {
    return code;
  }
  public void setCode(String code) {
    this.code = code;
  }
  public LocationsInnerCity slug(String slug) {
    this.slug = slug;
    return this;
  }

  

  /**
  * Get slug
  * @return slug
  **/
  @Schema(example = "london", description = "")
  public String getSlug() {
    return slug;
  }
  public void setSlug(String slug) {
    this.slug = slug;
  }
  public LocationsInnerCity subdivision(String subdivision) {
    this.subdivision = subdivision;
    return this;
  }

  

  /**
  * Get subdivision
  * @return subdivision
  **/
  @Schema(description = "")
  public String getSubdivision() {
    return subdivision;
  }
  public void setSubdivision(String subdivision) {
    this.subdivision = subdivision;
  }
  public LocationsInnerCity autonomousTerritory(String autonomousTerritory) {
    this.autonomousTerritory = autonomousTerritory;
    return this;
  }

  

  /**
  * Get autonomousTerritory
  * @return autonomousTerritory
  **/
  @Schema(description = "")
  public String getAutonomousTerritory() {
    return autonomousTerritory;
  }
  public void setAutonomousTerritory(String autonomousTerritory) {
    this.autonomousTerritory = autonomousTerritory;
  }
  public LocationsInnerCity country(LocationsInnerCityCountry country) {
    this.country = country;
    return this;
  }

  

  /**
  * Get country
  * @return country
  **/
  @Schema(description = "")
  public LocationsInnerCityCountry getCountry() {
    return country;
  }
  public void setCountry(LocationsInnerCityCountry country) {
    this.country = country;
  }
  public LocationsInnerCity region(LocationsInnerCityRegion region) {
    this.region = region;
    return this;
  }

  

  /**
  * Get region
  * @return region
  **/
  @Schema(description = "")
  public LocationsInnerCityRegion getRegion() {
    return region;
  }
  public void setRegion(LocationsInnerCityRegion region) {
    this.region = region;
  }
  public LocationsInnerCity continent(LocationsInnerCityContinent continent) {
    this.continent = continent;
    return this;
  }

  

  /**
  * Get continent
  * @return continent
  **/
  @Schema(description = "")
  public LocationsInnerCityContinent getContinent() {
    return continent;
  }
  public void setContinent(LocationsInnerCityContinent continent) {
    this.continent = continent;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationsInnerCity locationsInnerCity = (LocationsInnerCity) o;
    return Objects.equals(this.id, locationsInnerCity.id) &&
        Objects.equals(this.name, locationsInnerCity.name) &&
        Objects.equals(this.code, locationsInnerCity.code) &&
        Objects.equals(this.slug, locationsInnerCity.slug) &&
        Objects.equals(this.subdivision, locationsInnerCity.subdivision) &&
        Objects.equals(this.autonomousTerritory, locationsInnerCity.autonomousTerritory) &&
        Objects.equals(this.country, locationsInnerCity.country) &&
        Objects.equals(this.region, locationsInnerCity.region) &&
        Objects.equals(this.continent, locationsInnerCity.continent);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, name, code, slug, subdivision, autonomousTerritory, country, region, continent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationsInnerCity {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    slug: ").append(toIndentedString(slug)).append("\n");
    sb.append("    subdivision: ").append(toIndentedString(subdivision)).append("\n");
    sb.append("    autonomousTerritory: ").append(toIndentedString(autonomousTerritory)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    region: ").append(toIndentedString(region)).append("\n");
    sb.append("    continent: ").append(toIndentedString(continent)).append("\n");
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
