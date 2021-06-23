package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        long startt = 3;
        long step = 3;
        long amountt = 1_000_000_000;

        long startTime = System.currentTimeMillis();

        FormulCounter counter = new FormulCounter(startt, step, amountt);
        Thread t = new Thread(counter);
        t.start();
        t.join();

        System.out.println(counter.result);

        long timeSpent = System.currentTimeMillis() - startTime;
        System.out.println("По формуле программа выполнялась " + timeSpent + " миллисекунд\n");

        long startTime1 = System.currentTimeMillis();

        Counter count1 = new Counter(startt, step, amountt);
        Thread t1 = new Thread(count1);
        t1.start();
        t1.join();

        System.out.println(count1.result);

        long timeSpent1 = System.currentTimeMillis() - startTime1;
        System.out.println("В 1 треде программа выполнялась " + timeSpent1 + " миллисекунд\n");


        for(int k = 2; k<=32; k = k * 2) {
            int nuuu = (int) (amountt % k); //остаток слагаемых которые будут считаться в последнем треде

            long startTime2 = System.currentTimeMillis();

            ArrayList<Thread> threads = new ArrayList<>();
            ArrayList<Counter> counters = new ArrayList<>();


            for(int num = 1; num<=k; num++){  //для каждого треда
                if(num == k){ //для последнего треда
                    Counter counter1 = new Counter((startt + ((amountt - nuuu) / k * (num - 1)) * step), step, (amountt - nuuu) / k + nuuu);
                    Thread thread1 = new Thread(counter1);
                    threads.add(thread1);
                    counters.add(counter1);
                }else {
                    Counter counter1 = new Counter((startt + ((amountt - nuuu) / k * (num - 1)) * step), step, (amountt- nuuu) / k);
                    //создаем обьект который будеть считать суму прогрессии для своего диапазона чисел
                    // ((amountt - nuuu) / k * (num - 1)) количество слагаемых обработанных предыдущими тредами
                    Thread thread1 = new Thread(counter1);
                    threads.add(thread1);
                    counters.add(counter1);
                }
            }
            for(int i = 0; i< threads.size(); i++){
                threads.get(i).start();
            }
            for(int i = 0; i< threads.size(); i++){
                threads.get(i).join();
            }
            //запускаем треды
            long s = 0;
            for(int i = 0; i< counters.size(); i++){
                s = s + counters.get(i).result;
            } //сумируем результаты с тредов
            System.out.println(s);

            long timeSpent2 = System.currentTimeMillis() - startTime2;
            System.out.println( "В " + k + " тредах программа выполнялась " + timeSpent2 + " миллисекунд\n");

        }
    }
}
