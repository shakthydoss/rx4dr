/* Copyright (C) Rx4Dr, Inc - All Rights Reserved
 * Unauthorized copying of this file, via any medium is strictly prohibited
 * Proprietary and confidential
 * Written by shakthydoss <shakthydoss@gmail.com>, 2014
 */
package com.rx4dr.service.bo;

import com.rx4dr.service.model.Dr;

/**
 *
 * @author shakthydoss
 */
public interface DrBo {
    public Dr add(Dr dr);
    public Dr getById(int id);
    public Dr getByEmail(String email);
    public Dr update(Dr dr);

}
