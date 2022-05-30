public class Internet {

    private int speed;
    private int bulk;

    public void internet(int speed, int bulk){
        this.speed = speed;
        this.bulk = bulk;
    }
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }
    public int getbulk(){
        return bulk;
    }
    public void setBulk(int bulk){
        this.bulk = bulk;  
    }
}
