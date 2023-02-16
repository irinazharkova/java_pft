package stqa.pft.sandbox;

public class MyFirstProgram {
  public static void main(String[] args) {
    Point p1 = new Point(5, -1);
    Point p2 = new Point(1, 4);
    System.out.println("Расстояние между точками (" + p1.x + ";" + p1.y + ") и (" + p2.x + ";" + p2.y + ") равно "
            + p1.distance(p2));
  }
}

