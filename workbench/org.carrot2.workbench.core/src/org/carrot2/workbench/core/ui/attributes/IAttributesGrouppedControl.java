package org.carrot2.workbench.core.ui.attributes;

import java.util.List;

import org.carrot2.util.attribute.BindableDescriptor;
import org.carrot2.workbench.editors.AttributeChangeEvent;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;

/**
 * Implementing classes create grouping control, that {@link AttributesPage} can be put
 * on.
 * <p>
 * Group has to fire {@link AttributeChangeEvent}s, when value of a attribute is changed
 * in {@link AttributesPage}.
 * </p>
 * 
 * @see BindableDescriptor#group(org.carrot2.util.attribute.BindableDescriptor.GroupingMethod)
 */
public interface IAttributesGrouppedControl
{
    /**
     * Creates control, that will store one group only.
     * <p>
     * Each group should be places on a main control.
     * </p>
     * 
     * @param parent the parent control
     * @param label group label
     * @param attributes page, that displays editors for attributes in the group. Page was
     *            created using mainControl as a parent;
     * @see BindableDescriptor#attributeGroups
     */
    void createGroup(Object label, AttributesPage attributes);

    /**
     * Creates one main control, that all the groups will be placed on.
     * 
     * @param parent the parent control, which should be used as the parent for all
     *            attribute pages
     * 
     */
    Composite createMainControl(Composite parent);

    /**
     * @return root control of a groupped control
     */
    Control getControl();

    List<AttributesPage> getPages();

    void dispose();

}
