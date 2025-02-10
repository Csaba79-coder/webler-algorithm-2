package programmingtheorem;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class FilterAlgorithmTest {

    @Test
    void testFilter_withEmptyArray() {
        // Arrange
        int[] testNumbers = {};
        int[] expected = {};
        // Act
        int[] actual = FilterAlgorithm.filter(testNumbers);
        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFilter_withNullArray() {
        // Arrange
        int[] testNumbers = null;
        int[] expected = null;
        // Act
        int[] actual = FilterAlgorithm.filter(testNumbers);
        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFilter_withNullArray2() {
        // Arrange
        int[] testNumbers = null;
        // Act
        int[] actual = FilterAlgorithm.filter(testNumbers);
        // Assert
        assertNull(actual);
    }

    @Test
    void testFilter_withOneOddElement() {
        // Arrange
        int[] testNumbers = {1};
        int[] expected = {};
        // Act
        int[] actual = FilterAlgorithm.filter(testNumbers);
        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFilter_withOneEvenElement() {
        // Arrange
        int[] testNumbers = {2};
        int[] expected = {2};
        // Act
        int[] actual = FilterAlgorithm.filter(testNumbers);
        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFilter_withOneZeroElement() {
        // Arrange
        int[] testNumbers = {0};
        int[] expected = {0};
        // Act
        int[] actual = FilterAlgorithm.filter(testNumbers);
        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFilter_withOnlyEvenElements() {
        // Arrange
        int[] testNumbers = {2, 4, 6, 8, 10};
        int[] expected = {2, 4, 6, 8, 10};
        // Act
        int[] actual = FilterAlgorithm.filter(testNumbers);
        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFilter_withOnlyOddElements() {
        // Arrange
        int[] testNumbers = {1, 3, 5, 11, 101};
        int[] expected = {};
        // Act
        int[] actual = FilterAlgorithm.filter(testNumbers);
        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFilter_withMixedElements() {
        // Arrange
        int[] testNumbers = {1, 2, 3, 5, 11, 101, 6};
        int[] expected = {2, 6};
        // Act
        int[] actual = FilterAlgorithm.filter(testNumbers);
        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFilter_withMixedElements2() {
        // Arrange
        int[] testNumbers = {1, 2, 3, 5, 11, 101, 6};
        int[] expected = {6, 2};
        // Act
        int[] actual = FilterAlgorithm.filter(testNumbers);
        Arrays.sort(expected);
        Arrays.sort(actual);
        // Assert
        assertArrayEquals(expected, actual);
    }

    @Test
    void testFilter_withMixedElementsIncludingZero() {
        // Arrange
        int[] testNumbers = {0, 1, 2, 3, 5, 11, 101, 6};
        int[] expected = {0, 2, 6};
        // Act
        int[] actual = FilterAlgorithm.filter(testNumbers);
        // Assert
        assertArrayEquals(expected, actual);
    }
}