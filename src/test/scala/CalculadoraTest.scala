package ar.edu.unahur

import org.scalatest.freespec.AnyFreeSpec
import org.scalatest.matchers.should.Matchers

class CalculadoraTest extends AnyFreeSpec with Matchers {
  "Calculador" - {
    "2 + 3 deberia ser 5" in {
      val calculadora: Calculadora = new Calculadora
      calculadora.sumar(2, 3) should be (5)
    }

    "deberia tirar error al dividir por 0" in {
      val calculadora: Calculadora = new Calculadora
      assertThrows[ArithmeticException] {
        calculadora.dividir(10, 0)
      }
    }
  }
}
