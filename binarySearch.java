/*
Given a sorted array to search in and the key of the element whose index we should find, output the index of the element or -1 if it can't be found.

Example

For inputArray = [1, 2, 3, 4] and searchElement = 3, the output should be
binarySearch(inputArray, searchElement) = 2;
For inputArray = [1, 2, 3, 4] and searchElement = 5, the output should be
binarySearch(inputArray, searchElement) = -1.

*/
int binarySearch(int[] inputArray, int searchElement) {

  int minIndex = -1;
  int maxIndex = inputArray.length;
  int currentIndex;
  int currentElement;

  while (minIndex < maxIndex - 1) {
    currentIndex =  ((minIndex+1)+(maxIndex-1))/2 ;
    currentElement = inputArray[currentIndex];

    if (currentElement < searchElement) {
      minIndex = currentIndex;
    } else {
      maxIndex = currentIndex;
    }
  }

  if (maxIndex == inputArray.length || inputArray[maxIndex] != searchElement) {
    return -1;
  }
  return maxIndex;
}
