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
import io.kubernetes.client.openapi.models.V1beta1IDRange;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * RunAsGroupStrategyOptions defines the strategy type and any options used to create the strategy.
 */
@ApiModel(description = "RunAsGroupStrategyOptions defines the strategy type and any options used to create the strategy.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-12-10T19:11:23.904Z[Etc/UTC]")
public class V1beta1RunAsGroupStrategyOptions {
  public static final String SERIALIZED_NAME_RANGES = "ranges";
  @SerializedName(SERIALIZED_NAME_RANGES)
  private List<V1beta1IDRange> ranges = null;

  public static final String SERIALIZED_NAME_RULE = "rule";
  @SerializedName(SERIALIZED_NAME_RULE)
  private String rule;


  public V1beta1RunAsGroupStrategyOptions ranges(List<V1beta1IDRange> ranges) {
    
    this.ranges = ranges;
    return this;
  }

  public V1beta1RunAsGroupStrategyOptions addRangesItem(V1beta1IDRange rangesItem) {
    if (this.ranges == null) {
      this.ranges = new ArrayList<>();
    }
    this.ranges.add(rangesItem);
    return this;
  }

   /**
   * ranges are the allowed ranges of gids that may be used. If you would like to force a single gid then supply a single range with the same start and end. Required for MustRunAs.
   * @return ranges
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ranges are the allowed ranges of gids that may be used. If you would like to force a single gid then supply a single range with the same start and end. Required for MustRunAs.")

  public List<V1beta1IDRange> getRanges() {
    return ranges;
  }


  public void setRanges(List<V1beta1IDRange> ranges) {
    this.ranges = ranges;
  }


  public V1beta1RunAsGroupStrategyOptions rule(String rule) {
    
    this.rule = rule;
    return this;
  }

   /**
   * rule is the strategy that will dictate the allowable RunAsGroup values that may be set.
   * @return rule
  **/
  @ApiModelProperty(required = true, value = "rule is the strategy that will dictate the allowable RunAsGroup values that may be set.")

  public String getRule() {
    return rule;
  }


  public void setRule(String rule) {
    this.rule = rule;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1beta1RunAsGroupStrategyOptions v1beta1RunAsGroupStrategyOptions = (V1beta1RunAsGroupStrategyOptions) o;
    return Objects.equals(this.ranges, v1beta1RunAsGroupStrategyOptions.ranges) &&
        Objects.equals(this.rule, v1beta1RunAsGroupStrategyOptions.rule);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ranges, rule);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1beta1RunAsGroupStrategyOptions {\n");
    sb.append("    ranges: ").append(toIndentedString(ranges)).append("\n");
    sb.append("    rule: ").append(toIndentedString(rule)).append("\n");
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

