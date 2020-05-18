// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The OpenShiftManagedClusterAuthProfile model. */
@Fluent
public final class OpenShiftManagedClusterAuthProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(OpenShiftManagedClusterAuthProfile.class);

    /*
     * Type of authentication profile to use.
     */
    @JsonProperty(value = "identityProviders")
    private List<OpenShiftManagedClusterIdentityProvider> identityProviders;

    /**
     * Get the identityProviders property: Type of authentication profile to use.
     *
     * @return the identityProviders value.
     */
    public List<OpenShiftManagedClusterIdentityProvider> identityProviders() {
        return this.identityProviders;
    }

    /**
     * Set the identityProviders property: Type of authentication profile to use.
     *
     * @param identityProviders the identityProviders value to set.
     * @return the OpenShiftManagedClusterAuthProfile object itself.
     */
    public OpenShiftManagedClusterAuthProfile withIdentityProviders(
        List<OpenShiftManagedClusterIdentityProvider> identityProviders) {
        this.identityProviders = identityProviders;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (identityProviders() != null) {
            identityProviders().forEach(e -> e.validate());
        }
    }
}
