/**
 * @author rianmachado@gmail.com
 */
package br.com.easy.quality.inspecao.read.bus.resolver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.easy.quality.inspecao.application.service.Resolver;
import br.com.easy.quality.inspecao.dto.InspecaoDTO;
import br.com.easy.quality.inspecao.read.bus.query.IdInspecaoQuery;
import br.com.easy.quality.inspecao.read.out.InspecaoReadDataBaseAdapter;

@Component
public class IdInspecaoResolver implements Resolver<IdInspecaoQuery> {

	@Autowired
	private InspecaoReadDataBaseAdapter inspecaoReadDataBaseAdapter;

	public void resolve(IdInspecaoQuery query) {
		InspecaoDTO result = inspecaoReadDataBaseAdapter.getById(query.getId()).get();
		query.setResult(result);
	}
}
