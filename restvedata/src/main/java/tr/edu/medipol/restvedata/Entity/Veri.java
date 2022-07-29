package tr.edu.medipol.restvedata.Entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Veri {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    long ID;
    String ad;
    String soyad;
    int yas;
    String telefon;

}
