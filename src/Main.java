public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setId(101);
        s1.setName("Nimit");
        s1.setAge(22);
        System.out.println("Student's Id : " + s1.getId());
        System.out.println("Student's Name : " + s1.getName());
        System.out.println("Student's Age : " + s1.getAge());
    }
}