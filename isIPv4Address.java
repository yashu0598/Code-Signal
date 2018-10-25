/*
An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network that uses the Internet Protocol for communication. There are two versions of the Internet protocol, and thus two versions of addresses. One of them is the IPv4 address.

IPv4 addresses are represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255 inclusive, separated by dots, e.g., 172.16.254.1.

Given a string, find out if it satisfies the IPv4 address naming rules.

Example

For inputString = "172.16.254.1", the output should be
isIPv4Address(inputString) = true;

For inputString = "172.316.254.1", the output should be
isIPv4Address(inputString) = false.

316 is not in range [0, 255].

For inputString = ".254.255.0", the output should be
isIPv4Address(inputString) = false.

There is no first number.
*/

boolean isIPv4Address(String inputString) {

  int currentNumber = 0;
  boolean emptyField = true;
  int countNumbers = 0;

  inputString += '.';

  for (int i = 0; i < inputString.length(); i++) {
    if (inputString.charAt(i) == '.') {
      if (emptyField) {
        return false;
      }
      countNumbers++;
      currentNumber = 0;
      emptyField = true;
    }
    else {
      int digit = inputString.charAt(i) - '0';
      if (digit < 0 || digit > 9) {
        return false;
      }
      emptyField = false;
      currentNumber = currentNumber * 10 + digit;
      if ( currentNumber<0 ||currentNumber>255 ) {
        return false;
      }
    }
  }
  return countNumbers == 4;
}
