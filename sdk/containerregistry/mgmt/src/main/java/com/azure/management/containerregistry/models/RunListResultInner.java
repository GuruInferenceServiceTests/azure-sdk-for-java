// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerregistry.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The RunListResult model. */
@Fluent
public final class RunListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RunListResultInner.class);

    /*
     * The collection value.
     */
    @JsonProperty(value = "value")
    private List<RunInner> value;

    /*
     * The URI that can be used to request the next set of paged results.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The collection value.
     *
     * @return the value value.
     */
    public List<RunInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The collection value.
     *
     * @param value the value value to set.
     * @return the RunListResultInner object itself.
     */
    public RunListResultInner withValue(List<RunInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The URI that can be used to request the next set of paged results.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The URI that can be used to request the next set of paged results.
     *
     * @param nextLink the nextLink value to set.
     * @return the RunListResultInner object itself.
     */
    public RunListResultInner withNextLink(String nextLink) {
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
