/**
 */
package org.palladiosimulator.metricspec.impl;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.palladiosimulator.metricspec.Identifier;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.TextualBaseMetricDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Identifier</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>{@link org.palladiosimulator.metricspec.impl.IdentifierImpl#getLiteral <em>Literal</em>}</li>
 * <li>{@link org.palladiosimulator.metricspec.impl.IdentifierImpl#getTextualBaseMetricDescription
 * <em>Textual Base Metric Description</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IdentifierImpl extends de.uka.ipd.sdq.identifier.impl.IdentifierImpl implements Identifier {

    /**
     * The default value of the '{@link #getLiteral() <em>Literal</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLiteral()
     * @generated
     * @ordered
     */
    protected static final String LITERAL_EDEFAULT = null;

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected IdentifierImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MetricSpecPackage.Literals.IDENTIFIER;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public String getLiteral() {
        return (String) this.eDynamicGet(MetricSpecPackage.IDENTIFIER__LITERAL,
                MetricSpecPackage.Literals.IDENTIFIER__LITERAL, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setLiteral(final String newLiteral) {
        this.eDynamicSet(MetricSpecPackage.IDENTIFIER__LITERAL, MetricSpecPackage.Literals.IDENTIFIER__LITERAL,
                newLiteral);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public TextualBaseMetricDescription getTextualBaseMetricDescription() {
        return (TextualBaseMetricDescription) this.eDynamicGet(
                MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION,
                MetricSpecPackage.Literals.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    public NotificationChain basicSetTextualBaseMetricDescription(
            final TextualBaseMetricDescription newTextualBaseMetricDescription, NotificationChain msgs) {
        msgs = this.eBasicSetContainer((InternalEObject) newTextualBaseMetricDescription,
                MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public void setTextualBaseMetricDescription(final TextualBaseMetricDescription newTextualBaseMetricDescription) {
        this.eDynamicSet(MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION,
                MetricSpecPackage.Literals.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION,
                newTextualBaseMetricDescription);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID, NotificationChain msgs) {
        switch (featureID) {
        case MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION:
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            return this.basicSetTextualBaseMetricDescription((TextualBaseMetricDescription) otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION:
            return this.basicSetTextualBaseMetricDescription(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(final NotificationChain msgs) {
        switch (this.eContainerFeatureID()) {
        case MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION:
            return this.eInternalContainer().eInverseRemove(this,
                    MetricSpecPackage.TEXTUAL_BASE_METRIC_DESCRIPTION__IDENTIFIERS, TextualBaseMetricDescription.class,
                    msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MetricSpecPackage.IDENTIFIER__LITERAL:
            return this.getLiteral();
        case MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION:
            return this.getTextualBaseMetricDescription();
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
        case MetricSpecPackage.IDENTIFIER__LITERAL:
            this.setLiteral((String) newValue);
            return;
        case MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION:
            this.setTextualBaseMetricDescription((TextualBaseMetricDescription) newValue);
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
        case MetricSpecPackage.IDENTIFIER__LITERAL:
            this.setLiteral(LITERAL_EDEFAULT);
            return;
        case MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION:
            this.setTextualBaseMetricDescription((TextualBaseMetricDescription) null);
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
        case MetricSpecPackage.IDENTIFIER__LITERAL:
            return LITERAL_EDEFAULT == null ? this.getLiteral() != null : !LITERAL_EDEFAULT.equals(this.getLiteral());
        case MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION:
            return this.getTextualBaseMetricDescription() != null;
        }
        return super.eIsSet(featureID);
    }

} // IdentifierImpl
