/*
Determine whether a given fraction is proper.

Example

For a = [7, 2], the output should be
properOrImproper(a) = "Improper".
*/

String properOrImproper(int[] a) {

  if (Math.abs(a[0] / a[1]) < 1) {
    return "Proper";
  }
  return "Improper";
}
