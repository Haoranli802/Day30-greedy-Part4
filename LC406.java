class Solution {
    public int[][] reconstructQueue(int[][] people) {
        Arrays.sort(people, (a, b) -> {
            if(a[0] == b[0]) return a[1] - b[1];
            return b[0] - a[0];
        });
        List<int[]> list = new ArrayList<>();
        for(int[] p : people){
            list.add(p[1], p);
        }
        int[][] res = new int[people.length][];
        for(int i = 0; i < list.size(); i++){
            res[i] = list.get(i);
        }
        return res;
    }
}
// O(n^2), O(logn)
