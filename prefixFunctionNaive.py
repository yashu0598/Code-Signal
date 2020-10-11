def prefixFunctionNaive(s):
    p, q = '', []
    for c in s:
        p += c
        i = l = 0
        for _ in p:
            if p[:i] == p[-i:]:
                l = i
            i += 1
        q += l,
    return q
