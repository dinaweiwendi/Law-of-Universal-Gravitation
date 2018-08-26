import java.math.*;

public class TestPlanet{
  public static void main(String[] args){
    checkPlanet();
  }
  private static void checkEquals(double actual, double expected, String label, double eps) {
      if (Math.abs(expected - actual) <= eps * Math.max(expected, actual)) {
          System.out.println("PASS: " + label + ": Expected " + expected + " and you gave " + actual);
      } else {
          System.out.println("FAIL: " + label + ": Expected " + expected + " and you gave " + actual);
      }
  }
  public static void checkPlanet(){
    Planet p1=new Planet(1.0, 1.0, 3.0, 4.0, 5.0, "jupiter.gif");
    Planet p2=new Planet(4.0, 5.0, 3.0, 4.0, 5.0, "jupiter.gif");

    checkEquals(p1.calcForceExertedBy(p2), 6.67e-11,"calcForceExertedBy()",0.01);

  }
}
