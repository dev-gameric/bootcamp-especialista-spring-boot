package com.algaworks.aulas.modulo2.aula08.notificacao;

import com.algaworks.aulas.modulo2.aula08.modelo.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);
}