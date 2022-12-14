public class Classroom {

    public static void main(String[] args){
        Wilder wilder1 = new Wilder("Wilder1");
        Wilder wilder2 = new Wilder("Wilder2");

        wilder2.setAware(false);

        System.out.println(wilder1.whoAmI());
        System.out.println(wilder2.whoAmI());
    }
}
