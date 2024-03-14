package LambdaExpression;
@FunctionalInterface // Introduced in java 8
interface Cab
{
    public  void bookCab();

}

//class Ola implements Cab{
//    @Override
//    public void bookCab() {
//        System.out.println("Ola cab is booked");
//    }
//
//
//}
public class Lambda1 {
    public static void main(String[] args) {

        Cab ola =   () -> System.out.println("Cab is booked");
        ola.bookCab();
    }
}
