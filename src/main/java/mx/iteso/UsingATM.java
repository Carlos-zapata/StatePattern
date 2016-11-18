package mx.iteso;

/**
 * Created by Carlos Flores on 17/11/2016.
 */
public class UsingATM {
        public static void main(String[] args) {
            Context context = new Context();

            StandBy StandByState = new StandBy();
            System.out.println(StandByState.doAction(context));

            System.out.println(context.getState().toString());

            Working WorkingState = new Working();
            System.out.println(WorkingState.doAction(context));

            System.out.println(context.getState().toString());

            DeliveringCash DeliveringCashState = new DeliveringCash();
            System.out.println(DeliveringCashState.doAction(context));

            System.out.println(context.getState().toString());
        }

}
