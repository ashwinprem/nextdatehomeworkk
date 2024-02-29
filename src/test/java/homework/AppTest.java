package homework;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class) // Correct placement of the annotation
public class AppTest {
  /**
   * Rigorous Test :-)
   */
  @BeforeAll
  public static void shouldAnswerWithTrue() {
      System.out.println("Testing Starting.");
  }

  /* Validating normal functionality */
  @DisplayName("Normal Functionality - 1.1.1912")
//  @Tag("Valid Input")
  @Test
  public void test1()
  {
      assertEquals("2/1/1912", App.NextDate(1, 1, 1912));
  }

  /* Validating normal functionality */
  @DisplayName("Normal Functionality - 31.1.1912")
 // @Tag("Valid Input")
  @Test
  public void test2()
  {
    assertEquals("1/2/1912", App.NextDate(31, 1, 1912));
  }

  /* Validating normal functionality */
  @DisplayName("Normal Functionality - 28.2.1913")
 // @Tag("Valid Input")
  @Test
  public void test3()
  {
    assertEquals("1/3/1913", App.NextDate(28, 2, 1913));
  }

  /* Validating normal functionality */
  @DisplayName("Normal Functionality - 31.12.1912")
 // @Tag("Valid Input")
  @Test
  public void test4()
  {
    assertEquals("1/1/1913", App.NextDate(31, 12, 1912));
  }

  /* Validating Out of Bound functionality */
  @DisplayName("Out of Bounds - 1.1.1711")
 // @Tag("Valid Input")
  @Test
  public void test5()
  {
    assertEquals("--/--/----", App.NextDate(1, 1, 1711));
  }

  /* Out of Bounds Tests */
  @DisplayName("Out of Bounds - 31.12.2212")
 // @Tag("Invalid Input")
  @Test
  public void test6() {
      assertEquals("--/--/----", App.NextDate(1, 1, 2213));
  }

  @DisplayName("Out of Bounds - 0.1.1912")
 // @Tag("Invalid Input")
  @Test
  public void test7() {
      assertEquals("--/--/----", App.NextDate(0, 1, 1912));
  }

  @DisplayName("Out of Bounds - 32.1.1912")
 // @Tag("Invalid Input")
  @Test
  public void test8() {
      assertEquals("--/--/----", App.NextDate(32, 1, 1912));
  }

  @DisplayName("Out of Bounds - 1.0.1912")
  @Tag("Invalid Input")
  @Test
  public void test9() {
      assertEquals("--/--/----", App.NextDate(1, 0, 1912));
  }

  @DisplayName("Out of Bounds - 1.13.1912")
  @Tag("Invalid Input")
  @Test
  public void test10() {
      assertEquals("--/--/----", App.NextDate(1, 13, 1912));
  }

  /* Day 31 Out of Bounds for Certain Months */
  @DisplayName("Day Out of Bounds - 30.2.1912")
  @Tag("Invalid Input")
  @Test
  public void test11() {
      assertEquals("--/--/----", App.NextDate(30, 2, 1912));
  }

  @DisplayName("Day Out of Bounds - 31.4.1912")
  @Tag("Invalid Input")
  @Test
  public void test12() {
      assertEquals("--/--/----", App.NextDate(31, 4, 1912));
  }

  @DisplayName("Day Out of Bounds - 31.6.1912")
  @Tag("Invalid Input")
  @Test
  public void test13() {
      assertEquals("--/--/----", App.NextDate(31, 6, 1912));
  }

  @DisplayName("Day Out of Bounds - 31.9.1912")
  @Tag("Invalid Input")
  @Test
  public void test15() {
      assertEquals("--/--/----", App.NextDate(31, 9, 1912));
  }

  @DisplayName("Day Out of Bounds - 31.11.1912")
  @Tag("Invalid Input")
  @Test
  public void test16() {
      assertEquals("--/--/----", App.NextDate(31, 11, 1912));
  }

  /* Leap Year and Leap Century Validation */
  @DisplayName("Leap Year Check - 28.2.2024")
  @Tag("Valid Input")
  @Test
  public void test17() {
      assertEquals("29/2/2024", App.NextDate(28, 2, 2024));
  }

  @DisplayName("Leap Year Day 29 Check - 29.2.1912")
  @Tag("Valid Input")
  @Test
  public void test18() {
      assertEquals("1/3/1912", App.NextDate(29, 2, 1912));
  }

  @DisplayName("Non-Leap Century - 28.2.1900")
  @Tag("Valid Input")
  @Test
  public void test19() {
      assertEquals("1/3/1900", App.NextDate(28, 2, 1900));
  }

  @DisplayName("Leap Century - 28.2.2000")
  @Tag("Valid Input")
  @Test
  public void test20() {
      assertEquals("29/2/2000", App.NextDate(28, 2, 2000));
  }
}
