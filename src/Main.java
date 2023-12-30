public class Main {
    public static void main(String[] args) {
        int[] ara = {1, 2, 30, 4, 50};
        System.out.println(getMax(ara));
        System.out.println(getMin(ara));
        System.out.println(sum(ara));

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 3; j++){
                for(int k = 0; k < 3; k++){
                    System.out.println(i + " " + j + " " + k);
                }
            }
        }
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