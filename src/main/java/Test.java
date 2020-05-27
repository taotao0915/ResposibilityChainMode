public class Test {
    public static void main(String[] args) {
        CarHandler carHead = new CarHeadHandler();
        CarHandler carBody = new CarBodyHandler();
        CarHandler carTail = new CarTailHandler();

        carHead.setCarHandler(carBody).setCarHandler(carTail);
        carHead.handlerCar();
    }
}
