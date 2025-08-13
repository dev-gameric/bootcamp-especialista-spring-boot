package com.algaworks.aulas.modulo2.aula11.service;

import com.algaworks.aulas.modulo2.aula11.modelo.Cliente;
import com.algaworks.aulas.modulo2.aula11.notificacao.Notificador;
import org.springframework.stereotype.Component;

@Component
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