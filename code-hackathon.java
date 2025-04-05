INPUT:
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

                System.out.println(" Welcome to AI-Driven Inclusive Assessment Tool ");
        System.out.print(" Enter Candidate Name: ");
        String name = scanner.nextLine();
        
        System.out.print(" Are you a PWD candidate? (yes/no): ");
        String pwdStatus = scanner.nextLine();

        System.out.println("\nSelect Assessment Mode:");
        System.out.println("1. Online");
        System.out.println("2. Offline");
        System.out.println("3. Blended");
        System.out.print(" Choose option (1/2/3): ");
        int mode = scanner.nextInt();
        scanner.nextLine();  
        System.out.println("\nSelect Assessment Type:");
        System.out.println("1. Multiple Choice Questions (MCQs)");
        System.out.println("2. Descriptive Exam");
        System.out.println("3. Practical Exam");
        System.out.println("4. Viva Voce");
        System.out.print(" Choose option (1/2/3/4): ");
        int assessmentType = scanner.nextInt();
        scanner.nextLine();  

                String result = conductAssessment(assessmentType, scanner);
        System.out.println("\n AI Evaluation Result: " + result);

                String feedback = generateFeedback(assessmentType);
        System.out.println("\n Personalized Feedback: " + feedback);

        scanner.close();
        System.out.println("\n Thank you for using AI Inclusive Assessment Tool! ");
    }

        public static String conductAssessment(int type, Scanner scanner) {
        switch (type) {
            case 1: return mcqAssessment(scanner);
            case 2: return descriptiveAssessment(scanner);
            case 3: return practicalAssessment(scanner);
            case 4: return vivaAssessment(scanner);
            default: return "Invalid choice. Please restart.";
        }
    }

        public static String mcqAssessment(Scanner scanner) {
        System.out.println("\n MCQ Assessment:");
        System.out.println("Q1: What is the capital of India?");
        System.out.println("a) Mumbai  b) Delhi  c) Bangalore  d) Kolkata");
        System.out.print(" Your Answer (a/b/c/d): ");
        String answer = scanner.nextLine();
        return answer.equalsIgnoreCase("b") ? "Passed (Correct Answer!)" : "Failed (Correct: Delhi)";
    }

        public static String descriptiveAssessment(Scanner scanner) {
        System.out.println("\n Descriptive Exam:");
        System.out.print(" Describe the impact of AI on education (Short Answer): ");
        String response = scanner.nextLine();
        return "AI Processing... Evaluation Completed ✅";
    }

    // Practical Exam (Skill-Based)
    public static String practicalAssessment(Scanner scanner) {
        System.out.println("\n Practical Exam:");
        System.out.print(" Perform a sample coding task (Type 'Done' when completed): ");
        String response = scanner.nextLine();
        return response.equalsIgnoreCase("done") ? "Submitted for Evaluation" : "Incomplete";
    }

        public static String vivaAssessment(Scanner scanner) {
        System.out.println("\n Viva Voce Exam:");
        System.out.print(" What are your strengths in this skill domain? (Short Answer): ");
        String response = scanner.nextLine();
        return "AI Analyzing Voice Input... Feedback Generated ✅";
    }

        public static String generateFeedback(int type) {
        switch (type) {
            case 1: return "Improve general knowledge. Consider daily quizzes.";
            case 2: return "Work on structured answers and critical thinking.";
            case 3: return "Enhance hands-on experience with practical applications.";
            case 4: return "Improve verbal confidence and domain expertise.";
            default: return "Keep learning and improving!";
        }
    }
}

OUTPUT:
Welcome to AI-Driven Inclusive Assessment Tool 
 Enter Candidate Name: ramu
 Are you a PWD candidate? (yes/no): no

Select Assessment Mode:
1. Online
2. Offline
3. Blended
 Choose option (1/2/3): 1

Select Assessment Type:
1. Multiple Choice Questions (MCQs)
2. Descriptive Exam
3. Practical Exam
4. Viva Voce
 Choose option (1/2/3/4): 1

 MCQ Assessment:
Q1: What is the capital of India?
a) Mumbai  b) Delhi  c) Bangalore  d) Kolkata
 Your Answer (a/b/c/d): b

 AI Evaluation Result: Passed (Correct Answer!)

 Personalized Feedback: Improve general knowledge. Consider daily quizzes.

 Thank you for using AI Inclusive Assessment Tool! 

=== Code Execution Successful ===
