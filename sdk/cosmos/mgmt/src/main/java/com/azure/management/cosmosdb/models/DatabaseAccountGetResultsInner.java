// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.cosmosdb.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.core.util.logging.ClientLogger;
import com.azure.management.cosmosdb.ArmResourceProperties;
import com.azure.management.cosmosdb.Capability;
import com.azure.management.cosmosdb.ConnectorOffer;
import com.azure.management.cosmosdb.ConsistencyPolicy;
import com.azure.management.cosmosdb.DatabaseAccountKind;
import com.azure.management.cosmosdb.DatabaseAccountOfferType;
import com.azure.management.cosmosdb.FailoverPolicy;
import com.azure.management.cosmosdb.Location;
import com.azure.management.cosmosdb.VirtualNetworkRule;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** The DatabaseAccountGetResults model. */
@JsonFlatten
@Fluent
public class DatabaseAccountGetResultsInner extends ArmResourceProperties {
    @JsonIgnore private final ClientLogger logger = new ClientLogger(DatabaseAccountGetResultsInner.class);

    /*
     * Indicates the type of database account. This can only be set at database
     * account creation.
     */
    @JsonProperty(value = "kind")
    private DatabaseAccountKind kind;

    /*
     * The status of the Cosmos DB account at the time the operation was
     * called. The status can be one of following. 'Creating' – the Cosmos DB
     * account is being created. When an account is in Creating state, only
     * properties that are specified as input for the Create Cosmos DB account
     * operation are returned. 'Succeeded' – the Cosmos DB account is active
     * for use. 'Updating' – the Cosmos DB account is being updated. 'Deleting'
     * – the Cosmos DB account is being deleted. 'Failed' – the Cosmos DB
     * account failed creation. 'Offline' - the Cosmos DB account is not
     * active. 'DeletionFailed' – the Cosmos DB account deletion failed.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /*
     * The connection endpoint for the Cosmos DB database account.
     */
    @JsonProperty(value = "properties.documentEndpoint", access = JsonProperty.Access.WRITE_ONLY)
    private String documentEndpoint;

    /*
     * The offer type for the Cosmos DB database account. Default value:
     * Standard.
     */
    @JsonProperty(value = "properties.databaseAccountOfferType", access = JsonProperty.Access.WRITE_ONLY)
    private DatabaseAccountOfferType databaseAccountOfferType;

    /*
     * Cosmos DB Firewall Support: This value specifies the set of IP addresses
     * or IP address ranges in CIDR form to be included as the allowed list of
     * client IPs for a given database account. IP addresses/ranges must be
     * comma separated and must not contain any spaces.
     */
    @JsonProperty(value = "properties.ipRangeFilter")
    private String ipRangeFilter;

    /*
     * Flag to indicate whether to enable/disable Virtual Network ACL rules.
     */
    @JsonProperty(value = "properties.isVirtualNetworkFilterEnabled")
    private Boolean isVirtualNetworkFilterEnabled;

    /*
     * Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will
     * result in a new write region for the account and is chosen based on the
     * failover priorities configured for the account.
     */
    @JsonProperty(value = "properties.enableAutomaticFailover")
    private Boolean enableAutomaticFailover;

    /*
     * The consistency policy for the Cosmos DB database account.
     */
    @JsonProperty(value = "properties.consistencyPolicy")
    private ConsistencyPolicy consistencyPolicy;

    /*
     * List of Cosmos DB capabilities for the account
     */
    @JsonProperty(value = "properties.capabilities")
    private List<Capability> capabilities;

    /*
     * An array that contains the write location for the Cosmos DB account.
     */
    @JsonProperty(value = "properties.writeLocations", access = JsonProperty.Access.WRITE_ONLY)
    private List<Location> writeLocations;

    /*
     * An array that contains of the read locations enabled for the Cosmos DB
     * account.
     */
    @JsonProperty(value = "properties.readLocations", access = JsonProperty.Access.WRITE_ONLY)
    private List<Location> readLocations;

    /*
     * An array that contains all of the locations enabled for the Cosmos DB
     * account.
     */
    @JsonProperty(value = "properties.locations", access = JsonProperty.Access.WRITE_ONLY)
    private List<Location> locations;

    /*
     * An array that contains the regions ordered by their failover priorities.
     */
    @JsonProperty(value = "properties.failoverPolicies", access = JsonProperty.Access.WRITE_ONLY)
    private List<FailoverPolicy> failoverPolicies;

    /*
     * List of Virtual Network ACL rules configured for the Cosmos DB account.
     */
    @JsonProperty(value = "properties.virtualNetworkRules")
    private List<VirtualNetworkRule> virtualNetworkRules;

    /*
     * Enables the account to write in multiple locations
     */
    @JsonProperty(value = "properties.enableMultipleWriteLocations")
    private Boolean enableMultipleWriteLocations;

    /*
     * Enables the cassandra connector on the Cosmos DB C* account
     */
    @JsonProperty(value = "properties.enableCassandraConnector")
    private Boolean enableCassandraConnector;

