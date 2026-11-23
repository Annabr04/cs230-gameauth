package com.gamingroom.gameauth.auth;

import io.dropwizard.auth.Authorizer;

/**
 * Authorizes access based on the roles assigned to the authenticated GameUser.
 */
public class GameAuthorizer implements Authorizer<GameUser> 
{
    @Override
    public boolean authorize(GameUser user, String role) {
    	// Grant access if the user has the required role
        return user.getRoles() != null && user.getRoles().contains(role);
    }
}
