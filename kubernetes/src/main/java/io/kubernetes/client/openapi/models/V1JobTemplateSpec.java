/*
Copyright 2024 The Kubernetes Authors.
Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
http://www.apache.org/licenses/LICENSE-2.0
Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.kubernetes.client.openapi.models.V1JobSpec;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.kubernetes.client.openapi.JSON;

/**
 * JobTemplateSpec describes the data a Job should have when created from a template
 */
@jakarta.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2024-02-02T17:56:12.287571Z[Etc/UTC]")
public class V1JobTemplateSpec {
  public static final String SERIALIZED_NAME_METADATA = "metadata";
  @SerializedName(SERIALIZED_NAME_METADATA)
  private V1ObjectMeta metadata;

  public static final String SERIALIZED_NAME_SPEC = "spec";
  @SerializedName(SERIALIZED_NAME_SPEC)
  private V1JobSpec spec;

  public V1JobTemplateSpec() {
  }

  public V1JobTemplateSpec metadata(V1ObjectMeta metadata) {

    this.metadata = metadata;
    return this;
  }

   /**
   * Get metadata
   * @return metadata
  **/
  @jakarta.annotation.Nullable
  public V1ObjectMeta getMetadata() {
    return metadata;
  }


  public void setMetadata(V1ObjectMeta metadata) {
    this.metadata = metadata;
  }


  public V1JobTemplateSpec spec(V1JobSpec spec) {

    this.spec = spec;
    return this;
  }

   /**
   * Get spec
   * @return spec
  **/
  @jakarta.annotation.Nullable
  public V1JobSpec getSpec() {
    return spec;
  }


  public void setSpec(V1JobSpec spec) {
    this.spec = spec;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1JobTemplateSpec v1JobTemplateSpec = (V1JobTemplateSpec) o;
    return Objects.equals(this.metadata, v1JobTemplateSpec.metadata) &&
        Objects.equals(this.spec, v1JobTemplateSpec.spec);
  }

  @Override
  public int hashCode() {
    return Objects.hash(metadata, spec);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1JobTemplateSpec {\n");
    sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
    sb.append("    spec: ").append(toIndentedString(spec)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("metadata");
    openapiFields.add("spec");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to V1JobTemplateSpec
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!V1JobTemplateSpec.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in V1JobTemplateSpec is not found in the empty JSON string", V1JobTemplateSpec.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!V1JobTemplateSpec.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `V1JobTemplateSpec` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      // validate the optional field `metadata`
      if (jsonObj.get("metadata") != null && !jsonObj.get("metadata").isJsonNull()) {
        V1ObjectMeta.validateJsonObject(jsonObj.getAsJsonObject("metadata"));
      }
      // validate the optional field `spec`
      if (jsonObj.get("spec") != null && !jsonObj.get("spec").isJsonNull()) {
        V1JobSpec.validateJsonObject(jsonObj.getAsJsonObject("spec"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!V1JobTemplateSpec.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'V1JobTemplateSpec' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<V1JobTemplateSpec> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(V1JobTemplateSpec.class));

       return (TypeAdapter<T>) new TypeAdapter<V1JobTemplateSpec>() {
           @Override
           public void write(JsonWriter out, V1JobTemplateSpec value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public V1JobTemplateSpec read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of V1JobTemplateSpec given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of V1JobTemplateSpec
  * @throws IOException if the JSON string is invalid with respect to V1JobTemplateSpec
  */
  public static V1JobTemplateSpec fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, V1JobTemplateSpec.class);
  }

 /**
  * Convert an instance of V1JobTemplateSpec to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
