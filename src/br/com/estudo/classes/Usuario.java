package br.com.estudo.classes;


public class Usuario {
    //criar atributos a classe usuário. Este atributos são, também
    //chamados de propriedades ou caracteristicas

    public String nomeUsuario;

    public String senha;

    public String email;

    public String telefone;

    public String nivelAcesso;
    //Vamos criar 3 métodos para os usuários

    public String cadastrar(){
        return "O usuário " +nomeUsuario+ " foi cadastrado";
    }
    String atualizar(String tel, String em,String sh) {
        telefone = tel;
        email = em;
        senha = sh;
        return "Dados atualizados!";
    }
    public String logar(String nome_usuario, String senha_usuario){
        String rs = "";

        if (nomeUsuario == nome_usuario && senha==senha_usuario){
            rs = "Você está logado";
        }
        else{
            rs = "Nome de usuário ou senha incorretos";
        }
        return rs;
    }
}

