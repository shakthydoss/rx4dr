/* Copyright (C) RxDr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.dao;

import com.rx4dr.service.model.User;

/**
 *
 * @author shakthydoss
 */
public interface IUserDao {
    
    public User add(User user);
    public User getById(int id);
    public User getByEmail(String email);
    public User update(User user);
    
}
