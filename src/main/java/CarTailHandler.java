public class CarTailHandler extends CarHandler {
    @Override
    public void handlerCar() {
        System.out.println("生产车辆后背厢");
        if(nextCarHandler!=null){
            nextCarHandler.handlerCar();
        }
    }
}
