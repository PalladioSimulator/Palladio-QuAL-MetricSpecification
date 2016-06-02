/**
 */
package org.palladiosimulator.metricspec.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.InternalEList;
import org.palladiosimulator.metricspec.MetricDescription;
import org.palladiosimulator.metricspec.MetricDescriptionRepository;
import org.palladiosimulator.metricspec.MetricSpecPackage;

import de.uka.ipd.sdq.identifier.impl.IdentifierImpl;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Metric Description Repository</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 * <li>
 * {@link org.palladiosimulator.metricspec.impl.MetricDescriptionRepositoryImpl#getMetricDescriptions
 * <em>Metric Descriptions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MetricDescriptionRepositoryImpl extends IdentifierImpl implements MetricDescriptionRepository {

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    protected MetricDescriptionRepositoryImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return MetricSpecPackage.Literals.METRIC_DESCRIPTION_REPOSITORY;
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public EList<MetricDescription> getMetricDescriptions() {
        return (EList<MetricDescription>) this.eDynamicGet(
                MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS,
                MetricSpecPackage.Literals.METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS, true, true);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public NotificationChain eInverseAdd(final InternalEObject otherEnd, final int featureID,
            final NotificationChain msgs) {
        switch (featureID) {
        case MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS:
            return ((InternalEList<InternalEObject>) (InternalEList<?>) this.getMetricDescriptions()).basicAdd(otherEnd,
                    msgs);
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
        case MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS:
            return ((InternalEList<?>) this.getMetricDescriptions()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @Override
    public Object eGet(final int featureID, final boolean resolve, final boolean coreType) {
        switch (featureID) {
        case MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS:
            return this.getMetricDescriptions();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     *
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(final int featureID, final Object newValue) {
        switch (featureID) {
        case MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS:
            this.getMetricDescriptions().clear();
            this.getMetricDescriptions().addAll((Collection<? extends MetricDescription>) newValue);
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
        case MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS:
            this.getMetricDescriptions().clear();
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
        case MetricSpecPackage.METRIC_DESCRIPTION_REPOSITORY__METRIC_DESCRIPTIONS:
            return !this.getMetricDescriptions().isEmpty();
        }
        return super.eIsSet(featureID);
    }

} // MetricDescriptionRepositoryImpl
