public class Main {
  public static void main(String[] args) {
    //Exemple de commentaire...
    System.out.println("Hello Jocelyn can you Call me back ?");    //Utilisation du println sur les chaines de caractère
    System.out.println(2*3);   //Utilisation du println sur les nombres

    /* The code below will print the words Hello World
to the screen, and it is amazing */

    String color ="blue";
    System.out.println(color);

    int tel = 7658;
    System.out.println(tel);

    int num;
    // System.out.println(num);

    num = 56;
    System.out.println(num);

    int myNum = 5;    //Integer (whole number)
    System.out.println(myNum);

    float myFloatNum = 5.99f;     //Floating point number
    System.out.println(myFloatNum);

    char myLetter = 'D';   //Character
    System.out.println(myLetter);
    
    boolean myBool = true;  //Boolean
    System.out.println(myBool);

    String myText = "She likes ";   //String
    System.out.println(myText);

    
    System.out.println(myText + color);
    System.out.println(myNum + tel);


// Student data
    String studentName = "John Doe";
    int studentID = 15;
    int studentAge = 23;
    float studentFee = 75.25f;
    char studentGrade = 'B';

// Print variables
System.out.println("Student name: " + studentName);
System.out.println("Student id: " + studentID);
System.out.println("Student age: " + studentAge);
System.out.println("Student fee: " + studentFee);
System.out.println("Student grade: " + studentGrade);

// Create integer variables
int length = 4, width = 6;
int area;

// Calculate the area of a rectangle
area = length * width;

// Print variables
System.out.println("Length is: " + length);
System.out.println("Width is: " + width);
System.out.println("Area of the rectangle is: " + area);
  }
}