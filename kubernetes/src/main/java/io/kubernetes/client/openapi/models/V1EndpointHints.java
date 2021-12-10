/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: release-1.23
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1ForZone;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * EndpointHints provides hints describing how an endpoint should be consumed.
 */
@ApiModel(description = "EndpointHints provides hints describing how an endpoint should be consumed.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1EndpointHints {
  public static final String SERIALIZED_NAME_FOR_ZONES = "forZones";
  @SerializedName(SERIALIZED_NAME_FOR_ZONES)
  private List<V1ForZone> forZones = null;


  public V1EndpointHints forZones(List<V1ForZone> forZones) {
    
    this.forZones = forZones;
    return this;
  }

  public V1EndpointHints addForZonesItem(V1ForZone forZonesItem) {
    if (this.forZones == null) {
      this.forZones = new ArrayList<>();
    }
    this.forZones.add(forZonesItem);
    return this;
  }

   /**
   * forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing.
   * @return forZones
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "forZones indicates the zone(s) this endpoint should be consumed by to enable topology aware routing.")

  public List<V1ForZone> getForZones() {
    return forZones;
  }


  public void setForZones(List<V1ForZone> forZones) {
    this.forZones = forZones;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1EndpointHints v1EndpointHints = (V1EndpointHints) o;
    return Objects.equals(this.forZones, v1EndpointHints.forZones);
  }

  @Override
  public int hashCode() {
    return Objects.hash(forZones);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1EndpointHints {\n");
    sb.append("    forZones: ").append(toIndentedString(forZones)).append("\n");
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

