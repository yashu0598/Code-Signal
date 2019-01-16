def cipher26(message):
    output = []
    Sum = 0
    for i in range(0,len(message)):
        temp = (ord(message[i])-ord('a')-Sum+26)%26
        Sum += temp
        output.append(chr(temp+ord('a')))
    return "".join(output)
