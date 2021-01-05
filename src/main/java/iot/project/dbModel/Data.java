package iot.project.dbModel;
import javax.persistence.*;
import java.util.Date;
import java.util.UUID;


@Entity
@Table(name="data")
public class Data {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;
    @Column(name="date")
    private Date date;

    @Column(name="moisture")
    private double moisture;

    @Column(name="rain")
    private double rain;

    @Column(name="ultrasonic")
    private double ultrasonic;

    public Data(UUID id, double moisture, double rain, double ultrasonic) {
        this.id = id;
        this.moisture = moisture;
        this.rain = rain;
        this.ultrasonic = ultrasonic;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public void setMoisture(double moisture) {
        this.moisture = moisture;
    }

    public void setRain(double rain) {
        this.rain = rain;
    }

    public void setUltrasonic(double ultrasonic) {
        this.ultrasonic = ultrasonic;
    }

    public UUID getId() {
        return id;
    }

    public double getMoisture() {
        return moisture;
    }

    public double getRain() {
        return rain;
    }

    public double getUltrasonic() {
        return ultrasonic;
    }
}
