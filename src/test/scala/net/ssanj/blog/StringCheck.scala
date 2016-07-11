package net.ssanj.blog

import org.scalacheck.Prop

import org.scalatest.PropSpec
import org.scalatest.prop.Checkers

final class StringCheck extends PropSpec with Checkers {

  property("startsWith") {
    check(Prop.forAll { (a: String, b: String) =>
      (a+b).startsWith(a)
    })
  }

  property("concatenate") {
    check(Prop.forAll { (a: String, b: String) =>
      (a+b).length >= a.length && (a+b).length >= b.length
    })
  }

  property("substring") {
    check(Prop.forAll { (a: String, b: String, c: String) =>
      (a+b+c).substring(a.length, a.length+b.length) == b
    })
  }
}