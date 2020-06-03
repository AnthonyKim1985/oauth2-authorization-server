package io.anthonykim.oauth2.constant;

import lombok.Getter;

@Getter
public enum Roles {
    USER, // GRANT TYPE: authorization_code,refresh_token
    T_RISE_UP_DEVELOPER, // GRANT TYPE: client_credentials
    THIRD_PARTY_DEVELOPER, // GRANT TYPE: client_credentials
}
