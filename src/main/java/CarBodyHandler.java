public class CarBodyHandler extends CarHandler {
    @Override
    public void handlerCar() {
        System.out.println("生产车辆主体");
        if(nextCarHandler!=null){
            nextCarHandler.handlerCar();
        }
    }
}
