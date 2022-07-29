package tr.edu.medipol.restvedata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.edu.medipol.restvedata.Entity.Veri;
import tr.edu.medipol.restvedata.Repository.VeriRepository;
import tr.edu.medipol.restvedata.objects.VeriGuncelleInput;

@RestController
public class VeriGuncelle {
    @Autowired
    VeriRepository veriRepository;

    @RequestMapping(value = "/veriguncelle", method = RequestMethod.POST)
    public String veriGuncelle(@RequestBody VeriGuncelleInput veriGuncelleInput){

        Veri veri = new Veri();
        veri.setID(veriGuncelleInput.getID());
        veri.setAd(veriGuncelleInput.getAd());
        veri.setSoyad(veriGuncelleInput.getSoyad());
        veri.setYas(veriGuncelleInput.getYas());
        veri.setTelefon(veriGuncelleInput.getTelefon());
        veriRepository.save(veri);

        return "Veri Güncellendi.";
    }

}
