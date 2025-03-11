package com.smart.home.controller;
import com.smart.home.service.DeviceManager;
import com.smart.home.factory.DeviceFactory;
import com.smart.home.model.Device;
import com.smart.home.command.Command;
import com.smart.home.command.TurnOnCommand;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/devices")
public class DeviceController {
    private final DeviceManager manager = DeviceManager.getInstance();

    @PostMapping("/add/{type}")
    public String addDevice(@PathVariable String type) {
        try {
            Device device = DeviceFactory.createDevice(type);
            manager.addDevice(device);
            return type + " added successfully!";
        } catch (IllegalArgumentException e) {
            return "Error: " + e.getMessage();
        }
    }

    @GetMapping("/list")
    public List<String> listDevices() {
        return manager.getDeviceNames();
    }

    @PostMapping("/turnOn/{type}")
    public String turnOnDevice(@PathVariable String type) {
        try {
            Device device = DeviceFactory.createDevice(type);
            Command turnOn = new TurnOnCommand(device);
            turnOn.execute();
            return type + " turned ON!";
        } catch (IllegalArgumentException e) {
            return "Error: " + e.getMessage();
        }
    }
}