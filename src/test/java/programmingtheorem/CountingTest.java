package programmingtheorem;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountingTest {

    // Triple A (Arrange, Act, Assert) módszer tesztelés
    @Test
    @DisplayName("Testing method, that is selecting odd numbers from an array")
    void testCountOdd() {
        // arrange: felállítunk egy bemenő paraméterként egy inputot, valamint definiáljuk az elvárt output-ot
        int[] testNumbers = new int[]{1, 2, 3, 4, 5};
        int expected = 3;
        // act: ahol meghivjuk magát a metódust
        int actual = Counting.countOdd(testNumbers);
        // assert: ellenőrzizzük, hogy a elvárt és az aktuális megegyezik-e
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given empty array, when calling count odd, then return stb.")
    void givenEmptyArray_whenCallingCountOdd_thenReturnNoSuchElementException() {
        // Given
        // When
        // Then
    }
}