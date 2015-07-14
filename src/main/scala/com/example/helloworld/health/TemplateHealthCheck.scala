package com.example.helloworld.health

import com.codahale.metrics.health.HealthCheck
import com.codahale.metrics.health.HealthCheck.Result

class TemplateHealthCheck(template: String) extends HealthCheck {
  override def check: Result = {
    val saying: String = String.format(template, "TEST")
    if (!saying.contains("TEST")) {
      Result.unhealthy("template does not include a name")
    }
    Result.healthy()
  }

}
