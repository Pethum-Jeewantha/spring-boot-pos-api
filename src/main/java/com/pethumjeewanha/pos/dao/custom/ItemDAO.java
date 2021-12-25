/*
 * Copyright (c) 2021 - present Pethum Jeewantha. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.pethumjeewanha.pos.dao.custom;

import com.pethumjeewanha.pos.dao.CrudDAO;
import com.pethumjeewanha.pos.entity.Item;

public interface ItemDAO extends CrudDAO<Item, String> {

    String getLastItemCode();

}
