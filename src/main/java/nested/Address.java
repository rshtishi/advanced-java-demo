package nested;

public class Address {

    private String state;
    private String city;
    private String street;
    private String building;
    private String appartNo;

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getBuilding() {
        return building;
    }

    public String getAppartNo() {
        return appartNo;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Address{");
        sb.append("state='").append(state).append('\'');
        sb.append(", city='").append(city).append('\'');
        sb.append(", street='").append(street).append('\'');
        sb.append(", building='").append(building).append('\'');
        sb.append(", appartNo='").append(appartNo).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (state != null ? !state.equals(address.state) : address.state != null) return false;
        if (city != null ? !city.equals(address.city) : address.city != null) return false;
        if (street != null ? !street.equals(address.street) : address.street != null) return false;
        if (building != null ? !building.equals(address.building) : address.building != null) return false;
        return appartNo != null ? appartNo.equals(address.appartNo) : address.appartNo == null;
    }

    private Address(Builder builder){
        this.state = builder.state;
        this.city = builder.city;
        this.street = builder.street;
        this.building = builder.building;
        this.appartNo = builder.appartNo;
    }

    public static class Builder{

        private String state;
        private String city;
        private String street;
        private String building;
        private String appartNo;

        public Builder state(String state){
            this.state = state;
            return this;
        }

        public Builder city(String city){
            this.city = city;
            return this;
        }

        public Builder Street(String street){
            this.street = street;
            return this;
        }

        public Builder building(String building){
            this.building = building;
            return this;
        }

        public Builder appartNo(String appartNo){
            this.appartNo =appartNo;
            return this;
        }

        public Address build(){
            Address address = new Address(this);
            return address;
        }

    }


}
