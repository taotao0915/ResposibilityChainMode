public class CarHeadHandler extends CarHandler {
    @Override
    public void handlerCar() {
        System.out.println("生产车辆发动机");
        if(nextCarHandler!=null){
            nextCarHandler.handlerCar();
        }
    }
}
