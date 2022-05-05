package com.sha.springbootproductseller.service;

import com.sha.springbootproductseller.model.User;

public interface AuthenticationService
{

    User signInReturnJWT(User signInRequest);
}
