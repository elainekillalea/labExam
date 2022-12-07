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

    public void setName(String name) throws Exception {
        if(name.length() >= 5){
            this.name = name;
        }
        else{
            throw new Exception("Name must be at least 5 characters");
        }
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) throws Exception {
        int length = (int) (Math.log10(number) + 1);

        if(length == 12) {
            this.number = number;
        }
        else {
            throw new Exception("Employee Number must be 12 digits");
        }
    }
}
