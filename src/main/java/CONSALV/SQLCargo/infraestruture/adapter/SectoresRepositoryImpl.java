package CONSALV.SQLCargo.infraestruture.adapter;

import CONSALV.SQLCargo.app.repository.SectoresRepository;
import CONSALV.SQLCargo.infraestruture.entity.sectores;
import org.springframework.stereotype.Repository;
@Repository
public class SectoresRepositoryImpl implements SectoresRepository {

    private final SectoresCrudRepository secr;

    public SectoresRepositoryImpl(SectoresCrudRepository secr) {
        this.secr = secr;
    }

    @Override
    public Iterable<sectores> getSectores() {
        return secr.findAll();
    }

}
