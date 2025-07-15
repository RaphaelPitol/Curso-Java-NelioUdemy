package foreach;

public class program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Pessoa p1 = new Pessoa("Raphael", 37);
		Pessoa p2 = new Pessoa("Raphael", 37);
		Pessoa p3 = new Pessoa("Raphael", 57);
		
		Object[] vect = new Object[] {p1, p2, p3};
		
		for (Object obj : vect) {
			System.out.println(obj.toString());
		}
	}
	

}

class Pessoa{
	String nome;
	int idade;
	
	Pessoa(String nome, int idade){
		this.nome = nome;
		this.idade = idade;
	}
	
	public String toString() {
		return nome+ " "+idade;
	}
}
