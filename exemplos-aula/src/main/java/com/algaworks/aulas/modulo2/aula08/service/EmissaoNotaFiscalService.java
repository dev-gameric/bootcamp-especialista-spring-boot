package com.algaworks.aulas.modulo2.aula08.service;

import com.algaworks.aulas.modulo2.aula08.modelo.Cliente;
import com.algaworks.aulas.modulo2.aula08.modelo.Produto;
import com.algaworks.aulas.modulo2.aula08.notificacao.Notificador;


public class EmissaoNotaFiscalService {

    private Notificador notificador;

    public EmissaoNotaFiscalService(Notificador notificador) {
        this.notificador = notificador;
    }

    public void emitir(Cliente cliente, Produto produto) {
        // emitir nota fiscal

        this.notificador.notificar(cliente,"Nota fiscal do produto " + produto.getNome() + "foi emitida!");

    }
}
