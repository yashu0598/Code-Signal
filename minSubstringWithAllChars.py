def minSubstringWithAllChars(s, t):
    if len(t) == 1:
        return t
    e = list(t)
    lc = 1000000
    ca = ''
    for i in range(len(s)):
        l = s[i]
        if l not in e:continue
        t1 = list(t)
        t1.remove(l)
        sub = s[i+1:]
        try:    
            max_index = max([sub.index(j) for j in t1])
        except:
            continue
        new_ca = s[i:i+max_index+2]
        if len(new_ca) < lc:
            lc,ca = len(new_ca),new_ca
    return ca
