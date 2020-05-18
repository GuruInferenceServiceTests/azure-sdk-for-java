// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.management.SubResource;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The Ipv6ExpressRouteCircuitPeeringConfig model. */
@Fluent
public final class Ipv6ExpressRouteCircuitPeeringConfig {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(Ipv6ExpressRouteCircuitPeeringConfig.class);

    /*
     * The primary address prefix.
     */
    @JsonProperty(value = "primaryPeerAddressPrefix")
    private String primaryPeerAddressPrefix;

    /*
     * The secondary address prefix.
     */
    @JsonProperty(value = "secondaryPeerAddressPrefix")
    private String secondaryPeerAddressPrefix;

    /*
     * The Microsoft peering configuration.
     */
    @JsonProperty(value = "microsoftPeeringConfig")
    private ExpressRouteCircuitPeeringConfig microsoftPeeringConfig;

    /*
     * The reference of the RouteFilter resource.
     */
    @JsonProperty(value = "routeFilter")
    private SubResource routeFilter;

    /*
     * The state of peering.
     */
    @JsonProperty(value = "state")
    private ExpressRouteCircuitPeeringState state;

    /**
     * Get the primaryPeerAddressPrefix property: The primary address prefix.
     *
     * @return the primaryPeerAddressPrefix value.
     */
    public String primaryPeerAddressPrefix() {
        return this.primaryPeerAddressPrefix;
    }

    /**
     * Set the primaryPeerAddressPrefix property: The primary address prefix.
     *
     * @param primaryPeerAddressPrefix the primaryPeerAddressPrefix value to set.
     * @return the Ipv6ExpressRouteCircuitPeeringConfig object itself.
     */
    public Ipv6ExpressRouteCircuitPeeringConfig withPrimaryPeerAddressPrefix(String primaryPeerAddressPrefix) {
        this.primaryPeerAddressPrefix = primaryPeerAddressPrefix;
        return this;
    }

    /**
     * Get the secondaryPeerAddressPrefix property: The secondary address prefix.
     *
     * @return the secondaryPeerAddressPrefix value.
     */
    public String secondaryPeerAddressPrefix() {
        return this.secondaryPeerAddressPrefix;
    }

    /**
     * Set the secondaryPeerAddressPrefix property: The secondary address prefix.
     *
     * @param secondaryPeerAddressPrefix the secondaryPeerAddressPrefix value to set.
     * @return the Ipv6ExpressRouteCircuitPeeringConfig object itself.
     */
    public Ipv6ExpressRouteCircuitPeeringConfig withSecondaryPeerAddressPrefix(String secondaryPeerAddressPrefix) {
        this.secondaryPeerAddressPrefix = secondaryPeerAddressPrefix;
        return this;
    }

    /**
     * Get the microsoftPeeringConfig property: The Microsoft peering configuration.
     *
     * @return the microsoftPeeringConfig value.
     */
    public ExpressRouteCircuitPeeringConfig microsoftPeeringConfig() {
        return this.microsoftPeeringConfig;
    }

    /**
     * Set the microsoftPeeringConfig property: The Microsoft peering configuration.
     *
     * @param microsoftPeeringConfig the microsoftPeeringConfig value to set.
     * @return the Ipv6ExpressRouteCircuitPeeringConfig object itself.
     */
    public Ipv6ExpressRouteCircuitPeeringConfig withMicrosoftPeeringConfig(
        ExpressRouteCircuitPeeringConfig microsoftPeeringConfig) {
        this.microsoftPeeringConfig = microsoftPeeringConfig;
        return this;
    }

    /**
     * Get the routeFilter property: The reference of the RouteFilter resource.
     *
     * @return the routeFilter value.
     */
    public SubResource routeFilter() {
        return this.routeFilter;
    }

    /**
     * Set the routeFilter property: The reference of the RouteFilter resource.
     *
     * @param routeFilter the routeFilter value to set.
     * @return the Ipv6ExpressRouteCircuitPeeringConfig object itself.
     */
    public Ipv6ExpressRouteCircuitPeeringConfig withRouteFilter(SubResource routeFilter) {
        this.routeFilter = routeFilter;
        return this;
    }

    /**
     * Get the state property: The state of peering.
     *
     * @return the state value.
     */
    public ExpressRouteCircuitPeeringState state() {
        return this.state;
    }

    /**
     * Set the state property: The state of peering.
     *
     * @param state the state value to set.
     * @return the Ipv6ExpressRouteCircuitPeeringConfig object itself.
     */
    public Ipv6ExpressRouteCircuitPeeringConfig withState(ExpressRouteCircuitPeeringState state) {
        this.state = state;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (microsoftPeeringConfig() != null) {
            microsoftPeeringConfig().validate();
        }
    }
}
