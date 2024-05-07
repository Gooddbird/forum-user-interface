package com.ikerli.forum.user;

import com.ikerli.forum.user.dto.AuthenticateRequest;
import com.ikerli.forum.user.dto.AuthenticateResponse;
import com.ikerli.forum.user.dto.RegisterRequest;
import com.ikerli.forum.user.dto.RegisterResponse;

public interface UserService {

    /**
     * 注册用户
     * @param request qq
     * @return
     */
    RegisterResponse register(RegisterRequest request);

    /**
     * 用户鉴权
     * @param request
     * @return
     */
    AuthenticateResponse authenticate(AuthenticateRequest request);


}
