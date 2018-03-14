package io.kiwi.bankregister.datamodel;

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
public class Customer extends BaseEntity {
	
	private static final long serialVersionUID = 240059355799372846L;

	
}
