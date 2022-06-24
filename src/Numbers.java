public class Numbers {
    private static int[] arr = {10, 15, 3, 7};
   private  int k;

    public Numbers(int k) {
        this.k = k;
    }

    public static boolean addList(int k) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == k)
                    return true;
            }
        }
        return false;
    }
}


