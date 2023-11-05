package catalog.Polymorphic;

public class Main {
    public static void main(String[] args){
        // calculate the tax of a man who has income, salary and state council special allowance.
        Income[] incomes = new Income[]{
            new Income(3000),
            new Salary(7500),
            new StateCouncilSpecialAllowance(15000)
        };
        System.out.println(totalTax(incomes));
    
    }

    public static double totalTax(Income[] incomes){
        double total = 0;
        for (Income income: incomes){
            total = total + income.getTax();
        }
        return total;

    }   
}
