package com.gabriel.silva.AlgaMysqlJpaHibernate.JPA;

import com.gabriel.silva.AlgaMysqlJpaHibernate.AlgaMysqlJpaHibernateApplication;
import com.gabriel.silva.AlgaMysqlJpaHibernate.Domain.ModelEntity.Cozinha;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

public class ConsultaCozinha {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = new SpringApplicationBuilder(AlgaMysqlJpaHibernateApplication.class)
                .web(WebApplicationType.NONE)
                .run(args);

        CadastroCozinhaJPA cadastroCozinhaJPA = applicationContext.getBean(CadastroCozinhaJPA.class);

        List<Cozinha> cozinhas = cadastroCozinhaJPA.listar();

        for (Cozinha cozinha : cozinhas){
            System.out.println(cozinha.getNome());
        }
    }
}
