// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.models.RestoreJobRecoveryPointDetails;
import java.time.OffsetDateTime;
import org.junit.jupiter.api.Assertions;

public final class RestoreJobRecoveryPointDetailsTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        RestoreJobRecoveryPointDetails model =
            BinaryData
                .fromString("{\"recoveryPointID\":\"xb\",\"recoveryPointTime\":\"2021-08-16T05:09:52Z\"}")
                .toObject(RestoreJobRecoveryPointDetails.class);
        Assertions.assertEquals("xb", model.recoveryPointId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-16T05:09:52Z"), model.recoveryPointTime());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        RestoreJobRecoveryPointDetails model =
            new RestoreJobRecoveryPointDetails()
                .withRecoveryPointId("xb")
                .withRecoveryPointTime(OffsetDateTime.parse("2021-08-16T05:09:52Z"));
        model = BinaryData.fromObject(model).toObject(RestoreJobRecoveryPointDetails.class);
        Assertions.assertEquals("xb", model.recoveryPointId());
        Assertions.assertEquals(OffsetDateTime.parse("2021-08-16T05:09:52Z"), model.recoveryPointTime());
    }
}
