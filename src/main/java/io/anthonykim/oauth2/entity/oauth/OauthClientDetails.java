package io.anthonykim.oauth2.entity.oauth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "oauth_client_details")
public class OauthClientDetails {
    @Id
    @Column(unique = true, nullable = false, length = 64)
    private String clientId;
    @Column(nullable = false, length = 128)
    private String clientSecret;
    @Column(length = 128)
    private String resourceIds;
    @Column(length = 128)
    private String scope;
    @Column(length = 64)
    private String authorizedGrantTypes;
    @Column(length = 128)
    private String webServerRedirectUri;
    @Column(length = 128)
    private String authorities;
    private Integer accessTokenValidity;
    private Integer refreshTokenValidity;
    @Column(columnDefinition = "TEXT")
    private String additionalInformation;
    @Column(length = 32)
    private String autoapprove;
}
