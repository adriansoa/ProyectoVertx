package com.techprimers.vertx;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;
import io.vertx.core.http.HttpServerResponse;
import io.vertx.ext.web.Route;
import io.vertx.ext.web.Router;

public class App {

    public static void main(String[] args) {

        Vertx vertx = Vertx.vertx();

        HttpServer httpServer = vertx.createHttpServer();

        Router router = Router.router(vertx);
        Route handler1 = router
                .get("/hello/:name")
                .handler(routingContext -> {
                    String name = routingContext.request().getParam("name");
                    System.out.println("came to hello: " + name);
                    HttpServerResponse response = routingContext.response();
                    response.setChunked(true);
                    response.write("Hi " + name + "\n");
                    response.end();
                });
        
        Route handler2 = router
                .get("/hello")
                .handler(routingContext -> {
                    //String name = routingContext.request().getParam("name");
                    //System.out.println("came to hello: " + name);
                    HttpServerResponse response = routingContext.response();
                    response.putHeader("content-type", "text/plain");
                    response.end("EL HOLA MUNDO !!");
                    //response.setChunked(true);
                    //response.write("Hi " + name + "\n");
                    //response.end();
                }); 
        
        
        Route handler3 = router
                .post("/hello2")
                .consumes("*/json")
                .handler(routingContext -> {
                    System.out.println("came to post");
                    HttpServerResponse response = routingContext.response();
                    response.setChunked(true);
                    response.write("Hi TechPrimers from post\n");
                    response.end();
                });
       
        httpServer
                .requestHandler(router::accept)
                .listen(8091);

    }
}
