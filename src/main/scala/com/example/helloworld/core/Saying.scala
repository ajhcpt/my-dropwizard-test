package com.example.helloworld.core

import com.fasterxml.jackson.core.JsonGenerator
import com.fasterxml.jackson.databind.{SerializerProvider, JsonSerializer}
import com.fasterxml.jackson.databind.annotation.JsonSerialize

class SayingSerializer extends JsonSerializer[Saying] {
  override def serialize(value: Saying, jgen: JsonGenerator, provider: SerializerProvider): Unit = {
    jgen.writeStartObject()
    jgen.writeNumberField("id", value.id)
    jgen.writeStringField("name", value.content)
    jgen.writeEndObject()
  }
}

@JsonSerialize(using = classOf[SayingSerializer])
case class Saying(id: Long, content: String) {

}
