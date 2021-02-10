public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        if(number < 1) {
            return false;
        }
        int i = 1, sum = 0, x;
        while(i < number){
            x = number % i;
            if(x == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println(sum);
        return sum == number;
    }
}