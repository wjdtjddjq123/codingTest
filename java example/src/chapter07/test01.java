package chapter07;


class Car{
    String color;
    int door;
    void drive(){
        System.out.println(" 일반차 운전~");
    };
    void stop(){
        System.out.println(" 일반차 멈춤!");
    }
}
public class test01 {
    public static void main(String args[]){

     Car car = new Car();
     car.drive();
     car.stop();

     FireEngine fireEngine = new FireEngine();
     fireEngine.water();
     fireEngine.drive();
     fireEngine.stop();

     Car2 car2 = new Car2();
     car2.drive();
     car2.stop();

    }
}
class FireEngine extends Car{
    void water(){
        System.out.println(" 소방차 물뿌리기~");
    }
    @Override
//  오버라이드를 사용하면 기존에 있는 메서드를 바꿀 수 있다.
    void stop() {
        System.out.println( " 소방차 멈춤 !!! ");
    }
    @Override
    void drive(){
        System.out.println( " 소방차 운전 ~~~ ");
    }
}
class Car2 extends  Car{

}