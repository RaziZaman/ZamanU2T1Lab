public class Student {
    private String name;
    private double gpa;
    private double height;
    private int grade;
    public Student(String studentName, double studentGpa, double studentHeight, int studentGrade){
        name = studentName;
        gpa = studentGpa;
        height = studentHeight;
        grade = studentGrade;
    }
    public void studentInfo() {
        System.out.println("Name: " + name);
        System.out.println("Gpa: " + gpa);
        System.out.println("Grade: " + grade);
        System.out.println("Height: " + height);
    }
    public void studentIntro() {
        System.out.println("Hello, my name is " + name + " and I am in grade " + grade + ". My gpa is " + gpa + " and my height is " + height + " inch(s)");
    }
}
