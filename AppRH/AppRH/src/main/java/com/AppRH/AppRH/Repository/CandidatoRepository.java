package com.AppRH.AppRH.Repository;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import com.AppRH.AppRH.Models.Candidato;
import com.AppRH.AppRH.Models.Vaga;

// a estrutura findBy é padrão
public interface CandidatoRepository extends CrudRepository<Candidato,String> {
    Iterable<Candidato>findByVaga(Vaga vaga);
    Candidato findByRG(String rg);
    Candidato findById(long id);
    Candidato findByNome(String nome);

}
