import java.io.File;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

class InvalidEmailException extends RuntimeException {
	public InvalidEmailException() {
		super("invalid format of email");
	}

}

class Google {

	boolean login(String email, String password) {
		if (!email.contains("@")) {
			throw new InvalidEmailException(); // manually exception throw 
		}
		return true;
	}

}

public class ExceptiondEmo {

	public static void main(String[] args) throws IOException {

		Google g = new Google();
		try {
			g.login("sd", "sd");
		} catch (InvalidEmailException e) {
			System.out.println("proper...");
		}
		File f = new File("ss");
		f.createNewFile();
//		

		System.out.println("Enter two numbers");
		try (Scanner scr = new Scanner(System.in);) {
			int a = scr.nextInt();
			int b = scr.nextInt();
			int c = a / b;// Arith ===>
			System.out.println(c);
		} catch (ArithmeticException e) {
			System.out.println("Please do not enter zero in second argument....");
		} catch (InputMismatchException e) {
			System.out.println("Please enter only whole numnbers");
		} catch (Exception e) {
			System.out.println("try aftersometime...");
			// sendMailtoDevleoper(e);
		} finally {
			System.out.println("i am always execute...");
		}
	}
}

//error -->
// compile time --> java compiler
// run time -->  after the execution of program --- run --> exception
/*
 * 
 * 
 * try hit throw catch
 * 
 *
 * 
 * 
 * Throwable Exception Error RuntimeException IOException Arith Input
 * 
 * 1) checked exception - strict 2) unchecked exception - no
 *
 */
