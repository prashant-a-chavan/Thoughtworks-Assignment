public class Main {
    public static void main(String[] args) {

        // Person Class
        Person person = new Person("Prashant", "Kokatnoor");
        System.out.println(person);

        // Student Class
        Student student = new Student("Sagar", "Mysuru", "Computer Application", 2024, 90_000);
        System.out.println(student);
        student.setYear(2025);
        student.setFee(1_00_000);
        System.out.println("Updated Student: " + student);

        // Staff Class
        Staff staff = new Staff("Nikhil", "Haveri", "Engineering", 60_000);
        System.out.println(staff);
        staff.setPay(80_000);
        System.out.println("Updated Staff: " + staff);
    }s
}