package com.restapi.expensetrackerapi.services;
import com.restapi.expensetrackerapi.domain.User;
import com.restapi.expensetrackerapi.exceptions.EtAuthException;

public interface UserService {
    User validateUser(String email, String password) throws EtAuthException;

    User registerUser(String firstName, String lastName, String email, String password) throws EtAuthException;
}
