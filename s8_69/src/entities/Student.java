package entities;

public class Student {
    public String name;
    public double n1, n2, n3;

    

    public double finalGrade(){
        return n1 + n2 + n3;
    }
    public void status(){
        if (finalGrade() >= 60)
            System.out.println("PASS");
        else
            System.out.printf("FAILED\nMISSING %.2f POINTS", 60 - finalGrade());
    }
}
