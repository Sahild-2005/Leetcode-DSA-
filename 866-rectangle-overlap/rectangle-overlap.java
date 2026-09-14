class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        
        int xStart = Math.max(rec1[0], rec2[0]);
        int xEnd = Math.min(rec1[2], rec2[2]);

        int yStart = Math.max(rec1[1], rec2[1]);
        int yEnd = Math.min(rec1[3], rec2[3]);

        return xEnd > xStart && yEnd > yStart;
    }
}