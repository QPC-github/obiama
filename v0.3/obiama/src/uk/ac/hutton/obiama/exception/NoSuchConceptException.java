/*
 * uk.ac.hutton.obiama.exception: NoSuchConceptException.java
 * 
 * Copyright (C) 2013 The James Hutton Institute
 * 
 * This file is part of obiama-0.3.
 * 
 * obiama-0.3 is free software: you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free
 * Software Foundation, either version 3 of the License, or (at your option) any
 * later version.
 * 
 * obiama-0.3 is distributed in the hope that it will be useful, but WITHOUT ANY
 * WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR
 * A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with obiama-0.3. If not, see <http://www.gnu.org/licenses/>.
 * 
 * Contact information: Gary Polhill, The James Hutton Institute, Craigiebuckler,
 * Aberdeen. AB15 8QH. UK. gary.polhill@hutton.ac.uk
 */
package uk.ac.hutton.obiama.exception;

import java.net.URI;

import uk.ac.hutton.obiama.action.Action;
import uk.ac.hutton.obiama.action.Process;

/**
 * NoSuchConceptException
 * 
 * Exception caused by a concept not appearing in the ontology that is expected
 * to be there.
 * 
 * @author Gary Polhill
 */
public class NoSuchConceptException extends IntegrationInconsistencyException {
  /**
   * Version ID for serialisation
   */
  private static final long serialVersionUID = 7160455960907148032L;

  /**
   * Concept expected to be in the ontology
   */
  URI concept;

  /**
   * @param action Action causing the exception
   * @param concept Concept expected to be in the ontology
   */
  public NoSuchConceptException(Process action, URI concept) {
    super(action);
    this.concept = concept;
  }

  /**
   * <!-- getErrorMessage -->
   * 
   * @see uk.ac.hutton.obiama.exception.IntegrationInconsistencyException#getErrorMessage()
   * @return
   */
  protected String getErrorMessage() {
    return "Concept " + concept + " does not appear in the model structure ontology, and is expected to by the action";
  }

}
