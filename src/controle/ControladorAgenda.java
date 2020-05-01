package controle;

import modelo.Contato;
import modelo.dao.ContatoDao;

import java.util.ArrayList;

public class ControladorAgenda {

    ContatoDao dao;

    public ControladorAgenda(){
        dao = new ContatoDao();
    }

    public boolean cadastrarContato(String nome, String telefone, String email){

        Contato contato = new Contato();

        contato.setNome(nome);
        contato.setTelefone(telefone);
        contato.setEmail(email);

        return dao.adicionarContato(contato);
    }
    public boolean removerContato(Contato contato){
        return dao.removeContato(contato.getId());
    }
    public boolean atualizarContato(int id, String nome, String telefone, String email){
        Contato contatoAlterado = new Contato();
        contatoAlterado.setId(id);
        contatoAlterado.setNome(nome);
        contatoAlterado.setTelefone(telefone);
        contatoAlterado.setEmail(email);

        return dao.atualizaContato(contatoAlterado);
    }
    public ArrayList<Contato> obterContatos() {

        ArrayList<Contato> listaContatos = dao.listarContatos();

        return listaContatos;
    }
    public Contato acharContato(int id){
        return dao.buscarContato(id);
    }

    public void fecharConexao() {
        dao.encerrarConexao();
    }
}
