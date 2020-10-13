def simplifyPath(path):
    nv = ['.', '..', '']
    r = []
    for i in path.split('/'):
        if i not in nv:
            r.append(i)
        elif i == '..' and len(r) > 0:
            r.pop()
    return '/'+'/'.join(r)
