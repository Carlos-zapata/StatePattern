package mx.iteso;

/**
 * Created by Carlos Flores on 17/11/2016.
 */
public class Working implements State{

        public String doAction(Context context) {
            context.setState(this);
            return "ATM is processing a transaction...";
        }

        public String toString(){
            return "Working state";
        }

}
