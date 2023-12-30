public class Soution {
    public static void main(String[] args) {

    }

    public static int sum(int[] ara){
        int sum = 0;
        for (int i = 0; i < ara.length; i++) {
            sum += ara[i];
        }
        return sum;
    }

    public static int getMax(int[] ara){
        int max = ara[0];
        for (int i = 1; i < ara.length; i++) {
            if (ara[i] > max) {
                max = ara[i];
            }
        }
        return max;
    }

    public static int getMin(int[] ara){
        int min = ara[0];
        for (int i = 1; i < ara.length; i++) {
            if (ara[i] < min) {
                min = ara[i];
            }
        }
        return min;
    }
}
