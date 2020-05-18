// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.sql;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ServerDnsAliasAcquisition model. */
@Fluent
public final class ServerDnsAliasAcquisition {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ServerDnsAliasAcquisition.class);

    /*
     * The id of the server alias that will be acquired to point to this server
     * instead.
     */
    @JsonProperty(value = "oldServerDnsAliasId")
    private String oldServerDnsAliasId;

    /**
     * Get the oldServerDnsAliasId property: The id of the server alias that will be acquired to point to this server
     * instead.
     *
     * @return the oldServerDnsAliasId value.
     */
    public String oldServerDnsAliasId() {
        return this.oldServerDnsAliasId;
    }

    /**
     * Set the oldServerDnsAliasId property: The id of the server alias that will be acquired to point to this server
     * instead.
     *
     * @param oldServerDnsAliasId the oldServerDnsAliasId value to set.
     * @return the ServerDnsAliasAcquisition object itself.
     */
    public ServerDnsAliasAcquisition withOldServerDnsAliasId(String oldServerDnsAliasId) {
        this.oldServerDnsAliasId = oldServerDnsAliasId;
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
