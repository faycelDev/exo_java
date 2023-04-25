package Cercle;

public class Point {

       private int x;
       private int y;

       public Point(int x, int y)
       {
           this.x = x;
           this.y = y;
       }

       public int getX() {
           return this.x;
       }
       public int getY() {
           return this.y;
       }

       public void setx(int x) {
           this.x = x;
       }
       public void setY(int y) {
           this.y = y;
       }

       public void show() {
           System.out.println("le x est : " + this.x  );
           System.out.println("le y est :" + this.y );
       }

}
