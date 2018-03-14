package io.kiwi.bankregister.datamodel;

import java.math.BigDecimal;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import io.kiwi.bankregister.datamodel.dao.BankAccountRepository;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class BankAccountTest {

	@Inject
	private TestEntityManager entityManager;

	@Inject
	private BankAccountRepository bankAccountRepository;

	@Test
	public void whenFindByName_ThenReturnAccount() {
		BankAccount account = BankAccount.builder().name("Checking").hidden(false).totalCleared(BigDecimal.ZERO)
				.totalPending(BigDecimal.ZERO).totalReconciled(BigDecimal.ZERO).build();

		entityManager.persist(account);
		entityManager.flush();

		BankAccount found = bankAccountRepository.findByName(account.getName());

		assertThat(found).isEqualTo(account);
	}
}
