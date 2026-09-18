class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = left; i <= right; i++){
            if(isSelfDividing(i)){
                list.add(i);
            }
        }
        return list;
    }
    static boolean isSelfDividing(int n){
        int temp = n;
        while (  temp != 0){
            int rem  = temp%10;
            if (rem == 0) return false;
            if (n % rem != 0){
                return false;
            }
            temp = temp/10;
        }
        return true;
    }

}