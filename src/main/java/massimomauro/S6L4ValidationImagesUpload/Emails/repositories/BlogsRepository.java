package massimomauro.S6L4ValidationImagesUpload.Emails.repositories;


import massimomauro.S6L4ValidationImagesUpload.Emails.entities.Blogpost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BlogsRepository extends JpaRepository<Blogpost, Integer> {
}
