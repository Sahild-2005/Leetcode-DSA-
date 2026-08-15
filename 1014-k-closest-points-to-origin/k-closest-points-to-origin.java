class Solution {
        class Point {
        int dis;
        int x;
        int y;

        Point(int dis, int x, int y) {
            this.dis = dis;
            this.x = x;
            this.y = y;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        // custom compareator 
        // pq is a triplet 
        //pq<triplet>

        PriorityQueue<Point> pq = new PriorityQueue<>(
            (a, b) -> Integer.compare(b.dis, a.dis)
        );

        for (int i = 0; i < points.length; i++) {

            int x = points[i][0];
            int y = points[i][1];

            int dis = x * x + y * y;

            // Store {distance, x, y}
            pq.offer(new Point(dis, x, y));

            // Keep only k closest points
            if (pq.size() > k) {
                pq.poll();
            }
        }

        int[][] ans = new int[k][2];

        for (int i = 0; i < k; i++) {

            Point p = pq.poll();

            ans[i][0] = p.x;
            ans[i][1] = p.y;
        }

        return ans;
    }
}
