package org.anna.resources;

import io.dropwizard.testing.junit.ResourceTestRule;
import org.junit.ClassRule;
import org.junit.Test;

import javax.ws.rs.core.Response;

import static org.junit.Assert.assertNotNull;

public class GrumpyResourceTest {

    @ClassRule
    public static final ResourceTestRule resources = ResourceTestRule.builder()
            .addResource(new GrumpyResource())
            .build();

    @Test
    public void testGet() {
        Response response = resources.target("/gp").request().get();
        assertNotNull(response.getStatus());
        assertNotNull(response.getEntity());
    }

}
