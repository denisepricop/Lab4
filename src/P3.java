public class P3 {
    public static void main(String[] args) {

        int [] arrayDeIntregi={5,2,4};

        double avg=0;
        int sum=0;
        for(int i=0; i<arrayDeIntregi.length; i++) {
            sum = sum + arrayDeIntregi[i];
        }
            // aici suma va fi suma numerelor
            avg=(double)sum/arrayDeIntregi.length;
            System.out.println(avg);
    }
}
