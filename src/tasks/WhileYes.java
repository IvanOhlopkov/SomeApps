package tasks;

public class WhileYes {
    public void checkYes() {
        //        int i = 0;
//
//        while (i < 20) {
//            if (i > 6 && i < 10) {
//                continue; //бесконечное цукиеме потому что не выполняется i + 1
//            }
//            System.out.println("YES");
//            i = i + 1;
//        }

        for (int i = 0; i < 10; ) {
            if (i < 5) {
                i = i + 1;
            }
            i = i + 1;
            System.out.println("YES"); //напечает 7 раз, так как по условию на 6-м YES i = 9 и подходит под условие
        }
    }
}
