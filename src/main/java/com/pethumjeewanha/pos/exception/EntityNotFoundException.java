/*
 * Copyright (c) 2021 - present Pethum Jeewantha. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 */

package com.pethumjeewanha.pos.exception;

public class EntityNotFoundException extends RuntimeException {

    public EntityNotFoundException(String message) {
        super(message);
    }
}
