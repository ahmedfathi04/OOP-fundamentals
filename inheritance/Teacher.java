
public class Teacher extends Person {
    String subject ;
    int excperience ;

    public Teacher(String N , int A , int NI , String SB , int EX) {
        super(N, A, NI);
        subject = SB;
        excperience = EX;
    }


    public String getSubject() {
        return subject;
    }
    public int getExcperience() {
        return excperience;
    }

    Person s2 = new Person("mohamed", 44, 321654987);

    public void displayTeacherDetails() {
        System.out.println("Teacher Name: " + s2.getName() );
        System.out.println("Teacher age: "  + s2.getAge() );
        System.out.println("Teacher NID: "  + s2.getNID());
        System.out.println("Teacher subject " + getSubject());
        System.out.println("Teacher excperience " + getExcperience());
    }

}
