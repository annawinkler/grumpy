package org.anna.resources;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.anna.core.Document;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Path("/gp")
public class GrumpyResource {
    public static final String GP_TEXT_FILENAME = "assets/gp.json";

    ObjectMapper objectMapper = new ObjectMapper();
    TypeReference<List<Document>> listType = new TypeReference<List<Document>>() {};
    List<Document> documents = null;
    List<Integer> httpCodes = new ArrayList<>();

    public GrumpyResource() {
        for (int x = 500; x < 506; x++) {
            httpCodes.add(x);
        }

        try {
            documents = objectMapper.readValue(getClass().getClassLoader().getResourceAsStream(GP_TEXT_FILENAME), listType);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GET
    public Response getGP() {
        int randomCode = ThreadLocalRandom.current().nextInt(httpCodes.size());
        int randomMessage = ThreadLocalRandom.current().nextInt(documents.size());
        Response.Status returnStatus = Response.Status.fromStatusCode(httpCodes.get(randomCode));

        return Response.status(returnStatus)
                .entity(documents.get(randomMessage).getText())
                .build();
    }

}
