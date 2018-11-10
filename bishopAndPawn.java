boolean bishopAndPawn(String bishop, String pawn) {
 return Math.abs((bishop.charAt(0) - 96) - (pawn.charAt(0) - 96)) ==
           Math.abs(bishop.charAt(1) - pawn.charAt(1));
}
