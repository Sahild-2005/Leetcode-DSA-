class Solution {
    public int numberOfMatches(int n) {

        // is even n/2 macthes n/2 and teams 
        // is odd (n-1)/2 matches and matches+1 = teams

        int matches = 0;
        int team;

        while (n != 0) {
            // odd
            if (n % 2 != 0) {
                team = (n - 1) / 2;
                matches = matches + team;
                n = (n/2) + 1;
            } else {
                // even

                team = n / 2;
                matches = matches + team;
                n = n/2;

            }

            if (n == 1)
                break;
        }
        return matches;
    }
}