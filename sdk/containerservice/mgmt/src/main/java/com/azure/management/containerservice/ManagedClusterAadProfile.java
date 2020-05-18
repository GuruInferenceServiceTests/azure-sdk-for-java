// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.containerservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ManagedClusterAadProfile model. */
@Fluent
public final class ManagedClusterAadProfile {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ManagedClusterAadProfile.class);

    /*
     * The client AAD application ID.
     */
    @JsonProperty(value = "clientAppID", required = true)
    private String clientAppId;

    /*
     * The server AAD application ID.
     */
    @JsonProperty(value = "serverAppID", required = true)
    private String serverAppId;

    /*
     * The server AAD application secret.
     */
    @JsonProperty(value = "serverAppSecret")
    private String serverAppSecret;

    /*
     * The AAD tenant ID to use for authentication. If not specified, will use
     * the tenant of the deployment subscription.
     */
    @JsonProperty(value = "tenantID")
    private String tenantId;

    /**
     * Get the clientAppId property: The client AAD application ID.
     *
     * @return the clientAppId value.
     */
    public String clientAppId() {
        return this.clientAppId;
    }

    /**
     * Set the clientAppId property: The client AAD application ID.
     *
     * @param clientAppId the clientAppId value to set.
     * @return the ManagedClusterAadProfile object itself.
     */
    public ManagedClusterAadProfile withClientAppId(String clientAppId) {
        this.clientAppId = clientAppId;
        return this;
    }

    /**
     * Get the serverAppId property: The server AAD application ID.
     *
     * @return the serverAppId value.
     */
    public String serverAppId() {
        return this.serverAppId;
    }

    /**
     * Set the serverAppId property: The server AAD application ID.
     *
     * @param serverAppId the serverAppId value to set.
     * @return the ManagedClusterAadProfile object itself.
     */
    public ManagedClusterAadProfile withServerAppId(String serverAppId) {
        this.serverAppId = serverAppId;
        return this;
    }

    /**
     * Get the serverAppSecret property: The server AAD application secret.
     *
     * @return the serverAppSecret value.
     */
    public String serverAppSecret() {
        return this.serverAppSecret;
    }

    /**
     * Set the serverAppSecret property: The server AAD application secret.
     *
     * @param serverAppSecret the serverAppSecret value to set.
     * @return the ManagedClusterAadProfile object itself.
     */
    public ManagedClusterAadProfile withServerAppSecret(String serverAppSecret) {
        this.serverAppSecret = serverAppSecret;
        return this;
    }

    /**
     * Get the tenantId property: The AAD tenant ID to use for authentication. If not specified, will use the tenant of
     * the deployment subscription.
     *
     * @return the tenantId value.
     */
    public String tenantId() {
        return this.tenantId;
    }

    /**
     * Set the tenantId property: The AAD tenant ID to use for authentication. If not specified, will use the tenant of
     * the deployment subscription.
     *
     * @param tenantId the tenantId value to set.
     * @return the ManagedClusterAadProfile object itself.
     */
    public ManagedClusterAadProfile withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (clientAppId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property clientAppId in model ManagedClusterAadProfile"));
        }
        if (serverAppId() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property serverAppId in model ManagedClusterAadProfile"));
        }
    }
}
