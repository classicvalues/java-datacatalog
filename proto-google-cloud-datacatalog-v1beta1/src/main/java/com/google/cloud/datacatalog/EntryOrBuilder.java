/*
 * Copyright 2019 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

package com.google.cloud.datacatalog;

public interface EntryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.Entry)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Data Catalog resource name of the entry in URL format. Example:
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id}
   * Note that this Entry and its child resources may not actually be stored in
   * the location in this name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The Data Catalog resource name of the entry in URL format. Example:
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}/entries/{entry_id}
   * Note that this Entry and its child resources may not actually be stored in
   * the location in this name.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.resource_reference) = { ... }</code>
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The resource this metadata entry refers to.
   * For Google Cloud Platform resources, `linked_resource` is the [full name of
   * the
   * resource](https://cloud.google.com/apis/design/resource_names#full_resource_name).
   * For example, the `linked_resource` for a table resource from BigQuery is:
   * * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
   * </pre>
   *
   * <code>string linked_resource = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  java.lang.String getLinkedResource();
  /**
   *
   *
   * <pre>
   * Output only. The resource this metadata entry refers to.
   * For Google Cloud Platform resources, `linked_resource` is the [full name of
   * the
   * resource](https://cloud.google.com/apis/design/resource_names#full_resource_name).
   * For example, the `linked_resource` for a table resource from BigQuery is:
   * * //bigquery.googleapis.com/projects/projectId/datasets/datasetId/tables/tableId
   * </pre>
   *
   * <code>string linked_resource = 9 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.ByteString getLinkedResourceBytes();

  /**
   *
   *
   * <pre>
   * The type of the entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.EntryType type = 2;</code>
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * The type of the entry.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.EntryType type = 2;</code>
   */
  com.google.cloud.datacatalog.EntryType getType();

  /**
   *
   *
   * <pre>
   * Specification that applies to a Cloud Storage fileset. This is only valid
   * on entries of type FILESET.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.GcsFilesetSpec gcs_fileset_spec = 6;</code>
   */
  boolean hasGcsFilesetSpec();
  /**
   *
   *
   * <pre>
   * Specification that applies to a Cloud Storage fileset. This is only valid
   * on entries of type FILESET.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.GcsFilesetSpec gcs_fileset_spec = 6;</code>
   */
  com.google.cloud.datacatalog.GcsFilesetSpec getGcsFilesetSpec();
  /**
   *
   *
   * <pre>
   * Specification that applies to a Cloud Storage fileset. This is only valid
   * on entries of type FILESET.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.GcsFilesetSpec gcs_fileset_spec = 6;</code>
   */
  com.google.cloud.datacatalog.GcsFilesetSpecOrBuilder getGcsFilesetSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Specification that applies to a BigQuery table. This is only valid on
   * entries of type `TABLE`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.BigQueryTableSpec bigquery_table_spec = 12;</code>
   */
  boolean hasBigqueryTableSpec();
  /**
   *
   *
   * <pre>
   * Specification that applies to a BigQuery table. This is only valid on
   * entries of type `TABLE`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.BigQueryTableSpec bigquery_table_spec = 12;</code>
   */
  com.google.cloud.datacatalog.BigQueryTableSpec getBigqueryTableSpec();
  /**
   *
   *
   * <pre>
   * Specification that applies to a BigQuery table. This is only valid on
   * entries of type `TABLE`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.BigQueryTableSpec bigquery_table_spec = 12;</code>
   */
  com.google.cloud.datacatalog.BigQueryTableSpecOrBuilder getBigqueryTableSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Specification for a group of BigQuery tables with name pattern
   * `[prefix]YYYYMMDD`. Context:
   * https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.BigQueryDateShardedSpec bigquery_date_sharded_spec = 15;
   * </code>
   */
  boolean hasBigqueryDateShardedSpec();
  /**
   *
   *
   * <pre>
   * Specification for a group of BigQuery tables with name pattern
   * `[prefix]YYYYMMDD`. Context:
   * https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.BigQueryDateShardedSpec bigquery_date_sharded_spec = 15;
   * </code>
   */
  com.google.cloud.datacatalog.BigQueryDateShardedSpec getBigqueryDateShardedSpec();
  /**
   *
   *
   * <pre>
   * Specification for a group of BigQuery tables with name pattern
   * `[prefix]YYYYMMDD`. Context:
   * https://cloud.google.com/bigquery/docs/partitioned-tables#partitioning_versus_sharding.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.BigQueryDateShardedSpec bigquery_date_sharded_spec = 15;
   * </code>
   */
  com.google.cloud.datacatalog.BigQueryDateShardedSpecOrBuilder
      getBigqueryDateShardedSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Display information such as title and description. A short name to identify
   * the entry, for example, "Analytics Data - Jan 2011". Default value is an
   * empty string.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Display information such as title and description. A short name to identify
   * the entry, for example, "Analytics Data - Jan 2011". Default value is an
   * empty string.
   * </pre>
   *
   * <code>string display_name = 3;</code>
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Entry description, which can consist of several sentences or paragraphs
   * that describe entry contents. Default value is an empty string.
   * </pre>
   *
   * <code>string description = 4;</code>
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Entry description, which can consist of several sentences or paragraphs
   * that describe entry contents. Default value is an empty string.
   * </pre>
   *
   * <code>string description = 4;</code>
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Schema of the entry. An entry might not have any schema attached to it.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.Schema schema = 5;</code>
   */
  boolean hasSchema();
  /**
   *
   *
   * <pre>
   * Schema of the entry. An entry might not have any schema attached to it.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.Schema schema = 5;</code>
   */
  com.google.cloud.datacatalog.Schema getSchema();
  /**
   *
   *
   * <pre>
   * Schema of the entry. An entry might not have any schema attached to it.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1beta1.Schema schema = 5;</code>
   */
  com.google.cloud.datacatalog.SchemaOrBuilder getSchemaOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Timestamps about the underlying Google Cloud Platform
   * resource, not about this Data Catalog Entry.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.SystemTimestamps source_system_timestamps = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean hasSourceSystemTimestamps();
  /**
   *
   *
   * <pre>
   * Output only. Timestamps about the underlying Google Cloud Platform
   * resource, not about this Data Catalog Entry.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.SystemTimestamps source_system_timestamps = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.datacatalog.SystemTimestamps getSourceSystemTimestamps();
  /**
   *
   *
   * <pre>
   * Output only. Timestamps about the underlying Google Cloud Platform
   * resource, not about this Data Catalog Entry.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1beta1.SystemTimestamps source_system_timestamps = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.datacatalog.SystemTimestampsOrBuilder getSourceSystemTimestampsOrBuilder();

  public com.google.cloud.datacatalog.Entry.EntryTypeCase getEntryTypeCase();

  public com.google.cloud.datacatalog.Entry.TypeSpecCase getTypeSpecCase();
}
