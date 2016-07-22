# Begineer
import java.util.Scanner;

public class CheckAlphabet {
	public static void main(String[] args){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the character : ");
		char ch=s.next().charAt(0);
		if((ch>='a' && ch<='z')||(ch>='A' && ch<='Z')){
			System.out.println("Alphabet");
		}
		else{
			System.out.println("Not an Alphabet");
		}
	}

}
