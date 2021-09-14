public class Car {
    private String make, model;
    private int year;

    public Car (String make, String model, int year){
        setMake (make);
        setModel (model);
        setYear (year);
    }
    public String getMake(){
        return make;
    }
    public void setMake (String make){
        if (make.isBlank()) {
            throw new IllegalArgumentException("must have a make");
        } else{
            this.make = make;

        }
    }
    public String getModel(){
        return model;
    }
    public void setModel (String model){
        if (!model.isBlank()) {
            this.model = model;
        } else{
            throw new IllegalArgumentException("must have a model");

        }
    }
    public int getYear(){
        return year;
    }
    public void setYear (int year){
        if (year>1900 && year<2023) {
            this.year = year;
        } else{
            throw new IllegalArgumentException(" this year doesn't exist");
        }
    }
    public String toString(){
        return String.format("%s %s year "+ year, make, model, year);
    }
}
