package entities;

import java.util.Date;

import javax.xml.crypto.Data;

import entities.enuns.OrderStatus;

public class Pedido {
	private int id;
	private Date dataPedido;
	private OrderStatus status;
	
	public Pedido() {	}

	public Pedido(int id, Date date, OrderStatus status) {
		this.id = id;
		this.dataPedido = date;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataPedido() {
		return dataPedido;
	}

	public void setDataPedido(Date dataPedido) {
		this.dataPedido = dataPedido;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", dataPedido=" + dataPedido + ", status=" + status + "]";
	}
	
	
}
