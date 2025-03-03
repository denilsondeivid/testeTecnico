import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.Type;
import java.util.List;

/*
  Inicialmente pensei em fazer o algoritmo utilizando o selection sort, porém isso só iria aumentar o custo de execução
    já que os dados guardados não necessitam  estar em ordem, apenas guardei os valores independente da ordem, assim, salvando apenas o maior e
    menor valor inseridos.
*\

public class FaturamentoDistribuidora {
    public static void main(String[] args) {
        try {
            Gson gson = new Gson();
            Type listType = new TypeToken<List<Double>>() {}.getType();
            List<Double> faturamento = gson.fromJson(new FileReader("faturamento.json"), listType);

            faturamento = faturamento.stream().filter(valor -> valor > 0).toList();
            
            if (faturamento.isEmpty()) {
                System.out.println("Nenhum faturamento válido disponível.");
                return;
            }
            
            double menorValor = Double.MAX_VALUE;
            double maiorValor = Double.MIN_VALUE;
            double soma = 0;
            int count = 0;

            for (double valor : faturamento) {
                if (valor < menorValor) {
                    menorValor = valor;
                }
                if (valor > maiorValor) {
                    maiorValor = valor;
                }
                soma += valor;
                count++;
            }
            
            double media = soma / count;
            long diasAcimaDaMedia = faturamento.stream().filter(valor -> valor > media).count();

            System.out.println("Menor faturamento: " + menorValor);
            System.out.println("Maior faturamento: " + maiorValor);
            System.out.println("Dias com faturamento acima da média: " + diasAcimaDaMedia);
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo JSON: " + e.getMessage());
        }
    }
}
