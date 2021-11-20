package ch1

import org.junit.Test
import org.junit.Assert.*

class Euclid:
  @Test def test1(): Unit =
    assertEquals(euclid(1633, 355), 71)

  @Test def test2(): Unit =
    println(euclid(3425, 1233))