    /*
     * The cassandra connector offer type for the Cosmos DB database C*
     * account.
     */
    @JsonProperty(value = "properties.connectorOffer")
    private ConnectorOffer connectorOffer;

    /*
     * Disable write operations on metadata resources (databases, containers,
     * throughput) via account keys
     */
    @JsonProperty(value = "properties.disableKeyBasedMetadataWriteAccess")
    private Boolean disableKeyBasedMetadataWriteAccess;

    /**
     * Get the kind property: Indicates the type of database account. This can only be set at database account creation.
     *
     * @return the kind value.
     */
    public DatabaseAccountKind kind() {
        return this.kind;
    }

    /**
     * Set the kind property: Indicates the type of database account. This can only be set at database account creation.
     *
     * @param kind the kind value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withKind(DatabaseAccountKind kind) {
        this.kind = kind;
        return this;
    }

    /**
     * Get the provisioningState property: The status of the Cosmos DB account at the time the operation was called. The
     * status can be one of following. 'Creating' – the Cosmos DB account is being created. When an account is in
     * Creating state, only properties that are specified as input for the Create Cosmos DB account operation are
     * returned. 'Succeeded' – the Cosmos DB account is active for use. 'Updating' – the Cosmos DB account is being
     * updated. 'Deleting' – the Cosmos DB account is being deleted. 'Failed' – the Cosmos DB account failed creation.
     * 'Offline' - the Cosmos DB account is not active. 'DeletionFailed' – the Cosmos DB account deletion failed.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the documentEndpoint property: The connection endpoint for the Cosmos DB database account.
     *
     * @return the documentEndpoint value.
     */
    public String documentEndpoint() {
        return this.documentEndpoint;
    }

    /**
     * Get the databaseAccountOfferType property: The offer type for the Cosmos DB database account. Default value:
     * Standard.
     *
     * @return the databaseAccountOfferType value.
     */
    public DatabaseAccountOfferType databaseAccountOfferType() {
        return this.databaseAccountOfferType;
    }

    /**
     * Get the ipRangeFilter property: Cosmos DB Firewall Support: This value specifies the set of IP addresses or IP
     * address ranges in CIDR form to be included as the allowed list of client IPs for a given database account. IP
     * addresses/ranges must be comma separated and must not contain any spaces.
     *
     * @return the ipRangeFilter value.
     */
    public String ipRangeFilter() {
        return this.ipRangeFilter;
    }

    /**
     * Set the ipRangeFilter property: Cosmos DB Firewall Support: This value specifies the set of IP addresses or IP
     * address ranges in CIDR form to be included as the allowed list of client IPs for a given database account. IP
     * addresses/ranges must be comma separated and must not contain any spaces.
     *
     * @param ipRangeFilter the ipRangeFilter value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withIpRangeFilter(String ipRangeFilter) {
        this.ipRangeFilter = ipRangeFilter;
        return this;
    }

    /**
     * Get the isVirtualNetworkFilterEnabled property: Flag to indicate whether to enable/disable Virtual Network ACL
     * rules.
     *
     * @return the isVirtualNetworkFilterEnabled value.
     */
    public Boolean isVirtualNetworkFilterEnabled() {
        return this.isVirtualNetworkFilterEnabled;
    }

    /**
     * Set the isVirtualNetworkFilterEnabled property: Flag to indicate whether to enable/disable Virtual Network ACL
     * rules.
     *
     * @param isVirtualNetworkFilterEnabled the isVirtualNetworkFilterEnabled value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withIsVirtualNetworkFilterEnabled(Boolean isVirtualNetworkFilterEnabled) {
        this.isVirtualNetworkFilterEnabled = isVirtualNetworkFilterEnabled;
        return this;
    }

    /**
     * Get the enableAutomaticFailover property: Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will result in a new write region for the account
     * and is chosen based on the failover priorities configured for the account.
     *
     * @return the enableAutomaticFailover value.
     */
    public Boolean enableAutomaticFailover() {
        return this.enableAutomaticFailover;
    }

    /**
     * Set the enableAutomaticFailover property: Enables automatic failover of the write region in the rare event that
     * the region is unavailable due to an outage. Automatic failover will result in a new write region for the account
     * and is chosen based on the failover priorities configured for the account.
     *
     * @param enableAutomaticFailover the enableAutomaticFailover value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withEnableAutomaticFailover(Boolean enableAutomaticFailover) {
        this.enableAutomaticFailover = enableAutomaticFailover;
        return this;
    }

    /**
     * Get the consistencyPolicy property: The consistency policy for the Cosmos DB database account.
     *
     * @return the consistencyPolicy value.
     */
    public ConsistencyPolicy consistencyPolicy() {
        return this.consistencyPolicy;
    }

    /**
     * Set the consistencyPolicy property: The consistency policy for the Cosmos DB database account.
     *
     * @param consistencyPolicy the consistencyPolicy value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withConsistencyPolicy(ConsistencyPolicy consistencyPolicy) {
        this.consistencyPolicy = consistencyPolicy;
        return this;
    }

    /**
     * Get the capabilities property: List of Cosmos DB capabilities for the account.
     *
     * @return the capabilities value.
     */
    public List<Capability> capabilities() {
        return this.capabilities;
    }

