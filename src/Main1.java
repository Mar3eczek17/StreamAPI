public class Main1 {
    public static void main(String[] args) {
        int[] arr = {120, 410, 85, 32, 314, 12};
        int count = 0;
        for (int x : arr) {
            if (x>=300) continue;
            x+=11;
            count ++;
            if (count>3) break;
            System.out.println(x);
        }
    }
}
