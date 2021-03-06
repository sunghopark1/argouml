/* $Id: FigLink2.java 17882 2010-01-12 21:09:56Z linus $
 *****************************************************************************
 * Copyright (c) 2009 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    bobtarling
 *****************************************************************************
 *
 * Some portions of this file was previously release using the BSD License:
 */

// Copyright (c) 1996-2009 The Regents of the University of California. All
// Rights Reserved. Permission to use, copy, modify, and distribute this
// software and its documentation without fee, and without a written
// agreement is hereby granted, provided that the above copyright notice
// and this paragraph appear in all copies.  This software program and
// documentation are copyrighted by The Regents of the University of
// California. The software program and documentation are supplied "AS
// IS", without any accompanying services from The Regents. The Regents
// does not warrant that the operation of the program will be
// uninterrupted or error-free. The end-user understands that the program
// was developed for research purposes and is advised not to rely
// exclusively on the program for any reason.  IN NO EVENT SHALL THE
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

package org.argouml.diagram.uml2;

import org.argouml.uml.diagram.DiagramSettings;
import org.argouml.uml.diagram.ui.FigEdgeModelElement;

/**
 * Class to display graphics for a UML Link in a diagram. <p>
 * 
 * The underlined association name is shown next to the middle of the path.
 * 
 * TODO: Show more notation as described in the standard:
 * "A rolename may be shown at each end of the link. An association 
 * name may be shown near the path. If present, it is underlined
 * to indicate an instance. Links do not have instance names, 
 * they take their identity from the instances that they relate.
 * Multiplicity is not shown for links because they are instances. 
 * Other association adornments (aggregation, composition, 
 * navigation) may be shown on the link ends."
 */
class FigLink2 extends FigEdgeModelElement {

    /**
     * Create a Fig representing a Link
     * 
     * @param element owning UML element
     * @param settings render settings
     */
    public FigLink2(Object element, DiagramSettings settings) {
        super(element, settings);
    }
}
