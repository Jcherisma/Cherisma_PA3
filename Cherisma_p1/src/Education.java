import java.security.SecureRandom;
import java.util.Scanner;

public class Education {
    public static double correctAns, userAns, count,session1=0,b=10,options;
    public static final double EPSILON = 00.00001;

    public static void goodComments() {
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(3);
        int comment = x;
        String goodString;

        // switch statement with int data type
        switch (comment) {
            case 0:
                goodString = "Very Good!";
                break;
            case 1:
                goodString = "Excellent!";
                break;
            case 2:
                goodString = "Nice work!";
                break;
            case 3:
                goodString = "Keep up the good work!";
                break;
            default:
                goodString = "Invalid";
                break;
        }
        System.out.println(goodString);
        return;
    }

    public static void badComments() {
        SecureRandom rand = new SecureRandom();
        int x = rand.nextInt(3);
        int comment = x;
        String badString;

        // switch statement with int data type
        switch (comment) {
            case 0:
                badString = "No. Please try again.";
                break;
            case 1:
                badString = "Wrong. try once more.";
                break;
            case 2:
                badString = "Don't give up!";
                break;
            case 3:
                badString = "No. Keep trying,";
                break;
            default:
                badString = "Invalid";
                break;
        }
        System.out.println(badString);
        return;
    }
    public static void comment1(){
        if (userAns == correctAns) {
            goodComments();

            count++;
        } else {
            badComments();

        }
    }
    public static int difficulty(Scanner scnf) {
        int difficulty;
        difficulty = scnf.nextInt();
        System.out.println(difficulty);
        return difficulty;
    }
    public static int options1(Scanner scnf) {
        int opp1;
        opp1 = scnf.nextInt();
        System.out.println(opp1);
        return opp1;
    }

