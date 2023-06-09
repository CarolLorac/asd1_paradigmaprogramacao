package projetos.daoCRUD;
import java.util.Scanner;

import projetos.Projeto;

public class DaoCRUD extends Projeto
{
    @Override
    public void Executar() 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n***********************");
        System.out.println("DAO/CRUD\n");

        while (true) 
        {
            System.out.println("Controle de Ordem de Servico");
            System.out.println("1 - Prestador");
            System.out.println("2 - Unidade da Empresa");
            System.out.println("3 - Tipo de Servico");
            System.out.println("4 - Ordem de Servico");
            System.out.println("0 - Sair");
            String opcao = sc.nextLine();

            if (opcao.equals("1")) 
            {
                PrestadorMenu p = new PrestadorMenu();
                p.menu(sc);
            } 
            else if (opcao.equals("2")) 
            {
                UnidadeEmpresaMenu u = new UnidadeEmpresaMenu();
                u.menu(sc);
            }
            else if(opcao.equals("3"))
            {
                TipoServicoMenu t = new TipoServicoMenu();
                t.menu(sc);
            }
            else if(opcao.equals("4"))
            {
                OrdemServicoMenu o = new OrdemServicoMenu();
                o.menu(sc);
            } 
            else if (opcao.equals("0")) 
            {
                break;
            } 
            else 
            {
                System.out.println("Opcao nao conhecida");
            }
        }
        
        System.out.println("Programa encerrado.");
    }

}
