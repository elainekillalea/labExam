public class Employee {

    String name;
    long number;

    public Employee(String nameIn, long numberIn) {
        name = nameIn;
        number = numberIn;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(name.length() >= 5){
            this.name = name;
        }
        else{
            System.out.println("Name must be at least 5 characters");
        }
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        int length = (int) (Math.log10(number) + 1);

        if(length == 12) {
            this.number = number;
        }
        else {
            System.out.println("Employee Number must be 12 digits");
        }
    }
}
