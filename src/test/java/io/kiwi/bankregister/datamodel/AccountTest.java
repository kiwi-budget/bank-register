package io.kiwi.bankregister.datamodel;

import static org.junit.Assert.assertThat;

import java.math.BigDecimal;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

import io.kiwi.bankregister.datamodel.dao.AccountRepository;

import static org.assertj.core.api.Assertions.*;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AccountTest {

	@Inject
	private TestEntityManager entityManager;

	@Inject
	private AccountRepository accountRepository;

	@Test
	public void whenFindByName_ThenReturnAccount() {
		Account account = Account.builder().name("Checking").hidden(false).totalCleared(BigDecimal.ZERO)
				.totalPending(BigDecimal.ZERO).totalReconciled(BigDecimal.ZERO).build();

		entityManager.persist(account);
		entityManager.flush();

		Account found = accountRepository.findByName(account.getName());

		assertThat(found).isEqualTo(account);
	}
}
