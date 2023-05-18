public class _00_Class_10 {
    int iv;
    static int amg;
    void i_method() {
    }
    static void a_Method() {
    //    System.out.println(iv);// 스태틱에서는 스태틱이 붙어있는것만 사용가능하다.
        System.out.println(amg);
    }
    public static void main(String[] args) {
        _00_Class_10.amg =50;// 클래스명.변수명
        System.out.println(amg);
        _00_Class_10 a = new _00_Class_10();
        a.iv =100;
        System.out.println(a.iv);
    }
}
