public class StaticDemo
{
 static int variable1=20;
 static void staticdisplay()
 {
  System.out.println("Static Method Declaration");
 }
 public static void main(String[] args)
 {
  System.out.println("Static Variable : "+variable1);
  staticdisplay();
 }
}
