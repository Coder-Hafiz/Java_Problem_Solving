/*
Prime Number কি?
যে সংখ্যা শুধু ১ এবং নিজে দিয়ে নিখুঁতভাবে ভাগ করা যায়, তাকে মৌলিক সংখ্যা বলে।

যেমন:
2 → ভাগ যায় 1 & 2 → prime
3 → ভাগ যায় 1 & 3 → prime
4 → ভাগ যায় 1, 2, 4 → 3 বার → prime না 
5 → 1 & 5 → prime 

Hafiz Vaiya (:
 */
public class PrimeNumbers {
    public static void main(String[] args) {

        System.out.println("1 - 25 Mouloin Songkha:");

        for (int num = 2; num <= 25; num++) {
            int count = 0;

            // check divisor count
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    count++;
                }
            }
            // prime হলে divisor count হবে 2 (1 & number itself)
            if (count == 2) {
                System.out.print(num + " ");
            }
        }
    }
}

/*
num % i == 0 num কে i দিয়ে ভাগ দিলে যদি বাকি 0 হয় তাহলে perfect divisor.
count == 2 prime number এর divisor মাত্র 2টা হয়.
outer loop number ধরে.
inner loop divisor count করে.
 */