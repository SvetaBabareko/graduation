package org.babareko.graduation.service;

import org.babareko.graduation.AuthorizedUser;
import org.babareko.graduation.model.User;
import org.babareko.graduation.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

import static org.babareko.graduation.util.ValidationUtil.checkNotFoundWithId;

@Service
@Scope(proxyMode = ScopedProxyMode.TARGET_CLASS)
public class UserService implements UserDetailsService {


    private final UserRepository repository;

   // private final PasswordEncoder passwordEncoder;
    //  private  UserRepository repository;

    @Autowired
    public UserService(UserRepository repository) {
        this.repository = repository;
    }

  // @CacheEvict(value = "users", allEntries = true)
  //  public User create(User user) {
   //     Assert.notNull(user, "user must not be null");
   //     return repository.save(user);
   // }

   // @CacheEvict(value = "users", allEntries = true)
    public void delete(int id) {
        checkNotFoundWithId(repository.deleteById(id), id);
    }


    public User get(int id) {
        return checkNotFoundWithId(repository.getById(id), id);
    }

   // @Cacheable("users")
    public List<User> getAll() {
        return repository.getAll();
    }

  //  @CacheEvict(value = "users", allEntries = true)
  //  public void update(User user) {
  //      Assert.notNull(user, "user must not be null");
   //     checkNotFoundWithId(repository.save(user), user.id());
   // }

 //   public User getWithVotes(int id) {
  ////      return checkNotFoundWithId(repository.getWithVotes(id), id);
 //   }

    @Override
    public AuthorizedUser loadUserByUsername(String name) throws UsernameNotFoundException {
        User user = repository.getByName(name);
        if (user == null) {
            throw new UsernameNotFoundException("User " + name + " is not found");
        }
        return new AuthorizedUser(user);
    }
}
