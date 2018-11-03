def quadraticEquation(a, b, c):
    roots = []
    if b**2 -4*a*c <0:
        return roots
    if b**2-4*a*c==0:
        return [(-b+(b**2-4*a*c)**0.5)/(2*a)]
    roots.append( (-b+(b**2-4*a*c)**0.5)/(2*a))
    roots.append( (-b-(b**2-4*a*c)**0.5)/(2*a))
    return sorted(roots)

