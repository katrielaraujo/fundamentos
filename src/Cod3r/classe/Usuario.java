package Cod3r.classe;

public class Usuario {
    String nome;
    String email;

    public boolean equals(Object obj){
        if(obj instanceof Usuario){
            Usuario outro = (Usuario) obj;

            boolean nomeIgual = outro.nome.equals(this.nome);
            boolean emailIguais = outro.email.equals(this.email);

            return nomeIgual && emailIguais;
        }else{
            return false;
        }
    }

    //O hascode será abordado em outra aula!

    public int hashCode(){
        return this.nome.length();
    }
}
