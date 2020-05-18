// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/** The RuleDataSource model. */
@JsonTypeInfo(
    use = JsonTypeInfo.Id.NAME,
    include = JsonTypeInfo.As.PROPERTY,
    property = "odata\\.type",
    defaultImpl = RuleDataSource.class)
@JsonTypeName("RuleDataSource")
@JsonSubTypes({
    @JsonSubTypes.Type(
        name = "Microsoft.Azure.Management.Insights.Models.RuleMetricDataSource",
        value = RuleMetricDataSource.class),
    @JsonSubTypes.Type(
        name = "Microsoft.Azure.Management.Insights.Models.RuleManagementEventDataSource",
        value = RuleManagementEventDataSource.class)
})
@JsonFlatten
@Fluent
public class RuleDataSource {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(RuleDataSource.class);

    /*
     * the resource identifier of the resource the rule monitors. **NOTE**:
     * this property cannot be updated for an existing rule.
     */
    @JsonProperty(value = "resourceUri")
    private String resourceUri;

    /**
     * Get the resourceUri property: the resource identifier of the resource the rule monitors. **NOTE**: this property
     * cannot be updated for an existing rule.
     *
     * @return the resourceUri value.
     */
    public String resourceUri() {
        return this.resourceUri;
    }

    /**
     * Set the resourceUri property: the resource identifier of the resource the rule monitors. **NOTE**: this property
     * cannot be updated for an existing rule.
     *
     * @param resourceUri the resourceUri value to set.
     * @return the RuleDataSource object itself.
     */
    public RuleDataSource withResourceUri(String resourceUri) {
        this.resourceUri = resourceUri;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
