package io.anthonykim.oauth2;

import io.anthonykim.oauth2.entity.User;
import io.anthonykim.oauth2.persistence.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.sql.Timestamp;
import java.util.Collections;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class Oauth2AuthorizationServerApplicationTests {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private PasswordEncoder passwordEncoder;

    //    @Test
    public void encodeTest() {
        System.out.printf("testSecret : %s\n", passwordEncoder.encode("testSecret"));
    }

    //    @Test
    public void insertNewUser() {
        userRepository.save(User.builder()
                .userId("hyuk0628@gmail.com")
                .password(passwordEncoder.encode("1234"))
                .roles(Collections.singletonList("ROLE_USER"))
                .enabled(Boolean.TRUE)
                .removed(Boolean.FALSE)
                .expiresAt(new Timestamp(System.currentTimeMillis() + 3153600000000L))
                .build());
    }

    //    @Test
    public void test() {
        System.out.println(ServletUriComponentsBuilder.fromCurrentContextPath());
    }
}
