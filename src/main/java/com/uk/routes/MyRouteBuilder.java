package com.uk.routes;

import org.apache.camel.builder.RouteBuilder;

/**
 * Created by User on 24/01/16.
 */
public class MyRouteBuilder extends RouteBuilder {
    @Override
    public void configure() throws Exception {
        // Access us using http://localhost:8080/camel/hello
        from("servlet:///hello").transform().constant("Hello from Camel!");

    }
}
