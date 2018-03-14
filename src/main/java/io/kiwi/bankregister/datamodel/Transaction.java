package io.kiwi.bankregister.datamodel;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Entity
@Table
@Data
@EqualsAndHashCode(callSuper = true)
@Builder
public class Transaction extends BaseEntity {
	
	private static final long serialVersionUID = -1949263982644833054L;
	@ManyToOne
	private Account account;
	private Long userId;
	private BigDecimal amount;
	private LocalDate date;
	private TransactionStatus status;
	private Integer categoryId;
	
}
