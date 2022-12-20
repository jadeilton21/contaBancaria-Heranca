public class SenhaBacancaria extends Conta{


    private int senha;

    public SenhaBacancaria(int numero, int agencia) {
        super(numero, agencia);
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }




    public boolean autenticar(int senha){
        if(getSenha() == senha){
            return true;
        }else{
            return false;
        }


    }
}
