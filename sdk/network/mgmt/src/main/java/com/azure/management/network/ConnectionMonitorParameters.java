// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.network;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The ConnectionMonitorParameters model. */
@Fluent
public class ConnectionMonitorParameters {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(ConnectionMonitorParameters.class);

    /*
     * Describes the source of connection monitor.
     */
    @JsonProperty(value = "source", required = true)
    private ConnectionMonitorSource source;

    /*
     * Describes the destination of connection monitor.
     */
    @JsonProperty(value = "destination", required = true)
    private ConnectionMonitorDestination destination;

    /*
     * Determines if the connection monitor will start automatically once
     * created.
     */
    @JsonProperty(value = "autoStart")
    private Boolean autoStart;

    /*
     * Monitoring interval in seconds.
     */
    @JsonProperty(value = "monitoringIntervalInSeconds")
    private Integer monitoringIntervalInSeconds;

    /**
     * Get the source property: Describes the source of connection monitor.
     *
     * @return the source value.
     */
    public ConnectionMonitorSource source() {
        return this.source;
    }

    /**
     * Set the source property: Describes the source of connection monitor.
     *
     * @param source the source value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withSource(ConnectionMonitorSource source) {
        this.source = source;
        return this;
    }

    /**
     * Get the destination property: Describes the destination of connection monitor.
     *
     * @return the destination value.
     */
    public ConnectionMonitorDestination destination() {
        return this.destination;
    }

    /**
     * Set the destination property: Describes the destination of connection monitor.
     *
     * @param destination the destination value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withDestination(ConnectionMonitorDestination destination) {
        this.destination = destination;
        return this;
    }

    /**
     * Get the autoStart property: Determines if the connection monitor will start automatically once created.
     *
     * @return the autoStart value.
     */
    public Boolean autoStart() {
        return this.autoStart;
    }

    /**
     * Set the autoStart property: Determines if the connection monitor will start automatically once created.
     *
     * @param autoStart the autoStart value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
        return this;
    }

    /**
     * Get the monitoringIntervalInSeconds property: Monitoring interval in seconds.
     *
     * @return the monitoringIntervalInSeconds value.
     */
    public Integer monitoringIntervalInSeconds() {
        return this.monitoringIntervalInSeconds;
    }

    /**
     * Set the monitoringIntervalInSeconds property: Monitoring interval in seconds.
     *
     * @param monitoringIntervalInSeconds the monitoringIntervalInSeconds value to set.
     * @return the ConnectionMonitorParameters object itself.
     */
    public ConnectionMonitorParameters withMonitoringIntervalInSeconds(Integer monitoringIntervalInSeconds) {
        this.monitoringIntervalInSeconds = monitoringIntervalInSeconds;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (source() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property source in model ConnectionMonitorParameters"));
        } else {
            source().validate();
        }
        if (destination() == null) {
            throw logger
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property destination in model ConnectionMonitorParameters"));
        } else {
            destination().validate();
        }
    }
}
