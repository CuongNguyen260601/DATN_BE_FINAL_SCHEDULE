package com.localbrand.dto.response.statistical;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;


@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SummaryStatusBillDTO2 implements Serializable {

    @Id
    private Integer idStatus;

    private String nameStatus;

    private Long totalBill;

    private Long totalMoney;

}
