/*
PEP 8, Style Guide for Python Code, requires a coder to write lines no longer than 79 characters. Given some code line, find out if it satisfies PEP 8 requirements.

Example

For line = "b = a + 4", the output should be
pepEight2(line) = true.
*/

boolean pepEight2(String line) {
    return line.length()<=79;
}
