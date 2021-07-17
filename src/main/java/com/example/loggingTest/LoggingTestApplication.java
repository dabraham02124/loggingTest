package com.example.loggingTest;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class LoggingTestApplication extends Application<LoggingTestConfiguration> {

    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(LoggingTestApplication.class);

    public static void main(final String[] args) throws Exception {
        new LoggingTestApplication().run(args);
    }

    @Override
    public String getName() {
        return "LoggingTest";
    }

    @Override
    public void initialize(final Bootstrap<LoggingTestConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final LoggingTestConfiguration configuration,
                    final Environment environment) {
        log.info("------------------- into run!!!! -------------------");
    }

    @Override
    protected void bootstrapLogging() { }
}
