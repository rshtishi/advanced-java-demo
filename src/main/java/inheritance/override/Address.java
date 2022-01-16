package inheritance.override;

import java.util.Objects;

public class Address {

    private String state;
    private String city;
    private String street;
    private String apartmentNo;

    public Address(String state, String city, String street, String appartmentNo) {
        this.state = state;
        this.city = city;
        this.street = street;
        this.apartmentNo = appartmentNo;
    }


    @Override
    public String toString() {
        return "Address{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                ", apartmentNo='" + apartmentNo + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return this.state.equals(address.getState()) &&
                this.city.equals(address.getCity()) &&
                this.street.equals(address.getStreet()) &&
                this.apartmentNo.equals(address.getApartmentNo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(city);
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getApartmentNo() {
        return apartmentNo;
    }
}
