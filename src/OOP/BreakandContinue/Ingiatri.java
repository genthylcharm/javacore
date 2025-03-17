package OOP.BreakandContinue;

public class Ingiatri {
    class Timso {
        public void Timso5() {
            for (int i = 0; i <= 10; i++) {
                if (i == 5)
                    break;
                System.out.println("giá trị i = " + i);
            }

        }

        public void TimSo6() {
            for (int j = 0; j <= 10; j++) {
                if (j == 6) {
                    continue;
                }
                System.out.println("gia tri cua j =" + j);
            }
        }
    }

    public static void main(String[] args) {
        Ingiatri ingiatri = new Ingiatri();
        Timso timso = ingiatri.new Timso();

        System.out.println("Tim so 5 la :");
        timso.Timso5();
        System.out.println("Tim so 6 la :");
        timso.TimSo6();
    }
}
