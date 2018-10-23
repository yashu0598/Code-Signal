/*
As an economist, you are interested in Pingland PING to Pongland PONG currency chart. In a conference that will take place really soon, you want to show everyone that PING/PONG rate has been increasing lately. In order to do this you decided to remove from the chart some points so that the remaining points form a strictly increasing sequence. Find the smallest number of points you have to remove.

Example

For chart = [3, 2, 6, 4, 5, 1, 7], the output should be
chartFix(chart) = 3.

After you remove points 2, 6, and 1 the remaining points will form a sequence [3, 4, 5, 7], which is strictly increasing.
*/

int chartFix(int[] chart) {
int[] DP = new int[chart.length];
        int maxLength = 1;
        DP[0] = 1;

        for (int i = 1; i < chart.length; i++) {
            DP[i] = 1;

            for (int j = i - 1; j >= 0; j--)
                if (DP[j] + 1 > DP[i] && chart[j] < chart[i]) {
                    DP[i] = DP[j] + 1;
                }

            if (DP[i] > maxLength) {
                maxLength = DP[i];
            }
        }

        return chart.length - maxLength;
}
