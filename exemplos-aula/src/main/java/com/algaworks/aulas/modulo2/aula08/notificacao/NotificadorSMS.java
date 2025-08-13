package com.algaworks.aulas.modulo2.aula08.notificacao;

import com.algaworks.aulas.modulo2.aula08.modelo.Cliente;

public class NotificadorSMS implements Notificador {

    @Override
    public void notificar(Cliente cliente, String mensagem) {
        System.out.printf("Notificando %s por SMS através do telefone %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
    }
}
