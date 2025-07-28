//Encapsulation
 class P {
     private String name;
     private int age;
     private int password;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }
 }
    public class S {
        public static void main(String args[]) {
           P p=new P();
           p.setName("Phani");
           p.setAge(25);
           System.out.println(p.getName());
           System.out.println(p.getAge());
        }
    }

