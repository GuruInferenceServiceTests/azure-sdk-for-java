// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.appservice;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The AbnormalTimePeriod model. */
@Fluent
public final class AbnormalTimePeriod {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AbnormalTimePeriod.class);

    /*
     * Start time of the downtime
     */
    @JsonProperty(value = "startTime")
    private OffsetDateTime startTime;

    /*
     * End time of the downtime
     */
    @JsonProperty(value = "endTime")
    private OffsetDateTime endTime;

    /*
     * List of Possible Cause of downtime
     */
    @JsonProperty(value = "events")
    private List<DetectorAbnormalTimePeriod> events;

    /*
     * List of proposed solutions
     */
    @JsonProperty(value = "solutions")
    private List<Solution> solutions;

    /**
     * Get the startTime property: Start time of the downtime.
     *
     * @return the startTime value.
     */
    public OffsetDateTime startTime() {
        return this.startTime;
    }

    /**
     * Set the startTime property: Start time of the downtime.
     *
     * @param startTime the startTime value to set.
     * @return the AbnormalTimePeriod object itself.
     */
    public AbnormalTimePeriod withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * Get the endTime property: End time of the downtime.
     *
     * @return the endTime value.
     */
    public OffsetDateTime endTime() {
        return this.endTime;
    }

    /**
     * Set the endTime property: End time of the downtime.
     *
     * @param endTime the endTime value to set.
     * @return the AbnormalTimePeriod object itself.
     */
    public AbnormalTimePeriod withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * Get the events property: List of Possible Cause of downtime.
     *
     * @return the events value.
     */
    public List<DetectorAbnormalTimePeriod> events() {
        return this.events;
    }

    /**
     * Set the events property: List of Possible Cause of downtime.
     *
     * @param events the events value to set.
     * @return the AbnormalTimePeriod object itself.
     */
    public AbnormalTimePeriod withEvents(List<DetectorAbnormalTimePeriod> events) {
        this.events = events;
        return this;
    }

    /**
     * Get the solutions property: List of proposed solutions.
     *
     * @return the solutions value.
     */
    public List<Solution> solutions() {
        return this.solutions;
    }

    /**
     * Set the solutions property: List of proposed solutions.
     *
     * @param solutions the solutions value to set.
     * @return the AbnormalTimePeriod object itself.
     */
    public AbnormalTimePeriod withSolutions(List<Solution> solutions) {
        this.solutions = solutions;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (events() != null) {
            events().forEach(e -> e.validate());
        }
        if (solutions() != null) {
            solutions().forEach(e -> e.validate());
        }
    }
}
