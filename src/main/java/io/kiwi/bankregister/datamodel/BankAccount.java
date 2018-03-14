package io.kiwi.bankregister.datamodel;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class BankAccount extends BaseEntity {

	private static final long serialVersionUID = -4394875336146035119L;
	
	private String name;
	
	@ManyToOne
	private Customer customer;
	
	@OneToMany(mappedBy = "bankAccount", fetch = FetchType.LAZY)
	private Set<BankTransaction> bankTransactions;
	
	private BankAccountType type;
	private Boolean hidden;
	private BigDecimal totalReconciled;
	private BigDecimal totalPending;
	private BigDecimal totalCleared;
	
}
