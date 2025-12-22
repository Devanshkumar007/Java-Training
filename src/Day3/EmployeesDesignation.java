package Day3;

import java.util.Scanner;

public class EmployeesDesignation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Select departments : \n IT\n HR\n Finance \n Operations ");
        String dept = sc.nextLine();

        switch (dept) {
            case "IT":
                System.out.println("Select post :\n Developer\n Tester\n DevOps");
                String itRole = sc.next();
                switch (itRole) {
                    case "Developer":
                    case "Tester":
                    case "DevOps":
                        System.out.printf("You are in %s and your selected role is %s", dept, itRole);
                        break;
                    default:
                        System.out.println("Invalid IT Role selected.");
                }
                break;

            case "HR":
                System.out.println("Select post :\n Recruiter\n Executive\n Payroll");
                String hrRole = sc.next();
                switch (hrRole) {
                    case "Recruiter":
                    case "Executive":
                    case "Payroll":
                        System.out.printf("You are in %s and your selected role is %s", dept, hrRole);
                        break;
                    default:
                        System.out.println("Invalid HR Role selected.");
                }
                break;

            case "Finance":
                System.out.println("Select post :\n Accountant\n Analyst\n Auditor");
                String finRole = sc.next();
                switch (finRole) {
                    case "Accountant":
                    case "Analyst":
                    case "Auditor":
                        System.out.printf("You are in %s and your selected role is %s", dept, finRole);
                        break;
                    default:
                        System.out.println("Invalid Finance Role selected.");
                }
                break;

            case "Operations":
                System.out.println("Select post :\n Executive\n Lead\n Manager");
                String opRole = sc.next();
                switch (opRole) {
                    case "Executive":
                    case "Lead":
                    case "Manager":
                        System.out.printf("You are in %s and your selected role is %s", dept, opRole);
                        break;
                    default:
                        System.out.println("Invalid Operations Role selected.");
                }
                break;
                
            default:
                System.out.println("INVALID DEPARTMENT");
                break;
        }
    }
}