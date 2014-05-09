package com.example

import org.junit.Test

class DogServiceTest {
  
  @Test
  void makeDogSpeakTest() {
    def service = new DogService()
    def dog = new Dog(name: "Mark")
    service.makeDogSpeak(dog)
  }
}
