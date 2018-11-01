/*
Given a list of fractions find the index of the largest one (0-based).

Example

For numerators = [5, 2, 5] and denominators = [6, 3, 4], the output should be
maxFraction(numerators, denominators) = 2.

5/4 is the largest fraction, so the answer is 2.
*/
int maxFraction(int[] numerators, int[] denominators) {

  int maxFractionIndex = 0;
  for (int i = 1; i < numerators.length; i++) {
        if (numerators[i] * denominators[maxFractionIndex] >
        numerators[maxFractionIndex] * denominators[i]) {
      maxFractionIndex = i;
    }
  }
  return maxFractionIndex;
}
