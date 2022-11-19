import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input kol students: ");
        int num = in.nextInt();
        String[] stud = new String[num];
        String command = "";
        for(int i = 0; i < num; i++) {
            System.out.print("Student name: ");
            command = in.next();
            System.out.print("Student surname: ");
            String surname = in.next();
            stud[i] = command + " " + surname;
        }
        studentsList sl = new studentsList(num, stud);
        sl.AllStudents();
        command = "";

        while(!Objects.equals(command, "exit")) {
            System.out.println("Input command: ");
            command = in.nextLine();
            if (Objects.equals(command, "/r")) {
                int ret = sl.randomSt();
                if (ret != -1) {
                    System.out.println("What is mark?");
                    int mark = in.nextInt();
                    sl.takeMark(mark, ret);
                }
            }

            if (Objects.equals(command, "/l")) {
                sl.WhoWithMark();
            }

            if (Objects.equals(command, "/h")) {
                System.out.println("/r - select random student, asks if present \n");
                System.out.println("/l - list of students with who received a grade  \n");
                System.out.println("/h - helps, lists commands and how to use them  \n");
                System.out.println("exit - exit from programme %d \n");
            }
        }

        in.close();
    }
}
