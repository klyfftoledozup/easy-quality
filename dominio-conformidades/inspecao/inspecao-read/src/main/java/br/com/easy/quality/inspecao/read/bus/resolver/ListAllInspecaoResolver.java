/**
 * @author rianmachado@gmail.com
 */
package br.com.easy.quality.inspecao.read.bus.resolver;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import br.com.easy.quality.inspecao.application.service.Resolver;
import br.com.easy.quality.inspecao.dto.InspecaoDTO;
import br.com.easy.quality.inspecao.read.bus.query.ListAllInspecaoQuery;
import br.com.easy.quality.inspecao.read.out.InspecaoReadDataBaseAdapter;

@Component
public class ListAllInspecaoResolver implements Resolver<ListAllInspecaoQuery> {

	@Autowired
	private InspecaoReadDataBaseAdapter inspecaoReadDataBaseAdapter;

	public void resolve(ListAllInspecaoQuery query) {
		List<InspecaoDTO> result = inspecaoReadDataBaseAdapter.getAll().get();
		query.setResult(result);
	}

}
