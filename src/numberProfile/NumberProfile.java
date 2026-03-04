package numberProfile;

public class NumberProfile {
    public static boolean checkIsEven(int userInput) {
        return userInput % 2 == 0;
    }

    public static boolean checkIsOdd(int userInput) {
        return userInput % 2 != 0;
    }

    public static boolean checkIsPrime(int userInput) {
        int factors = 0;
        for (int count = 1; count <= userInput; count++) {
            if (userInput % count == 0) {
                factors += 1;
            }
        }
        return factors <= 2;
    }

    public static String getFactorOfNumber(int userInput) {
        String factors = "";
        for (int count = 1; count <= userInput; count++) {
            if (userInput % count == 0)
                factors  += count;
        }
        return factors;
    }

    public static boolean checkIsSquare(int userInput) {
        int counter = 0;
        for (int count = 1; count < userInput; count++) {
            if (count * count == userInput) {
                counter += 1;
            }
        }
        return counter == 1;
    }

    public static boolean checkIsPalindrome(int userInput) {
        int remainder;
        int reverse = 0;
        int newNumber = userInput;
        while (newNumber != 0) {
            remainder = newNumber % 10;
            reverse = reverse * 10 + remainder;
            newNumber /= 10;
        }

        return reverse == userInput;
    }

    public static long getFactorial(int userInput) {
        long factorial = 1;
        for (int count = userInput; count >= 1; count--) {
            factorial *= count;
        }
        return factorial;
    }

    public static int getSquareOfNumber(int userInput) {
        return userInput * userInput;
    }

    public static boolean checkArmstrongNumber(int userInput) {

        for (int count = 1; count <= userInput; count++) {
            int newNumber = count;
            String lengthOfNumbers = String.valueOf(newNumber);
            int length = lengthOfNumbers.length();
            double exponential;
            double sum = 0;
            double digit;

            while (newNumber != 0) {
                digit = newNumber % 10;
                exponential = Math.pow(digit, length);
                sum += exponential;
                newNumber = newNumber / 10;
            }
            if (sum == count) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkIsPerfectNumber(int userInput) {
        int sum = 0;
        for (int count = 1; count < userInput; count++) {
            if (userInput % count == 0)
                sum += count;
        }
        return sum == userInput;
    }

    public static boolean checkIsPerfectSquare(int userInput) {
        if (userInput < 0) return false;
        int sqrt = (int) Math.sqrt(userInput); return sqrt * sqrt == userInput;
    }

    public static boolean checkNivenNumber(int userInput) {
        int userNumber = userInput;
        int remainder;
        int sum = 0;
        while(userNumber != 0) {
            remainder = userNumber % 10;
            sum += remainder;
            userNumber = userNumber / 10;
        }
        return userInput / sum == 0;
    }

    public static boolean checkIsSpyNumber(int userInput) {
        int remainder;
        int sum = 0;
        int product = 1;
        while (userInput != 0) {
            remainder = userInput % 10;
            sum += remainder;
            product *= remainder;
            userInput /= 10;
        }
        return sum == product;
    }

    public static boolean checkIsStrongNumber(int userInput) {
        int userNumber = userInput;
        int remainder;
        int sum = 0;
        while (userNumber != 0) {
            remainder = userNumber % 10;
            sum += (int)getFactorial(remainder);
            userNumber /= 10;
        }
        return sum == userInput;
    }

    public static boolean checkIsCube(int userInput) {
        for(int count = 1; count <= userInput; count++) {
            if(Math.pow(count, 3) == userInput) {
                return true;
            }
        }
        return false;
    }

        public static void getProfileOfNumber(int userInput) {
        System.out.println("isEven:          " + (NumberProfile.checkIsEven(userInput) ? "Yes" : "No"));
        System.out.println("isOdd:          " + (NumberProfile.checkIsOdd(userInput) ? "Yes" : "No"));
        System.out.println("isPrime:         " + (NumberProfile.checkIsPrime(userInput) ? "Yes" : "No"));
        System.out.println("isPerfect:       " + (NumberProfile.checkIsPerfectNumber(userInput) ? "Yes" : "No"));
        System.out.println("isSquare:        " + (NumberProfile.checkIsSquare(userInput) ? "Yes" : "No"));
        System.out.println("isPalindrome:    " + (NumberProfile.checkIsPalindrome(userInput) ? "Yes" : "No"));
        System.out.println("isArmstrong:     " + (NumberProfile.checkArmstrongNumber(userInput) ? "Yes" : "No"));
        System.out.println("perfectSquare:     " + (NumberProfile.checkIsPerfectSquare(userInput) ? "Yes" : "No"));
        System.out.println("isNevin:     "      + (NumberProfile.checkNivenNumber(userInput) ? "Yes" : "No"));
        System.out.println("isSpyNumber:     "      + (NumberProfile.checkIsSpyNumber(userInput) ? "Yes" : "No"));
        System.out.println("isCube:     "      + (NumberProfile.checkIsCube(userInput) ? "Yes" : "No"));
        System.out.println("isStrongNumber:     "      + (NumberProfile.checkIsStrongNumber(userInput) ? "Yes" : "No"));
        System.out.println("Factors of " + userInput + ":       " + NumberProfile.getFactorOfNumber(userInput));
        System.out.println("Square of " + userInput + ":       " + NumberProfile.getSquareOfNumber(userInput));
        System.out.println("Factorial of " + userInput + ":       " + NumberProfile.getFactorial(userInput));

    }

}