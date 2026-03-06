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
            if (userInput % count == 0) {
                if (!factors.isEmpty()) {
                    factors += ", ";
                }
                factors += count;
            }
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
        int newNumber = userInput;
        String lengthOfNumbers = String.valueOf(newNumber);
        int length = lengthOfNumbers.length();
        double sum = 0;
        double digit;

        while (newNumber != 0) {
            digit = newNumber % 10;
            sum += Math.pow(digit, length);
            newNumber = newNumber / 10;
        }
        return sum == userInput;
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

    public static boolean getNivenNumber(int userInput) {
        int userNumber = userInput;
        int remainder;
        int sum = 0;
        while(userNumber != 0) {
            remainder = userNumber % 10;
            sum += remainder;
            userNumber = userNumber / 10;
        }
        return userInput % sum == 0;
    }

    public static boolean getSpyNumber(int userInput) {
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

    public static boolean getPositiveNumber(int userInput) {
        return userInput > 0;
    }

    public static boolean getNegativeNumber(int userInput) {
        return userInput < 0;
    }

    public static boolean checkIfNumberIsZero(int userInput) {
        return userInput == 0;
    }

   public static boolean getCompositeNumbers(int userInput) {
       int divisorCount = 0;
       for (int count = 1; count <= userInput; count++) {
           if (userInput % count == 0) {
               divisorCount++;
           }
       }
       return divisorCount > 2;
    }

    public static boolean getAbundantNumber(int userInput) {
        int factors = 0;
        for (int count = 1; count < userInput; count++) {
            if (userInput % count == 0)
                factors  += count;
        }
        return factors > userInput;
    }

    public static boolean getDeficientNumber(int userInput) {
        int factors = 0;
        for (int count = 1; count < userInput; count++) {
            if (userInput % count == 0)
                factors  += count;
        }
        return factors < userInput;
    }

    private static int getDigitalSum(int userInput) {
        int remainder;
        int sum = 0;
        while (userInput != 0) {
            remainder = userInput % 10;
            sum += remainder;
            userInput /= 10;
        }
        return sum;
    }


    public static void getProfileOfNumber(int userInput) {
        if (NumberProfile.getPositiveNumber(userInput))         System.out.println(userInput + " is a Positive Number");
        if (NumberProfile.getNegativeNumber(userInput))         System.out.println(userInput + " is a Negative Number");
        if (NumberProfile.checkIfNumberIsZero(userInput))         System.out.println(userInput + " is Zero");
        if (NumberProfile.checkIsEven(userInput))         System.out.println(userInput + " is an Even Number");
        if (NumberProfile.checkIsOdd(userInput))          System.out.println(userInput + " is an Odd Number");
        if (NumberProfile.checkIsPrime(userInput))        System.out.println(userInput + " is a Prime Number");
        if (NumberProfile.getCompositeNumbers(userInput))        System.out.println(userInput + " is a Composite Number");
        if (NumberProfile.getAbundantNumber(userInput))        System.out.println(userInput + " is an Abundant Number");
        if (NumberProfile.getDeficientNumber(userInput))        System.out.println(userInput + " is an Deficient Number");
        if (NumberProfile.checkIsPerfectNumber(userInput))System.out.println(userInput + " is a Perfect number");
        if (NumberProfile.checkIsSquare(userInput))       System.out.println(userInput + " is a Square number");
        if (NumberProfile.checkIsPalindrome(userInput))   System.out.println(userInput + " is a Palindrome");
        if (NumberProfile.checkArmstrongNumber(userInput))System.out.println(userInput + " is an Armstrong number");
        if (NumberProfile.checkIsPerfectSquare(userInput))System.out.println(userInput + " is a Perfect Square");
        if (NumberProfile.getNivenNumber(userInput))    System.out.println(userInput + " is a Niven number");
        if (NumberProfile.getSpyNumber(userInput))    System.out.println(userInput + " is a Spy number");
        if (NumberProfile.checkIsCube(userInput))         System.out.println(userInput + " is a Cube number");
        if (NumberProfile.checkIsStrongNumber(userInput)) System.out.println(userInput + " is a Strong number");

        System.out.println("Factors:   " + NumberProfile.getFactorOfNumber(userInput));
        System.out.println("Square:    " + NumberProfile.getSquareOfNumber(userInput));
        System.out.println("Factorial: " + NumberProfile.getFactorial(userInput));
        System.out.println("Digital Sum: " + NumberProfile.getDigitalSum(userInput));
    }


}