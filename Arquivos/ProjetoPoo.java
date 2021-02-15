package projetopoo;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class ProjetoPoo {

    public static void main(String[] args) throws Exception {
        Funcionario a = new Funcionario();
        a.setCpf("333");
        a.setMatricula(8);
        a.setNome("mago");
        a.setRg("331231312");
        a.setSalario(8923.99f);
        
        Cliente c = new Cliente();
        c.setCpf("56564");
        
        ClassificaçaoProblema x = new ClassificaçaoProblema();
        x.setCodigo(5);
        
        OrdemServiço od = new OrdemServiço();
        od.setNumero(2);
        od.setDescricaoproblema("minha vida");
        SimpleDateFormat formatData = new SimpleDateFormat("dd-MM-yyyy");
        Date data = (Date) formatData.parse("05-08-2020");
        Date seila = (Date) formatData.parse("12-11-2020");
        od.setDatacadastro(new java.sql.Date(data.getTime()));
        od.setDatasolucao(new java.sql.Date(seila.getTime()));
        od.setDatacancelamento(new java.sql.Date(seila.getTime()));
        od.setMotivocancelamento("Porque quis");
        od.setDescricaoservico("Nao sei");
        od.setFuncionario(a);
        od.setCliente(c);
        od.setClassificaçaoProblema(x);
        
        
        
        //DadosCliente dc = new DadosCliente();
        DadosOrdemServiço df = new DadosOrdemServiço();
        
        
        
        
        
        df.solucionar(od);
        //df.deletar(a);
        //df.editar(a);
        /*ArrayList<Funcionario> listar = df.listar(a);
        for (Funcionario f : listar) {
            System.out.println(f.getNome());
            System.out.println(f.getSalario());
        }*/
        
    }
}
