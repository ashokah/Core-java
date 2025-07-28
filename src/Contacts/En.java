package Contacts;

public class En {
    private long Number;
    private String Name;


    @Override
    public String toString() {
        return "En{" +
                "Number=" + Number +
                ", Name='" + Name + '\'' +
                '}';
    }

    public String getName(String contactsName) {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getNumber(long phoneNumber) {
        return Number;
    }

    public void setNumber(long number) {
        Number = number;
    }
}
