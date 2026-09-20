class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peak = findPeakElement(mountainArr, n);
        if(mountainArr.get(peak) == target) {
            return peak;
        }
        int left = searchInIncreasing(mountainArr, target, 0, peak);
        if(left != -1) {
            return left;
        }
        int right = searchInDecreasing(mountainArr, target, peak + 1, n - 1);
        return right;
    }
    public int findPeakElement(MountainArray mountainArr, int n) {
        int low = 1, high = n - 2;
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int midElement = mountainArr.get(mid);
            int midNextElement = mountainArr.get(mid + 1);
            int midPrevElement = mountainArr.get(mid - 1);
            if(midElement > midNextElement && midElement > midPrevElement) {
                return mid;
            } else if(midElement > midNextElement) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public int searchInIncreasing(MountainArray mountainArr, int target, int low, int high) {
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int midElement = mountainArr.get(mid);
            if(midElement == target) {
                return mid;
            } else if(midElement > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return -1;
    }
    public int searchInDecreasing(MountainArray mountainArr, int target, int low, int high) {
        while(low <= high) {
            int mid = low + (high - low) / 2;
            int midElement = mountainArr.get(mid);
            if(midElement == target) {
                return mid;
            } else if(midElement > target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}