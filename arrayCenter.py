def arrayCenter(a):
    res = []
    avg = sum(a)/len(a)
    minimal = min(a)
    for l in a:
        if abs(l-avg) < minimal:
            res.append(l)
    return res
