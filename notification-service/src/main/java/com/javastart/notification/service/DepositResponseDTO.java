package com.javastart.notification.service;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Getter
@Setter
public class DepositResponseDTO {

    private BigDecimal amount;

    private String email;

}
