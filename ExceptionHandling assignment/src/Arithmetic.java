public class Arithmetic {
    public void display(int first,int second){
        try{
            int res = first / second;
            System.out.println(res);
        }catch(ArithmeticException e){
            System.out.println("Division by zero is underfined");
        }
    }
    public static void main(String[]args){
        Arithmetic ae=new Arithmetic();
        ae.display(25, 0);
        System.out.println("This is the program that relates to arithmetic exception");
    }
}

