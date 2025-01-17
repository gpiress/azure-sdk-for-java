// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datafactory.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.datafactory.fluent.models.AzureBlobFSDatasetTypeProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.util.List;
import java.util.Map;

/** The Azure Data Lake Storage Gen2 storage. */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "type")
@JsonTypeName("AzureBlobFSFile")
@Fluent
public final class AzureBlobFSDataset extends Dataset {
    /*
     * Azure Data Lake Storage Gen2 dataset properties.
     */
    @JsonProperty(value = "typeProperties")
    private AzureBlobFSDatasetTypeProperties innerTypeProperties;

    /** Creates an instance of AzureBlobFSDataset class. */
    public AzureBlobFSDataset() {
    }

    /**
     * Get the innerTypeProperties property: Azure Data Lake Storage Gen2 dataset properties.
     *
     * @return the innerTypeProperties value.
     */
    private AzureBlobFSDatasetTypeProperties innerTypeProperties() {
        return this.innerTypeProperties;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSDataset withDescription(String description) {
        super.withDescription(description);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSDataset withStructure(Object structure) {
        super.withStructure(structure);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSDataset withSchema(Object schema) {
        super.withSchema(schema);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSDataset withLinkedServiceName(LinkedServiceReference linkedServiceName) {
        super.withLinkedServiceName(linkedServiceName);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSDataset withParameters(Map<String, ParameterSpecification> parameters) {
        super.withParameters(parameters);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSDataset withAnnotations(List<Object> annotations) {
        super.withAnnotations(annotations);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public AzureBlobFSDataset withFolder(DatasetFolder folder) {
        super.withFolder(folder);
        return this;
    }

    /**
     * Get the folderPath property: The path of the Azure Data Lake Storage Gen2 storage. Type: string (or Expression
     * with resultType string).
     *
     * @return the folderPath value.
     */
    public Object folderPath() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().folderPath();
    }

    /**
     * Set the folderPath property: The path of the Azure Data Lake Storage Gen2 storage. Type: string (or Expression
     * with resultType string).
     *
     * @param folderPath the folderPath value to set.
     * @return the AzureBlobFSDataset object itself.
     */
    public AzureBlobFSDataset withFolderPath(Object folderPath) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobFSDatasetTypeProperties();
        }
        this.innerTypeProperties().withFolderPath(folderPath);
        return this;
    }

    /**
     * Get the fileName property: The name of the Azure Data Lake Storage Gen2. Type: string (or Expression with
     * resultType string).
     *
     * @return the fileName value.
     */
    public Object fileName() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().fileName();
    }

    /**
     * Set the fileName property: The name of the Azure Data Lake Storage Gen2. Type: string (or Expression with
     * resultType string).
     *
     * @param fileName the fileName value to set.
     * @return the AzureBlobFSDataset object itself.
     */
    public AzureBlobFSDataset withFileName(Object fileName) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobFSDatasetTypeProperties();
        }
        this.innerTypeProperties().withFileName(fileName);
        return this;
    }

    /**
     * Get the format property: The format of the Azure Data Lake Storage Gen2 storage.
     *
     * @return the format value.
     */
    public DatasetStorageFormat format() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().format();
    }

    /**
     * Set the format property: The format of the Azure Data Lake Storage Gen2 storage.
     *
     * @param format the format value to set.
     * @return the AzureBlobFSDataset object itself.
     */
    public AzureBlobFSDataset withFormat(DatasetStorageFormat format) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobFSDatasetTypeProperties();
        }
        this.innerTypeProperties().withFormat(format);
        return this;
    }

    /**
     * Get the compression property: The data compression method used for the blob storage.
     *
     * @return the compression value.
     */
    public DatasetCompression compression() {
        return this.innerTypeProperties() == null ? null : this.innerTypeProperties().compression();
    }

    /**
     * Set the compression property: The data compression method used for the blob storage.
     *
     * @param compression the compression value to set.
     * @return the AzureBlobFSDataset object itself.
     */
    public AzureBlobFSDataset withCompression(DatasetCompression compression) {
        if (this.innerTypeProperties() == null) {
            this.innerTypeProperties = new AzureBlobFSDatasetTypeProperties();
        }
        this.innerTypeProperties().withCompression(compression);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (innerTypeProperties() != null) {
            innerTypeProperties().validate();
        }
    }
}
