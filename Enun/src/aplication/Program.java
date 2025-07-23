package aplication;

import java.util.Date;

import entities.Pedido;
import entities.enuns.OrderStatus;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pedido pedido = new Pedido(100, new Date(), OrderStatus.PAGAMENTO_PENDENTE);
		
		System.out.println(pedido.toString());
		
		OrderStatus os1 = OrderStatus.ENTREGUE;
		OrderStatus os2 = OrderStatus.valueOf("PAGAMENTO_PENDENTE");
		
		System.out.println(os1);
		System.out.println(os2);

	}

}
