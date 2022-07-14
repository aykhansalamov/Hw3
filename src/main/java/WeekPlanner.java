import java.util.Scanner;


public class WeekPlanner {


    public static void main(String[] args) {


        String[][] weekDays = {{"monday", "Monday task is reading"},
                {"tuesday", "Tuesday task is running"},
                {"wednesday", "Wednesday task is sleeping"},
                {"thursday", "Thursday task is driving"},
                {"friday", "Friday task is walking"},
                {"saturday", "Saturday task is painting"},
                {"sunday", "Sunday task is drinking"}};

        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Enter weekday:");
            String input = sc.nextLine();

            String dayOfWeek = input.toLowerCase();
            dayOfWeek = dayOfWeek.trim();


            switch (dayOfWeek) {

                case "monday":
                    System.out.println(weekDays[0][1]);
                    continue;

                case "tuesday":
                    System.out.println(weekDays[1][1]);
                    continue;

                case "wednesday":
                    System.out.println(weekDays[2][1]);
                    continue;

                case "thursday":
                    System.out.println(weekDays[3][1]);
                    continue;

                case "friday":
                    System.out.println(weekDays[4][1]);
                    continue;

                case "saturday":
                    System.out.println(weekDays[5][1]);
                    continue;

                case "sunday":
                    System.out.println(weekDays[6][1]);
                    continue;

                case "change monday":
                case "reschedule monday":
                    System.out.println(" Write new task for " + weekDays[0][0]);
                    String newTask1 = sc.nextLine();
                    weekDays[0][1] = newTask1;
                    continue;

                case "change tuesday":
                case "reschedule tuesday":
                    System.out.println(" Write new task for " + weekDays[1][0]);
                    String newTask2 = sc.nextLine();
                    weekDays[0][1] = newTask2;
                    continue;

                case "change wednesday":
                case "reschedule wednesday":
                    System.out.println(" Write new task for " + weekDays[2][0]);
                    String newTask3 = sc.nextLine();
                    weekDays[0][1] = newTask3;
                    continue;

                case "change thursday":
                case "reschedule thursday":
                    System.out.println(" Write new task for " + weekDays[3][0]);
                    String newTask4 = sc.nextLine();
                    weekDays[0][1] = newTask4;
                    continue;

                case "change friday":
                case "reschedule friday":
                    System.out.println(" Write new task for " + weekDays[4][0]);
                    String newTask5 = sc.nextLine();
                    weekDays[0][1] = newTask5;
                    continue;

                case "change saturday":
                case "reschedule saturday":
                    System.out.println(" Write new task for " + weekDays[5][0]);
                    String newTask6 = sc.nextLine();
                    weekDays[0][1] = newTask6;
                    continue;

                case "change sunday":
                case "reschedule sunday":
                    System.out.println(" Write new task for " + weekDays[6][0]);
                    String newTask7 = sc.nextLine();
                    weekDays[0][1] = newTask7;
                    continue;

                default:
                    System.out.println("Sorry, I don't understand you, please try again.");
                    continue;

                case "exit":

            }
            break;


        }
    }

    private static void changeTask (String[] args) {



    }
}


