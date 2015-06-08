/**
 */
package org.palladiosimulator.metricspec.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.palladiosimulator.metricspec.Identifier;
import org.palladiosimulator.metricspec.MetricSpecPackage;
import org.palladiosimulator.metricspec.TextualBaseMetricDescription;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Identifier</b></em>'. <!--
 * end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 * <li>{@link org.palladiosimulator.metricspec.impl.IdentifierImpl#getLiteral <em>Literal</em>}</li>
 * <li>{@link org.palladiosimulator.metricspec.impl.IdentifierImpl#getTextualBaseMetricDescription
 * <em>Textual Base Metric Description</em>}</li>
 * </ul>
 * </p>
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
     * The cached value of the '{@link #getLiteral() <em>Literal</em>}' attribute. <!--
     * begin-user-doc --> <!-- end-user-doc -->
     *
     * @see #getLiteral()
     * @generated
     * @ordered
     */
    protected String literal = LITERAL_EDEFAULT;

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
        return this.literal;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public void setLiteral(final String newLiteral) {
        final String oldLiteral = this.literal;
        this.literal = newLiteral;
        if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET, MetricSpecPackage.IDENTIFIER__LITERAL,
                    oldLiteral, this.literal));
        }
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public TextualBaseMetricDescription getTextualBaseMetricDescription() {
        if (this.eContainerFeatureID() != MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION) {
            return null;
        }
        return (TextualBaseMetricDescription) this.eInternalContainer();
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
        if (newTextualBaseMetricDescription != this.eInternalContainer()
                || (this.eContainerFeatureID() != MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION && newTextualBaseMetricDescription != null)) {
            if (EcoreUtil.isAncestor(this, newTextualBaseMetricDescription)) {
                throw new IllegalArgumentException("Recursive containment not allowed for " + this.toString());
            }
            NotificationChain msgs = null;
            if (this.eInternalContainer() != null) {
                msgs = this.eBasicRemoveFromContainer(msgs);
            }
            if (newTextualBaseMetricDescription != null) {
                msgs = ((InternalEObject) newTextualBaseMetricDescription).eInverseAdd(this,
                        MetricSpecPackage.TEXTUAL_BASE_METRIC_DESCRIPTION__IDENTIFIERS,
                        TextualBaseMetricDescription.class, msgs);
            }
            msgs = this.basicSetTextualBaseMetricDescription(newTextualBaseMetricDescription, msgs);
            if (msgs != null) {
                msgs.dispatch();
            }
        } else if (this.eNotificationRequired()) {
            this.eNotify(new ENotificationImpl(this, Notification.SET,
                    MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION, newTextualBaseMetricDescription,
                    newTextualBaseMetricDescription));
        }
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
            return LITERAL_EDEFAULT == null ? this.literal != null : !LITERAL_EDEFAULT.equals(this.literal);
        case MetricSpecPackage.IDENTIFIER__TEXTUAL_BASE_METRIC_DESCRIPTION:
            return this.getTextualBaseMetricDescription() != null;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * 
     * @generated
     */
    @Override
    public String toString() {
        if (this.eIsProxy()) {
            return super.toString();
        }

        final StringBuffer result = new StringBuffer(super.toString());
        result.append(" (literal: ");
        result.append(this.literal);
        result.append(')');
        return result.toString();
    }

} // IdentifierImpl
