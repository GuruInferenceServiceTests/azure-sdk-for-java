// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OperationListResult model. */
@Fluent
public final class OperationListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OperationListResultInner.class);

    /*
     * The list of container registry operations. Since this list may be
     * incomplete, the nextLink field should be used to request the next list
     * of operations.
     */
    @JsonProperty(value = "value")
    private List<OperationDefinitionInner> value;

    /*
     * The URI that can be used to request the next list of container registry
     * operations.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The list of container registry operations. Since this list may be incomplete, the
     * nextLink field should be used to request the next list of operations.
     *
     * @return the value value.
     */
    public List<OperationDefinitionInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The list of container registry operations. Since this list may be incomplete, the
     * nextLink field should be used to request the next list of operations.
     *
     * @param value the value value to set.
     * @return the OperationListResultInner object itself.
     */
    public OperationListResultInner withValue(List<OperationDefinitionInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI that can be used to request the next list of container registry operations.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI that can be used to request the next list of container registry operations.
     *
     * @param nextLink the nextLink value to set.
     * @return the OperationListResultInner object itself.
     */
    public OperationListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (value() != null) {
            value().forEach(e -> e.validate());
        }
    }
}
