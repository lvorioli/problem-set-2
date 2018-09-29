import java.util.Scanner;
/**
 * INSTRUCTIONS.
 * 
 * Problem Set 2 will test your knowledge and understanding of arithmetic
 * operators and String concatenation. You'll be asked use the Scanner to
 * read user input from the keyboard, and use this input later to compute
 * and print certain required values to the console. All of this is explained
 * (and demonstrated, when appropriate) in the README file.
 */
public class ProblemSet2 {
	/**
	 * You need not modify the main method.
	 */
	static Scanner inputs = new Scanner(System.in);
	
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		
		ps2.sayHello();
		System.out.println("\n\n");
		ps2.gradeMe();
		System.out.println("\n\n");
		ps2.groupUs();
		System.out.println("\n");
		inputs.nextLine();
		ps2.info();
		System.out.println("\n");
		ps2.initials();
		inputs.close();
	}
	
	public void sayHello() {
		System.out.print("Please enter your first name: ");
		String firstName = inputs.nextLine();
		System.out.print("Please enter your last name: ");
		String lastName = inputs.nextLine();
		System.out.print("Hello, " + firstName + " " + lastName + "!");
	}
	
	public void gradeMe() {
		float[] homeworkScores = new float[3];
		float[] quizScores = new float[3];
		float[] testScores = new float[3];
		for(int i = 1; i <= 3; i++) {
			System.out.print("Homework Score " + i + ": ");
			homeworkScores[i-1] = inputs.nextFloat();
		}
		for(int i = 1; i <= 3; i++) {
			System.out.print("Quiz Score " + i + ": ");
			quizScores[i-1] = inputs.nextFloat();
		}
		for(int i = 1; i <= 3; i++) {
			System.out.print("Test Score " + i + ": ");
			testScores[i-1] = inputs.nextFloat();
		}
		float avgHomework = (homeworkScores[0] + homeworkScores[1] + homeworkScores[2]) / 3;
		float avgQuiz = (quizScores[0] + quizScores[1] + quizScores[2]) / 3;
		float avgTest = (testScores[0] + testScores[1] + testScores[2]) / 3;
		float finalGrade = (avgHomework * 0.15f) + (avgQuiz * 0.30f) + (avgTest * 0.55f);
		
		System.out.printf("\nFinal Grade: %.2f", finalGrade);
		System.out.print("%");
		
		
	}
	
	public void groupUs() {
		System.out.print("Number of teachers attending the field trip: ");
		int teachers = inputs.nextInt();
		System.out.print("Number of students attending the field trip: ");
		int students = inputs.nextInt();
		int passengers = teachers + students;
		int busses = passengers / 47;
		int extraPassengers = passengers % 47;
		if (extraPassengers != 0) {
			busses += 1;
		}
		System.out.println("\nBusses Required: " + busses);
		for(int i = 1; i <= busses; i++) {
			if(extraPassengers != 0 && i == busses) {
				System.out.println("Bus " + i + ": " + extraPassengers + " passengers");
			}
			else {
			System.out.println("Bus " + i + ": 47 passengers");
			}
		}	
	}
	
	public void info() {
		System.out.print("First Name: ");
		String firstName = inputs.nextLine();
		System.out.print("Last Name: ");
		String lastName = inputs.nextLine();
		System.out.print("Grade: ");
		String grade = inputs.nextLine();
		System.out.print("Age: ");
		String age = inputs.nextLine();
		System.out.print("Hometown: ");
		String hometown = inputs.nextLine();
		System.out.println("\nNAME     : " + firstName + " " + lastName);
		System.out.println("GRADE    : " + grade);
		System.out.println("AGE      : " + age);
		System.out.println("HOMETOWN : " + hometown);
	}
	
	public void initials() {
		System.out.print("Please enter your first name: ");
		String firstName = inputs.nextLine();
		System.out.print("Please enter your middle name: ");
		String middleName = inputs.nextLine();
		System.out.print("Please enter your last name: ");
		String lastName = inputs.nextLine();
		System.out.print("\nYour initials are " + firstName.charAt(0) + middleName.charAt(0) + lastName.charAt(0) + ".");
	}
}