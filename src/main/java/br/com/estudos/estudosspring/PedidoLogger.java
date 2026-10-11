package br.com.estudos.estudosspring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PedidoLogger {
    private static final Logger log =
        LoggerFactory.getLogger(PedidoLogger.class);

    public void registrar(long id) {
        log.debug("Registrando pedido {}", id);
        log.info("Pedido {} registrado", id);
    }
}
