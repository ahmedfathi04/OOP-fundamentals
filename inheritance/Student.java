
public class Student extends Person {
    int RollNum ;
    String className ;
    
    public Student(String N , int A , int NI , int RL , String CN) {
        super(N , A , NI);
        RollNum = RL ;
        className = CN ;
    }
    

    public int getRollNum() {
        return RollNum;
    } 
    public String getClassName() {
        return className;
    }

    Person s1 = new Person("ahmed" , 20 , 123456789);

    public void displayStudentDetails() {
        System.out.println("Student Name: " + s1.getName());
        System.out.println("Student age: " + s1.getAge());
        System.out.println("Student NID: " + s1.getNID());
        System.out.println("Student roll name: " + getRollNum());
        System.out.println("Student class name: " + getClassName());
    }
}
