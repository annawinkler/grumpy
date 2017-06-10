package org.anna;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class grumpyApplication extends Application<grumpyConfiguration> {

    public static void main(final String[] args) throws Exception {
        new grumpyApplication().run(args);
    }

    @Override
    public String getName() {
        return "grumpy";
    }

    @Override
    public void initialize(final Bootstrap<grumpyConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final grumpyConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
