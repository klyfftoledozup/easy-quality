/**
 * @author rianmachado@gmail.com
 */
package br.com.easy.quality.inspecao.application.service;

import br.com.easy.quality.inspecao.adapter.event.query.Query;

public interface Resolver<T extends Query> {

    void resolve(T query);
}
