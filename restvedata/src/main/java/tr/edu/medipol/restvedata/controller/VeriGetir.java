package tr.edu.medipol.restvedata.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tr.edu.medipol.restvedata.Entity.Veri;
import tr.edu.medipol.restvedata.Repository.VeriRepository;

import java.util.ArrayList;

@RestController
public class VeriGetir {
    @Autowired
    VeriRepository veriRepository;

    @RequestMapping(value = "/veriler", method = RequestMethod.GET)
    public  ArrayList<Veri> verileriListele(){
        ArrayList<Veri> butunVeriler = (ArrayList<Veri>) veriRepository.findAll() ;

            return  butunVeriler;
        }



}

