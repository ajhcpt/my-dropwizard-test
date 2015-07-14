package com.example.helloworld.resources

import java.util.concurrent.atomic.AtomicLong
import javax.ws.rs.core.{Response, MediaType}
import javax.ws.rs.{GET, Path, Produces, QueryParam}

import com.codahale.metrics.annotation.Timed
import com.example.helloworld.core.Saying

@Path("/hello-world")
@Produces(Array(MediaType.APPLICATION_JSON))
class HelloWorldResource(template: String, defaultName: String) {
  var counter: AtomicLong = _
  @GET
  @Timed
  def sayHello(): Saying = {
    
    new Saying(1, "Andrew")
  }
}
