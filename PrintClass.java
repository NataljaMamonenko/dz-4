public class PrintClass {
    public int toPrintInt = 10;


    public String print(){
        String updatedValue = String.format("\"---<%d>---\"%n", toPrintInt);
        System.out.println(updatedValue);
        return updatedValue;
    }
}



