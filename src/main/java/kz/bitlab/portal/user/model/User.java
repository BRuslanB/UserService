package kz.bitlab.portal.user.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "t_user")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Size(max = 50)
    @Column(name = "email", nullable = false, unique = true)
    private String email;

    @Size(max = 50)
    @Column(name = "login", nullable = false, unique = true)
    private String login;

    @Size(max = 255)
    @Column(name = "full_name", nullable = false)
    private String fullName;
}
