package io.kiwi.bankregister.datamodel;

import java.math.BigDecimal;

import javax.persistence.Entity;
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
	
	private String name;
	private AccountType type;
	private Boolean hidden;
	private BigDecimal totalReconciled;
	private BigDecimal totalPending;
	private BigDecimal totalCleared;
	
}
