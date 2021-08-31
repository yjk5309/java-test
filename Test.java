public class Test {

    int a;  // 객체변수 a

    public void vartest() {
        this.a++;
    }

    public static void main(String[] args) {
        Test myTest = new Test();
        myTest.a = 1;
        myTest.vartest();
        System.out.println(myTest.a);
    }
}
