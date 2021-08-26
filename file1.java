public class SwapNumbers {

    public static void main(String[] args) {

        float first = 1.20f, second = 2.45f;

        System.out.println("--Before swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        // Value of first is assigned to temporary
        float temporary = first;

        // Value of second is assigned to first
        first = second;

        // Value of temporary (which contains the initial value of first) is assigned to second
        second = temporary;

        System.out.println("--After swap--");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }

	//feature 301 changes by mahesh
	public static void sampleMethod(int a, int b) throws ArithmeticException{
        System.out.println("Hello, this is sample method");
        int c = a/b; //  int c = 4/2 which gets calculated as 2 
        System.out.println("c:"+c); // c: 2
   } 

	//feature 300 changes by kushal
	public static void main (String[] args){
    DemoClass.sampleMethod(4,2);     
 }
//webhook changes
public static void main(string[]args){
System.out.println("Webhook Event Configuration changes")
//new webhook changes
public void method URI(){
    System.out.println("New WEbhook changes");
}
}





}
