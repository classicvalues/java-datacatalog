// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1/policytagmanagerserialization.proto

package com.google.cloud.datacatalog.v1;

public interface ImportTaxonomiesRequestOrBuilder extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.ImportTaxonomiesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <pre>
   * Required. Resource name of project that the imported taxonomies will belong to.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   * <pre>
   * Required. Resource name of project that the imported taxonomies will belong to.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }</code>
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString
      getParentBytes();

  /**
   * <pre>
   * Inline source used for taxonomies import.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.InlineSource inline_source = 2;</code>
   * @return Whether the inlineSource field is set.
   */
  boolean hasInlineSource();
  /**
   * <pre>
   * Inline source used for taxonomies import.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.InlineSource inline_source = 2;</code>
   * @return The inlineSource.
   */
  com.google.cloud.datacatalog.v1.InlineSource getInlineSource();
  /**
   * <pre>
   * Inline source used for taxonomies import.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.InlineSource inline_source = 2;</code>
   */
  com.google.cloud.datacatalog.v1.InlineSourceOrBuilder getInlineSourceOrBuilder();

  /**
   * <pre>
   * Cross-regional source taxonomy to be imported.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.CrossRegionalSource cross_regional_source = 3;</code>
   * @return Whether the crossRegionalSource field is set.
   */
  boolean hasCrossRegionalSource();
  /**
   * <pre>
   * Cross-regional source taxonomy to be imported.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.CrossRegionalSource cross_regional_source = 3;</code>
   * @return The crossRegionalSource.
   */
  com.google.cloud.datacatalog.v1.CrossRegionalSource getCrossRegionalSource();
  /**
   * <pre>
   * Cross-regional source taxonomy to be imported.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.CrossRegionalSource cross_regional_source = 3;</code>
   */
  com.google.cloud.datacatalog.v1.CrossRegionalSourceOrBuilder getCrossRegionalSourceOrBuilder();

  public com.google.cloud.datacatalog.v1.ImportTaxonomiesRequest.SourceCase getSourceCase();
}
