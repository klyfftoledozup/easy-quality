package br.com.easy.quality.inspecao.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InspecaoDTO {

	private String GUID;
	private String titulo;
	private Boolean status;
	private String nomeColaboradorEntrevistador;
	private String nomeColaboradorEntrevistado;
	private QuestionarioDTO questionarioModelo;
	private String dataDeExpiracao;
	private String dataCriacao;
	private String dataEdicao;

}
