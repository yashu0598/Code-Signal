int gcd(int a,int b){
    
      if (a%b==0) {
        return b;
      }
      return gcd(b % a, a);
    }
int[] fractionSum(int[] A, int[] B) {


    int C[]=new int[2];
  C[0]= A[0] * B[1] + A[1] * B[0];
         C[1]=A[1] * B[1];
      int gcda = gcd(C[0], C[1]);

    C[0] /= gcda;
    C[1] /= gcda;

    return C;
  }

