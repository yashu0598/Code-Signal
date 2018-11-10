def contoursShifting(matrix):
    nrow = len(matrix)
    ncol = len(matrix[0])
    maxLevel = min(nrow,ncol)
    maxLevel = maxLevel//2+maxLevel%2
    submatrix = list(matrix)
    for i in range(0,maxLevel):
        if nrow==ncol==1:
            break
        #clockwise
        if i%2 ==0:
            if nrow == 1:
                temp = submatrix[0][ncol-1]
                submatrix[0][1:] = submatrix[0][0:ncol-1]
                submatrix[0][0] = temp
            elif ncol == 1:
                temp = submatrix[nrow-1][0]
                for j in reversed(range(1,nrow)):
                    submatrix[j][0] = submatrix[j-1][0]
                submatrix[0][0] = temp
            else:
                temp = submatrix[nrow-1][ncol-1]
                for j in reversed(range(1,nrow)):
                    submatrix[j][ncol-1] = submatrix[j-1][ncol-1]
                submatrix[0][1:] = submatrix[0][0:ncol-1]
                for j in range(nrow-1):
                    submatrix[j][0] = submatrix[j+1][0]
                submatrix[nrow-1][0:ncol-2] = submatrix[nrow-1][1:ncol-1]
                submatrix[nrow-1][ncol-2] = temp
                
        #counterclockwise
        else:
            if nrow == 1:
                temp = submatrix[0][0]
                submatrix[0][0:ncol-1] = submatrix[0][1:]
                submatrix[0][ncol-1] = temp
            elif ncol == 1:
                temp = submatrix[0][0]
                for j in range(nrow-1):
                    submatrix[j][0] = submatrix[j+1][0]
                submatrix[nrow-1][0] = temp
            else:
                temp = submatrix[0][0]
                submatrix[0][0:ncol-1]=submatrix[0][1:]
                for j in range(nrow-1):
                    submatrix[j][ncol-1] = submatrix[j+1][ncol-1]
                submatrix[nrow-1][1:]=submatrix[nrow-1][0:ncol-1]
                for j in reversed(range(2,nrow)):
                    submatrix[j][0] = submatrix[j-1][0]
                submatrix[1][0] = temp
            
        for j in range(nrow):
            for k in range(ncol):
                matrix[j+i][k+i] = submatrix[j][k]
        submatrix = submatrix[1:nrow-1]
        submatrix = [m[1:ncol-1] for m in submatrix]
        if submatrix != []:
            nrow = len(submatrix)
            ncol = len(submatrix[0])
    return matrix
