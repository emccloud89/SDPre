public class SwitchExample {
	public static void main(String[] args) {
		char grade;
		grade = 'd';

		switch (grade) {
		case 'A':
		case 'a':
			System.out.println("Fantastic job!");
			break;
		case 'B':
		case 'b':
			System.out.println("Good job!");
			break;
		case 'C':
		case 'c':
			System.out.println("You're doing okay.");
			break;
		case 'D':
		case 'd':
			System.out.println("Please schedule a conference.");
			break;
		case 'F':
		case 'f':
			System.out.println("Start finishing homework an showing up to class.");
			break;
		default:
			System.out.println("Invalid grade.");

		}
	}
}