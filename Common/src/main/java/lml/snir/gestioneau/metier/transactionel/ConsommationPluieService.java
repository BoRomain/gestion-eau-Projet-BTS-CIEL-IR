package lml.snir.gestioneau.metier.transactionel;

import java.util.Date;
import java.util.List;
import lml.snir.gestioneau.metier.entity.ConsommationPluie;
import lml.snir.persistence.CrudService;

public interface ConsommationPluieService extends CrudService<ConsommationPluie> {
    public List<ConsommationPluie> getByDate(Date date) throws Exception;
}
