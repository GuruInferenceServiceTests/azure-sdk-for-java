// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.msi.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The UserAssignedIdentitiesListResult model. */
@Fluent
public final class UserAssignedIdentitiesListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(UserAssignedIdentitiesListResultInner.class);

    /*
     * The collection of userAssignedIdentities returned by the listing
     * operation.
     */
    @JsonProperty(value = "value")
    private List<IdentityInner> value;

    /*
     * The url to get the next page of results, if any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value property: The collection of userAssignedIdentities returned by the listing operation.
     *
     * @return the value value.
     */
    public List<IdentityInner> value() {
        return this.value;
    }

    /**
     * Set the value property: The collection of userAssignedIdentities returned by the listing operation.
     *
     * @param value the value value to set.
     * @return the UserAssignedIdentitiesListResultInner object itself.
     */
    public UserAssignedIdentitiesListResultInner withValue(List<IdentityInner> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink property: The url to get the next page of results, if any.
     *
     * @return the nextLink value.
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink property: The url to get the next page of results, if any.
     *
     * @param nextLink the nextLink value to set.
     * @return the UserAssignedIdentitiesListResultInner object itself.
     */
    public UserAssignedIdentitiesListResultInner withNextLink(String nextLink) {
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
