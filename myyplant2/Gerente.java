package myyplant2;

    public class Gerente extends Funcionario {
        public Gerente(String nome, Integer idade, Loja loja, Float salarioBase, Float[] salarioRecebido) {
            super(nome, idade, loja, salarioBase, salarioRecebido);
        }
    
        @Override
        public void calcularBonus() {
            System.out.println("Bonus salarial: " + getSalarioBase() * 0.35);
        }
    }
    

