import java.io.IOException;
import java.util.Set;

/**
 * Interface que define o comportamento esperado de um Parser.
 * Um Parser deve ser capaz de processar um arquivo contendo o log da 
 * tentativa de execu��o de uma tarefa do usu�rio na grade e extrair
 * dele o conjunto de servi�os de grade envolvidos.
 * @author Alexandre N�brega Duarte - alexandrend@gmail.com
 */
 public interface Parser {

	 /** 
	  * @return Um conjunto contendo todos os servi�os grade envolvidos 
	  * na tentativa de execu��o da tarefa do usu�rio de acordo com o
	  * arquivo de log da execu��o
	  * @throws FileNotFoundException Se o arquivo de log n�o puder ser 
	  * acessado. 
	  */
	 public Set<GridService> getServices() throws IOException;
	
}
