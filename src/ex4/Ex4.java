package ex4;

public class Ex4 {
    public static void main(String args[]) {
        class FinalAttributes {
            private final int FINAL_ATTRIBUTE1;
            private final static int FINAL_ATTRIBUTE2 ;
            static {
                FINAL_ATTRIBUTE2 = 2;
            }
            FinalAttributes(int a) {
                this.FINAL_ATTRIBUTE1 = a;


            }
            FinalAttributes a = new FinalAttributes(2);
        }
    }
}
