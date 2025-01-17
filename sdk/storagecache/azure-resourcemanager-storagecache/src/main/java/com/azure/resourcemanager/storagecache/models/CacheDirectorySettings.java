// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagecache.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Cache Directory Services settings. */
@Fluent
public final class CacheDirectorySettings {
    /*
     * Specifies settings for joining the HPC Cache to an Active Directory domain.
     */
    @JsonProperty(value = "activeDirectory")
    private CacheActiveDirectorySettings activeDirectory;

    /*
     * Specifies settings for Extended Groups. Extended Groups allows users to be members of more than 16 groups.
     */
    @JsonProperty(value = "usernameDownload")
    private CacheUsernameDownloadSettings usernameDownload;

    /** Creates an instance of CacheDirectorySettings class. */
    public CacheDirectorySettings() {
    }

    /**
     * Get the activeDirectory property: Specifies settings for joining the HPC Cache to an Active Directory domain.
     *
     * @return the activeDirectory value.
     */
    public CacheActiveDirectorySettings activeDirectory() {
        return this.activeDirectory;
    }

    /**
     * Set the activeDirectory property: Specifies settings for joining the HPC Cache to an Active Directory domain.
     *
     * @param activeDirectory the activeDirectory value to set.
     * @return the CacheDirectorySettings object itself.
     */
    public CacheDirectorySettings withActiveDirectory(CacheActiveDirectorySettings activeDirectory) {
        this.activeDirectory = activeDirectory;
        return this;
    }

    /**
     * Get the usernameDownload property: Specifies settings for Extended Groups. Extended Groups allows users to be
     * members of more than 16 groups.
     *
     * @return the usernameDownload value.
     */
    public CacheUsernameDownloadSettings usernameDownload() {
        return this.usernameDownload;
    }

    /**
     * Set the usernameDownload property: Specifies settings for Extended Groups. Extended Groups allows users to be
     * members of more than 16 groups.
     *
     * @param usernameDownload the usernameDownload value to set.
     * @return the CacheDirectorySettings object itself.
     */
    public CacheDirectorySettings withUsernameDownload(CacheUsernameDownloadSettings usernameDownload) {
        this.usernameDownload = usernameDownload;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (activeDirectory() != null) {
            activeDirectory().validate();
        }
        if (usernameDownload() != null) {
            usernameDownload().validate();
        }
    }
}
