def reverseToSort(inputArray):
    for a in range(len(inputArray) - 1):
        for b in range(a + 1, len(inputArray) + 1):
            window = inputArray[a:b]
            if sorted(inputArray) == inputArray[:a] + window[::-1] + inputArray[b:]:
                return len(set(inputArray)) == len(inputArray)
    return False
