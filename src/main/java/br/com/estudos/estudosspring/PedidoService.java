package br.com.estudos.estudosspring;

public class PedidoService {
    private final PedidoRepository repository;

    public PedidoService(PedidoRepository repository) {
        this.repository = repository;
    }

    public void registrar(Pedido pedido) {
        repository.salvar(pedido);
    }
}
