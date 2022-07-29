package tr.edu.medipol.restvedata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.edu.medipol.restvedata.Entity.Veri;
import tr.edu.medipol.restvedata.Repository.VeriRepository;
import tr.edu.medipol.restvedata.objects.VeriInput;

@RestController
public class VeriEkle {

    @Autowired
    VeriRepository veriRepository;

//    long ID = 0;


    @RequestMapping(value = "/veriekle",method = RequestMethod.POST)
    public String VeriEkle(@RequestBody VeriInput veriInput){

        Veri veri = new Veri();
 //       veri.setID(++ID);
 //       veri.setID(veriInput.getID());
        veri.setAd(veriInput.getAd());
        veri.setSoyad(veriInput.getSoyad());
        veri.setYas(veriInput.getYas());
        veri.setTelefon(veriInput.getTelefon());
        veriRepository.save(veri);

        return "Veri Kaydedildi.";
    }

}
