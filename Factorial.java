import java.util.Scanner;
public class Factorial{
// Write your code here



    // Write Your Code Here
    public int countDigits(int num) {

        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
    public void Arm() {
        int b;
        int sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("Give your Value");
        int a = s.nextInt();
        int temp = a;
        int n = countDigits(a); 
        while (a > 0) {
            b = a % 10;
            int power = 1;
            for (int i = 1; i <=n; i++) {
                power *= b;
            }
            sum += power;
            a = a / 10;
        }
        if (temp == sum) {
            System.out.println(temp + " is an Factorial");
        } else {
            System.out.println(temp + " is not an Factorial");
        }
    }

    public static void main(String[] args) {
        Factorial m = new Factorial();
        m.Arm();
    }
}
