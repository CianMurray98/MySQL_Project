package ie.atu;

    abstract class Motorcycle {
        protected String make;
        protected String model;
        protected int year;
        protected int bhp;
        protected String style;
        protected String licence_catagory;

    public Motorcycle(String make, String model, int year, int bhp, String style, String licence_catagory) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.bhp = bhp;
        this.style = style;
        this.licence_catagory = licence_catagory;
    }

    // Getters and setters
    public String getMake() {
        return make;}
    public void setMake(String make) {
        this.make = make;}

    public String getModel() {
        return model;}
    public void setModel(String model) {
        this.model = model;}

    public int getYear() {
        return year;}
    public void setYear(int year) {
        this.year = year;}

    public int getBhp() {
        return bhp;}
    public void setBhp(int bhp) {
        this.bhp = bhp;}

    public String getStyle() {
        return style;}
    public void setStyle(String style) {
        this.style = style;}

    public String getLicence_catagory() {
        return licence_catagory;}
    public void setlicence_catagory(String licence_catagory) {
        this.licence_catagory = licence_catagory;}

}