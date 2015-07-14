package com.example.helloworld

import com.fasterxml.jackson.annotation.JsonProperty
import io.dropwizard.Configuration
import org.hibernate.validator.constraints.NotEmpty

class HelloWorldConfiguration extends Configuration {
  @NotEmpty
  @JsonProperty
  var template: String = _

  @NotEmpty
  @JsonProperty
  var defaultName: String = _

}
