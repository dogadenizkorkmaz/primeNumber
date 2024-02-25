public class Main {
    public static void main(String[] args) {

        int i; //Define integer variable "i

        for (i = 2; i <= 100; i++) {//Check numbers starting from 2 to 100
            int count = 0;
            for (int j = 2; j < i; j++) {//Used to determine whether i is prime or not
                if (i % j == 0) { //If a value i is exactly divisible by any value j, this means the count value will increase.
                    count++;
                }
            }
            if (count == 0) {//If count is still 0 at the end of the loop, this indicates that i is a prime number.
                System.out.println(i);
            }
        }
    }
}