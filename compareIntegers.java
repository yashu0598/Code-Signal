/*
Compare two integers given as strings.

Example

For a = "12" and b = "13", the output should be
compareIntegers(a, b) = "less";
For a = "875" and b = "799", the output should be
compareIntegers(a, b) = "greater";
For a = "1000" and b = "1000", the output should be
compareIntegers(a, b) = "equal".
*/

String compareIntegers(String a, String b) {

  if (a.length() > b.length()) {
    return "greater";
  }
  if (a.length() < b.length()) {
    return  "less" ;
  }
  if (a.compareTo(b) < 0) {
    return "less";
  }
  if (a.compareTo(b) > 0) {
    return "greater";
  }
  return "equal";
}
