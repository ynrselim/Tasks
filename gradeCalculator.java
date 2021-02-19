import java.util.*;

public class fileAlýþtýrma {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		System.out.println("What is your 1st midterm exam grade?");
		int Grade1 = console.nextInt();
		if(Grade1>100 || Grade1<0) {
			System.out.println("Unexpected Number");
			System.out.println("What is your 1st midterm exam grade? "
					+ "Please type a number between 0-100");
			Grade1 = console.nextInt();
		}
		System.out.println("What is your 2nd midterm exam grade?");
		int Grade2 = console.nextInt();
		if(Grade2>100 || Grade2<0) {
			System.out.println("Unexpected Number");
			System.out.println("What is your 2nd midterm exam grade?"
			+ "Please type a number between 0-100");
			Grade2 = console.nextInt();
		}
		System.out.println("What is your final exam grade?");
		int Grade3 = console.nextInt();
		if(Grade3>100 || Grade3<0) {
			System.out.println("Unexpected Number");
			System.out.println("What is your 3rd midterm exam grade?"
			+ "Please type a number between 0-100");
			Grade3 = console.nextInt();
		}
		System.out.println("First Midterm Grade : " + Grade1);
		System.out.println("Second Midterm Grade: " + Grade2);
		System.out.println("Final Grade         : " + Grade3);
		System.out.println("-------------------------");
		System.out.println("Average             : " + (Grade1+Grade2+Grade3)/3);
		System.out.println("Letter Grade        : " + GradeCalc(Grade1,Grade2,Grade3));
		
		}
		public static String GradeCalc(int Grade1,int Grade2,int Grade3) {
			String b = " ";
			double a = (Grade1+Grade2+Grade3)/3;
			if (a>=90) {
				b= "A";
			}
			else if (a<90 && a>=80  ) {
				b= "B";
			}
			else if (a<80 && a>=70) {
				b= "C";
			}
			else if (a<70 && a>=60) {
				b= "D";
			}
			else if (a<60) {
				b= "F";
			}
			return b;
		}

}
