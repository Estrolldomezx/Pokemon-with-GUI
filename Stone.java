
public class Stone extends Item{
    private int Cost;

    public Stone(String name, int cost){
        super(name);
        this.Cost = cost;
    }
    public int getCost(){
        return Cost;
    }
}