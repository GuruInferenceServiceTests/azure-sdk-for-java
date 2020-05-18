// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.keyvault;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Map;

/** The VaultCreateOrUpdateParameters model. */
@Fluent
public final class VaultCreateOrUpdateParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(VaultCreateOrUpdateParameters.class);

    /*
     * The supported Azure location where the key vault should be created.
     */
    @JsonProperty(value = "location", required = true)
    private String location;

    /*
     * The tags that will be assigned to the key vault.
     */
    @JsonProperty(value = "tags")
    private Map<String, String> tags;

    /*
     * Properties of the vault
     */
    @JsonProperty(value = "properties", required = true)
    private VaultProperties properties;

    /**
     * Get the location property: The supported Azure location where the key vault should be created.
     *
     * @return the location value.
     */
    public String location() {
        return this.location;
    }

    /**
     * Set the location property: The supported Azure location where the key vault should be created.
     *
     * @param location the location value to set.
     * @return the VaultCreateOrUpdateParameters object itself.
     */
    public VaultCreateOrUpdateParameters withLocation(String location) {
        this.location = location;
        return this;
    }

    /**
     * Get the tags property: The tags that will be assigned to the key vault.
     *
     * @return the tags value.
     */
    public Map<String, String> tags() {
        return this.tags;
    }

    /**
     * Set the tags property: The tags that will be assigned to the key vault.
     *
     * @param tags the tags value to set.
     * @return the VaultCreateOrUpdateParameters object itself.
     */
    public VaultCreateOrUpdateParameters withTags(Map<String, String> tags) {
        this.tags = tags;
        return this;
    }

    /**
     * Get the properties property: Properties of the vault.
     *
     * @return the properties value.
     */
    public VaultProperties properties() {
        return this.properties;
    }

    /**
     * Set the properties property: Properties of the vault.
     *
     * @param properties the properties value to set.
     * @return the VaultCreateOrUpdateParameters object itself.
     */
    public VaultCreateOrUpdateParameters withProperties(VaultProperties properties) {
        this.properties = properties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (location() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property location in model VaultCreateOrUpdateParameters"));
        }
        if (properties() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property properties in model VaultCreateOrUpdateParameters"));
        } else {
            properties().validate();
        }
    }
}
