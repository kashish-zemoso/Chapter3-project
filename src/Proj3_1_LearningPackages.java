import java.util.Scanner;

public class Proj3_1_LearningPackages {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int packageNo,coursesEnrolled,packageCost,coursesInclude,costPerCourse,totalCost;

        System.out.println("Which of the packages do you want? 1,2 or 3?");
        packageNo = input.nextInt();

        System.out.println("How many courses did you enroll in this month?");
        coursesEnrolled = input.nextInt();

        if(packageNo == 1){
            packageCost = 10;
            coursesInclude = 2;
            costPerCourse = 6;
        }
        else if(packageNo == 2){
            packageCost = 12;
            coursesInclude = 4;
            costPerCourse = 4;
        }
        else{
            packageCost = 15;
            coursesInclude = 6;
            costPerCourse = 3;
        }

        if(coursesEnrolled > coursesInclude){
            totalCost = packageCost + (coursesEnrolled - coursesInclude) * costPerCourse;

        }
        else{
            totalCost = packageCost;
        }

        System.out.print("Total Cost is:\t" + totalCost);
    }
}
