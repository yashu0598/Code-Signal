/*
Find the leftmost digit that occurs in a given string.

Example

For inputString = "var_1__Int", the output should be
firstDigit(inputString) = '1';
For inputString = "q2q-q", the output should be
firstDigit(inputString) = '2';
For inputString = "0ss", the output should be
firstDigit(inputString) = '0'.
*/
char firstDigit(String inputString) {

  Pattern re = Pattern.compile("[0-9]");
  Matcher match = re.matcher(inputString);
  match.find();
  return match.group(1).charAt(0);
}
