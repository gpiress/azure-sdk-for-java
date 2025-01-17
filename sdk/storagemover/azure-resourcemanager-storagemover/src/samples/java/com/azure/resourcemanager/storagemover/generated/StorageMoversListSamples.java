// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.storagemover.generated;

/** Samples for StorageMovers List. */
public final class StorageMoversListSamples {
    /*
     * x-ms-original-file: specification/storagemover/resource-manager/Microsoft.StorageMover/preview/2023-07-01-preview/examples/StorageMovers_ListBySubscription.json
     */
    /**
     * Sample code: StorageMovers_List.
     *
     * @param manager Entry point to StorageMoverManager.
     */
    public static void storageMoversList(com.azure.resourcemanager.storagemover.StorageMoverManager manager) {
        manager.storageMovers().list(com.azure.core.util.Context.NONE);
    }
}
