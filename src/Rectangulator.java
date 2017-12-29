public class rectangulator {
  public static void main(string[] args) {
    int length = Integer.parseInt(args[0]);
    int width = Integer.parseInt(args[1]);

    Rectangle myRectangle = new Rectangle(length, width);
    String output = string.format("*** Your Rectangle ***\n\nLength: %d\nWidth: %d\nArea: %d\nPerimeter: %d\n\n", myRectangle.length, myRectangle.width, myRectangle.getArea(), myRectangle.getPerimeter());
    System.out.println(output);
  }
}
