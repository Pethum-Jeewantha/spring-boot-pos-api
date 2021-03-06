/*
 * Copyright (c) 2021 - present Pethum Jeewantha. All rights reserved.
 *  Licensed under the MIT License. See LICENSE.txt in the project root for license information.
 */

package com.pethumjeewanha.pos.dao.custom.impl;

import com.pethumjeewanha.pos.dao.CrudDAOImpl;
import com.pethumjeewanha.pos.dao.custom.ItemDAO;
import com.pethumjeewanha.pos.entity.Item;
import org.springframework.stereotype.Component;

@Component
public class ItemDAOImpl extends CrudDAOImpl<Item, String> implements ItemDAO {

    @Override
    public String getLastItemCode() {
        em.flush();
        return (String) em.createNativeQuery("SELECT code FROM item ORDER BY code DESC LIMIT 1").getSingleResult();
    }
}
