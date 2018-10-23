/*
Several friends live along a straight street. They are friends, thus they enjoy visiting each other. However, they are lazy so none of them wants to visit a friend living more than maxDist meters away from them.

Given array houses representing coordinates of points where the friends live (in meters) and an integer maxDist, return an array representing the number of friends each person would be willing to visit.

Example

For houses = [1, 2, 4, 8, 10] and maxDist = 5, the output should be
lazyFriends(houses, maxDist) = [2, 2, 3, 2, 1].
*/

int[] lazyFriends(int[] houses, int maxDist) {

  int[] result = new int[houses.length];
  int left = 0,
      right = 0;
  for (int i = 0; i < houses.length; i++) {
    while (houses[i] - houses[left] > maxDist) {
      left++;
    }
    while (right + 1 < houses.length
        && houses[right + 1] - houses[i] <= maxDist) {
      right++;
    }
    result[i] = right - left + 1;
  }

  return result;
}
