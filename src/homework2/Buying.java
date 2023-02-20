package homework2;

public class Buying {
    public static void main(String[] args) {


        boolean isEdekaOpen = true;
        boolean isReweOpen = false;
        boolean canBuy = false;
        checkingWhereIsOpen(isEdekaOpen,isReweOpen,canBuy);
    }

        public static void checkingWhereIsOpen(boolean isEdekaOpen,boolean isReweOpen,  boolean canBuy ) {

            if (isEdekaOpen || isReweOpen) {
                canBuy = true;
                System.out.println("Я могу купить еду, это " + canBuy);
            } else if (!isEdekaOpen && !isReweOpen) {
                canBuy = false;
                System.out.println("Я могу купить еду, это " + canBuy);
            }


        }
    }
