package com.recursive

import org.specs2.mutable.SpecificationWithJUnit
import org.specs2.specification.Scope

class MainTest extends SpecificationWithJUnit {

  trait Context extends Scope

  "Main" should {
    "have the correct message" in new Context {
      Main.msg must_== "Hi Recursive Center :-D"
    }
  }
}
