package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
		// URI dbUri = new URI(System.getenv("DATABASE_URL"));

		// String username = dbUri.getUserInfo().split(":")[0];
		// String password = dbUri.getUserInfo().split(":")[1];
		// String dbUrl = "jdbc:postgresql://" + dbUri.getHost() + dbUri.getPath();
		//String dbUrl = "Under Construction";
		//return dbUrl;
        return "Welcome to this Heroku deployment! Under construction";
    }
}
