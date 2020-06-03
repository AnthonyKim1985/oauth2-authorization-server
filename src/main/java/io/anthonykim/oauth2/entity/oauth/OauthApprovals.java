package io.anthonykim.oauth2.entity.oauth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "oauth_approvals")
public class OauthApprovals {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idx;
    @Column(name = "userid", nullable = false, length = 64)
    private String userId;
    @Column(name = "clientid", nullable = false, length = 64)
    private String clientId;
    @Column(name = "scope", nullable = false, length = 128)
    private String scope;
    @Column(name = "status", length = 16)
    private String status;
    @Column(name = "expiresat", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp expiresAt;
    @Column(name = "lastmodifiedat", nullable = false, columnDefinition = "TIMESTAMP DEFAULT CURRENT_TIMESTAMP")
    private Timestamp lastModifiedAt;
}
