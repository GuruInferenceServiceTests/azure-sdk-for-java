/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.network.v2019_09_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * AzureFirewall NAT Rule Collection Action.
 */
public class AzureFirewallNatRCAction {
    /**
     * The type of action. Possible values include: 'Snat', 'Dnat'.
     */
    @JsonProperty(value = "type")
    private AzureFirewallNatRCActionType type;

    /**
     * Get the type of action. Possible values include: 'Snat', 'Dnat'.
     *
     * @return the type value
     */
    public AzureFirewallNatRCActionType type() {
        return this.type;
    }

    /**
     * Set the type of action. Possible values include: 'Snat', 'Dnat'.
     *
     * @param type the type value to set
     * @return the AzureFirewallNatRCAction object itself.
     */
    public AzureFirewallNatRCAction withType(AzureFirewallNatRCActionType type) {
        this.type = type;
        return this;
    }

}