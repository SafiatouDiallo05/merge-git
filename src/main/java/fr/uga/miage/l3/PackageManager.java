package fr.uga.miage.l3;

import lombok.Getter;

import java.util.Map;

@Getter
public class PackageManager {
    private String name = "extended-app";
    private String version = "3.5.1";
    private boolean isPrivate = true;

    private Map<String, String> dependencies = Map.of(
            "@angular/core", "^20.4.0",
            "@angular/router", "^20.4.0",
            "@angular/platform-browser", "^20.4.0",
            "rxjs", "~7.9.0",
            "tslib", "^2.4.0"
    );

    private Map<String, String> devDependencies = Map.of(
            "@angular/cli", "^20.4.0",
            "@types/jasmine", "~5.2.0"
    );
}

