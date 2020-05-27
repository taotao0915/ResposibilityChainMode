
public abstract class CarHandler {
    protected CarHandler nextCarHandler;

    public CarHandler setCarHandler(CarHandler nextCarHandler) {
        this.nextCarHandler = nextCarHandler;
        return this.nextCarHandler;
    }

    public abstract void handlerCar();
}
