class Solution {
    public int getLucky(String s, int k) {
                int pos = 0;
                int sum = 0;
                int rem = 0;
                int ans = 0;
                for (int i = 0; i < s.length(); i++) {
                        pos = s.charAt(i) - 'a' + 1;
                        System.out.println(pos);
                        while (pos > 0) {
                                rem = pos % 10;
                                sum = sum + rem;
                                pos = pos / 10;
                        }
                        pos = 0;
                }
                if (k < 2) {
                        return sum;
                } else {
                        while (k > 1) {
                                ans = 0;
                                while (sum > 0) {
                                        rem = sum % 10;
                                        ans = ans + rem;
                                        sum = sum / 10;
                                }
                                sum = ans;
                                k--;
                        }
                }
                return ans;
    }
}