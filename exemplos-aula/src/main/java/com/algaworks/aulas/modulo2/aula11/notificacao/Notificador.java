package com.algaworks.aulas.modulo2.aula11.notificacao;

import com.algaworks.aulas.modulo2.aula11.modelo.Cliente;

public interface Notificador {

    void notificar(Cliente cliente, String mensagem);
}