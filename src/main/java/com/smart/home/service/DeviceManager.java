package com.smart.home.service;
import com.smart.home.model.Device;
import java.util.ArrayList;
import java.util.List;

public class DeviceManager {
    private static DeviceManager instance;
    private final List<Device> devices = new ArrayList<>();

    private DeviceManager() {}

    public static synchronized DeviceManager getInstance() {
        if (instance == null) {
            instance = new DeviceManager();
        }
        return instance;
    }

    public void addDevice(Device device) {
        devices.add(device);
    }

    public List<String> getDeviceNames() {
        List<String> names = new ArrayList<>();
        for (Device device : devices) {
            names.add(device.getClass().getSimpleName());
        }
        return names;
    }
}