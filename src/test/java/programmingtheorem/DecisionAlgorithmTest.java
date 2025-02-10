package programmingtheorem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DecisionAlgorithmTest {

    // JUnit5
    @Test
    void testDecideIfNumIsEven_withEvenNumbers() {
        // Arrange
        int[] numbers = {2, 4, 6, 1};
        boolean expected = true;

        // Act
        boolean actual = DecisionAlgorithm.decideIfNumIsEven(numbers);

        // Assert
        assertEquals(expected, actual);
    }

    // Ez jobb megoldás!
    @Test
    void testDecideIfNumIsEven_withEvenNumbersOnly() {
        // Arrange
        int[] numbers = {2, 4, 6, 2};

        // Act
        boolean actual = DecisionAlgorithm.decideIfNumIsEven(numbers);

        // Assert
        assertTrue(actual);
    }

    @Test
    void testDecideIfNumIsEven_withOddNumbersOnly() {
        // Arrange
        int[] numbers = {1, 3, 5};

        // Act
        boolean actual = DecisionAlgorithm.decideIfNumIsEven(numbers);

        // Assert
        assertFalse(actual);
    }

    @Test
    void testDecideIfNumIsEven_withMixNumbers() {
        // Arrange
        int[] numbers = {1, 2};

        // Act
        boolean actual = DecisionAlgorithm.decideIfNumIsEven(numbers);

        // Assert
        assertTrue(actual);
    }

    @Test
    void testDecideIfNumIsEven_withOneEvenNum() {
        // Arrange
        int[] numbers = {2};

        // Act
        boolean actual = DecisionAlgorithm.decideIfNumIsEven(numbers);

        // Assert
        assertTrue(actual);
    }
    @Test
    void testDecideIfNumIsEven_withOneOddNum() {
        // Arrange
        int[] numbers = {1};

        // Act
        boolean actual = DecisionAlgorithm.decideIfNumIsEven(numbers);

        // Assert
        assertFalse(actual);
    }

    @Test
    void testDecideIfNumIsEven_withEmptyArray() {
        // Arrange
        int[] numbers = {};

        // Act
        boolean actual = DecisionAlgorithm.decideIfNumIsEven(numbers);

        // Assert
        assertFalse(actual);
    }
}