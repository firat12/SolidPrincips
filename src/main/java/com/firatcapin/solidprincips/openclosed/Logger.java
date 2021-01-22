package com.firatcapin.solidprincips.openclosed;

public class Logger {
    private ILogger logger;

    public void LogTo(ILogger logger){
        this.logger = logger;
    }

    public String Log(){
        return this.logger.log();
    }
}
