package org.acme.config;

import java.util.List;

public class CellConfig {

    public List<String> getCellUrl() {
        return List.of(
                "http://localhost:1001",
                "http://localhost:1002",
                "http://localhost:1003");
    }
}
