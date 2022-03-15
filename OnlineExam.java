package com.intershala.javaapp;

import java.util.Scanner;

public class OnlineExam {
    String Name;
    int Roll_Number;
    String Course;
    String Subject;
    int choice;
    int score;
// pattern
    public void pattern() {
        int rows = 8;
        int coloums = 8;
        for (int i = 1; i <= rows; i++) {
            for (int j = coloums; j >= i; j--) {
                System.out.print(" ");
            }

            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


//welcome to my app
    public void welcome(){
        System.out.print("Online Exam Portal\n");
        System.out.println("\nEnter your Full Name:  ");
        Scanner sc = new Scanner(System.in);
        Name = sc.nextLine();

        System.out.println("Enter your Roll Number:  ");
        Roll_Number = sc.nextInt();

        System.out.println("Enter Course:  ");
        Course = sc.next();

        System.out.println("Enter Subject:  ");
        Subject = sc.next();
    }

// Main Menu of Exam.
    public void menu() {
        for(int i=1; i<=4; i++){
            for(int j=4; j>=i; j--){
                System.out.print(" ");
            }

            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println("  Menu \n");
        System.out.println("Select the option from the list to perform.");
        System.out.println("press 1. To Start the exam.");
        System.out.println("press 2. To Check Result.");
        System.out.println("press 3. To check Answer Key.");
        System.out.println("press 4. To watch your All Answers.");
        System.out.println("\nEnter Your Choice: ");
        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();
    }

// start of exam
String your_ans1, your_ans2, your_ans3, your_ans4, your_ans5, your_ans6, your_ans7, your_ans8, your_ans9, your_ans10;

        public void lets_start(){
        if(choice==1){
        System.out.println("\nInstructions for exam:\n 1) Total number of questions are 10.\n 2) All questions are compulsory.\n 3) Each right answer carry 5 marks, and note that each wrong answer reduces 2 marks.\n 4) Total time for exam is 15 min.");
        String A = "A";
        String B = "B";
        String C = "C";
        String D = "D";
        int score = 0;
        Scanner sc = new Scanner(System.in);

        //Question 1
        System.out.println("\n1) How can we describe an array in the best possible way?\n" +
                "A. The Array shows a hierarchical structure.\n" +
                "B. Arrays are immutable.\n" +
                "C. Container that stores the elements of similar types\n" +
                "D. The Array is not a data structure");
        your_ans1 = sc.next();
        if (your_ans1.equals(C)) {
            score = score + 5;
        } else {
            score = score - 2;
        }
        //Question 2
        System.out.println("\n2) Which of the following is the correct way of declaring an array?\n" +
                "A. int javatpoint[10];\n" +
                "B. int javatpoint;\n" +
                "C. javatpoint{20};\n" +
                "D. array javatpoint[10];");
        your_ans2 = sc.next();
        if (your_ans2.equals(A)) {
            score = score + 5;
        } else {
            score = score - 2;
        }
        //Question 3
        System.out.println("\n3) How can we initialize an array in C language?\n" +
                "A. int arr[2]=(10, 20)\n" +
                "B. int arr(2)={10, 20}\n" +
                "C. int arr[2] = {10, 20}\n" +
                "D. int arr(2) = (10, 20)");
        your_ans3 = sc.next();
        if (your_ans3.equals(C)) {
            score = score + 5;
        } else {
            score = score - 2;
        }
        //Question 4
        System.out.println("\n4) Which of the following is the advantage of the array data structure?\n" +
                "A. Elements of mixed data types can be stored.\n" +
                "B. Easier to access the elements in an array\n" +
                "C. Index of the first element starts from 1.\n" +
                "D. Elements of an array cannot be sorted");
        your_ans4 = sc.next();
        if (your_ans4.equals(B)) {
            score = score + 5;
        } else {
            score = score - 2;
        }
        //Question 5
        System.out.println("\n5) Which of the following highly uses the concept of an array?\n" +
                "A. Binary Search tree\n" +
                "B. Caching\n" +
                "C. Spatial locality\n" +
                "D. Scheduling of Processes ");
        your_ans5 = sc.next();
        if (your_ans5.equals(C)) {
            score = score + 5;
        } else {
            score = score - 2;
        }
        //Question 6
        System.out.println("\n6) What is the first step in the software development lifecycle?\n" +
                "A. System Design\n" +
                "B. Coding\n" +
                "C. System Testing\n" +
                "D. Preliminary Investigation and Analysis");
        your_ans6 = sc.next();
        if (your_ans6.equals(D)) {
            score = score + 5;
        } else {
            score = score - 2;
        }
        //Question 7
        System.out.println("\n7) What does the study of an existing system refer to?\n" +
                "A. Details of DFD\n" +
                "B. Feasibility Study\n" +
                "C. System Analysis\n" +
                "D. System Planning");
        your_ans7 = sc.next();
        if (your_ans7.equals(C)) {
            score = score + 5;
        } else {
            score = score - 2;
        }
        //Question 8
        System.out.println("\n8) Which of the following is involved in the system planning and designing phase of the Software Development Life Cycle (SDLC)?\n" +
                "A. Sizing\n" +
                "B. Parallel run\n" +
                "C. Specification freeze\n" +
                "D. All of the above");
        your_ans8 = sc.next();
        if (your_ans8.equals(D)) {
            score = score + 5;
        } else {
            score = score - 2;
        }
        //Question 9
        System.out.println("\n9) What does RAD stand for?\n" +
                "A. Rapid Application Document\n" +
                "B. Rapid Application Development\n" +
                "C. Relative Application Development\n" +
                "D. None of the above");
        your_ans9 = sc.next();
        if (your_ans9.equals(B)) {
            score = score + 5;
        } else {
            score = score - 2;
        }
        //Question 10
        System.out.println("\n10) Which of the following prototypes does not associated with Prototyping Model?\n" +
                "A. Domain Prototype\n" +
                "B. Vertical Prototype\n" +
                "C. Horizontal Prototype\n" +
                "D. Diagonal Prototype");
        your_ans10 = sc.next();
        if (your_ans10.equals(D)) {
            score = score + 5;
        } else {
            score = score - 2;
        }
        System.out.println("successfully submitted exam.");
       }
     }

// Your Result
    public void result(){
        if(choice==2) {
           if(score==0){
               System.out.println("\n Your Score is: " + score);
            System.out.println("You had not completed Exam yet. Please complete it before checking results.");
        }
    }
}

// Your Answer Key
    public void answerkey(){
        if(score==0){
            System.out.println("First complete the Exam and then check answer key..");
        }else {
            System.out.println("\n1) How can we describe an array in the best possible way?\\n\" +\n" +
                    " A. The Array shows a hierarchical structure.\n" +
                    " B. Arrays are immutable.\n" +
                    " C. Container that stores the elements of similar types\n" +
                    " D. The Array is not a data structure\n" +
                    " Right Answer is: C\n");

            System.out.println("\n2) Which of the following is the correct way of declaring an array?\\n\" +\n" +
                    "A. int javatpoint[10];\n" +
                    "B. int javatpoint;\n" +
                    "C. javatpoint{20};\n" +
                    "D. array javatpoint[10];\n" +
                    "Right Answer is: A");

            System.out.println("\n3) How can we initialize an array in C language?\n" +
                    "A. int arr[2]=(10, 20)\n" +
                    "B. int arr(2)={10, 20}\n" +
                    "C. int arr[2] = {10, 20}\n" +
                    "D. int arr(2) = (10, 20)\n+" +
                    "Right Answer is: C");

            System.out.println("\n4) Which of the following is the advantage of the array data structure?\n" +
                    "A. Elements of mixed data types can be stored.\n" +
                    "B. Easier to access the elements in an array\n" +
                    "C. Index of the first element starts from 1.\n" +
                    "D. Elements of an array cannot be sorted\n" +
                    "Right Answer is: B");

            System.out.println("\n5) Which of the following highly uses the concept of an array?\n" +
                    "A. Binary Search tree\n" +
                    "B. Caching\n" +
                    "C. Spatial locality\n" +
                    "D. Scheduling of Processes\n+" +
                    "Right Answer is: D");

            System.out.println("\n6) What is the first step in the software development lifecycle?\n" +
                    "A. System Design\n" +
                    "B. Coding\n" +
                    "C. System Testing\n" +
                    "D. Preliminary Investigation and Analysis\n" +
                    "Right Answer is: D");

            System.out.println("\n7) What does the study of an existing system refer to?\n" +
                    "A. Details of DFD\n" +
                    "B. Feasibility Study\n" +
                    "C. System Analysis\n" +
                    "D. System Planning\n" +
                    "Right Answer is: C");

            System.out.println("\n8) Which of the following is involved in the system planning and designing phase of the Software Development Life Cycle (SDLC)?\n" +
                    "A. Sizing\n" +
                    "B. Parallel run\n" +
                    "C. Specification freeze\n" +
                    "D. All of the above\n" +
                    "Right Answer is: D");

            System.out.println("\n9) What does RAD stand for?\n" +
                    "A. Rapid Application Document\n" +
                    "B. Rapid Application Development\n" +
                    "C. Relative Application Development\n" +
                    "D. None of the above\n+" +
                    "Right Answer is: B");

            System.out.println("\n10) Which of the following prototypes does not associated with Prototyping Model?\n" +
                    "A. Domain Prototype\n" +
                    "B. Vertical Prototype\n" +
                    "C. Horizontal Prototype\n" +
                    "D. Diagonal Prototype\n" +
                    "Right Answer is: D\n");
        }
    }

// Your Answers
    public void myanswers(){
        System.out.println("1) " + your_ans1+ "\n2) "+ your_ans2 +
                "\n3) "+ your_ans3+ "\n4) "+ your_ans4 +
                "\n5) " + your_ans5 + "\n6) "+ your_ans6 +
                "\n7) " + your_ans7 + "\n8) "+ your_ans8 + "\n9) " + your_ans9 +
                "\n10) " + your_ans10 );
    }

// Main
    public static void main(String[] args) {
        OnlineExam on = new OnlineExam();
        on.pattern();
        on.welcome();
        on.lets_start();
        on.menu();
        on.result();
        on.answerkey();
        on.myanswers();

    }
}
