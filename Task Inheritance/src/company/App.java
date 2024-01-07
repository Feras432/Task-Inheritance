package company;

public class App {
    public static void main(String[] args) throws Exception {
        Director james = new Director("James", "HR", 40000.0, 5000000.0);
        Engineer john = new Engineer("John", "Electrical", 28000.0, new String[] { "Leadership", "Managment" });
        Intern jessica = new Intern("Jessica", "Marketing", 0, "SDSU");
        SalesPerson jordan = new SalesPerson("Jordan", "Sales", 58000.0, 30000);

        System.out.println(james);
        System.out.println(jessica);
        System.out.println(jordan);
        System.out.println(john);
    }
}
