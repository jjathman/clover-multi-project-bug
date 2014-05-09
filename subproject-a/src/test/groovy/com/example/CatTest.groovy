package com.example

import org.junit.Test

class CatTest {
  
  @Test
  void testCat() {
    def cat = new Cat()
    cat.name = "Joe"
    cat.speak()
  }
}
