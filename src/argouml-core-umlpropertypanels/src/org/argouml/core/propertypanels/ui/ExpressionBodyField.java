/* $Id: ExpressionBodyField.java 18924 2010-12-18 12:19:08Z bobtarling $
 *******************************************************************************
 * Copyright (c) 2009 Contributors - see below
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    Bob Tarling
 *******************************************************************************
 */

// $Id: ExpressionBodyField.java 18924 2010-12-18 12:19:08Z bobtarling $
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

package org.argouml.core.propertypanels.ui;
import javax.swing.JTextArea;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import org.apache.log4j.Logger;
import org.argouml.i18n.Translator;
import org.argouml.ui.LookAndFeelMgr;

/**
 * This text field shows the body of a UML expression.
 *
 */
class ExpressionBodyField extends JTextArea
    implements DocumentListener {

    /**
     * Logger.
     */
    private static final Logger LOG =
        Logger.getLogger(ExpressionBodyField.class);

    private ExpressionModel model;

    /**
     * The constructor.
     *
     * @param expressionModel
     *            Expression model, should be shared between Language and Body
     *            fields
     */
    public ExpressionBodyField(ExpressionModel expressionModel) {
        model = expressionModel;
        getDocument().addDocumentListener(this);
        setToolTipText(Translator.localize("label.body.tooltip"));
        setFont(LookAndFeelMgr.getInstance().getStandardFont());
        setRows(2); // make it stretch vertically

        String oldText = getText();
        String newText = model.getBody();

        if (oldText == null || newText == null || !oldText.equals(newText)) {
            if (oldText != newText) {
                setText(newText);
            }
        }
    }

    /*
     * @see javax.swing.event.DocumentListener#changedUpdate(javax.swing.event.DocumentEvent)
     */
    public void changedUpdate(final DocumentEvent p1) {
        model.setBody(getText());
    }

    /*
     * @see javax.swing.event.DocumentListener#removeUpdate(javax.swing.event.DocumentEvent)
     */
    public void removeUpdate(final DocumentEvent p1) {
        model.setBody(getText());
    }

    /*
     * @see javax.swing.event.DocumentListener#insertUpdate(javax.swing.event.DocumentEvent)
     */
    public void insertUpdate(final DocumentEvent p1) {
        model.setBody(getText());
    }
}
