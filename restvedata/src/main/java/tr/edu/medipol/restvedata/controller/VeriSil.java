package tr.edu.medipol.restvedata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.edu.medipol.restvedata.Entity.Veri;
import tr.edu.medipol.restvedata.Repository.VeriRepository;

@RestController
public class VeriSil {
    @Autowired
    VeriRepository veriRepository;

    @RequestMapping(value = "/verisil", method = RequestMethod.GET)
    public String VeriSil(Long id){
        veriRepository.deleteById(id);


        return id+ "Nolu kişi silinmiştir";



    }


}
