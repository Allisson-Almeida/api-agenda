package br.com.cotiinformatica.api_agenda;

import br.com.cotiinformatica.api_agenda.dtos.CategoriaResponse;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.test.web.servlet.MockMvc;
import tools.jackson.core.type.TypeReference;
import tools.jackson.databind.ObjectMapper;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // Para definir a ordem em que os testes será executado
class ApiAgendaApplicationTests {

    // Injeção de depencia
    /*
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper mapper;

	@Test
    @Order(1)
	void consultarCategoriasTest()throws Exception {
        // Fazendo uma requisição HTTP GET

        var result = mockMvc.perform(get("/api/v1/categorias"))
                .andExpect(status().isOk()) // Aguardando resposta de Sucesso
                .andReturn(); // Retornando o Json de resposta

        var json = result.getResponse().getContentAsString();

        var response = mapper.readValue(json, new TypeReference<List<CategoriaResponse>>() {});

        // Verifica se a lista não veio nula (Vazia)
        assertNotNull(response);

        // Verifica se a lista tem pelo menos 1 objeto
        assertTrue(response.size() >0);


    }

    @Test
    @Order(2)
    void cadastrarCompromissoTest() {
        fail("Não Implementado");
    }

    @Test
    @Order(3)
    void atualizarCompromissoTest() {
        fail("Não Implementado");
    }

    @Test
    @Order(4)
    void excluirCompromissoTest() {
        fail("Não Implementado");
    }

    @Test
    @Order(5)
    void consultarCompromissoTest() {
        fail("Não Implementado");
    }
    */
}
