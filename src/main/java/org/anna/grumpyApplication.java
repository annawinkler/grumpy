package org.anna;

import io.dropwizard.Application;
import io.dropwizard.jersey.setup.JerseyEnvironment;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import org.anna.resources.GrumpyResource;

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

    }

    @Override
    public void run(final grumpyConfiguration configuration,
                    final Environment environment) {
        registerJerseyResources(configuration, environment);
    }

    private void registerJerseyResources(final grumpyConfiguration configuration, final Environment environment) {
        final GrumpyResource grumpyResource = new GrumpyResource();
        JerseyEnvironment jersey = environment.jersey();
        jersey.register(grumpyResource);
    }
}