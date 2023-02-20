package homework2;

public class Buying {
    public static void main(String[] args) {


        boolean isEdekaOpen = false;
        boolean isReweOpen = false;

        checkingWhereIsOpen(isEdekaOpen,isReweOpen);
    }

        public static void checkingWhereIsOpen(boolean isEdekaOpen,boolean isReweOpen) {
        String store;

            if (isEdekaOpen || isReweOpen) {
                if(isEdekaOpen &&!isReweOpen){
                    store = "Edeka";}
                else if(!isEdekaOpen && isReweOpen)
                    store = "Rewe";
                else store = "Edeka and Rewe";
                System.out.println("I can go to  " + store);
            }
           else

                System.out.println("All stores are closed");
            }


        }

