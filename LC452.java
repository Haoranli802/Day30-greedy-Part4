class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, (a, b) -> Integer.compare(a[0], b[0]));
        int preRight = points[0][1];
        int arrow = 1;
        for(int i = 1; i < points.length; i++){
            if(points[i][0] > preRight){
                arrow ++;
                preRight = points[i][1];
            }
            else{
                preRight = Math.min(preRight, points[i][1]);
            }
        }
        return arrow;
    }
}
//O(nlogn), O(logn)
