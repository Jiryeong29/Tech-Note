class product {
    static int count = 0;
    int serialNo;
    {
        ++count;
        serialNo = count;
    }
    public product() {}
}
class ProductTest {
    public static void main(String args[]) {
        product p1 = new product();
        product p2 = new product();
        product p3 = new product();

        System.out.println("p1의 제품번호(serial no)는 " + p1.serialNo);
        System.out.println("p2의 제품번호(serial no)는 " + p2.serialNo);
        System.out.println("p3의 제품번호(serial no)는 " + p3.serialNo);
        System.out.println("생산된 제품의 수는 모두 "+product.count+"개 입니다.");
    }
}
