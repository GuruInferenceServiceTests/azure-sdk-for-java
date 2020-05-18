// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.containerservice.OrchestratorVersionProfile;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OrchestratorVersionProfileListResult model. */
@JsonFlatten
@Fluent
public class OrchestratorVersionProfileListResultInner {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OrchestratorVersionProfileListResultInner.class);

    /*
     * Id of the orchestrator version profile list result.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * Name of the orchestrator version profile list result.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private String name;

    /*
     * Type of the orchestrator version profile list result.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * List of orchestrator version profiles.
     */
    @JsonProperty(value = "properties.orchestrators", required = true)
    private List<OrchestratorVersionProfile> orchestrators;

    /**
     * Get the id property: Id of the orchestrator version profile list result.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Get the name property: Name of the orchestrator version profile list result.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Get the type property: Type of the orchestrator version profile list result.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the orchestrators property: List of orchestrator version profiles.
     *
     * @return the orchestrators value.
     */
    public List<OrchestratorVersionProfile> orchestrators() {
        return this.orchestrators;
    }

    /**
     * Set the orchestrators property: List of orchestrator version profiles.
     *
     * @param orchestrators the orchestrators value to set.
     * @return the OrchestratorVersionProfileListResultInner object itself.
     */
    public OrchestratorVersionProfileListResultInner withOrchestrators(List<OrchestratorVersionProfile> orchestrators) {
        this.orchestrators = orchestrators;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (orchestrators() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property orchestrators in model OrchestratorVersionProfileListResultInner"));
        } else {
            orchestrators().forEach(e -> e.validate());
        }
    }
}
