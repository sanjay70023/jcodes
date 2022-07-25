import java.lang.Exception;
import java.util.Scanner;

class UnderAge extends Exception
{
    private int age;
    
    public UnderAge(int age)
    {
        this.age = age;
    }
    
    public String getMessage()
    {
        return "UnderAge: " + age + " is less than 18";
    }
}

class exceptionDemo
{
    static void test(int age) throws UnderAge{
        if(age<18)
            throw new UnderAge(age);
    }
}


public class Main extends exceptionDemo
{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the age: ");
	    int age = sc.nextInt();
	    
	    try
	    {
	        test(age);
	    } catch (UnderAge e){
	        System.out.println("Test unsuccessfull !");
	        System.out.println(e.getMessage());
	    }
	    finally{
	        sc.close();
	    }
	    
	}
}
