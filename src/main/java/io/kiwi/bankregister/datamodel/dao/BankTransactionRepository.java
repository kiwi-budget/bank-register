package io.kiwi.bankregister.datamodel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.kiwi.bankregister.datamodel.BankAccount;
import io.kiwi.bankregister.datamodel.BankTransaction;

@Repository
public interface BankTransactionRepository extends JpaRepository<BankTransaction, Long> {

	public BankTransaction findByBankAccount(BankAccount bankAccount);
}
