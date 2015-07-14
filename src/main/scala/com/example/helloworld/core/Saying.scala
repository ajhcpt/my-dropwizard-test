package com.example.helloworld.core

import com.fasterxml.jackson.databind.annotation.JsonSerialize

@JsonSerialize
case class Saying(id: Long, content: String) {

}
