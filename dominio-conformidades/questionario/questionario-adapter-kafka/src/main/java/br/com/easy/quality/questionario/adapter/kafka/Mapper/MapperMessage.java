/**
 * @author rianmachado@gmail.com
 */
package br.com.easy.quality.questionario.adapter.kafka.Mapper;

import org.springframework.stereotype.Component;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;

import br.com.easy.quality.dto.QuestionarioDTO;

@Component
public class MapperMessage {

	// TODO: REVER TRATATIVA NESSE MAP(TRATAMENTO DE ERRO)
	public JsonNode mapToJson(String message) {
		ObjectMapper mapper = new ObjectMapper();
		try {
			return mapper.readTree(message);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
		}
		return null;
	}

	// TODO: REVER TRATATIVA NESSE MAP(TRATAMENTO DE ERRO)
	public JsonNode updateJSON(final JsonNode body, final JsonNode questionario) {
		((ObjectNode) body).put("questionarioModelo", questionario);
		return body;

	}

	// TODO: REVER TRATATIVA NESSE MAP(TRATAMENTO DE ERRO)
	public JsonNode mapToJSON(final QuestionarioDTO questionarioDTO) {
		ObjectMapper mapper = new ObjectMapper();
		JsonNode json = mapper.valueToTree(questionarioDTO);
		return json;
	}

}