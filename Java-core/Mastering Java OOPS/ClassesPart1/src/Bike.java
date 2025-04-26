public class Bike {
    private String model;
    private String make;
    private String colour;
    private int tyre;
    private Boolean convertable;
    private Boolean comfort;

    public String describeBike() {
        return "Bike{" +
                "model='" + model + '\'' +
                ", make='" + make + '\'' +
                ", colour='" + colour + '\'' +
                ", tyre=" + tyre +
                ", convertable=" + convertable +
                ", comfort=" + comfort +
                '}';
    }
}
