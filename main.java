import java.util.Scanner;
public class main
{
       public static void main(String args[])
    {   
      
    

          Scanner in = new Scanner(System.in);
            double num,out,degrees,radian,a,b,n,s,add , sub1 , sub2 , multi , div1 , div2;
            int ch;
            System.out.println("The options are as follows choose one ");
            System.out.println("1.Addition       (A+B)");
            System.out.println("2.Substraction   (A-B)");
            System.out.println("3.Substraction   (B-A)");
            System.out.println("4.Multiplication (A*B)");
            System.out.println("5.Division       (A/B)");
            System.out.println("6.Division       (B/A)");
            System.out.println("7.square");
            System.out.println("8.square root");
            System.out.println("9.cube");
            System.out.println("10.cube root");
            System.out.println("11.power");
            System.out.println("12.Sin");  
            System.out.println("13.Cos");
            System.out.println("14.Tan");
            System.out.println("15.Cot");
            System.out.println("16.Cosec");
            System.out.println("17.Sec");
            System.out.println("18.Log");
            ch = in.nextInt();
            switch(ch)
            {
            case 1:
            System.out.println("Enter a and b");
            a = in.nextDouble();
            b = in.nextDouble();
            add = a+b;
            System.out.println("The addition of the two numbers "+a +" +  "+ b +" is "+add );
            break;
            //Addition
            case 2 :
            System.out.println("Enter a and b");
            a = in.nextDouble();
            b = in.nextDouble();
            sub1 = a-b;
            System.out.println("The subtraction of the two numbers "+a +" - "+ b +" is "+sub1);
            break;
            //Subtraction - 1(A-B)
            case 3 :
            System.out.println("Enter a and b");
            a = in.nextDouble();
            b = in.nextDouble();
            sub2 = b-a;
            System.out.println("The subtraction of the two numbers "+b +" - "+a+" is "+sub2);
            break;
             
            //Subtraction - 2(B-A)
            case 4 :
            System.out.println("Enter a and b");
            a = in.nextDouble();
            b = in.nextDouble();
            multi = a*b;
            System.out.println("The multiplication of the two numbers "+a+"  X "+b+" is "+multi);
            break;
            //Multiplication 
            case 5 :
            System.out.println("Enter a and b");
            a = in.nextDouble();
            b = in.nextDouble();
            div1 = a/b;
           System.out.println("The Division of the two numbers "+a+" / "+b+" is "+div1);
            break;
             //Division-2(A/B)
            case 6 :
            System.out.println("Enter a and b");
            a = in.nextDouble();
            b = in.nextDouble();
            div2 = b/a;
            System.out.println("The Division of the two numbers "+b+" / "+a+" is "+div2);
            break; 
           
            case 7 : //Math.pow(a,2) {Square}
            System.out.println("Enter number");
            a = in.nextDouble();
            n = Math.pow(a,2);
            System.out.println("The square of " + a + "is " + n);
            break;
             
            case 8 : //Math.sqrt(a,2) {Square root}
            System.out.println("Enter number");
            a = in.nextDouble();
            n = Math.sqrt(a);
            System.out.println("The square root of "+a+" is "+n);
            break;

            case 9 : //Math.pow(a,3){Cube}
            System.out.println("Enter number");
            a = in.nextDouble();
            n = Math.pow(a,3);
            System.out.println("The cube of " + a + "is " + n);
            break;

            case 10 : // Math.cbrt(a) {Cube Root}
            System.out.println("Enter number");
            a = in.nextDouble();
            n = Math.cbrt(a);
            System.out.println("The cube of "+ a + "is "+ n);
            break;

            case 11 : //n = Math.pow(a,b) {power}
            System.out.println("Enter number");
            a = in.nextDouble();
            System.out.println("Enter exponent");
            b = in.nextDouble();
            n = Math.pow(a,b);
            System.out.println(a+" to the power "+b+" is "+n);
            break;

             // if user chooses sin then  12 will be executed 
            case 12:
            System.out.println("Enter Degree");
            degrees = in.nextDouble();
            radian = Math.toRadians(degrees);
            s = Math.sin(radian);
            System.out.println("sin(" + degrees + ") = " + s);
            break;
        
           // if user chooses Cos then case 13 will be executed  
            case 13:
            System.out.println("Enter Degree");
            degrees = in.nextDouble();
            radian = Math.toRadians(degrees);
            s = Math.cos(radian);
            System.out.println("cos(" + degrees + ") = " + s);
            break;
            
           // if user chooses Tan, then case 14 will be executed
            case 14:
            System.out.println("Enter Degree");
            degrees = in.nextDouble();
            radian = Math.toRadians(degrees);
            s = Math.tan(radian);
            System.out.println("tan(" + degrees + ") = " + s);
            break;
            
             // if user chooses cot, then case 15 will be executed
            case 15:
            System.out.println("Enter Degree");
            degrees = in.nextDouble();
            radian = Math.toRadians(degrees);
            s = 1/(Math.tan(radian));
            System.out.println("cot(" + degrees + ") = " + s);
            break;

             // if user chooses Cosec , then case 16 will be executed
            case 16:
            System.out.println("Enter Degree");
            degrees = in.nextDouble();
            radian = Math.toRadians(degrees);
            s = 1/(Math.sin(radian));
            System.out.println("cosec(" + degrees + ") = " + s);
            break;
             
             // if user chooses Sec , then case 17 will be executed
            case 17:
            System.out.println("Enter Degree");
            degrees = in.nextDouble();
            radian = Math.toRadians(degrees);
            s = 1/(Math.cos(radian));
            System.out.println("sec(" + degrees + ") = " + s);
            break;
            // if user chooses log , then case 18 will be executed
            // logarithm 
            case 18:
            System.out.println("Enter Number");
            num = in.nextDouble();
            out = Math.log10(num);
            System.out.println("Natural log of "+num+" is "+out);
            break;
            
            default:
            System.out.println ("Invalid choice entered");
            }
         System.out.println("****************");
        }
     
}