package pattern.decorator;

public abstract class WatchDecorator implements Watch {

    private final Watch watch;

    public WatchDecorator(Watch watch) {
        this.watch = watch;
    }

    public void createFunctionality() {
        this.watch.createFunctionality();
    }
}
