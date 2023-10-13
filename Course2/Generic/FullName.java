//import java.util.Comparable;

public class FullName implements Comparable <FullName> {
    private String firstName, lastName;
    public FullName(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public boolean equals(Object obj) {
        try {
            FullName other = (FullName) obj;
            return firstName.equals(other.firstName) && lastName.equals(other.lastName);
        }catch (Exception e){
            return false;
        }
    }

    public int compareTo(FullName other){
        int compareLast = lastName.compareTo(other.lastName);
        if(compareLast < 0) return -1;
        else if (compareLast > 0) return 1;
        else return firstName.compareTo(other.firstName);
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }

    public static void main(String[] args) {
        FullName fullName1 = new FullName("Park", "SM");
        FullName fullName2 = new FullName("Park", "NS");

        System.out.println(fullName1.toString());
        System.out.println(fullName2.toString());

        boolean equalsFisrtName = fullName1.firstName.equals(fullName2.firstName);
        boolean equalsLastName = fullName1.lastName.equals(fullName2.lastName);

        System.out.println(equalsFisrtName);
        System.out.println(equalsLastName);

        int compareName = fullName1.compareTo(fullName2);
        System.out.println(compareName);

    }
}
