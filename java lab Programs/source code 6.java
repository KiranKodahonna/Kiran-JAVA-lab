package CIE;

public class Internals extends Student {
    public int[] internalMarks;

    public Internals(String usn, String name, int sem, int[] internalMarks) {
        super(usn, name, sem);
        this.internalMarks = internalMarks;
    }
}

package CIE;

public class Student {
    public String usn;
    public String name;
    public int sem;

    public Student(String usn, String name, int sem) {
        this.usn = usn;
        this.name = name;
        this.sem = sem;
    }
}

package SEE;

import CIE.Student;

public class External extends Student {
    public int[] seeMarks;

    public External(String usn, String name, int sem, int[] seeMarks) {
        super(usn, name, sem);
        this.seeMarks = seeMarks;
    }
}

import java.util.Scanner;
import CIE.*;
import SEE.*;

public class CalculateFinalMarks {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int n = s1.nextInt();
        Internals[] CS = new Internals[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for CIE student " + (i + 1));
            System.out.print("USN: ");
            String usn = s1.next();
            System.out.print("Name: ");
            String name = s1.next();
            System.out.print("Semester: ");
            int sem = s1.nextInt();
            System.out.println("Enter internal marks for 5 courses:");
            int[] internalMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                System.out.print("Course " + (j + 1) + ": ");
                internalMarks[j] = s1.nextInt();
            }
            CS[i] = new Internals(usn, name, sem, internalMarks);
        }
        External[] SS = new External[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for SEE student " + (i + 1));
            System.out.print("USN: ");
            String usn = s1.next();
            System.out.print("Name: ");
            String name = s1.next();
            System.out.print("Semester: ");
            int sem = s1.nextInt();
            System.out.println("Enter SEE marks for 5 courses:");
            int[] seeMarks = new int[5];
            for (int j = 0; j < 5; j++) {
                System.out.print("Course " + (j + 1) + ": ");
                seeMarks[j] = s1.nextInt();
            }
            SS[i] = new External(usn, name, sem, seeMarks);
        }
        int[][] finalMarks = new int[n][5];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                finalMarks[i][j] = CS[i].internalMarks[j] + SS[i].seeMarks[j];
            }
        }
        System.out.println("\nFinal Marks:");
        for (int i = 0; i < n; i++) {
            System.out.print("USN: " + CS[i].usn + ", Name: " + CS[i].name + ", Semester: " + CS[i].sem + ", Final Marks: ");
            for (int j = 0; j < 5; j++) {
                System.out.print(finalMarks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
