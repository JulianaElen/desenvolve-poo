import java.util.List;

class Usuario extends Pessoa{
    protected int idade;
    protected List<Emprestimo> emprestimos;

    public int getIdade(){
        return this.idade;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public List<Emprestimo> getEmprestimos(){
        return this.emprestimos;
    }

    public void setEmprestimos(List<Emprestimo> emprestimos){
        this.emprestimos = emprestimos;
    }

}