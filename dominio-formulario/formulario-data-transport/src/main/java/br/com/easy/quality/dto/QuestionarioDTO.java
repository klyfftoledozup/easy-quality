/**
 * @author rianmachado@gmail.com
 */
package br.com.easy.quality.dto;

import java.time.LocalDateTime;
import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class QuestionarioDTO {
	private String id;
	private String titulo;
	private Boolean status;
	private String nomeColaborador;
	private List<PerguntaDTO> perguntas;
	private LocalDateTime dataCriacao;
	private LocalDateTime dataEdicao;
}
