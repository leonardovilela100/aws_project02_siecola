package br.com.siecola.aws_project02_siecola.repository;

import br.com.siecola.aws_project02_siecola.config.entity.ProductEventLog;
import br.com.siecola.aws_project02_siecola.model.ProductEventKey;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

@EnableScan
public interface ProductEventLogRepository extends CrudRepository<ProductEventLog, ProductEventKey> {

    List<ProductEventLog> findAllByPk(String code);

    List<ProductEventLog> findAllByPkAndStartsWith(String code, String eventType);

}
