package com.smart.home.factory;

import com.smart.home.model.Device;
import com.smart.home.model.Fan;
import com.smart.home.model.Light;

public class DeviceFactory {
    public static Device createDevice(String type) {
        return switch (type.toLowerCase()) {
            case "light" -> new Light();
            case "fan" -> new Fan();
            default -> throw new IllegalArgumentException("Invalid device type");
        };
    }
}

