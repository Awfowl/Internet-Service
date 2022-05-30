import java.util.Date;

public class Package extends Internet {

    private double cost;
    private Date endDate;


    public void internetPackage(double cost, Date endDate){
        this.cost = cost;
        this.endDate = endDate;
    }

    public double getCost(){
        return cost;
    }
    public void setCost(double cost){
        this.cost = cost;
    }
    public Date gDate(){
        return endDate;
    }
    public void setDate(Date endDate){
        this.endDate = endDate;
    }


    
}
