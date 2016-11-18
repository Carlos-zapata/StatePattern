package mx.iteso;

/**
 * Created by Carlos Flores on 17/11/2016.
 */
public class DeliveringCash implements State{
    public String doAction(Context context) {
        context.setState(this);
        return "ATM is delivering $1,000 USD...";
    }

    public String toString(){
        return "Delivering cash state";
    }
}
