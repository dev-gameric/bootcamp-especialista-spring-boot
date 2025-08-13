package com.algaworks.aulas.modulo2.aula08.notificacao;

import com.algaworks.aulas.modulo2.aula08.modelo.Cliente;

public class NotificadorEmail implements Notificador{

    @Override
    public void notificar(Cliente cLiente, String mensagem) {
        System.out.printf("Notificando %s atraves do email %s: %s\n", cLiente.getNome(), cLiente.getEmail(), mensagem);
    }
}
