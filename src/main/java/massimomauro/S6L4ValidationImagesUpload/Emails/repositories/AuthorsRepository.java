package massimomauro.S6L4ValidationImagesUpload.Emails.repositories;


import massimomauro.S6L4ValidationImagesUpload.Emails.entities.Author;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface AuthorsRepository extends JpaRepository<Author, Integer> {
    Optional<Author> findByEmail(String email);
}
