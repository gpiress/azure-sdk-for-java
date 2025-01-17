// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.azurestackhci.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.azurestackhci.models.ArcSettingAggregateState;
import com.azure.resourcemanager.azurestackhci.models.PerNodeState;
import com.azure.resourcemanager.azurestackhci.models.ProvisioningState;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** ArcSetting properties. */
@Fluent
public final class ArcSettingProperties {
    /*
     * Provisioning state of the ArcSetting proxy resource.
     */
    @JsonProperty(value = "provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private ProvisioningState provisioningState;

    /*
     * The resource group that hosts the Arc agents, ie. Hybrid Compute Machine
     * resources.
     */
    @JsonProperty(value = "arcInstanceResourceGroup")
    private String arcInstanceResourceGroup;

    /*
     * App id of arc AAD identity.
     */
    @JsonProperty(value = "arcApplicationClientId")
    private String arcApplicationClientId;

    /*
     * Tenant id of arc AAD identity.
     */
    @JsonProperty(value = "arcApplicationTenantId")
    private String arcApplicationTenantId;

    /*
     * Object id of arc AAD service principal.
     */
    @JsonProperty(value = "arcServicePrincipalObjectId")
    private String arcServicePrincipalObjectId;

    /*
     * Object id of arc AAD identity.
     */
    @JsonProperty(value = "arcApplicationObjectId")
    private String arcApplicationObjectId;

    /*
     * Aggregate state of Arc agent across the nodes in this HCI cluster.
     */
    @JsonProperty(value = "aggregateState", access = JsonProperty.Access.WRITE_ONLY)
    private ArcSettingAggregateState aggregateState;

    /*
     * State of Arc agent in each of the nodes.
     */
    @JsonProperty(value = "perNodeDetails", access = JsonProperty.Access.WRITE_ONLY)
    private List<PerNodeState> perNodeDetails;

    /*
     * contains connectivity related configuration for ARC resources
     */
    @JsonProperty(value = "connectivityProperties")
    private Object connectivityProperties;

    /**
     * Get the provisioningState property: Provisioning state of the ArcSetting proxy resource.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the arcInstanceResourceGroup property: The resource group that hosts the Arc agents, ie. Hybrid Compute
     * Machine resources.
     *
     * @return the arcInstanceResourceGroup value.
     */
    public String arcInstanceResourceGroup() {
        return this.arcInstanceResourceGroup;
    }

    /**
     * Set the arcInstanceResourceGroup property: The resource group that hosts the Arc agents, ie. Hybrid Compute
     * Machine resources.
     *
     * @param arcInstanceResourceGroup the arcInstanceResourceGroup value to set.
     * @return the ArcSettingProperties object itself.
     */
    public ArcSettingProperties withArcInstanceResourceGroup(String arcInstanceResourceGroup) {
        this.arcInstanceResourceGroup = arcInstanceResourceGroup;
        return this;
    }

    /**
     * Get the arcApplicationClientId property: App id of arc AAD identity.
     *
     * @return the arcApplicationClientId value.
     */
    public String arcApplicationClientId() {
        return this.arcApplicationClientId;
    }

    /**
     * Set the arcApplicationClientId property: App id of arc AAD identity.
     *
     * @param arcApplicationClientId the arcApplicationClientId value to set.
     * @return the ArcSettingProperties object itself.
     */
    public ArcSettingProperties withArcApplicationClientId(String arcApplicationClientId) {
        this.arcApplicationClientId = arcApplicationClientId;
        return this;
    }

    /**
     * Get the arcApplicationTenantId property: Tenant id of arc AAD identity.
     *
     * @return the arcApplicationTenantId value.
     */
    public String arcApplicationTenantId() {
        return this.arcApplicationTenantId;
    }

    /**
     * Set the arcApplicationTenantId property: Tenant id of arc AAD identity.
     *
     * @param arcApplicationTenantId the arcApplicationTenantId value to set.
     * @return the ArcSettingProperties object itself.
     */
    public ArcSettingProperties withArcApplicationTenantId(String arcApplicationTenantId) {
        this.arcApplicationTenantId = arcApplicationTenantId;
        return this;
    }

    /**
     * Get the arcServicePrincipalObjectId property: Object id of arc AAD service principal.
     *
     * @return the arcServicePrincipalObjectId value.
     */
    public String arcServicePrincipalObjectId() {
        return this.arcServicePrincipalObjectId;
    }

    /**
     * Set the arcServicePrincipalObjectId property: Object id of arc AAD service principal.
     *
     * @param arcServicePrincipalObjectId the arcServicePrincipalObjectId value to set.
     * @return the ArcSettingProperties object itself.
     */
    public ArcSettingProperties withArcServicePrincipalObjectId(String arcServicePrincipalObjectId) {
        this.arcServicePrincipalObjectId = arcServicePrincipalObjectId;
        return this;
    }

    /**
     * Get the arcApplicationObjectId property: Object id of arc AAD identity.
     *
     * @return the arcApplicationObjectId value.
     */
    public String arcApplicationObjectId() {
        return this.arcApplicationObjectId;
    }

    /**
     * Set the arcApplicationObjectId property: Object id of arc AAD identity.
     *
     * @param arcApplicationObjectId the arcApplicationObjectId value to set.
     * @return the ArcSettingProperties object itself.
     */
    public ArcSettingProperties withArcApplicationObjectId(String arcApplicationObjectId) {
        this.arcApplicationObjectId = arcApplicationObjectId;
        return this;
    }

    /**
     * Get the aggregateState property: Aggregate state of Arc agent across the nodes in this HCI cluster.
     *
     * @return the aggregateState value.
     */
    public ArcSettingAggregateState aggregateState() {
        return this.aggregateState;
    }

    /**
     * Get the perNodeDetails property: State of Arc agent in each of the nodes.
     *
     * @return the perNodeDetails value.
     */
    public List<PerNodeState> perNodeDetails() {
        return this.perNodeDetails;
    }

    /**
     * Get the connectivityProperties property: contains connectivity related configuration for ARC resources.
     *
     * @return the connectivityProperties value.
     */
    public Object connectivityProperties() {
        return this.connectivityProperties;
    }

    /**
     * Set the connectivityProperties property: contains connectivity related configuration for ARC resources.
     *
     * @param connectivityProperties the connectivityProperties value to set.
     * @return the ArcSettingProperties object itself.
     */
    public ArcSettingProperties withConnectivityProperties(Object connectivityProperties) {
        this.connectivityProperties = connectivityProperties;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (perNodeDetails() != null) {
            perNodeDetails().forEach(e -> e.validate());
        }
    }
}
