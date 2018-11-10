def threeAndFour(n):
    a=[]
    for i in range(0,n+1):
        if i%3==0 and i%4==0:
            a.append(i)
    return a
