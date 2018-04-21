/**
 * Copyright © 2016-2018 The Thingsboard Authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.thingsboard.server.dao.device;

import com.google.common.util.concurrent.ListenableFuture;
import org.thingsboard.server.common.data.Device;
import org.thingsboard.server.common.data.device.DeviceStatusQuery;

import java.util.List;
import java.util.UUID;

public interface DeviceOfflineService {

    void online(Device device, boolean isUpdate);

    void offline(Device device);

    ListenableFuture<List<Device>> findOfflineDevices(UUID tenantId, DeviceStatusQuery.ContactType contactType, long offlineThreshold);

    ListenableFuture<List<Device>> findOnlineDevices(UUID tenantId, DeviceStatusQuery.ContactType contactType, long offlineThreshold);
}