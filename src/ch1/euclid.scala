package ch1

def euclid(m: Int, n: Int): Int =
  if (n == 0) m else euclid(n, m % n)
