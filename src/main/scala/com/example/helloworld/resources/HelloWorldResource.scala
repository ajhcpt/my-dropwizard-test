package com.example.helloworld.resources

import java.util.concurrent.atomic.AtomicLong
import javax.ws.rs.core.{Response, MediaType}
import javax.ws.rs.{GET, Path, Produces, QueryParam}

import com.codahale.metrics.annotation.Timed
import com.example.helloworld.core.Saying
import com.fasterxml.jackson.databind.ObjectMapper

@Path("/hello-world")
@Produces(Array(MediaType.APPLICATION_JSON))
class HelloWorldResource(template: String, defaultName: String) {
  var counter: AtomicLong = _
  @GET
  @Timed
  def sayHello(@QueryParam("name") name: String): String = {
    val value = String.format(template, Option(name) match {
      case Some(x) => name
      case None => defaultName
    })
    new ObjectMapper().writeValueAsString(new Saying(1, value))
  }
}
