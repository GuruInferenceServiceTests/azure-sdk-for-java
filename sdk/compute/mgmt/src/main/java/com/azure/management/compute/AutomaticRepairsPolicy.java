// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.compute;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** The AutomaticRepairsPolicy model. */
@Fluent
public final class AutomaticRepairsPolicy {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(AutomaticRepairsPolicy.class);

    /*
     * Specifies whether automatic repairs should be enabled on the virtual
     * machine scale set. The default value is false.
     */
    @JsonProperty(value = "enabled")
    private Boolean enabled;

    /*
     * The amount of time for which automatic repairs are suspended due to a
     * state change on VM. The grace time starts after the state change has
     * completed. This helps avoid premature or accidental repairs. The time
     * duration should be specified in ISO 8601 format. The minimum allowed
     * grace period is 30 minutes (PT30M), which is also the default value. The
     * maximum allowed grace period is 90 minutes (PT90M).
     */
    @JsonProperty(value = "gracePeriod")
    private String gracePeriod;

    /**
     * Get the enabled property: Specifies whether automatic repairs should be enabled on the virtual machine scale set.
     * The default value is false.
     *
     * @return the enabled value.
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled property: Specifies whether automatic repairs should be enabled on the virtual machine scale set.
     * The default value is false.
     *
     * @param enabled the enabled value to set.
     * @return the AutomaticRepairsPolicy object itself.
     */
    public AutomaticRepairsPolicy withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the gracePeriod property: The amount of time for which automatic repairs are suspended due to a state change
     * on VM. The grace time starts after the state change has completed. This helps avoid premature or accidental
     * repairs. The time duration should be specified in ISO 8601 format. The minimum allowed grace period is 30 minutes
     * (PT30M), which is also the default value. The maximum allowed grace period is 90 minutes (PT90M).
     *
     * @return the gracePeriod value.
     */
    public String gracePeriod() {
        return this.gracePeriod;
    }

    /**
     * Set the gracePeriod property: The amount of time for which automatic repairs are suspended due to a state change
     * on VM. The grace time starts after the state change has completed. This helps avoid premature or accidental
     * repairs. The time duration should be specified in ISO 8601 format. The minimum allowed grace period is 30 minutes
     * (PT30M), which is also the default value. The maximum allowed grace period is 90 minutes (PT90M).
     *
     * @param gracePeriod the gracePeriod value to set.
     * @return the AutomaticRepairsPolicy object itself.
     */
    public AutomaticRepairsPolicy withGracePeriod(String gracePeriod) {
        this.gracePeriod = gracePeriod;
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
