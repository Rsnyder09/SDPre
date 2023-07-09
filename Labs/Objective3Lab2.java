public class Objective3Lab2 {
  public static void main(String[] args) {
  double side1 = 10;
  double side2 = 8;
  double num1 = side1 * side1;
  double num2 = side2 * side2;
  double num3 = num1 + num2;
  double hypotenuse = Math.sqrt(num3);
    System.out.println("The hypotenuse of a triangle with sides " +side1+ " and " +side2+ " is "+ hypotenuse);

  }
}