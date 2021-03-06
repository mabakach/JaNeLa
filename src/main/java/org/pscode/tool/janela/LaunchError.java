/*******************************************************************************
 * Copyright 2009, 2010 Andrew Thompson.
 * 
 * This file is part of JaNeLa.
 * 
 * JaNeLa is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * JaNeLa is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser Public License
 * along with JaNeLa.  If not, see <http://www.gnu.org/licenses/>.
 ******************************************************************************/
package org.pscode.tool.janela;

public class LaunchError {
    
    public enum ErrorLevel {
        FATAL, ERROR, WARNING, OPTIMIZE;
    }
    
    private final String message;
    private final ErrorLevel level;
    private final Exception exception;

    public LaunchError(String message, Exception e, ErrorLevel level) {
        this.message = message;
        this.exception = e;
        this.level = level;
    }

    public ErrorLevel getLevel() {
        return level;
    }

    public String getMessage() {
        return message;
    }
    
    public Exception getException() {
        return exception;
    }
    
    @Override
    public String toString() {
        return message;
    }
}
