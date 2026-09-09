package com.taskflow.api;

import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping("/api/status")
    public Map<String, String> getStatus() {
        return Map.of(
            "application", "TaskFlow API",
            "status", "UP",
            "version", "1.0.0"
        );
    }
}
