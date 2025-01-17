// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.dataprotection.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.dataprotection.fluent.models.BackupVaultResourceInner;
import com.azure.resourcemanager.dataprotection.models.AlertsState;
import com.azure.resourcemanager.dataprotection.models.AzureMonitorAlertSettings;
import com.azure.resourcemanager.dataprotection.models.BackupVault;
import com.azure.resourcemanager.dataprotection.models.BackupVaultResourceList;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreSettings;
import com.azure.resourcemanager.dataprotection.models.CrossRegionRestoreState;
import com.azure.resourcemanager.dataprotection.models.CrossSubscriptionRestoreSettings;
import com.azure.resourcemanager.dataprotection.models.CrossSubscriptionRestoreState;
import com.azure.resourcemanager.dataprotection.models.DppIdentityDetails;
import com.azure.resourcemanager.dataprotection.models.FeatureSettings;
import com.azure.resourcemanager.dataprotection.models.ImmutabilitySettings;
import com.azure.resourcemanager.dataprotection.models.ImmutabilityState;
import com.azure.resourcemanager.dataprotection.models.MonitoringSettings;
import com.azure.resourcemanager.dataprotection.models.SecuritySettings;
import com.azure.resourcemanager.dataprotection.models.SoftDeleteSettings;
import com.azure.resourcemanager.dataprotection.models.SoftDeleteState;
import com.azure.resourcemanager.dataprotection.models.StorageSetting;
import com.azure.resourcemanager.dataprotection.models.StorageSettingStoreTypes;
import com.azure.resourcemanager.dataprotection.models.StorageSettingTypes;
import com.azure.resourcemanager.dataprotection.models.UserAssignedIdentity;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Assertions;

