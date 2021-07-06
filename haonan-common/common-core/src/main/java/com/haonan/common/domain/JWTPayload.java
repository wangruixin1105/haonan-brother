package com.haonan.common.domain;

import lombok.Data;

@Data
public class JWTPayload {

    private String jti;

    private Long exp;
}
