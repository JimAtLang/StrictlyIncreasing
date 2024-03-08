public class Main {
    public static void main(String[] args){
        new Main();
    }
    public Main(){
        Digits d1 = new Digits(123456789);
        System.out.println(d1.isStrictlyIncreasing());
        Digits d2 = new Digits(1234567789);
        System.out.println(d2.isStrictlyIncreasing());
        Digits d3 = new Digits(123456543);
        System.out.println(d3.isStrictlyIncreasing());
    }
}
