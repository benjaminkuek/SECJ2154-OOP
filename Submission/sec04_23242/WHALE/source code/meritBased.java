class meritBased extends Scholarship{
    private double allowance ;

    public meritBased(double all){
        allowance = all ;
    }

    public boolean isEligible(Student st){
        if (st.getCgpa() >= ScholarshipRequirement.minCGPA)
            return true ;
        else
            return false ;
    }

    public double getAllowance(){
        return allowance ;
    }

    public void display(){
        
    }
}