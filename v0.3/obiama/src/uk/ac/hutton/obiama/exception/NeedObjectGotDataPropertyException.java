/* uk.ac.hutton.obiama.exception: NeedObjectGotDataPropertyException.java
 *
 * Copyright (C) 2013 The James Hutton Institute
 *
 * This file is part of obiama-0.3.
 *
 * obiama-0.3 is free software: you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation, either version 3 of 
 * the License, or (at your option) any later version.
 *
 * obiama-0.3 is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public
 * License along with obiama-0.3. If not, see
 * <http://www.gnu.org/licenses/>.
 *
 * Contact information:
 *   Gary Polhill
 *   The James Hutton Institute, Craigiebuckler, Aberdeen. AB15 8QH. UK.
 *   gary.polhill@hutton.ac.uk
 */
package uk.ac.hutton.obiama.exception;

import java.net.URI;

import uk.ac.hutton.obiama.action.Action;
import uk.ac.hutton.obiama.action.Process;

/**
 * NeedObjectGotDataPropertyException
 *
 * 
 *
 * @author Gary Polhill
 */
public class NeedObjectGotDataPropertyException extends IntegrationInconsistencyException {

  /**
   * Version number for serialisation
   */
  private static final long serialVersionUID = -261879748807129896L;
  
  /**
   * URI of the property causing the exception
   */
  URI property;
  
  /**
   * Constructor
   * 
   * @param process The action causing the exception
   * @param property The property expected to be an object property
   */
  public NeedObjectGotDataPropertyException(Process process, URI property) {
    super(process);
    this.property = property;
  }

  /**
   * <!-- getErrorMessage -->
   *
   * @see uk.ac.hutton.obiama.exception.IntegrationInconsistencyException#getErrorMessage()
   * @return
   */
  protected String getErrorMessage() {
    return "Data property " + property + " expected by action to be an object property";
  }

}
