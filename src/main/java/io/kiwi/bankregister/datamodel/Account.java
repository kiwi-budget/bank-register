package io.kiwi.bankregister.datamodel;

import java.math.BigDecimal;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
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
public class Account extends BaseEntity {

	private static final long serialVersionUID = -4394875336146035119L;
	@OneToMany(mappedBy="account",fetch=FetchType.LAZY)
	private Set<Transaction> transactions;
	private String name;
	private AccountType type;
	private Boolean hidden;
	private BigDecimal totalReconciled;
	private BigDecimal totalPending;
	private BigDecimal totalCleared;
	
}
