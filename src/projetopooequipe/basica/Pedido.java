/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopooequipe.basica;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author petrusdemelo
 */
public class Pedido {

    private Integer id;
    private Cliente cliente;
    private Vendedor vendedor;
    private Date data_pedido;
    private ArrayList<PedidoProduto> pedidoProduto;
    private Pagamento pagamento;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vendedor getVendedor() {
        return vendedor;
    }

    public void setVendedor(Vendedor vendedor) {
        this.vendedor = vendedor;
    }

    public Date getData_pedido() {
        return data_pedido;
    }

    public void setData_pedido(Date data_pedido) {
        this.data_pedido = data_pedido;
    }

    public ArrayList<PedidoProduto> getPedidoProduto() {
        return pedidoProduto;
    }

    public void setPedidoProduto(ArrayList<PedidoProduto> pedidoProduto) {
        this.pedidoProduto = pedidoProduto;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    private class PedidoProduto {

        private Integer id;
        private double valorProduto;
        private Integer qtdeProduto;

        public Integer getId() {
            return id;
        }

        public void setId(Integer id) {
            this.id = id;
        }

        public double getValorProduto() {
            return valorProduto;
        }

        public void setValorProduto(double valorProduto) {
            this.valorProduto = valorProduto;
        }

        public Integer getQtdeProduto() {
            return qtdeProduto;
        }

        public void setQtdeProduto(Integer qtdeProduto) {
            this.qtdeProduto = qtdeProduto;
        }

    }

}
