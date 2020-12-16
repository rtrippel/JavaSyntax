package multithreading;

public class Volatile {

    private String text = "!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!END!!!!!!!!!!!!!!!!!!!!!!!";

    public Volatile() {
        new Thread(){
            volatile boolean flag = false; //ключевое слово volatile не дает кешироваться переменной.
            // Т.е. говорит о том что переменная изменяемая, может измениться, поэтому процессор ее постоянно чекает.
            private int i;
            @Override
            public void run() {
                while (!flag){
                    i++;

                    if (i >100000) {
                        flag = true;
                        System.out.println(text);
                    }
                }
            }
        }.start();
    }
}
