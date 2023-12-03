package sauna;

public class waterapp {
    public static void main(String args[]) {

        water sauna1 = new water();

        water sauna2 = new water();

        sauna1.setTemp(4);
        sauna2.setTemp(5);
        System.out.println("첫번째 탕은" + sauna1.water()+"입니다.");
        sauna1.tempUp();
        System.out.println("첫번째 탕은" + sauna1.water()+"입니다.");
        System.out.println("두번째 탕은" + sauna2.water()+"입니다.");
    }
}