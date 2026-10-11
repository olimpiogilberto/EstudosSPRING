package br.com.estudos.estudosspring;

public class TemplateDeOperacao {
    public void executar(Runnable tarefa) {
        System.out.println("Inicio");
        try {
            tarefa.run();
        } finally {
            System.out.println("Fim");
        }
    }
}
