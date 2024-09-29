package javacax;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
// тест дистанции
    @Test
    void distance() {
        assertEquals(5.0, Main.distance(0, 3, 0, 4), 0.001); 
        assertEquals(0.0, Main.distance(0, 0, 0, 0), 0.001); 
        assertEquals(2.236, Main.distance(1, 2, 1, 3), 0.001); 
    }
// ТРИПбоначи
@Test
public void testTribonacciBaseCases() {
    assertEquals(0, Main.tribonacci(0));
    assertEquals(0, Main.tribonacci(1));
    assertEquals(1, Main.tribonacci(2));
}

@Test
public void testTribonacciSmallValues() {
    assertEquals(1, Main.tribonacci(3));
    assertEquals(2, Main.tribonacci(4));
    assertEquals(4, Main.tribonacci(5));
    assertEquals(7, Main.tribonacci(6));
    assertEquals(0, Main.tribonacci(-1));
    assertEquals(0, Main.tribonacci(0));
    assertEquals(0, Main.tribonacci(1));
    assertEquals(1, Main.tribonacci(2));
    assertEquals(13, Main.tribonacci(7));
}

@Test
public void testTribonacciLargeValue() {
    assertEquals(755476, Main.tribonacci(25));
}

@Test
public void testTribonacciNegativeValue() {
    assertEquals(0, Main.tribonacci(-1));
}
// треугольники
@Test
void triangle() {
   
    assertTrue(Main.triangle(3, 4, 5));
    assertTrue(Main.triangle(1, 1, 1)); 
    assertTrue(Main.triangle(10, 10, 14)); 
    assertFalse(Main.triangle(0, 0, 0));
    assertFalse(Main.triangle(-2, -2, -5)); 
}
//a^n
void power() {
    assertEquals(8.0, Main.power(2, 3), 0.001);
    assertEquals(1.0, Main.power(5, 0), 0.001); 
    assertEquals(27.0, Main.power(3, 3), 0.001); 
    assertEquals(0.125, Main.power(2, -3), 0.001); 
}
@Test
void NegativePower(){
    assertNotEquals(0.5, Main.power(2.0f, -1), " incorrect");
}
// a^n
@Test
void powerLoop() {
    assertEquals(8.0, Main.powerLoop(2, 3), 0.001);
    assertEquals(1.0, Main.powerLoop(5, 0), 0.001); 
    assertEquals(27.0, Main.powerLoop(3, 3), 0.001); 
    assertEquals(0.125, Main.powerLoop(2, -3), 0.001); 
}

@Test
    void NegativePowerLoop(){
    assertEquals(-1,Main.powerLoop(0,-1));
}
}


