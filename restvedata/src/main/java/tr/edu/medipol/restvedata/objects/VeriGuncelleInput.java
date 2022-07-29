package tr.edu.medipol.restvedata.objects;

import lombok.Data;

@Data
public class VeriGuncelleInput {
    long ID;
    String ad;
    String soyad;
    int yas;
    String telefon;
}
