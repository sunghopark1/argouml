/* $Id: MultiplicityNotation.java 18636 2010-08-12 08:08:19Z mvw $
 *****************************************************************************
 * Copyright (c) 2009-2010 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    dthompson
 *    mvw
 *****************************************************************************
 *
 * Some portions of this file was previously release using the BSD License:
 */

// Copyright (c) 2007 The Regents of the University of California. All
// Rights Reserved. Permission to use, copy, modify, and distribute this
// software and its documentation without fee, and without a written
// agreement is hereby granted, provided that the above copyright notice
// and this paragraph appear in all copies. This software program and
// documentation are copyrighted by The Regents of the University of
// California. The software program and documentation are supplied "AS
// IS", without any accompanying services from The Regents. The Regents
// does not warrant that the operation of the program will be
// uninterrupted or error-free. The end-user understands that the program
// was developed for research purposes and is advised not to rely
// exclusively on the program for any reason. IN NO EVENT SHALL THE
// UNIVERSITY OF CALIFORNIA BE LIABLE TO ANY PARTY FOR DIRECT, INDIRECT,
// SPECIAL, INCIDENTAL, OR CONSEQUENTIAL DAMAGES, INCLUDING LOST PROFITS,
// ARISING OUT OF THE USE OF THIS SOFTWARE AND ITS DOCUMENTATION, EVEN IF
// THE UNIVERSITY OF CALIFORNIA HAS BEEN ADVISED OF THE POSSIBILITY OF
// SUCH DAMAGE. THE UNIVERSITY OF CALIFORNIA SPECIFICALLY DISCLAIMS ANY
// WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
// MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE. THE SOFTWARE
// PROVIDED HEREUNDER IS ON AN "AS IS" BASIS, AND THE UNIVERSITY OF
// CALIFORNIA HAS NO OBLIGATIONS TO PROVIDE MAINTENANCE, SUPPORT,
// UPDATES, ENHANCEMENTS, OR MODIFICATIONS.

package org.argouml.notation.providers;

import org.argouml.model.Model;
import org.argouml.notation.NotationProvider;

/**
 * This abstract class forms the basis of all Notation providers
 * for the text shown in the Fig that represents a Multiplicity.
 * Subclass this for all languages. <p>
 * 
 * This NotationProvider is a bit special, in that it does not 
 * generate for the given UML element, but for its multiplicity.
 *
 * @author Michiel
 */
public abstract class MultiplicityNotation extends NotationProvider {

    /**
     * The constructor.
     *
     * @param multiplicityOwner the UML element that has a Multiplicity
     */
    public MultiplicityNotation(Object multiplicityOwner) {
        // If this fails, then there is a problem...
        // dthompson 29/12/2008: It seems that the returned value is 
        // irrelevant here, so I assume that the purpose of this call
        // is just to throw an exception in case of a problem.
        /* mvw: Indeed. The intention of the constructor parameter is to prove
         * that there is a valid UML object to bind the notation to. 
         * So, the next statement should fail on a null parameter, 
         * and on anything that is not an object of which 
         * we can retrieve the multiplicity. */
        Model.getFacade().getMultiplicity(multiplicityOwner);
    }

}
