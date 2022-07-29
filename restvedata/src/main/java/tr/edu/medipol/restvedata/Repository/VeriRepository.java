package tr.edu.medipol.restvedata.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import tr.edu.medipol.restvedata.Entity.Veri;

import java.util.ArrayList;
import java.util.List;

public interface VeriRepository extends CrudRepository<Veri, Long> {

    List<Veri> findByAd(String ad);



}
