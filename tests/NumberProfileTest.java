import numberProfile.NumberProfile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberProfileTest {
    @Test
    public void checkIsEven_returnsTrue_forEvenNumber() {
        assertTrue(NumberProfile.checkIsEven(4));
    }

    @Test
    public void checkIsEven_returnsFalse_forOddNumber() {
        assertFalse(NumberProfile.checkIsEven(7));
    }

    @Test
    public void checkIsOdd_returnsTrue_forOddNumber() {
        assertTrue(NumberProfile.checkIsOdd(9));
    }

    @Test
    public void checkIsOdd_returnsFalse_forEvenNumber() {
        assertFalse(NumberProfile.checkIsOdd(8));
    }

    @Test
    public void checkIsPrime_returnsTrue_forPrimeNumber() {
        assertTrue(NumberProfile.checkIsPrime(7));
    }

    @Test
    public void checkIsPrime_returnsFalse_forNonPrimeNumber() {
        assertFalse(NumberProfile.checkIsPrime(9));
    }

    @Test
    public void getFactorOfNumber_returnsCorrectFactors_forTwelve() {
        assertEquals("1, 2, 3, 4, 6, 12", NumberProfile.getFactorOfNumber(12));
    }

    @Test
    public void getFactorOfNumber_returnsSingleFactor_forOne() {
        assertEquals("1", NumberProfile.getFactorOfNumber(1));
    }

    @Test
    public void checkIsSquare_returnsTrue_forPerfectSquare() {
        assertTrue(NumberProfile.checkIsSquare(9));
    }

    @Test
    public void checkIsSquare_returnsFalse_forNonPerfectSquare() {
        assertFalse(NumberProfile.checkIsSquare(10));
    }

    @Test
    public void checkIsPalindrome_returnsTrue_forPalindromeNumber() {
        assertTrue(NumberProfile.checkIsPalindrome(121));
    }

    @Test
    public void checkIsPalindrome_returnsFalse_forNonPalindromeNumber() {
        assertFalse(NumberProfile.checkIsPalindrome(123));
    }

    @Test
    public void getFactorial_returnsCorrectValue_forFive() {
        assertEquals(120L, NumberProfile.getFactorial(5));
    }

    @Test
    public void getFactorial_returnsOne_forZero() {
        assertEquals(1L, NumberProfile.getFactorial(0));
    }

    @Test
    public void getSquareOfNumber_returnsCorrectSquare_forFour() {
        assertEquals(16, NumberProfile.getSquareOfNumber(4));
    }

    @Test
    public void getSquareOfNumber_returnsZero_forZero() {
        assertEquals(0, NumberProfile.getSquareOfNumber(0));
    }

    @Test
    public void checkArmstrongNumber_returnsTrue_forArmstrongNumber() {
        assertTrue(NumberProfile.checkArmstrongNumber(153));
    }

    @Test
    public void checkArmstrongNumber_returnsFalse_forNonArmstrongNumber() {
        assertFalse(NumberProfile.checkArmstrongNumber(100));
    }

    @Test
    public void checkIsPerfectNumber_returnsTrue_forPerfectNumber() {
        assertTrue(NumberProfile.checkIsPerfectNumber(6));
    }

    @Test
    public void checkIsPerfectNumber_returnsFalse_forNonPerfectNumber() {
        assertFalse(NumberProfile.checkIsPerfectNumber(10));
    }

    @Test
    public void checkIsPerfectSquare_returnsTrue_forPerfectSquare() {
        assertTrue(NumberProfile.checkIsPerfectSquare(25));
    }

    @Test
    public void checkIsPerfectSquare_returnsFalse_forNegativeNumber() {
        assertFalse(NumberProfile.checkIsPerfectSquare(-4));
    }

    @Test
    public void getNivenNumber_returnsTrue_forNivenNumber() {
        assertTrue(NumberProfile.getNivenNumber(18));
    }

    @Test
    public void getNivenNumber_returnsFalse_forNonNivenNumber() {
        assertFalse(NumberProfile.getNivenNumber(19));
    }

    @Test
    public void getSpyNumber_returnsTrue_forSpyNumber() {
        assertTrue(NumberProfile.getSpyNumber(1124));
    }

    @Test
    public void getSpyNumber_returnsFalse_forNonSpyNumber() {
        assertFalse(NumberProfile.getSpyNumber(1234));
    }

    @Test
    public void checkIsStrongNumber_returnsTrue_forStrongNumber() {
        assertTrue(NumberProfile.checkIsStrongNumber(145));
    }

    @Test
    public void checkIsStrongNumber_returnsFalse_forNonStrongNumber() {
        assertFalse(NumberProfile.checkIsStrongNumber(100));
    }

    @Test
    public void checkIsCube_returnsTrue_forCubeNumber() {
        assertTrue(NumberProfile.checkIsCube(27));
    }

    @Test
    public void checkIsCube_returnsFalse_forNonCubeNumber() {
        assertFalse(NumberProfile.checkIsCube(10));
    }

    @Test
    public void getPositiveNumber_returnsTrue_forPositiveNumber() {
        assertTrue(NumberProfile.getNaturalNumber(5));
    }

    @Test
    public void getPositiveNumber_returnsFalse_forNegativeNumber() {
        assertFalse(NumberProfile.getNaturalNumber(-3));
    }

    @Test
    public void getNegativeNumber_returnsTrue_forNegativeNumber() {
        assertTrue(NumberProfile.getNegativeNumber(-5));
    }

    @Test
    public void getNegativeNumber_returnsFalse_forPositiveNumber() {
        assertFalse(NumberProfile.getNegativeNumber(3));
    }

    @Test
    public void checkIfNumberIsZero_returnsTrue_forZero() {
        assertTrue(NumberProfile.checkIfNumberIsZero(0));
    }

    @Test
    public void checkIfNumberIsZero_returnsFalse_forNonZero() {
        assertFalse(NumberProfile.checkIfNumberIsZero(1));
    }

    @Test
    public void getCompositeNumbers_returnsTrue_forCompositeNumber() {
        assertTrue(NumberProfile.getCompositeNumbers(12));
    }

    @Test
    public void getCompositeNumbers_returnsFalse_forPrimeNumber() {
        assertFalse(NumberProfile.getCompositeNumbers(7));
    }

    @Test
    public void getAbundantNumber_returnsTrue_forAbundantNumber() {
        assertTrue(NumberProfile.getAbundantNumber(12));
    }

    @Test
    public void getAbundantNumber_returnsFalse_forNonAbundantNumber() {
        assertFalse(NumberProfile.getAbundantNumber(7));
    }

    @Test
    public void getDeficientNumber_returnsTrue_forDeficientNumber() {
        assertTrue(NumberProfile.getDeficientNumber(7));
    }

    @Test
    public void getDeficientNumber_returnsFalse_forAbundantNumber() {
        assertFalse(NumberProfile.getDeficientNumber(12));
    }

    @Test
    public void getDigitalSum_returnsCorrectSum_forMultiDigitNumber() {
        assertEquals(6, NumberProfile.getDigitalSum(123));
    }

    @Test
    public void getDigitalSum_returnsZero_forZero() {
        assertEquals(0, NumberProfile.getDigitalSum(0));
    }

    @Test
    public void getWholeNumber_returnsTrue_forInteger() {
        assertTrue(NumberProfile.getInteger(4.0));
    }

    @Test
    public void getInteger() {
        assertFalse(NumberProfile.getInteger(4.5));
    }

    @Test
    void convertToBinary_returnsCorrectBinary_forPositiveNumber() {
        assertEquals("1010", NumberProfile.convertToBinary(10));
    }

    @Test
    void convertToBinary_returnsZero_forZero() {
        assertEquals("0", NumberProfile.convertToBinary(0));
    }

    @Test
    void convertToOctalDecimal_returnsCorrectOctal_forPositiveNumber() {
        assertEquals("17", NumberProfile.convertToOctalDecimal(15));
    }

    @Test
    void convertToOctalDecimal_returnsZero_forZero() {
        assertEquals("0", NumberProfile.convertToOctalDecimal(0));
    }

    @Test
    void convertToHexadecimal_returnsCorrectHex_forPositiveNumber() {
        assertEquals("1F", NumberProfile.convertToHexadecimal(31));
    }

    @Test
    void convertToHexadecimal_returnsZero_forZero() {
        assertEquals("0", NumberProfile.convertToHexadecimal(0));
    }

    @Test
    void checkIsFibonacci_returnsTrue_forFibonacciNumber() {
        assertTrue(NumberProfile.checkIsFibonacci(21));
    }

    @Test
    void checkIsFibonacci_returnsFalse_forNonFibonacciNumber() {
        assertFalse(NumberProfile.checkIsFibonacci(10));
    }
}