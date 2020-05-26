import java.util.Random;

public class GamingMachine {
    
    
    public void GamingMachine(){

    }

    public static boolean play(Money money){
        Random random= new Random();
        boolean randomBoolean = random.nextBoolean();
        if (randomBoolean){
            money.raiseAmount();
        }else{
            money.lowerAmount();
        }
        return(randomBoolean );
    }

    static class Money{
        int amount = 50;
        
        public void raiseAmount(){
            amount += 10;
        }

        public void lowerAmount(){
            amount -= 10;
        }

        @Override
		public String toString() {
			return this.amount+"";
		}      


    }

    public static void main(String[] args){
        Money money = new Money();

        for (int i = 0; i < 10; i++){
            boolean win = play(money);
            if ( win){
                System.out.println("gewonnen");
            }else{
                System.out.println("verloren");
            }
        }
        System.out.println("player has " + money);
    }
}