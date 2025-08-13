package com.algaworks.aulas.modulo2.aula11.notificacao;

import com.algaworks.aulas.modulo2.aula11.modelo.Cliente;
import org.springframework.stereotype.Component;

@Component
public class NotificadorEmail implements Notificador {

    public NotificadorEmail() {
        System.out.println("Notificador Email - construtor chamado");
    }

    @Override
    public void notificar(Cliente cLiente, String mensagem) {
        System.out.printf("Notificando %s atraves do email %s: %s\n", cLiente.getNome(), cLiente.getEmail(), mensagem);
    }
}
