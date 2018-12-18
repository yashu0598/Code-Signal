int avoidObstacles(int[] inputArray) {
 for(int i = 2;;i++){
        boolean t = true;
        for(int n:inputArray)
            t = t && n%i != 0;
        if(t) return i;
}
