package com.example.loggingTest;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class LoggingTestApplication extends Application<LoggingTestConfiguration> {

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
        // TODO: implement application
    }

}
