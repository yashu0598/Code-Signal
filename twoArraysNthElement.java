int twoArraysNthElement(int[] array1, int[] array2, int n) {

  class Helper {
    int lowerBound(int[] arr, int elem) {
      int l = -1;
      int r = arr.length;
      while (l + 1 < r) {
        int mid = (l + r) / 2;
        if (arr[mid] <= elem) {
          l = mid;
        }
        else {
          r = mid;
        }
      }
      return l;
    }
  };

  int l = -1;
  int r = array1.length;

  Helper h = new Helper();

  while (l + 1 < r) {
    int mid = (l + r) / 2;
    int pos = h.lowerBound(array2, array1[mid]);

    if ( mid + pos +1 <= n) {
      l = mid;
    }
    else {
      r = mid;
    }
  }

  if (l > -1 && l + h.lowerBound(array2, array1[l]) + 1 == n) {
    return array1[l];
  }
  return twoArraysNthElement(array2, array1, n);
}
