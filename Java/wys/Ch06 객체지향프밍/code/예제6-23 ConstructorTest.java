class Data1 {
    int value;
}
class Data2{
    int value;
    Data(int x) {
        value = x;
    }
}
class constructorTest {
    public static void main(String[] args) {
        Data1 d1 = new Data1();
        Data2 d2 = new Data2();
    }
}