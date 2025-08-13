package com.algaworks.aulas.modulo2.aula11;

import com.algaworks.aulas.modulo2.aula11.modelo.Cliente;
import com.algaworks.aulas.modulo2.aula11.notificacao.Notificador;
import com.algaworks.aulas.modulo2.aula11.notificacao.NotificadorEmail;
import com.algaworks.aulas.modulo2.aula11.service.AtivacaoClienteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}
