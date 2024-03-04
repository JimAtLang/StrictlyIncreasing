public class Main {
    public static void main(String[] args){
        new Main();
    }
    public Main(){
        Digits d = new Digits(1234567899);
        System.out.println(d.isStrictlyIncreasing());
    }
}
