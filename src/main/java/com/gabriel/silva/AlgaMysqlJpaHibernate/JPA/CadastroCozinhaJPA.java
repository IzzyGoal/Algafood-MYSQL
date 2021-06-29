package com.gabriel.silva.AlgaMysqlJpaHibernate.JPA;

import com.gabriel.silva.AlgaMysqlJpaHibernate.Domain.ModelEntity.Cozinha;
import org.springframework.stereotype.Component;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Component
public class CadastroCozinhaJPA {

    @PersistenceContext
    private EntityManager manager;

    public List<Cozinha> listar() {
        return manager.createQuery("from cozinha", Cozinha.class).getResultList();
    }
}
