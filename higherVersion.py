def higherVersion(ver1, ver2):
    v1 = [int(x) for x in ver1.split('.')]
    v2 = [int(x) for x in ver2.split('.')]
    print v1, v2
    return v1 > v2

