package observer;

public class SumObserver implements Observer{
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitSum : "+getDigitSum(generator.getNumber()));
//        try {
//            Thread.sleep(100);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
    }

    private int getDigitSum(int n){
        if(n == 0) return 0;

        int sum = 0;
        while(n != 0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
}
