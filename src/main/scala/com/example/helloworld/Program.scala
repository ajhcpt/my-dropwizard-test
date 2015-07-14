package com.example.helloworld

import io.dropwizard.setup.Environment

/**
 * Created by andrewhe on 2015/07/14.
 */
object Program extends App {
  val server = new HelloWorldApplication
  server.run("server", "E:\\Projects\\Personal\\my-dropwizard-test\\example.yml")
}
