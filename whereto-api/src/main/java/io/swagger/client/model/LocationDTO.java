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
import io.swagger.client.model.TagDTO;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LocationDTO
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-05-11T13:57:16.194+02:00[Europe/Ljubljana]")public class LocationDTO {

  @SerializedName("id")
  private Long id = null;

  @SerializedName("image")
  private String image = null;

  @SerializedName("imageContentType")
  private String imageContentType = null;

  @SerializedName("kiwiId")
  private String kiwiId = null;

  @SerializedName("kiwiIntId")
  private Integer kiwiIntId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("tags")
  private List<TagDTO> tags = null;
  public LocationDTO id(Long id) {
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
  public LocationDTO image(String image) {
    this.image = image;
    return this;
  }

  

  /**
  * Get image
  * @return image
  **/
  @Schema(description = "")
  public String getImage() {
    return image;
  }
  public void setImage(String image) {
    this.image = image;
  }
  public LocationDTO imageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
    return this;
  }

  

  /**
  * Get imageContentType
  * @return imageContentType
  **/
  @Schema(description = "")
  public String getImageContentType() {
    return imageContentType;
  }
  public void setImageContentType(String imageContentType) {
    this.imageContentType = imageContentType;
  }
  public LocationDTO kiwiId(String kiwiId) {
    this.kiwiId = kiwiId;
    return this;
  }

  

  /**
  * Get kiwiId
  * @return kiwiId
  **/
  @Schema(required = true, description = "")
  public String getKiwiId() {
    return kiwiId;
  }
  public void setKiwiId(String kiwiId) {
    this.kiwiId = kiwiId;
  }
  public LocationDTO kiwiIntId(Integer kiwiIntId) {
    this.kiwiIntId = kiwiIntId;
    return this;
  }

  

  /**
  * Get kiwiIntId
  * @return kiwiIntId
  **/
  @Schema(required = true, description = "")
  public Integer getKiwiIntId() {
    return kiwiIntId;
  }
  public void setKiwiIntId(Integer kiwiIntId) {
    this.kiwiIntId = kiwiIntId;
  }
  public LocationDTO name(String name) {
    this.name = name;
    return this;
  }

  

  /**
  * Get name
  * @return name
  **/
  @Schema(required = true, description = "")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public LocationDTO tags(List<TagDTO> tags) {
    this.tags = tags;
    return this;
  }

  public LocationDTO addTagsItem(TagDTO tagsItem) {
    if (this.tags == null) {
      this.tags = new ArrayList<TagDTO>();
    }
    this.tags.add(tagsItem);
    return this;
  }

  /**
  * Get tags
  * @return tags
  **/
  @Schema(description = "")
  public List<TagDTO> getTags() {
    return tags;
  }
  public void setTags(List<TagDTO> tags) {
    this.tags = tags;
  }
  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LocationDTO locationDTO = (LocationDTO) o;
    return Objects.equals(this.id, locationDTO.id) &&
        Objects.equals(this.image, locationDTO.image) &&
        Objects.equals(this.imageContentType, locationDTO.imageContentType) &&
        Objects.equals(this.kiwiId, locationDTO.kiwiId) &&
        Objects.equals(this.kiwiIntId, locationDTO.kiwiIntId) &&
        Objects.equals(this.name, locationDTO.name) &&
        Objects.equals(this.tags, locationDTO.tags);
  }

  @Override
  public int hashCode() {
    return java.util.Objects.hash(id, image, imageContentType, kiwiId, kiwiIntId, name, tags);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LocationDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    imageContentType: ").append(toIndentedString(imageContentType)).append("\n");
    sb.append("    kiwiId: ").append(toIndentedString(kiwiId)).append("\n");
    sb.append("    kiwiIntId: ").append(toIndentedString(kiwiIntId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
