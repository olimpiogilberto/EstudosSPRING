package br.com.estudos.estudosspring;

public class EstudosSpringApplication {
    public static void main(String[] args) {
        RelatorioService service = new RelatorioService();
        service.gerar();
    }
}

