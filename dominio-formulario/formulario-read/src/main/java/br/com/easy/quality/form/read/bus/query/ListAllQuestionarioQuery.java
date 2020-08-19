/**
 * @author rianmachado@gmail.com
 */
package br.com.easy.quality.form.read.bus.query;
import java.util.List;

import br.com.easy.quality.dto.QuestionarioDTO;
import br.com.easy.quality.form.application.query.Query;

public class ListAllQuestionarioQuery implements Query {

    private List<QuestionarioDTO> result;

    public List<QuestionarioDTO> getResult() {
        return result;
    }

    public void setResult(List<QuestionarioDTO> result) {
        this.result = result;
    }
}