public final class BackupVaultResourceListTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        BackupVaultResourceList model =
            BinaryData
                .fromString(
                    "{\"value\":[{\"properties\":{\"monitoringSettings\":{\"azureMonitorAlertSettings\":{\"alertsForAllJobFailures\":\"Disabled\"}},\"provisioningState\":\"Updating\",\"resourceMoveState\":\"InProgress\",\"resourceMoveDetails\":{\"operationId\":\"czmehmtzopbsp\",\"startTimeUtc\":\"upi\",\"completionTimeUtc\":\"sybbejhph\",\"sourceResourcePath\":\"cmsxaobhdxbm\",\"targetResourcePath\":\"ioq\"},\"securitySettings\":{\"softDeleteSettings\":{\"state\":\"On\",\"retentionDurationInDays\":12.53974621306525},\"immutabilitySettings\":{\"state\":\"Locked\"}},\"storageSettings\":[{\"datastoreType\":\"ArchiveStore\",\"type\":\"ZoneRedundant\"}],\"isVaultProtectedByResourceGuard\":false,\"featureSettings\":{\"crossSubscriptionRestoreSettings\":{\"state\":\"Enabled\"},\"crossRegionRestoreSettings\":{\"state\":\"Disabled\"}},\"secureScore\":\"Maximum\"},\"identity\":{\"principalId\":\"gkdmb\",\"tenantId\":\"zlobcufpd\",\"type\":\"rbt\",\"userAssignedIdentities\":{\"qglhq\":{\"principalId\":\"f2d3b8e7-52a0-4f8b-b8c7-36079f909e5d\",\"clientId\":\"0cff634b-fd47-4068-b753-cfe92b8d0770\"},\"foooj\":{\"principalId\":\"0eaa23b0-2246-4ac9-9535-d7a040c9eeb6\",\"clientId\":\"3b924f59-ee26-4a50-a04d-68b9c823eb9a\"},\"fsqesaagdfmglzlh\":{\"principalId\":\"6ed79fac-a234-44ee-8992-1d781ed629a6\",\"clientId\":\"d9e48a54-1d25-4553-a9e1-5b77ad8009fc\"},\"ifkwmrvktsizntoc\":{\"principalId\":\"6145262b-4c14-4055-9825-0c4b1036b8a7\",\"clientId\":\"5bf44891-dd30-45d2-b606-3a01f0586d48\"}}},\"eTag\":\"a\",\"location\":\"ajpsquc\",\"tags\":{\"kfo\":\"yf\"},\"id\":\"knygjofjddeq\",\"name\":\"rd\",\"type\":\"upewnwreitjzy\"},{\"properties\":{\"monitoringSettings\":{\"azureMonitorAlertSettings\":{\"alertsForAllJobFailures\":\"Disabled\"}},\"provisioningState\":\"Updating\",\"resourceMoveState\":\"CommitTimedout\",\"resourceMoveDetails\":{\"operationId\":\"qhsmyurkdtml\",\"startTimeUtc\":\"ekuksjtx\",\"completionTimeUtc\":\"cdm\",\"sourceResourcePath\":\"rcryuanzwuxzdxta\",\"targetResourcePath\":\"lhmwhfpmrqobm\"},\"securitySettings\":{\"softDeleteSettings\":{\"state\":\"AlwaysOn\",\"retentionDurationInDays\":30.42594303603623},\"immutabilitySettings\":{\"state\":\"Unlocked\"}},\"storageSettings\":[{\"datastoreType\":\"OperationalStore\",\"type\":\"ZoneRedundant\"}],\"isVaultProtectedByResourceGuard\":true,\"featureSettings\":{\"crossSubscriptionRestoreSettings\":{\"state\":\"PermanentlyDisabled\"},\"crossRegionRestoreSettings\":{\"state\":\"Enabled\"}},\"secureScore\":\"Maximum\"},\"identity\":{\"principalId\":\"zufcyzkohdbi\",\"tenantId\":\"nufhf\",\"type\":\"jysagith\",\"userAssignedIdentities\":{\"ifpikxwczby\":{\"principalId\":\"ef399efe-6d7b-4c2d-a4e3-61ff69034318\",\"clientId\":\"7db38b12-8fb5-4bc4-8eee-981e777a83be\"}}},\"eTag\":\"npqxuh\",\"location\":\"y\",\"tags\":{\"rkxvdum\":\"wby\",\"xgaudccs\":\"grtfwvu\",\"jcny\":\"h\",\"kryhtnapczwlokj\":\"j\"},\"id\":\"emkkvnipjox\",\"name\":\"jnchgej\",\"type\":\"podmailzydehojwy\"},{\"properties\":{\"monitoringSettings\":{\"azureMonitorAlertSettings\":{\"alertsForAllJobFailures\":\"Enabled\"}},\"provisioningState\":\"Updating\",\"resourceMoveState\":\"CommitTimedout\",\"resourceMoveDetails\":{\"operationId\":\"aqwi\",\"startTimeUtc\":\"sprozvcput\",\"completionTimeUtc\":\"jvwmfda\",\"sourceResourcePath\":\"cmdv\",\"targetResourcePath\":\"hulsuuvmkjozkrwf\"},\"securitySettings\":{\"softDeleteSettings\":{\"state\":\"AlwaysOn\",\"retentionDurationInDays\":59.75135945335241},\"immutabilitySettings\":{\"state\":\"Disabled\"}},\"storageSettings\":[{\"datastoreType\":\"OperationalStore\",\"type\":\"GeoRedundant\"},{\"datastoreType\":\"VaultStore\",\"type\":\"ZoneRedundant\"}],\"isVaultProtectedByResourceGuard\":true,\"featureSettings\":{\"crossSubscriptionRestoreSettings\":{\"state\":\"PermanentlyDisabled\"},\"crossRegionRestoreSettings\":{\"state\":\"Enabled\"}},\"secureScore\":\"None\"},\"identity\":{\"principalId\":\"lahbcryff\",\"tenantId\":\"dosyg\",\"type\":\"paojakhmsbzjh\",\"userAssignedIdentities\":{\"dphlxaolt\":{\"principalId\":\"cbc53dd9-b826-4009-88b3-a2f5261abe4d\",\"clientId\":\"cd7e0a0a-a5e2-4c16-ba4c-e561a5008c3e\"},\"rgqjbpfzfsinzg\":{\"principalId\":\"be86cbae-a4b5-4e66-810c-4b462e1e04dd\",\"clientId\":\"38642b6a-9468-46e6-a44c-361a9720c2a0\"}}},\"eTag\":\"cjrwzoxxjtfellu\",\"location\":\"zitonpeqfpjkjl\",\"tags\":{\"nmayhuybb\":\"pdvhpfxxypin\",\"inuvamiheogn\":\"podepoo\",\"usivye\":\"rxzxtheo\"},\"id\":\"cciqihnhungbwjz\",\"name\":\"nfygxgispemvtz\",\"type\":\"kufubljo\"}],\"nextLink\":\"qeof\"}")
                .toObject(BackupVaultResourceList.class);
        Assertions.assertEquals("qeof", model.nextLink());
        Assertions.assertEquals("ajpsquc", model.value().get(0).location());
        Assertions.assertEquals("yf", model.value().get(0).tags().get("kfo"));
        Assertions.assertEquals("a", model.value().get(0).etag());
        Assertions.assertEquals("rbt", model.value().get(0).identity().type());
        Assertions
            .assertEquals(
                AlertsState.DISABLED,
                model
                    .value()
                    .get(0)
                    .properties()
                    .monitoringSettings()
                    .azureMonitorAlertSettings()
                    .alertsForAllJobFailures());
        Assertions
            .assertEquals(
                SoftDeleteState.ON, model.value().get(0).properties().securitySettings().softDeleteSettings().state());
        Assertions
            .assertEquals(
                12.53974621306525D,
                model.value().get(0).properties().securitySettings().softDeleteSettings().retentionDurationInDays());
        Assertions
            .assertEquals(
                ImmutabilityState.LOCKED,
                model.value().get(0).properties().securitySettings().immutabilitySettings().state());
        Assertions
            .assertEquals(
                StorageSettingStoreTypes.ARCHIVE_STORE,
                model.value().get(0).properties().storageSettings().get(0).datastoreType());
        Assertions
            .assertEquals(
                StorageSettingTypes.ZONE_REDUNDANT, model.value().get(0).properties().storageSettings().get(0).type());
        Assertions
            .assertEquals(
                CrossSubscriptionRestoreState.ENABLED,
                model.value().get(0).properties().featureSettings().crossSubscriptionRestoreSettings().state());
        Assertions
            .assertEquals(
                CrossRegionRestoreState.DISABLED,
                model.value().get(0).properties().featureSettings().crossRegionRestoreSettings().state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        BackupVaultResourceList model =
            new BackupVaultResourceList()
                .withNextLink("qeof")
                .withValue(
                    Arrays
                        .asList(
                            new BackupVaultResourceInner()
                                .withLocation("ajpsquc")
                                .withTags(mapOf("kfo", "yf"))
                                .withEtag("a")
                                .withIdentity(
                                    new DppIdentityDetails()
                                        .withType("rbt")
                                        .withUserAssignedIdentities(
                                            mapOf(
                                                "qglhq",
                                                new UserAssignedIdentity(),
                                                "foooj",
                                                new UserAssignedIdentity(),
                                                "fsqesaagdfmglzlh",
                                                new UserAssignedIdentity(),
                                                "ifkwmrvktsizntoc",
                                                new UserAssignedIdentity())))
                                .withProperties(
                                    new BackupVault()
                                        .withMonitoringSettings(
                                            new MonitoringSettings()
                                                .withAzureMonitorAlertSettings(
                                                    new AzureMonitorAlertSettings()
                                                        .withAlertsForAllJobFailures(AlertsState.DISABLED)))
                                        .withSecuritySettings(
                                            new SecuritySettings()
                                                .withSoftDeleteSettings(
                                                    new SoftDeleteSettings()
                                                        .withState(SoftDeleteState.ON)
                                                        .withRetentionDurationInDays(12.53974621306525D))
                                                .withImmutabilitySettings(
                                                    new ImmutabilitySettings().withState(ImmutabilityState.LOCKED)))
                                        .withStorageSettings(
                                            Arrays
                                                .asList(
                                                    new StorageSetting()
                                                        .withDatastoreType(StorageSettingStoreTypes.ARCHIVE_STORE)
                                                        .withType(StorageSettingTypes.ZONE_REDUNDANT)))
                                        .withFeatureSettings(
                                            new FeatureSettings()
                                                .withCrossSubscriptionRestoreSettings(
                                                    new CrossSubscriptionRestoreSettings()
                                                        .withState(CrossSubscriptionRestoreState.ENABLED))
                                                .withCrossRegionRestoreSettings(
                                                    new CrossRegionRestoreSettings()
                                                        .withState(CrossRegionRestoreState.DISABLED)))),
                            new BackupVaultResourceInner()
                                .withLocation("y")
                                .withTags(
                                    mapOf("rkxvdum", "wby", "xgaudccs", "grtfwvu", "jcny", "h", "kryhtnapczwlokj", "j"))
                                .withEtag("npqxuh")
                                .withIdentity(
                                    new DppIdentityDetails()
                                        .withType("jysagith")
                                        .withUserAssignedIdentities(mapOf("ifpikxwczby", new UserAssignedIdentity())))
                                .withProperties(
                                    new BackupVault()
                                        .withMonitoringSettings(
                                            new MonitoringSettings()
                                                .withAzureMonitorAlertSettings(
                                                    new AzureMonitorAlertSettings()
                                                        .withAlertsForAllJobFailures(AlertsState.DISABLED)))
                                        .withSecuritySettings(
                                            new SecuritySettings()
                                                .withSoftDeleteSettings(
                                                    new SoftDeleteSettings()
                                                        .withState(SoftDeleteState.ALWAYS_ON)
                                                        .withRetentionDurationInDays(30.42594303603623D))
                                                .withImmutabilitySettings(
                                                    new ImmutabilitySettings().withState(ImmutabilityState.UNLOCKED)))
                                        .withStorageSettings(
                                            Arrays
                                                .asList(
                                                    new StorageSetting()
                                                        .withDatastoreType(StorageSettingStoreTypes.OPERATIONAL_STORE)
                                                        .withType(StorageSettingTypes.ZONE_REDUNDANT)))
                                        .withFeatureSettings(
                                            new FeatureSettings()
                                                .withCrossSubscriptionRestoreSettings(
                                                    new CrossSubscriptionRestoreSettings()
                                                        .withState(CrossSubscriptionRestoreState.PERMANENTLY_DISABLED))
                                                .withCrossRegionRestoreSettings(
                                                    new CrossRegionRestoreSettings()
                                                        .withState(CrossRegionRestoreState.ENABLED)))),
                            new BackupVaultResourceInner()
                                .withLocation("zitonpeqfpjkjl")
                                .withTags(
                                    mapOf("nmayhuybb", "pdvhpfxxypin", "inuvamiheogn", "podepoo", "usivye", "rxzxtheo"))
                                .withEtag("cjrwzoxxjtfellu")
                                .withIdentity(
                                    new DppIdentityDetails()
                                        .withType("paojakhmsbzjh")
                                        .withUserAssignedIdentities(
                                            mapOf(
                                                "dphlxaolt",
                                                new UserAssignedIdentity(),
                                                "rgqjbpfzfsinzg",
                                                new UserAssignedIdentity())))
                                .withProperties(
                                    new BackupVault()
                                        .withMonitoringSettings(
                                            new MonitoringSettings()
                                                .withAzureMonitorAlertSettings(
                                                    new AzureMonitorAlertSettings()
                                                        .withAlertsForAllJobFailures(AlertsState.ENABLED)))
                                        .withSecuritySettings(
                                            new SecuritySettings()
                                                .withSoftDeleteSettings(
                                                    new SoftDeleteSettings()
                                                        .withState(SoftDeleteState.ALWAYS_ON)
                                                        .withRetentionDurationInDays(59.75135945335241D))
                                                .withImmutabilitySettings(
                                                    new ImmutabilitySettings().withState(ImmutabilityState.DISABLED)))
                                        .withStorageSettings(
                                            Arrays
                                                .asList(
                                                    new StorageSetting()
                                                        .withDatastoreType(StorageSettingStoreTypes.OPERATIONAL_STORE)
                                                        .withType(StorageSettingTypes.GEO_REDUNDANT),
                                                    new StorageSetting()
                                                        .withDatastoreType(StorageSettingStoreTypes.VAULT_STORE)
                                                        .withType(StorageSettingTypes.ZONE_REDUNDANT)))
                                        .withFeatureSettings(
                                            new FeatureSettings()
                                                .withCrossSubscriptionRestoreSettings(
                                                    new CrossSubscriptionRestoreSettings()
                                                        .withState(CrossSubscriptionRestoreState.PERMANENTLY_DISABLED))
                                                .withCrossRegionRestoreSettings(
                                                    new CrossRegionRestoreSettings()
                                                        .withState(CrossRegionRestoreState.ENABLED))))));
        model = BinaryData.fromObject(model).toObject(BackupVaultResourceList.class);
        Assertions.assertEquals("qeof", model.nextLink());
        Assertions.assertEquals("ajpsquc", model.value().get(0).location());
        Assertions.assertEquals("yf", model.value().get(0).tags().get("kfo"));
        Assertions.assertEquals("a", model.value().get(0).etag());
        Assertions.assertEquals("rbt", model.value().get(0).identity().type());
        Assertions
            .assertEquals(
                AlertsState.DISABLED,
                model
                    .value()
                    .get(0)
                    .properties()
                    .monitoringSettings()
                    .azureMonitorAlertSettings()
                    .alertsForAllJobFailures());
        Assertions
            .assertEquals(
                SoftDeleteState.ON, model.value().get(0).properties().securitySettings().softDeleteSettings().state());
        Assertions
            .assertEquals(
                12.53974621306525D,
                model.value().get(0).properties().securitySettings().softDeleteSettings().retentionDurationInDays());
        Assertions
            .assertEquals(
                ImmutabilityState.LOCKED,
                model.value().get(0).properties().securitySettings().immutabilitySettings().state());
        Assertions
            .assertEquals(
                StorageSettingStoreTypes.ARCHIVE_STORE,
                model.value().get(0).properties().storageSettings().get(0).datastoreType());
        Assertions
            .assertEquals(
                StorageSettingTypes.ZONE_REDUNDANT, model.value().get(0).properties().storageSettings().get(0).type());
        Assertions
            .assertEquals(
                CrossSubscriptionRestoreState.ENABLED,
                model.value().get(0).properties().featureSettings().crossSubscriptionRestoreSettings().state());
        Assertions
            .assertEquals(
                CrossRegionRestoreState.DISABLED,
                model.value().get(0).properties().featureSettings().crossRegionRestoreSettings().state());
    }

    @SuppressWarnings("unchecked")
    private static <T> Map<String, T> mapOf(Object... inputs) {
        Map<String, T> map = new HashMap<>();
        for (int i = 0; i < inputs.length; i += 2) {
            String key = (String) inputs[i];
            T value = (T) inputs[i + 1];
            map.put(key, value);
        }
        return map;
    }
}
