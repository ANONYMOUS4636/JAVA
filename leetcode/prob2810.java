class Solution {
    public String finalString(String s) {
        char[] arr = new char[s.length()];
        int len = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'i') {
                reverse(arr, len);
            } else {
                arr[len++] = s.charAt(i);
            }
        }
        return new String(arr, 0, len);
    }
    private void reverse(char[] arr, int len) {
        int left = 0, right = len - 1;
        while (left < right) {
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}