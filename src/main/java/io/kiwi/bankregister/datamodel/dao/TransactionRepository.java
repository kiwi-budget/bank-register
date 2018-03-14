package io.kiwi.bankregister.datamodel.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.kiwi.bankregister.datamodel.Account;
import io.kiwi.bankregister.datamodel.Transaction;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	public Transaction findByAccount(Account account);
}