    /**
     * Set the capabilities property: List of Cosmos DB capabilities for the account.
     *
     * @param capabilities the capabilities value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withCapabilities(List<Capability> capabilities) {
        this.capabilities = capabilities;
        return this;
    }

    /**
     * Get the writeLocations property: An array that contains the write location for the Cosmos DB account.
     *
     * @return the writeLocations value.
     */
    public List<Location> writeLocations() {
        return this.writeLocations;
    }

    /**
     * Get the readLocations property: An array that contains of the read locations enabled for the Cosmos DB account.
     *
     * @return the readLocations value.
     */
    public List<Location> readLocations() {
        return this.readLocations;
    }

    /**
     * Get the locations property: An array that contains all of the locations enabled for the Cosmos DB account.
     *
     * @return the locations value.
     */
    public List<Location> locations() {
        return this.locations;
    }

    /**
     * Get the failoverPolicies property: An array that contains the regions ordered by their failover priorities.
     *
     * @return the failoverPolicies value.
     */
    public List<FailoverPolicy> failoverPolicies() {
        return this.failoverPolicies;
    }

    /**
     * Get the virtualNetworkRules property: List of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @return the virtualNetworkRules value.
     */
    public List<VirtualNetworkRule> virtualNetworkRules() {
        return this.virtualNetworkRules;
    }

    /**
     * Set the virtualNetworkRules property: List of Virtual Network ACL rules configured for the Cosmos DB account.
     *
     * @param virtualNetworkRules the virtualNetworkRules value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withVirtualNetworkRules(List<VirtualNetworkRule> virtualNetworkRules) {
        this.virtualNetworkRules = virtualNetworkRules;
        return this;
    }

    /**
     * Get the enableMultipleWriteLocations property: Enables the account to write in multiple locations.
     *
     * @return the enableMultipleWriteLocations value.
     */
    public Boolean enableMultipleWriteLocations() {
        return this.enableMultipleWriteLocations;
    }

    /**
     * Set the enableMultipleWriteLocations property: Enables the account to write in multiple locations.
     *
     * @param enableMultipleWriteLocations the enableMultipleWriteLocations value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withEnableMultipleWriteLocations(Boolean enableMultipleWriteLocations) {
        this.enableMultipleWriteLocations = enableMultipleWriteLocations;
        return this;
    }

    /**
     * Get the enableCassandraConnector property: Enables the cassandra connector on the Cosmos DB C* account.
     *
     * @return the enableCassandraConnector value.
     */
    public Boolean enableCassandraConnector() {
        return this.enableCassandraConnector;
    }

    /**
     * Set the enableCassandraConnector property: Enables the cassandra connector on the Cosmos DB C* account.
     *
     * @param enableCassandraConnector the enableCassandraConnector value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withEnableCassandraConnector(Boolean enableCassandraConnector) {
        this.enableCassandraConnector = enableCassandraConnector;
        return this;
    }

    /**
     * Get the connectorOffer property: The cassandra connector offer type for the Cosmos DB database C* account.
     *
     * @return the connectorOffer value.
     */
    public ConnectorOffer connectorOffer() {
        return this.connectorOffer;
    }

    /**
     * Set the connectorOffer property: The cassandra connector offer type for the Cosmos DB database C* account.
     *
     * @param connectorOffer the connectorOffer value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withConnectorOffer(ConnectorOffer connectorOffer) {
        this.connectorOffer = connectorOffer;
        return this;
    }

    /**
     * Get the disableKeyBasedMetadataWriteAccess property: Disable write operations on metadata resources (databases,
     * containers, throughput) via account keys.
     *
     * @return the disableKeyBasedMetadataWriteAccess value.
     */
    public Boolean disableKeyBasedMetadataWriteAccess() {
        return this.disableKeyBasedMetadataWriteAccess;
    }

    /**
     * Set the disableKeyBasedMetadataWriteAccess property: Disable write operations on metadata resources (databases,
     * containers, throughput) via account keys.
     *
     * @param disableKeyBasedMetadataWriteAccess the disableKeyBasedMetadataWriteAccess value to set.
     * @return the DatabaseAccountGetResultsInner object itself.
     */
    public DatabaseAccountGetResultsInner withDisableKeyBasedMetadataWriteAccess(
        Boolean disableKeyBasedMetadataWriteAccess) {
        this.disableKeyBasedMetadataWriteAccess = disableKeyBasedMetadataWriteAccess;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (consistencyPolicy() != null) {
            consistencyPolicy().validate();
        }
        if (capabilities() != null) {
            capabilities().forEach(e -> e.validate());
        }
        if (writeLocations() != null) {
            writeLocations().forEach(e -> e.validate());
        }
        if (readLocations() != null) {
            readLocations().forEach(e -> e.validate());
        }
        if (locations() != null) {
            locations().forEach(e -> e.validate());
        }
        if (failoverPolicies() != null) {
            failoverPolicies().forEach(e -> e.validate());
        }
        if (virtualNetworkRules() != null) {
            virtualNetworkRules().forEach(e -> e.validate());
        }
    }
}
