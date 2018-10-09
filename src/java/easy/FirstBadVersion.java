public class FirstBadVersion {

    /**
     * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
     * 给定 n = 5，并且 version = 4 是第一个错误的版本。
     * 调用 isBadVersion(3) -> false
     * 调用 isBadVersion(5) -> true
     * 调用 isBadVersion(4) -> true
     * 所以，4 是第一个错误的版本。 
     */


     /* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

    public int firstBadVersion(int n) {
        int s = 1, e = n;
        int m;
        while (s < e) {
            m = s + ((e - s) >> 1); // 减法：防止溢出
            if (isBadVersion(m))
                e = m - 1;
            else
                s = m + 1;
        }
        return s;
    }
}
