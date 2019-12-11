/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.machinelearningservices.v2019_05_01;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Admin credentials for virtual machine.
 */
public class VirtualMachineSshCredentials {
    /**
     * Username of admin account.
     */
    @JsonProperty(value = "username")
    private String username;

    /**
     * Password of admin account.
     */
    @JsonProperty(value = "password")
    private String password;

    /**
     * Public key data.
     */
    @JsonProperty(value = "publicKeyData")
    private String publicKeyData;

    /**
     * Private key data.
     */
    @JsonProperty(value = "privateKeyData")
    private String privateKeyData;

    /**
     * Get username of admin account.
     *
     * @return the username value
     */
    public String username() {
        return this.username;
    }

    /**
     * Set username of admin account.
     *
     * @param username the username value to set
     * @return the VirtualMachineSshCredentials object itself.
     */
    public VirtualMachineSshCredentials withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * Get password of admin account.
     *
     * @return the password value
     */
    public String password() {
        return this.password;
    }

    /**
     * Set password of admin account.
     *
     * @param password the password value to set
     * @return the VirtualMachineSshCredentials object itself.
     */
    public VirtualMachineSshCredentials withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * Get public key data.
     *
     * @return the publicKeyData value
     */
    public String publicKeyData() {
        return this.publicKeyData;
    }

    /**
     * Set public key data.
     *
     * @param publicKeyData the publicKeyData value to set
     * @return the VirtualMachineSshCredentials object itself.
     */
    public VirtualMachineSshCredentials withPublicKeyData(String publicKeyData) {
        this.publicKeyData = publicKeyData;
        return this;
    }

    /**
     * Get private key data.
     *
     * @return the privateKeyData value
     */
    public String privateKeyData() {
        return this.privateKeyData;
    }

    /**
     * Set private key data.
     *
     * @param privateKeyData the privateKeyData value to set
     * @return the VirtualMachineSshCredentials object itself.
     */
    public VirtualMachineSshCredentials withPrivateKeyData(String privateKeyData) {
        this.privateKeyData = privateKeyData;
        return this;
    }

}