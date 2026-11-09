class Solution {
    public int totalFruit(int[] fruits) {
        int start = 0; 
        int end = 0;
        int n = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(; end < fruits.length ; end++){
            map.put(fruits[end], map.getOrDefault(fruits[end], 0) + 1);
            while(map.size()  > 2){
                map.put(fruits[start], map.get(fruits[start]) - 1);
                if(map.get(fruits[start]) == 0){
                    map.remove(fruits[start]);
                }
                start++;
            }
            n = Math.max(n , end - start +1);
            
        }
        return n;
    }
}