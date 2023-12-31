package fer.project.Country;

import jakarta.persistence.*;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "country_id_generator")
    @SequenceGenerator(name="country_id_generator", sequenceName = "country_country_id_seq", allocationSize=1)
    private long country_id;
    private String country_name;

    public Country() {}

    public long getCountry_id() {
        return country_id;
    }

    public void setCountry_id(long country_id) {
        this.country_id = country_id;
    }

    public String getCountry_name() {
        return country_name;
    }

    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    @Override
    public String toString() {
        return "Country{" +
                "country_id=" + country_id +
                ", country_name='" + country_name + '\'' +
                '}';
    }
}
