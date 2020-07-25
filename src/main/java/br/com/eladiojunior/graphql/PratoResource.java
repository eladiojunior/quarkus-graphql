package br.com.eladiojunior.graphql;

import br.com.eladiojunior.graphql.entites.Localizacao;
import br.com.eladiojunior.graphql.entites.Prato;
import br.com.eladiojunior.graphql.entites.Restaurante;
import org.eclipse.microprofile.graphql.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@GraphQLApi
public class PratoResource {

    @Query("listarPratos")
    @Description("Query para listar todos os pratos.")
    public List<Prato> listarPratos() {
        List<Prato> pratos = new ArrayList<Prato>();
        pratos.add(new Prato("Lazanha", "Lazanha de queijo", BigDecimal.valueOf(19.99)));
        pratos.add(new Prato("Array", "Array tipico da vila", BigDecimal.valueOf(10.52)));
        return pratos;
    }

    @Query("obterPrato")
    @Description("Query para obter um prato por ID.")
    public Prato obterPrato(@Name("idPrato") Integer idPrato) {
        System.out.println("ID: " + idPrato);
        return new Prato("Lazanha", "Lazanha de queijo", BigDecimal.valueOf(19.99));
    }

    @Name("restaurante")
    public Restaurante obrteRestaurante(@Source Prato prato) {
        return new Restaurante("Restaurante 1", "Eladio Júnior", "1234567897885", new Localizacao(1231D, -1121D));
    }

    /*
        Alterar o conteúdo do com GraphQL
     */
    @Mutation
    @Description("Altera os dados do restaurante.")
    public Restaurante alterarRestaurante(Restaurante restaurante) {
        restaurante.setNome("Alterado");
        return restaurante;
    }

}