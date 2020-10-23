package myPractice;
interface Drawable {
   void draw();
}
abstract class Shape1 implements Drawable {
   public abstract double getArea();
   public abstract double getLength();
   
}
class Rectangle extends Shape1 {
   double x1 = 0;
   double y1 = 0;
   double x2 = 0;
   double y2 = 0;
   double width = 0;
   double height = 0;
   double area = 0;
   double length = 0;
   
   public Rectangle(int a, int b, int c, int d) {
      x1 = a;
      y1 = b;
      x2 = a+c;
      y2 = b+d;
      width = x2-x1;
      height = y2 - y1;
   }
   @Override
   public void draw() {
      System.out.println("Rectangle ("+ x1 + ", " + y1 + ")-(" + x2 + ", " + y2 + ")");   
   }
   @Override
   public double getArea() {
      area = width * height;
      return area; 
   }
   @Override
   public double getLength() {
      length = (width + height)*2;
      return length;
      // TODO Auto-generated method stub
      
   }
}
class Circle1 extends Shape1 {
   double radius = 0;
   double x = 0;
   double y = 0;
   double PI = 3.14;
   double length = 0;
   double area = 0;
   
   public Circle1(int a, int b, int c) {
      x = a;
      y = b;
      radius = c;
   }

   @Override
   public void draw() {
      System.out.println("Circle center(" + x + ", " + y + ")- radius(" + radius + ")");
      
      // TODO Auto-generated method stub
      
   }

   @Override
   public double getArea() {
      area = PI*radius*radius;
      return area;
      // TODO Auto-generated method stub
      
   }

   @Override
   public double getLength() {
      length = 2*PI*radius;
      return length;
      // TODO Auto-generated method stub
      
   }
   
}
public class test8 {
   public static void main(String[] args) {
      Shape1[] shapes = new Shape1[3];
      shapes[0] = new Rectangle(10, 20, 30, 40);
      shapes[1] = new Rectangle(30, 30, 10, 10);
      shapes[2] = new Circle1(50,20,30);
      
      for(Shape1 s: shapes) {
         System.out.printf("Area: %.1f\n", s.getArea());
         System.out.printf("Length: %.1f\n", s.getLength());
      }
         
  Drawable[] drawables = new Drawable[3];
      for(int i = 0; i<shapes.length; i++) {
         drawables[i] = (Drawable)shapes[i];
      }      
      for(Drawable d: drawables) {
         d.draw();
      }
   }
}