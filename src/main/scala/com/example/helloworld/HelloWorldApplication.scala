package com.example.helloworld

import com.example.helloworld.health.TemplateHealthCheck
import com.example.helloworld.resources.HelloWorldResource
import io.dropwizard.Application
import io.dropwizard.setup.{Bootstrap, Environment}

class HelloWorldApplication extends Application[HelloWorldConfiguration] {
  def start = {
    run("server")
  }

  override def initialize(bootstrap: Bootstrap[HelloWorldConfiguration]): Unit = {

  }

  override def run(configuration: HelloWorldConfiguration, environment: Environment) {
    val resource: HelloWorldResource = new HelloWorldResource(configuration.template, configuration.defaultName)
    val healthCheck: TemplateHealthCheck = new TemplateHealthCheck(configuration.template)
    environment.healthChecks().register("template", healthCheck)
    environment.jersey().register(resource)
  }
}