    public static void Multiplication(Scanner scnf, int diff,int opp) {
        double x, y;
                if (diff == 1) {
                    SecureRandom rand = new SecureRandom();
                    x = rand.nextInt(10);
                    y = rand.nextInt(10);
                    System.out.println("What is the answer to " + x + " * " + y);
                    correctAns = x * y;
                    userAns = scnf.nextDouble();
                    comment1();
                } else if (diff == 2) {
                    SecureRandom rand = new SecureRandom();
                    x = rand.nextInt(100) + 10;
                    y = rand.nextInt(100) + 10;
                    System.out.println("What is the answer to " + x + " * " + y);
                    correctAns = x * y;
                    userAns = scnf.nextDouble();
                    comment1();
                } else if (diff == 3) {

                    SecureRandom rand = new SecureRandom();
                    x = rand.nextInt(999) + 100;
                    y = rand.nextInt(999) + 100;
                    System.out.println("What is the answer to " + x + " * " + y);
                    correctAns = x * y;
                    userAns = scnf.nextDouble();
                    comment1();
                } else if (diff == 4) {
                    SecureRandom rand = new SecureRandom();
                    x = rand.nextInt(9999) + 1000;
                    y = rand.nextInt(9999) + 1000;
                    System.out.println("What is the answer to " + x + " * " + y);
                    correctAns = x * y;
                    userAns = scnf.nextDouble();
                    comment1();
                }
            }
    public static void Addition(Scanner scnf, int diff,int opp) {
        double x, y;
                if (diff == 1) {
                    SecureRandom rand = new SecureRandom();
                    x = rand.nextInt(10);
                    y = rand.nextInt(10);
                    System.out.println("What is the answer to " + x + " + " + y);
                    correctAns = x + y;
                    userAns = scnf.nextDouble();
                    comment1();
                } else if (diff == 2) {
                    SecureRandom rand = new SecureRandom();
                    x = rand.nextInt(99) + 10;
                    y = rand.nextInt(99) + 10;
                    System.out.println("What is the answer to " + x + " + " + y);
                    correctAns = x + y;
                    userAns = scnf.nextDouble();
                    comment1();
                } else if (diff == 3) {

                    SecureRandom rand = new SecureRandom();
                    x = rand.nextInt(999) + 100;
                    y = rand.nextInt(999) + 100;
                    System.out.println("What is the answer to " + x + " + " + y);
                    correctAns = x + y;
                    userAns = scnf.nextDouble();
                    comment1();
                } else if (diff == 4) {
                    SecureRandom rand = new SecureRandom();
                    x = rand.nextInt(9999) + 1000;
                    y = rand.nextInt(9999) + 1000;
                    System.out.println("What is the answer to " + x + " + " + y);
                    correctAns = x + y;
                    userAns = scnf.nextDouble();
                    comment1();
                }
            }
    public static void Subtraction(Scanner scnf, int diff,int opp) {
        double x, y,temp;
                if (diff == 1) {
                    SecureRandom rand = new SecureRandom();
                    x = rand.nextInt(10);
                    y = rand.nextInt(10);
                    if (x > y) {
                        temp = x;
                        x = y;
                        y = temp;
                    } else {
                    }
                    System.out.println("What is the answer to " + y + " - " + x);
                    correctAns = y - x;
                    userAns = scnf.nextDouble();
                    comment1();
                } else if (diff == 2) {
                    SecureRandom rand = new SecureRandom();
                    x = rand.nextInt(99) + 10;
                    y = rand.nextInt(99) + 10;
                    if (x > y) {
                        temp = x;
                        x = y;
                        y = temp;
                    } else {
                    }
                    System.out.println("What is the answer to " + y + " - " + x);
                    correctAns = y - x;
                    userAns = scnf.nextDouble();
                    comment1();
                } else if (diff == 3) {
                    SecureRandom rand = new SecureRandom();
                    x = rand.nextInt(999) + 100;
                    y = rand.nextInt(999) + 100;
                    if (x > y) {
                        temp = x;
                        x = y;
                        y = temp;
                    } else {
                    }
                    System.out.println("What is the answer to " + y + " - " + x);
                    correctAns = y - x;
                    userAns = scnf.nextDouble();
                    comment1();
                } else if (diff == 4) {
                    SecureRandom rand = new SecureRandom();
                    x = rand.nextInt(9999) + 1000;
                    y = rand.nextInt(9999) + 1000;
                    if (x > y) {
                        temp = x;
                        x = y;
                        y = temp;
                    } else {
                    }
                    System.out.println("What is the answer to " + y + " - " + x);
                    correctAns = y - x;
                    userAns = scnf.nextDouble();
                    comment1();
                }
        }
    public static void Division(Scanner scnf, int diff,int opp) {
        double x, y,temp;
                if (diff == 1) {
                    SecureRandom rand = new SecureRandom();
                    x = rand.nextInt(9)+1;
                    y = rand.nextInt(9)+1;
                    if (x > y) {
                        temp = x;
                        x = y;
                        y = temp;
                    } else {
                    }
                    System.out.println("What is the answer to " + y + " / " + x);
                    correctAns = y/x;
                    userAns = scnf.nextDouble();
                    if (Math.abs(correctAns-userAns) <= 0.000001) {
                        goodComments();

                        count++;
                    } else {
                        badComments();

                    }
                } else if (diff == 2) {
                    SecureRandom rand = new SecureRandom();
                    x = rand.nextInt(100) + 10;
                    y = rand.nextInt(100) + 10;
                    if (x > y) {
                        temp = x;
                        x = y;
                        y = temp;
                    } else {
                    }
                    System.out.println("What is the answer to " + y + " / " + x);
                    correctAns = y/x;
                    userAns = scnf.nextDouble();
                    if (Math.abs(correctAns-userAns) <= 0.000001) {
                        goodComments();

                        count++;
                    } else {
                        badComments();

                    }
                } else if (diff == 3) {
                    SecureRandom rand = new SecureRandom();
                    x = rand.nextInt(999) + 100;
                    y = rand.nextInt(999) + 100;
                    if (x > y) {
                        temp = x;
                        x = y;
                        y = temp;
                    } else {
                    }
                    System.out.println("What is the answer to " + y + " / " + x);
                    correctAns = y/x;
                    userAns = scnf.nextDouble();
                    if (Math.abs(correctAns-userAns) <= 0.000001) {
                        goodComments();

                        count++;
                    } else {
                        badComments();

                    }
                } else if (diff == 4) {
                    SecureRandom rand = new SecureRandom();
                    x = rand.nextInt(9999) + 1000;
                    y = rand.nextInt(9999) + 1000;
                    if (x > y) {
                        temp = x;
                        x = y;
                        y = temp;
                    } else {
                    }
                    System.out.println("What is the answer to " + y + " / " + x);
                    correctAns = y/x;
                    userAns = scnf.nextDouble();
                    if (Math.abs(correctAns-userAns) <= 0.000001) {
                        goodComments();

                        count++;
                    } else {
                        badComments();

                    }
                }
            }
    public static void option1 (Scanner scnf,int diff,int opp){
        int session2=0;
        while(session2==0) {
            System.out.println("Go ahead and pick a level of difficulty between 1-4, where the number represents digits your mathematical questions will be.");
            diff = difficulty(scnf);

            System.out.println("Can you please the type of problems you would like to work on");
            System.out.println("1 = Addition problems");
            System.out.println("2 = Multiplication problems");
            System.out.println("3 = Subtraction problems");
            System.out.println("4 = Division problems");
            System.out.println("5 = A random mixture.");
            opp = options1(scnf);

            if (opp == 1) {
                for(int i=0;i<10;i++){
                Addition(scnf, diff,opp);}
            } else if (opp == 2) {
                for (int i = 0; i < 10; i++) {
                    Multiplication(scnf, diff, opp);
                }
            } else if (opp == 3) {
                for(int i=0; i<10;i++){
                Subtraction(scnf, diff,opp);}
            } else if (opp == 4) {
                for(int i=0; i<10;i++){
                Division(scnf, diff,opp);}
            } else if (opp == 5) {
                for(int i=0;i<10;i++) {
                    SecureRandom rand = new SecureRandom();
                    int x = rand.nextInt(3);
                    int comment = x;
                    // switch statement with int data type

                    if (comment == 0) {
                        Addition(scnf, diff, opp);
                    } else if (comment == 1) {
                        Subtraction(scnf, diff, opp);
                    } else if (comment == 2) {
                        Multiplication(scnf, diff, opp);
                    } else if (comment == 3) {
                        Division(scnf, diff, opp);
                    }
                }
            } else {
                System.out.println("please try again");
            }

            count = (count / b) * 100;
            System.out.println(count);

            if (count > 75) {
                System.out.println("Congratulations, you are ready to go to the next level!");

            } else {
                System.out.println("Please ask your teacher for extra help.");
            }

            System.out.println("would you like to use a new session?");
            //print in statement that allows for new session//
            session1 = scnf.nextInt();

            if (session1 == 0) {
                continue;
            } else {
                break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner scnf = new Scanner(System.in);
        System.out.println("Welcome! I will present to you some math questions to test your skills.");
        int diff=0;
        int opp=0;
        option1(scnf,diff,opp);
    }
}
