package catalog.Polymorphic;

public class StateCouncilSpecialAllowance extends Income{
    public StateCouncilSpecialAllowance(double income){
        super(income);
    }

    @Override
    public double getTax(){
        return 0;
    }
    
}
