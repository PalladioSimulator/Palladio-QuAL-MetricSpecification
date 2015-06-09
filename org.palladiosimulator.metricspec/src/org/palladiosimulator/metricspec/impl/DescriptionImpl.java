/**
 */
package org.palladiosimulator.metricspec.impl;

import org.eclipse.emf.ecore.EClass;
import org.palladiosimulator.metricspec.Description;
import org.palladiosimulator.metricspec.MetricSpecPackage;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Description</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.metricspec.impl.DescriptionImpl#getName <em>Name</em>}</li>
 * <li>{@link org.palladiosimulator.metricspec.impl.DescriptionImpl#getTextualDescription <em>
 * Textual Description</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class DescriptionImpl extends IdentifierImpl implements Description {

    /**
     * The default value of the '{@link #getName() <em>Name</em>}' attribute. <!-- begin-user-doc
     * --> <!-- end-user-doc -->
     * 
     * @see #getName()
     * @generated
     * @ordered
     */
    protected static final String NAME_EDEFAULT = null;

    /**
     * The default value of the '{@link #getTextualDescription() <em>Textual Description</em>}'
     * attribute. <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @see #getTextualDescription()
     * @generated
     * @ordered
     */
    protected static final String TEXTUAL_DESCRIPTION_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    protected DescriptionImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MetricSpecPackage.Literals.DESCRIPTION;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getName() {
        return (String) this.eDynamicGet(MetricSpecPackage.DESCRIPTION__NAME,
                MetricSpecPackage.Literals.DESCRIPTION__NAME, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setName(final String newName) {
        this.eDynamicSet(MetricSpecPackage.DESCRIPTION__NAME, MetricSpecPackage.Literals.DESCRIPTION__NAME, newName);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String getTextualDescription() {
        return (String) this.eDynamicGet(MetricSpecPackage.DESCRIPTION__TEXTUAL_DESCRIPTION,
                MetricSpecPackage.Literals.DESCRIPTION__TEXTUAL_DESCRIPTION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setTextualDescription(final String newTextualDescription) {
        this.eDynamicSet(MetricSpecPackage.DESCRIPTION__TEXTUAL_DESCRIPTION,
                MetricSpecPackage.Literals.DESCRIPTION__TEXTUAL_DESCRIPTION, newTextualDescription);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MetricSpecPackage.DESCRIPTION__NAME:
            return this.getName();
        case MetricSpecPackage.DESCRIPTION__TEXTUAL_DESCRIPTION:
            return this.getTextualDescription();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case MetricSpecPackage.DESCRIPTION__NAME:
            this.setName((String) newValue);
            return;
        case MetricSpecPackage.DESCRIPTION__TEXTUAL_DESCRIPTION:
            this.setTextualDescription((String) newValue);
            return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void eUnset(final int featureID) {
        switch (featureID) {
        case MetricSpecPackage.DESCRIPTION__NAME:
            this.setName(NAME_EDEFAULT);
            return;
        case MetricSpecPackage.DESCRIPTION__TEXTUAL_DESCRIPTION:
            this.setTextualDescription(TEXTUAL_DESCRIPTION_EDEFAULT);
            return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public boolean eIsSet(final int featureID) {
        switch (featureID) {
        case MetricSpecPackage.DESCRIPTION__NAME:
            return NAME_EDEFAULT == null ? this.getName() != null : !NAME_EDEFAULT.equals(this.getName());
        case MetricSpecPackage.DESCRIPTION__TEXTUAL_DESCRIPTION:
            return TEXTUAL_DESCRIPTION_EDEFAULT == null ? this.getTextualDescription() != null
            : !TEXTUAL_DESCRIPTION_EDEFAULT.equals(this.getTextualDescription());
        }
        return super.eIsSet(featureID);
    }

} // DescriptionImpl
