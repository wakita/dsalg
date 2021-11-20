package ch1.search

def linear[T](x: T, l: List[T]): Boolean =
  l match {
    case Nil => false
    case y :: l => x == y || linear(x, l)
  }

import scala.collection.immutable.IndexedSeq

def binary[T](x: T, v: IndexedSeq[T])(implicit ordering:Ordering[T]): Boolean =
  def search(l: Int, r: Int): Boolean = {
    val m = (l + r) / 2
    (l <= r) && (v(m) == x || ordering.gt(v(m), x) && search(l, m-1) || search(m+1, r))
  }
  search(0, v.size - 1)
