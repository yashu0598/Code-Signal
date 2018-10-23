/*
The detective is investigating a gambling case and is interrogating n suspects. They are all telling the same story.

They were playing a game. Initially, they all had the same amount of money, which was a positive integer. In each round, each of the players optionally bet an arbitrary amount of money (no more than he or she had at the time) into a common pot, which, after the round ended, was redistributed among all the players in some way.

The detective knows exactly how much money each of the players had at the end of their game and wants to determine whether it is possible that they are telling the truth. Your task is to help him.

You are given an array l of non-negative integers of length n - the amount of money each player had after the game. Return true if it is possible the players are telling the truth, and false otherwise.
For l = [3, 4, 8], the output should be
bettingGame(l) = true.

One possible course of the game is that the players had 5 units of money each and the game lasted only one round. During that round, all players went all-in and bet 5 each. After the round ended, the pot of 15 was redistributed as [3, 4, 8];

For l = [4, 4, 5, 4], the output should be
bettingGame(l) = false.
*/

boolean bettingGame(int[] l) {

  int s = 0;
  for (int i = 0; i < l.length; i++) {
    s += l[i];
  }
  if (s == 0) {
    return false;
  }

  return s%l.length==0;
}
