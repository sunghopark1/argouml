/* $Id: PropPanelSimpleState.java 18590 2010-07-29 00:30:06Z bobtarling $
 *****************************************************************************
 * Copyright (c) 2009 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    tfmorris
 *****************************************************************************
 *
 * Some portions of this file was previously release using the BSD License:
 */

// Copyright (c) 1996-2007 The Regents of the University of California. All
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

package org.argouml.uml.ui.behavior.state_machines;

import javax.swing.ImageIcon;

/**
 * The properties panel for a State.
 *
 * @author 5heyden
 * @deprecated in 0.31.2 by Bob Tarling  This is replaced by the XML property
 * panels module
 */
@Deprecated
public class PropPanelSimpleState extends AbstractPropPanelState {

    /**
     * The serial version.
     */
    private static final long serialVersionUID = 7072535148338954868L;

    /**
     * Construct a new default property panel for a Simple State.
     */
    public PropPanelSimpleState() {
        this("label.simple.state", lookupIcon("SimpleState"));
    }

    
    /**
     * Construct a new property panel for a Simple State with the given
     * attributes.
     * 
     * @param name the name of the properties panel, shown at the top
     * @param icon the icon shown at the top
     */
    private PropPanelSimpleState(String name, ImageIcon icon) {
        super(name, icon);

        addField("label.name", getNameTextField());
        addField("label.container", getContainerScroll());
        addField("label.entry", getEntryScroll());
        addField("label.exit", getExitScroll());
        addField("label.do-activity", getDoScroll());
        addField("label.deferrable", getDeferrableEventsScroll());

        addSeparator();

        addField("label.incoming", getIncomingScroll());
        addField("label.outgoing", getOutgoingScroll());
        addField("label.internal-transitions", getInternalTransitionsScroll());

    }

}

