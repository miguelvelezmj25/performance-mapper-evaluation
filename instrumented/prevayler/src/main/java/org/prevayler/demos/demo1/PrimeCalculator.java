package org.prevayler.demos.demo1;

import org.prevayler.Prevayler;

/** This is client code to the prevalent system. It does not need to be persisted. */
class PrimeCalculator {

  private final Prevayler<NumberKeeper> _prevayler;
  private final NumberKeeper _numberKeeper;

  PrimeCalculator(Prevayler<NumberKeeper> prevayler) {
    _prevayler = prevayler;
    _numberKeeper = prevayler.prevalentSystem();
  }

  void start() {
    int primeCandidate = _numberKeeper.lastNumber() == 0 ? 2 : _numberKeeper.lastNumber() + 1;

    while (primeCandidate <= 5) {
      if (isPrime(primeCandidate)) {

        _prevayler.execute(new NumberStorageTransaction(primeCandidate));
        _numberKeeper.numbers().size();
        //                System.out.println("Primes found: " + primesFound + ". Largest: " +
        // largestPrime);
      }

      primeCandidate++;
    }
  }

  void start1() {
    int primeCandidate = _numberKeeper.lastNumber() == 0 ? 2 : _numberKeeper.lastNumber() + 1;

    while (primeCandidate <= 10) {
      if (isPrime(primeCandidate)) {

        _prevayler.execute(new NumberStorageTransaction(primeCandidate));
        _numberKeeper.numbers().size();
        //                System.out.println("Primes found: " + primesFound + ". Largest: " +
        // largestPrime);
      }

      primeCandidate++;
    }
  }

  private boolean isPrime(int candidate) {
    /*int factor = 2;
    candidate = candidate / 2;
    while (factor < candidate) {
    	if (candidate % factor == 0) return false;
    	factor++;
    }
    return true;*/

    if (candidate < 2) {
      return false;
    }
    if (candidate == 2) {
      return true;
    }
    if (candidate % 2 == 0) {
      return false;
    }

    int factor = 3;
    double square = Math.ceil(Math.sqrt(candidate));
    while (factor <= square) {
      if (candidate % factor == 0) {
        return false;
      }
      factor += 2;
    }
    return true;
  }
}
