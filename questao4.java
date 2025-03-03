import java.util.LinkedHashMap;
import java.util.Map;

/*
  Utilizei a estrutura de um map para mapear string e valores double. Com funções internas foi mais simples realizar a soma do faturamento.Após isso,
    utilizei um for each para realizar o calculo de porcentagem relevante a cada estado (com notação de ponto flutuante em 2 casas).
*\

public class Faturamento {
    public static void main(String[] args) {
        
        Map<String, Double> faturamentoEstados = new LinkedHashMap<>();
        faturamentoEstados.put("SP", 67836.43);
        faturamentoEstados.put("RJ", 36678.66);
        faturamentoEstados.put("MG", 29229.88);
        faturamentoEstados.put("ES", 27165.48);
        faturamentoEstados.put("Outros", 19849.53);
        
        
        double faturamentoTotal = faturamentoEstados.values().stream().mapToDouble(Double::doubleValue).sum();
        
        
        System.out.println("Percentual de representação de cada estado:");
        for (Map.Entry<String, Double> entry : faturamentoEstados.entrySet()) {
            double percentual = (entry.getValue() / faturamentoTotal) * 100;
            System.out.printf("%s: %.2f%%\n", entry.getKey(), percentual);
        }
    }
}
