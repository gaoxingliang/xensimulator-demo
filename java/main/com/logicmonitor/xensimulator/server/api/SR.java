package com.logicmonitor.xensimulator.server.api;

public class SR extends BaseAPI {
    @Override
    public String getType() {
        return "SR";
    }

    @Override
    public String getFileForAllRecords() {
        return "/SR_all_records.xml";
    }
}
