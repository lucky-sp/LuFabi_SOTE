package Exercise1;

public class City {
    private String zipCode;
    private String name;
    private String state;

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    static class Builder{
        private String zipCode = "";
        private String name = "";
        private String state = "";

        public Builder setZipCode(String zipCode){
            this.zipCode = zipCode;
            return this;
        }

        public Builder setName (String name){
            this.name = name;
            return this;
        }

        public City setState(String state){
            City city = new City();
            city.setName(this.name);
            city.setZipCode(this.zipCode);
            city.setState(state);
            return city;
        }
    }

    
}