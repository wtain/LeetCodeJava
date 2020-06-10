package ru.rz.leetcode.Miscellaneous.FirstBadVersion;

/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

class VersionControl {

    int badVersion;

    public VersionControl(int badVersion) {
       this.badVersion = badVersion;
    }

    public boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}

/*public */class Solution extends VersionControl {

    public Solution(int badVersion) {
        super(badVersion);
    }

    public int firstBadVersion(int n) {
        int l = 1, r = n;
        while (l < r) {
            int m = l + (r-l) / 2;
            if (isBadVersion(m))
                r = m;
            else
                l = m + 1;
        }
        return r;
    }
}

public class FirstBadVersion {
    public static void main(String[] args) {
        System.out.println(new Solution(4).firstBadVersion(5)); // 4
        System.out.println(new Solution(4).firstBadVersion(10)); // 4
        System.out.println(new Solution(6).firstBadVersion(10)); // 6
        System.out.println(new Solution(2126753390).firstBadVersion(1702766719)); // 1702766719
    }
}
