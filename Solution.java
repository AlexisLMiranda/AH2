class Solution {

    // Method to check if a number is prime
    static boolean isPrime(int n)
    {
        // Validation
        if (n <= 1)

        // Check from 2 to n - 1
        for (int i = 2; i < n; i++)
            if (n % i == 0)
            return false;

        return true; 
    }

    // Driver program
    public static void main(String[] args)
    {
           if (isPrime(6)){
           System.out.println("true");
    }
    else 
    {
           System.out.println("false");
    }
  }
}
