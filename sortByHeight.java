/*
Some people are standing in a row in a park. There are trees between them which cannot be moved. Your task is to rearrange the people by their heights in a non-descending order without moving the trees. People can be very tall!

Example

For a = [-1, 150, 190, 170, -1, -1, 160, 180], the output should be
sortByHeight(a) = [-1, 150, 160, 170, -1, -1, 180, 190].
*/
int[] sortByHeight(int[] a) {
  for (int i = 0; i < a.length; i++) {
    int minIndex = -1,
        tmp = a[i];
    if (a[i] == -1) {
      continue;
    }
    for (int j = i; j < a.length; j++) {
      if (a[j] != -1) {
        if (minIndex==-1||a[minIndex]>a[j] ) {
          minIndex = j;
        }
      }
    }
    a[i] = a[minIndex];
    a[minIndex] = tmp;
  }
  return a;
}
