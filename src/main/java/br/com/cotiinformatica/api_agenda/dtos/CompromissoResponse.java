package br.com.cotiinformatica.api_agenda.dtos;

import br.com.cotiinformatica.api_agenda.entities.Compromisso;
import br.com.cotiinformatica.api_agenda.repositories.CategoriaRepository;
import br.com.cotiinformatica.api_agenda.repositories.CompromissoRepository;
import lombok.Data;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;
import java.util.UUID;




@Data
public class CompromissoResponse{

    private UUID id;
    private String titulo;
    private LocalDateTime dataHora;
    private String prioridade;
    private CategoriaResponse categoria;

    @Autowired
    private CompromissoRepository compromissoRepository;

    @Autowired
    private CategoriaRepository categoriaRepository;

    private ModelMapper modelMapper;

    /*
        Método para realizar o cadastro de um compromisso
     */

    public CompromissoResponse cadastrar(CompromissoRequest request){

        // Consultar a categoria no banco de dados através do ID

        var categoria = categoriaRepository.findById(request.getCategoriaId())
                .orElseThrow(() -> new IllegalArgumentException("Categoria não encontrada."));


        // Copiar os dados do compromisso
        var compromisso = modelMapper.map(request, Compromisso.class);

        compromisso.setCategoria(categoria);
        compromisso.setUsuarioId(UUID.randomUUID());

        // salvar os dados no banco
        compromissoRepository.save(compromisso);

        // Retornar os dados do response
        return modelMapper.map(compromisso, CompromissoResponse.class);

    }


}
