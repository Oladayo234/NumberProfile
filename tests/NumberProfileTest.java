import numberProfile.NumberProfile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class NumberProfileTest {
    @Test
    void checkIsEven_returnsTrue_forEvenNumber() {
        assertTrue(NumberProfile.checkIsEven(4));
    }

    @Test
    void checkIsEven_returnsFalse_forOddNumber() {
        assertFalse(NumberProfile.checkIsEven(7));
    }

    @Test
    void checkIsOdd_returnsTrue_forOddNumber() {
        assertTrue(NumberProfile.checkIsOdd(9));
    }

    @Test
    void checkIsOdd_returnsFalse_forEvenNumber() {
        assertFalse(NumberProfile.checkIsOdd(8));
    }

    @Test
    void checkIsPrime_returnsTrue_forPrimeNumber() {
        assertTrue(NumberProfile.checkIsPrime(7));
    }

    @Test
    void checkIsPrime_returnsFalse_forNonPrimeNumber() {
        assertFalse(NumberProfile.checkIsPrime(9));
    }

    @Test
    void getFactorOfNumber_returnsCorrectFactors_forTwelve() {
        assertEquals("1, 2, 3, 4, 6, 12", NumberProfile.getFactorOfNumber(12));
    }

    @Test
    void getFactorOfNumber_returnsSingleFactor_forOne() {
        assertEquals("1", NumberProfile.getFactorOfNumber(1));
    }

    @Test
    void checkIsSquare_returnsTrue_forPerfectSquare() {
        assertTrue(NumberProfile.checkIsSquare(9));
    }

    @Test
    void checkIsSquare_returnsFalse_forNonPerfectSquare() {
        assertFalse(NumberProfile.checkIsSquare(10));
    }

    @Test
    void checkIsPalindrome_returnsTrue_forPalindromeNumber() {
        assertTrue(NumberProfile.checkIsPalindrome(121));
    }

    @Test
    void checkIsPalindrome_returnsFalse_forNonPalindromeNumber() {
        assertFalse(NumberProfile.checkIsPalindrome(123));
    }

    @Test
    void getFactorial_returnsCorrectValue_forFive() {
        assertEquals(120L, NumberProfile.getFactorial(5));
    }

    @Test
    void getFactorial_returnsOne_forZero() {
        assertEquals(1L, NumberProfile.getFactorial(0));
    }

    @Test
    void getSquareOfNumber_returnsCorrectSquare_forFour() {
        assertEquals(16, NumberProfile.getSquareOfNumber(4));
    }

    @Test
    void getSquareOfNumber_returnsZero_forZero() {
        assertEquals(0, NumberProfile.getSquareOfNumber(0));
    }

    @Test
    void checkArmstrongNumber_returnsTrue_forArmstrongNumber() {
        assertTrue(NumberProfile.checkArmstrongNumber(153));
    }

    @Test
    void checkArmstrongNumber_returnsFalse_forNonArmstrongNumber() {
        assertFalse(NumberProfile.checkArmstrongNumber(100));
    }

    @Test
    void checkIsPerfectNumber_returnsTrue_forPerfectNumber() {
        assertTrue(NumberProfile.checkIsPerfectNumber(6));
    }

    @Test
    void checkIsPerfectNumber_returnsFalse_forNonPerfectNumber() {
        assertFalse(NumberProfile.checkIsPerfectNumber(10));
    }

    @Test
    void checkIsPerfectSquare_returnsTrue_forPerfectSquare() {
        assertTrue(NumberProfile.checkIsPerfectSquare(25));
    }

    @Test
    void checkIsPerfectSquare_returnsFalse_forNegativeNumber() {
        assertFalse(NumberProfile.checkIsPerfectSquare(-4));
    }

    @Test
    void getNivenNumber_returnsTrue_forNivenNumber() {
        assertTrue(NumberProfile.getNivenNumber(18));
    }

    @Test
    void getNivenNumber_returnsFalse_forNonNivenNumber() {
        assertFalse(NumberProfile.getNivenNumber(19));
    }

    @Test
    void getSpyNumber_returnsTrue_forSpyNumber() {
        assertTrue(NumberProfile.getSpyNumber(1124));
    }

    @Test
    void getSpyNumber_returnsFalse_forNonSpyNumber() {
        assertFalse(NumberProfile.getSpyNumber(1234));
    }

    @Test
    void checkIsStrongNumber_returnsTrue_forStrongNumber() {
        assertTrue(NumberProfile.checkIsStrongNumber(145));
    }

    @Test
    void checkIsStrongNumber_returnsFalse_forNonStrongNumber() {
        assertFalse(NumberProfile.checkIsStrongNumber(100));
    }

    @Test
    void checkIsCube_returnsTrue_forCubeNumber() {
        assertTrue(NumberProfile.checkIsCube(27));
    }

    @Test
    void checkIsCube_returnsFalse_forNonCubeNumber() {
        assertFalse(NumberProfile.checkIsCube(10));
    }

    @Test
    void getPositiveNumber_returnsTrue_forPositiveNumber() {
        assertTrue(NumberProfile.getPositiveNumber(5));
    }

    @Test
    void getPositiveNumber_returnsFalse_forNegativeNumber() {
        assertFalse(NumberProfile.getPositiveNumber(-3));
    }

    @Test
    void getNegativeNumber_returnsTrue_forNegativeNumber() {
        assertTrue(NumberProfile.getNegativeNumber(-5));
    }

    @Test
    void getNegativeNumber_returnsFalse_forPositiveNumber() {
        assertFalse(NumberProfile.getNegativeNumber(3));
    }

    @Test
    void checkIfNumberIsZero_returnsTrue_forZero() {
        assertTrue(NumberProfile.checkIfNumberIsZero(0));
    }

    @Test
    void checkIfNumberIsZero_returnsFalse_forNonZero() {
        assertFalse(NumberProfile.checkIfNumberIsZero(1));
    }

    @Test
    void getCompositeNumbers_returnsTrue_forCompositeNumber() {
        assertTrue(NumberProfile.getCompositeNumbers(12));
    }

    @Test
    void getCompositeNumbers_returnsFalse_forPrimeNumber() {
        assertFalse(NumberProfile.getCompositeNumbers(7));
    }

    @Test
    void getAbundantNumber_returnsTrue_forAbundantNumber() {
        assertTrue(NumberProfile.getAbundantNumber(12));
    }

    @Test
    void getAbundantNumber_returnsFalse_forNonAbundantNumber() {
        assertFalse(NumberProfile.getAbundantNumber(7));
    }

    @Test
    void getDeficientNumber_returnsTrue_forDeficientNumber() {
        assertTrue(NumberProfile.getDeficientNumber(7));
    }

    @Test
    void getDeficientNumber_returnsFalse_forAbundantNumber() {
        assertFalse(NumberProfile.getDeficientNumber(12));
    }
}