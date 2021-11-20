package ch1.search

import org.junit.Test
import org.junit.Assert.*

class LinearSearch:
  val l = List(0, 1, 2, 3)

  @Test def shouldFind(): Unit =
    for (x <- l) assert(linear(x, l))

  @Test def shouldNotFind(): Unit =
    assertFalse(linear(-1, l))

class BinarySearch:
  val v = List(0, 1, 2, 3).toIndexedSeq

  @Test def shouldFind(): Unit =
    for (n <- 0 until 5) {
      val v = (0 until n).toIndexedSeq
      for (x <- v) assert(binary(x, v))
    }

  @Test def shouldNotFind(): Unit =
    for (n <- 0 until 5) {
      val v = (0 until n).toIndexedSeq
      for (x <- v) {
        assertFalse(binary(-1, v))
        assertFalse(binary(n, v))
      }
    }

  @Test def problem2(): Unit =
    println(binary(34, IndexedSeq(12, 15, 19, 36, 38, 45, 56, 88)))
