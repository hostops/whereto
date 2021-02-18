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
 * LocationsInnerLocation
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-10T23:04:34.003+02:00[Europe/Ljubljana]")public class LocationsInnerLocation {

  @SerializedName("lon")
  private String lon = null;

  @SerializedName("lat")
  private String lat = null;
  public LocationsInnerLocation lon(String lon) {
    this.lon = lon;
    return this;
  }

  

  /**
  * Get lon
  * @return lon
  **/
  @Schema(example = "0.054167", description = "")
  public String getLon() {
    return lon;
  }
  public void setLon(String lon) {
    this.lon = lon;
  }
  public LocationsInnerLocation lat(String lat) {
    this.lat = lat;
    return this;
  }

  

  /**
  * Get lat
  * @return lat
  **/
  @Schema(example = "51.505", description = "")
  public String getLat() {
    return lat;
  }
  public void setLat(String lat) {
    this.lat = lat;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationsInnerLocation locationsInnerLocation = (LocationsInnerLocation) o;
    return Objects.equals(this.lon, locationsInnerLocation.lon) &&
        Objects.equals(this.lat, locationsInnerLocation.lat);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(lon, lat);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationsInnerLocation {\n");
    
    sb.append("    lon: ").append(toIndentedString(lon)).append("\n");
    sb.append("    lat: ").append(toIndentedString(lat)).append("\n");
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
