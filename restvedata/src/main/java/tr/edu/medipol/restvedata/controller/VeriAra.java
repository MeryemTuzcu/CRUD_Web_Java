package tr.edu.medipol.restvedata.controller;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import tr.edu.medipol.restvedata.Entity.Veri;
import tr.edu.medipol.restvedata.Repository.VeriRepository;


import java.util.List;
@RestController
public class VeriAra {
    @Autowired
    VeriRepository veriRepository;


    @RequestMapping(value = "/veriara", method = RequestMethod.GET)
    public ResponseEntity<List<Veri>> getVeriByAd(String ad){
        return new ResponseEntity<>(veriRepository.findByAd(ad), HttpStatus.OK);

    }

}



