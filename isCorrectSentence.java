/*
A string is said to be a correct sentence if it starts with the capital letter and ends with a full stop (.).

Given a string, check whether it represents a correct sentence.

Example

For inputString = "This is a correct sentence.", the output should be
isCorrectSentence(inputString) = true;
For inputString = "this is an incorrect sentence.", the output should be
isCorrectSentence(inputString) = false;
For inputString = "This is another incorrect sentence", the output should be
isCorrectSentence(inputString) = false.
*/

boolean isCorrectSentence(String inputString) {
    return inputString.charAt(0)>='A'&&inputString.charAt(0)<='Z'&&inputString.charAt(inputString.length()-1)=='.';
}

