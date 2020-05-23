package com.sonia.login.teste.service;

import com.sonia.login.model.User;
import com.sonia.login.repository.RoleRepository;
import com.sonia.login.repository.UserRepository;
import com.sonia.login.service.UserService;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import static org.junit.Assert.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.MockitoAnnotations.initMocks;

public class UserServiceTest {

    @Mock
    private UserRepository mockUserRepository;
    @Mock
    private RoleRepository mockRoleRepository;
    @Mock
    private BCryptPasswordEncoder mockBCryptPasswordEncoder;

    private UserService userServiceUnderTest;
    private User user;

    @Before
    public void setUp() {
        initMocks(this);
        userServiceUnderTest = new UserService(mockUserRepository,
                                               mockRoleRepository,
                                               mockBCryptPasswordEncoder);
        
      


        Mockito.when(mockUserRepository.save(any()))
                .thenReturn(user);
        Mockito.when(mockUserRepository.findByUserName(anyString()))
                .thenReturn(user);
    }

    @Test
    public void testFindUserByUserName() {
        // Setup
        final String user = "Sakur!123";

        // Run the test
        final User result = userServiceUnderTest.findUserByUserName(user);

        // Verify the results
        assertEquals(user, result.getUserName());
    }


}


