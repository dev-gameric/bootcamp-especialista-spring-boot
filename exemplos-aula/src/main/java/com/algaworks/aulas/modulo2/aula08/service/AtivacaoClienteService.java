package com.algaworks.aulas.modulo2.aula08.service;

import com.algaworks.aulas.modulo2.aula08.notificacao.Notificador;
import com.algaworks.aulas.modulo2.aula08.modelo.Cliente;

public class AtivacaoClienteService {

    private final Notificador notificador;

    public AtivacaoClienteService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void ativar (Cliente cliente) {
        cliente.ativar();

        this.notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

    }
}