package org.tech.dataApi;

import java.util.Optional;

public interface UserService {

	Optional<String> findEmailById(Long id);
}
