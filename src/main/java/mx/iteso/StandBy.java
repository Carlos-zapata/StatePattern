package mx.iteso;

/**
 * Created by Carlos Flores on 17/11/2016.
 */
public class StandBy implements State{


        public String doAction(Context context) {
            context.setState(this);
            return "ATM is waiting to be used...";
        }

        public String toString(){
            return "StandBy state";
        }

}
