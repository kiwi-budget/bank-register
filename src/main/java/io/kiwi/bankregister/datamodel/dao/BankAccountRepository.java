package io.kiwi.bankregister.datamodel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.kiwi.bankregister.datamodel.BankAccount;

@Repository
public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {

	public BankAccount findByName(String name);
}
