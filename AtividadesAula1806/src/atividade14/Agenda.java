package atividade14;

import java.util.HashMap;
import java.util.Map;

class Agenda {
    private Map<String, String> contatos;

    public Agenda() {
        contatos = new HashMap<>();
    }

    public void adicionarContato(String nome, String telefone) {
        validarContato(nome, telefone);
        contatos.put(nome, telefone);
    }

    private void validarContato(String nome, String telefone) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome do contato não pode ser nulo ou vazio");
        }

        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Telefone do contato não pode ser nulo ou vazio");
        }
    }

}
