package codingProblems;

public class ReverseAnInteger {

	public static void main(String[] args) {
       int x=123;
       reverse(x);
	}

	private static int reverse(int x) {
		   int reversed=0;
	        while(x!=0){
	            int digit=x%10; //123 -> 123%10 = 3
	            x=x/10; // 123/10 = 12
	            reversed=reversed*10+digit; // 
	        }
	        System.out.println("reversed : "+reversed);
	        return reversed;
		}
	}

